package com.test1;

public class DsSlopeAndIntercept {
	private Integer slopeCode;
	private Integer functionCode;
	private String dynamicAllocation;
	private String coefficient;
	private String splittor;
	private String predictions;
	private boolean resequenced;
	private String keyValue;
	private String lowKey;
	private String highKey;
	private String significantKeyValue;
	private String insignificantKeyValue;
	private String hypothesis;
	private String alternativeHypothesis;
	private String entityState;
	private String remarks;

	public DsSlopeAndIntercept() {
	}

	public DsSlopeAndIntercept(Integer slopeCode, Integer functionCode, String dynamicAllocation, String coefficient,
			String splittor, String predictions, boolean resequenced, String keyValue, String lowKey, String highKey,
			String significantKeyValue, String insignificantKeyValue, String hypothesis, String alternativeHypothesis,
			String entityState, String remarks) {
		super();
		this.slopeCode = slopeCode;
		this.functionCode = functionCode;
		this.dynamicAllocation = dynamicAllocation;
		this.coefficient = coefficient;
		this.splittor = splittor;
		this.predictions = predictions;
		this.resequenced = resequenced;
		this.keyValue = keyValue;
		this.lowKey = lowKey;
		this.highKey = highKey;
		this.significantKeyValue = significantKeyValue;
		this.insignificantKeyValue = insignificantKeyValue;
		this.hypothesis = hypothesis;
		this.alternativeHypothesis = alternativeHypothesis;
		this.entityState = entityState;
		this.remarks = remarks;
	}

	public Integer getSlopeCode() {
		return slopeCode;
	}

	public void setSlopeCode(Integer slopeCode) {
		this.slopeCode = slopeCode;
	}

	public Integer getFunctionCode() {
		return functionCode;
	}

	public void setFunctionCode(Integer functionCode) {
		this.functionCode = functionCode;
	}

	public String getDynamicAllocation() {
		return dynamicAllocation;
	}

	public void setDynamicAllocation(String dynamicAllocation) {
		this.dynamicAllocation = dynamicAllocation;
	}

	public String getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(String coefficient) {
		this.coefficient = coefficient;
	}

	public String getSplittor() {
		return splittor;
	}

	public void setSplittor(String splittor) {
		this.splittor = splittor;
	}

	public String getPredictions() {
		return predictions;
	}

	public void setPredictions(String predictions) {
		this.predictions = predictions;
	}

	public boolean isResequenced() {
		return resequenced;
	}

	public void setResequenced(boolean resequenced) {
		this.resequenced = resequenced;
	}

	public String getKeyValue() {
		return keyValue;
	}

	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

	public String getLowKey() {
		return lowKey;
	}

	public void setLowKey(String lowKey) {
		this.lowKey = lowKey;
	}

	public String getHighKey() {
		return highKey;
	}

	public void setHighKey(String highKey) {
		this.highKey = highKey;
	}

	public String getSignificantKeyValue() {
		return significantKeyValue;
	}

	public void setSignificantKeyValue(String significantKeyValue) {
		this.significantKeyValue = significantKeyValue;
	}

	public String getInsignificantKeyValue() {
		return insignificantKeyValue;
	}

	public void setInsignificantKeyValue(String insignificantKeyValue) {
		this.insignificantKeyValue = insignificantKeyValue;
	}

	public String getHypothesis() {
		return hypothesis;
	}

	public void setHypothesis(String hypothesis) {
		this.hypothesis = hypothesis;
	}

	public String getAlternativeHypothesis() {
		return alternativeHypothesis;
	}

	public void setAlternativeHypothesis(String alternativeHypothesis) {
		this.alternativeHypothesis = alternativeHypothesis;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
