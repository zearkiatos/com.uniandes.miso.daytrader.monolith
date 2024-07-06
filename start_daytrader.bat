@echo off
REM Running daytrader7Sample

REM Call the function to run daytrader7Sample
call :start_server
goto :eof

REM Function to run daytrader7Sample
:start_server
REM Your server start command goes heres
D:\projects\java\com.uniandes.miso.daytrader.monolith-mono2micro\daytrader-ee7\target\liberty\wlp\bin\server start daytrader7Sample
goto :eof