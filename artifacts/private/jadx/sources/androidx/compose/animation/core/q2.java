package androidx.compose.animation.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
public final class q2<T> implements y0<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13240d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f13241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f13242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final T f13243c;

    public q2() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof q2) {
            q2 q2Var = (q2) obj;
            if (q2Var.f13241a == this.f13241a && q2Var.f13242b == this.f13242b && Intrinsics.areEqual(q2Var.f13243c, this.f13243c)) {
                return true;
            }
        }
        return false;
    }

    public final float h() {
        return this.f13241a;
    }

    public int hashCode() {
        T t10 = this.f13243c;
        return ((((t10 != null ? t10.hashCode() : 0) * 31) + Float.hashCode(this.f13241a)) * 31) + Float.hashCode(this.f13242b);
    }

    public final float i() {
        return this.f13242b;
    }

    @Nullable
    public final T j() {
        return this.f13243c;
    }

    @Override // androidx.compose.animation.core.y0, androidx.compose.animation.core.o
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public <V extends w> h5<V> a(@NotNull z3<T, V> z3Var) {
        return new h5<>(this.f13241a, this.f13242b, p.b(z3Var, this.f13243c));
    }

    public q2(float f10, float f11, @Nullable T t10) {
        this.f13241a = f10;
        this.f13242b = f11;
        this.f13243c = t10;
    }

    public /* synthetic */ q2(float f10, float f11, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? null : obj);
    }
}
