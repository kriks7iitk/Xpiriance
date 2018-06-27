package com.xpiriance.xpiriancepack;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xpiriance.xpiriancepack.model.post_items;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<post_items> postItems ;
    private Context context;

    public MyAdapter(List<post_items> postItems, Context context) {
        this.postItems = postItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_items, parent , false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        post_items post_item = postItems.get(position);

        holder.PAname.setText(post_item.getPAname());
        holder.PAdesignation.setText(post_item.getPAdesignation());
        holder.APname.setText(post_item.getAPname());
        holder.APdesignation.setText(post_item.getAPdesignation());
        holder.QuestionAsked.setText(post_item.getQuestionAsked());
        holder.AnswerGiven.setText(post_item.getAnswerGiven());


    }

    @Override
    public int getItemCount() {
        return postItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        public TextView PAname;
        public TextView PAdesignation;
        public TextView QuestionAsked;
        public TextView APname;
        public TextView APdesignation;
        public TextView AnswerGiven;



        public ViewHolder(View itemView) {
            super(itemView);

            PAname = (TextView) itemView.findViewById(R.id.PAname);
            PAdesignation = (TextView) itemView.findViewById(R.id.PAdesignation);
            QuestionAsked = (TextView) itemView.findViewById(R.id.QuestionAsked);
            APname = (TextView) itemView.findViewById(R.id.APname);
            APdesignation = (TextView) itemView.findViewById(R.id.APdesignation);
            AnswerGiven = (TextView) itemView.findViewById(R.id.AnswerGiven);

        }
    }

}
