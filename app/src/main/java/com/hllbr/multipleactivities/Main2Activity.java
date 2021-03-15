package com.hllbr.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    /*
    bu alanda ise birinci activity tarafından gönderilen değeri bir şekilde karşılamam gerekiyor

    bu alma işlemi için onCreate içerisinde bir işlem dizisi ouşturarak sorunu çözmeye çalışıyorum
     */
    TextView userName ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        userName = findViewById(R.id.textView2);

        Intent intent = getIntent();//intenti al karşıla getir şeklinde bir ifade oluşturmuş oldum


        //şuan intent değerimin içi boş sadece yapılacak işlemi ifade ettim ne getireceğimi henüz söylemedim

        //birinci kısımda veri göndermek için putExtra kullanmıştım şidi bunun yerine yine birden fazla alma seçeneği arasından bir gönderilen verinin tipine göre bir metod ile çağırma işlemi gerçekleştiriyorum

        String usageusername = intent.getStringExtra("userinput");//Birinci parametre key(anahtar kelimem) birinci activite içerisinde belirtmiş olduğum kelime .bu değeri bir değişkene eşitleyerek kullanmak işimizi kolaylaştıracaktır.

        //şimdi birinci activity içerisinde verilmiş ifadeyi almış oldum bunu ekranda göstermek istersem textView ile ifade edebilrim

        userName.setText("the username entered in the first activity : "+usageusername);

    }
    public void changeToScreen(View view){
        //Activity2 içerisindeki butona tıklandığında yapılacaklar


        Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);//şuana kadar inttent oluşturuldu intenti başlatmadan önce


        startActivity(intent2);








    }
}