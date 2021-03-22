package model;

import java.util.Random;

public class User
{
  private String name;

  public User()
  {
    Random random = new Random();
    this.name = "User" + random.nextInt(100);
  }

  public void setName(String name)
  {
    this.name = name;
  }

  @Override public String toString()
  {
    return "User{" + "name='" + name + '\'' + '}';
  }
}