
public class GetPlanFactory {
	public Plan getPlan(String planType) {
		if (planType.equalsIgnoreCase("dp")) {
			return new DomesticPlan();
		} else if (planType.equalsIgnoreCase("cp")) {
			return new CommercialPlan();
		} else if (planType.equalsIgnoreCase("ip")) {
			return new InstitutionalPlan();
		}else if (planType.equalsIgnoreCase("sp")) {
			return new StudentPlan();
		return null;
	}
} }

