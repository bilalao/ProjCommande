package com.ismo.com.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ismo.com.entities.Region;
import com.ismo.com.entities.Representant;
import com.ismo.com.metier.IMetier;

@ManagedBean
@Component
public class BeanRegion {

	@Autowired
	IMetier<Region> metierRegion;
	
	public List<Region> getListRegions() {
		return metierRegion.findAll();
	}
}
