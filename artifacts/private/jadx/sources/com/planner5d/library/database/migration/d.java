package com.planner5d.library.database.migration;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends androidx.room.migration.b {
    public d() {
        super(32, 33);
    }

    @Override // androidx.room.migration.b
    public void a(@NotNull w3.d database) {
        Intrinsics.checkNotNullParameter(database, "database");
        com.planner5d.library.database.m mVarH = com.planner5d.library.database.m.f154036c.h(database);
        if (!mVarH.e("payment", "auto_renewing")) {
            database.X8("ALTER TABLE `payment` ADD COLUMN `auto_renewing` BOOLEAN DEFAULT null");
        }
        if (mVarH.e("payment", "expire_time")) {
            return;
        }
        database.X8("ALTER TABLE `payment` ADD COLUMN `expire_time` INTEGER DEFAULT null");
    }
}
