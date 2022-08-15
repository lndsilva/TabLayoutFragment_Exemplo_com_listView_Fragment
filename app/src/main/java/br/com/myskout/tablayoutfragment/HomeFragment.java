package br.com.myskout.tablayoutfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class HomeFragment extends Fragment {
    ListView lstLanches;

    String nomeLanche[] = {
            "X-Salada", "X-Tudo", "X-Egg", "X-File"
    };
    String precoLanche[] = {
            "R$ 20,00", "R$ 30,00", "R$ 25,00", "R$ 45,00"
    };
    String descricaoLanche[] = {
            "Hambuguer, Mussarela, Alface, Tomate, Maionese",
            "Hambuguer, Bacon, Ovo, Presunto, Mussarela, Alface, Tomate, Maionese",
            "Pão, Carne, Mussarela, Ovo, Alface, Tomate, Batata palha e milho.",
            "Pão, File, Mussarela, Bacon, Alface, Tomate e molho especial."

    };
    int imgLanche[] = {
            R.drawable.hamburguer, R.drawable.americano,
            R.drawable.xegg, R.drawable.xfile
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        lstLanches = view.findViewById(R.id.lstLanches);

        LanchesAdapter adapter = new LanchesAdapter();

        lstLanches.setAdapter(adapter);


        return view;
    }

    public class LanchesAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return nomeLanche.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView txtNomeLanche, txtDescricaoLanche, txtPrecoLanche;
            ImageView imagemLanche;

            View v = getLayoutInflater().inflate(R.layout.modelo_lanches, null);

            txtNomeLanche = v.findViewById(R.id.txtTituloLanche);
            txtDescricaoLanche = v.findViewById(R.id.txtDescLanche);
            txtPrecoLanche = v.findViewById(R.id.txtPrecoLanche);

            imagemLanche = v.findViewById(R.id.imgLanche);

            txtNomeLanche.setText(nomeLanche[i]);
            txtDescricaoLanche.setText(descricaoLanche[i]);
            txtPrecoLanche.setText(precoLanche[i]);

            imagemLanche.setImageResource(imgLanche[i]);

            return v;
        }
    }
}