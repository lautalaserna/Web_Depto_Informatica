package com.example.informatica.user;

import java.util.HashMap;

public class RolesWrapper {
	boolean autoridades = false;
	boolean calendario = false;
	boolean elecciones = false;
	boolean graduados = false;

	boolean investigacion = false;
	boolean novedades = false;
	boolean pps = false;
	boolean trabajosfinales = false;

	boolean areas = false;
	boolean asignaturas = false;
	boolean cargos = false;
	boolean carreras = false;

	boolean correlativas = false;
	boolean dedicacion = false;
	boolean docentes = false;
	boolean optativas = false;

	boolean planestudio = false;
	boolean tipocargo = false;
	boolean tipocarrera = false;
	
	public RolesWrapper() {
		
	}
	
	public HashMap<String, Boolean> getRolesMap(){
		HashMap<String, Boolean> map = new HashMap<String, Boolean>();
		
		
		
		return map;
	}

	public boolean isAutoridades() {
		return autoridades;
	}

	public void setAutoridades(boolean autoridades) {
		this.autoridades = autoridades;
	}

	public boolean isCalendario() {
		return calendario;
	}

	public void setCalendario(boolean calendario) {
		this.calendario = calendario;
	}

	public boolean isElecciones() {
		return elecciones;
	}

	public void setElecciones(boolean elecciones) {
		this.elecciones = elecciones;
	}

	public boolean isGraduados() {
		return graduados;
	}

	public void setGraduados(boolean graduados) {
		this.graduados = graduados;
	}

	public boolean isInvestigacion() {
		return investigacion;
	}

	public void setInvestigacion(boolean investigacion) {
		this.investigacion = investigacion;
	}

	public boolean isNovedades() {
		return novedades;
	}

	public void setNovedades(boolean novedades) {
		this.novedades = novedades;
	}

	public boolean isPps() {
		return pps;
	}

	public void setPps(boolean pps) {
		this.pps = pps;
	}

	public boolean isTrabajosfinales() {
		return trabajosfinales;
	}

	public void setTrabajosfinales(boolean trabajosfinales) {
		this.trabajosfinales = trabajosfinales;
	}

	public boolean isAreas() {
		return areas;
	}

	public void setAreas(boolean areas) {
		this.areas = areas;
	}

	public boolean isAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(boolean asignaturas) {
		this.asignaturas = asignaturas;
	}

	public boolean isCargos() {
		return cargos;
	}

	public void setCargos(boolean cargos) {
		this.cargos = cargos;
	}

	public boolean isCarreras() {
		return carreras;
	}

	public void setCarreras(boolean carreras) {
		this.carreras = carreras;
	}

	public boolean isCorrelativas() {
		return correlativas;
	}

	public void setCorrelativas(boolean correlativas) {
		this.correlativas = correlativas;
	}

	public boolean isDedicacion() {
		return dedicacion;
	}

	public void setDedicacion(boolean dedicacion) {
		this.dedicacion = dedicacion;
	}

	public boolean isDocentes() {
		return docentes;
	}

	public void setDocentes(boolean docentes) {
		this.docentes = docentes;
	}

	public boolean isOptativas() {
		return optativas;
	}

	public void setOptativas(boolean optativas) {
		this.optativas = optativas;
	}

	public boolean isPlanestudio() {
		return planestudio;
	}

	public void setPlanestudio(boolean planestudio) {
		this.planestudio = planestudio;
	}

	public boolean isTipocargo() {
		return tipocargo;
	}

	public void setTipocargo(boolean tipocargo) {
		this.tipocargo = tipocargo;
	}

	public boolean isTipocarrera() {
		return tipocarrera;
	}

	public void setTipocarrera(boolean tipocarrera) {
		this.tipocarrera = tipocarrera;
	}

}
