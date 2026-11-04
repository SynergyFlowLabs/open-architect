package androidx.compose.foundation;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class f implements y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f14225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.d f14226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f14227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.layout.g5 f14228d;

    public /* synthetic */ f(Context context, androidx.compose.ui.unit.d dVar, long j10, androidx.compose.foundation.layout.g5 g5Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, dVar, j10, g5Var);
    }

    @Override // androidx.compose.foundation.y3
    @NotNull
    public x3 a() {
        return new e(this.f14225a, this.f14226b, this.f14227c, this.f14228d, null);
    }

    @Override // androidx.compose.foundation.y3
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(f.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f14225a, fVar.f14225a) && Intrinsics.areEqual(this.f14226b, fVar.f14226b) && androidx.compose.ui.graphics.q0.y(this.f14227c, fVar.f14227c) && Intrinsics.areEqual(this.f14228d, fVar.f14228d);
    }

    @Override // androidx.compose.foundation.y3
    public int hashCode() {
        return (((((this.f14225a.hashCode() * 31) + this.f14226b.hashCode()) * 31) + androidx.compose.ui.graphics.q0.K(this.f14227c)) * 31) + this.f14228d.hashCode();
    }

    private f(Context context, androidx.compose.ui.unit.d dVar, long j10, androidx.compose.foundation.layout.g5 g5Var) {
        this.f14225a = context;
        this.f14226b = dVar;
        this.f14227c = j10;
        this.f14228d = g5Var;
    }

    public /* synthetic */ f(Context context, androidx.compose.ui.unit.d dVar, long j10, androidx.compose.foundation.layout.g5 g5Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, dVar, (i10 & 4) != 0 ? t.f18749b : j10, (i10 & 8) != 0 ? t.f18750c : g5Var, null);
    }
}
