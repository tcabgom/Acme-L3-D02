
package acme.entities.audit;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.validator.constraints.Length;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class AuditingRecords extends AbstractEntity {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@Length(max = 75)
	@NotBlank
	protected String			subjects;

	@Length(max = 100)
	@NotBlank
	protected String			assesment;

	@Temporal(TemporalType.TIMESTAMP)
	@PastOrPresent
	protected Date				auditingPeriodInitial;

	@Temporal(TemporalType.TIMESTAMP)
	@PastOrPresent
	protected Date				auditingPeriodEnd;

	@NotNull
	protected Mark				mark;

	@ManyToOne
	@NotNull
	protected Audit				audit;
}
