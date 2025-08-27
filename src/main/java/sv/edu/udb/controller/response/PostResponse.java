package sv.edu.udb.controller.response;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;
import java.time.LocalDate;
@Getter
@Setter
@Builder(toBuilder = true)
@FieldNameConstants

//Andrea Paola Calles Arias CA222101

public class PostResponse {
    private String title;
    private LocalDate postDate;
}
