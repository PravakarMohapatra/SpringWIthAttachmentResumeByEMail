package in.pravakar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import in.pravakar.service.MailService;

@SpringBootApplication
public class SpringWIthAttachmentResumeByEMailApplication {
	@Autowired
	private MailService mailService;

	public static void main(String[] args) {
		SpringApplication.run(SpringWIthAttachmentResumeByEMailApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws Exception {
		mailService.sendMail("pravakarmohapatra8@gmail.com", "SpringDemo", "Spring boot Email developer","C:\\Users\\HP\\Desktop\\RESUME 123.docx");
	}

}
