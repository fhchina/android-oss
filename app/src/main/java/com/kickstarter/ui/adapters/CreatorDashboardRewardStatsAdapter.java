package com.kickstarter.ui.adapters;


import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.View;

import com.kickstarter.ui.viewholders.CreatorDashboardRewardStatsViewHolder;
import com.kickstarter.ui.viewholders.KSViewHolder;

public class CreatorDashboardRewardStatsAdapter extends KSAdapter {

  protected @LayoutRes int layout(final @NonNull SectionRow sectionRow) {
    return 0;
  }

  protected @NonNull KSViewHolder viewHolder(final @LayoutRes int layout, final @NonNull View view) {
    return new CreatorDashboardRewardStatsViewHolder(view);
  }
}
