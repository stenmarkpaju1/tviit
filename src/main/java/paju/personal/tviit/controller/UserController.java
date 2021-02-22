package paju.personal.tviit.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import paju.personal.dto.UserDto;
import paju.personal.tviit.persistence.model.User;
import paju.personal.tviit.persistence.repository.UserRepository;
import paju.personal.tviit.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Tag(name = "User Controller")
public class UserController {

    private final UserService userService;

    @CrossOrigin
    @Operation(summary = "Get all users")
    @GetMapping("/api/users/getAll")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @CrossOrigin
    @Operation(summary = "Find user details by username")
    @GetMapping("/api/users/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable("username") String username){
        return ResponseEntity.ok(userService.getUserByUsername(username));
    }

    @CrossOrigin
    @Operation(summary = "Create new user")
    @PostMapping("/api/users/create")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto user){
        return ResponseEntity.ok(userService.createNewUser(user));
    }

    @CrossOrigin
    @Operation(summary = "Delete user")
    @PostMapping("/api/users/delete")
    public ResponseEntity<User> deleteUser(@PathVariable("username") String username){
        return ResponseEntity.ok(userService.deleteUser(username));
    }


}
