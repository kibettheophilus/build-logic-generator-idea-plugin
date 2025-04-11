# Build Logic Generator

![Build](https://github.com/kibettheophilus/build-logic-generator-idea-plugin/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/MARKETPLACE_ID.svg)](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/MARKETPLACE_ID.svg)](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID)

> [!NOTE]  
> The plugin is still in development, but it can generate a simple build-logic project.

## Demo
https://github.com/user-attachments/assets/b63f060e-ee93-4505-9ee5-338d9a797d91

<!-- Plugin description -->
This is a minimal IntelliJ Platform Plugin that helps generate build-logic for gradle based projects.

<!-- Plugin description end -->

## Installation

- Using the IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "build-logic-generator-idea-plugin"</kbd> >
  <kbd>Install</kbd>
  
- Using JetBrains Marketplace:

  Go to [JetBrains Marketplace](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID) and install it by clicking the <kbd>Install to ...</kbd> button in case your IDE is running.

  You can also download the [latest release](https://plugins.jetbrains.com/plugin/MARKETPLACE_ID/versions) from JetBrains Marketplace and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

- Manually:

  Download the [latest release](https://github.com/kibettheophilus/build-logic-generator-idea-plugin/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

## Features
- [x] Create build-logic
   - [x] settings.gradle.kts
   - [x] conventions directory
      - [x] build.gradle.kts
      - [x] src/main/kotlin
      - [x] a sample plugin
- [ ] Listen to progress and show to user
- [ ] Dialog for more options
   - [ ] user to input custom name, currently default is `build-logic`
   - [ ] user selects convention plugins to be generated
      - [ ] Android application
      - [ ] Android library
      - [ ] Kotlin Multiplatform library
            
            ...open for more ideas?

## Contributing
Your contributions are especially welcome. Whether it comes in the form of code patches, ideas, discussion, bug reports, encouragement or criticism, your input is needed.

---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
[docs:plugin-description]: https://plugins.jetbrains.com/docs/intellij/plugin-user-experience.html#plugin-description-and-presentation
