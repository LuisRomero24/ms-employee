package com.bootcamp.msemployee.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "employee")
@Getter
@Setter

public class MEmployee {

	public MEmployee(int codEmp, String tipDocEmp, int numDocEmp, String nomEmp, String apeEmp, String dirEmp,
			String disEmp) {
		super();
		this.codEmp = codEmp;
		this.tipDocEmp = tipDocEmp;
		this.numDocEmp = numDocEmp;
		this.nomEmp = nomEmp;
		this.apeEmp = apeEmp;
		this.dirEmp = dirEmp;
		this.disEmp = disEmp;
	}

	public int getCodEmp() {
		return codEmp;
	}

	public void setCodEmp(int codEmp) {
		this.codEmp = codEmp;
	}

	public String getTipDocEmp() {
		return tipDocEmp;
	}

	public void setTipDocEmp(String tipDocEmp) {
		this.tipDocEmp = tipDocEmp;
	}

	public int getNumDocEmp() {
		return numDocEmp;
	}

	public void setNumDocEmp(int numDocEmp) {
		this.numDocEmp = numDocEmp;
	}

	public String getNomEmp() {
		return nomEmp;
	}

	public void setNomEmp(String nomEmp) {
		this.nomEmp = nomEmp;
	}

	public String getApeEmp() {
		return apeEmp;
	}

	public void setApeEmp(String apeEmp) {
		this.apeEmp = apeEmp;
	}

	public String getDirEmp() {
		return dirEmp;
	}

	public void setDirEmp(String dirEmp) {
		this.dirEmp = dirEmp;
	}

	public String getDisEmp() {
		return disEmp;
	}

	public void setDisEmp(String disEmp) {
		this.disEmp = disEmp;
	}

	@Id
	private Integer codEmp;
	private String tipDocEmp;
	private Integer numDocEmp;
	private String nomEmp;
	private String apeEmp;
	private String dirEmp;
	private String disEmp;

}
