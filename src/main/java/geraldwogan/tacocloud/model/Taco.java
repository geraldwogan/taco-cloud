package geraldwogan.tacocloud.model;

import java.util.Date;
import java.util.List;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Taco {

    private Long id;

    private Date createdAt = new Date();

    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;

    private List<Ingredient> ingredients;

}
