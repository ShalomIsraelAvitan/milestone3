package israela.milestone3;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vaadin.flow.component.html.Image;

@Repository
public interface PhotoReposiory extends MongoRepository<Photo, ObjectId>{
    
    public ArrayList<Photo> findByIdOfUser(Long idOfUser);
    public void deleteByIdOfUser(Long idOfUser);
    public ArrayList<Photo> findByClassification(String classification);
    //public ArrayList<Image> findImgoByIdOfUser(Long id);
    
 }
