package com.example.cek;
/**
 Ardetian Nurdika
 10116119
 AKB-3

 Tanggal Pengumpulan : 14 - 8 - 2019
 **/

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddFriends extends Fragment {
    public static String KEY_ACTIVITY = "msg_activity";
    EditText masuk;
    Button btn;

    View myView;
    public AddFriends() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myView=inflater.inflate(R.layout.fragment_add_friends, container, false);

        return inflater.inflate(R.layout.fragment_add_friends, container, false);
    }

}
