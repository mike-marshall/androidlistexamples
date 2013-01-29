package net.mikemarshall.examples;

import net.mikemarshall.examples.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class ListGridActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TableLayout table =(TableLayout)this.findViewById(R.id.mainTable);
        TextView label1 = (TextView)this.findViewById(R.id.label1);
        for (Integer i = 0; i < 13; i++)
        {
        	TableRow row = new TableRow(this);
        	TableRow.LayoutParams rp = 
                	new TableRow.LayoutParams(LayoutParams.FILL_PARENT,
        					LayoutParams.WRAP_CONTENT);
        	row.setLayoutParams(rp);
        	TextView label = new TextView(this);
        	label.setText("row" + i.toString());
        	label.setTextSize(label1.getTextSize());
        	
        	TableRow.LayoutParams lp = 
        	new TableRow.LayoutParams(LayoutParams.WRAP_CONTENT,
					LayoutParams.WRAP_CONTENT,1.0f);
        	lp.setMargins(0, 0, 20, 0);
        	label.setLayoutParams(lp);
        	row.addView(label);
        	
        	TextView value = new TextView(this);
        	value.setText(i.toString());
        	value.setTextSize(label1.getTextSize());
        	
        	TableRow.LayoutParams lpv = 
                	new TableRow.LayoutParams(LayoutParams.WRAP_CONTENT,
        					LayoutParams.WRAP_CONTENT);
        	lpv.setMargins(10, 0, 0, 0);
        	value.setLayoutParams(lpv);
        	row.addView(value);
        	
        	table.addView(row, 
                    new TableLayout.LayoutParams
                    (LayoutParams.FILL_PARENT, 
                    LayoutParams.WRAP_CONTENT));
        }
        
        Button button = (Button) this.findViewById(R.id.listButton);
        button.setOnClickListener(this.onBtnClick);
    }
    
    protected Button.OnClickListener onBtnClick = new Button.OnClickListener()
    {
		@Override
		public void onClick(View arg0) {
			Intent i = new Intent(ListGridActivity.this, InventoryListActivity.class);
			ListGridActivity.this.startActivity(i);
		}
    	
    };
}