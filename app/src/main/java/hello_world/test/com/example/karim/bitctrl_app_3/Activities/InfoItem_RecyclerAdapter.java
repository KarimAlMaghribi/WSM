package hello_world.test.com.example.karim.bitctrl_app_3.Activities;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import hello_world.test.com.example.karim.bitctrl_app_3.R;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Recycler_Info_Item;

public class InfoItem_RecyclerAdapter extends RecyclerView.Adapter<InfoItem_RecyclerAdapter.Item_ViewHolder> {

    private ArrayList<Recycler_Info_Item> recycler_info_items;

    public static class Item_ViewHolder extends RecyclerView.ViewHolder{

        public TextView mTextView1;
        public TextView mTextView2;
        public ImageView mImageView;

        public Item_ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.info_next_id);
            mTextView1 = itemView.findViewById(R.id.info_time_id);
            mTextView2 = itemView.findViewById(R.id.info_number_id);
        }
    }

    public InfoItem_RecyclerAdapter(ArrayList<Recycler_Info_Item> itemsList){
        recycler_info_items = itemsList;
    }


    @NonNull
    @Override
    public Item_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.info_item, parent, false);
        Item_ViewHolder item_viewHolder = new Item_ViewHolder(view);

        return item_viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Item_ViewHolder holder, int position) {
        Recycler_Info_Item currentItem = recycler_info_items.get(position);

        holder.mImageView.setImageResource(currentItem.getPhoto());
        holder.mTextView1.setText(currentItem.getDate());
        holder.mTextView2.setText("" + currentItem.getNumber());

    }

    @Override
    public int getItemCount() {
        return recycler_info_items.size();
    }



}
