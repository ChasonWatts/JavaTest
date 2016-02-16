package com.wc.proxy.staticProxy;

/**
 * 
 * @Description: 定义潘金莲是什么样的人
 * @author:<a href="mailto:chao.wen@haiwan.com">chao.wen</a>
 * @since: chao.wen-2016年2月16日
 * @version: 0.0.1
 *
 */
public class PanJinLian implements KindWoman {

	@Override  
    public void happyWithMan() {  
        System.out.println("潘金莲和男人在做那个...");  
    }  
  
    @Override  
    public void makeEyesWithMan() {  
        System.out.println("潘金莲抛媚眼...");  
    }

}
