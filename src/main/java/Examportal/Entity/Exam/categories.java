package Examportal.Entity.Exam;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name="category")
@NoArgsConstructor
public class categories {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long cid;
    private String title;
    private String description;
    @OneToMany(mappedBy = "category",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<quiz> quiz=new LinkedHashSet<>();
}
