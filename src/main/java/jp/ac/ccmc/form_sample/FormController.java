package jp.ac.ccmc.form_sample;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact")
public class FormController {
    private Map<String, String> radioGender;
    private Map<String, String> selectAddress;

    public FormController() {
        radioGender = new LinkedHashMap<>();
        radioGender.put("male", "男性");
        radioGender.put("female", "女性");
        radioGender.put("other", "その他");

        selectAddress = new LinkedHashMap<>();
        selectAddress.put("Tokyo", "東京都");
        selectAddress.put("Saitama", "埼玉県");
        selectAddress.put("Chiba", "千葉県");
        selectAddress.put("Kanagawa", "神奈川県");
    }

    @GetMapping({"/", "/index"})
    public String index() {
        return "contact";
    }
    
    @GetMapping("/message")
    public String showMessageForm() {
        return "form/message-form";
    }

    @PostMapping("/message")
    public String postMessageForm() {
        return "form/message-result";
    }

    @GetMapping("/request")
    public String showRequestForm() {
        return "form/request-form";
    }
}
