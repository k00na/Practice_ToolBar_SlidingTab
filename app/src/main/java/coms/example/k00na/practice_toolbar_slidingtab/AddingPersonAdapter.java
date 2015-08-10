package coms.example.k00na.practice_toolbar_slidingtab;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by niggor on 10.8.2015.
 */
public class AddingPersonAdapter extends RecyclerView.Adapter<AddPersonCardItem> {

    private LayoutInflater mInflater;
    private int[] allImgResources = DataClass.getAllImgRes();


    public AddingPersonAdapter(Context context){

        mInflater = LayoutInflater.from(context);

    }



    @Override
    public AddPersonCardItem onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = mInflater.inflate(R.layout.cardview_add_person, parent, false);

        AddPersonCardItem addPersonCardItem = new AddPersonCardItem(v);


        return addPersonCardItem;
    }

    @Override
    public void onBindViewHolder(AddPersonCardItem holder, int position) {

        holder.image.setImageResource(allImgResources[position]);
        

    }

    @Override
    public int getItemCount() {
        return allImgResources.length;
    }
}
