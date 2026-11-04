package com.planner5d.library.database.migration;

import com.devtodev.analytics.internal.storage.sqlite.PeopleCardEntry;
import com.devtodev.core.data.metrics.MetricConsts;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends androidx.room.migration.b {
    public g() {
        super(37, 38);
    }

    @Override // androidx.room.migration.b
    public void a(@NotNull w3.d database) {
        Intrinsics.checkNotNullParameter(database, "database");
        com.planner5d.library.database.m mVarH = com.planner5d.library.database.m.f154036c.h(database);
        if (!mVarH.e("chat_messages", PeopleCardEntry.json)) {
            database.X8("ALTER TABLE `chat_messages` ADD COLUMN `json` TEXT");
        }
        if (mVarH.e("chat_messages", MetricConsts.ApplicationInfo)) {
            return;
        }
        database.X8("ALTER TABLE `chat_messages` ADD COLUMN `ai` INTEGER");
    }
}
