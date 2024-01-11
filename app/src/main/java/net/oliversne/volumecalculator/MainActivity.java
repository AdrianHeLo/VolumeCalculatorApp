package net.oliversne.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.Toast;

import net.oliversne.volumecalculator.Adapters.Shapes;
import net.oliversne.volumecalculator.Models.Shape;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Adapter View
    GridView gridView;
    //Data Source
    ArrayList<Shape> shapeArrayList;
    //Adapter
    Shapes adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set the Adapter View
        gridView = findViewById(R.id.grid_view);

        //Set the Data Source
        shapeArrayList = new ArrayList<>();

        Shape shape1 = new Shape(R.drawable.cube, "Cube");
        Shape shape2 = new Shape(R.drawable.cylinder, "Cylinder");
        Shape shape3 = new Shape(R.drawable.prism, "Prism");
        Shape shape4 = new Shape(R.drawable.sphere, "Sphere");

        shapeArrayList.add(shape1);
        shapeArrayList.add(shape2);
        shapeArrayList.add(shape3);
        shapeArrayList.add(shape4);

        //Set the Adapter
        adapter = new Shapes(shapeArrayList,this);
        gridView.setAdapter(adapter);
        gridView.setNumColumns(2);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = adapter.getItem(position).getShapeName();
                Intent intent = new Intent(getApplicationContext(),VolumeShapes.class);
                intent.putExtra("shapeName", item);
                startActivity(intent);
            }
        });

    }
}