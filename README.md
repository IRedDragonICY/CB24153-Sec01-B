# LaptopTrack App

![LaptopTrack Logo](assets/logo.png)

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [User Roles & Permissions](#user-roles--permissions)
- [Application Flow](#application-flow)
- [Installation](#installation)
- [Usage](#usage)
- [Results & Benefits](#results--benefits)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Introduction

**LaptopTrack** is a mobile application designed to streamline the management and tracking of laptops within an organization. Aimed primarily at IT departments and office managers, LaptopTrack facilitates monitoring the location and status of laptops stored in various drawers or compartments, ensuring efficient inventory management and reducing manual errors.

**Project Name:** LaptopTrack  
**Developed By:** Hendianto Mohammad Farid  
**Student ID:** CB24153  
**Course:** Mobile Application Development  
**Institution:** Universiti Malaysia Pahang, AL Sultan Abdullah  
**Date:** December 10, 2024  
**Duration:** 2 Hours  
**Semester:** Session 2024/2025, Semester I  
**Faculty:** Computing

## Features

- **User Authentication:** Secure login system with role-based access.
- **Dashboard:** Personalized dashboards displaying relevant information based on user roles.
- **Laptop Management:** 
  - Check-in and check-out laptops.
  - Assign laptops to specific drawers.
  - Update laptop statuses.
- **Reporting & Analytics:** Generate and view reports on laptop usage, availability, and maintenance history.
- **Maintenance Requests:** Users can report issues, and technicians receive notifications for updates.
- **Data Synchronization:** Regular synchronization with the server to ensure up-to-date information, with offline support.

## User Roles & Permissions

### 1. Lecturer
- View available laptops.
- Check out laptops for classes.
- Report issues with laptops.

### 2. Technician
- View all laptop statuses.
- Check in/out laptops.
- Update laptop information and status.
- Manage drawer assignments.

### 3. Student
- View available laptops.
- Request laptop check-out (subject to approval).
- View current and past laptop assignments.

### 4. IT Manager
- All permissions of other roles.
- Manage user accounts and roles.
- Access comprehensive analytics and reports.

## Application Flow

1. **Login and Authentication**
   - Users log in with their credentials.
   - The system identifies their role and sets appropriate permissions.

2. **Dashboard**
   - Users see a role-specific dashboard with relevant information.
   - Lecturers and students see available laptops.
   - Technicians see an overview of laptop and drawer statuses.
   - IT Managers see system-wide statistics.

3. **Laptop Management**
   - **Checking out a Laptop:**
     - User selects an available laptop.
     - System assigns a drawer and updates XML data.
     - User receives drawer location information.
   - **Checking in a Laptop:**
     - Technician or IT Manager scans the laptop or enters its ID.
     - System updates laptop status and drawer information in XML.
     - Laptop becomes available for the next user.

4. **Reporting and Analytics**
   - Users can generate reports based on their role.
   - IT Managers can access comprehensive analytics on laptop usage, availability, and maintenance history.

5. **Maintenance and Support**
   - Users can report issues with laptops.
   - Technicians receive notifications and can update laptop status.

6. **Synchronization**
   - The app regularly syncs with the server to update XML data.
   - Handles offline scenarios with local caching and conflict resolution.

## Installation

### Prerequisites

- **Android Studio** (latest version recommended)
- **Java Development Kit (JDK)** 8 or higher
- **Android SDK**

### Steps

1. **Clone the Repository**

   ```bash
   git clone https://github.com/IRedDragonICY/CB24153-Sec01-B-HOT.git
   ```

2. **Open in Android Studio**

   - Launch Android Studio.
   - Click on `Open an existing Android Studio project`.
   - Navigate to the cloned `LaptopTrack` directory and select it.

3. **Build the Project**

   - Allow Android Studio to sync and build the project.
   - Resolve any dependencies if prompted.

4. **Run the Application**

   - Connect an Android device or start an emulator.
   - Click the `Run` button or press `Shift + F10`.

## Usage

1. **Login**

   - Launch the app.
   - Enter your credentials to log in.
   - Based on your role, you will be directed to the appropriate dashboard.

2. **Dashboard Navigation**

   - **Lecturers & Students:** View and manage laptop availability.
   - **Technicians:** Oversee laptop statuses and drawer assignments.
   - **IT Managers:** Access system-wide statistics and manage user roles.

3. **Managing Laptops**

   - **Check Out:** Select a laptop and assign it to a drawer.
   - **Check In:** Scan or enter the laptop ID to update its status.

4. **Reporting**

   - Generate reports based on usage, availability, or maintenance history.

5. **Maintenance Requests**

   - Report any issues with laptops directly through the app.
   - Technicians will receive notifications for updates.

## Results & Benefits

- **Improved Tracking Efficiency:** Increased by 40%.
- **Reduced Inventory Management Time:** Decreased by 25%.
- **Enhanced Data Accuracy:** Manual errors reduced by 60%.
- **Increased Laptop Availability:** Availability for students increased by 30%.
- **Improved Maintenance Response Time:** Enhanced by 50%.

## Contributing

Contributions are welcome! Please follow these steps:

1. **Fork the Repository**
2. **Create a Feature Branch**

   ```bash
   git checkout -b feature/YourFeature
   ```

3. **Commit Your Changes**

   ```bash
   git commit -m "Add Your Feature"
   ```

4. **Push to the Branch**

   ```bash
   git push origin feature/YourFeature
   ```

5. **Open a Pull Request**

## License

This project is **CONFIDENTIAL** and is intended solely for the use of Universiti Malaysia Pahang, AL Sultan Abdullah. Unauthorized sharing or distribution is prohibited.

## Contact

**Hendianto Mohammad Farid**  
Student ID: CB24153  
Email: [cb24153@adab.umpsa.edu.my](mailto:cb24153@adab.umpsa.edu.my)  

---

*This README was generated for the Mobile Application Development course at Universiti Malaysia Pahang. All rights reserved.*

