package es.upm.grise.profundizacion.cruiseControl;

public class CruiseControl {
	
	@SuppressWarnings("unused")
	private Speedometer speedometer;
	private Integer speedSet;
	private Integer speedLimit;

	/*
	 * Constructor
	 */
	public CruiseControl(Speedometer speedometer) {

		this.speedSet = null;
        this.speedLimit = null;

	}
	
	
	
	/*
	 * Method to code / test
	 */
	public void setSpeedSet(int speedSet) {

		    throws IncorrectSpeedSetException, SpeedSetAboveSpeedLimitException {

        // Debe ser estrictamente mayor que cero
        if (speedSet <= 0) {
            throw new IncorrectSpeedSetException(
                    "La velocidad programada debe ser mayor que cero");
        }

        // Si existe speedLimit, no puede superarlo
        if (speedLimit != null && speedSet > speedLimit) {
            throw new SpeedSetAboveSpeedLimitException(
                    "La velocidad programada supera el límite permitido");
        }

        this.speedSet = speedSet;
	}
	
	

	/*
	 * Other setters & getters
	 */
	public Integer getSpeedLimit() {
		
		return speedLimit;
		
	}

	public void setSpeedLimit(Integer speedLimit) {
		
		this.speedLimit = speedLimit;
		
	}

	public Integer getSpeedSet() {
		
		return speedSet;
		
	}

}


    
   
