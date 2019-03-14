package com.gpeduVIPWork.day03.prototype.deep;

import java.io.Serializable;

/**
 * 创建引用类型，金箍棒
 */
public class JinGuBang implements Serializable {
    private float h = 100;
    private float d = 10;
    public void big(){
        this.h *=2;
        this.d *=2;
    }
    public void small(){
        this.h /=2;
        this.d/=2;
    }
}
