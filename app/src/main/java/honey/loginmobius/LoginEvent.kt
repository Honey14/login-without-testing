package honey.loginmobius

sealed class LoginEvent {

    data class NameChanged(val name: String) : LoginEvent()

    data class PasswordChanged(val password: String) : LoginEvent()

    class SubmitCLicked : LoginEvent()
}