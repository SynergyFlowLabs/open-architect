package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class a5<V extends w> implements w4<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a1 f12769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V f12770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private V f12771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private V f12772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f12773e;

    public a5(@NotNull a1 a1Var) {
        this.f12769a = a1Var;
        this.f12773e = a1Var.a();
    }

    @Override // androidx.compose.animation.core.w4
    public float a() {
        return this.f12773e;
    }

    @Override // androidx.compose.animation.core.w4
    @NotNull
    public V b(long j10, @NotNull V v10, @NotNull V v11) {
        if (this.f12771c == null) {
            this.f12771c = (V) x.g(v10);
        }
        V v12 = this.f12771c;
        if (v12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v12 = null;
        }
        int iB = v12.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v13 = this.f12771c;
            if (v13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                v13 = null;
            }
            v13.e(i10, this.f12769a.b(j10, v10.a(i10), v11.a(i10)));
        }
        V v14 = this.f12771c;
        if (v14 != null) {
            return v14;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.w4
    public long c(@NotNull V v10, @NotNull V v11) {
        if (this.f12771c == null) {
            this.f12771c = (V) x.g(v10);
        }
        V v12 = this.f12771c;
        if (v12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v12 = null;
        }
        int iB = v12.b();
        long jMax = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            jMax = Math.max(jMax, this.f12769a.c(v10.a(i10), v11.a(i10)));
        }
        return jMax;
    }

    @Override // androidx.compose.animation.core.w4
    @NotNull
    public V d(@NotNull V v10, @NotNull V v11) {
        if (this.f12772d == null) {
            this.f12772d = (V) x.g(v10);
        }
        V v12 = this.f12772d;
        if (v12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetVector");
            v12 = null;
        }
        int iB = v12.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v13 = this.f12772d;
            if (v13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("targetVector");
                v13 = null;
            }
            v13.e(i10, this.f12769a.d(v10.a(i10), v11.a(i10)));
        }
        V v14 = this.f12772d;
        if (v14 != null) {
            return v14;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetVector");
        return null;
    }

    @Override // androidx.compose.animation.core.w4
    @NotNull
    public V e(long j10, @NotNull V v10, @NotNull V v11) {
        if (this.f12770b == null) {
            this.f12770b = (V) x.g(v10);
        }
        V v12 = this.f12770b;
        if (v12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v12 = null;
        }
        int iB = v12.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v13 = this.f12770b;
            if (v13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                v13 = null;
            }
            v13.e(i10, this.f12769a.e(j10, v10.a(i10), v11.a(i10)));
        }
        V v14 = this.f12770b;
        if (v14 != null) {
            return v14;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @NotNull
    public final a1 f() {
        return this.f12769a;
    }
}
