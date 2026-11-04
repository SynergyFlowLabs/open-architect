package androidx.work.impl;

import androidx.room.b2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends b2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.work.b f76815a;

    public d(@NotNull androidx.work.b clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f76815a = clock;
    }

    private final long e() {
        return this.f76815a.currentTimeMillis() - e0.f76821c;
    }

    private final String f() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + e() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    @Override // androidx.room.b2.b
    public void c(@NotNull w3.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        super.c(db2);
        db2.Q1();
        try {
            db2.X8(f());
            db2.W9();
            db2.Ea();
        } catch (Throwable th2) {
            db2.Ea();
            throw th2;
        }
    }

    @NotNull
    public final androidx.work.b d() {
        return this.f76815a;
    }
}
