package coms.example.k00na.practice_toolbar_slidingtab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by k00na on 5.8.2015.
 */
class RecyclerViewsAdapter extends RecyclerView.Adapter<CardItem>{

    private CardItem cardItem;
    int[] mList;
    private DataClass data = new DataClass();

    public RecyclerViewsAdapter(int tabNum){

        if(tabNum == 0){
            mList = data.getScientists();
        }

        if(tabNum == 1){
            mList = data.getMusicians();
        }

        if(tabNum == 2){
            mList = data.getPoliticians();
        }

    }



    @Override
    public CardItem onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardview_layout, viewGroup, false);

        CardItem cardHolder = new CardItem(v);

        return cardHolder;
    }

    @Override
    public void onBindViewHolder(CardItem cardItem, int i) {

        int imageResource = mList[i];
        cardItem.personImage.setImageResource(imageResource);

    }

    @Override
    public int getItemCount() {
        return mList.length;
    }
}
