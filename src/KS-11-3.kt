class Room {
    var cover: String = ""
    var name: String = ""
    var members = mutableListOf<endUser>()

    fun addUser(member: endUser) {
        members.add(member)
    }
    fun updateStatus(nickname: String, newStatus: String) {
        for (member in members) {
            if (member.name == nickname) {
                member.statusSpeaker = newStatus
            }
        }
    }
}
    class endUser {
        var avatar: String = ""
        var name: String = ""
        var statusSpeaker: String = "Разговаривает"
    }

fun main() {
    val room = Room()
    room.cover = "какая-нибудь картинка"
    room.name = "Комната гитаристов"

    val user1 = endUser()
    user1.name = "Валерий"
    user1.avatar = "avatar1.png"

    val user2 = endUser()
    user2.name = "Анна"
    user2.avatar = "avatar2.png"

    room.addUser(user1)
    room.addUser(user2)

    room.updateStatus("Анна", "микрофон выключен")

    println(room.members[0].statusSpeaker)
    println(room.members[1].statusSpeaker)
}