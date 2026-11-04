package androidx.work.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends androidx.room.migration.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f77135c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(@NotNull Context context) {
        super(9, 10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77135c = context;
    }

    @Override // androidx.room.migration.b
    public void a(@NotNull w3.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.X8(androidx.work.impl.utils.t.f77263c);
        androidx.work.impl.utils.t.f(this.f77135c, db2);
        androidx.work.impl.utils.m.c(this.f77135c, db2);
    }
}
