
package acme.forms;

import java.util.Map;

import acme.entities.enumerates.TeachingType;
import acme.framework.data.AbstractForm;

public class LecturerDashboarb extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	private static final long				serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	protected Map<TeachingType, Integer>	totalNumberOfSessionsPerType;

	protected Statistics					lecturerLectures;

	protected Statistics					lecturerCourses;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
}
