
package acme.forms;

import java.util.Map;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyDashboard extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	protected static final long		serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	protected int					totalPractices;
	protected Map<String, Integer>	totalHandsOnPracticesPerMonth;
	protected Map<String, Integer>	totalTheoryPracticesPerMonth;
	protected Statistics			sessions;
	protected Statistics			practicalPeriod;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
