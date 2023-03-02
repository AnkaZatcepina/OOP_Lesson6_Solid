public class View implements ViewInterface{
    
    public void report(User user){
		System.out.println("Report for user: " + user.getName());
	}

    public void showSaved(User user){
		System.out.println("Save user: " + user.getName());
	}
}
