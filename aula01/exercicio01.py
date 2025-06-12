import mysql.connector

banco= mysql.connector.connect(
    host="localhost",
    user="root",
    password="123456",
    database="simulado_turmab"
)
print(banco)

def mostrarUsuarios():
    cursor=banco.cursor()
    pesquisa= "select * from clientes;"
    cursor.execute(pesquisa)
    resultado= cursor.fetchall()
    return resultado

def inserirUsuario(nome, email):
    cursor=banco.cursor()
    sql = "INSERT INTO clientes (nome,email) values (%s, %s)"
    data= (nome,email)
    cursor.execute(sql,data)
    banco.commit()
inserirUsuario("matheus","matheusvanderlei@empresa.com")
resultado = mostrarUsuarios()
for x in resultado:
    print(x)
