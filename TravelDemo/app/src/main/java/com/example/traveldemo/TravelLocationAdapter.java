package com.example.traveldemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class TravelLocationAdapter extends RecyclerView.Adapter<TravelLocationAdapter.TravelLocationViewHolder>{
    private List<TravelLocation>travelLocations;

    public TravelLocationAdapter(List<TravelLocation> travelLocations) {
        this.travelLocations = travelLocations;
    }

    @NonNull
    @Override
    public TravelLocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TravelLocationViewHolder(LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_container_location,parent,false
        ));
    }

    @Override
    public void onBindViewHolder(@NonNull TravelLocationViewHolder holder, int position) {
        holder.setLocationData(travelLocations.get(position));

    }

    @Override
    public int getItemCount() {
        return travelLocations.size();
    }

    static  class TravelLocationViewHolder extends RecyclerView.ViewHolder {

        private KenBurnsView kenBurnsView;
        private TextView textTitle,textLocation,textStarRating;
        public TravelLocationViewHolder(@NonNull View itemView) {
            super(itemView);
            kenBurnsView=itemView.findViewById(R.id.kbvLocation);
            textTitle=itemView.findViewById(R.id.textTitle);
            textLocation=itemView.findViewById(R.id.textLocation);
            textStarRating=itemView.findViewById(R.id.textStarRating);

        }
        void setLocationData(TravelLocation travelLocation)
        {
            Picasso.get().load(travelLocation.imageUrl).into(kenBurnsView);
            textTitle.setText(travelLocation.title);
            textLocation.setText(travelLocation.location);
            textStarRating.setText(String.valueOf(travelLocation.starRating));
        }
    }
}
