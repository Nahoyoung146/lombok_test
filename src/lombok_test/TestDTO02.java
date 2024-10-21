package lombok_test;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // 기본 생성자만 생성, 모든 값을 받아주는 생성자는 따로 생성해야 됨
@AllArgsConstructor
public class TestDTO02 {
	private String name, addr, tel;
}