package com.angelo.echelonapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.angelo.echelonapp.R;
import com.angelo.echelonapp.classes.User;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {

    private List<User> userList;


    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView nameText;
        public TextView descText;
        public ImageView picImage;

        public MyViewHolder(View view){
            super(view);

            nameText = view.findViewById(R.id.userText);
            descText = view.findViewById(R.id.userDesc);
            picImage = view.findViewById(R.id.userImg);
        }
    }

    public UserAdapter(List<User> userList){
        this.userList = userList;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        final User user = userList.get(position);
        holder.nameText.setText(user.getUserName());
        holder.descText.setText(user.getUserDesc());
        holder.picImage.setImageResource(user.getUserPic());

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}
