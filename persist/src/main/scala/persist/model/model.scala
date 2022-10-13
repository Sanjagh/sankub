package persist.model

final case class ModuleId(value: String) extends AnyVal
final case class UserId(value: String) extends AnyVal
final case class Ip(value: String) extends AnyVal
final case class Branch(value: String) extends AnyVal

final case class OrgSettings(domainPrefix: String, domainPostfix: String)

enum UserRole:
  case Admin, Developer

final case class User(
    id: UserId,
    portPrefix: String,
    role: UserRole,
    ip: Ip
)

final case class Module(
    id: ModuleId,
    defaultPort: String,
    ram: Option[Double],
    cpu: Option[Double],
    readyPath: Option[String],
    enabled: Boolean
)

final case class ActiveUserModule(
    userId: UserId,
    moduleId: ModuleId,
    branch: Branch
)
