#!/bin/bash
if  javac -classpath .:/run_dir/junit-4.12.jar:target/dependency/* -d . *.java
then
java -classpath .:/run_dir/junit-4.12.jar:target/dependency/* $1
fi