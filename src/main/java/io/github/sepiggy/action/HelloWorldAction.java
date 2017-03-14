package io.github.sepiggy.action;

/**
 * @formatter:off
 * HelloWorldAction.java
 * 2017-03-14 15:44:49 
 * @author JiaMingsheng
 * @formatter:on
 */
public class HelloWorldAction {

  private String message;

  public String execute() {
    message = "我的第一个struts2应用";
    return "success";
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
