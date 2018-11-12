import socket
import time

HOST = "localhost"
PORT = 9999
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

def init_socket():
    try:
        s.bind((HOST, PORT))
    except socket.error as err:
        print('Bind failed. Error Code : ' .format(err))
    s.listen(10)
    print("Socket Listening")
    conn, addr = s.accept()
    return conn

def send_message(message):
    print("Message sent")
    
    connection.send(bytes(message+"\r\n",'UTF-8'))
    print("Message sent")

connection = init_socket()


while(True):
    send_message("Hello I'm the python program")
    time.sleep(5)
