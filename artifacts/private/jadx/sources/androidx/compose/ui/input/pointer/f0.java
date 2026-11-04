package androidx.compose.ui.input.pointer;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class f0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f39013l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f39014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f39015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f39016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f39017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f39018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f39019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f39020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f39021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final List<f> f39022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f39023j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f39024k;

    public /* synthetic */ f0(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, z10, f10, i10, z11, list, j14, j15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f0 m(f0 f0Var, long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15, int i11, Object obj) {
        long j16;
        long j17;
        long j18 = (i11 & 1) != 0 ? f0Var.f39014a : j10;
        long j19 = (i11 & 2) != 0 ? f0Var.f39015b : j11;
        long j20 = (i11 & 4) != 0 ? f0Var.f39016c : j12;
        long j21 = (i11 & 8) != 0 ? f0Var.f39017d : j13;
        boolean z12 = (i11 & 16) != 0 ? f0Var.f39018e : z10;
        float f11 = (i11 & 32) != 0 ? f0Var.f39019f : f10;
        int i12 = (i11 & 64) != 0 ? f0Var.f39020g : i10;
        boolean z13 = (i11 & 128) != 0 ? f0Var.f39021h : z11;
        List list2 = (i11 & 256) != 0 ? f0Var.f39022i : list;
        long j22 = (i11 & 512) != 0 ? f0Var.f39023j : j14;
        if ((i11 & 1024) != 0) {
            j17 = j22;
            j16 = f0Var.f39024k;
        } else {
            j16 = j15;
            j17 = j22;
        }
        return f0Var.l(j18, j19, j20, j21, z12, f11, i12, z13, list2, j17, j16);
    }

    public final long a() {
        return this.f39014a;
    }

    public final long b() {
        return this.f39023j;
    }

    public final long c() {
        return this.f39024k;
    }

    public final long d() {
        return this.f39015b;
    }

    public final long e() {
        return this.f39016c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return b0.d(this.f39014a, f0Var.f39014a) && this.f39015b == f0Var.f39015b && n0.g.l(this.f39016c, f0Var.f39016c) && n0.g.l(this.f39017d, f0Var.f39017d) && this.f39018e == f0Var.f39018e && Float.compare(this.f39019f, f0Var.f39019f) == 0 && r0.i(this.f39020g, f0Var.f39020g) && this.f39021h == f0Var.f39021h && Intrinsics.areEqual(this.f39022i, f0Var.f39022i) && n0.g.l(this.f39023j, f0Var.f39023j) && n0.g.l(this.f39024k, f0Var.f39024k);
    }

    public final long f() {
        return this.f39017d;
    }

    public final boolean g() {
        return this.f39018e;
    }

    public final float h() {
        return this.f39019f;
    }

    public int hashCode() {
        return (((((((((((((((((((b0.f(this.f39014a) * 31) + Long.hashCode(this.f39015b)) * 31) + n0.g.t(this.f39016c)) * 31) + n0.g.t(this.f39017d)) * 31) + Boolean.hashCode(this.f39018e)) * 31) + Float.hashCode(this.f39019f)) * 31) + r0.j(this.f39020g)) * 31) + Boolean.hashCode(this.f39021h)) * 31) + this.f39022i.hashCode()) * 31) + n0.g.t(this.f39023j)) * 31) + n0.g.t(this.f39024k);
    }

    public final int i() {
        return this.f39020g;
    }

    public final boolean j() {
        return this.f39021h;
    }

    @NotNull
    public final List<f> k() {
        return this.f39022i;
    }

    @NotNull
    public final f0 l(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, @NotNull List<f> list, long j14, long j15) {
        return new f0(j10, j11, j12, j13, z10, f10, i10, z11, list, j14, j15, null);
    }

    public final boolean n() {
        return this.f39021h;
    }

    public final boolean o() {
        return this.f39018e;
    }

    @NotNull
    public final List<f> p() {
        return this.f39022i;
    }

    public final long q() {
        return this.f39014a;
    }

    public final long r() {
        return this.f39024k;
    }

    public final long s() {
        return this.f39017d;
    }

    public final long t() {
        return this.f39016c;
    }

    @NotNull
    public String toString() {
        return "PointerInputEventData(id=" + ((Object) b0.g(this.f39014a)) + ", uptime=" + this.f39015b + ", positionOnScreen=" + ((Object) n0.g.z(this.f39016c)) + ", position=" + ((Object) n0.g.z(this.f39017d)) + ", down=" + this.f39018e + ", pressure=" + this.f39019f + ", type=" + ((Object) r0.k(this.f39020g)) + ", activeHover=" + this.f39021h + ", historical=" + this.f39022i + ", scrollDelta=" + ((Object) n0.g.z(this.f39023j)) + ", originalEventPosition=" + ((Object) n0.g.z(this.f39024k)) + ')';
    }

    public final float u() {
        return this.f39019f;
    }

    public final long v() {
        return this.f39023j;
    }

    public final int w() {
        return this.f39020g;
    }

    public final long x() {
        return this.f39015b;
    }

    private f0(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List<f> list, long j14, long j15) {
        this.f39014a = j10;
        this.f39015b = j11;
        this.f39016c = j12;
        this.f39017d = j13;
        this.f39018e = z10;
        this.f39019f = f10;
        this.f39020g = i10;
        this.f39021h = z11;
        this.f39022i = list;
        this.f39023j = j14;
        this.f39024k = j15;
    }

    public /* synthetic */ f0(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, z10, f10, i10, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? new ArrayList() : list, (i11 & 512) != 0 ? n0.g.f332700b.e() : j14, (i11 & 1024) != 0 ? n0.g.f332700b.e() : j15, null);
    }
}
