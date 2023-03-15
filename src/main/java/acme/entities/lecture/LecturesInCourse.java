
package acme.entities.lecture;

import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class LecturesInCourse {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	//Debe incluir una validación para que una lección solo pueda estar
	//Una vez en el mismo curso

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

	@NotNull
	@Valid
	@ManyToOne(optional = false)
	protected Course			course;

	@NotNull
	@Valid
	@ManyToOne(optional = false)
	protected Lecture			lecture;

}
