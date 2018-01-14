package com.leeson.portal.core.model;

import java.io.Serializable;
import java.util.HashMap;

public class WeixinOpenIDMap
  implements Serializable
{
  private static final long serialVersionUID = 5220960469752563771L;
  private HashMap<String, String> weixinOpenIDMap = new HashMap();

  private static WeixinOpenIDMap instance = new WeixinOpenIDMap();

  public static WeixinOpenIDMap getInstance()
  {
    return instance;
  }

  public HashMap<String, String> getWeixinOpenIDMap() {
    return this.weixinOpenIDMap;
  }

  public void setWeixinOpenIDMap(HashMap<String, String> weixinOpenIDMap) {
    this.weixinOpenIDMap = weixinOpenIDMap;
  }
}

/* Location:           C:\Users\Thinkpad\Desktop\Tool\jd-gui\jd-gui\spring-ops-3.2.4.RELEASE.jar
 * Qualified Name:     com.leeson.portal.core.model.WeixinOpenIDMap
 * JD-Core Version:    0.6.2
 */