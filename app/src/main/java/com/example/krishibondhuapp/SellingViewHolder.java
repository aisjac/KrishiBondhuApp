package com.example.krishibondhuapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class SellingViewHolder extends RecyclerView.ViewHolder {

    CircleImageView sellerCircleImageView;
    TextView sellerFulname,date,time;
    TextView category,productName,jat,quantity,price,place,unit;
    ImageView sellingImageView;
    LinearLayout callSeller;
    CardView cardView;

    public SellingViewHolder(@NonNull View itemView) {
        super(itemView);

        cardView = itemView.findViewById(R.id.selling_cardView_Id);

        sellerCircleImageView = itemView.findViewById(R.id.seller_Image_Id);
        sellerFulname = itemView.findViewById(R.id.seller_Fullname_Id);
        date = itemView.findViewById(R.id.selling_Date_Id);
        time = itemView.findViewById(R.id.selling_Time_Id);

        category = itemView.findViewById(R.id.selling_Category_TvId);
        productName = itemView.findViewById(R.id.selling_Product_TvId);
        jat = itemView.findViewById(R.id.selling_JatTv_Id);
        quantity = itemView.findViewById(R.id.selling_Quantity_TvId);
        price = itemView.findViewById(R.id.selling_Price_TvId);
        place = itemView.findViewById(R.id.selling_PlaceTv_Id);
        unit = itemView.findViewById(R.id.selling_Unit_TvId);

        sellingImageView = itemView.findViewById(R.id.selling_Product_ImageId);
        callSeller = itemView.findViewById(R.id.call_SellerLayout_Id);


    }
}
