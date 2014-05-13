package ws.legrand.Minuteur.app;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by benjamin on 12/05/14.
 */
public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences);
    }
}