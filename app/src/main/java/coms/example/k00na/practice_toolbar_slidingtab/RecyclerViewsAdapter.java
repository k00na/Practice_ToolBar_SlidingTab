package coms.example.k00na.practice_toolbar_slidingtab;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by k00na on 5.8.2015.
 */
class RecyclerViewsAdapter extends RecyclerView.Adapter<CardItem>{

    private CardItem cardItem;
    int[] mList;
    private Context mContext;
    List<Person> persons = Collections.emptyList();
    private LayoutInflater inflater;

    private ArrayList<String> arrayNames = new ArrayList<String>();


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

    public RecyclerViewsAdapter(Context context, List<Person> data){

        this.mContext = context;
        inflater = LayoutInflater.from(mContext);
        this.persons = data;
    }


    @Override
    public CardItem onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = inflater.inflate(R.layout.cardview_layout, viewGroup, false);

        CardItem cardHolder = new CardItem(v);

        return cardHolder;
    }

    @Override
    public void onBindViewHolder(CardItem cardItem, int i) {


        cardItem.personImage.setImageResource(persons.get(i).getImgRes());
        cardItem.personName.setText(persons.get(i).getName());

    }

    @Override
    public int getItemCount() {
        return persons.size();
    }


    public void addStuff(String name){

        arrayNames.add(name);
}
}
