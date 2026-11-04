package androidx.work.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends androidx.room.migration.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final k f76900c = new k();

    private k() {
        super(1, 2);
    }

    @Override // androidx.room.migration.b
    public void a(@NotNull w3.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.X8("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        db2.X8("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        db2.X8("DROP TABLE IF EXISTS alarmInfo");
        db2.X8("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
