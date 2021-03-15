package com.hllbr.multipleactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String username ;

    EditText userText ;
/*
INTENTLER SADECE ACTİVİTY AKTARIMLARI İÇİN KULLANILMAZLAR AYNI ZAMANDA ACTİVİTYDEN ACTİVİTEYE BİLGİ AKTARIMINDADA KULLANILABİLİRLER.

ilk amacım birinci ekranda aldğığım kullanıcı adını ikinci ekrana yansıtabilmek bilgiyi ikinci ekrana taşıyabilmek ...

Bu işlemler basit seviye işlemler olarak ifade edebileceğimiz işlemlerdir.Diğer prolejerimde daha farklı yöntemler ile bilgi aktarımları gerçekleştirmeye çalışacağım

 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userText = findViewById(R.id.userNameText);
        username = "";

    }
    public void changeActivity(View view){
        //Activity içerisindeki butona tıklandığında yapılacaklar.
        //ilk olarak tanımlamış olduğum String yapısına userText içerisindeki ismi vermem gerekiyor.

        username = userText.getText().toString();

        Intent intent = new Intent(MainActivity.this,Main2Activity.class);//birinci parametre context, ikinci parametre sınıf gitmek istediğin sınıfı verirsem butona basıdlığında beni o noktaya götürüyor

        //bu yapıyı başlatmak için startActivity adlı metodu çağırmam gerekiyor.

        //Intent başlatılmadan önce putExtra adlı metod ile işlem yapmam gerekiyor.Bu yapı bana bir adet isim ve değer soruyor(Key,Value) Ben burada basit bir String göndermeye çalışıyorum

        intent.putExtra("userinput",username);//anahtar değerim userinput gönderilecek değerim ise username istersem anahtar olarak bir diziyi dahi belirleyebilirim...


        startActivity(intent);




    }
}