package coms.example.k00na.practice_toolbar_slidingtab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by k00na on 5.8.2015.
 */
class CardItem extends RecyclerView.ViewHolder{

    public ImageView personImage;
    public TextView personName;

    public CardItem(View itemView) {
        super(itemView);
        personImage = (ImageView)itemView.findViewById(R.id.cardview_imageview_id);
        personName =(TextView)itemView.findViewById(R.id.cardview_textview_id);
    }
}