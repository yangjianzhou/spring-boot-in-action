package test.springCloud.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.springCloud.ui.domain.Person;
import test.springCloud.ui.service.PersonHystrixService;
import test.springCloud.ui.service.SomeHystrixService;

import java.util.List;

@RestController
public class UiController {
    @Autowired
    private SomeHystrixService someHystrixService;

    @Autowired
    private PersonHystrixService personHystrixService;

    @RequestMapping("/dispatch")
    public List<Person> sendMessage(@RequestBody String personName) {
        return personHystrixService.save(personName);
    }

    @RequestMapping(value = "/getsome", produces = {MediaType.TEXT_PLAIN_VALUE})
    public String getSome() {
        return someHystrixService.getSome();
    }
}
