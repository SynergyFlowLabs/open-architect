package com.planner5d.library.database.migration;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends androidx.room.migration.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f154078c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@NotNull Function0<Unit> currentEventsRemover) {
        super(49, 50);
        Intrinsics.checkNotNullParameter(currentEventsRemover, "currentEventsRemover");
        this.f154078c = currentEventsRemover;
    }

    @Override // androidx.room.migration.b
    public void a(@NotNull w3.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.X8("DROP TABLE IF EXISTS `statistics_events`");
        this.f154078c.invoke();
    }
}
