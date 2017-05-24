package test.conditional;

/**
 * Created by yangjianzhou on 17-5-16.
 */
public class WindowsListService implements ListService {

    @Override
    public String getListCmd() {
        return "dir";
    }
}
