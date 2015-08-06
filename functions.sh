#!/bin/bash

is_number() {
	re='^[0-9]+$'
	if [[ $1 =~ $re ]]; then
		return 0
	else
		return 1
	fi
}
