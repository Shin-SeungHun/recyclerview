package com.ssh.recyclerview;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;

        import android.os.Bundle;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.ItemTouchHelper;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    ListAdapter adapter;
    ItemTouchHelper helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        rv = findViewById(R.id.rv);
        //RecyclerView의 레이아웃 방식을 지정
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(manager);

        //RecyclerView의 Adapter 세팅
        adapter = new ListAdapter();
        rv.setAdapter(adapter);

        //ItemTouchHelper 생성
        helper = new ItemTouchHelper(new ItemTouchHelperCallback(adapter));
        //RecyclerView에 ItemTouchHelper 붙이기
        helper.attachToRecyclerView(rv);


        //Adapter에 데이터 추가
        Person person1 = new Person(R.drawable.b1,"파이리",1);
        Person person2 = new Person(R.drawable.b2,"피카츄",2);
        Person person3 = new Person(R.drawable.b3,"꼬부기",3);
        Person person4 = new Person(R.drawable.b4,"이상해씨",4);
        adapter.addItem(person1);
        adapter.addItem(person2);
        adapter.addItem(person3);
        adapter.addItem(person4);
    }


}