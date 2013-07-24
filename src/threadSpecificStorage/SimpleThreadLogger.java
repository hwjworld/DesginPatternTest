package threadSpecificStorage;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleThreadLogger {

	private static final ThreadLocal threadLocal = new ThreadLocal();

	public static void log(String msg) {
		getThreadLogger().log(Level.INFO, msg);
	}

	private static Logger getThreadLogger() {
		Logger logger = (Logger) threadLocal.get();

		if (logger == null) {
			try {
				logger = Logger.getLogger(Thread.currentThread().getName());
				// Logger 预设是在主控台输出
				// 我们加入一个档案输出的Handler
				// 它会输出XML的记录文件
				logger.addHandler(new FileHandler(Thread.currentThread()
						.getName() + ".log"));
			} catch (IOException e) {
			}

			threadLocal.set(logger);
		}

		return logger;
	}
}
