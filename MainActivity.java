package test.appnickname;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView hienchu;
	EditText nhapchu;
	Button nutan;
	TextView hienbietdanh;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Init();
	}
	public void Init()	{
		hienchu = (TextView) findViewById(R.id.textView1);
		nhapchu = (EditText) findViewById(R.id.editText1);
		nutan = (Button) findViewById(R.id.button1);
		hienbietdanh = (TextView) findViewById(R.id.textView2);
	}
	
	public void timbietdanh(View v)	{
		String a = new String(nhapchu.getText().toString());
		Random random = new Random();
		ArrayList<String> listbietdanh = new ArrayList<String>();
		Collections.addAll(listbietdanh, "Bách Ruồi", "Bảo Đuồi", "Bắc Cụ", "Bắc Cọp", "Bắc luồi", "Bích đanh", "Bích đú", 
				"Bích đầm", "Bích đóc", "Bích đẹp", "Bích đéo", "Bích đơm", "Bích cóc", "Bích đự", "Bích đóng", "Bích đỏng", "Bình phuồi", "Bình hôi ruồi", "Chiến thó", "Chính pha", "Chuẩn ra cày", "Công lặc", 
				"Công nhủ", "Cường buôi", "Cường xuyên tu", "Danh tái", "Dung dập", "Dung tái", "Dũng lái", "Đại du", "Đàm cả tú", "Đạt chưa chín", "Đạt một phít", "Đạt phốt mịt", "Đạt phít", "Đạt tồn phát mịt", 
				"Đắc cụt", "Đăng hịt", "Điền đô", "Điệp liên tú", "Điệp tít", "Định công", "Đỗ vít", "Đông lít", "Đông mít", "Đông phấn", "Đồng mốc", "Đôn lầm", "Đức cống", "Đức cạp", "Đức cút", "Đức cớp", "Đức nhít",
				"Giang trên phường", "Hà còn", "Hà cột", "Hà lốn", "Hải dưới", "Hải dóng", "Hải dớ", "Hiếu thòn", "Huy đầu kẹp", "Hương vôn dật", "Khang được phông", "Khanh đầu tấc", "Khanh mất oai", "Khanh oai bé", 
				"Khanh tắm", "Kiên sặc", "Kiên vứt", "Kiệt lặc", "Kiệt thanh năng", "Lang phồn", "Lâm đồn", "Lâm thồn", "Lân cồn", "Lập dồn", "Lặc còi", "Lê phồn", "Liêm bố", "Liêm phấn", "Liên đồn", "Liên xồn", 
				"Linh có cồn", "Linh tiếm", "Linh trồn", "Lộn lông cò", "Long cồn", "Long củ", "Long da bồn", "Long đồn", "Long phẩn", "Lương chồn", "Lỳ thâm sồn", "Mai dắm", "Mai dế", "Mai dói", "Mai dút", 
				"Mạnh lu bồn", "Minh chất", "Minh tút", "Nam hồn", "Ngọc cắc", "Ngọc hu", "Ngọc thực", "Phong lẩn", "Phú bò", "Phú vòi", "Phúc sân", "Phương tò", "Quân ra tình", "Rồng lộn", "Sinh ra tớm",
				"Sinh tắp ra", "Sinh vô", "Tâm thi", "Tích xuân", "Tiên điết", "Tiệp phích", "Tính phong", "Thái dọc", "Thái dung", "Thái dúi", "Thái dối", "Thành ngọc hối", "Thạo nai", "Thắm lốn", "Thắng giải", 
				"Thiện lớn", "Thiện tứ", "Thiện tám", "Thìn đẹp", "Thịnh Tu", "Thống giúi", "Thu cúc", "Thu cụt", "Thu đạm", "Toàn hinh", "Tôn lò", "Tùng trinh", "Tùng dịch", "Trang hến", "Trang hống", "Trang hó", 
				"Trang nguyên mình", "Triết mim", "Trung tình", "Trường em công", "Trường đó", "Trường lôn", "Tú bi", "Tú com", "Tú đội", "Tú đợi", "Tú trinh bùng", "Tú vo", "Tú vóm", "Vân ập", "Vân dược", "Việt lú", 
				"Vinh sô", "Vũ cơ", "Vũ vố", "Vương cú", "Vy téo");
		ArrayList<String> listketqua = new ArrayList<String>();
		for (String i:listbietdanh)		{
			String[] parts = i.split(" ");
			if (a.equalsIgnoreCase(parts[0]))		{
				listketqua.add(i);
			}
		}
		if (listketqua.size() != 0)		{
			hienbietdanh.setText("Biệt danh của "+a+" là: "+listketqua.get(random.nextInt(listketqua.size())));
		} else	{
			hienbietdanh.setText("Không có biệt danh T_T");
		}
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
