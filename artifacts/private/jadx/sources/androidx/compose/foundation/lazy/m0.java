package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.q3;
import androidx.compose.ui.layout.v2;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyListMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasureResult.kt\nandroidx/compose/foundation/lazy/LazyListMeasureResult\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,152:1\n30#2:153\n80#3:154\n35#4,5:155\n*S KotlinDebug\n*F\n+ 1 LazyListMeasureResult.kt\nandroidx/compose/foundation/lazy/LazyListMeasureResult\n*L\n73#1:153\n73#1:154\n124#1:155,5\n*E\n"})
public final class m0 implements f0, androidx.compose.ui.layout.b1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f17636s = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final n0 f17637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f17639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f17640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.layout.b1 f17641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f17642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f17643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f17644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.d f17645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f17646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final List<n0> f17647k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f17648l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f17649m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f17650n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f17651o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final q3 f17652p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f17653q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f17654r;

    public /* synthetic */ m0(n0 n0Var, int i10, boolean z10, float f10, androidx.compose.ui.layout.b1 b1Var, float f11, boolean z11, kotlinx.coroutines.s0 s0Var, androidx.compose.ui.unit.d dVar, long j10, List list, int i11, int i12, int i13, boolean z12, q3 q3Var, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(n0Var, i10, z10, f10, b1Var, f11, z11, s0Var, dVar, j10, list, i11, i12, i13, z12, q3Var, i14, i15);
    }

    public final int A() {
        return this.f17638b;
    }

    public final boolean B() {
        return this.f17643g;
    }

    public final float C() {
        return this.f17642f;
    }

    @Override // androidx.compose.foundation.lazy.f0
    public long a() {
        return androidx.compose.ui.unit.u.e((((long) getWidth()) << 32) | (((long) getHeight()) & com.rabbitmq.client.k0.f265952a));
    }

    @Override // androidx.compose.foundation.lazy.f0
    public int b() {
        return this.f17653q;
    }

    @Override // androidx.compose.foundation.lazy.f0
    public int c() {
        return this.f17650n;
    }

    @Override // androidx.compose.foundation.lazy.f0
    public int d() {
        return this.f17648l;
    }

    @Override // androidx.compose.foundation.lazy.f0
    public int e() {
        return this.f17649m;
    }

    @Override // androidx.compose.foundation.lazy.f0
    public int f() {
        return -d();
    }

    @Override // androidx.compose.foundation.lazy.f0
    public int g() {
        return this.f17654r;
    }

    @Override // androidx.compose.ui.layout.b1
    public int getHeight() {
        return this.f17641e.getHeight();
    }

    @Override // androidx.compose.foundation.lazy.f0
    @NotNull
    public q3 getOrientation() {
        return this.f17652p;
    }

    @Override // androidx.compose.ui.layout.b1
    public int getWidth() {
        return this.f17641e.getWidth();
    }

    @Override // androidx.compose.foundation.lazy.f0
    @NotNull
    public List<n0> h() {
        return this.f17647k;
    }

    @Override // androidx.compose.foundation.lazy.f0
    public boolean i() {
        return this.f17651o;
    }

    @Override // androidx.compose.ui.layout.b1
    @Nullable
    public Function1<v2, Unit> j() {
        return this.f17641e.j();
    }

    @Nullable
    public final m0 q(int i10, boolean z10) {
        n0 n0Var;
        if (!this.f17643g && !h().isEmpty() && (n0Var = this.f17637a) != null) {
            int iM = n0Var.m();
            int i11 = this.f17638b - i10;
            if (i11 >= 0 && i11 < iM) {
                n0 n0Var2 = (n0) CollectionsKt.first((List) h());
                n0 n0Var3 = (n0) CollectionsKt.last((List) h());
                if (!n0Var2.i() && !n0Var3.i() && (i10 >= 0 ? Math.min(d() - n0Var2.getOffset(), e() - n0Var3.getOffset()) > i10 : Math.min((n0Var2.getOffset() + n0Var2.m()) - d(), (n0Var3.getOffset() + n0Var3.m()) - e()) > (-i10))) {
                    List<n0> listH = h();
                    int size = listH.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        listH.get(i12).a(i10, z10);
                    }
                    return new m0(this.f17637a, this.f17638b - i10, this.f17639c || i10 > 0, i10, this.f17641e, this.f17642f, this.f17643g, this.f17644h, this.f17645i, this.f17646j, h(), d(), e(), c(), i(), getOrientation(), b(), g(), null);
                }
            }
        }
        return null;
    }

    public final boolean r() {
        n0 n0Var = this.f17637a;
        return ((n0Var != null ? n0Var.getIndex() : 0) == 0 && this.f17638b == 0) ? false : true;
    }

    public final boolean s() {
        return this.f17639c;
    }

    public final long t() {
        return this.f17646j;
    }

    public final float u() {
        return this.f17640d;
    }

    @NotNull
    public final kotlinx.coroutines.s0 v() {
        return this.f17644h;
    }

    @NotNull
    public final androidx.compose.ui.unit.d w() {
        return this.f17645i;
    }

    @Override // androidx.compose.ui.layout.b1
    @NotNull
    public Map<androidx.compose.ui.layout.a, Integer> x() {
        return this.f17641e.x();
    }

    @Override // androidx.compose.ui.layout.b1
    public void y() {
        this.f17641e.y();
    }

    @Nullable
    public final n0 z() {
        return this.f17637a;
    }

    private m0(n0 n0Var, int i10, boolean z10, float f10, androidx.compose.ui.layout.b1 b1Var, float f11, boolean z11, kotlinx.coroutines.s0 s0Var, androidx.compose.ui.unit.d dVar, long j10, List<n0> list, int i11, int i12, int i13, boolean z12, q3 q3Var, int i14, int i15) {
        this.f17637a = n0Var;
        this.f17638b = i10;
        this.f17639c = z10;
        this.f17640d = f10;
        this.f17641e = b1Var;
        this.f17642f = f11;
        this.f17643g = z11;
        this.f17644h = s0Var;
        this.f17645i = dVar;
        this.f17646j = j10;
        this.f17647k = list;
        this.f17648l = i11;
        this.f17649m = i12;
        this.f17650n = i13;
        this.f17651o = z12;
        this.f17652p = q3Var;
        this.f17653q = i14;
        this.f17654r = i15;
    }
}
