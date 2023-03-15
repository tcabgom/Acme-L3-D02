package acme.entities.enrolment;


import acme.entities.activity.Activity;
import acme.entities.lecture.Course;
import acme.framework.data.AbstractEntity;
import acme.roles.Student;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Getter
@Setter
public class Enrolment extends AbstractEntity {

    // Serialisation identifier -----------------------------------------------

    protected static final long serialVersionUID = 1L;

    // Attributes -------------------------------------------------------------

    @Pattern(regexp = "[A-Z]{1,3}[0-9]{3}")
    @NotBlank
    @Column(unique = true)
    protected String code;

    @NotBlank
    @Length(max = 75)
    protected String motivation;

    @NotBlank
    @Length(max = 100)
    protected String goals;


    // Derived attributes -----------------------------------------------------
    protected double workTime;

    // Relationships ----------------------------------------------------------

    @ManyToOne
    @Valid
    @NotNull
    protected Student student;

    @ManyToOne
    @Valid
    @NotNull
    protected Course course;
}