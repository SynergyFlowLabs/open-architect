package androidx.work.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends androidx.room.migration.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f77297c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@NotNull Context mContext, int i10, int i11) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f77297c = mContext;
    }

    @Override // androidx.room.migration.b
    public void a(@NotNull w3.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        if (this.f75011b >= 10) {
            db2.da(androidx.work.impl.utils.t.f77262b, new Object[]{androidx.work.impl.utils.t.f77266f, 1});
        } else {
            this.f77297c.getSharedPreferences(androidx.work.impl.utils.t.f77264d, 0).edit().putBoolean(androidx.work.impl.utils.t.f77266f, true).apply();
        }
    }

    @NotNull
    public final Context b() {
        return this.f77297c;
    }
}
