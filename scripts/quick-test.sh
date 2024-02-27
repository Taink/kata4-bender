#!/usr/bin/env bash

db=contacts.sqlite3

if [ -z "$1" ]; then
  echo "Please provide a number of contacts to generate"
  exit 1
fi

if [ -f "$db" ]; then
  rm $db
fi

./mvnw compile
./mvnw exec:java -Dexec.args="$1"
