package dbService.dataSets;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UsersDataSet {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "login", unique = true, updatable = false)
    private String login;

    @Column(name = "password", unique = false, updatable = true)
    private String password;

    //Important to Hibernate!
    public UsersDataSet() {
    }

    public UsersDataSet(String login, String password) {
        this.setId(-1);
        this.setLogin(login);
        this.setPassword(password);
    }

    public UsersDataSet(long id, String login, String password) {
        this.setId(id);
        this.setLogin(login);
        this.setPassword(password);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UsersDataSet{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
