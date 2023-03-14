
package acme.entities.session;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Session extends AbstractEntity {

	// Serialisation identifier ------------------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes --------------------------------------------------------------------

	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			sessionAbstract;

	protected boolean			isTheorySession;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	protected Date				sessionStart;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	protected Date				sessionEnd;

	@URL
	protected String			moreInfo;

	// Derived attributes ------------------------------------------------------------

	// Relationships -----------------------------------------------------------------

}
