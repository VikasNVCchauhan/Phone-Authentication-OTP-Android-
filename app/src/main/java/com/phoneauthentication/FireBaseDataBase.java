package com.phoneauthentication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class FireBaseDataBase extends AppCompatActivity {
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("Student");

 //       insert();
        update();
        delete();
        viewAllData();

    }

    private void viewAllData() {
        ArrayList<String> number=new ArrayList<String>();

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot ds:dataSnapshot.getChildren())
                {

                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
   //     User user=new User();
    }

    private void delete() {
    }

    private void update() {
    }

    private void insert(String mobile,String password) {

        String phones=mobile;
        String passwords=password;

        User user=new User(phones,passwords);

        databaseReference.child(mobile).setValue(user);
        Toast.makeText(this, "values Inserted", Toast.LENGTH_SHORT).show();
    }

}
