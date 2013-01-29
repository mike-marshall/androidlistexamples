package net.mikemarshall.examples;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class InventoryListActivity extends Activity {
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.list);
	        
	        ArrayList<InventoryItem> items = new ArrayList<InventoryItem>();
	        items.add(new InventoryItem("Hats","32"));
	        items.add(new InventoryItem("Economics Textbooks","17"));
	        items.add(new InventoryItem("Robots","110"));
	        
	        ListView listView = (ListView) this.findViewById(R.id.mainList);
	        listView.setAdapter(new InventoryListAdapter(this, R.layout.list_item, items));
	        
	 }
}
