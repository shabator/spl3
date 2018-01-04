package bgu.spl181.net.srv.bidi;

import bgu.spl181.net.api.bidi.Connections;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class BlockBusterProtocol extends USTBP {
    public static void main(String args[]){
        JsonReader reader = null;
        JsonReader reader2 = null;

        try {
            reader = new JsonReader(new FileReader(args[0]));
            reader2= new JsonReader(new FileReader(args[1]));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
    JsonObject obj = gson.fromJson(reader, JsonObject.class);
    JsonObject obj2 = gson.fromJson(reader2, JsonObject.class);

        Movie[] movies = gson.fromJson(obj ,Movie[].class );
        User[] users = gson.fromJson(obj2 ,User[].class );




    }
    @Override
    public void start(int connectionId, Connections connections) {

    }

    @Override
    public void process(Object message) {

    }

    @Override
    public boolean shouldTerminate() {
        return false;
    }

    @Override
    public void logIn() {

    }

    @Override
    public void signOut() {

    }


    @Override
    public void register() {

    }

    public void request(){

    }
}
