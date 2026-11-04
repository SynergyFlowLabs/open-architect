package com.planner5d.library.database.migration;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends androidx.room.migration.b {
    public o() {
        super(48, 49);
    }

    @Override // androidx.room.migration.b
    public void a(@NotNull w3.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        if (com.planner5d.library.database.m.f154036c.h(db2).e("space", "user_id")) {
            return;
        }
        db2.X8("ALTER TABLE `space` ADD COLUMN `user_id` INTEGER NOT NULL DEFAULT 0");
    }
}
