package Interest_Calculator;

public class SimpleInterest extends InterestCalculator {

	public void SimpleInterest() {

	}
	public SimpleInterest(Double Principal ,Double rateofInterest, Double TimePeroid) {

		this.Principal=Principal;
		this.rateofInterest = rateofInterest;
		this.TimePeroid= TimePeroid;

	}

	public Double getSimpleInterest() {

		return ((Principal * TimePeroid * rateofInterest)/100);

	}
}
