package net.oliversne.volumecalculator.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import net.oliversne.volumecalculator.Models.Shape;
import net.oliversne.volumecalculator.R;

import java.util.ArrayList;

public class Shapes extends ArrayAdapter<Shape> {
    //Propiedades
    private ArrayList<Shape> shapesArrayList;
    Context context;

    //Constructor
    public Shapes(ArrayList<Shape> shapesArrayList, Context context) {
        super(context, R.layout.grid_item_layout, shapesArrayList);
        this.shapesArrayList = shapesArrayList;
        this.context = context;
    }

    //ViewHolder Class: Used to cache references to the views within an item layout
    private static class ViewHolder{
        ImageView shapeImg;
        TextView shapeName;
    }

    //GetView: Used to create and return a view for a specific item in Grid
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Propiedades
        ViewHolder viewHolder;

        //1. Get the shape object for the current position
        Shape shapes = getItem(position);

        //2. Inflating Layout
        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.grid_item_layout, parent, false);

            //Finding Views
            viewHolder.shapeImg = (ImageView) convertView.findViewById(R.id.shape_image);
            viewHolder.shapeName = (TextView) convertView.findViewById(R.id.shape_name_text);

            convertView.setTag(viewHolder);

        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.shapeImg.setImageResource(shapes.getShapeImg());
        viewHolder.shapeName.setText(shapes.getShapeName());

        return convertView;
    }
}
