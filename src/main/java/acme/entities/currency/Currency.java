
package acme.entities.currency;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;

import acme.framework.components.datatypes.Money;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Currency extends Money {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Digits(integer = 10, fraction = 2)
	protected Double			otherAmount;

	@NotBlank
	@Enumerated(EnumType.STRING)
	protected CurrencyEnum		otherCurrency;

	// Object interface -------------------------------------------------------

}
