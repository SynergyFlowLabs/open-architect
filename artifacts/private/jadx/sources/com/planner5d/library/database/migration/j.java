package com.planner5d.library.database.migration;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends androidx.room.migration.b {
    public j() {
        super(41, 42);
    }

    @Override // androidx.room.migration.b
    public void a(@NotNull w3.d database) {
        Intrinsics.checkNotNullParameter(database, "database");
        com.planner5d.library.database.m mVarH = com.planner5d.library.database.m.f154036c.h(database);
        if (!mVarH.e("auto_style", "progress")) {
            mVarH.a("auto_style", "progress", "DECIMAL(3,2)");
        }
    }
}
