package model;

import java.util.ArrayList;
import java.util.Random;

public class UserList
{
  private ArrayList<User> users;

  public UserList()
  {
    this.users = new ArrayList<>();
  }

  public ArrayList<User> getUsers()
  {
    return users;
  }

  public void addUser(String name)
  {
    User user = new User(name);
    users.add(user);
  }

  public void addUser()
  {
    User user = new User();
    users.add(user);
  }

  
}

