package com.example.android.azkar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class azkar_elsfr extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inner_page);


        TextView t = (TextView) findViewById(R.id.title);
        t.setText("دعاء السفر");

        ArrayList<word> azkarList = new ArrayList<>();
        azkarList.add(new word("\"الله أكبر، الله أكبر، الله أكبر،{سُبْحانَ الَّذِي سَخَّرَ لَنَا هَذَا وَمَا كُنَّا لَهُ مُقْرِنِينَ * وَإِنَّا إِلَى رَبِّنَا لَمُنقَلِبُونَ}  \"اللهم إنا نسألُكَ في سفرنا هذا البرَّ والتقوى، ومن العمل ما ترضى، اللهم هون علينا سفرنا هذا واطو عنا بعده، اللهم أنت الصاحب في السفر، والخليفة في الأهل، اللهم إني أعوذ بك من وعْثاءِ السفر، وكآبة المنظر وسوء المنقلب في المال والأهل\" وإذا رجع قالهن وزاد فيهن \"آيبون، تائبون، عابدون، لربنا حامدون\""));

        wordAdapter adapter = new wordAdapter(this,azkarList);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}
