#imports
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText
import smtplib

#mensagem
msg = MIMEMultipart()
texto = "Estou enviando um email com python"

#parametros
senha = "Sua senha"
msg['From'] = "Seu E-mail"
msg['To'] = "E-mail destino"
msg['subject'] = "Assunto"

#corpo da mensagem
msg.attach(MIMEText(texto, 'plain'))

#criação do servidor
server = smtplib.SMTP('smtp.gmail.com: 587')
server.starttls()

#login na conta para envio
server.login(msg['From'], senha)

#envio da mensagem
server.sendmail(msg['From'], msg['To'], msg.as_string())

#encerramento do servidor
server.quit()

print('Mensagem enviado com sucesso')

