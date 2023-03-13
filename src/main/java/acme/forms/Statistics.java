package acme.forms;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Statistics {

    protected int count;
    protected double average;
    protected double minimum;
    protected double maximum;
    protected double stdDeviation;

}
