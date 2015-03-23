package com.lcbs.theresistanceavalon;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class InstructionsActivity extends ActionBarActivity {

    ListView stepsListView;

    String[] stepsList = {
            "\nWelcome to The Resistance: Avalon, a game of hidden loyalties.\n",
            "\nTo begin, select the number of players about to embark on quests.\n",
            "\nInput the names of all players in the order of which you are sitting.\n",
            "\nThe game will randomly assign players to the Good Team or the Evil Team. Tap the screen to reveal each individual role. Keep your role secret from the other players (have other players close their eyes)\n",
            "\nIf the game reveals that you are evil, it will also reveal the names of the other evil player(s).\n",
            "\nA player will be selected to be the quest leader. The leader selects the appropriate number of players to participate in a quest.\n",
            "\nPlayers tell the quest leader if they accept or reject the team. Majority rules the vote. If you are on the Good Team and suspect the team will fail the quest due to being evil, you should reject it. If you are evil and your evil teammates have been selected for the quest, you should accept it.\n",
            "\nIf the team is rejected, a new leader will be selected to put forth a new team. Be careful: if there are 5 teams rejected throughout the duration of the game, the evil team automatically wins.\n",
            "\nIf the team is accepted, the players participating in the quest pass the device to choose to pass or fail the quest. Good players must pass. Evil players may strategically choose to pass or fail.\n",
            "\nSee if the quest passes or fails! If there is at least one fail (some quests require two fails), this is a point for the evil team. If everyone passes the quest, this is a point for the good team.\n",
            "\nProgress through the various quests and the first team to receive 3 points wins!\n",
            "\nIf you need help throughout the game, look for this icon. Good luck, and welcome to The Resistance: Avalon!\n"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        ListView mainListView;
        ArrayAdapter mArrayAdapter;
        ArrayList mNameList = new ArrayList();
        stepsListView = (ListView) findViewById(R.id.steps_listview);
        mArrayAdapter = new ArrayAdapter(this, R.layout.list_colour_item,R.id.list_content, stepsList);
        stepsListView.setAdapter(mArrayAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_instructions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
