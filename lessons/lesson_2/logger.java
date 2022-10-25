// Использование
// Logger logger = Logger.getLogger()

// Уровни важности
// INFO, DEBUG, ERROR, WARNING и др.

// Вывод ConsoleHandler info = new ConsoleHandler();
// log.addHandler(info);

// Формат вывода: структурированный, абы как*
// XMLFormatter, SimpleFormatter


package lessons.lesson_2;
import java.util.logging.*;

public class logger {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(logger.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        //SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        //ch.setFormatter(sFormat);
        ch.setFormatter(xml);
        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование");
    }
 
}
