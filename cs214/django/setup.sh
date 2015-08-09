#!/bin/sh

sudo pip install django
sudo apt-get install python-mysqldb
sudo service mysql start
mysql -u root < initial.sql
