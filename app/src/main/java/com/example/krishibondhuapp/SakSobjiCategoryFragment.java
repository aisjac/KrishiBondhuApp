package com.example.krishibondhuapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


/**
 * A simple {@link Fragment} subclass.
 */
public class SakSobjiCategoryFragment extends Fragment {


    public SakSobjiCategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_saksobji_category, container, false);

        GridView gridView = view.findViewById(R.id.saksobjiCategoryGridId);

        final String array2[] = getResources().getStringArray(R.array.saksobji);
        int flag2[] = {
                R.drawable.seem,
                R.drawable.alu,
                R.drawable.begun,
                R.drawable.tomato
        };

        //This is built-in Adapter of android
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,array);

        //This is custom Adapter
        CropsCategoryAdapter adapter = new CropsCategoryAdapter(getContext(), array2, flag2);

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment fragment = null;
                if(position==0){
                    fragment = new Vegetable_Fragment();
                    Bundle args = new Bundle();
                    args.putInt("position", position);
                    fragment.setArguments(args);
//                    Toast.makeText(getContext(), "Possition "+position, Toast.LENGTH_SHORT).show();
                }if(position==1){
                    fragment = new Vegetable_Fragment();
                    Bundle args = new Bundle();
                    args.putInt("position", position);
                    fragment.setArguments(args);
//                    Toast.makeText(getContext(), "Possition "+position, Toast.LENGTH_SHORT).show();
                }if(position==2){
                    fragment = new Vegetable_Fragment();
                    Bundle args = new Bundle();
                    args.putInt("position", position);
                    fragment.setArguments(args);
//                    Toast.makeText(getContext(), "Possition "+position, Toast.LENGTH_SHORT).show();
                }if(position==3){
                    fragment = new Vegetable_Fragment();
                    Bundle args = new Bundle();
                    args.putInt("position", position);
                    fragment.setArguments(args);
//                    Toast.makeText(getContext(), "Possition "+position, Toast.LENGTH_SHORT).show();
                }

                if (fragment != null) {
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.frameLayoutId,fragment);
                    ft.addToBackStack(null);
                    ft.commit();
                }
            }
        });

        return view;
    }

}
