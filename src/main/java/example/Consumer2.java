package example;
import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

public class Consumer2 implements MessageListener{

	private String name;
	private String dest;
	private Connection conn;
	private MessageConsumer consumer;
	private Session session;	
		
	public Consumer2(Connection conn, String dest, String name){
		this.conn = conn;
		this.dest = dest;
		this.name = name;
	}
	
	public void start() throws JMSException{
		//使用Consumer之前，必须调用conn的start方法建立连接。
		conn.start();
		
		session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);		
		consumer = session.createConsumer(session.createQueue(dest));
		consumer.setMessageListener(this);
	}

	public void onMessage(Message msg) {
		try {
			System.out.println(name + " receive message {" + ((TextMessage)msg).getText() + "}");
		} catch (JMSException e) {		
			e.printStackTrace();
		}
	}
	
}