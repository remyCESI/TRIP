import socket
import time
from serial import *
# Port série ttyACM0
# Vitesse de baud : 9600
# Timeout en lecture : 1 sec
# Timeout en écriture : 1 sec

HOST = "localhost"
PORT = 9999

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

def init_socket():
    s.connect((HOST,PORT))

def send_message(message):
    print("Message sent")
    s.send(bytes(message+"\r\n",'UTF-8'))

#init_socket()

#try:
#    while(True):
#        send_message("Hello I'm the python program")
#        time.sleep(5)
#except (KeyboardInterrupt, SystemExit):
#    send_message("quit")
#    s.close()

with Serial(port="COM15", baudrate=9600, timeout=1, writeTimeout=1) as port_serie:
    if port_serie.isOpen():
        while True:
            ligne = port_serie.read_line()
            print(ligne)
