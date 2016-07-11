package com.example.root.mptest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LineChart lineChart = (LineChart) findViewById(R.id.chart);
        // creating list of entry
        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(0, 8f));
        entries.add(new Entry(1, 8f));
        entries.add(new Entry(1, 4f));
        entries.add(new Entry(2, 4f));
        entries.add(new Entry(2, 6f));
        entries.add(new Entry(3, 6f));
        entries.add(new Entry(3, 10f));
        entries.add(new Entry(4, 10f));
        entries.add(new Entry(4, 0f));

        LineDataSet dataset = new LineDataSet(entries, "# of Calls");
        // creating labels
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");

        ArrayList<ILineDataSet> dataSets = new ArrayList<ILineDataSet>();
        dataSets.add(dataset); // add the datasets

        // create a data object with the datasets
        LineData data = new LineData(dataSets);
        lineChart.setData(data); // set the data and list of lables into chart

        lineChart.setVisibleXRange(0, 24);

        lineChart.setDescription("");  // set the description
    }
}
