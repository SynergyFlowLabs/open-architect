package com.planner5d.library.database.migration;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends androidx.room.migration.b {
    public l() {
        super(44, 45);
    }

    @Override // androidx.room.migration.b
    public void a(@NotNull w3.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        if (!com.planner5d.library.database.m.f154036c.h(db2).e("document", "uri")) {
            db2.X8("ALTER TABLE `document` ADD COLUMN `uri` TEXT DEFAULT NULL");
            db2.X8("ALTER TABLE `document` ADD COLUMN `local` INTEGER NOT NULL DEFAULT TRUE");
        }
    }
}
