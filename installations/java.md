# Java 17 Installation Guide for Windows

This guide provides step-by-step instructions to install Java 17 on Windows machines.

## Prerequisites

- Windows 10 or later (64-bit recommended)
- Administrator privileges on your machine
- Stable internet connection

## Method 1: Installing Oracle JDK 17

### Step 1: Download Oracle JDK 17

1. Open your web browser and navigate to the Oracle JDK download page:
   ```
   https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
   ```

2. Locate the "Windows x64 Installer" option
3. Click on the download link (you may need to create an Oracle account and accept the license agreement)
4. Save the `.exe` file to your Downloads folder

### Step 2: Run the Installer

1. Navigate to your Downloads folder
2. Double-click on the downloaded `.exe` file (e.g., `jdk-17.0.x_windows-x64_bin.exe`)
3. If prompted by Windows Security, click "Yes" to allow the installer to run
4. Follow the installation wizard:
   - Click "Next" on the welcome screen
   - Choose installation directory (default is recommended: `C:\Program Files\Java\jdk-17.0.x\`)
   - Click "Next" and then "Install"
   - Wait for the installation to complete
   - Click "Close" when finished

## Method 2: Installing OpenJDK 17 (Free Alternative)

### Step 1: Download OpenJDK 17

1. Visit the Eclipse Temurin download page:
   ```
   https://adoptium.net/temurin/releases/
   ```

2. Select the following options:
   - Operating System: Windows
   - Architecture: x64
   - Package Type: JDK
   - Version: 17 (LTS)

3. Click "Download" for the `.msi` installer
4. Save the file to your Downloads folder

### Step 2: Install OpenJDK 17

1. Double-click the downloaded `.msi` file
2. Follow the installation wizard:
   - Click "Next" on the welcome screen
   - Accept the license agreement and click "Next"
   - Choose installation features (keep default selections)
   - Select installation directory (default recommended)
   - Click "Install"
   - Click "Finish" when complete

## Step 3: Set Environment Variables

### Setting JAVA_HOME

1. Right-click on "This PC" or "Computer" on your desktop
2. Select "Properties"
3. Click on "Advanced system settings"
4. Click "Environment Variables" button
5. Under "System Variables" section, click "New"
6. Enter the following:
   - Variable name: `JAVA_HOME`
   - Variable value: `C:\Program Files\Java\jdk-17.0.x` (replace x with your version number)
7. Click "OK"

### Updating PATH Variable

1. In the "System Variables" section, find and select the "Path" variable
2. Click "Edit"
3. Click "New" and add: `%JAVA_HOME%\bin`
4. Click "OK" to close all dialog boxes

## Step 4: Verify Installation

1. Open Command Prompt (press `Win + R`, type `cmd`, press Enter)
2. Run the following commands to verify installation:

```bash
java -version
```

Expected output should show Java 17:
```
java version "17.0.x" 2023-xx-xx LTS
Java(TM) SE Runtime Environment (build 17.0.x+xx-LTS-xxx)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.x+xx-LTS-xxx, mixed mode, sharing)
```

3. Verify the compiler:
```bash
javac -version
```

Expected output:
```
javac 17.0.x
```

4. Check JAVA_HOME:
```bash
echo %JAVA_HOME%
```

Expected output:
```
C:\Program Files\Java\jdk-17.0.x
```

## Troubleshooting

### Issue: "java is not recognized as an internal or external command"

**Solution:**
- Verify that `%JAVA_HOME%\bin` is added to your PATH environment variable
- Restart Command Prompt after making environment variable changes
- Ensure JAVA_HOME points to the correct JDK installation directory

### Issue: Wrong Java version showing

**Solution:**
- Check if multiple Java versions are installed
- Ensure the correct Java version appears first in your PATH variable
- Remove or reorder PATH entries for older Java versions

### Issue: JAVA_HOME not set correctly

**Solution:**
- Verify the JAVA_HOME path exists and contains the JDK installation
- Ensure there are no trailing spaces in the JAVA_HOME variable
- The path should point to the JDK root directory, not the `bin` folder

## Additional Notes

- Java 17 is a Long Term Support (LTS) version, making it ideal for production environments
- You may need to restart your IDE or development tools after installation
- For development purposes, ensure you're using the JDK (not just JRE) installation
- Consider using a Java version manager like SDKMAN if you need multiple Java versions

## Uninstalling Java 17

If you need to uninstall Java 17:

1. Go to "Settings" > "Apps" > "Apps & features"
2. Search for "Java" or "JDK"
3. Select the Java 17 installation
4. Click "Uninstall"
5. Remove the JAVA_HOME environment variable
6. Remove Java paths from the PATH environment variable

---

**Installation complete!** You now have Java 17 installed and configured on your Windows machine.
