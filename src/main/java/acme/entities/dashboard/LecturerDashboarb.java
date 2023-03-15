
package acme.entities.dashboard;

import acme.framework.data.AbstractForm;

public class LecturerDashboarb extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	Integer						totalNumberOfTheoryLectures;
	Integer						totalNumberOfHansonLectures;

	Double						minimumDurationOfLecture;
	Double						maximunDurationOfLecture;
	Double						averageDurationOfLecture;
	Double						deviationDurationOfLecture;

	Double						minimumDurationOfCourse;
	Double						maximunDurationOfCourse;
	Double						averageDurationOfCourse;
	Double						deviationDurationOfCourse;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
}
