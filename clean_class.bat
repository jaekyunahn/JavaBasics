@echo off
REM ######################################################
REM 현재 디렉토리와 하위 디렉토리의 모든 .class 파일을 삭제
REM ######################################################
REM .class 파일을 찾고 삭제하는 명령
for /r %%i in (*.class) do (
    echo Deleting %%i
    del "%%i"
)
REM ######################################################
REM 작업 완료 메시지
echo All .class files have been deleted.
REM ######################################################
pause