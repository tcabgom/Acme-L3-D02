
package acme.entities.peep;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Peep extends AbstractEntity {

	protected static final long	serialVersionUID	= 1L;

	@Temporal(TemporalType.TIMESTAMP)
	@PastOrPresent
	@NotNull
	protected Date				moment;

	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 75)
	protected String			nick;

	@NotBlank
	@Length(max = 100)
	protected String			message;

	@Email
	@NotNull
	protected String			email;

	@URL
	@Column(nullable = true)
	protected String			link;


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(this.email, this.link, this.message, this.moment, this.nick, this.title);
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		final Peep other = (Peep) obj;
		return Objects.equals(this.email, other.email) && Objects.equals(this.link, other.link) && Objects.equals(this.message, other.message) && Objects.equals(this.moment, other.moment) && Objects.equals(this.nick, other.nick)
			&& Objects.equals(this.title, other.title);
	}

}
