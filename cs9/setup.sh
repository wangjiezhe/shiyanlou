#!/bin/sh

sudo cp vimrc /etc/vim/vimrc.local
git config --global push.default simple
sudo service mysql start
