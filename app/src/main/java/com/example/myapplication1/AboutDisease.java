package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class AboutDisease extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_disease);

        RecyclerView recyclerView=findViewById(R.id.recycler_view);

        List<Disease>diseases=new ArrayList<Disease>();
        diseases.add(new Disease(R.drawable.acne,"Benign","Benign refers to a condition, tumor, or growth that is not cancerous. This means that it does not spread to other parts of the body. It does not invade nearby tissue. Sometimes, a condition is called benign to suggest it is not dangerous or serious.In general, a benign tumor grows slowly and is not harmful. However, this is not always the case.A benign tumor may grow big enough or be found near blood vessels, the brain, nerves, or organs. As a result, it can cause problems locally without spreading to another part of the body. Sometimes, these problems can be serious."));
        diseases.add(new Disease(R.drawable.blister,"Malignant","A tumor is an abnormal lump or growth of cells. If the cells in the tumor are normal, it’s benign. If they’re abnormal and grow uncontrollably, they’re cancerous cells and the tumor is malignant.Cells can spread.They usually grow rapidly.They often invade the basal membrane that surrounds healthy tissue.Malignant tumors can be life-threatening. Many benign tumors are harmless and don’t require treatment, but others can cause serious problems or become cancerous. If you feel a lump anywhere on your body, see a doctor as soon as you can."));
        diseases.add(new Disease(R.drawable.vitiligo,"Vitilligo","Vitiligo can occur in people with various skin tones.Vitiligo is a chronic (long-lasting) autoimmune disorder that causes patches of skin to lose pigment or color. This happens when melanocytes – skin cells that make pigment – are attacked and destroyed, causing the skin to turn a milky-white color."));
        diseases.add(new Disease(R.drawable.ring,"Ringworm","Ringworm is a common skin infection that is caused by a fungus. It's called “ringworm” because it can cause a circular rash (shaped like a ring) that is usually red and itchy. Anyone can get ringworm. Ringworm may appear more white on darker skin."));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new DiseaseAdapter(getApplicationContext(),diseases));

    }
}