compile: automat/AutomatExamples.class

automat/AutomatExamples.class: ./src/*.java
	javac -d . src/*.java

run_to_file: compile
	java automat.AutomatExamples 1>out.txt 2>err.txt

run_in_term: compile
	java automat.AutomatExamples

.PHONY: clean
clean:
	rm automat/*.class out.txt err.txt
