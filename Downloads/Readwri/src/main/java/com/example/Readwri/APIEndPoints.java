package com.example.Readwri;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class APIEndPoints
{
    Map<Integer,User>userDB=new HashMap<>();
    @GetMapping("/GetWhetherDetails")
    public String GetWhetherInfo()
    {
        return "Todya's Whether is fine";
    }

    @GetMapping("/calculateSum")
    public String calculateSum(@RequestParam("n1") Integer n1, @RequestParam("n2") Integer n2)
    {
        return "The Sum of "+n1+" and "+n2 +" is "+(n1+n2);
    }

    @PostMapping("/signUpUser")
    public String signUpUser(@RequestBody User user)
    {
        Integer userId=user.getUserId();
        userDB.put(userId,user);

        return "The user with userId:"+userId+" has been added to the Database Successfully!!";
    }

    @GetMapping("/getUserByUserId")
    public User getUser(@RequestParam("userId") Integer userId)
    {
        User user=userDB.getOrDefault(userId,new User());
        return user;
    }


    @GetMapping("/getListOfPeople/{country}")

    public List<User> getListOfPeople(@PathVariable("country") String country)
    {

        List<User>list=new ArrayList<>();
        for(User user:userDB.values())
        {
            if(user.getCountry().equals(country))list.add(user);
        }
        return list;
    }

    @PutMapping("/updateUserInfo")
    public String updateUser(@RequestBody User upadatedUserDetails,@RequestParam("userId") Integer Id)
    {
        Integer userId=Id;
        userDB.put(userId,upadatedUserDetails);

        return "The Information of user with "+userId+" has been Updated";
    }

    @DeleteMapping("/deleteUser/{name}")

    public String deleteUserByName(@PathVariable("name") String name){

        for(Integer key:userDB.keySet())
        {
            User user=userDB.get(key);
            if(user.getName().equals(name))userDB.remove(key);
        }

        return "Users With userName "+name+" have been Removed";
    }
}
