package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ammach.myapplication.R;

import java.util.List;

import bean.Taxe38Anuelle;

/**
 * Created by ammach on 7/24/2016.
 */
public class Taxe38Adapter extends BaseAdapter {

    List<Taxe38Anuelle> taxe38Anuelles;
    Context context;

    public Taxe38Adapter(List<Taxe38Anuelle> taxe38Anuelles, Context context) {
        this.taxe38Anuelles = taxe38Anuelles;
        this.context = context;
    }

    @Override
    public int getCount() {
        return taxe38Anuelles.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        convertView=layoutInflater.inflate(R.layout.taxe38_item,null);

        TextView txtRedevable= (TextView) convertView.findViewById(R.id.txtRedevable);
        TextView txtAnnee= (TextView) convertView.findViewById(R.id.txtAnnee);
        TextView txtValeurAction= (TextView) convertView.findViewById(R.id.txtValeurAction);
        TextView txtLocale= (TextView) convertView.findViewById(R.id.txtLocale);

        txtRedevable.setText(taxe38Anuelles.get(position).getRedevable().getCin());
        txtAnnee.setText(""+taxe38Anuelles.get(position).getAnnee());
        txtValeurAction.setText(""+taxe38Anuelles.get(position).getValeurLocation()+" (VL)");
        txtLocale.setText(taxe38Anuelles.get(position).getLocale().getRue().getQuartier().getSecteure().getNom()+","+taxe38Anuelles.get(position).getLocale().getRue().getQuartier().getNom()+","+taxe38Anuelles.get(position).getLocale().getRue().getNom()+","+taxe38Anuelles.get(position).getLocale().getAdresse());

        return convertView;
    }
}
