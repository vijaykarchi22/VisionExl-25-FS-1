# PostgreSQL Local Installation Guide for Windows

This guide provides step-by-step instructions to install PostgreSQL database server locally on Windows machines.

## Prerequisites

- Windows 10 or later (64-bit recommended)
- Minimum 1 GB RAM (4 GB recommended for production use)
- 100 MB minimum disk space (1 GB+ recommended for data storage)
- Administrator privileges on your machine
- Stable internet connection for download

## Step 1: Download PostgreSQL

### Method 1: Official PostgreSQL Installer (Recommended)

1. Open your web browser and navigate to the PostgreSQL download page:
   ```
   https://www.postgresql.org/download/windows/
   ```

2. Click on "Download the installer" link
3. You'll be redirected to EnterpriseDB download page
4. Select the latest stable version (e.g., PostgreSQL 16.x)
5. Choose "Windows x86-64" for 64-bit systems
6. Click "Download" (file will be named like `postgresql-16.x-x-windows-x64.exe`)
7. Save the installer to your Downloads folder

### Method 2: Alternative Distributions

- **EDB Advanced Server** (Enterprise features)
- **BigSQL** (Stack-based distribution)
- **PostgreSQL Portable** (Portable version)

## Step 2: Run the PostgreSQL Installer

1. Navigate to your Downloads folder
2. Right-click on the downloaded `.exe` file
3. Select "Run as administrator"
4. If Windows SmartScreen appears, click "More info" then "Run anyway"

## Step 3: Installation Wizard

### Welcome Screen
1. Click "Next" on the PostgreSQL Setup welcome screen

### Installation Directory
1. Choose installation directory (default recommended):
   ```
   C:\Program Files\PostgreSQL\16
   ```
2. Ensure sufficient disk space is available
3. Click "Next"

### Select Components
Choose components to install:

- ☑️ **PostgreSQL Server** (Core database server - required)
- ☑️ **pgAdmin 4** (Web-based administration tool - recommended)
- ☑️ **Stack Builder** (Additional tools and drivers - recommended)
- ☑️ **Command Line Tools** (psql, pg_dump, etc. - recommended)

Click "Next"

### Data Directory
1. Choose data directory (default recommended):
   ```
   C:\Program Files\PostgreSQL\16\data
   ```
2. This directory will store all your databases
3. Ensure the location has sufficient space for your data needs
4. Click "Next"

### Database Superuser Password
1. **IMPORTANT:** Set a strong password for the `postgres` superuser account
2. Enter your password (rememb
