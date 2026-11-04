package com.planner5d.library.database.migration;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends androidx.room.migration.b {
    public i() {
        super(40, 41);
    }

    @Override // androidx.room.migration.b
    public void a(@NotNull w3.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        com.planner5d.library.database.m mVarH = com.planner5d.library.database.m.f154036c.h(db2);
        if (!mVarH.e("logrecord", "date_until_next_record")) {
            db2.X8("ALTER TABLE `logrecord` ADD COLUMN `date_until_next_record` INTEGER DEFAULT NULL");
        }
        if (!mVarH.e("logrecord", "posted")) {
            db2.X8("ALTER TABLE `logrecord` ADD COLUMN `posted` BOOLEAN DEFAULT NULL");
            db2.X8("UPDATE `logrecord` SET `posted` = 0");
        }
    }
}
