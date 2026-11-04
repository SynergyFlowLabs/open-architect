package androidx.compose.foundation.text.modifiers;

import androidx.annotation.l1;
import androidx.compose.foundation.text.j5;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.text.f0;
import androidx.compose.ui.text.i0;
import androidx.compose.ui.text.n0;
import androidx.compose.ui.text.o3;
import androidx.compose.ui.text.p3;
import androidx.compose.ui.text.q0;
import androidx.compose.ui.text.r0;
import androidx.compose.ui.text.s0;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.y3;
import androidx.compose.ui.text.z3;
import com.rabbitmq.client.k0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/ParagraphLayoutCache\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n*L\n1#1,429:1\n30#2:430\n30#2:433\n30#2:439\n30#2:445\n80#3:431\n80#3:434\n85#3:436\n90#3:438\n80#3:440\n85#3:442\n90#3:444\n80#3:446\n1#4:432\n54#5:435\n59#5:437\n54#5:441\n59#5:443\n202#6:447\n*S KotlinDebug\n*F\n+ 1 ParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/ParagraphLayoutCache\n*L\n99#1:430\n173#1:433\n190#1:439\n355#1:445\n99#1:431\n173#1:434\n178#1:436\n179#1:438\n190#1:440\n195#1:442\n195#1:444\n355#1:446\n178#1:435\n179#1:437\n195#1:441\n195#1:443\n373#1:447\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f20615t = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private String f20616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private y3 f20617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.text.font.y.b f20618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f20620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f20623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.d f20624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private n0 f20625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f20626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f20627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private d f20628m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private q0 f20629n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.w f20630o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f20631p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f20632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f20633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f20634s;

    public /* synthetic */ i(String str, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, int i10, boolean z10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, y3Var, bVar, i10, z10, i11, i12);
    }

    @l1
    public static /* synthetic */ void d() {
    }

    private final void k() {
        this.f20625j = null;
        this.f20629n = null;
        this.f20630o = null;
        this.f20632q = -1;
        this.f20633r = -1;
        this.f20631p = androidx.compose.ui.unit.b.f42658b.c(0, 0);
        long j10 = 0;
        this.f20627l = androidx.compose.ui.unit.u.e((j10 & k0.f265952a) | (j10 << 32));
        this.f20626k = false;
    }

    private final boolean n(long j10, androidx.compose.ui.unit.w wVar) {
        q0 q0Var;
        n0 n0Var = this.f20625j;
        if (n0Var != null && (q0Var = this.f20629n) != null && !q0Var.a() && wVar == this.f20630o) {
            if (androidx.compose.ui.unit.b.g(j10, this.f20631p)) {
                return false;
            }
            return androidx.compose.ui.unit.b.p(j10) != androidx.compose.ui.unit.b.p(this.f20631p) || androidx.compose.ui.unit.b.r(j10) != androidx.compose.ui.unit.b.r(this.f20631p) || ((float) androidx.compose.ui.unit.b.o(j10)) < n0Var.getHeight() || n0Var.z();
        }
        return true;
    }

    private final void o(long j10) {
        this.f20634s = j10 | (this.f20634s << 2);
    }

    private final q0 s(androidx.compose.ui.unit.w wVar) {
        q0 q0VarA = this.f20629n;
        if (q0VarA == null || wVar != this.f20630o || q0VarA.a()) {
            this.f20630o = wVar;
            String str = this.f20616a;
            y3 y3VarD = z3.d(this.f20617b, wVar);
            List listEmptyList = CollectionsKt.emptyList();
            androidx.compose.ui.unit.d dVar = this.f20624i;
            Intrinsics.checkNotNull(dVar);
            q0VarA = r0.a(str, y3VarD, listEmptyList, dVar, this.f20618c, CollectionsKt.emptyList());
        }
        this.f20629n = q0VarA;
        return q0VarA;
    }

    private final long x(long j10, androidx.compose.ui.unit.w wVar, y3 y3Var) {
        d.a aVar = d.f20564h;
        d dVar = this.f20628m;
        androidx.compose.ui.unit.d dVar2 = this.f20624i;
        Intrinsics.checkNotNull(dVar2);
        d dVarA = aVar.a(dVar, wVar, y3Var, dVar2, this.f20618c);
        this.f20628m = dVarA;
        return dVarA.c(j10, this.f20622g);
    }

    static /* synthetic */ long y(i iVar, long j10, androidx.compose.ui.unit.w wVar, y3 y3Var, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            y3Var = iVar.f20617b;
        }
        return iVar.x(j10, wVar, y3Var);
    }

    @Nullable
    public final androidx.compose.ui.unit.d a() {
        return this.f20624i;
    }

    public final boolean b() {
        return this.f20626k;
    }

    public final long c() {
        return this.f20634s;
    }

    public final long e() {
        return this.f20627l;
    }

    @NotNull
    public final Unit f() {
        q0 q0Var = this.f20629n;
        if (q0Var != null) {
            q0Var.a();
        }
        return Unit.f312394a;
    }

    @Nullable
    public final n0 g() {
        return this.f20625j;
    }

    public final int h(int i10, @NotNull androidx.compose.ui.unit.w wVar) {
        i iVar;
        androidx.compose.ui.unit.w wVar2;
        int i11 = this.f20632q;
        int i12 = this.f20633r;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        long jA = androidx.compose.ui.unit.c.a(0, i10, 0, Integer.MAX_VALUE);
        if (this.f20622g > 1) {
            boolean z10 = false;
            iVar = this;
            wVar2 = wVar;
            jA = y(iVar, jA, wVar2, null, 4, null);
        } else {
            iVar = this;
            wVar2 = wVar;
        }
        int iU = kotlin.ranges.r.u(j5.a(iVar.i(jA, wVar2).getHeight()), androidx.compose.ui.unit.b.q(jA));
        iVar.f20632q = i10;
        iVar.f20633r = iU;
        return iU;
    }

    @NotNull
    public final n0 i(long j10, @NotNull androidx.compose.ui.unit.w wVar) {
        q0 q0VarS = s(wVar);
        return s0.m(q0VarS, c.a(j10, this.f20620e, this.f20619d, q0VarS.i()), c.b(this.f20620e, this.f20619d, this.f20621f), this.f20619d);
    }

    public final boolean j(long j10, @NotNull androidx.compose.ui.unit.w wVar) {
        i iVar;
        androidx.compose.ui.unit.w wVar2;
        o(b.f20556b.a());
        boolean z10 = true;
        if (this.f20622g > 1) {
            int i10 = 3 & 4;
            iVar = this;
            wVar2 = wVar;
            j10 = y(iVar, j10, wVar2, null, 4, null);
        } else {
            iVar = this;
            wVar2 = wVar;
        }
        boolean z11 = false;
        if (iVar.n(j10, wVar2)) {
            n0 n0VarI = iVar.i(j10, wVar2);
            iVar.f20631p = j10;
            long jF = androidx.compose.ui.unit.c.f(j10, androidx.compose.ui.unit.u.e((((long) j5.a(n0VarI.getHeight())) & k0.f265952a) | (((long) j5.a(n0VarI.getWidth())) << 32)));
            iVar.f20627l = jF;
            if (!androidx.compose.ui.text.style.v.i(iVar.f20619d, androidx.compose.ui.text.style.v.f42256b.i()) && (((int) (jF >> 32)) < n0VarI.getWidth() || ((int) (jF & k0.f265952a)) < n0VarI.getHeight())) {
                z11 = true;
            }
            iVar.f20626k = z11;
            iVar.f20625j = n0VarI;
            return true;
        }
        if (!androidx.compose.ui.unit.b.g(j10, iVar.f20631p)) {
            n0 n0Var = iVar.f20625j;
            Intrinsics.checkNotNull(n0Var);
            long jF2 = androidx.compose.ui.unit.c.f(j10, androidx.compose.ui.unit.u.e((((long) j5.a(n0Var.getHeight())) & k0.f265952a) | (((long) j5.a(Math.min(n0Var.i(), n0Var.getWidth()))) << 32)));
            iVar.f20627l = jF2;
            if (androidx.compose.ui.text.style.v.i(iVar.f20619d, androidx.compose.ui.text.style.v.f42256b.i()) || (((int) (jF2 >> 32)) >= n0Var.getWidth() && ((int) (k0.f265952a & jF2)) >= n0Var.getHeight())) {
                z10 = false;
            }
            iVar.f20626k = z10;
            iVar.f20631p = j10;
        }
        return false;
    }

    public final int l(@NotNull androidx.compose.ui.unit.w wVar) {
        return j5.a(s(wVar).i());
    }

    public final int m(@NotNull androidx.compose.ui.unit.w wVar) {
        return j5.a(s(wVar).f());
    }

    public final void p(@Nullable androidx.compose.ui.unit.d dVar) {
        androidx.compose.ui.unit.d dVar2 = this.f20624i;
        long jE = dVar != null ? a.e(dVar) : a.f20552b.a();
        if (dVar2 == null) {
            this.f20624i = dVar;
            this.f20623h = jE;
        } else if (dVar == null || !a.g(this.f20623h, jE)) {
            this.f20624i = dVar;
            this.f20623h = jE;
            o(b.f20556b.b());
            k();
        }
    }

    public final void q(boolean z10) {
        this.f20626k = z10;
    }

    public final void r(long j10) {
        this.f20634s = j10;
    }

    public final void t(long j10) {
        this.f20627l = j10;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ParagraphLayoutCache(paragraph=");
        sb2.append(this.f20625j != null ? "<paragraph>" : AbstractJsonLexerKt.NULL);
        sb2.append(", lastDensity=");
        sb2.append((Object) a.k(this.f20623h));
        sb2.append(", history=");
        sb2.append(this.f20634s);
        sb2.append(", constraints=$)");
        return sb2.toString();
    }

    public final void u(@Nullable n0 n0Var) {
        this.f20625j = n0Var;
    }

    @Nullable
    public final p3 v(@NotNull y3 y3Var) {
        androidx.compose.ui.unit.d dVar;
        androidx.compose.ui.unit.w wVar = this.f20630o;
        if (wVar == null || (dVar = this.f20624i) == null) {
            return null;
        }
        androidx.compose.ui.text.f fVar = new androidx.compose.ui.text.f(this.f20616a, null, 2, null);
        if (this.f20625j == null || this.f20629n == null) {
            return null;
        }
        long jB = androidx.compose.ui.unit.b.b(this.f20631p & androidx.compose.ui.unit.c.f42680o);
        return new p3(new o3(fVar, y3Var, CollectionsKt.emptyList(), this.f20621f, this.f20620e, this.f20619d, dVar, wVar, this.f20618c, jB, (DefaultConstructorMarker) null), new f0(new i0(fVar, y3Var, (List<androidx.compose.ui.text.f.e<v0>>) CollectionsKt.emptyList(), dVar, this.f20618c), jB, this.f20621f, this.f20619d, (DefaultConstructorMarker) null), this.f20627l, null);
    }

    public final void w(@NotNull String str, @NotNull y3 y3Var, @NotNull androidx.compose.ui.text.font.y.b bVar, int i10, boolean z10, int i11, int i12) {
        this.f20616a = str;
        this.f20617b = y3Var;
        this.f20618c = bVar;
        this.f20619d = i10;
        this.f20620e = z10;
        this.f20621f = i11;
        this.f20622g = i12;
        o(b.f20556b.c());
        k();
    }

    private i(String str, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, int i10, boolean z10, int i11, int i12) {
        this.f20616a = str;
        this.f20617b = y3Var;
        this.f20618c = bVar;
        this.f20619d = i10;
        this.f20620e = z10;
        this.f20621f = i11;
        this.f20622g = i12;
        this.f20623h = a.f20552b.a();
        long j10 = 0;
        this.f20627l = androidx.compose.ui.unit.u.e((j10 & k0.f265952a) | (j10 << 32));
        this.f20631p = androidx.compose.ui.unit.b.f42658b.c(0, 0);
        this.f20632q = -1;
        this.f20633r = -1;
    }

    public /* synthetic */ i(String str, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, int i10, boolean z10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, y3Var, bVar, (i13 & 8) != 0 ? androidx.compose.ui.text.style.v.f42256b.a() : i10, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? Integer.MAX_VALUE : i11, (i13 & 64) != 0 ? 1 : i12, null);
    }
}
