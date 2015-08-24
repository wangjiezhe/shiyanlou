#!/bin/sh

git config --global push.default simple
sudo cp vimrc /etc/vim/vimrc.local
# sudo apt-get update
# sudo apt-get upgrade -y
# sudo apt-get install -y python ipython ipython-notebook
# sudo apt-get install -y python-numpy-scipy python-matplotlib python-sympy
# sudo apt-get install -y spyder
./install.ipy
