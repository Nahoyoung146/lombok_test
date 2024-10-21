package lombok_test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor // 기본 생성자 생성 public TestDTO() {}
@AllArgsConstructor // 모든 매개변수를 받아주는 생성자 생성 public TestDTO(String name, int age) {this.name = name;
					// this.age=age;}
public class TestDTO {
	private String name;
	private int age;
}