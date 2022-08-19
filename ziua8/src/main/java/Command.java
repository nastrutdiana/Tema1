@ActiveRecord(tabelName = "orders", primaryKeyName = "id")
public class Command extends Entity{
    int id;
    String description;
    String user_id;

    public Command() {
    }

    public Command(int id, String description, String user_id) {
        this.id = id;
        this.description = description;
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Command{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", user_id='" + user_id + '\'' +
                '}';
    }
}
