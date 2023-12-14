package encapsulation;

public class Facebook {
    private String user_name;//r/w
    private int user_id;//r
    private long password;//r

    public String getUser_name(){
        return user_name;
    }
    public void setUser_name (String user_name){
        this.user_name=user_name;
    }
    public int getUser_id(){
        return user_id;
    }
    public long getPassword(){
        return password;
    }
    public static void main(String[] args) {
        Facebook f= new Facebook();
        System.out.println(f.user_name);
        f.setUser_name("MATHI");
        System.out.println(f.getUser_name());
        System.out.println(f.user_id);
        System.out.println(f.password);
    }
}
