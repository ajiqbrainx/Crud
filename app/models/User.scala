package models

import play.api.data.Form
import play.api.data.Forms.{mapping, nonEmptyText}
import slick.jdbc.MySQLProfile.api._
import slick.lifted.{ProvenShape, Tag}


case class User(id: String, fname: String, lname: String, mobile: String)

object UserForm {
  val form = Form(
    mapping(
      "id" -> nonEmptyText,
      "fname" -> nonEmptyText,
      "lname" -> nonEmptyText,
      "mobile" -> nonEmptyText,
    )(User.apply)(User.unapply)
  )
}

class UserData(tag: Tag) extends Table[User](tag, "crud") {

  def id: Rep[String] = column[String]("id")

  def fName: Rep[String] = column[String]("fname")

  def lName: Rep[String] = column[String]("lname")

  def mobile: Rep[String] = column[String]("mobile")

  override def * : ProvenShape[User] = (id, fName, lName, mobile) <> (User.tupled, User.unapply)


}
