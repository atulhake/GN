
set projectLocation=C:\Users\iets\workspace\GN
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng1.xml
pause