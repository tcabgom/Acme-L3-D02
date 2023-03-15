
package acme.forms;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssistantDashboard extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	//protected Map<TutorialSessionType, Integer>	totalNumberOfSessionsPerType;

	protected Statistics		assistantSession;

	protected Statistics		assistantTutorials;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
