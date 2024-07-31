package com.test1;

public class DsLinearFunction {
	private String functionCode;
	private String variableList;
	private String dependentVariable;
	private String independantVariable;
	private String coefficientVariable;
	private String explanatoryVariable;
	private String averageChanges;
	private Integer assumptionData;
	private String variablePrediction;
	private String validDataSample;
	private String entityState;

	public DsLinearFunction() {

	}

	public DsLinearFunction(String functionCode, String variableList, String dependentVariable,
			String independantVariable, String coefficientVariable, String explanatoryVariable, String averageChanges,
			Integer assumptionData, String variablePrediction, String validDataSample, String entityState) {
		super();
		this.functionCode = functionCode;
		this.variableList = variableList;
		this.dependentVariable = dependentVariable;
		this.independantVariable = independantVariable;
		this.coefficientVariable = coefficientVariable;
		this.explanatoryVariable = explanatoryVariable;
		this.averageChanges = averageChanges;
		this.assumptionData = assumptionData;
		this.variablePrediction = variablePrediction;
		this.validDataSample = validDataSample;
		this.entityState = entityState;
	}

	public String getFunctionCode() {
		return functionCode;
	}

	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}

	public String getVariableList() {
		return variableList;
	}

	public void setVariableList(String variableList) {
		this.variableList = variableList;
	}

	public String getDependentVariable() {
		return dependentVariable;
	}

	public void setDependentVariable(String dependentVariable) {
		this.dependentVariable = dependentVariable;
	}

	public String getIndependantVariable() {
		return independantVariable;
	}

	public void setIndependantVariable(String independantVariable) {
		this.independantVariable = independantVariable;
	}

	public String getCoefficientVariable() {
		return coefficientVariable;
	}

	public void setCoefficientVariable(String coefficientVariable) {
		this.coefficientVariable = coefficientVariable;
	}

	public String getExplanatoryVariable() {
		return explanatoryVariable;
	}

	public void setExplanatoryVariable(String explanatoryVariable) {
		this.explanatoryVariable = explanatoryVariable;
	}

	public String getAverageChanges() {
		return averageChanges;
	}

	public void setAverageChanges(String averageChanges) {
		this.averageChanges = averageChanges;
	}

	public Integer getAssumptionData() {
		return assumptionData;
	}

	public void setAssumptionData(Integer assumptionData) {
		this.assumptionData = assumptionData;
	}

	public String getVariablePrediction() {
		return variablePrediction;
	}

	public void setVariablePrediction(String variablePrediction) {
		this.variablePrediction = variablePrediction;
	}

	public String getValidDataSample() {
		return validDataSample;
	}

	public void setValidDataSample(String validDataSample) {
		this.validDataSample = validDataSample;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
