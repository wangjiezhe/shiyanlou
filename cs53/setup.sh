#!/bin/sh

sudo cp vimrc /etc/vim/vimrc.local
git config --global push.default simple
sudo apt-get update
sudo apt-get install -y bluefish
cp /usr/share/applications/bluefish.desktop ~/Desktop
chmod +x ~/Desktop/bluefish.desktop
