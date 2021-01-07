# TDD-kata-String-Calculator
- This is a excercise, to learn refactoring and learning TDD style coding.

# Prerequisite
- For running this, you must have java installed in system (prefer jdk 1.8 or higher)

# Running
1) Download zip file for this project
2) Unzip downloaded zip file in your desired folder.
3) Now we have to compile all the java files, as currently, I am not using any build tools, and also I never used for java. So, we can just use command line.
4) Open command prompt (in windows) or terminal in linux.
5) Go to the folder containing downloaded zip file and then write the following commands.
```
cd classes
rd /S/Q com
```
6) As, it is mine compiled files according to mine JDK version, we are just deleting for precaution. Sometimes, it cause problem to me.
7) Now go again to main folder, and type following command.
```
cd src
cmpException.bat
cmpUtility.bat
cmp.bat
```
8) Now your all files are compiled successfully, and all class files saved in classes folder, with same package structure as in src folder.
9) Now go to testcases folder and run testcases with the following commands
```
cd testcases
cmp.bat
run.bat
```
10) Now, you will see output of the testcases
11) Note: If you are using Windows powershell or some IDE, then process of running will be different for you.

