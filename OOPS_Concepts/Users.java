class Users{
    String userName = "Mikey";
    String userRole = "Admin";
    int userSalary = 1500000;
    public String getUserName(){
        return userName;
    }
    public String getUserRole(){
        return userRole;
    }
    public int getUserSalary(){
        return userSalary;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setUserRole(String userRole){
        this.userRole = userRole;
    }
    public void setUserSalary(int userSalary){
        if(userSalary <= 0){
            System.out.println("Salary must be greater than zero");
        }
        else{
            this.userSalary = userSalary;
        }
    }
}

class UserDetails{
    public static void main(String[] args){
        Users user = new Users();
        System.out.println("User = " + user.getUserName());
        System.out.println("Role = " + user.getUserRole());
        System.out.println("Salary = " + user.getUserSalary());
        user.setUserName("Sudharshan");
        user.setUserSalary(2500000);
        System.out.println("User = " + user.getUserName());
        System.out.println("Salary = " + user.getUserSalary());
    }
}


