package hello_world.test.com.example.karim.bitctrl_app_3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class InfoFragment extends Fragment {

    private ArrayList<Recycler_Info_Item> lst_InfoItems;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private  RecyclerView.LayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new InfoItem_RecyclerAdapter(lst_InfoItems);
        recyclerView.setAdapter(adapter);


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String date = "05.04.2018";
        lst_InfoItems = new ArrayList<>();
        lst_InfoItems.add(new Recycler_Info_Item("05.04.2018", 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item("05.04.2018", 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item("05.04.2018", 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item("05.04.2018", 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));
        lst_InfoItems.add(new Recycler_Info_Item(date, 5, R.drawable.ic_baseline_navigate_next_24px));



    }
}
