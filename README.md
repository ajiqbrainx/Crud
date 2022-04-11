

## Play Framework using Simple crud Operation !!!

Simple CRUD application using Play framework (and Scala) for a REST API and MySQL backend.

## Setup

This project is using a lot of tools. All should be installed before starting to run it.

- Scala 2.13.8
- Play framework 2.8.15
- Postman
- MySQL
- JDK Version 1.8 (use above 1.8 jdk version)

## Play Framework Setup

We’re going to take a look at the Play Framework with Scala. We’ll learn how to set up the Play Framework, use the development tools to generate our project, and how to implement our own features.

## Command-line Tools

- sbt new playframework/play-scala-seed.g8
- name [play-scala-seed]: (Enter your Project Name1)
- organization [com.example]: (com.qbrainx)
- play_version [2.8.15]: (Enter your preferred play_version)
- scala_version [2.13.8]: (Enter your preferred scala_version)



## SBT Setup Dependencies

- [ ] libraryDependencies += "com.typesafe.play" %% "play-slick" %
  "5.0.0"
- [ ] libraryDependencies += "com.typesafe.play" %%
  "play-slick-evolutions" % "5.0.0"
- [ ] libraryDependencies += "mysql" % "mysql-connector-java" %
  "8.0.28"

## plugins.sbt

- addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.15")
- addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8-scaffold" %
  "0.13.1")

## application.conf

- slick.dbs.default.profile = "slick.jdbc.MySQLProfile$"
- slick.dbs.default.db.driver = "com.mysql.cj.jdbc.Driver"
- slick.dbs.default.db.url = "jdbc:mysql://localhost/---database name
  ---"
- slick.dbs.default.db.user = "---username---"
- slick.dbs.default.db.password="---password---"


## Controllers mapping

- GET =>  getAll => [Get all items](http://localhost:9000/getAll)
- GET => getById/id =>[Get an item by ID](http://localhost:9000/getById/id)
- POST => add => Add a new item
- PUT =>   update/id => Update an existing item
- DELETE =>delete/id =>Delete an item

## Test CRUD with Postman

- Create a new request.
- Set the HTTP method to POST
- Select the Body tab.
- Select the raw radio button.
- Set the type to JSON (application/json).
- In the request body enter JSON for a to-do item.

 
