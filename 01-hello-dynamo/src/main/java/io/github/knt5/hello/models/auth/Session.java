package io.github.knt5.hello.models.auth;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Session {
	private String id;
	private String userId;
	private String lastTouchedTime;
}
