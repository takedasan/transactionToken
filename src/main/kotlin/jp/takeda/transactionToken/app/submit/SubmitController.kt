package jp.takeda.transactionToken.app.submit

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.terasoluna.gfw.web.token.transaction.TransactionTokenCheck
import org.terasoluna.gfw.web.token.transaction.TransactionTokenType

@Controller
@RequestMapping("submit")
@TransactionTokenCheck("transactionTokenExample")
class SubmitController {

    // トランザクショントークンの生成
    @RequestMapping(method = arrayOf(RequestMethod.POST))
    @TransactionTokenCheck(type = TransactionTokenType.BEGIN)
    fun doPost(model: Model): String {
        return "submit";
    }
}