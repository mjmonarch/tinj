package accessControl_p1;

import java.util.*;

class Connection {
	Connection () {
		System.out.println("Connection is created!");
	}
}


public class ConnectonManager {

private static Random rand = new Random();
public static int count = rand.nextInt(10);
static Connection[] cm = new Connection[count];
static int pos = 0;

//intiating a connection array
static { 
System.out.println("Inside array initialization. Number of connection is " + count);
for (int j=0; j<count; j++) 
	cm[j] = new Connection();
}

private ConnectonManager() {}

public static Connection getConnection() {
	if (pos < count)
		return cm[pos++];
	else
		return null;
}

}
