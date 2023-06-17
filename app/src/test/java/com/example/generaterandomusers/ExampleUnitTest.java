package com.example.generaterandomusers;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.generaterandomusers.model.Address;
import com.example.generaterandomusers.model.User;
import com.example.generaterandomusers.network.CrudUserApi;
import com.example.generaterandomusers.network.CrudUserApiService;
import com.example.generaterandomusers.network.RandomUsersApi;
import com.example.generaterandomusers.network.RandomUsersApiService;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getPeopleGenerateUsers() throws IOException {
        RandomUsersApi randomUsersApi = new RandomUsersApi();
        RandomUsersApiService randomUsersApiService = randomUsersApi.createRandomUsersApi();
        Call<List<User>> call = randomUsersApiService.fetchUser();
        List<User> users = call.execute().body();
        assertNotNull(users);
        assertFalse(users.isEmpty());
        System.out.println(new Gson().toJson(users));
    }

    @Test
    public void createUsers() throws IOException {
        CrudUserApi crudUserApi = new CrudUserApi();
        CrudUserApiService crudUserApiService = crudUserApi.crudUserApiService();
        Address address = new Address("Kothapeta", "Nandyal", "Andhra pradesh",
                "India", "zip", 9089, "9999999999",
                "Mahanandi", "+91");
        User user = new User("Hareesh", 23, "Android developer", 191731250,
                6543, "5w8Hf57", false,
                false, 182, 95.00f, "Black", "kahsfshns.com",
                "male", true, "B+ve", "Hareesh", 185.0f,
                "Hindhu", address, "10-07-2000",70.0f );
        Call<User> listCall = crudUserApiService.createUser(user);
        User users = listCall.execute().body();
        assertNotNull(users);
        System.out.println(new Gson().toJson(users));
    }

    @Test
    public void getUsers() throws IOException {
        CrudUserApi crudUserApi = new CrudUserApi();
        CrudUserApiService crudUserApiService = crudUserApi.crudUserApiService();
        Call<List<User>> listCall = crudUserApiService.fetchUsers();
        List<User> userList = listCall.execute().body();
        assertNotNull(userList);
        assertFalse(userList.isEmpty());
        System.out.println(new Gson().toJson(userList));
    }

    @Test
    public void deleteUser() throws IOException {
        CrudUserApi crudUserApi = new CrudUserApi();
        CrudUserApiService crudUserApiService = crudUserApi.crudUserApiService();
        Call<Void> call = crudUserApiService.deleteUser("648c1784c632b703e8304930");
        call.execute();
    }
}