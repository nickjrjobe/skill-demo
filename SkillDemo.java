public class SkillDemo{
    public static boolean emailChecker(String email){
        String domain = email.substring(email.length()-4,email.length());
        return domain.equals(".edu");
    }
}
