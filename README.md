# SH Executor

![Rating](https://img.shields.io/badge/Rating-0%2F10-red)
![Sauce](https://img.shields.io/badge/100%25-Spaghetti%20Code-orange)
![Build Status](https://img.shields.io/badge/Build-Passing-green)

# About

- Executes SH/BASH Scripts

# Java Version

````bash
admin@MyLinuxPC:~/Java$ java -version
openjdk version "1.8.0_322"
OpenJDK Runtime Environment (build 1.8.0_322-8u322-b06-1~deb9u1-b06)
OpenJDK 64-Bit Server VM (build 25.322-b06, mixed mode)
````

# How to Build

````bash
admin@MyLinuxPC:~/Java$ sudo git clone https://github.com/WalkingLibrary/SHExecutor --tags
Cloning into 'SHExecutor'...
remote: Enumerating objects: 33, done.
remote: Counting objects: 100% (33/33), done.
remote: Compressing objects: 100% (12/12), done.
remote: Total 33 (delta 6), reused 33 (delta 6), pack-reused 0
Receiving objects: 100% (33/33), 59.68 KiB | 837.00 KiB/s, done.
Resolving deltas: 100% (6/6), done.
admin@MyLinuxPC:~/Java$ cd SHExecutor/
admin@MyLinuxPC:~/Java/SHExecutor$ sudo chmod 700 ./gradlew
admin@MyLinuxPC:~/Java/SHExecutor$ sudo ./gradlew shadowjar

> Configure project :
Build Version: 0.0.2

> Task :shadowJar
The SimpleWorkResult type has been deprecated and is scheduled to be removed in Gradle 5.0. Please use WorkResults.didWork() instead.


BUILD SUCCESSFUL in 3s
2 actionable tasks: 2 executed
````

# How to Use

````bash
admin@MyLinuxPC:~/Java/SHExecutor$ cd ./build/libs/
admin@MyLinuxPC:~/Java/SHExecutor/build/libs$ sudo java -jar SH-Executor-0.0.2-all.jar "/home/admin/Scripts/helloWorld.sh"
09:29:13.161 [main] DEBUG ConsoleLogger - Executing Command:
sh /home/admin/Scripts/helloWorld.sh

Success: hello_world

Failure:
admin@MyLinuxPC:~/Java/SHExecutor/build/libs$
````

License
----
![AUR license](https://img.shields.io/badge/License-MIT-blue)
