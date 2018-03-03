package jp.takeda.transactionToken.app.result

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.terasoluna.gfw.web.token.transaction.TransactionTokenCheck
import org.terasoluna.gfw.web.token.transaction.TransactionTokenType

@Controller
@RequestMapping("result")
@TransactionTokenCheck("transactionTokenExample")
class ResultController {

    // トランザクショントークンのチェック
    @RequestMapping(method = arrayOf(RequestMethod.POST))
    @TransactionTokenCheck
    fun doPost(model: Model): String {
        return "result";
    }
}