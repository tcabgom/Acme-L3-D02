
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

	Integer						totalNumberOfTheorySessions;
	Integer						totalNumberOfNonTheorySessions;

	Double						minimumDurationOfAssistantSessions;
	Double						maximunDurationOfAssistantSessions;
	Double						averageDurationOfAssistantSessions;
	Double						deviationDurationOfAssistantSessions;

	Double						minimumDurationOfAssistantTutorials;
	Double						maximunDurationOfAssistantTutorials;
	Double						averageDurationOfAssistantTutorials;
	Double						deviationDurationOfAssistantTutorials;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
