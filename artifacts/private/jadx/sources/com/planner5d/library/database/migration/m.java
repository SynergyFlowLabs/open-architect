package com.planner5d.library.database.migration;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends androidx.room.migration.b {
    public m() {
        super(46, 47);
    }

    @Override // androidx.room.migration.b
    public void a(@NotNull w3.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        if (!com.planner5d.library.database.m.f154036c.h(db2).e("document", "remote")) {
            db2.X8("ALTER TABLE `document` ADD COLUMN `remote` INTEGER NOT NULL DEFAULT FALSE");
        }
    }
}
