package model;

import utility.observer.subject.NamedPropertyChangeSubject;

import java.util.ArrayList;

public interface Model extends NamedPropertyChangeSubject
{
  UserList getAllUsers();
  void addLog(String log);
  ArrayList<String> getLog();
  int getConnectedUsersInt();
  ArrayList<String> getConnectedUsers();
  UserList getUserList();
}