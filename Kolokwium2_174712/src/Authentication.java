public interface Authentication {
    public abstract boolean login(String username, String password);
    public abstract void logout();
    public abstract boolean resetPassword(String username, String oldPassword, String newPassword);
}

class UserAuthentication implements Authentication {

    @Override
    public boolean login(String username, String password) {
        return username.equals("user") && password.equals("user");
    }
    @Override
    public void logout() {
        System.out.println("User logged out");
    }
    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        return username.equals("user") && oldPassword.equals("user") && newPassword != null;
    }
}

class AdminAuthentication implements Authentication {

    @Override
    public boolean login(String username, String password) {
        return username.equals("admin") && password.equals("admin");
    }
    @Override
    public void logout() {
        System.out.println("Admin logged out");
    }
    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        return username.equals("admin") && oldPassword.equals("admin") && newPassword != null;
    }
}
