#!/bin/bash

if [ $# -eq 0 ]; then
	echo "Usage: clone.sh [class_number1] ..."
	exit 1
fi

source functions.sh

for class_number in $@; do
	if is_number $class_number; then
		# echo cs$class_number
		git clone "http://git.shiyanlou.com/xflx/shiyanlou_cs${class_number}.git" "cs${class_number}"
	else
		echo "Invalid argument: ${class_number}!"
	fi
done
