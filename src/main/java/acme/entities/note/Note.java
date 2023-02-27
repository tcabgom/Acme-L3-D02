
package acme.entities.note;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Note extends AbstractEntity {

	// Serialisation identifier --------------------------------------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes ----------------------------------------------------------------------------------------

	@PastOrPresent
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	protected Date				instantiationMoment;

	@NotBlank
	@Length(max = 76)
	protected String			title;

	@NotBlank
	@Length(max = 76)
	@Pattern(regexp = "^[a-zA-Z ]+ - [a-zA-Z ]+,[a-zA-Z ]+$")
	protected String			author;

	@Length(max = 101)
	@NotBlank
	protected String			message;

	@Email
	protected String			email;

	@URL
	protected String			link;

	// Derived attributes --------------------------------------------------------------------------------

	// Relationships -------------------------------------------------------------------------------------
}
