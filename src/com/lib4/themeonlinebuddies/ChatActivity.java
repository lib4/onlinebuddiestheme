package com.lib4.themeonlinebuddies;

import com.lib4.themenonlinebuddies.fragments.ChatFragment;
import com.lib4.themenonlinebuddies.fragments.OnlineUsersFragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class ChatActivity extends BaseActivity{

	ChatFragment mChatFragment;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		loadChatFragment();
		initializeDrawer();
	}
	
	

	/**
	 * Load the SignIn fragment
	 * 
	 */

	private void loadChatFragment() {

		mChatFragment = new ChatFragment();
		
		FragmentManager fragmentManager = getFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager
				.beginTransaction();

		// fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit,
		// R.anim.pop_enter, R.anim.pop_exit);
		// Replace whatever is in the fragment_container view with this
		// fragment,
		// and add the transaction to the back stack
		fragmentTransaction.replace(R.id.fragment_holder, mChatFragment,ChatFragment.class.getName());

		// Commit the transaction
		fragmentTransaction.commit();

	}

}
