# LD_APP

This repository contains example code for integrating LaunchDarkly in both a native Android project and a simple React Native project.

## Project structure
- **app** – Native Android application module written in Kotlin.
- **react-native-app** – Minimal React Native example.

## Using the native Android project
1. Clone this repository or add it as a remote in your GitHub project.
2. Run `gradle wrapper` to generate the Gradle wrapper JAR if it is missing.
3. Open **Android Studio** and choose **File > Open**. Select this folder to open the project.
4. When prompted, let Android Studio download any missing SDK components.
5. Replace `YOUR_MOBILE_KEY` in `MainActivity.kt` with your LaunchDarkly mobile key.
6. Build and run the app on an emulator or device.

The `MainActivity` initializes the LaunchDarkly client with a sample user.

## Using the React Native project
1. Navigate to `react-native-app` and run `npm install` (Node.js required).
2. Replace `YOUR_MOBILE_KEY` in `App.js` with your LaunchDarkly mobile key.
3. From the same directory, run `npx react-native run-android` to generate the Android project and launch the app. After generation you can open the `android` folder in Android Studio if you need to inspect or modify native code.
