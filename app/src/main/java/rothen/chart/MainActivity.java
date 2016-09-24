package rothen.chart;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.AxisValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LineChart chart = (LineChart) findViewById(R.id.chart);

        //chart.setLogEnabled(true);

        List<Entry> valsComp1 = new ArrayList<Entry>();
        List<Entry> valsComp2 = new ArrayList<Entry>();
        List<Entry> valsComp3 = new ArrayList<Entry>();

        valsComp1.add(new Entry(0f, 10));
        valsComp1.add(new Entry(1f, 21));
        valsComp1.add(new Entry(2f, 31));
        valsComp1.add(new Entry(3f, 42));
        valsComp1.add(new Entry(4f, 50));
        valsComp1.add(new Entry(5f, 58));
        valsComp1.add(new Entry(6f, 59));
        valsComp1.add(new Entry(7f, 60));
        valsComp1.add(new Entry(8f, 61));
        valsComp1.add(new Entry(9f, 63));
        valsComp1.add(new Entry(10f, 64));
        valsComp1.add(new Entry(11f, 65));
        valsComp1.add(new Entry(12f, 66));
        valsComp1.add(new Entry(13f, 66));
        valsComp1.add(new Entry(14f, 66));
        valsComp1.add(new Entry(15f, 60));
        valsComp1.add(new Entry(16f, 70));
        valsComp1.add(new Entry(17f, 71));
        valsComp1.add(new Entry(18f, 84));
        valsComp1.add(new Entry(19f, 85));


        valsComp2.add(new Entry(0f, 12));
        valsComp2.add(new Entry(1f, 23));
        valsComp2.add(new Entry(2f, 33));
        valsComp2.add(new Entry(3f, 44));
        valsComp2.add(new Entry(4f, 55));
        valsComp2.add(new Entry(5f, 58));
        valsComp2.add(new Entry(6f, 59));
        valsComp2.add(new Entry(7f, 60));
        valsComp2.add(new Entry(8f, 61));
        valsComp2.add(new Entry(9f, 63));
        valsComp2.add(new Entry(10f, 64));
        valsComp2.add(new Entry(11f, 65));
        valsComp2.add(new Entry(12f, 66));
        valsComp2.add(new Entry(13f, 66));
        valsComp2.add(new Entry(14f, 66));
        valsComp2.add(new Entry(15f, 69));
        valsComp2.add(new Entry(16f, 70));
        valsComp2.add(new Entry(17f, 71));
        valsComp2.add(new Entry(18f, 84));
        valsComp2.add(new Entry(19f, 85));

        valsComp3.add(new Entry(0f, 11));
        valsComp3.add(new Entry(1f, 22));
        valsComp3.add(new Entry(2f, 33));
        valsComp3.add(new Entry(3f, 47));
        valsComp3.add(new Entry(4f, 56));
        valsComp3.add(new Entry(5f, 54));
        valsComp3.add(new Entry(6f, 53));
        valsComp3.add(new Entry(7f, 62));
        valsComp3.add(new Entry(8f, 67));
        valsComp3.add(new Entry(9f, 67));
        valsComp3.add(new Entry(10f, 63));
        valsComp3.add(new Entry(11f, 66));
        valsComp3.add(new Entry(12f, 68));
        valsComp3.add(new Entry(13f, 68));
        valsComp3.add(new Entry(14f, 69));
        valsComp3.add(new Entry(15f, 71));
        valsComp3.add(new Entry(16f, 71));
        valsComp3.add(new Entry(17f, 71));
        valsComp3.add(new Entry(18f, 84));
        valsComp3.add(new Entry(19f, 100));


        LineDataSet setComp1 = new LineDataSet(valsComp1, "Company 1");
        setComp1.setColor(Color.BLACK);
        setComp1.setAxisDependency(YAxis.AxisDependency.LEFT);
        setComp1.setLabel(null);
        setComp1.setLineWidth(3);
        setComp1.setDrawCircles(false);
        setComp1.setDrawValues(false);


        LineDataSet setComp2 = new LineDataSet(valsComp2, "Company 2");
        setComp2.setAxisDependency(YAxis.AxisDependency.LEFT);
        setComp2.setColor(Color.BLUE);
        setComp2.setLineWidth(3);
        setComp2.setDrawCircles(false);
        setComp2.setDrawValues(false);



        LineDataSet setComp3 = new LineDataSet(valsComp3, "Company 3");
        setComp3.setAxisDependency(YAxis.AxisDependency.LEFT);
        setComp3.setColor(Color.RED);
        setComp3.setLineWidth(3);
        setComp3.setDrawCircles(false);
        setComp3.setDrawValues(false);


        // use the interface ILineDataSet
        List<ILineDataSet> dataSets = new ArrayList<ILineDataSet>();
        dataSets.add(setComp1);
        dataSets.add(setComp2);
        dataSets.add(setComp3);

        LineData data = new LineData(dataSets);
        chart.setData(data);
        chart.invalidate(); // refresh

        // the labels that should be drawn on the XAxis
        final String[] quarters = new String[] {
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "11",
                "12",
                "13",
                "14",
                "15",
                "16",
                "17",
                "18",
                "19",
                "20" };
        AxisValueFormatter formatter = new AxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return quarters[(int) value];
            }

            // we don't draw numbers, so no decimal digits needed
            @Override
            public int getDecimalDigits() {  return 0; }
        };

        XAxis xAxis = chart.getXAxis();
        xAxis.setGranularity(1f); // minimum axis-step (interval) is 1
        xAxis.setValueFormatter(formatter);
        xAxis.setLabelRotationAngle(-40);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setAxisLineColor(Color.GRAY);
        //xAxis.set

        chart.getAxis(YAxis.AxisDependency.LEFT).setDrawGridLines(false);
        chart.getAxis(YAxis.AxisDependency.RIGHT).setDrawGridLines(false);
        chart.getAxisRight().setEnabled(false);
        chart.getAxisLeft().setAxisMaxValue(100);

        chart.getAxisLeft().setValueFormatter(new AxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                return value + " %";
            }

            @Override
            public int getDecimalDigits() {
                return 0;
            }
        });

        chart.setHighlightPerTapEnabled(false);
        chart.setHighlightPerDragEnabled(false);

        //chart.getAx

        chart.setDescription(null);
        chart.setViewPortOffsets(120, 50, 100, 400);

        //xAxis.setLabelCount(20);
    }
}
