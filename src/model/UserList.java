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
}

