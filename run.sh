#rm -R ./chess-project/bin
javac ./chess-project/src/main/chess/*.java -d ./chess-project/bin/main/
java --class-path ./chess-project/bin/main/ chess.Game