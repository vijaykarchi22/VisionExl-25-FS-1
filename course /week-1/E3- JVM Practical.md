Let's explore practical examples that demonstrate how JVM components work together in real-world scenarios. Each example will show how different aspects of the JVM architecture come into play.

###  Example 1: Class Loading Process

Here's a concrete example demonstrating how the class loader subsystem works:

```java
public class ClassLoadingDemo {
    public static void main(String[] args) {
        // Scenario 1: Loading a custom class
        Class<?> myClass = ClassLoadingDemo.class;
        
        // Scenario 2: Loading a system class
        Class<?> stringClass = String.class;
        
        // Print class loader information
        System.out.println("Custom class loader: " + myClass.getClassLoader());
        System.out.println("String class loader: " + stringClass.getClassLoader());
        
        // Demonstrate class initialization
        System.out.println("Static initializer value: " + Config.VALUE);
    }
}

class Config {
    public static final int VALUE = initializeValue();
    
    private static int initializeValue() {
        System.out.println("Config class initialized");
        return 100;
    }
}
```

When you run this code, you'll observe:

1. Different class loaders handling different types of classes
2. The initialization sequence of static variables
3. Real-time demonstration of class loading phases

###  Example 2: Memory Management

This example illustrates how objects move between different generations in the heap:

```java
public class MemoryManagementDemo {
    public static void main(String[] args) {
        // Create objects that will be collected quickly
        for (int i = 0; i < 10000; i++) {
            Object obj = new Object();
            // Object becomes eligible for GC immediately after loop iteration
        }
        
        // Create a long-lived object
        List<byte[]> longLivedObjects = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            longLivedObjects.add(new byte[1024 * 1024]); // 1MB each
        }
        
        System.gc(); // Request garbage collection
        
        // Print memory usage
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Used Memory: " + 
            (runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024 + " MB");
    }
}
```

###  Example 3: Stack vs Heap Memory Usage

This example demonstrates the difference between stack and heap memory allocation:

```java
public class MemoryAllocationDemo {
    private static int counter = 0;
    
    public static void recursiveMethod(int depth) {
        // Local variable stored in stack frame
        int localVar = depth;
        
        // Object stored in heap
        Object heapObject = new Object();
        
        if (depth > 0) {
            recursiveMethod(depth - 1);
        }
    }
    
    public static void main(String[] args) {
        try {
            recursiveMethod(100000); // Will cause StackOverflowError
            
        } catch (StackOverflowError e) {
            System.out.println("Stack overflow occurred!");
            
            // Now demonstrate heap overflow
            List<byte[]> list = new ArrayList<>();
            while (true) {
                list.add(new byte[1024 * 1024]); // Allocate 1MB chunks
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Heap overflow occurred!");
        }
    }
}
```

###  Example 4: JIT Compilation Demonstration

This example shows how the JIT compiler optimizes frequently executed code:

```java
public class JitCompilationDemo {
    public static void main(String[] args) {
        // Warm-up phase - JIT compiler observes patterns
        System.out.println("Warm-up phase...");
        for (int i = 0; i < 10000; i++) {
            calculateSum(i);
        }
        
        // After warm-up, JIT compiler has optimized the method
        System.out.println("Optimized phase...");
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            calculateSum(i);
        }
        long endTime = System.nanoTime();
        
        System.out.println("Time taken: " + 
            (endTime - startTime) / 1000000 + " ms");
    }
    
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}
```

###  Example 5: Multi-threading and Memory Visibility

This example demonstrates thread interaction with JVM memory:

```java
class SharedData {
    private boolean running = true;
    
    public void testVisibility() throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (running) {
                // JVM may cache 'running' in thread-local memory
            }
        });
        
        thread.start();
        
        Thread.sleep(1000);
        
        running = false; // Changes may not be immediately visible to other threads
        
        thread.join();
    }
}

public class ThreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        new SharedData().testVisibility();
    }
}
```

Each of these examples demonstrates specific aspects of JVM behavior:

1. Class loading shows how classes are loaded and initialized
2. Memory management illustrates object lifecycle and garbage collection
3. Stack vs Heap demonstrates memory allocation patterns
4. JIT compilation shows performance optimization
5. Multi-threading reveals memory visibility issues

Would you like me to elaborate on any particular example or demonstrate additional scenarios?
