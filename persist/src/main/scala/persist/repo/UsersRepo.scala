package persist.repo

import persist.model.{Ip, User, UserId}

import scala.concurrent.Future

trait UsersRepo {
  def createUser(user: User): Future[Boolean]

  def updateUser(user: User): Future[Boolean]

  def updateUserIp(userId: UserId, ip: Ip): Future[Boolean]

  def deleteUser(userId: UserId): Future[Boolean]

  def readUser(userId: UserId): Future[Option[User]]

  def readAllUsers(): Future[List[User]]
}
