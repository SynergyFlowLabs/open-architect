package androidx.compose.foundation.text;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nTextDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegate\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,356:1\n97#2,4:357\n97#2,4:361\n97#2,4:365\n30#3:369\n30#3:371\n80#4:370\n80#4:372\n*S KotlinDebug\n*F\n+ 1 TextDelegate.kt\nandroidx/compose/foundation/text/TextDelegate\n*L\n116#1:357,4\n117#1:361,4\n118#1:365,4\n252#1:369\n265#1:371\n252#1:370\n265#1:372\n*E\n"})
public final class i5 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final a f19375l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f19376m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.f f19377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.y3 f19378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f19381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.d f19383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.font.y.b f19384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.v0>> f19385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.text.i0 f19386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.w f19387k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull androidx.compose.ui.graphics.k0 k0Var, @NotNull androidx.compose.ui.text.p3 p3Var) {
            androidx.compose.ui.text.u3.f42312a.a(k0Var, p3Var);
        }

        private a() {
        }
    }

    public /* synthetic */ i5(androidx.compose.ui.text.f fVar, androidx.compose.ui.text.y3 y3Var, int i10, int i11, boolean z10, int i12, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.y.b bVar, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, y3Var, i10, i11, z10, i12, dVar, bVar, list);
    }

    private final androidx.compose.ui.text.i0 h() {
        androidx.compose.ui.text.i0 i0Var = this.f19386j;
        if (i0Var != null) {
            return i0Var;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public static /* synthetic */ androidx.compose.ui.text.p3 p(i5 i5Var, long j10, androidx.compose.ui.unit.w wVar, androidx.compose.ui.text.p3 p3Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            p3Var = null;
        }
        return i5Var.o(j10, wVar, p3Var);
    }

    private final androidx.compose.ui.text.f0 r(long j10, androidx.compose.ui.unit.w wVar) {
        int i10;
        q(wVar);
        int iR = androidx.compose.ui.unit.b.r(j10);
        int iP = ((this.f19381e || androidx.compose.ui.text.style.v.i(this.f19382f, androidx.compose.ui.text.style.v.f42256b.c())) && androidx.compose.ui.unit.b.j(j10)) ? androidx.compose.ui.unit.b.p(j10) : Integer.MAX_VALUE;
        if (this.f19381e || !androidx.compose.ui.text.style.v.i(this.f19382f, androidx.compose.ui.text.style.v.f42256b.c())) {
            i10 = this.f19379c;
        } else {
            i10 = 1;
            boolean z10 = true & true;
        }
        int i11 = i10;
        if (iR != iP) {
            iP = kotlin.ranges.r.I(d(), iR, iP);
        }
        return new androidx.compose.ui.text.f0(h(), androidx.compose.ui.unit.b.f42658b.b(0, iP, 0, androidx.compose.ui.unit.b.o(j10)), i11, this.f19382f, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final androidx.compose.ui.unit.d a() {
        return this.f19383g;
    }

    @NotNull
    public final androidx.compose.ui.text.font.y.b b() {
        return this.f19384h;
    }

    @Nullable
    public final androidx.compose.ui.unit.w c() {
        return this.f19387k;
    }

    public final int d() {
        return j5.a(h().i());
    }

    public final int e() {
        return this.f19379c;
    }

    public final int f() {
        return j5.a(h().f());
    }

    public final int g() {
        return this.f19380d;
    }

    public final int i() {
        return this.f19382f;
    }

    @Nullable
    public final androidx.compose.ui.text.i0 j() {
        return this.f19386j;
    }

    @NotNull
    public final List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.v0>> k() {
        return this.f19385i;
    }

    public final boolean l() {
        return this.f19381e;
    }

    @NotNull
    public final androidx.compose.ui.text.y3 m() {
        return this.f19378b;
    }

    @NotNull
    public final androidx.compose.ui.text.f n() {
        return this.f19377a;
    }

    @NotNull
    public final androidx.compose.ui.text.p3 o(long j10, @NotNull androidx.compose.ui.unit.w wVar, @Nullable androidx.compose.ui.text.p3 p3Var) {
        if (p3Var != null && x6.a(p3Var, this.f19377a, this.f19378b, this.f19385i, this.f19379c, this.f19381e, this.f19382f, this.f19383g, wVar, this.f19384h, j10)) {
            return p3Var.a(new androidx.compose.ui.text.o3(p3Var.l().n(), this.f19378b, p3Var.l().i(), p3Var.l().g(), p3Var.l().l(), p3Var.l().h(), p3Var.l().d(), p3Var.l().f(), p3Var.l().e(), j10, (DefaultConstructorMarker) null), androidx.compose.ui.unit.c.f(j10, androidx.compose.ui.unit.u.e((((long) j5.a(p3Var.x().k())) & com.rabbitmq.client.k0.f265952a) | (((long) j5.a(p3Var.x().L())) << 32))));
        }
        androidx.compose.ui.text.f0 f0VarR = r(j10, wVar);
        return new androidx.compose.ui.text.p3(new androidx.compose.ui.text.o3(this.f19377a, this.f19378b, this.f19385i, this.f19379c, this.f19381e, this.f19382f, this.f19383g, wVar, this.f19384h, j10, (DefaultConstructorMarker) null), f0VarR, androidx.compose.ui.unit.c.f(j10, androidx.compose.ui.unit.u.e((((long) j5.a(f0VarR.k())) & com.rabbitmq.client.k0.f265952a) | (((long) j5.a(f0VarR.L())) << 32))), null);
    }

    public final void q(@NotNull androidx.compose.ui.unit.w wVar) {
        androidx.compose.ui.text.i0 i0Var = this.f19386j;
        if (i0Var == null || wVar != this.f19387k || i0Var.a()) {
            this.f19387k = wVar;
            i0Var = new androidx.compose.ui.text.i0(this.f19377a, androidx.compose.ui.text.z3.d(this.f19378b, wVar), this.f19385i, this.f19383g, this.f19384h);
        }
        this.f19386j = i0Var;
    }

    public final void s(@Nullable androidx.compose.ui.unit.w wVar) {
        this.f19387k = wVar;
    }

    public final void t(@Nullable androidx.compose.ui.text.i0 i0Var) {
        this.f19386j = i0Var;
    }

    private i5(androidx.compose.ui.text.f fVar, androidx.compose.ui.text.y3 y3Var, int i10, int i11, boolean z10, int i12, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.y.b bVar, List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.v0>> list) {
        this.f19377a = fVar;
        this.f19378b = y3Var;
        this.f19379c = i10;
        this.f19380d = i11;
        this.f19381e = z10;
        this.f19382f = i12;
        this.f19383g = dVar;
        this.f19384h = bVar;
        this.f19385i = list;
        if (!(i10 > 0)) {
            androidx.compose.foundation.internal.e.g("no maxLines");
        }
        if (!(i11 > 0)) {
            androidx.compose.foundation.internal.e.g("no minLines");
        }
        if (i11 <= i10) {
            return;
        }
        androidx.compose.foundation.internal.e.g("minLines greater than maxLines");
    }

    public /* synthetic */ i5(androidx.compose.ui.text.f fVar, androidx.compose.ui.text.y3 y3Var, int i10, int i11, boolean z10, int i12, androidx.compose.ui.unit.d dVar, androidx.compose.ui.text.font.y.b bVar, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, y3Var, (i13 & 4) != 0 ? Integer.MAX_VALUE : i10, (i13 & 8) != 0 ? 1 : i11, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? androidx.compose.ui.text.style.v.f42256b.a() : i12, dVar, bVar, (i13 & 256) != 0 ? CollectionsKt.emptyList() : list, null);
    }
}
