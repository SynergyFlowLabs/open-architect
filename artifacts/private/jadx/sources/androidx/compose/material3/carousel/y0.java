package androidx.compose.material3.carousel;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class y0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final a f26720n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f26721o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final y0 f26722p = new y0(q0.a(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), 0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p0 f26723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<p0> f26724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<p0> f26725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f26726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f26727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f26728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f26729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f26730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f26731i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.collection.r f26732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.collection.r f26733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f26734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private List<p0> f26735m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final y0 a() {
            return y0.f26722p;
        }

        private a() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0047  */
    private y0(p0 p0Var, List<p0> list, List<p0> list2, float f10, float f11, float f12, float f13) {
        boolean z10;
        this.f26723a = p0Var;
        this.f26724b = list;
        this.f26725c = list2;
        this.f26726d = f10;
        this.f26727e = f11;
        this.f26728f = f12;
        this.f26729g = f13;
        float fP = b1.p(list, f12);
        this.f26730h = fP;
        float fM = b1.m(list2, f13);
        this.f26731i = fM;
        this.f26732j = b1.q(fP, list, true);
        this.f26733k = b1.q(fM, list2, false);
        if (!p0Var.isEmpty()) {
            int i10 = 7 | 0;
            z10 = (f10 == 0.0f || g() == 0.0f) ? false : true;
        }
        this.f26734l = z10;
    }

    public static /* synthetic */ p0 j(y0 y0Var, float f10, float f11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return y0Var.i(f10, f11, z10);
    }

    public final float b() {
        return this.f26729g;
    }

    public final float c() {
        return this.f26726d;
    }

    public final float d() {
        return this.f26728f;
    }

    @NotNull
    public final p0 e() {
        return this.f26723a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        boolean z10 = this.f26734l;
        if (!z10 && !((y0) obj).f26734l) {
            return true;
        }
        y0 y0Var = (y0) obj;
        return z10 == y0Var.f26734l && this.f26726d == y0Var.f26726d && this.f26727e == y0Var.f26727e && this.f26728f == y0Var.f26728f && this.f26729g == y0Var.f26729g && g() == y0Var.g() && this.f26730h == y0Var.f26730h && this.f26731i == y0Var.f26731i && Intrinsics.areEqual(this.f26732j, y0Var.f26732j) && Intrinsics.areEqual(this.f26733k, y0Var.f26733k) && Intrinsics.areEqual(this.f26723a, y0Var.f26723a);
    }

    @NotNull
    public final List<p0> f() {
        return this.f26725c;
    }

    public final float g() {
        return this.f26723a.s().l();
    }

    public final float h() {
        return this.f26727e;
    }

    public int hashCode() {
        boolean z10 = this.f26734l;
        return !z10 ? Boolean.hashCode(z10) : (((((((((((((((((((Boolean.hashCode(z10) * 31) + Float.hashCode(this.f26726d)) * 31) + Float.hashCode(this.f26727e)) * 31) + Float.hashCode(this.f26728f)) * 31) + Float.hashCode(this.f26729g)) * 31) + Float.hashCode(g())) * 31) + Float.hashCode(this.f26730h)) * 31) + Float.hashCode(this.f26731i)) * 31) + this.f26732j.hashCode()) * 31) + this.f26733k.hashCode()) * 31) + this.f26723a.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final p0 i(float f10, float f11, boolean z10) {
        float fMax = Math.max(0.0f, f10);
        float f12 = this.f26730h;
        float fMax2 = Math.max(0.0f, f11 - this.f26731i);
        if (f12 <= fMax && fMax <= fMax2) {
            return this.f26723a;
        }
        float fR = b1.r(1.0f, 0.0f, 0.0f, f12, fMax);
        androidx.collection.r rVar = this.f26732j;
        List<p0> list = this.f26724b;
        if (fMax > fMax2) {
            fR = b1.r(0.0f, 1.0f, fMax2, f11, fMax);
            rVar = this.f26733k;
            list = this.f26725c;
            if (fMax2 < 0.01f && this.f26724b.size() == 2 && this.f26725c.size() == 2) {
                if (this.f26735m == null) {
                    this.f26735m = CollectionsKt.listOf((Object[]) new p0[]{CollectionsKt.last((List) this.f26724b), CollectionsKt.last((List) this.f26725c)});
                }
                list = this.f26735m;
                Intrinsics.checkNotNull(list);
            }
        }
        x0 x0VarN = b1.n(list.size(), rVar, fR);
        if (z10) {
            return list.get(kotlin.math.b.L0(x0VarN.g()) == 0 ? x0VarN.f() : x0VarN.h());
        }
        return q0.e(list.get(x0VarN.f()), list.get(x0VarN.h()), x0VarN.g());
    }

    @NotNull
    public final List<p0> k() {
        return this.f26724b;
    }

    public final boolean l() {
        return this.f26734l;
    }

    public y0(@NotNull p0 p0Var, float f10, float f11, float f12, float f13) {
        this(p0Var, b1.o(p0Var, f10, f11, f12), b1.l(p0Var, f10, f11, f13), f10, f11, f12, f13);
    }
}
