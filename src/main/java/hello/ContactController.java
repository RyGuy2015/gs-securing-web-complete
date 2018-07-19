package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @RequestMapping("/create-contact")
    public Contact newContact(@RequestParam(value="contact-id") String contactId, @RequestParam(value="contact-id") String contactId) {
    	Contact newContact = new Contact();
    }
    
    @RequestMapping("/find-contact")
    public Contact findContact(@RequestParam(value="contact-id") String contactId, @RequestParam(value="domain") String domain) {
    	Contact foundContact = new Contact(contactId, domain);
    	return foundContact;
    }
}