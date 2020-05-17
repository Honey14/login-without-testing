package honey.loginmobius

sealed class LoginEffect {

    data class ValidateInput(val name: String, val password: String) : LoginEffect()

}