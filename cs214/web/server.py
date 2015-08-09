import socket

HOST = ''
PORT = 8000

reply = b'Yes'

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.bind((HOST, PORT))

s.listen(3)
conn, addr = s.accept()
request = conn.recv(1024)

print('Request is:', request)
print('Connected by', addr)
conn.sendall(reply)
conn.close()
