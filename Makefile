run: compil
	java -ea Main

compil:
	javac Fraction.java
	javac Main.java

clean:
	rm *.class