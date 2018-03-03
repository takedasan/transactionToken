package jp.takeda.transactionToken.app.input

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping("input")
class InputController {

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun doPost(model: Model): String {
        return "input";
    }
}