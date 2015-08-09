import socket

HOST = '127.0.0.1'
PORT = 8000

request = b'Can you hear me?'

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.connect((HOST, PORT))

s.sendall(request)
reply = s.recv(1024)

print('Reply is:', reply)
s.close()
