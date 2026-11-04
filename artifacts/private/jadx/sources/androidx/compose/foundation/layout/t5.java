package androidx.compose.foundation.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class t5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f16438e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f16439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private k1 f16441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private l2 f16442d;

    public t5() {
        this(0.0f, false, null, null, 15, null);
    }

    public static /* synthetic */ t5 f(t5 t5Var, float f10, boolean z10, k1 k1Var, l2 l2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = t5Var.f16439a;
        }
        if ((i10 & 2) != 0) {
            z10 = t5Var.f16440b;
        }
        if ((i10 & 4) != 0) {
            k1Var = t5Var.f16441c;
        }
        if ((i10 & 8) != 0) {
            l2Var = t5Var.f16442d;
        }
        return t5Var.e(f10, z10, k1Var, l2Var);
    }

    public final float a() {
        return this.f16439a;
    }

    public final boolean b() {
        return this.f16440b;
    }

    @Nullable
    public final k1 c() {
        return this.f16441c;
    }

    @Nullable
    public final l2 d() {
        return this.f16442d;
    }

    @NotNull
    public final t5 e(float f10, boolean z10, @Nullable k1 k1Var, @Nullable l2 l2Var) {
        return new t5(f10, z10, k1Var, l2Var);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj;
        return Float.compare(this.f16439a, t5Var.f16439a) == 0 && this.f16440b == t5Var.f16440b && Intrinsics.areEqual(this.f16441c, t5Var.f16441c) && Intrinsics.areEqual(this.f16442d, t5Var.f16442d);
    }

    @Nullable
    public final k1 g() {
        return this.f16441c;
    }

    public final boolean h() {
        return this.f16440b;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.f16439a) * 31) + Boolean.hashCode(this.f16440b)) * 31;
        k1 k1Var = this.f16441c;
        int iHashCode2 = 0;
        int i10 = 7 | 0;
        int iHashCode3 = (iHashCode + (k1Var == null ? 0 : k1Var.hashCode())) * 31;
        l2 l2Var = this.f16442d;
        if (l2Var != null) {
            iHashCode2 = l2Var.hashCode();
        }
        return iHashCode3 + iHashCode2;
    }

    @Nullable
    public final l2 i() {
        return this.f16442d;
    }

    public final float j() {
        return this.f16439a;
    }

    public final void k(@Nullable k1 k1Var) {
        this.f16441c = k1Var;
    }

    public final void l(boolean z10) {
        this.f16440b = z10;
    }

    public final void m(@Nullable l2 l2Var) {
        this.f16442d = l2Var;
    }

    public final void n(float f10) {
        this.f16439a = f10;
    }

    @NotNull
    public String toString() {
        return "RowColumnParentData(weight=" + this.f16439a + ", fill=" + this.f16440b + ", crossAxisAlignment=" + this.f16441c + ", flowLayoutData=" + this.f16442d + ')';
    }

    public t5(float f10, boolean z10, @Nullable k1 k1Var, @Nullable l2 l2Var) {
        this.f16439a = f10;
        this.f16440b = z10;
        this.f16441c = k1Var;
        this.f16442d = l2Var;
    }

    public /* synthetic */ t5(float f10, boolean z10, k1 k1Var, l2 l2Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : k1Var, (i10 & 8) != 0 ? null : l2Var);
    }
}
