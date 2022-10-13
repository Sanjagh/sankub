package persist.model

final case class ModuleId(id: String) extends AnyVal
final case class UserId(id: String) extends AnyVal

final case class Setting(domainPrefix: String, domainPostfix: String)

enum UserRole:
  case Admin, Developer

final case class User(id: UserId, userName: String, portPrefix: String, role: UserRole)

final case class Module(id: ModuleId, defaultPort: String, ram: Option[Double], cpu: Option[Double], readyPath: Option[String], enabled: Boolean)



final case class UserNameSpace(branch: String, ip: String, healthCheckRate: Int)

enum UserModuleStatus:
  case Dev, Server

final case class UserModule(userId: UserId , moduleId: ModuleId, status: UserModuleStatus)
