package Interest_Calculator;

public class CompoundInterest extends InterestCalculator {

	public CompoundInterest() {

	}
	public CompoundInterest(Double principal,Double rateofInterest , Double TimePeriod) {

		this.PrincipalAmount=PrincipalAmount;
		this.rateofInterest=rateofInterest;
		this.TimePeriod=TimePeriod;

	}
	public Double getCompoundInterest() {

		return (PrincipalAmount * Math.pow(1.0 + rateofInterest / 100.0, TimePeriod) - PrincipalAmount);

	}

}
