package com.sbnz.pestdeterminatorapp.dto;

import java.util.List;

import com.sbnz.pestdeterminatorapp.model.Diagnosis;

public class ReportInputDTO {
	
	private List<Diagnosis> pestHistory;

	public List<Diagnosis> getPestHistory() {
		return pestHistory;
	}

	public void setPestHistory(List<Diagnosis> pestHistory) {
		this.pestHistory = pestHistory;
	}
}
