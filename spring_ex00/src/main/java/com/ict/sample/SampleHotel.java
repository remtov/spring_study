package com.ict.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Component
@ToString
@Getter
@AllArgsConstructor // 특정생성자일경우 All대신 Required 를 쓴다.+// 이게 아래 생성자 로직이 필요없도록 하는 어노테이션이다.
public class SampleHotel {
//묵시적 생성자주입 //스프링 4.3 이후부터

	// 여러변수중 특정 변수에만 생성자 작성을 원한다면 @NonNull 을 붙여준다.
	private Chef chef;

	/*
	 * public SampleHotel(Chef chef) { // 생성자 선언후 셰프 주입하도록 설정되었지만 오토와이어드가 없다. 하지만
	 * 처리되고 있는 것이다. this.chef = chef; }
	 */

}
