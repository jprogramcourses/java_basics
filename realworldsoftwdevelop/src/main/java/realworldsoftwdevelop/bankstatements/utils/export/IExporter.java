package realworldsoftwdevelop.bankstatements.utils.export;

import realworldsoftwdevelop.bankstatements.entity.SummaryStatistics;

public interface IExporter {

    String export(SummaryStatistics summaryStatistics);

}
