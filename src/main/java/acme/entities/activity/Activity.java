package acme.entities.activity;

import acme.entities.enrolment.Enrolment;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Getter
@Setter
public class Activity extends AbstractEntity {

    // Serialisation identifier -----------------------------------------------

    protected static final long serialVersionUID = 1L;

    // Attributes -------------------------------------------------------------

    @NotBlank
    @Length(max = 75)
    protected String title;

    @NotBlank
    @Length(max = 100)
    protected String enrolmentAbstract;

    @NotNull
    protected ActivityType type;

    @Temporal(TemporalType.TIMESTAMP)
    protected Date periodStart;

    @Temporal(TemporalType.TIMESTAMP)
    protected Date periodEnd;

    @URL
    protected String furtherInformation;

    // Derived attributes -----------------------------------------------------

    // Relationships ----------------------------------------------------------

    @NotNull
    @Valid
    @ManyToOne(optional = false)
    protected Enrolment enrolment;
}
