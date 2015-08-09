import socket

HOST = ''
PORT = 8000

text_content = '''HTTP/1.x 200 OK
Content-Type: text/html

<head>
<title>WOW</title>
</head>
<html>
<pp>Wow, Python Server</p>
<IMG src="test.jpg"/>
</html>
'''

f = open('test.jpg', 'rb')
pic_content = '''
HTTP/1.x 200 OK
Content-Type: image/jpg

'''
pic_content = pic_content + f.read()
f.close()

s = socket.socket()
s.bind((HOST, PORT))

while True:
    s.listen(3)
    conn, addr = s.accept()
    request = conn.recv(1024)
    method = request.split(' ')[0]
    src = request.split(' ')[1]

    if method == 'GET':
        if src == '/test.jpg':
            content = pic_content
        else:
            content = text_content

        print 'Connect by', addr
        print 'Request is:', request
        conn.sendall(content)
    conn.close()
