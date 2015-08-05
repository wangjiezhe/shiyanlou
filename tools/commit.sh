#!/bin/bash

if [ $# -ne 1 ]; then
	echo "Usage: commit.sh [class_number]"
	exit 1
fi

source functions.sh

class_number=$1

if is_number ${class_number}; then
	class_name=$(curl -s "https://www.shiyanlou.com/courses/${class_number}" | grep "<title>" | sed "s/^[[:space:]]*//g" | sed "s@<title>\(.*\) - \(.*\)</title>@\1@")
	commit_message="Add code for course ${class_number}: ${class_name}"
	# echo "${class_number}"
	# echo "${class_name}"
	# echo "${commit_message}"
	git add "cs${class_number}"
	git commit -m "${commit_message}"
else
	echo "Invalid argument: ${class_number}!"
fi
