package com.example.root.mptest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HorizontalBarChart barChart = (HorizontalBarChart) findViewById(R.id.chart);
        // creating list of entry
        ArrayList<BarEntry> entries = new ArrayList<BarEntry>();
        entries.add(new BarEntry(0, 4f));
        entries.add(new BarEntry(1, 8f));
        entries.add(new BarEntry(2, 6f));
        entries.add(new BarEntry(3, 2f));
        entries.add(new BarEntry(4, 18f));
        entries.add(new BarEntry(5, 9f));

        BarDataSet dataset = new BarDataSet(entries, "# of Calls");
        // creating labels
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");

        ArrayList<IBarDataSet> dataSets = new ArrayList<IBarDataSet>();
        dataSets.add(dataset); // add the datasets

        // create a data object with the datasets
        BarData data = new BarData(dataSets);

        data.setValueTextSize(10f);
        data.setBarWidth(0.9f);

        barChart.setData(data); // set the data and list of lables into chart

        barChart.setDescription("Description");  // set the description

        barChart.setFitBars(true);
        barChart.animateY(2500);
    }
}
