package honey.loginmobius

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.spotify.mobius.Connection
import com.spotify.mobius.Mobius
import com.spotify.mobius.MobiusLoop
import com.spotify.mobius.android.MobiusAndroid
import com.spotify.mobius.functions.Consumer

class LoginFragment : Fragment() {

    private val effectHandler: LoginEffectHandler = TODO()

    private val mobiusLoop: MobiusLoop.Builder<LoginModel, LoginEvent, LoginEffect> =
        Mobius.loop(LoginUpdate(), effectHandler)

    private val controller: MobiusLoop.Controller<LoginModel, LoginEvent> =
        MobiusAndroid.controller(mobiusLoop, LoginModel.default())

    override
    fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return createView(inflater, container).also {
            controller.connect(::connectEvents)
        }
    }

    private fun createView(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): View {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    private fun connectEvents(events: Consumer<LoginEvent>): Connection<LoginModel> {

        return object : Connection<LoginModel> {

            override fun accept(model: LoginModel) {

            }

            override fun dispose() {

            }
        }
    }
}