Task App

Overview

This project is a modular Android application that follows clean architecture principles. It separates concerns into core, domain, and feature layers and employs modern Android development tools such as:
	•	Kotlin
	•	Jetpack Compose
	•	Kotlin Coroutines
	•	Dagger-Hilt for dependency injection
	•	Android Jetpack Components

⸻

Table of Contents
	•	Architecture
	•	Build System
	•	Modules
	•	Core
	•	Domain
	•	Features
	•	Dependencies
	•	Build Instructions
	•	Setup Instructions

⸻

Architecture

The project is structured into the following layers:

android-convention

Defines custom Gradle configurations to standardize Android project settings.

app

Entry point of the app. Contains the AndroidManifest.xml and initializes the main components.

core

Shared code and utilities:
	•	android: Shared Android utilities and extensions
	•	coroutines: Dispatchers and coroutine utils
	•	error-handler: Global error handling
	•	network: Retrofit and networking logic

features

Encapsulated modules for each screen/feature:
	•	home:
	•	data: Data sources and repositories
	•	domain: Business rules and use cases
	•	presentation: UI and ViewModel layer
	•	main: App’s main activity and navigation

Each feature follows clean architecture: data → domain → presentation.

⸻

Build System

The app uses a custom modular Gradle setup under android-convention/:

1. convention.android-app
	•	Configures application modules
	•	Signing, ProGuard, etc.

2. convention.android-base
	•	Shared config for all modules
	•	SDK versions, Kotlin options, etc.

3. convention.android-feature
	•	Common logic for all feature modules
	•	DI setup, shared dependencies

4. convention.android-feature-data
	•	Handles Room, Retrofit, and local/remote data layers

5. convention.android-feature-domain
	•	Business logic, models, clean interfaces

6. convention.android-feature-presentation
	•	ViewModels, Compose UI, navigation, etc.

⸻

Modules

Core

Provides shared, reusable tools and components:
	•	android, coroutines, error-handler
	•	network
 
Features

Each feature is structured cleanly:
	•	home
	•	data: Repositories, remote/local
	•	domain: Use cases and models
	•	presentation: UI and ViewModels

⸻

Dependencies

Key libraries used:
	•	Kotlin
	•	Jetpack Compose
	•	Coroutines
	•	Dagger-Hilt
	•	Retrofit + OkHttp
	•	Kotlinx Serialization
	•	RoomDB
  •	WorkManager

Dependency versions are managed using a BOM for consistency.

⸻

Build Instructions

To build the project:

git clone git@github.com:yousef96m/Task.git
./gradlew assembleDebug

Make sure you have:
	•	Android Studio Giraffe or later
	•	JDK 17+
	•	Kotlin 2.0+

⸻

Setup Instructions
	1.	Clone repo
	2.	Open in Android Studio
	3.	Sync Gradle
	4.	Run :app or :features:main module
	5.	Use mockk, JUnit, and androidTest for testing

For any issues, contact Yousef Thank you.
