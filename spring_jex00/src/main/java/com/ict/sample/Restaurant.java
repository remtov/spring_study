package com.ict.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {

	@Setter(onMethod_=@Autowired) /*레스토랑은 쉐프가 필요하다는 의존성관계 표시*/
	private Chef chef;
}
