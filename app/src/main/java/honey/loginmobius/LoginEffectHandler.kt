package honey.loginmobius

import com.spotify.mobius.Connectable
import com.spotify.mobius.Connection
import com.spotify.mobius.functions.Consumer

class LoginEffectHandler : Connectable<LoginEffect, LoginEvent> {
    override fun connect(
        output: Consumer<LoginEvent>
    ): Connection<LoginEffect> {
        return object : Connection<LoginEffect> {

            override fun accept(effect: LoginEffect) {
               // write the business logic to handle effects
            }

            override fun dispose() {
                // Nothing to do here
            }
        }
    }

}
