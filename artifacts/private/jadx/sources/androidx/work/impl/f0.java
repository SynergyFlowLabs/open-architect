package androidx.work.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f76822a = "\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f76823b = "\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f76824c = "\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f76825d = "DROP TABLE IF EXISTS alarmInfo";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f76826e = "ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final String f76827f = "ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f76828g = "\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final String f76829h = "\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final String f76830i = "ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final String f76831j = "ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f76832k = "UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final String f76833l = "UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final String f76834m = "UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0";
}
