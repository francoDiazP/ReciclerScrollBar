import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;

import com.example.franco_reciclerscrollbar.R;

public class listaAdaptador extends RecyclerView.Adapter<listaAdaptador.ViewHolder> {

    private List<listaElementos> mData;
    private LayoutInflater minflater;
    private Context context;

    public listaAdaptador(List<listaElementos> itemList, Context context){
        this.minflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }

    public int getItemCount(){
        return mData.size();
    }

    public listaAdaptador.ViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View view = minflater.inflate(R.layout.lista_elementos, null);
        return new ListaAdaptador.ViewHolder(view);
    }

    public void onBindViewHolder(final ListaAdaptador.ViewHolder holder, final int position){
        holder.bindData(mData.get(position));
    }

    public void setItems(list<ListaElementos> items){
        mData = items;
    }

    ViewHolder(View itemView){
        super((itemView));
        iconImagen = itemView.findViewById(R.id.iconimagen);
        nombre = itemView.findViewById(R.id.txt_nombre);
        ciudad = itemView.findViewById(R.id.txt_ciudad);
        estado = itemView.findViewById(R.id.txt_estado);
    }

    void bindData(final listaElementos item) {
        iconImage.setColorFilter(Color.parseColor(item.getColor)), PorterDuff.Mode.SRC_IN);
        nombre.setText(item.getNombre());
    }
}
