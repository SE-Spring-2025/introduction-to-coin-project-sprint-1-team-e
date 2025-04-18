JFLAGS = -d bin -sourcepath src
JUNIT5_JAR = lib/junit-platform-console-standalone-1.11.0.jar
JUNIT5_RUNNER = org.junit.platform.console.ConsoleLauncher
CKSTYLE_LIB =  lib/checkstyle-10.18.1-all.jar

default: 
	@echo "usage: make target"
	@echo "5 available targets: clean - removes editor tmpfiles and .class files"
	@echo "____________________ compile - builds codebase"
	@echo "____________________ test - runs JUnit5 tests"
	@echo "____________________ demo - runs demo (client)"
	@echo "____________________ check - runs checkstyle"
	@echo "Just starting with make? Try these 4 make commands successively:"
	@echo "________ make clean ; make compile ; make test ; make check"

compile: $(JUNIT5_JAR)
	# First compile main classes
	-javac -d bin/main -cp . src/main/*.java
	# Then compile tests with main classes in classpath
	-javac -d bin/tests -cp .:$(JUNIT5_JAR):bin/main src/tests/*.java
	# Finally compile client
	-javac -d bin/client -cp .:bin/main src/client/*.java

test: compile $(JUNIT5_JAR)
	java -cp bin/tests:bin/main:$(JUNIT5_JAR) $(JUNIT5_RUNNER) execute --select-class CoinTest --select-class PennyTest --select-class NickelTest --select-class QuarterTest --select-class DimeTest --select-class HalfDollarTest --select-class DollarTest --select-class CopperTest --select-class CuproNickelTest --include-engine junit-jupiter

demo: compile
	java -cp bin/client:bin/main Demo

check: styles.xml $(CKSTYLE_LIB)
	java -jar $(CKSTYLE_LIB) -c ./styles.xml src/main/*.java

clean:
#	Java class files
	-rm -f ./bin/**/*.class
	-rm -f ./bin/*.class
#	Emacs editor backup files
	-rm -f ./*~
	-rm -f ./src/**/*~
	-rm -f ./docs/*~
	-rm -f ./docs/**/*~
