package model;

import utility.observer.subject.NamedPropertyChangeSubject;

public interface Model extends NamedPropertyChangeSubject
{
  UserList getAllUsers();
  void addLog(String log);
}
