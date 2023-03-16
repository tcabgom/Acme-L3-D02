
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

	protected Integer			totalnumberofAuditsofTheoryCourses;
	protected Integer			totalnumberofAuditsofHandOnCourses;

	protected Statistics		auditingRecordsStatistics;
	protected Statistics		periodLengthStatistics;

}
