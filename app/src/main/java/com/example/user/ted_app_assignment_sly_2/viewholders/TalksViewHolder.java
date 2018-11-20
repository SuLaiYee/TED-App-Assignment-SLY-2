package com.example.user.ted_app_assignment_sly_2.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.user.ted_app_assignment_sly_2.Delegate.NewsDelegate;

public class TalksViewHolder extends RecyclerView.ViewHolder {
    NewsDelegate newsDelegate;
    public TalksViewHolder(View itemView, final NewsDelegate newsDelegate) {
        super(itemView);
        this.newsDelegate = newsDelegate;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newsDelegate.onTapTalks();
            }
        });
    }
}
