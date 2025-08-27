package sv.edu.udb.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import sv.edu.udb.repository.domain.Post;

//Andrea Paola Calles Arias CA222101

public interface PostRepository extends JpaRepository<Post, Long> {
}
