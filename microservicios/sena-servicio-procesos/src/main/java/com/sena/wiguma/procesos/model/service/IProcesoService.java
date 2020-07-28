package com.sena.wiguma.procesos.model.service;

import com.sena.wiguma.procesos.model.entity.Proceso;
import com.sena.wiguma.procesos.model.entity.ProcesoFilter;

public interface IProcesoService {
	
	public Proceso save(Proceso proceso);
	
	public Proceso saveWithFilter(ProcesoFilter filter) throws Exception;

}
