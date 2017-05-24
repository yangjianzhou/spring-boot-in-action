package test.springCloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangjianzhou on 5/24/17 6:29 PM.
 */

@RestController
public class PersonController {

    @Autowired
    private PersonDao personDao ;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public List<Person> savePerson(@RequestBody String personName){
        Person person = new Person(personName);
        personDao.save(person);
        
    }
}
