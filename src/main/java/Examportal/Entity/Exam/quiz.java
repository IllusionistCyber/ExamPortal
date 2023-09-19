package Examportal.Entity.Exam;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Quiz")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long qId;
    private String description;
    private String title;
    private Integer maxMarks;
    private boolean active=false;
    private Integer noOfQuestions;
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    private categories category;
    @OneToMany(mappedBy = "quiz",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<questions> questions=new HashSet<>();
}
