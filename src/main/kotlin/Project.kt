class Project(val user: User, val task: Task) {

    fun createUser(message: ISender){
        user.sendAdminNotification(message)
    }

    fun addTask (user: User, task: Task){

    }





}