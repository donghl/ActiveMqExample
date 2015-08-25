/**   
* @Description: TODO
* @author donghl 
* @date 2015年8月20日 上午8:37:00 
* @version V1.0.0.0
*/
package example;

import javax.jms.JMSException;

/**
 * @author donghl
 *
 */
public class Snippet {
	public static void main(String[] args) throws JMSException {

		ConnFactory cf = new ConnFactory();

		Consumer consumer1 = new Consumer(cf.createConnection(), "Queue1", "Consumer1");
		Consumer consumer2 = new Consumer(cf.createConnection(), "Queue1", "Consumer2");
		Consumer2 consumer3 = new Consumer2(cf.createConnection(), "Queue1", "Consumer3");

		consumer1.start();
		consumer2.start();
		consumer3.start();

		consumer1.receive();
		consumer2.receive();
	}
}
