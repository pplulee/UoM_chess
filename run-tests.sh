rm -R ./chess-project/bin
javac ./chess-project/src/main/chess/*.java -d ./chess-project/bin/main/
javac -cp .:junit-platform-console-standalone.jar:./chess-project/bin/main/:./chess-project/bin/test/ ./chess-project/src/test/chess/*.java -d ./chess-project/bin/test/
java -jar junit-platform-console-standalone.jar  --class-path ./chess-project/bin/main/:./chess-project/bin/test/ --scan-class-path --fail-if-no-tests --reports-dir=./chess-project/report