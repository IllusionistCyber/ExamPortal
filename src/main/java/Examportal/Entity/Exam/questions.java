package Examportal.Entity.Exam;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class questions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long quesId;

    private String content;

    private String images;

    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String answer;

    @ManyToOne(fetch = FetchType.EAGER)
    private quiz quiz;

}
