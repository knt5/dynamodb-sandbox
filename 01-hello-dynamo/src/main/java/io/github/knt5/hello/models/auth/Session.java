package io.github.knt5.hello.models.auth;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Session {
	private String id;
	private String userId;
	private String lastTouchTime;
}
