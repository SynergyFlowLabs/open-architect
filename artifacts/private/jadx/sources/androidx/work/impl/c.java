package androidx.work.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements androidx.room.migration.a {
    @Override // androidx.room.migration.a
    public void a(@NotNull w3.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.X8("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }
}
