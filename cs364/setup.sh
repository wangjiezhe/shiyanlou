#!/bin/sh
sudo apt-get install -y python-dev
sudo apt-get install -y libtiff5-dev libjpeg8-dev zlib1g-dev \
	libfreetype6-dev liblcms2-dev libwebp-dev tcl8.6-dev tk8.6-dev python-tk
sudo pip install pillow
sudo cp vimrc /etc/vim/vimrc.local
git config --global push.default simple
