package utils;

import com.github.mikephil.charting.components.AxisBase;

import java.text.DecimalFormat;

/**
 * Created by ammach on 9/1/2016.
 */
public class MyAxisValueFormatter  implements IAxisValueFormatter {

    private DecimalFormat mFormat;

    public MyAxisValueFormatter() {
        mFormat = new DecimalFormat("###,###,###,##0.0");
    }

    @Override
    public String getFormattedValue(float value, AxisBase axis) {
        return mFormat.format(value) + " $";
    }

    @Override
    public int getDecimalDigits() {
        return 1;
    }
}
