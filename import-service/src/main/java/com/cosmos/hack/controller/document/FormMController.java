package com.cosmos.hack.controller.document;

import com.cosmos.hack.controller.AbstractController;
import com.cosmos.hack.model.document.FormM;
import com.cosmos.hack.repository.document.FormMRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/document/formm")
public class FormMController extends AbstractController<FormM,String> {
    @Autowired
    public FormMController(FormMRepository repo) {
        super(repo);
    }
}
