#echo off
export workspace=/Users/a67281303/Documents/workspace/IWVG.SwC.Eneas
#set PATH=%PATH%C:\Program Files (x86)\Java\jre1.8.0_51\bin;C:\Users\bm0827\Desktop\apache-maven-3.3.3\bin
#set JAVA_HOME=C:\Program Files (x86)\Java\jre1.8.0_51
echo -----------------------------------------
echo ".(C) MIW"
echo -----------------------------------------
echo .
echo Workspace --- $workspace
echo .
cd $workspace
echo "============ mvn clean test (profile: develop) ======================================================="
echo .
mvn clean test
exit

