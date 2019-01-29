package Riddles;

import java.io.IOException;

public interface Riddle
{
    void solve() throws IOException;
    void setOnLog(OnLog onlog);

}
