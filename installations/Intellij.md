# IntelliJ IDEA Community Edition Installation Guide for Windows

This guide provides step-by-step instructions to install IntelliJ IDEA Community Edition on Windows machines.

## Prerequisites

- Windows 10 or later (64-bit recommended)
- Minimum 2 GB RAM (8 GB recommended)
- 3.5 GB hard disk space (SSD recommended for better performance)
- 1024x768 minimum screen resolution
- Java Development Kit (JDK) 8 or later (JDK 11+ recommended)
- Administrator privileges on your machine
- Stable internet connection

## Step 1: Download IntelliJ IDEA Community Edition

### Method 1: Direct Download from JetBrains

1. Open your web browser and navigate to the JetBrains website:
   ```
   https://www.jetbrains.com/idea/download/?section=windows
   ```

2. Locate the "Community" section (it's free and open-source)
3. Click the "Download" button under "IntelliJ IDEA Community Edition"
4. The download will start automatically (file name: `ideaIC-YYYY.X.X.exe`)
5. Save the installer file to your Downloads folder

### Method 2: Download using JetBrains Toolbox (Recommended)

1. Download JetBrains Toolbox from:
   ```
   https://www.jetbrains.com/toolbox-app/
   ```
2. Install Toolbox first, then use it to install and manage IntelliJ IDEA

## Step 2: Run the Installer

1. Navigate to your Downloads folder
2. Right-click on the downloaded `.exe` file (e.g., `ideaIC-2024.1.exe`)
3. Select "Run as administrator" (recommended)
4. If Windows SmartScreen appears, click "More info" then "Run anyway"

## Step 3: Installation Wizard

### Welcome Screen
1. Click "Next" on the IntelliJ IDEA Community Edition Setup welcome screen

### Choose Install Location
1. Choose installation directory (default is recommended):
   ```
   C:\Program Files\JetBrains\IntelliJ IDEA Community Edition YYYY.X.X
   ```
2. Ensure you have enough disk space (at least 3.5 GB)
3. Click "Next"

### Installation Options
Select the following options based on your preferences:

**Desktop Shortcuts:**
- ☑️ Create Desktop Shortcut (64-bit launcher recommended)
- ☑️ Add "bin" folder to the PATH (recommended for command-line usage)

**File Associations:**
- ☑️ `.java` files (if you want IntelliJ to be default for Java files)
- ☑️ `.groovy` files (if working with Groovy)
- ☑️ `.kt` files (if working with Kotlin)

**Context Menu:**
- ☑️ Add "Open Folder as IntelliJ IDEA Project" (useful for quick project access)

Click "Next" after making your selections

### Choose Start Menu Folder
1. Keep the default "JetBrains" folder name
2. Click "Install" to begin installation

### Installation Progress
1. Wait for the installation to complete (this may take 5-10 minutes)
2. Do not interrupt the process

### Completion
1. ☑️ Check "Run IntelliJ IDEA Community Edition" if you want to start immediately
2. Click "Finish"

## Step 4: First Launch and Setup

### Initial Configuration

1. **Data Sharing Consent:**
   - Choose whether to send usage statistics to JetBrains
   - Click "Don't Send" or "Send Usage Statistics"

2. **Import Settings:**
   - Select "Do not import settings" for first-time installation
   - Click "OK"

3. **License Agreement:**
   - Read and accept the JetBrains privacy policy
   - Click "Continue"

### Customize IntelliJ IDEA

1. **Select Theme:**
   - Choose between "Darcula" (dark theme) or "IntelliJ Light" theme
   - Click "Next: Featured plugins"

2. **Featured Plugins:**
   - Review suggested plugins (Scala, Python, etc.)
   - Install any plugins you need or skip for now
   - Click "Start using IntelliJ IDEA"

## Step 5: Config
