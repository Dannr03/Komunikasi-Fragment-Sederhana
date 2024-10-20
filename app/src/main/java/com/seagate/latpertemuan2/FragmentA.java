package com.seagate.latpertemuan2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentA#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentA extends Fragment {

    private SharedViewModel sharedViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        sharedViewModel = new ViewModelProvider(requireActivity()).get(SharedViewModel.class);

        Button btnASUS = view.findViewById(R.id.btnASUS);
        btnASUS.setOnClickListener(v -> {
            sharedViewModel.selectItem("AMD Ryzen 7 7945HX"+"\n"+"Ram 32 GB"+"\n"+"2 TB SSD"+"\n"+"NVIDIA GeFORCE RTX 4090"+"\n"+"Rp 75.000.000");
        });

        Button btnMSI = view.findViewById(R.id.btnMSI);
        btnMSI.setOnClickListener(v -> {
            sharedViewModel.selectItem("Intel Core i9-13980HX"+"\n"+"Ram 64 GB"+"\n"+"4 TB SSD"+"\n"+"NVIDIA GeFORCE RTX 4090"+"\n"+"Rp 89.999.000");
        });

        Button btnLENOVO = view.findViewById(R.id.btnLENOVO);
        btnLENOVO.setOnClickListener(v -> {
            sharedViewModel.selectItem("Intel Core i9-14900HX"+"\n"+"Ram 32 GB"+"\n"+"2 TB SSD"+"\n"+"NVIDIA GeFORCE RTX 4090"+"\n"+"Rp 79.999.000");
        });

        Button btnDELL = view.findViewById(R.id.btnDELL);
        btnDELL.setOnClickListener(v -> {
            sharedViewModel.selectItem("Intel Core i7-11800H"+"\n"+"Ram 32 GB"+"\n"+"1 TB SSD"+"\n"+"NVIDIA GeFORCE RTX 3070"+"\n"+"Rp 48.599.000");
        });

        Button btnACER = view.findViewById(R.id.btnACER);
        btnACER.setOnClickListener(v -> {
            sharedViewModel.selectItem("Intel Core Ultra 7 155H"+"\n"+"Ram 32 GB"+"\n"+"1 TB SSD"+"\n"+"NVIDIA GeFORCE RTX 4060"+"\n"+"Rp 37.999.000");
        });

        return view;
    }

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentA() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentA.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentA newInstance(String param1, String param2) {
        FragmentA fragment = new FragmentA();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

}