
package acme.roles;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import acme.framework.data.AbstractRole;

public class Auditor extends AbstractRole {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@Length(max = 75)
	@NotBlank
	protected String			firm;

	@Length(max = 25)
	@NotBlank
	protected String			identification;

	@Length(max = 100)
	@NotBlank
	protected String			certifications;

	@Column(nullable = true)
	protected String			link;

}
//Class auditor:
//- firm (not blank, <=75)
//- ID (not blank, <=25)
//- Certifications (list, not blank, <=100)
//- link (optional)
