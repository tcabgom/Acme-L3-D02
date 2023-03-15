package acme.forms;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDashboard extends AbstractForm {

    // Serialisation identifier -----------------------------------------------
    protected static final long serialVersionUID = 1L;

    // Attributes -------------------------------------------------------------

    protected int totalTheoryActivities;
    protected int totalHandsOnActivities;

    protected Statistics activityPeriodStatistics;

    protected Statistics learningTimeStatistics;

    // Derived attributes -----------------------------------------------------


    // Relationships ----------------------------------------------------------

}
