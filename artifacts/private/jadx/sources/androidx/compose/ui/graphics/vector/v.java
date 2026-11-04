package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.o2;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.m2;
import androidx.compose.ui.graphics.u3;
import androidx.compose.ui.graphics.v3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@o2
public final class v extends t {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f38631s = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f38632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<h> f38633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f38634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final i0 f38635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f38636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final i0 f38637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f38638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f38639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f38640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f38641k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f38642l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f38643m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f38644n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float f38645o;

    public /* synthetic */ v(String str, List list, int i10, i0 i0Var, float f10, i0 i0Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i10, i0Var, f10, i0Var2, f11, f12, i11, i12, f13, f14, f15, f16);
    }

    public final float A() {
        return this.f38645o;
    }

    public final float B() {
        return this.f38643m;
    }

    @Nullable
    public final i0 c() {
        return this.f38635e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v.class == obj.getClass()) {
            v vVar = (v) obj;
            return Intrinsics.areEqual(this.f38632b, vVar.f38632b) && Intrinsics.areEqual(this.f38635e, vVar.f38635e) && this.f38636f == vVar.f38636f && Intrinsics.areEqual(this.f38637g, vVar.f38637g) && this.f38638h == vVar.f38638h && this.f38639i == vVar.f38639i && u3.g(this.f38640j, vVar.f38640j) && v3.g(this.f38641k, vVar.f38641k) && this.f38642l == vVar.f38642l && this.f38643m == vVar.f38643m && this.f38644n == vVar.f38644n && this.f38645o == vVar.f38645o && m2.f(this.f38634d, vVar.f38634d) && Intrinsics.areEqual(this.f38633c, vVar.f38633c);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((this.f38632b.hashCode() * 31) + this.f38633c.hashCode()) * 31;
        i0 i0Var = this.f38635e;
        int iHashCode2 = (((iHashCode + (i0Var != null ? i0Var.hashCode() : 0)) * 31) + Float.hashCode(this.f38636f)) * 31;
        i0 i0Var2 = this.f38637g;
        return ((((((((((((((((((iHashCode2 + (i0Var2 != null ? i0Var2.hashCode() : 0)) * 31) + Float.hashCode(this.f38638h)) * 31) + Float.hashCode(this.f38639i)) * 31) + u3.h(this.f38640j)) * 31) + v3.h(this.f38641k)) * 31) + Float.hashCode(this.f38642l)) * 31) + Float.hashCode(this.f38643m)) * 31) + Float.hashCode(this.f38644n)) * 31) + Float.hashCode(this.f38645o)) * 31) + m2.g(this.f38634d);
    }

    public final float i() {
        return this.f38636f;
    }

    @NotNull
    public final String k() {
        return this.f38632b;
    }

    @NotNull
    public final List<h> l() {
        return this.f38633c;
    }

    public final int m() {
        return this.f38634d;
    }

    @Nullable
    public final i0 n() {
        return this.f38637g;
    }

    public final float p() {
        return this.f38638h;
    }

    public final int s() {
        return this.f38640j;
    }

    public final int t() {
        return this.f38641k;
    }

    public final float u() {
        return this.f38642l;
    }

    public final float v() {
        return this.f38639i;
    }

    public final float w() {
        return this.f38644n;
    }

    public /* synthetic */ v(String str, List list, int i10, i0 i0Var, float f10, i0 i0Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, list, i10, (i13 & 8) != 0 ? null : i0Var, (i13 & 16) != 0 ? 1.0f : f10, (i13 & 32) != 0 ? null : i0Var2, (i13 & 64) != 0 ? 1.0f : f11, (i13 & 128) != 0 ? 0.0f : f12, (i13 & 256) != 0 ? s.d() : i11, (i13 & 512) != 0 ? s.e() : i12, (i13 & 1024) != 0 ? 4.0f : f13, (i13 & 2048) != 0 ? 0.0f : f14, (i13 & 4096) != 0 ? 1.0f : f15, (i13 & 8192) != 0 ? 0.0f : f16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private v(String str, List<? extends h> list, int i10, i0 i0Var, float f10, i0 i0Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        super(null);
        this.f38632b = str;
        this.f38633c = list;
        this.f38634d = i10;
        this.f38635e = i0Var;
        this.f38636f = f10;
        this.f38637g = i0Var2;
        this.f38638h = f11;
        this.f38639i = f12;
        this.f38640j = i11;
        this.f38641k = i12;
        this.f38642l = f13;
        this.f38643m = f14;
        this.f38644n = f15;
        this.f38645o = f16;
    }
}
