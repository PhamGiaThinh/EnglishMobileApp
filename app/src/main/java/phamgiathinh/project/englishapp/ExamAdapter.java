package phamgiathinh.project.englishapp;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ExamAdapter extends FragmentStatePagerAdapter {
    public ExamAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new ExamFragment();
    }

    @Override
    public int getCount() {
        return 5;
    }
}
