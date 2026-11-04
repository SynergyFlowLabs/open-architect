package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.q3;
import androidx.compose.ui.layout.v2;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasureResult.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureResult\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,165:1\n30#2:166\n80#3:167\n35#4,5:168\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasureResult.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureResult\n*L\n78#1:166\n78#1:167\n135#1:168,5\n*E\n"})
public final class u0 implements n0, androidx.compose.ui.layout.b1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f16994u = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final y0 f16995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f16997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f16998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.layout.b1 f16999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f17000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f17001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f17002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.d f17003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f17004j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final Function1<Integer, List<Pair<Integer, androidx.compose.ui.unit.b>>> f17005k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final Function1<Integer, Integer> f17006l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final List<v0> f17007m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f17008n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f17009o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f17010p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f17011q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final q3 f17012r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f17013s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f17014t;

    /* JADX WARN: Multi-variable type inference failed */
    public u0(@Nullable y0 y0Var, int i10, boolean z10, float f10, @NotNull androidx.compose.ui.layout.b1 b1Var, float f11, boolean z11, @NotNull kotlinx.coroutines.s0 s0Var, @NotNull androidx.compose.ui.unit.d dVar, int i11, @NotNull Function1<? super Integer, ? extends List<Pair<Integer, androidx.compose.ui.unit.b>>> function1, @NotNull Function1<? super Integer, Integer> function2, @NotNull List<v0> list, int i12, int i13, int i14, boolean z12, @NotNull q3 q3Var, int i15, int i16) {
        this.f16995a = y0Var;
        this.f16996b = i10;
        this.f16997c = z10;
        this.f16998d = f10;
        this.f16999e = b1Var;
        this.f17000f = f11;
        this.f17001g = z11;
        this.f17002h = s0Var;
        this.f17003i = dVar;
        this.f17004j = i11;
        this.f17005k = function1;
        this.f17006l = function2;
        this.f17007m = list;
        this.f17008n = i12;
        this.f17009o = i13;
        this.f17010p = i14;
        this.f17011q = z12;
        this.f17012r = q3Var;
        this.f17013s = i15;
        this.f17014t = i16;
    }

    @Override // androidx.compose.foundation.lazy.grid.n0
    public long a() {
        return androidx.compose.ui.unit.u.e((((long) getWidth()) << 32) | (((long) getHeight()) & com.rabbitmq.client.k0.f265952a));
    }

    @Override // androidx.compose.foundation.lazy.grid.n0
    public int b() {
        return this.f17013s;
    }

    @Override // androidx.compose.foundation.lazy.grid.n0
    public int c() {
        return this.f17010p;
    }

    @Override // androidx.compose.foundation.lazy.grid.n0
    public int d() {
        return this.f17008n;
    }

    @Override // androidx.compose.foundation.lazy.grid.n0
    public int e() {
        return this.f17009o;
    }

    @Override // androidx.compose.foundation.lazy.grid.n0
    public int f() {
        return -d();
    }

    @Override // androidx.compose.foundation.lazy.grid.n0
    public int g() {
        return this.f17014t;
    }

    @Override // androidx.compose.ui.layout.b1
    public int getHeight() {
        return this.f16999e.getHeight();
    }

    @Override // androidx.compose.foundation.lazy.grid.n0
    @NotNull
    public q3 getOrientation() {
        return this.f17012r;
    }

    @Override // androidx.compose.ui.layout.b1
    public int getWidth() {
        return this.f16999e.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.grid.n0
    @NotNull
    public List<v0> h() {
        return this.f17007m;
    }

    @Override // androidx.compose.foundation.lazy.grid.n0
    public boolean i() {
        return this.f17011q;
    }

    @Override // androidx.compose.ui.layout.b1
    @Nullable
    public Function1<v2, Unit> j() {
        return this.f16999e.j();
    }

    @Override // androidx.compose.foundation.lazy.grid.n0
    public int k() {
        return this.f17004j;
    }

    @Nullable
    public final u0 l(int i10, boolean z10) {
        y0 y0Var;
        if (!this.f17001g && !h().isEmpty() && (y0Var = this.f16995a) != null) {
            int iD = y0Var.d();
            int i11 = this.f16996b - i10;
            if (i11 >= 0 && i11 < iD) {
                v0 v0Var = (v0) CollectionsKt.first((List) h());
                v0 v0Var2 = (v0) CollectionsKt.last((List) h());
                if (!v0Var.i() && !v0Var2.i() && (i10 >= 0 ? Math.min(d() - androidx.compose.foundation.gestures.snapping.e.d(v0Var, getOrientation()), e() - androidx.compose.foundation.gestures.snapping.e.d(v0Var2, getOrientation())) > i10 : Math.min((androidx.compose.foundation.gestures.snapping.e.d(v0Var, getOrientation()) + v0Var.m()) - d(), (androidx.compose.foundation.gestures.snapping.e.d(v0Var2, getOrientation()) + v0Var2.m()) - e()) > (-i10))) {
                    List<v0> listH = h();
                    int size = listH.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        listH.get(i12).p(i10, z10);
                    }
                    return new u0(this.f16995a, this.f16996b - i10, this.f16997c || i10 > 0, i10, this.f16999e, this.f17000f, this.f17001g, this.f17002h, this.f17003i, this.f17004j, this.f17005k, this.f17006l, h(), d(), e(), c(), i(), getOrientation(), b(), g());
                }
            }
        }
        return null;
    }

    public final boolean m() {
        y0 y0Var = this.f16995a;
        return ((y0Var != null ? y0Var.a() : 0) == 0 && this.f16996b == 0) ? false : true;
    }

    public final boolean n() {
        return this.f16997c;
    }

    public final float o() {
        return this.f16998d;
    }

    @NotNull
    public final kotlinx.coroutines.s0 p() {
        return this.f17002h;
    }

    @NotNull
    public final androidx.compose.ui.unit.d q() {
        return this.f17003i;
    }

    @Nullable
    public final y0 r() {
        return this.f16995a;
    }

    public final int s() {
        return this.f16996b;
    }

    @NotNull
    public final Function1<Integer, Integer> t() {
        return this.f17006l;
    }

    @NotNull
    public final Function1<Integer, List<Pair<Integer, androidx.compose.ui.unit.b>>> u() {
        return this.f17005k;
    }

    public final boolean v() {
        return this.f17001g;
    }

    public final float w() {
        return this.f17000f;
    }

    @Override // androidx.compose.ui.layout.b1
    @NotNull
    public Map<androidx.compose.ui.layout.a, Integer> x() {
        return this.f16999e.x();
    }

    @Override // androidx.compose.ui.layout.b1
    public void y() {
        this.f16999e.y();
    }

    public final int z() {
        return this.f17004j;
    }
}
