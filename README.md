# Web-Automation Project (Daraz.com) with Selenium &TestNG
This repository includes a comprehensive web automation project using Java that automates various tasks on a website. It includes multiple features implemented as separate classes, making it a powerful tool for testing, web scraping, and more.

**Table of Contents**
- [Features](#features)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Dependencies](#dependencies)
- [Contributing](#contributing)

## Features

### 1. **Login Class**

- **Description:** This class automates the login process on a website.
- **Steps:**
  1. Opens the URL.
  2. Retrieves the actual title of the site.
  3. Clicks on the login icon.
  4. Fills in the email and password.
  5. Performs a search operation.
  6. Clicks on an item.
  7. Closes the site.

- **Class:** [Login_Class.java](Login_Class.java)

### 2. **Alert Handling (DemoQA Site)**

- **Description:** This class demonstrates alert handling using JavascriptExecutor.
- **Steps:**
  1. Handles a pop-up by clicking a button.

- **Class:** [Alert_Handling.java](Alert_Handling.java)

### 3. **Option Select Class**

- **Description:** This class automates the selection of options from a dropdown.
- **Steps:**
  1. Selects options by index and visible text.

- **Class:** [Optionselect_classs.java](Optionselect_classs.java)

### 4. **Automatic Mouse Hovering and Click Class**

- **Description:** This class demonstrates mouse hovering over elements and clicking.
- **Steps:**
  1. Hovers over menu items.
  2. Clicks on a specific item.

- **Class:** [AutomaticMouse_HoveringandClick.java](AutomaticMouse_HoveringandClick.java)

### 5. **Copy and Paste Class**

- **Description:** This class works with copying and pasting using keyboard shortcuts.
- **Steps:**
  1. Copies and pastes text in a text input field.

- **Class:** [Copyand_PasteCLass.java](Copyand_PasteCLass.java)

### 6. **Scrolling Test**

- **Description:** This class shows how to scroll to specific locations on a webpage using JavascriptExecutor.
- **Steps:**
  1. Scrolls to specific elements.
  2. Scrolls to the bottom of the page.
  3. Scrolls back to the top.

- **Class:** [Scrolling_Test.java](Scrolling_Test.java)

### 7. **Assertion Test Class**

- **Description:** This class demonstrates assertion testing by comparing the expected and actual titles of a webpage.

- **Class:** [Assertion_Test.java](Assertion_Test.java)

### 8. **Iframe Test Class**

- **Description:** This class focuses on working with iframes.
- **Steps:**
  1. Counts the number of iframes on a page.
  2. Interacts with a specific iframe.

- **Class:** [Iframne_TestClass.java](Iframne_TestClass.java)

## Getting Started

1. Clone this repository to your local machine.

```bash
git clone https://github.com/yourusername/your-repo.git
Set up your development environment for Java and Selenium WebDriver.
# Install Java
# Install Selenium WebDriver
# Download browser drivers (Chrome, Edge, etc.)
Update the WebDriver setup in each class to match your local environment, such as changing browser drivers.
```
## Usage
Each class contains a specific automation task. You can run these classes individually to observe the automation in action. Here's an example of running the Login_Class:

## Dependencies
.Java
.Selenium WebDriver
.Web browser drivers (Chrome, Edge, etc.)
