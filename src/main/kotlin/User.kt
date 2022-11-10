class User (var userName: String, var userRole: String) {

    fun sendAdminNotification(message: ISender){
        println(message.send())
    }
}