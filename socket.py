import socket
import time

HOST = "localhost"
PORT = 9999

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

def init_socket():
    s.connect((HOST,PORT))

def send_message(message):
    print("Message sent")
    s.send(bytes(message+"\r\n",'UTF-8'))

init_socket()

try:
    while(True):
        send_message("Hello I'm the python program")
        time.sleep(5)
except (KeyboardInterrupt, SystemExit):
    send_message("quit")
    s.close()
