package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.q3;
import androidx.compose.ui.layout.v2;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,297:1\n35#2,5:298\n35#2,5:303\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult\n*L\n178#1:298,5\n212#1:303,5\n*E\n"})
public final class k0 implements c0, androidx.compose.ui.layout.b1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f17926v = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final int[] f17927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final int[] f17928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f17929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.layout.b1 f17930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f17931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f17932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f17933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f17934h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final v0 f17935i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final w0 f17936j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.d f17937k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f17938l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final List<n0> f17939m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f17940n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f17941o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f17942p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f17943q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f17944r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f17945s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f17946t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final q3 f17947u;

    public /* synthetic */ k0(int[] iArr, int[] iArr2, float f10, androidx.compose.ui.layout.b1 b1Var, float f11, boolean z10, boolean z11, boolean z12, v0 v0Var, w0 w0Var, androidx.compose.ui.unit.d dVar, int i10, List list, long j10, int i11, int i12, int i13, int i14, int i15, kotlinx.coroutines.s0 s0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, iArr2, f10, b1Var, f11, z10, z11, z12, v0Var, w0Var, dVar, i10, list, j10, i11, i12, i13, i14, i15, s0Var);
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.c0
    public long a() {
        return this.f17940n;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.c0
    public int b() {
        return this.f17944r;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.c0
    public int c() {
        return this.f17938l;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.c0
    public int d() {
        return this.f17941o;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.c0
    public int e() {
        return this.f17942p;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.c0
    public int f() {
        return this.f17943q;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.c0
    public int g() {
        return this.f17945s;
    }

    @Override // androidx.compose.ui.layout.b1
    public int getHeight() {
        return this.f17930d.getHeight();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.c0
    @NotNull
    public q3 getOrientation() {
        return this.f17947u;
    }

    @Override // androidx.compose.ui.layout.b1
    public int getWidth() {
        return this.f17930d.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.c0
    @NotNull
    public List<n0> h() {
        return this.f17939m;
    }

    @Nullable
    public final k0 i(int i10, boolean z10) {
        if (this.f17934h || h().isEmpty() || this.f17927a.length == 0 || this.f17928b.length == 0) {
            return null;
        }
        int iE = e() - b();
        List<n0> listH = h();
        int size = listH.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                List<n0> listH2 = h();
                int size2 = listH2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    listH2.get(i12).f(i10, z10);
                }
                int[] iArr = this.f17927a;
                int length = this.f17928b.length;
                int[] iArr2 = new int[length];
                for (int i13 = 0; i13 < length; i13++) {
                    iArr2[i13] = this.f17928b[i13] - i10;
                }
                return new k0(iArr, iArr2, i10, this.f17930d, this.f17931e, this.f17932f || i10 > 0, this.f17933g, this.f17934h, this.f17935i, this.f17936j, this.f17937k, c(), h(), a(), d(), e(), f(), b(), g(), this.f17946t, null);
            }
            n0 n0Var = listH.get(i11);
            if (!n0Var.i()) {
                if ((n0Var.r() <= 0) == (n0Var.r() + i10 <= 0)) {
                    if (n0Var.r() <= d()) {
                        if (i10 < 0) {
                            if ((n0Var.r() + n0Var.m()) - d() <= (-i10)) {
                                return null;
                            }
                        } else if (d() - n0Var.r() <= i10) {
                            return null;
                        }
                    }
                    if (n0Var.r() + n0Var.m() >= iE) {
                        if (i10 < 0) {
                            if ((n0Var.r() + n0Var.m()) - e() <= (-i10)) {
                                return null;
                            }
                        } else if (e() - n0Var.r() <= i10) {
                            return null;
                        }
                    }
                    i11++;
                }
            }
            return null;
        }
    }

    @Override // androidx.compose.ui.layout.b1
    @Nullable
    public Function1<v2, Unit> j() {
        return this.f17930d.j();
    }

    public final boolean k() {
        return this.f17927a[0] != 0 || this.f17928b[0] > 0;
    }

    public final boolean l() {
        return this.f17932f;
    }

    public final float m() {
        return this.f17929c;
    }

    @NotNull
    public final kotlinx.coroutines.s0 n() {
        return this.f17946t;
    }

    @NotNull
    public final androidx.compose.ui.unit.d o() {
        return this.f17937k;
    }

    @NotNull
    public final int[] p() {
        return this.f17927a;
    }

    @NotNull
    public final int[] q() {
        return this.f17928b;
    }

    @NotNull
    public final androidx.compose.ui.layout.b1 r() {
        return this.f17930d;
    }

    public final boolean s() {
        return this.f17934h;
    }

    public final float t() {
        return this.f17931e;
    }

    @NotNull
    public final v0 u() {
        return this.f17935i;
    }

    @NotNull
    public final w0 v() {
        return this.f17936j;
    }

    public final boolean w() {
        return this.f17933g;
    }

    @Override // androidx.compose.ui.layout.b1
    @NotNull
    public Map<androidx.compose.ui.layout.a, Integer> x() {
        return this.f17930d.x();
    }

    @Override // androidx.compose.ui.layout.b1
    public void y() {
        this.f17930d.y();
    }

    private k0(int[] iArr, int[] iArr2, float f10, androidx.compose.ui.layout.b1 b1Var, float f11, boolean z10, boolean z11, boolean z12, v0 v0Var, w0 w0Var, androidx.compose.ui.unit.d dVar, int i10, List<n0> list, long j10, int i11, int i12, int i13, int i14, int i15, kotlinx.coroutines.s0 s0Var) {
        this.f17927a = iArr;
        this.f17928b = iArr2;
        this.f17929c = f10;
        this.f17930d = b1Var;
        this.f17931e = f11;
        this.f17932f = z10;
        this.f17933g = z11;
        this.f17934h = z12;
        this.f17935i = v0Var;
        this.f17936j = w0Var;
        this.f17937k = dVar;
        this.f17938l = i10;
        this.f17939m = list;
        this.f17940n = j10;
        this.f17941o = i11;
        this.f17942p = i12;
        this.f17943q = i13;
        this.f17944r = i14;
        this.f17945s = i15;
        this.f17946t = s0Var;
        this.f17947u = z11 ? q3.Vertical : q3.Horizontal;
    }
}
