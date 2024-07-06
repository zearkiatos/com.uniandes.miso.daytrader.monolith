@echo off
REM Running flicker

REM Call the function to run flicker
call :run_flicker
goto :eof

REM Function to run flicker
:run_flickerss
REM Run flicker
cd c:
cd C:\Program Files\IBM\mono2micro\m2m-cli\flicker
java -cp flicker-1.0.jar com.ibm.mono2micro.Flicker -no_ntp
goto :eof