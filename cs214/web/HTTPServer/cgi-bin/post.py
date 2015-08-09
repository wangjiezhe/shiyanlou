#!/usr/bin/env python2

import cgi

form = cgi.FieldStorage()

print "Content: text/html"
print
print "<p>Hello world</p>"
print "<p>" + repr(form['firstname']) + "</p>"
