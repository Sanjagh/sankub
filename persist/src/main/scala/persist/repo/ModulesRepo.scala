package persist.repo

import persist.model.{Module, ModuleId}

import scala.concurrent.Future

trait ModulesRepo {
  def createModule(module: Module): Future[Boolean]

  def updateModule(module: Module): Future[Boolean]

  def deleteModule(moduleId: ModuleId): Future[Boolean]

  def readModule(moduleId: ModuleId): Future[Option[Module]]

  def readAllModules(): Future[List[Module]]

}
