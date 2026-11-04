package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.o2;
import java.util.List;
import kotlin.b1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@o2
public final class c0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f38978q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f38979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f38980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f38981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f38982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f38983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f38984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f38985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f38986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f38987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f38988j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private List<f> f38989k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f38990l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f38991m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f38992n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private c0 f38993o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private e f38994p;

    public /* synthetic */ c0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15);
    }

    private static /* synthetic */ void E() {
    }

    public static /* synthetic */ c0 c(c0 c0Var, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, e eVar, int i10, long j15, int i11, Object obj) {
        long j16;
        long j17 = (i11 & 1) != 0 ? c0Var.f38979a : j10;
        long j18 = (i11 & 2) != 0 ? c0Var.f38980b : j11;
        long j19 = (i11 & 4) != 0 ? c0Var.f38981c : j12;
        boolean z12 = (i11 & 8) != 0 ? c0Var.f38982d : z10;
        long j20 = (i11 & 16) != 0 ? c0Var.f38984f : j13;
        long j21 = (i11 & 32) != 0 ? c0Var.f38985g : j14;
        boolean z13 = (i11 & 64) != 0 ? c0Var.f38986h : z11;
        int i12 = (i11 & 256) != 0 ? c0Var.f38987i : i10;
        if ((i11 & 512) != 0) {
            j16 = c0Var.f38988j;
            j17 = j17;
        } else {
            j16 = j15;
        }
        return c0Var.b(j17, j18, j19, z12, j20, j21, z13, eVar, i12, j16);
    }

    public static /* synthetic */ c0 g(c0 c0Var, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, long j15, int i11, Object obj) {
        long j16;
        long j17;
        long j18 = (i11 & 1) != 0 ? c0Var.f38979a : j10;
        long j19 = (i11 & 2) != 0 ? c0Var.f38980b : j11;
        long j20 = (i11 & 4) != 0 ? c0Var.f38981c : j12;
        boolean z12 = (i11 & 8) != 0 ? c0Var.f38982d : z10;
        long j21 = (i11 & 16) != 0 ? c0Var.f38984f : j13;
        long j22 = (i11 & 32) != 0 ? c0Var.f38985g : j14;
        boolean z13 = (i11 & 64) != 0 ? c0Var.f38986h : z11;
        int i12 = (i11 & 128) != 0 ? c0Var.f38987i : i10;
        if ((i11 & 256) != 0) {
            j16 = c0Var.f38988j;
            j17 = j18;
        } else {
            j16 = j15;
            j17 = j18;
        }
        return c0Var.f(j17, j19, j20, z12, j21, j22, z13, i12, j16);
    }

    public static /* synthetic */ c0 i(c0 c0Var, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List list, long j15, int i11, Object obj) {
        long j16;
        long j17 = (i11 & 1) != 0 ? c0Var.f38979a : j10;
        long j18 = (i11 & 2) != 0 ? c0Var.f38980b : j11;
        long j19 = (i11 & 4) != 0 ? c0Var.f38981c : j12;
        boolean z12 = (i11 & 8) != 0 ? c0Var.f38982d : z10;
        long j20 = (i11 & 16) != 0 ? c0Var.f38984f : j13;
        long j21 = (i11 & 32) != 0 ? c0Var.f38985g : j14;
        boolean z13 = (i11 & 64) != 0 ? c0Var.f38986h : z11;
        int i12 = (i11 & 128) != 0 ? c0Var.f38987i : i10;
        if ((i11 & 512) != 0) {
            j16 = c0Var.f38988j;
            j17 = j17;
        } else {
            j16 = j15;
        }
        return c0Var.h(j17, j18, j19, z12, j20, j21, z13, i12, list, j16);
    }

    public static /* synthetic */ c0 k(c0 c0Var, long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, long j15, int i11, Object obj) {
        long j16;
        long j17;
        long j18 = (i11 & 1) != 0 ? c0Var.f38979a : j10;
        long j19 = (i11 & 2) != 0 ? c0Var.f38980b : j11;
        long j20 = (i11 & 4) != 0 ? c0Var.f38981c : j12;
        boolean z12 = (i11 & 8) != 0 ? c0Var.f38982d : z10;
        float f11 = (i11 & 16) != 0 ? c0Var.f38983e : f10;
        long j21 = (i11 & 32) != 0 ? c0Var.f38984f : j13;
        long j22 = (i11 & 64) != 0 ? c0Var.f38985g : j14;
        boolean z13 = (i11 & 128) != 0 ? c0Var.f38986h : z11;
        int i12 = (i11 & 256) != 0 ? c0Var.f38987i : i10;
        if ((i11 & 512) != 0) {
            j16 = c0Var.f38988j;
            j17 = j18;
        } else {
            j16 = j15;
            j17 = j18;
        }
        return c0Var.j(j17, j19, j20, z12, f11, j21, j22, z13, i12, j16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c0 m(c0 c0Var, long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, List list, long j15, int i11, Object obj) {
        long j16;
        List list2;
        long j17 = (i11 & 1) != 0 ? c0Var.f38979a : j10;
        long j18 = (i11 & 2) != 0 ? c0Var.f38980b : j11;
        long j19 = (i11 & 4) != 0 ? c0Var.f38981c : j12;
        boolean z12 = (i11 & 8) != 0 ? c0Var.f38982d : z10;
        float f11 = (i11 & 16) != 0 ? c0Var.f38983e : f10;
        long j20 = (i11 & 32) != 0 ? c0Var.f38984f : j13;
        long j21 = (i11 & 64) != 0 ? c0Var.f38985g : j14;
        boolean z13 = (i11 & 128) != 0 ? c0Var.f38986h : z11;
        int i12 = (i11 & 256) != 0 ? c0Var.f38987i : i10;
        long j22 = j17;
        List listR = (i11 & 512) != 0 ? c0Var.r() : list;
        if ((i11 & 1024) != 0) {
            list2 = listR;
            j16 = c0Var.f38988j;
        } else {
            j16 = j15;
            list2 = listR;
        }
        return c0Var.l(j22, j18, j19, z12, f11, j20, j21, z13, i12, list2, j16);
    }

    @kotlin.l(message = "use isConsumed and consume() pair of methods instead")
    public static /* synthetic */ void o() {
    }

    public final long A() {
        return this.f38984f;
    }

    public final long B() {
        return this.f38988j;
    }

    public final int C() {
        return this.f38987i;
    }

    public final long D() {
        return this.f38980b;
    }

    public final boolean F() {
        c0 c0Var = this.f38993o;
        if (c0Var != null) {
            return c0Var.F();
        }
        return this.f38991m || this.f38992n;
    }

    public final void G(@Nullable c0 c0Var) {
        this.f38993o = c0Var;
    }

    public final void H(boolean z10) {
        this.f38991m = z10;
    }

    public final void I(long j10) {
        this.f38990l = j10;
    }

    public final void J(boolean z10) {
        this.f38992n = z10;
    }

    public final void a() {
        c0 c0Var = this.f38993o;
        if (c0Var == null) {
            this.f38991m = true;
            this.f38992n = true;
        } else if (c0Var != null) {
            c0Var.a();
        }
    }

    @kotlin.l(message = "Partial consumption has been deprecated. Use copy() instead without `consumed` parameter to create a shallow copy or a constructor to create a new PointerInputChange", replaceWith = @b1(expression = "copy(id, currentTime, currentPosition, currentPressed, previousTime, previousPosition, previousPressed, type, scrollDelta)", imports = {}))
    @NotNull
    public final c0 b(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, @NotNull e eVar, int i10, long j15) {
        c0 c0Var = new c0(j10, j11, j12, z10, this.f38983e, j13, j14, z11, eVar.a() || eVar.c(), i10, r(), j15, this.f38990l, null);
        c0Var.f38992n = this.f38992n;
        c0Var.f38991m = this.f38991m;
        return c0Var;
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use another copy() method with scrollDelta parameter instead", replaceWith = @b1(expression = "copy(id,currentTime, currentPosition, currentPressed, previousTime,previousPosition, previousPressed, consumed, type, this.scrollDelta)", imports = {}))
    public final /* synthetic */ c0 d(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, e eVar, int i10) {
        c0 c0Var = new c0(j10, j11, j12, z10, this.f38983e, j13, j14, z11, eVar.a() || eVar.c(), i10, r(), this.f38988j, this.f38990l, null);
        c0Var.f38992n = this.f38992n;
        c0Var.f38991m = this.f38991m;
        return c0Var;
    }

    @NotNull
    public final c0 f(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, long j15) {
        c0 c0Var = this;
        c0 c0VarL = c0Var.l(j10, j11, j12, z10, c0Var.f38983e, j13, j14, z11, i10, c0Var.r(), j15);
        c0 c0Var2 = c0Var.f38993o;
        if (c0Var2 != null) {
            c0Var = c0Var2;
        }
        c0VarL.f38993o = c0Var;
        return c0VarL;
    }

    @androidx.compose.ui.o
    @NotNull
    public final c0 h(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, @NotNull List<f> list, long j15) {
        c0 c0Var = this;
        c0 c0VarL = c0Var.l(j10, j11, j12, z10, c0Var.f38983e, j13, j14, z11, i10, list, j15);
        c0 c0Var2 = c0Var.f38993o;
        if (c0Var2 != null) {
            c0Var = c0Var2;
        }
        c0VarL.f38993o = c0Var;
        return c0VarL;
    }

    @NotNull
    public final c0 j(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, long j15) {
        c0 c0Var = this;
        c0 c0Var2 = new c0(j10, j11, j12, z10, f10, j13, j14, z11, false, i10, c0Var.r(), j15, c0Var.f38990l, null);
        c0 c0Var3 = c0Var.f38993o;
        if (c0Var3 != null) {
            c0Var = c0Var3;
        }
        c0Var2.f38993o = c0Var;
        return c0Var2;
    }

    @NotNull
    public final c0 l(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, @NotNull List<f> list, long j15) {
        c0 c0Var = this;
        c0 c0Var2 = new c0(j10, j11, j12, z10, f10, j13, j14, z11, false, i10, list, j15, c0Var.f38990l, null);
        c0 c0Var3 = c0Var.f38993o;
        if (c0Var3 != null) {
            c0Var = c0Var3;
        }
        c0Var2.f38993o = c0Var;
        return c0Var2;
    }

    @NotNull
    public final e n() {
        if (this.f38994p == null) {
            this.f38994p = new e(this);
        }
        e eVar = this.f38994p;
        Intrinsics.checkNotNull(eVar);
        return eVar;
    }

    @Nullable
    public final c0 p() {
        return this.f38993o;
    }

    public final boolean q() {
        return this.f38991m;
    }

    @NotNull
    public final List<f> r() {
        List<f> listEmptyList = this.f38989k;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return listEmptyList;
    }

    public final long s() {
        return this.f38979a;
    }

    public final long t() {
        return this.f38990l;
    }

    @NotNull
    public String toString() {
        return "PointerInputChange(id=" + ((Object) b0.g(this.f38979a)) + ", uptimeMillis=" + this.f38980b + ", position=" + ((Object) n0.g.z(this.f38981c)) + ", pressed=" + this.f38982d + ", pressure=" + this.f38983e + ", previousUptimeMillis=" + this.f38984f + ", previousPosition=" + ((Object) n0.g.z(this.f38985g)) + ", previousPressed=" + this.f38986h + ", isConsumed=" + F() + ", type=" + ((Object) r0.k(this.f38987i)) + ", historical=" + r() + ",scrollDelta=" + ((Object) n0.g.z(this.f38988j)) + ')';
    }

    public final long u() {
        return this.f38981c;
    }

    public final boolean v() {
        return this.f38992n;
    }

    public final boolean w() {
        return this.f38982d;
    }

    public final float x() {
        return this.f38983e;
    }

    public final long y() {
        return this.f38985g;
    }

    public final boolean z() {
        return this.f38986h;
    }

    public /* synthetic */ c0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, (List<f>) list, j15, j16);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use another constructor with `scrollDelta` and without `ConsumedData` instead", replaceWith = @b1(expression = "this(id, uptimeMillis, position, pressed, previousUptimeMillis, previousPosition, previousPressed, consumed.downChange || consumed.positionChange, type, Offset.Zero)", imports = {}))
    public /* synthetic */ c0(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, j13, j14, z11, eVar, i10);
    }

    public /* synthetic */ c0(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, j13, j14, z11, z12, i10, j15);
    }

    private c0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.f38979a = j10;
        this.f38980b = j11;
        this.f38981c = j12;
        this.f38982d = z10;
        this.f38983e = f10;
        this.f38984f = j13;
        this.f38985g = j14;
        this.f38986h = z11;
        this.f38987i = i10;
        this.f38988j = j15;
        this.f38990l = n0.g.f332700b.e();
        this.f38991m = z12;
        this.f38992n = z12;
    }

    public /* synthetic */ c0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, (i11 & 512) != 0 ? r0.f39113b.d() : i10, (i11 & 1024) != 0 ? n0.g.f332700b.e() : j15, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ c0(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, j13, j14, z11, z12, (i11 & 256) != 0 ? r0.f39113b.d() : i10, (i11 & 512) != 0 ? n0.g.f332700b.e() : j15, (DefaultConstructorMarker) null);
    }

    private c0(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this(j10, j11, j12, z10, 1.0f, j13, j14, z11, z12, i10, j15, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ c0(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, e eVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, j13, j14, z11, eVar, (i11 & 256) != 0 ? r0.f39113b.d() : i10, (DefaultConstructorMarker) null);
    }

    private c0(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, e eVar, int i10) {
        this(j10, j11, j12, z10, 1.0f, j13, j14, z11, eVar.a() || eVar.c(), i10, n0.g.f332700b.e(), (DefaultConstructorMarker) null);
    }

    private c0(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List<f> list, long j15, long j16) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15, (DefaultConstructorMarker) null);
        this.f38989k = list;
        this.f38990l = j16;
    }
}
