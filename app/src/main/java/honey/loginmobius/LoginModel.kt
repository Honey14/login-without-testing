package honey.loginmobius

data class LoginModel(
    val name: String,
    val password: String
) {

    companion object {
        fun default(): LoginModel = LoginModel(name = "", password = "")
    }

    fun nameChanged(name: String): LoginModel {
        return copy(name = name)
    }

    fun passwordCHanged(password: String): LoginModel {
        return copy(password = password)
    }
}