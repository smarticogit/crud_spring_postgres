# crud_spring_postgres
```CRUD de teste com Java Spring Boot e DB PostgreSQL
```
# Instalando PostgreSQL

$ sudo apt update && sudo apt dist-upgrade
$ sudo apt install postgresql postgresql-contrib

PostgreSQL trabalha com o conceito de “role”, similar ao usado nos sistemas Unix/Linux 
para gerenciar usuários e permissões. A instalação do servidor vai criar um usuário padrão postgres, 
por tanto, iremos logar com essas credenciais e, depois disso, acessar o prompt para gerenciar os nossos 
bancos de dados com o comando psql:

$ sudo -i -u postgres
$ psql

postgres=#

# Para sair: 
postgres=# \q
