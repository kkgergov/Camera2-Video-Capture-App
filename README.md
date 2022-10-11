# Camera2-Video-Capture-App

Useful for driver debugging purposes,
lists all of the phone sensors (or multisensors)
their supported resolutions and
framerate (both NORMAL and HFR mode)
simple preview and video recording functionality
No support for HDR and preview stabilization so far.
Forked from 
https://github.com/android/camera-samples/tree/main/Camera2Basic

Mainly a small project to learn some Android development and camera2


Introduction
------------

The [Camera2 API][1] allows users to capture video from the camera by
sending repeating capture requests from the camera framework to a
[media recorder][2].


[1]: https://developer.android.com/reference/android/hardware/camera2/package-summary.html
[2]: https://developer.android.com/reference/android/media/MediaRecorder

Pre-requisites
--------------

- Android SDK 29+
- Android Studio 3.6+
- Device with video capture capability (or emulator)

Getting Started
---------------

This sample uses the Gradle build system. To build this project, use the
"gradlew build" command or use "Import Project" in Android Studio.
