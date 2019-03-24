package com.gpeduVIPWork.day05.delegate;

/**
 * Boss给项目经理下达命令
 */
public class Boss {
    public void command(String command,Leader leader){
        leader.doing(command);
    }
}
