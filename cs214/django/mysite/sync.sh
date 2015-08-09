#!/bin/sh

python manage.py syncdb # root, root@localhost, root, root
python manage.py makemigrations
python manage.py migrate
