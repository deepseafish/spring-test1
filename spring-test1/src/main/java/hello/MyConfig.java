package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyConfig {
	@Value("${randomBytes}")
	private String randomBytes;

	@Value("${randomInt}")
	private int randomInt;

	@Value("${randomLong}")
	private long randomLong;

	@Value("${name}")
	private String name;

	@Value("${env}")
	private String env;

	public String getRandomBytes() {
		return randomBytes;
	}

	public void setRandomBytes(String randomBytes) {
		this.randomBytes = randomBytes;
	}

	public int getRandomInt() {
		return randomInt;
	}

	public void setRandomInt(int randomInt) {
		this.randomInt = randomInt;
	}

	public long getRandomLong() {
		return randomLong;
	}

	public void setRandomLong(long randomLong) {
		this.randomLong = randomLong;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

}
