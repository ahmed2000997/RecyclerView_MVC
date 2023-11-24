package com.amigos.recyclerview_mvc;

import android.app.LauncherActivity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyviewHolder extends RecyclerView.ViewHolder  {
    ImageView img;
    TextView email,name;
    Context MainActivity;
    public MyviewHolder(@NonNull View itemView) {
        super(itemView);

        img=itemView.findViewById(R.id.image);
        email=itemView.findViewById(R.id.EMAIL);
        name=itemView.findViewById(R.id.name);
    }

}
