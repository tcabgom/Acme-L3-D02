package acme.forms;

import acme.framework.data.AbstractForm;
import acme.framework.data.AbstractRole;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class AdminDashboard extends AbstractForm {

    // Serialisation identifier -----------------------------------------------
    private static final long serialVersionUID = 1L;

    // Attributes -------------------------------------------------------------
    protected Map<AbstractRole, Integer> totalPrincipals;

    protected double linkAndEmailPeepRatio;
    protected double criticalBulletinRatio;

    protected Map<String,Statistics> budgetStatisticsByCurrency;

    protected Statistics notesPostedInLast10Weeks;

    // Derived attributes -----------------------------------------------------

    // Relationships ----------------------------------------------------------


}
