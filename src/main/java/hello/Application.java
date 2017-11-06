package hello;


import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@EnableMongoRepositories
@SpringBootApplication
public class Application {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	@Bean
	public  CommandLineRunner demo(PersonneRepository repository){
	  return (args) -> {
	    // save a couple of PersonneRepository
	    repository.save(new Personne(1l,"Luke","Skywalker"));
	    repository.save(new Personne(2l,"Padme","Amidala"));
	    repository.save(new Personne(3l,"Anakin","Skywalker"));
	    repository.save(new Personne(4l,"obi-Wan","Kenobi"));
	
	
	    //fetch all Personnes
	    log.info("Persons found with findAll(): ");
	    log.info("-------------------------------");
	    
	    for(Personne persons : repository.findAll()){
	    	log.info(persons.toString());
	    }
	    log.info("");
	    
	  };
	}
	
      public static void main(String[] args){
        SpringApplication.run(Application.class, args);
      }



	
}
