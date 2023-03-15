
package acme.forms;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuditDashboard extends AbstractForm {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	Integer						totalnumberofAuditsofTheoryCourses;
	Integer						totalnumberofAuditsofHandOnCourses;

	Double						averageAuditingRecordsInAudit;
	Double						deviationAuditingRecordsInAudit;
	Double						maximumAuditingRecordsInAudit;
	Double						minimumAuditingRecordsInAudit;

	Double						averagePeriodLength;
	Double						deviationPeriodLength;
	Double						maximumPeriodLength;
	Double						minimumPeriodLength;

}
//Dashboard:
//- Total audits 
//- Average, Deviation, Minimum, maximum-> audinting records in audits
//- Average, Deviation, Minimum, maximum-> period length
