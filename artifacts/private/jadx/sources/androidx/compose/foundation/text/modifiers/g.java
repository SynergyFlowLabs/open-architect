package androidx.compose.foundation.text.modifiers;

import androidx.annotation.l1;
import androidx.compose.foundation.text.f5;
import androidx.compose.foundation.text.j5;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.text.f0;
import androidx.compose.ui.text.i0;
import androidx.compose.ui.text.o3;
import androidx.compose.ui.text.p3;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.y3;
import androidx.compose.ui.text.z3;
import com.rabbitmq.client.k0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMultiParagraphLayoutCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,532:1\n1#2:533\n30#3:534\n80#4:535\n*S KotlinDebug\n*F\n+ 1 MultiParagraphLayoutCache.kt\nandroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache\n*L\n274#1:534\n274#1:535\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f20592t = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.text.f f20593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.text.font.y.b f20594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private List<androidx.compose.ui.text.f.e<v0>> f20599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private f5 f20600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private d f20601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f20602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.d f20603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private y3 f20604l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private i0 f20605m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.unit.w f20606n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private p3 f20607o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f20608p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f20609q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private a f20610r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f20611s;

    private final class a implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private p3 f20612a;

        public a() {
        }

        @Override // androidx.compose.foundation.text.modifiers.y
        @NotNull
        public p3 T5(long j10, @NotNull androidx.compose.ui.text.f fVar, long j11) {
            long jC;
            y3 y3Var = g.this.f20604l;
            long jB = androidx.compose.ui.unit.z.p(j11) ? h.b(g.this.f20604l.x(), j11) : j11;
            if (!androidx.compose.ui.unit.z.j(jB, g.this.f20604l.x())) {
                g gVar = g.this;
                gVar.z(y3.m(gVar.f20604l, 0L, jB, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
            }
            if (g.this.f20598f > 1) {
                g gVar2 = g.this;
                androidx.compose.ui.unit.w wVar = gVar2.f20606n;
                Intrinsics.checkNotNull(wVar);
                jC = gVar2.C(j10, wVar);
            } else {
                jC = j10;
            }
            g gVar3 = g.this;
            androidx.compose.ui.unit.w wVar2 = gVar3.f20606n;
            Intrinsics.checkNotNull(wVar2);
            f0 f0VarO = gVar3.o(jC, wVar2);
            g gVar4 = g.this;
            androidx.compose.ui.unit.w wVar3 = gVar4.f20606n;
            Intrinsics.checkNotNull(wVar3);
            p3 p3VarA = gVar4.A(wVar3, jC, f0VarO);
            this.f20612a = p3VarA;
            g.this.z(y3Var);
            return p3VarA;
        }

        @Nullable
        public final p3 c() {
            return this.f20612a;
        }

        @Override // androidx.compose.ui.unit.d
        public float getDensity() {
            androidx.compose.ui.unit.d dVarH = g.this.h();
            Intrinsics.checkNotNull(dVarH);
            return dVarH.getDensity();
        }

        @Override // androidx.compose.ui.unit.n
        public float m0() {
            androidx.compose.ui.unit.d dVarH = g.this.h();
            Intrinsics.checkNotNull(dVarH);
            return dVarH.m0();
        }

        @Override // androidx.compose.ui.unit.d
        public float p6(long j10) {
            if (!androidx.compose.ui.unit.z.p(j10)) {
                return S7(y(j10));
            }
            if (androidx.compose.ui.unit.z.p(g.this.f20604l.x())) {
                throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
            }
            if (androidx.compose.ui.unit.z.j(g.this.f20604l.x(), androidx.compose.ui.unit.z.f42728b.b())) {
                throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
            }
            return p6(g.this.f20604l.x()) * androidx.compose.ui.unit.z.n(j10);
        }
    }

    public /* synthetic */ g(androidx.compose.ui.text.f fVar, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, int i10, boolean z10, int i11, int i12, List list, f5 f5Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, y3Var, bVar, i10, z10, i11, i12, list, f5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p3 A(androidx.compose.ui.unit.w wVar, long j10, f0 f0Var) {
        float fMin = Math.min(f0Var.m().i(), f0Var.L());
        androidx.compose.ui.text.f fVar = this.f20593a;
        y3 y3Var = this.f20604l;
        List<androidx.compose.ui.text.f.e<v0>> listEmptyList = this.f20599g;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        int i10 = this.f20597e;
        boolean z10 = this.f20596d;
        int i11 = this.f20595c;
        androidx.compose.ui.unit.d dVar = this.f20603k;
        Intrinsics.checkNotNull(dVar);
        return new p3(new o3(fVar, y3Var, listEmptyList, i10, z10, i11, dVar, wVar, this.f20594b, j10, (DefaultConstructorMarker) null), f0Var, androidx.compose.ui.unit.c.f(j10, androidx.compose.ui.unit.u.e((((long) j5.a(f0Var.k())) & k0.f265952a) | (((long) j5.a(fMin)) << 32))), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long C(long j10, androidx.compose.ui.unit.w wVar) {
        d.a aVar = d.f20564h;
        d dVar = this.f20601i;
        y3 y3Var = this.f20604l;
        androidx.compose.ui.unit.d dVar2 = this.f20603k;
        Intrinsics.checkNotNull(dVar2);
        d dVarA = aVar.a(dVar, wVar, y3Var, dVar2, this.f20594b);
        this.f20601i = dVarA;
        return dVarA.c(j10, this.f20598f);
    }

    private final a i() {
        if (this.f20610r == null) {
            this.f20610r = new a();
        }
        a aVar = this.f20610r;
        Intrinsics.checkNotNull(aVar);
        return aVar;
    }

    @l1
    public static /* synthetic */ void k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f0 o(long j10, androidx.compose.ui.unit.w wVar) {
        i0 i0VarY = y(wVar);
        return new f0(i0VarY, c.a(j10, this.f20596d, this.f20595c, i0VarY.i()), c.b(this.f20596d, this.f20595c, this.f20597e), this.f20595c, (DefaultConstructorMarker) null);
    }

    private final void q() {
        this.f20605m = null;
        this.f20607o = null;
        this.f20609q = -1;
        this.f20608p = -1;
        this.f20610r = null;
    }

    private final void r() {
        v(b.f20556b.d());
        this.f20605m = null;
        this.f20607o = null;
        this.f20609q = -1;
        this.f20608p = -1;
    }

    private final boolean u(p3 p3Var, long j10, androidx.compose.ui.unit.w wVar) {
        if (p3Var == null || p3Var.x().m().a() || wVar != p3Var.l().f()) {
            return true;
        }
        if (androidx.compose.ui.unit.b.g(j10, p3Var.l().c())) {
            return false;
        }
        return androidx.compose.ui.unit.b.p(j10) != androidx.compose.ui.unit.b.p(p3Var.l().c()) || androidx.compose.ui.unit.b.r(j10) != androidx.compose.ui.unit.b.r(p3Var.l().c()) || ((float) androidx.compose.ui.unit.b.o(j10)) < p3Var.x().k() || p3Var.x().i();
    }

    private final void v(long j10) {
        this.f20611s = j10 | (this.f20611s << 2);
    }

    private final i0 y(androidx.compose.ui.unit.w wVar) {
        i0 i0Var = this.f20605m;
        if (i0Var == null || wVar != this.f20606n || i0Var.a()) {
            this.f20606n = wVar;
            androidx.compose.ui.text.f fVar = this.f20593a;
            y3 y3VarD = z3.d(this.f20604l, wVar);
            androidx.compose.ui.unit.d dVar = this.f20603k;
            Intrinsics.checkNotNull(dVar);
            androidx.compose.ui.text.font.y.b bVar = this.f20594b;
            List<androidx.compose.ui.text.f.e<v0>> listEmptyList = this.f20599g;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            i0Var = new i0(fVar, y3VarD, listEmptyList, dVar, bVar);
        }
        this.f20605m = i0Var;
        return i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(y3 y3Var) {
        boolean zA0 = y3Var.a0(this.f20604l);
        this.f20604l = y3Var;
        if (zA0) {
            return;
        }
        r();
    }

    public final void B(@NotNull androidx.compose.ui.text.f fVar, @NotNull y3 y3Var, @NotNull androidx.compose.ui.text.font.y.b bVar, int i10, boolean z10, int i11, int i12, @Nullable List<androidx.compose.ui.text.f.e<v0>> list, @Nullable f5 f5Var) {
        this.f20593a = fVar;
        z(y3Var);
        this.f20594b = bVar;
        this.f20595c = i10;
        this.f20596d = z10;
        this.f20597e = i11;
        this.f20598f = i12;
        this.f20599g = list;
        this.f20600h = f5Var;
        v(b.f20556b.c());
        q();
    }

    @Nullable
    public final androidx.compose.ui.unit.d h() {
        return this.f20603k;
    }

    public final long j() {
        return this.f20611s;
    }

    @Nullable
    public final p3 l() {
        return this.f20607o;
    }

    @NotNull
    public final p3 m() {
        p3 p3Var = this.f20607o;
        if (p3Var != null) {
            return p3Var;
        }
        throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + this);
    }

    public final int n(int i10, @NotNull androidx.compose.ui.unit.w wVar) {
        int i11 = this.f20608p;
        int i12 = this.f20609q;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        long jA = androidx.compose.ui.unit.c.a(0, i10, 0, Integer.MAX_VALUE);
        if (this.f20598f > 1) {
            jA = C(jA, wVar);
        }
        int iU = kotlin.ranges.r.u(j5.a(o(jA, wVar).k()), androidx.compose.ui.unit.b.q(jA));
        this.f20608p = i10;
        this.f20609q = iU;
        return iU;
    }

    public final boolean p(long j10, @NotNull androidx.compose.ui.unit.w wVar) {
        v(b.f20556b.a());
        long jC = this.f20598f > 1 ? C(j10, wVar) : j10;
        if (!u(this.f20607o, jC, wVar)) {
            p3 p3Var = this.f20607o;
            Intrinsics.checkNotNull(p3Var);
            if (androidx.compose.ui.unit.b.g(jC, p3Var.l().c())) {
                return false;
            }
            p3 p3Var2 = this.f20607o;
            Intrinsics.checkNotNull(p3Var2);
            this.f20607o = A(wVar, jC, p3Var2.x());
            return true;
        }
        if (this.f20600h != null) {
            this.f20606n = wVar;
            long jX = this.f20604l.x();
            f5 f5Var = this.f20600h;
            Intrinsics.checkNotNull(f5Var);
            long jA = f5Var.a(i(), j10, this.f20593a);
            if (androidx.compose.ui.unit.z.p(jA)) {
                jA = h.b(jX, jA);
            }
            long j11 = jA;
            p3 p3VarC = i().c();
            if (p3VarC != null && androidx.compose.ui.unit.z.j(j11, p3VarC.l().m().x()) && androidx.compose.ui.text.style.v.i(p3VarC.l().h(), this.f20595c)) {
                this.f20607o = p3VarC;
                return true;
            }
            z(y3.m(this.f20604l, 0L, j11, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
        }
        this.f20607o = A(wVar, jC, o(jC, wVar));
        return true;
    }

    public final int s(@NotNull androidx.compose.ui.unit.w wVar) {
        return j5.a(y(wVar).i());
    }

    public final int t(@NotNull androidx.compose.ui.unit.w wVar) {
        return j5.a(y(wVar).f());
    }

    @NotNull
    public String toString() {
        o3 o3VarL;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MultiParagraphLayoutCache(textLayoutResult=");
        p3 p3Var = this.f20607o;
        Object objA = AbstractJsonLexerKt.NULL;
        sb2.append(p3Var != null ? "<TextLayoutResult>" : AbstractJsonLexerKt.NULL);
        sb2.append(", lastDensity=");
        sb2.append((Object) androidx.compose.foundation.text.modifiers.a.k(this.f20602j));
        sb2.append(", history=");
        sb2.append(this.f20611s);
        sb2.append(", constraints=");
        p3 p3Var2 = this.f20607o;
        if (p3Var2 != null && (o3VarL = p3Var2.l()) != null) {
            objA = androidx.compose.ui.unit.b.a(o3VarL.c());
        }
        sb2.append(objA);
        sb2.append(')');
        return sb2.toString();
    }

    public final void w(@Nullable androidx.compose.ui.unit.d dVar) {
        androidx.compose.ui.unit.d dVar2 = this.f20603k;
        long jE = dVar != null ? androidx.compose.foundation.text.modifiers.a.e(dVar) : androidx.compose.foundation.text.modifiers.a.f20552b.a();
        if (dVar2 == null) {
            this.f20603k = dVar;
            this.f20602j = jE;
        } else if (dVar == null || !androidx.compose.foundation.text.modifiers.a.g(this.f20602j, jE)) {
            this.f20603k = dVar;
            this.f20602j = jE;
            v(b.f20556b.b());
            q();
        }
    }

    public final void x(long j10) {
        this.f20611s = j10;
    }

    private g(androidx.compose.ui.text.f fVar, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, int i10, boolean z10, int i11, int i12, List<androidx.compose.ui.text.f.e<v0>> list, f5 f5Var) {
        this.f20593a = fVar;
        this.f20594b = bVar;
        this.f20595c = i10;
        this.f20596d = z10;
        this.f20597e = i11;
        this.f20598f = i12;
        this.f20599g = list;
        this.f20600h = f5Var;
        this.f20602j = androidx.compose.foundation.text.modifiers.a.f20552b.a();
        this.f20604l = y3Var;
        this.f20608p = -1;
        this.f20609q = -1;
    }

    public /* synthetic */ g(androidx.compose.ui.text.f fVar, y3 y3Var, androidx.compose.ui.text.font.y.b bVar, int i10, boolean z10, int i11, int i12, List list, f5 f5Var, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, y3Var, bVar, (i13 & 8) != 0 ? androidx.compose.ui.text.style.v.f42256b.a() : i10, (i13 & 16) != 0 ? true : z10, (i13 & 32) != 0 ? Integer.MAX_VALUE : i11, (i13 & 64) != 0 ? 1 : i12, (i13 & 128) != 0 ? null : list, (i13 & 256) != 0 ? null : f5Var, null);
    }
}
