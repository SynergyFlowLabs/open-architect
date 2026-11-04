package com.planner5d.library.database.migration;

import io.sentry.protocol.a0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends androidx.room.migration.b {
    public f() {
        super(35, 36);
    }

    @Override // androidx.room.migration.b
    public void a(@NotNull w3.d database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (!com.planner5d.library.database.m.f154036c.h(database).e(a0.b.f306128c, "new")) {
            database.X8("ALTER TABLE `snapshot` ADD COLUMN `new` BOOLEAN DEFAULT null");
        }
    }
}
