package com.example.quotes;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.appengers.quotes.R;
import com.example.quotes.SimpleGestureFilter.SimpleGestureListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements SimpleGestureListener{
    private SimpleGestureFilter detector;
    
	  SQLiteDatabase db;		
	  TextView t1,t2,t4;
	  TextView t5;
	  Cursor c;
	  int n=0;
	  String number,quote,name,episode;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout1);
		  t1=(TextView)findViewById(R.id.quote);
	 	  t2=(TextView)findViewById(R.id.name);
	 	  //t4=(TextView)findViewById(R.id.episode);
	 	 t5=(TextView)findViewById(R.id.number);
		 db= openOrCreateDatabase("Mydb", MODE_PRIVATE, null);
		   //create new table if not already exist
		 db.execSQL("create table if not exists mytable8(number varchar, name varchar, quote varchar)");
		 db.execSQL("insert into mytable8 values(1,'-Arsene Wenger','A football team is like a beautiful woman. When you do not tell her, she forgets she is beautiful.')");
		 db.execSQL("insert into mytable8 values(2,'-Gary Lineker','Football is a simple game;\n" +
				 "22 men chase a ball for 90 minutes and at the end,\n" +
				 "the Germans win.')");
		 db.execSQL("insert into mytable8 values(3,'-Jose Mourinho','Everybody was waiting for Chelsea not to win every game and one day when we lose there will be a holiday in the country. But we are ready for that.')");
		 db.execSQL("insert into mytable8 values(4,'-Arsene Wenger','I think in England you eat too much sugar and meet and not enough vegetables.')");
		 db.execSQL("insert into mytable8 values(5,'-Zlatan Ibrahimovic','What Carew does with a football, I can do with an orange.')");
		 db.execSQL("insert into mytable8 values(6,'-Ronaldo','We lost because we didnt win')");
		db.execSQL("insert into mytable8 values(7,'-Gary Lineker','There is no in between- you are either good or bad. We were in between')");
		db.execSQL("insert into mytable8 values(8,'-Pele','Every kid around the world who plays soccer wants to be Pele. I have a great responsibility to show them not just how to be like a soccer player, but how to be like a man.')");
		db.execSQL("insert into mytable8 values(9,'-Dennis Bergkamp','Behind every kick of the ball there has to be a thought.')");
		db.execSQL("insert into mytable8 values(10,'-Patrick Viera','The player in the Premiership I admire most? Easy – Scholes.')");

		db.execSQL("insert into mytable8 values(11,'-Marcelo Lippi','Paul Scholes would have been one of my first choices for putting together a great team.')");
		db.execSQL("insert into mytable8 values(12,'-Pele',' A penalty is a cowardly way to score.')");
		db.execSQL("insert into mytable8 values(13,'-Ronaldinho','I learned all about life with a ball at my feet')");
		db.execSQL("insert into mytable8 values(14,'-George Best','Pele called me the best footballer in the world. That is the ultimate salute to my life.')");
		db.execSQL("insert into mytable8 values(15,'–Lionel Messi','I dont need a good hairstylist or an amazing body, just give me the ball at my feet and I will show you what I can do')");
		db.execSQL("insert into mytable8 values(16,'–Roy Keane','Fail to prepare, prepare to fail.')");
		db.execSQL("insert into mytable8 values(17,'-Maradona','The goal was scored a little bit by the hand of God, another bit by the head of Maradona.')");
		db.execSQL("insert into mytable8 values(18,'–Hugo Sanchez','Whoever invented football should be worshipped as a God.')");
		db.execSQL("insert into mytable8 values(19,'–Jose Mourinho','When I go to the press conference before the game, in my mind the game has already started.')");
		db.execSQL("insert into mytable8 values(20,'–Cristiano Ronaldo','I am living a dream I never want to wake up from.')");
		db.execSQL("insert into mytable8 values(21,'–Lionel Messi','You have to fight to reach your dream. You have to sacrifice and work hard for it.')");
		db.execSQL("insert into mytable8 values(22,'–Sir Alex Ferguson','I have never played for a draw in my life.')");
		db.execSQL("insert into mytable8 values(23,'–Theirry Henry','Sometimes in football, you have to score goals.')");
		db.execSQL("insert into mytable8 values(24,'-Zinedine Zidane','Ronaldinho is a special player, but Thierry Henry is probably technically the most gifted footballer ever to play the beautiful game.')");
		db.execSQL("insert into mytable8 values(25,'–Arsene Wenger','Thierry Henry could take the ball in the middle of the park and score a goal that no one else in the world could score')");
		db.execSQL("insert into mytable8 values(26,'–Frank Lampard','You get to the stage where every little bit of criticism that comes to you, you use to make you stronger, ... We get it from a lot of angles now and we hope to answer it by success.')");
		db.execSQL("insert into mytable8 values(27,'–Daniele De Rossi','It is never normal to play against Gerrard. It always gets emotional.')");
		db.execSQL("insert into mytable8 values(28,'–Johan Cruff','Soccer is simple, but it is difficult to play simple.')");
		db.execSQL("insert into mytable8 values(29,'–David Beckham','Soccer is a magical game')");
		db.execSQL("insert into mytable8 values(30,'–Wayne Rooney','I just hate losing and that gives you an extra determination to work harder.')");
		db.execSQL("insert into mytable8 values(31,'–Laurant Blanc','I tell anyone who asks me – Scholes is the best English player.')");
		db.execSQL("insert into mytable8 values(32,'–Zinedine Zidane','My toughest opponent? Scholes of Manchester. He is the complete midfielder.')");
		db.execSQL("insert into mytable8 values(33,'–Daniele De Rossi','Thank goodness I didnt go to Man United, I would have committed suicide')");
		db.execSQL("insert into mytable8 values(34,'–Wayne Rooney','I love football, football is my life.')");
		db.execSQL("insert into mytable8 values(35,'–Jose Mourinho','You can have the top stars to bring the attention, you can have the best stadium, you can have the best facilities, you can have the most beautiful project in terms of marketing and all this kind of thing. But if you dont win... All the work these people are doing is forgotten.')");
		db.execSQL("insert into mytable8 values(36,'–Neymar','There is no pressure when you are making a dream come true')");
		db.execSQL("insert into mytable8 values(37,'Maradona','Pele should go back to the museum.')");
		db.execSQL("insert into mytable8 values(38,'Alexis Sanchez','Life is like the dice that, falling, still show a different face. So life, though it remains the same, is always presenting different aspects.')");
		db.execSQL("insert into mytable8 values(39,'–Thomas Mueller','Anyone who sacrifices his dreams to reality, is forever beaten.')");
		db.execSQL("insert into mytable8 values(40,'-Mesut Ozil','I am the sort of player that likes to create goals. I think a lot of my team-mates know me as a player who is not selfish.')");
		db.execSQL("insert into mytable8 values(41,'–Cristiano Ronaldo','Maybe they hate me, because I am too good.')");
		db.execSQL("insert into mytable8 values(42,'–Wesley Sneijder','You usually see the coach on the field, but in the field Zanetti is your coach')");
		db.execSQL("insert into mytable8 values(43,'–Mesut Ozil','It makes me very happy when I create goals or score goals myself, but the most important thing is that the team reaches its goal and plays positive football.')");
		db.execSQL("insert into mytable8 values(44,'–Johan Cruff','Eric Cantona is a great player, but he is not as good as Ryan Giggs.')");
		db.execSQL("insert into mytable8 values(45,'–Marco Reus','Barca is nothing but small part of Real Madrid history.')");
		db.execSQL("insert into mytable8 values(46,'–Pep Guardiola','If you train badly, you play badly. If you work like a beast in training, you play the same way. And these guys, they train like beasts')");
		db.execSQL("insert into mytable8 values(47,'–Andrea Pirlo','I dont feel pressure. I spent July 9 2006 sleeping & playing the PlayStation. In the evening, I won the World Cup.')");
		db.execSQL("insert into mytable8 values(48,'–Louis Van Gaal','I have achieved more with Ajax in six years\n" +
				"than Barcelona has in one hundred years.')");
		db.execSQL("insert into mytable8 values(49,'–Carlo Ancelotti','All we lacked was a goal. We played well and controlled the play as we wanted, but we just couldnt break them down.')");

		db.execSQL("insert into mytable8 values(50,'–Frank Lampard','Losing two semi-finals in a row makes you even more determined to win it the next time.')");
		db.execSQL("insert into mytable8 values(51,'–Fabio Capello','Xavi is the best midfielder of the last decade.')");

		db.execSQL("insert into mytable8 values(52,'–Louis Van Gaal','I am not the kind of coach who just goes out and buys players for the sake of it. I am a coach who wants to – and can – improve players.')");
		db.execSQL("insert into mytable8 values(53,'–Sir Alex Ferguson','I dont think Iniesta and Xavi have ever given the ball away in their lives.')");
		db.execSQL("insert into mytable8 values(54,'–Pep Guardiola','Lahm is a scandal. He is super-intelligent, understands the game brilliantly, knows when to come inside or to stay wide. The guy is f****** exceptional')");
		db.execSQL("insert into mytable8 values(55,'–Carlo Ancelotti','John Terry is the captain of all team captains, he was born with the captains armband on his arm.')");


		db.execSQL("insert into mytable8 values(56,'Andrea Pirlo','Sterling was the only English player to cause me problems, very talented.')");
		db.execSQL("insert into mytable8 values(57,'Frank Lampard','Of course it is going to be difficult for any player to get in the Chelsea side no matter who they are.')");
		db.execSQL("insert into mytable8 values(58,'Marco Reus','I cried when Mario Gotze told me hell leave Borussia Dortmund & join Bayern Munich')");
		db.execSQL("insert into mytable8 values(59,'David Rocastle','Remember who you are, what you are and who you represent')");
		db.execSQL("insert into mytable8 values(60,'Mario Balotell','I think of him as being at the same level as Pirlo. Vision, technique, but he is powerful as well. Stevie can do anything. It is going to be very difficult to find another player like him in the future.')");

		
		  
		 // Detect touched area 
         detector = new SimpleGestureFilter(this,this);
         c=db.rawQuery("select * from mytable8", null);
	      c.moveToFirst();
	      number=c.getString(0);
	      name=c.getString(1);
	 	 quote=c.getString(2);
	 	//episode=c.getString(3);
	 	 
	 	 t1.setText(quote);
	 	 t2.setText(name);
	 	//t4.setText(episode);
	 	 t5.setText(number);
	 	Toast.makeText(this, "Swipe left or right to view the previous or next quote", Toast.LENGTH_LONG).show();
	 	
	

	 
		
		ImageView share=(ImageView)findViewById(R.id.share);
		share.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent shareIntent =   
						 new Intent(android.content.Intent.ACTION_SEND);  
						  
						//set the type  
						shareIntent.setType("text/plain");  
						  
						//add a subject  
						shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,   
						 "Seinfeld quote: ");
						  
						//build the body of the message to be shared  
						String shareMessage = quote+" \n"+name;  
						  
						//add the message  
						shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,   
						 shareMessage);  
						  
						//start the chooser for sharing  
						startActivity(Intent.createChooser(shareIntent,   
						 "Share the quote via"));  
			}
	});
	 	
	 	ImageView quote10=(ImageView)findViewById(R.id.quote10);
		quote10.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				onSwipe(SimpleGestureFilter.SWIPE_DOWN);
			}
	});
	
	}	
	
	public void change()
	{
		 Cursor c=db.rawQuery("select * from mytable8", null);
		 
	      c.moveToNext();
		
			
		 
	      String number=c.getString(0);
	      String name=c.getString(1);
	 	 String quote=c.getString(2);
	 	// String episode=c.getString(3);
	 	 
		 t1.setText(quote);
	 	 t2.setText(name);
	 	 //t4.setText(episode);
	 	 t5.setText(number);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
	
		
		
		switch(item.getItemId()){	
			
		
			
		case R.id.help:
			Intent i2=new Intent("android.intent.action.ABOUT");
			startActivity(i2);
			break;
			
//		case R.id.gesture:
//			Intent i2=new Intent("android.intent.action.GESTURE");
//			startActivity(i2);
//			break;
			
		case R.id.exit:
		//	String newUA= "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0";
		//	 ourBrow.getSettings().setUserAgentString(newUA);
			System.exit(0);
			break;
	}
	return false;
	}
	
	
	
	public boolean dispatchTouchEvent(MotionEvent me){
        // Call onTouchEvent of SimpleGestureFilter class
         this.detector.onTouchEvent(me);
       return super.dispatchTouchEvent(me);
    }
    @Override
     public void onSwipe(int direction) {
      String str = "";
      
 	 Cursor c=db.rawQuery("select * from mytable8", null);
	 c.moveToPosition(n);
		 
      switch (direction) {
      
      case SimpleGestureFilter.SWIPE_LEFT :
      if(n==74)
    	  Toast.makeText(this, "Can't go to next quote", Toast.LENGTH_SHORT).show();
      else
      {
      n++;
      c.moveToPosition(n);
      }


     break;
      case SimpleGestureFilter.SWIPE_RIGHT :
      if(n==0)
    	  Toast.makeText(this, "Can't go to previous quote", Toast.LENGTH_SHORT).show();
      else
      {
      n--;
      c.moveToPosition(n);
      }
    	  
      break;
      case SimpleGestureFilter.SWIPE_DOWN :
      Random randomGenerator = new Random();
      int randomInt = randomGenerator.nextInt(75);
      n=randomInt;
      c.moveToPosition(n);
                                                     break;
      case SimpleGestureFilter.SWIPE_UP :    str = "Swipe Up";
                                                     break;
      
      }

      number=c.getString(0);
      name=c.getString(1);
 	 quote=c.getString(2);
 	// episode=c.getString(3);
 	 
	 t1.setText(quote);
 	 t2.setText(name);
 	 //t4.setText(episode);
 	 t5.setText(number);
     }
      
     @Override
     public void onDoubleTap() {
    		android.text.ClipboardManager clipboard = (android.text.ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
			clipboard.setText(quote+" \n"+name);
            Toast.makeText(getApplicationContext(), "Text Copied To Clipboard", Toast.LENGTH_SHORT).show();
	
      
     }
          
  }
	

