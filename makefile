all: 
	make compile
	make test
	make run
compile:
	 find ./ -type f -name "*.java" > compfiles.txt ; \
    javac -encoding utf-8 -d build -cp "lib/commons-io-2.15.1.jar:lib/junit-platform-console-standalone-1.5.2.jar" @compfiles.txt
run:
	 java -cp "build:lib/commons-io-2.15.1.jar" miPrincipal.ManejoArchivosCommonsIO
test:
	java -jar lib/junit-platform-console-standalone-1.5.2.jar --class-path build --scan-class-path
clean:
	rm -r ./build/*
