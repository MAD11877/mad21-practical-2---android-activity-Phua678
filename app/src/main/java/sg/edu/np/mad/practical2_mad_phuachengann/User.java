package sg.edu.np.mad.practical2_mad_phuachengann;

import androidx.annotation.NonNull;

public class User
{
    public String name;
    public String description;
    public int id;
    public static boolean followed;

    public User(String Name, String Des, int Id, boolean Fol) {

        name = Name;
        description = Des;
        id = Id;
        followed = Fol;
    }
}
