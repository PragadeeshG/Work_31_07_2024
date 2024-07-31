package com.test1;

public class DsPlottingFunction {
	private Integer statsmodelId;
	private String formula;
	private boolean healthCheck;
	private Integer fullDataIdentifier;
	private String summaryGrid;
	private String linearRegressionResult;
	private Integer readCsvCode;
	private Integer modelAssumptionCode;
	private String resultSummary;
	private Integer dataAggregationCode;
	private String dataTolmport;
	private String regressionModel;
	private String evaluationModel;

	public DsPlottingFunction() {

	}

	public DsPlottingFunction(Integer statsmodelId, String formula, boolean healthCheck, Integer fullDataIdentifier,
			String summaryGrid, String linearRegressionResult, Integer readCsvCode, Integer modelAssumptionCode,
			String resultSummary, Integer dataAggregationCode, String dataTolmport, String regressionModel,
			String evaluationModel) {
		super();
		this.statsmodelId = statsmodelId;
		this.formula = formula;
		this.healthCheck = healthCheck;
		this.fullDataIdentifier = fullDataIdentifier;
		this.summaryGrid = summaryGrid;
		this.linearRegressionResult = linearRegressionResult;
		this.readCsvCode = readCsvCode;
		this.modelAssumptionCode = modelAssumptionCode;
		this.resultSummary = resultSummary;
		this.dataAggregationCode = dataAggregationCode;
		this.dataTolmport = dataTolmport;
		this.regressionModel = regressionModel;
		this.evaluationModel = evaluationModel;
	}

	public Integer getStatsmodelId() {
		return statsmodelId;
	}

	public void setStatsmodelId(Integer statsmodelId) {
		this.statsmodelId = statsmodelId;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public boolean isHealthCheck() {
		return healthCheck;
	}

	public void setHealthCheck(boolean healthCheck) {
		this.healthCheck = healthCheck;
	}

	public Integer getFullDataIdentifier() {
		return fullDataIdentifier;
	}

	public void setFullDataIdentifier(Integer fullDataIdentifier) {
		this.fullDataIdentifier = fullDataIdentifier;
	}

	public String getSummaryGrid() {
		return summaryGrid;
	}

	public void setSummaryGrid(String summaryGrid) {
		this.summaryGrid = summaryGrid;
	}

	public String getLinearRegressionResult() {
		return linearRegressionResult;
	}

	public void setLinearRegressionResult(String linearRegressionResult) {
		this.linearRegressionResult = linearRegressionResult;
	}

	public Integer getReadCsvCode() {
		return readCsvCode;
	}

	public void setReadCsvCode(Integer readCsvCode) {
		this.readCsvCode = readCsvCode;
	}

	public Integer getModelAssumptionCode() {
		return modelAssumptionCode;
	}

	public void setModelAssumptionCode(Integer modelAssumptionCode) {
		this.modelAssumptionCode = modelAssumptionCode;
	}

	public String getResultSummary() {
		return resultSummary;
	}

	public void setResultSummary(String resultSummary) {
		this.resultSummary = resultSummary;
	}

	public Integer getDataAggregationCode() {
		return dataAggregationCode;
	}

	public void setDataAggregationCode(Integer dataAggregationCode) {
		this.dataAggregationCode = dataAggregationCode;
	}

	public String getDataTolmport() {
		return dataTolmport;
	}

	public void setDataTolmport(String dataTolmport) {
		this.dataTolmport = dataTolmport;
	}

	public String getRegressionModel() {
		return regressionModel;
	}

	public void setRegressionModel(String regressionModel) {
		this.regressionModel = regressionModel;
	}

	public String getEvaluationModel() {
		return evaluationModel;
	}

	public void setEvaluationModel(String evaluationModel) {
		this.evaluationModel = evaluationModel;
	}

}
