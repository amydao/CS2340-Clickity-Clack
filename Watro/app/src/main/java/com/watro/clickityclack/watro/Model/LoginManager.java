package com.watro.clickityclack.watro.Model;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.watro.clickityclack.watro.Controller.LoginActivity;
import com.watro.clickityclack.watro.Controller.ReportsActivity;

import java.util.concurrent.Executor;

/**
 * Created by henrysaba on 3/8/17.
 */

public class LoginManager {
    private FirebaseAuth firebaseAuth;

    public LoginManager() {
        firebaseAuth = FirebaseAuth.getInstance();
    }

    public void loginWithFirebase(Activity activity, String email, String password) throws Exception {

        firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(activity, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (!task.isSuccessful()) {
//                            throw new Exception("fhdfg");
                        } else {

                        }
                    }
                });

//        final boolean[] loginSuccess = {true};
//        final String[] exceptionMessage = new String[1];
//        final boolean[] signInAttemptCompleted = {false};
//
//        firebaseAuth.signInWithEmailAndPassword(email, password).
//                addOnCompleteListener(activity, new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//                signInAttemptCompleted[0] = true;
//
//                if (!task.isSuccessful()) {
//                    loginSuccess[0] = false;
//
//                    exceptionMessage[0] = task.getException().getMessage();
//                }
//            }
//        });
//
//        if (!loginSuccess[0] && signInAttemptCompleted[0]) {
//            throw new Exception(exceptionMessage[0]);
//        }
//
//        if (loginSuccess[0] && signInAttemptCompleted[0]) {
//            return true;
//        }
//
//        return false;
    }

}