package com.planner5d.library.database.migration;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends androidx.room.migration.b {
    public n() {
        super(47, 48);
    }

    @Override // androidx.room.migration.b
    public void a(@NotNull w3.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        com.planner5d.library.database.m mVarH = com.planner5d.library.database.m.f154036c.h(db2);
        if (!mVarH.e("LogRecord", "stack_trace")) {
            db2.X8("ALTER TABLE `LogRecord` ADD COLUMN `stack_trace` TEXT DEFAULT NULL");
        }
        if (!mVarH.e("LogRecord", com.planner5d.library.model.manager.crashreporting.n.a.f191217d)) {
            db2.X8("ALTER TABLE `LogRecord` ADD COLUMN `installation_hash` TEXT DEFAULT NULL");
        }
        if (!mVarH.e("LogRecord", "system_information")) {
            db2.X8("ALTER TABLE `LogRecord` ADD COLUMN `system_information` TEXT DEFAULT NULL");
        }
        if (mVarH.e("LogRecord", "date_of_occurrence")) {
            return;
        }
        db2.X8("ALTER TABLE `LogRecord` ADD COLUMN `date_of_occurrence` INTEGER DEFAULT NULL");
    }
}
