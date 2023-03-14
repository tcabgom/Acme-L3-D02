
package acme.entities.offer;

import javax.validation.Validator;

public abstract class OfferValidator implements Validator {

	private static final int	DAYS_UNTIL_START_IS_VALID		= 1;
	private static final int	DAYS_UNTIL_DURATION_IS_VALID	= 7;


	public boolean isValid(final Offer value) {

		final long dayInMilliseconds = 1000 * 60 * 60 * 24;

		final long durationUntilStart = value.getAvailabilityPeriodStart().getTime() - value.getInstantiatiation().getTime();
		final long durationUntilEnd = value.getAvailabilityPeriodEnd().getTime() - value.getAvailabilityPeriodStart().getTime();

		final boolean asValidDurationUntilStart = durationUntilStart / dayInMilliseconds > OfferValidator.DAYS_UNTIL_START_IS_VALID;
		final boolean asValidAvailabilityPeriodDuration = durationUntilEnd / dayInMilliseconds > OfferValidator.DAYS_UNTIL_DURATION_IS_VALID;

		return asValidDurationUntilStart && asValidAvailabilityPeriodDuration;

	}

}
