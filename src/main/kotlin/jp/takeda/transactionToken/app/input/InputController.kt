package jp.takeda.transactionToken.app.input

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.terasoluna.gfw.web.token.transaction.TransactionTokenCheck

@Controller
@RequestMapping("input")
@TransactionTokenCheck("transactionTokenExample")
class InputController {

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun onGet(model: Model): String {
        return "input";
    }
}