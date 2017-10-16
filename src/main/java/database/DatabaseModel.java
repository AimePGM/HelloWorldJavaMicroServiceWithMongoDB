package database;

import org.springframework.context.ApplicationContext;

public interface DatabaseModel {
	public void run();
	public ApplicationContext getContext();
}
