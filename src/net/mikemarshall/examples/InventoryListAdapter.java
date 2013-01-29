package net.mikemarshall.examples;

import java.util.ArrayList;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

public class InventoryListAdapter extends ArrayAdapter<InventoryItem> {

	private Context thisContext;
	private ArrayList<InventoryItem> items;
	
	public InventoryListAdapter(Context context,
								int textViewResourceId, 
								ArrayList<InventoryItem> objects){
		super(context, textViewResourceId,objects);
		items = objects;
		thisContext = context;	
	}
	
	@Override
	public View getView(int position, View reusedView, ViewGroup parent) {
		 	View view = reusedView;
		    if (view == null) {
		        LayoutInflater inflater = (LayoutInflater) 
		        		thisContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		        view = inflater.inflate(R.layout.list_item, null);
		    }
		    if (items != null){
		        InventoryItem item = items.get(position);
		        if (item != null) {
		            TextView labelView= (TextView) view.findViewById(R.id.itemLabel);
		            if (labelView!= null)
		            {
		            	labelView.setText(item.getLabel());
		            }
		            TextView valueView = (TextView) view.findViewById(R.id.itemValue);
		            if (valueView != null)
		            {
		            	valueView .setText(item.getValue());
		           }
		        }
		    }

		    return view;
	}
}
