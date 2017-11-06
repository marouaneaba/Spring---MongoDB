package hello;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonneRepository extends MongoRepository<Personne,Integer>{


    // métodes héritées :
    //long count()
    //void delete(int id)
    //boolean exists(int id)
    //Iterable<Personne> findAll()
    //Personne findOne()
    //Personne save(Personne p)


    public List<Personne> findByName(String Name);
}
