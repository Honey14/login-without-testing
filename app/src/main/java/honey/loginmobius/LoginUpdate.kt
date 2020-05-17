package honey.loginmobius

import com.spotify.mobius.Next
import com.spotify.mobius.Next.*
import com.spotify.mobius.Update

class LoginUpdate : Update<LoginModel, LoginEvent, LoginEffect> {
    override fun update(model: LoginModel, event: LoginEvent): Next<LoginModel, LoginEffect> {
        return when (event) {
            is LoginEvent.NameChanged -> next(model.nameChanged(event.name))
            is LoginEvent.PasswordChanged -> next(model.passwordCHanged(event.password))
            is LoginEvent.SubmitCLicked -> dispatch(
                setOf(
                    LoginEffect.ValidateInput(
                        model.name,
                        model.password
                    )
                )
            )
        }
    }

}