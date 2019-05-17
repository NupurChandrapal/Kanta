package com.brosolved.pejus.kanta.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.brosolved.pejus.kanta.models.Category;
import com.brosolved.pejus.kanta.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;


public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private static final String TAG = "CategoryAdapter";

    private Context context;
    private List<Category> categories;

    private OnCategoryClick onCategoryClick;

    public CategoryAdapter(Context context, List<Category> categories) {
        this.context = context;
        this.categories = categories;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categori_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        Glide.with(context)
                .asBitmap()
                .load(categories.get(position).getLogo())
                .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
                .into(holder.imageView);

        holder.textView.setText(categories.get(position).getTitle());

        /*holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: "+categories.get(position).getTitle());
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        CircleImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.categoryImage);
            textView = itemView.findViewById(R.id.categoryName);
            imageView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            try {
                onCategoryClick.onClick(v, getAdapterPosition());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public void setOnCategoryClickListener(OnCategoryClick onCategoryClick){
        this.onCategoryClick = onCategoryClick;
    }

    public interface OnCategoryClick {
        void onClick(View view, int position);
    }
}
