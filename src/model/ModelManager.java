package model;

import mediator.MessageClientHandler;
import utility.observer.subject.NamedPropertyChangeSubject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ModelManager implements Model
{
  private ArrayList<String> log;
  private PropertyChangeSupport propertyChangeSupport;
  private UserList userList;
  private ArrayList<MessageClientHandler> OnlineUsers;
  private File file;

  public ModelManager()
  {
    this.log = new ArrayList<>();
    this.userList = new UserList();
    this.propertyChangeSupport = new PropertyChangeSupport(this);
    this.OnlineUsers = new ArrayList<>();

    this.file = new File("ChatLogs.txt");
    try {
      if (file.createNewFile()) {
        System.out.println("File created: " + file.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

  }

  @Override public UserList getAllUsers()
  {
    return userList;
  }

  @Override public void addLog(String log1) throws IOException
  {
    log.add(log1);
    propertyChangeSupport.firePropertyChange("Log",null,log);
    System.out.println(log1.toString());

      FileWriter out = new FileWriter("filename.txt");
      out.write(log1.toString());
      System.out.println("Successfully saved log to file");
  }

  @Override public ArrayList<String> getLog()
  {
    return log;
  }

  @Override public int getConnectedUsersInt()
  {
    return userList.size();
  }

  @Override public ArrayList<String> getConnectedUsers()
  {
    return null;
  }


  @Override public void addUser(String name)
  {
    getAllUsers().addUser(name);
  }

  @Override public void removeUser(String name)
  {
    getAllUsers().removeUser(name);
  }

  @Override public void addListener(String propertyName,
      PropertyChangeListener listener)
  {
    propertyChangeSupport.addPropertyChangeListener(propertyName,listener);
  }

  @Override public void removeListener(String propertyName,
      PropertyChangeListener listener)
  {
    propertyChangeSupport.removePropertyChangeListener(propertyName, listener);

  }
}



