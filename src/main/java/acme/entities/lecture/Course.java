
package acme.entities.lecture;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

public class Course {
	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Pattern(regexp = "[A-Z]{1,3}[0-9]{3}")
	@NotBlank
	@Column(unique = true)
	protected String			code;

	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			courseAsbtract;

	@NotNull
	@Positive
	protected Double			retailPrice;

	@URL
	protected String			furtherInformation;

	// Derived attributes -----------------------------------------------------
	@NotNull
	protected KnowledgeType		knowledge;

	// Relationships ----------------------------------------------------------
}
