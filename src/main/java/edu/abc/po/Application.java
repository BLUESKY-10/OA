package edu.abc.po;

import java.util.Date;

public class Application {

    private Long id;

    private String application;

    private String theme;

    private String content;

    private String approver;

    private Date staTime;

    private Date apprTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public Date getStaTime() {
        return staTime;
    }

    public void setStaTime(Date staTime) {
        this.staTime = staTime;
    }

    public Date getApprTime() {
        return apprTime;
    }

    public void setApprTime(Date apprTime) {
        this.apprTime = apprTime;
    }

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", application='" + application + '\'' +
                ", theme='" + theme + '\'' +
                ", content='" + content + '\'' +
                ", approver='" + approver + '\'' +
                ", staTime=" + staTime +
                ", apprTime=" + apprTime +
                '}';
    }
}
