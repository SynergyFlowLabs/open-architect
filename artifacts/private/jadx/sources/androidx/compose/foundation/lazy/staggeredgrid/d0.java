package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.graphics.o1;
import androidx.compose.ui.layout.i2;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1474:1\n264#1:1480\n1138#2:1475\n1135#2:1476\n1132#2:1478\n1138#2:1481\n1135#2:1482\n1132#2:1484\n90#3:1477\n85#3:1479\n90#3:1483\n85#3:1485\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n*L\n267#1:1480\n264#1:1475\n264#1:1476\n264#1:1478\n267#1:1481\n267#1:1482\n267#1:1484\n264#1:1477\n264#1:1479\n267#1:1483\n267#1:1485\n*E\n"})
public final class d0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f17774v = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a1 f17775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<Integer> f17776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final r f17777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final v0 f17778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f17779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f17780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.w0 f17781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f17782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f17783i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f17784j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f17785k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f17786l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f17787m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f17788n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f17789o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f17790p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private final c0 f17791q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final o1 f17792r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final j0 f17793s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final b0 f17794t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f17795u;

    public static final class a extends j0 {
        a(boolean z10, r rVar, androidx.compose.foundation.lazy.layout.w0 w0Var, v0 v0Var) {
            super(z10, rVar, w0Var, v0Var);
        }

        @Override // androidx.compose.foundation.lazy.staggeredgrid.j0
        public n0 d(int i10, int i11, int i12, Object obj, Object obj2, List<? extends i2> list, long j10) {
            return new n0(i10, obj, list, d0.this.y(), d0.this.m(), i11, i12, d0.this.c(), d0.this.a(), obj2, d0.this.t().I(), j10, null);
        }
    }

    public /* synthetic */ d0(a1 a1Var, List list, r rVar, v0 v0Var, long j10, boolean z10, androidx.compose.foundation.lazy.layout.w0 w0Var, int i10, long j11, int i11, int i12, boolean z11, int i13, kotlinx.coroutines.s0 s0Var, boolean z12, boolean z13, c0 c0Var, o1 o1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(a1Var, list, rVar, v0Var, j10, z10, w0Var, i10, j11, i11, i12, z11, i13, s0Var, z12, z13, c0Var, o1Var);
    }

    public final int a() {
        return this.f17785k;
    }

    @Nullable
    public final c0 b() {
        return this.f17791q;
    }

    public final int c() {
        return this.f17784j;
    }

    public final long d() {
        return this.f17779e;
    }

    public final long e() {
        return this.f17783i;
    }

    @NotNull
    public final kotlinx.coroutines.s0 f() {
        return this.f17788n;
    }

    @NotNull
    public final o1 g() {
        return this.f17792r;
    }

    @NotNull
    public final r h() {
        return this.f17777c;
    }

    public final int i() {
        return this.f17795u;
    }

    @NotNull
    public final b0 j() {
        return this.f17794t;
    }

    public final int k(long j10) {
        int i10 = (int) (com.rabbitmq.client.k0.f265952a & j10);
        int i11 = (int) (j10 >> 32);
        if (i10 - i11 != 1) {
            return -2;
        }
        return i11;
    }

    public final int l() {
        return this.f17782h;
    }

    public final int m() {
        return this.f17787m;
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.w0 n() {
        return this.f17781g;
    }

    @NotNull
    public final j0 o() {
        return this.f17793s;
    }

    @NotNull
    public final List<Integer> p() {
        return this.f17776b;
    }

    @NotNull
    public final v0 q() {
        return this.f17778d;
    }

    public final boolean r() {
        return this.f17786l;
    }

    public final long s(@NotNull r rVar, int i10, int i11) {
        boolean zB = rVar.g().b(i10);
        int i12 = zB ? this.f17795u : 1;
        if (zB) {
            i11 = 0;
        }
        return d1.b(i11, i12);
    }

    @NotNull
    public final a1 t() {
        return this.f17775a;
    }

    public final boolean u(@NotNull r rVar, int i10) {
        return rVar.g().b(i10);
    }

    public final boolean v(long j10) {
        return ((int) (com.rabbitmq.client.k0.f265952a & j10)) - ((int) (j10 >> 32)) != 1;
    }

    public final boolean w() {
        return this.f17789o;
    }

    public final boolean x() {
        return this.f17790p;
    }

    public final boolean y() {
        return this.f17780f;
    }

    private d0(a1 a1Var, List<Integer> list, r rVar, v0 v0Var, long j10, boolean z10, androidx.compose.foundation.lazy.layout.w0 w0Var, int i10, long j11, int i11, int i12, boolean z11, int i13, kotlinx.coroutines.s0 s0Var, boolean z12, boolean z13, c0 c0Var, o1 o1Var) {
        this.f17775a = a1Var;
        this.f17776b = list;
        this.f17777c = rVar;
        this.f17778d = v0Var;
        this.f17779e = j10;
        this.f17780f = z10;
        this.f17781g = w0Var;
        this.f17782h = i10;
        this.f17783i = j11;
        this.f17784j = i11;
        this.f17785k = i12;
        this.f17786l = z11;
        this.f17787m = i13;
        this.f17788n = s0Var;
        this.f17789o = z12;
        this.f17790p = z13;
        this.f17791q = c0Var;
        this.f17792r = o1Var;
        this.f17793s = new a(z10, rVar, w0Var, v0Var);
        this.f17794t = a1Var.K();
        this.f17795u = v0Var.b().length;
    }
}
