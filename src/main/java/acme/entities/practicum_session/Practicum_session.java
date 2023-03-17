
package acme.entities.practicum_session;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.entities.practicum.Practicum;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Practicum_session extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			abstractSession;

	@Temporal(TemporalType.TIMESTAMP)
	protected LocalDate			startWeek;

	@Temporal(TemporalType.TIMESTAMP)
	protected LocalDate			finishWeek;

	@URL
	protected String			link;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

	@ManyToOne(optional = true)
	@Valid
	protected Practicum			practicum;
}
