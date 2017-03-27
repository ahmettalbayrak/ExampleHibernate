# ExampleHibernate

<br>//hibernate.cfg
<br>DB driver class : com.mysql.jdbc.Driver
<br>DB connection url : jdbc:mysql://localhost:3307/mysql
<br>DB connection username : [kullanici_adiniz]
<br>DB connection password : [parolanız]

<br>//Employee Table
  <br>Id(int auto_increment, primary key),
  <br>Name(Text),
  <br>Surname(Text),
  <br>Salary(int),
  <br>DepartmentId(foreign_key)
  
<br>//Department Table
  <br>Id(int auto_increment, primary key),
  <br>Name(Text),
  <br>Description(Text)
  
<br>//Meetings Table
  <br>Id(int auto_increment, primary key),
  <br>Name(Text),
  <br>Description(Text),
  <br>DepartmentId(Foreign_key)
  
