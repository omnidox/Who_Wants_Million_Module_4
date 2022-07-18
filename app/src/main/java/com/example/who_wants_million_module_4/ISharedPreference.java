package com.example.who_wants_million_module_4;

//An interface for shared preferences, considering using this to help implement both encrypted shared preferences
// and normal shared preferences with future projects.
public interface ISharedPreference {
    String getString(String name, String value);

    void putString(String name, String value);

    int getInt(String name, Integer value);

    void putInt(String name, Integer value);

    void remove(String name);

}
