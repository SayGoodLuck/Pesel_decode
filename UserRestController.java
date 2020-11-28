package dev.konstantin.controller;

import dev.konstantin.dao.UserServiceDAO;
import dev.konstantin.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api", produces = "application/json")
public class UserRestController {

  @Autowired private static UserServiceDAO userServiceDAO;

  @GetMapping(value = "/{id}")
  public UserInfo getUserById(@PathVariable String id) {
    return userServiceDAO.findByPesel(id);
  }

  @GetMapping()
  public UserInfo getUserByEmail(@PathVariable String email) {
    return userServiceDAO.findByEmail(email);
  }

  @GetMapping()
  public void saveUser(@RequestParam String[] inputData) {
    userServiceDAO.saveUser(inputData[0], inputData[1], inputData[3], inputData[4]);
  }

  @GetMapping(value = "/{id}")
  public UserInfo editUser(@RequestParam String id) {
    return null;
  }

  @GetMapping(value = "/{id}")
  public void deleteUser(@RequestParam String id) {
    userServiceDAO.deleteUser(id);
  }
}
