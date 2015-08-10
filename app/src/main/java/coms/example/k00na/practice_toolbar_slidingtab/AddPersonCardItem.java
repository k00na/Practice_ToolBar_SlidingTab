package coms.example.k00na.practice_toolbar_slidingtab;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by niggor on 10.8.2015.
 */
public class AddPersonCardItem extends RecyclerView.ViewHolder {

    public CardView cardView;
    public ImageView image;

    public AddPersonCardItem(View itemView) {
        super(itemView);

        cardView = (CardView)itemView.findViewById(R.id.card_view_id);
        image = (ImageView)itemView.findViewById(R.id.card_views_imageID);

    }

    public void setImage(ImageView image) {
        this.image = image;
    }
}
