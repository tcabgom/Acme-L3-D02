
package acme.entities.configuration;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Configuration extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Pattern(regexp = "^(EUR|USD|GBP)$")
	protected String			currency;

	// Derived attributes -----------------------------------------------------


	public boolean isAcceptedCurrency(final String currency) {
		boolean result = false;
		final String currencyUpperCase = currency.toUpperCase();
		if (currencyUpperCase.equals("EUR") || currencyUpperCase.equals("USD") || currencyUpperCase.equals("GBP"))
			result = true;
		return result;
	}

	// Relationships ----------------------------------------------------------

}
