package com.kickstarter.viewmodels.inputs;

import com.kickstarter.models.Project;
import com.kickstarter.models.ProjectStatsEnvelope;

public interface CreatorDashboardRewardStatsViewModelInputs {
  void projectAndStats(Project project, ProjectStatsEnvelope projectStatsEnvelope);
}
