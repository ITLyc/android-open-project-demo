package dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table NOTE.
 */
public class UserInfo {

    private Long id;
    /** Not-null value. */
    private String name;
    private String age;
    private java.util.Date date;

    public UserInfo() {
    }

    public UserInfo(Long id) {
        this.id = id;
    }

    public UserInfo(Long id, String name, String age, java.util.Date date) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getName() {
        return name;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

}
