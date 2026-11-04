package androidx.compose.foundation.pager;

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
@SourceDebugExtension({"SMAP\nPagerMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasureResult.kt\nandroidx/compose/foundation/pager/PagerMeasureResult\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,148:1\n30#2:149\n80#3:150\n35#4,5:151\n35#4,5:156\n35#4,5:161\n*S KotlinDebug\n*F\n+ 1 PagerMeasureResult.kt\nandroidx/compose/foundation/pager/PagerMeasureResult\n*L\n50#1:149\n50#1:150\n115#1:151,5\n116#1:156,5\n117#1:161,5\n*E\n"})
public final class u0 implements h0, androidx.compose.ui.layout.b1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f18457u = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<m> f18458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f18461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final q3 f18462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f18463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f18464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f18465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f18466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private final m f18467j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private final m f18468k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f18469l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f18470m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f18471n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.gestures.snapping.o f18472o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.layout.b1 f18473p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f18474q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final List<m> f18475r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final List<m> f18476s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f18477t;

    public u0(@NotNull List<m> list, int i10, int i11, int i12, @NotNull q3 q3Var, int i13, int i14, boolean z10, int i15, @Nullable m mVar, @Nullable m mVar2, float f10, int i16, boolean z11, @NotNull androidx.compose.foundation.gestures.snapping.o oVar, @NotNull androidx.compose.ui.layout.b1 b1Var, boolean z12, @NotNull List<m> list2, @NotNull List<m> list3, @NotNull kotlinx.coroutines.s0 s0Var) {
        this.f18458a = list;
        this.f18459b = i10;
        this.f18460c = i11;
        this.f18461d = i12;
        this.f18462e = q3Var;
        this.f18463f = i13;
        this.f18464g = i14;
        this.f18465h = z10;
        this.f18466i = i15;
        this.f18467j = mVar;
        this.f18468k = mVar2;
        this.f18469l = f10;
        this.f18470m = i16;
        this.f18471n = z11;
        this.f18472o = oVar;
        this.f18473p = b1Var;
        this.f18474q = z12;
        this.f18475r = list2;
        this.f18476s = list3;
        this.f18477t = s0Var;
    }

    @Override // androidx.compose.foundation.pager.h0
    public long a() {
        return androidx.compose.ui.unit.u.e((((long) getWidth()) << 32) | (((long) getHeight()) & com.rabbitmq.client.k0.f265952a));
    }

    @Override // androidx.compose.foundation.pager.h0
    public int b() {
        return this.f18461d;
    }

    @Nullable
    public final u0 c(int i10) {
        int i11;
        int iT1 = t1() + x1();
        if (!this.f18474q && !w1().isEmpty() && this.f18467j != null && (i11 = this.f18470m - i10) >= 0 && i11 < iT1) {
            float f10 = iT1 != 0 ? i10 / iT1 : 0.0f;
            float f11 = this.f18469l - f10;
            if (this.f18468k != null && f11 < 0.5f && f11 > -0.5f) {
                m mVar = (m) CollectionsKt.first((List) w1());
                m mVar2 = (m) CollectionsKt.last((List) w1());
                if (i10 >= 0 ? Math.min(d() - mVar.getOffset(), e() - mVar2.getOffset()) > i10 : Math.min((mVar.getOffset() + iT1) - d(), (mVar2.getOffset() + iT1) - e()) > (-i10)) {
                    List<m> listW1 = w1();
                    int size = listW1.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        listW1.get(i12).a(i10);
                    }
                    List<m> list = this.f18475r;
                    int size2 = list.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        list.get(i13).a(i10);
                    }
                    List<m> list2 = this.f18476s;
                    int size3 = list2.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        list2.get(i14).a(i10);
                    }
                    return new u0(w1(), t1(), x1(), b(), getOrientation(), d(), e(), i(), y1(), this.f18467j, this.f18468k, this.f18469l - f10, this.f18470m - i10, this.f18471n || i10 > 0, u1(), this.f18473p, this.f18474q, this.f18475r, this.f18476s, this.f18477t);
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.foundation.pager.h0
    public int d() {
        return this.f18463f;
    }

    @Override // androidx.compose.foundation.pager.h0
    public int e() {
        return this.f18464g;
    }

    @Override // androidx.compose.foundation.pager.h0
    public int f() {
        return -d();
    }

    public final boolean g() {
        m mVar = this.f18467j;
        return ((mVar != null ? mVar.getIndex() : 0) == 0 && this.f18470m == 0) ? false : true;
    }

    @Override // androidx.compose.ui.layout.b1
    public int getHeight() {
        return this.f18473p.getHeight();
    }

    @Override // androidx.compose.foundation.pager.h0
    @NotNull
    public q3 getOrientation() {
        return this.f18462e;
    }

    @Override // androidx.compose.ui.layout.b1
    public int getWidth() {
        return this.f18473p.getWidth();
    }

    public final boolean h() {
        return this.f18471n;
    }

    @Override // androidx.compose.foundation.pager.h0
    public boolean i() {
        return this.f18465h;
    }

    @Override // androidx.compose.ui.layout.b1
    @Nullable
    public Function1<v2, Unit> j() {
        return this.f18473p.j();
    }

    @NotNull
    public final kotlinx.coroutines.s0 k() {
        return this.f18477t;
    }

    @Nullable
    public final m l() {
        return this.f18468k;
    }

    public final float m() {
        return this.f18469l;
    }

    @NotNull
    public final List<m> n() {
        return this.f18476s;
    }

    @NotNull
    public final List<m> o() {
        return this.f18475r;
    }

    @Nullable
    public final m p() {
        return this.f18467j;
    }

    public final int q() {
        return this.f18470m;
    }

    public final boolean r() {
        return this.f18474q;
    }

    @Override // androidx.compose.foundation.pager.h0
    public int t1() {
        return this.f18459b;
    }

    @Override // androidx.compose.foundation.pager.h0
    @NotNull
    public androidx.compose.foundation.gestures.snapping.o u1() {
        return this.f18472o;
    }

    @Override // androidx.compose.foundation.pager.h0
    @NotNull
    public List<m> w1() {
        return this.f18458a;
    }

    @Override // androidx.compose.ui.layout.b1
    @NotNull
    public Map<androidx.compose.ui.layout.a, Integer> x() {
        return this.f18473p.x();
    }

    @Override // androidx.compose.foundation.pager.h0
    public int x1() {
        return this.f18460c;
    }

    @Override // androidx.compose.ui.layout.b1
    public void y() {
        this.f18473p.y();
    }

    @Override // androidx.compose.foundation.pager.h0
    public int y1() {
        return this.f18466i;
    }

    public /* synthetic */ u0(List list, int i10, int i11, int i12, q3 q3Var, int i13, int i14, boolean z10, int i15, m mVar, m mVar2, float f10, int i16, boolean z11, androidx.compose.foundation.gestures.snapping.o oVar, androidx.compose.ui.layout.b1 b1Var, boolean z12, List list2, List list3, kotlinx.coroutines.s0 s0Var, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i10, i11, i12, q3Var, i13, i14, z10, i15, mVar, mVar2, f10, i16, z11, oVar, b1Var, z12, (i17 & 131072) != 0 ? CollectionsKt.emptyList() : list2, (i17 & 262144) != 0 ? CollectionsKt.emptyList() : list3, s0Var);
    }
}
