package test.conditional;

/**
 * Created by yangjianzhou on 17-5-16.
 */
public class LinuxListService implements ListService{

    @Override
    public String getListCmd() {
        return "ls";
    }
}
