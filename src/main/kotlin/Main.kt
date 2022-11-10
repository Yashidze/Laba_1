fun main(args: Array<String>) {
    val adminSend: SendSms = SendSms()
    val user: User = User("", "")
    val task: Task = Task("", "")
    val p: Project = Project(user, task)
    p.createUser(adminSend)


}