package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ammach.myapplication.R;

import java.util.List;

import bean.Taxe38Trimistrielle;

/**
 * Created by ammach on 7/24/2016.
 */
public class Taxe38DetailAdapter extends BaseAdapter {

    List<Taxe38Trimistrielle> taxe38Trimistrielles;
    Context context;

    public Taxe38DetailAdapter(List<Taxe38Trimistrielle> taxe38Trimistrielles, Context context) {
        this.taxe38Trimistrielles = taxe38Trimistrielles;
        this.context = context;
    }

    @Override
    public int getCount() {
       return taxe38Trimistrielles.size();
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
        convertView=layoutInflater.inflate(R.layout.taxe38detail_item,null);

        TextView txtNumeroTrimestre= (TextView) convertView.findViewById(R.id.txtNumeroTrimestre);
        TextView txtListTaxe38TrimestrielleT= (TextView) convertView.findViewById(R.id.txtListTaxe38TrimestrielleT);
        TextView txtListTaxe38TrimestrielleTMoisRetard= (TextView) convertView.findViewById(R.id.txtListTaxe38TrimestrielleTMoisRetard);


        txtNumeroTrimestre.setText(""+taxe38Trimistrielles.get(position).getNumeroTrimistre());
        txtListTaxe38TrimestrielleT.setText(""+taxe38Trimistrielles.get(position).getMontantTotalTrimistrielleItem()+" (Montant Total)");
        txtListTaxe38TrimestrielleTMoisRetard.setText(""+taxe38Trimistrielles.get(position).getMontantRetardTotalTrimistrielleItem()+" (Montant Total Retard)");

        return convertView;
    }
}
