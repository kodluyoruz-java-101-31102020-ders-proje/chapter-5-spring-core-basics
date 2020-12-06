package com.spring.basics.dto;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component etiketi ile bu sınıfı Spring Application Context'e dahil ediyoruz!
@Component
// Salary sınıfından her defasında bir nesne inject ederseniz, 
// Spring Application Context her dependency injection için yeni bir Salary nesnesi oluşturur.
@Scope("prototype")
public class Salary {

	private double value;
	private Date createDate;

	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
