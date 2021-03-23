package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class ModelManager implements Model
{
  private ArrayList<String> log;
  private PropertyChangeSupport propertyChangeSupport;
  private UserList userList;

  public ModelManager()
  {
    this.log = new ArrayList<>();
    this.userList = new UserList();
    this.propertyChangeSupport = new PropertyChangeSupport(this);
  }

  @Override public UserList getAllUsers()
  {
    return userList;
  }

  @Override public void addLog(String log1)
  {
    log.add(log1);
    propertyChangeSupport.firePropertyChange("Log",null,log);
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
