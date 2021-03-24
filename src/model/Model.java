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
<<<<<<< HEAD
  ArrayList<String> getMessages(String activeUserName);
  String getName();
  int getSizeOfUsers();
  void sendMessage(String userName, String message);
  void addUser(String userName);
  void removeUser(String userName);
}
=======
  UserList getUserList();
}
>>>>>>> 3cdab78fa7202f1b26a4315d6fe203a59a6121f9
