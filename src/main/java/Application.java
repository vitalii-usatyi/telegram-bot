import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import com.telebot.bot.Bot;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Application
{
    
    public static final Logger logger = LogManager.getLogger(Application.class);
    public static void main(String[] args)
    {
     logger.info("Application starting...");
     new Bot().serve();
             
    }
}
