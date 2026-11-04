package androidx.compose.ui.graphics.drawscope;

import androidx.annotation.x;
import androidx.compose.ui.graphics.d0;
import androidx.compose.ui.graphics.h2;
import androidx.compose.ui.graphics.i0;
import androidx.compose.ui.graphics.j2;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.l1;
import androidx.compose.ui.graphics.l2;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.graphics.u3;
import androidx.compose.ui.graphics.v3;
import androidx.compose.ui.unit.w;
import java.util.List;
import kotlin.Unit;
import kotlin.a1;
import kotlin.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nCanvasDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,776:1\n65#2:777\n69#2:780\n65#2:783\n69#2:787\n65#2:791\n69#2:794\n65#2:797\n69#2:801\n65#2:805\n69#2:808\n65#2:811\n69#2:815\n65#2:825\n69#2:828\n65#2:831\n69#2:835\n65#2:845\n69#2:848\n65#2:851\n69#2:855\n65#2:859\n69#2:862\n65#2:865\n69#2:869\n65#2:873\n69#2:876\n65#2:879\n69#2:883\n65#2:887\n69#2:890\n65#2:893\n69#2:897\n60#3:778\n70#3:781\n60#3:784\n70#3:788\n60#3:792\n70#3:795\n60#3:798\n70#3:802\n60#3:806\n70#3:809\n60#3:812\n70#3:816\n60#3:820\n70#3:823\n60#3:826\n70#3:829\n60#3:832\n70#3:836\n60#3:840\n70#3:843\n60#3:846\n70#3:849\n60#3:852\n70#3:856\n60#3:860\n70#3:863\n60#3:866\n70#3:870\n60#3:874\n70#3:877\n60#3:880\n70#3:884\n60#3:888\n70#3:891\n60#3:894\n70#3:898\n22#4:779\n22#4:782\n22#4:785\n22#4:789\n22#4:793\n22#4:796\n22#4:799\n22#4:803\n22#4:807\n22#4:810\n22#4:813\n22#4:817\n22#4:821\n22#4:824\n22#4:827\n22#4:830\n22#4:833\n22#4:837\n22#4:841\n22#4:844\n22#4:847\n22#4:850\n22#4:853\n22#4:857\n22#4:861\n22#4:864\n22#4:867\n22#4:871\n22#4:875\n22#4:878\n22#4:881\n22#4:885\n22#4:889\n22#4:892\n22#4:895\n22#4:899\n57#5:786\n61#5:790\n57#5:800\n61#5:804\n57#5:814\n61#5:818\n57#5:834\n61#5:838\n57#5:854\n61#5:858\n57#5:868\n61#5:872\n57#5:882\n61#5:886\n57#5:896\n61#5:900\n48#6:819\n53#6:822\n48#6:839\n53#6:842\n1#7:901\n*S KotlinDebug\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n177#1:777\n178#1:780\n179#1:783\n180#1:787\n195#1:791\n196#1:794\n197#1:797\n198#1:801\n283#1:805\n284#1:808\n285#1:811\n286#1:815\n304#1:825\n305#1:828\n306#1:831\n307#1:835\n356#1:845\n357#1:848\n358#1:851\n359#1:855\n374#1:859\n375#1:862\n376#1:865\n377#1:869\n395#1:873\n396#1:876\n397#1:879\n398#1:883\n419#1:887\n420#1:890\n421#1:893\n422#1:897\n177#1:778\n178#1:781\n179#1:784\n180#1:788\n195#1:792\n196#1:795\n197#1:798\n198#1:802\n283#1:806\n284#1:809\n285#1:812\n286#1:816\n287#1:820\n288#1:823\n304#1:826\n305#1:829\n306#1:832\n307#1:836\n308#1:840\n309#1:843\n356#1:846\n357#1:849\n358#1:852\n359#1:856\n374#1:860\n375#1:863\n376#1:866\n377#1:870\n395#1:874\n396#1:877\n397#1:880\n398#1:884\n419#1:888\n420#1:891\n421#1:894\n422#1:898\n177#1:779\n178#1:782\n179#1:785\n180#1:789\n195#1:793\n196#1:796\n197#1:799\n198#1:803\n283#1:807\n284#1:810\n285#1:813\n286#1:817\n287#1:821\n288#1:824\n304#1:827\n305#1:830\n306#1:833\n307#1:837\n308#1:841\n309#1:844\n356#1:847\n357#1:850\n358#1:853\n359#1:857\n374#1:861\n375#1:864\n376#1:867\n377#1:871\n395#1:875\n396#1:878\n397#1:881\n398#1:885\n419#1:889\n420#1:892\n421#1:895\n422#1:899\n179#1:786\n180#1:790\n197#1:800\n198#1:804\n285#1:814\n286#1:818\n306#1:834\n307#1:838\n358#1:854\n359#1:858\n376#1:868\n377#1:872\n397#1:882\n398#1:886\n421#1:896\n422#1:900\n287#1:819\n288#1:822\n308#1:839\n309#1:842\n*E\n"})
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C0286a f37725a = new C0286a(null, null, null, 0, 15, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f37726b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private h2 f37727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private h2 f37728d;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.a$a, reason: collision with other inner class name */
    @a1
    public static final class C0286a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private androidx.compose.ui.unit.d f37729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private w f37730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private k0 f37731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f37732d;

        public /* synthetic */ C0286a(androidx.compose.ui.unit.d dVar, w wVar, k0 k0Var, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, wVar, k0Var, j10);
        }

        public static /* synthetic */ C0286a f(C0286a c0286a, androidx.compose.ui.unit.d dVar, w wVar, k0 k0Var, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                dVar = c0286a.f37729a;
            }
            if ((i10 & 2) != 0) {
                wVar = c0286a.f37730b;
            }
            if ((i10 & 4) != 0) {
                k0Var = c0286a.f37731c;
            }
            if ((i10 & 8) != 0) {
                j10 = c0286a.f37732d;
            }
            k0 k0Var2 = k0Var;
            return c0286a.e(dVar, wVar, k0Var2, j10);
        }

        @NotNull
        public final androidx.compose.ui.unit.d a() {
            return this.f37729a;
        }

        @NotNull
        public final w b() {
            return this.f37730b;
        }

        @NotNull
        public final k0 c() {
            return this.f37731c;
        }

        public final long d() {
            return this.f37732d;
        }

        @NotNull
        public final C0286a e(@NotNull androidx.compose.ui.unit.d dVar, @NotNull w wVar, @NotNull k0 k0Var, long j10) {
            return new C0286a(dVar, wVar, k0Var, j10, null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0286a)) {
                return false;
            }
            C0286a c0286a = (C0286a) obj;
            return Intrinsics.areEqual(this.f37729a, c0286a.f37729a) && this.f37730b == c0286a.f37730b && Intrinsics.areEqual(this.f37731c, c0286a.f37731c) && n0.n.k(this.f37732d, c0286a.f37732d);
        }

        @NotNull
        public final k0 g() {
            return this.f37731c;
        }

        @NotNull
        public final androidx.compose.ui.unit.d h() {
            return this.f37729a;
        }

        public int hashCode() {
            return (((((this.f37729a.hashCode() * 31) + this.f37730b.hashCode()) * 31) + this.f37731c.hashCode()) * 31) + n0.n.u(this.f37732d);
        }

        @NotNull
        public final w i() {
            return this.f37730b;
        }

        public final long j() {
            return this.f37732d;
        }

        public final void k(@NotNull k0 k0Var) {
            this.f37731c = k0Var;
        }

        public final void l(@NotNull androidx.compose.ui.unit.d dVar) {
            this.f37729a = dVar;
        }

        public final void m(@NotNull w wVar) {
            this.f37730b = wVar;
        }

        public final void n(long j10) {
            this.f37732d = j10;
        }

        @NotNull
        public String toString() {
            return "DrawParams(density=" + this.f37729a + ", layoutDirection=" + this.f37730b + ", canvas=" + this.f37731c + ", size=" + ((Object) n0.n.x(this.f37732d)) + ')';
        }

        private C0286a(androidx.compose.ui.unit.d dVar, w wVar, k0 k0Var, long j10) {
            this.f37729a = dVar;
            this.f37730b = wVar;
            this.f37731c = k0Var;
            this.f37732d = j10;
        }

        public /* synthetic */ C0286a(androidx.compose.ui.unit.d dVar, w wVar, k0 k0Var, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? e.a() : dVar, (i10 & 2) != 0 ? w.Ltr : wVar, (i10 & 4) != 0 ? l.f37743a : k0Var, (i10 & 8) != 0 ? n0.n.f332724b.c() : j10, null);
        }
    }

    public static final class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j f37733a = androidx.compose.ui.graphics.drawscope.b.b(this);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.compose.ui.graphics.layer.c f37734b;

        b() {
        }

        @Override // androidx.compose.ui.graphics.drawscope.d
        public void b(w wVar) {
            a.this.U().m(wVar);
        }

        @Override // androidx.compose.ui.graphics.drawscope.d
        public long d() {
            return a.this.U().j();
        }

        @Override // androidx.compose.ui.graphics.drawscope.d
        public void e(androidx.compose.ui.unit.d dVar) {
            a.this.U().l(dVar);
        }

        @Override // androidx.compose.ui.graphics.drawscope.d
        public k0 f() {
            return a.this.U().g();
        }

        @Override // androidx.compose.ui.graphics.drawscope.d
        public void g(long j10) {
            a.this.U().n(j10);
        }

        @Override // androidx.compose.ui.graphics.drawscope.d
        public androidx.compose.ui.unit.d getDensity() {
            return a.this.U().h();
        }

        @Override // androidx.compose.ui.graphics.drawscope.d
        public w getLayoutDirection() {
            return a.this.U().i();
        }

        @Override // androidx.compose.ui.graphics.drawscope.d
        public androidx.compose.ui.graphics.layer.c h() {
            return this.f37734b;
        }

        @Override // androidx.compose.ui.graphics.drawscope.d
        public j i() {
            return this.f37733a;
        }

        @Override // androidx.compose.ui.graphics.drawscope.d
        public void j(androidx.compose.ui.graphics.layer.c cVar) {
            this.f37734b = cVar;
        }

        @Override // androidx.compose.ui.graphics.drawscope.d
        public void k(k0 k0Var) {
            a.this.U().k(k0Var);
        }
    }

    static /* synthetic */ h2 I(a aVar, i0 i0Var, i iVar, float f10, r0 r0Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i11 = f.H.b();
        }
        return aVar.x(i0Var, iVar, f10, r0Var, i10, i11);
    }

    private final h2 J(long j10, float f10, float f11, int i10, int i11, l2 l2Var, @x(from = 0.0d, to = 1.0d) float f12, r0 r0Var, int i12, int i13) {
        h2 h2VarZ = Z();
        long jW = W(j10, f12);
        if (!q0.y(h2VarZ.u(), jW)) {
            h2VarZ.S(jW);
        }
        if (h2VarZ.v() != null) {
            h2VarZ.M(null);
        }
        if (!Intrinsics.areEqual(h2VarZ.e(), r0Var)) {
            h2VarZ.f(r0Var);
        }
        if (!d0.G(h2VarZ.t(), i12)) {
            h2VarZ.s(i12);
        }
        if (h2VarZ.I() != f10) {
            h2VarZ.H(f10);
        }
        if (h2VarZ.C() != f11) {
            h2VarZ.E(f11);
        }
        if (!u3.g(h2VarZ.z(), i10)) {
            h2VarZ.x(i10);
        }
        if (!v3.g(h2VarZ.B(), i11)) {
            h2VarZ.A(i11);
        }
        if (!Intrinsics.areEqual(h2VarZ.L(), l2Var)) {
            h2VarZ.K(l2Var);
        }
        if (!l1.h(h2VarZ.N(), i13)) {
            h2VarZ.y(i13);
        }
        return h2VarZ;
    }

    static /* synthetic */ h2 K(a aVar, long j10, float f10, float f11, int i10, int i11, l2 l2Var, float f12, r0 r0Var, int i12, int i13, int i14, Object obj) {
        return aVar.J(j10, f10, f11, i10, i11, l2Var, f12, r0Var, i12, (i14 & 512) != 0 ? f.H.b() : i13);
    }

    private final h2 M(i0 i0Var, float f10, float f11, int i10, int i11, l2 l2Var, @x(from = 0.0d, to = 1.0d) float f12, r0 r0Var, int i12, int i13) {
        h2 h2VarZ = Z();
        if (i0Var != null) {
            i0Var.a(d(), h2VarZ, f12);
        } else if (h2VarZ.r() != f12) {
            h2VarZ.setAlpha(f12);
        }
        if (!Intrinsics.areEqual(h2VarZ.e(), r0Var)) {
            h2VarZ.f(r0Var);
        }
        if (!d0.G(h2VarZ.t(), i12)) {
            h2VarZ.s(i12);
        }
        if (h2VarZ.I() != f10) {
            h2VarZ.H(f10);
        }
        if (h2VarZ.C() != f11) {
            h2VarZ.E(f11);
        }
        if (!u3.g(h2VarZ.z(), i10)) {
            h2VarZ.x(i10);
        }
        if (!v3.g(h2VarZ.B(), i11)) {
            h2VarZ.A(i11);
        }
        if (!Intrinsics.areEqual(h2VarZ.L(), l2Var)) {
            h2VarZ.K(l2Var);
        }
        if (!l1.h(h2VarZ.N(), i13)) {
            h2VarZ.y(i13);
        }
        return h2VarZ;
    }

    static /* synthetic */ h2 N(a aVar, i0 i0Var, float f10, float f11, int i10, int i11, l2 l2Var, float f12, r0 r0Var, int i12, int i13, int i14, Object obj) {
        return aVar.M(i0Var, f10, f11, i10, i11, l2Var, f12, r0Var, i12, (i14 & 512) != 0 ? f.H.b() : i13);
    }

    @a1
    public static /* synthetic */ void V() {
    }

    private final long W(long j10, float f10) {
        if (f10 == 1.0f) {
            return j10;
        }
        int i10 = 6 ^ 0;
        return q0.w(j10, q0.A(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private final h2 X() {
        h2 h2VarA = this.f37727c;
        if (h2VarA == null) {
            h2VarA = androidx.compose.ui.graphics.m.a();
            h2VarA.G(j2.f37801b.a());
            this.f37727c = h2VarA;
        }
        return h2VarA;
    }

    private final h2 Z() {
        h2 h2VarA = this.f37728d;
        if (h2VarA == null) {
            h2VarA = androidx.compose.ui.graphics.m.a();
            h2VarA.G(j2.f37801b.b());
            this.f37728d = h2VarA;
        }
        return h2VarA;
    }

    private final h2 b0(i iVar) {
        if (Intrinsics.areEqual(iVar, m.f37744a)) {
            return X();
        }
        if (!(iVar instanceof n)) {
            throw new kotlin.k0();
        }
        h2 h2VarZ = Z();
        n nVar = (n) iVar;
        if (h2VarZ.I() != nVar.g()) {
            h2VarZ.H(nVar.g());
        }
        if (!u3.g(h2VarZ.z(), nVar.c())) {
            h2VarZ.x(nVar.c());
        }
        if (h2VarZ.C() != nVar.e()) {
            h2VarZ.E(nVar.e());
        }
        if (!v3.g(h2VarZ.B(), nVar.d())) {
            h2VarZ.A(nVar.d());
        }
        if (!Intrinsics.areEqual(h2VarZ.L(), nVar.f())) {
            h2VarZ.K(nVar.f());
        }
        return h2VarZ;
    }

    private final h2 c(long j10, i iVar, @x(from = 0.0d, to = 1.0d) float f10, r0 r0Var, int i10, int i11) {
        h2 h2VarB0 = b0(iVar);
        long jW = W(j10, f10);
        if (!q0.y(h2VarB0.u(), jW)) {
            h2VarB0.S(jW);
        }
        if (h2VarB0.v() != null) {
            h2VarB0.M(null);
        }
        if (!Intrinsics.areEqual(h2VarB0.e(), r0Var)) {
            h2VarB0.f(r0Var);
        }
        if (!d0.G(h2VarB0.t(), i10)) {
            h2VarB0.s(i10);
        }
        if (!l1.h(h2VarB0.N(), i11)) {
            h2VarB0.y(i11);
        }
        return h2VarB0;
    }

    static /* synthetic */ h2 w(a aVar, long j10, i iVar, float f10, r0 r0Var, int i10, int i11, int i12, Object obj) {
        return aVar.c(j10, iVar, f10, r0Var, i10, (i12 & 32) != 0 ? f.H.b() : i11);
    }

    private final h2 x(i0 i0Var, i iVar, @x(from = 0.0d, to = 1.0d) float f10, r0 r0Var, int i10, int i11) {
        h2 h2VarB0 = b0(iVar);
        if (i0Var != null) {
            i0Var.a(d(), h2VarB0, f10);
        } else {
            if (h2VarB0.v() != null) {
                h2VarB0.M(null);
            }
            long jU = h2VarB0.u();
            q0.a aVar = q0.f38131b;
            if (!q0.y(jU, aVar.a())) {
                h2VarB0.S(aVar.a());
            }
            if (h2VarB0.r() != f10) {
                h2VarB0.setAlpha(f10);
            }
        }
        if (!Intrinsics.areEqual(h2VarB0.e(), r0Var)) {
            h2VarB0.f(r0Var);
        }
        if (!d0.G(h2VarB0.t(), i10)) {
            h2VarB0.s(i10);
        }
        if (!l1.h(h2VarB0.N(), i11)) {
            h2VarB0.y(i11);
        }
        return h2VarB0;
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void C2(@NotNull t1 t1Var, long j10, @x(from = 0.0d, to = 1.0d) float f10, @NotNull i iVar, @Nullable r0 r0Var, int i10) {
        this.f37725a.g().z(t1Var, j10, I(this, null, iVar, f10, r0Var, i10, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void C7(@NotNull i0 i0Var, long j10, long j11, long j12, @x(from = 0.0d, to = 1.0d) float f10, @NotNull i iVar, @Nullable r0 r0Var, int i10) {
        k0 k0VarG = this.f37725a.g();
        int i11 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i11);
        int i12 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
        k0VarG.P(fIntBitsToFloat, Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a)), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & com.rabbitmq.client.k0.f265952a)), I(this, i0Var, iVar, f10, r0Var, i10, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void F1(@NotNull k2 k2Var, @NotNull i0 i0Var, @x(from = 0.0d, to = 1.0d) float f10, @NotNull i iVar, @Nullable r0 r0Var, int i10) {
        this.f37725a.g().M(k2Var, I(this, i0Var, iVar, f10, r0Var, i10, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @b1(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    public /* synthetic */ void F6(t1 t1Var, long j10, long j11, long j12, long j13, @x(from = 0.0d, to = 1.0d) float f10, i iVar, r0 r0Var, int i10) {
        this.f37725a.g().g(t1Var, j10, j11, j12, j13, I(this, null, iVar, f10, r0Var, i10, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void L2(@NotNull i0 i0Var, long j10, long j11, @x(from = 0.0d, to = 1.0d) float f10, @NotNull i iVar, @Nullable r0 r0Var, int i10) {
        k0 k0VarG = this.f37725a.g();
        int i11 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i11);
        int i12 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
        k0VarG.x(fIntBitsToFloat, Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a)), I(this, i0Var, iVar, f10, r0Var, i10, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void O7(@NotNull i0 i0Var, long j10, long j11, @x(from = 0.0d, to = 1.0d) float f10, @NotNull i iVar, @Nullable r0 r0Var, int i10) {
        k0 k0VarG = this.f37725a.g();
        int i11 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i11);
        int i12 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
        k0VarG.y(fIntBitsToFloat, Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a)), I(this, i0Var, iVar, f10, r0Var, i10, 0, 32, null));
    }

    public final void P(@NotNull androidx.compose.ui.unit.d dVar, @NotNull w wVar, @NotNull k0 k0Var, long j10, @NotNull Function1<? super f, Unit> function1) {
        C0286a c0286aU = U();
        androidx.compose.ui.unit.d dVarA = c0286aU.a();
        w wVarB = c0286aU.b();
        k0 k0VarC = c0286aU.c();
        long jD = c0286aU.d();
        C0286a c0286aU2 = U();
        c0286aU2.l(dVar);
        c0286aU2.m(wVar);
        c0286aU2.k(k0Var);
        c0286aU2.n(j10);
        k0Var.save();
        function1.invoke(this);
        k0Var.B();
        C0286a c0286aU3 = U();
        c0286aU3.l(dVarA);
        c0286aU3.m(wVarB);
        c0286aU3.k(k0VarC);
        c0286aU3.n(jD);
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void R2(long j10, long j11, long j12, float f10, int i10, @Nullable l2 l2Var, @x(from = 0.0d, to = 1.0d) float f11, @Nullable r0 r0Var, int i11) {
        this.f37725a.g().F(j11, j12, K(this, j10, f10, 4.0f, i10, v3.f38275b.b(), l2Var, f11, r0Var, i11, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void S2(@NotNull i0 i0Var, float f10, float f11, boolean z10, long j10, long j11, @x(from = 0.0d, to = 1.0d) float f12, @NotNull i iVar, @Nullable r0 r0Var, int i10) {
        k0 k0VarG = this.f37725a.g();
        int i11 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i11);
        int i12 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
        k0VarG.n(fIntBitsToFloat, Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j11 & com.rabbitmq.client.k0.f265952a)), f10, f11, z10, I(this, i0Var, iVar, f12, r0Var, i10, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void T2(@NotNull k2 k2Var, long j10, @x(from = 0.0d, to = 1.0d) float f10, @NotNull i iVar, @Nullable r0 r0Var, int i10) {
        this.f37725a.g().M(k2Var, w(this, j10, iVar, f10, r0Var, i10, 0, 32, null));
    }

    @NotNull
    public final C0286a U() {
        return this.f37725a;
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void V7(@NotNull List<n0.g> list, int i10, long j10, float f10, int i11, @Nullable l2 l2Var, @x(from = 0.0d, to = 1.0d) float f11, @Nullable r0 r0Var, int i12) {
        this.f37725a.g().f(i10, list, K(this, j10, f10, 4.0f, i11, v3.f38275b.b(), l2Var, f11, r0Var, i12, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void W6(long j10, long j11, long j12, @x(from = 0.0d, to = 1.0d) float f10, @NotNull i iVar, @Nullable r0 r0Var, int i10) {
        k0 k0VarG = this.f37725a.g();
        int i11 = (int) (j11 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i11);
        int i12 = (int) (j11 & com.rabbitmq.client.k0.f265952a);
        k0VarG.x(fIntBitsToFloat, Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 & com.rabbitmq.client.k0.f265952a)), w(this, j10, iVar, f10, r0Var, i10, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    @NotNull
    public d Z3() {
        return this.f37726b;
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void a8(@NotNull i0 i0Var, long j10, long j11, float f10, int i10, @Nullable l2 l2Var, @x(from = 0.0d, to = 1.0d) float f11, @Nullable r0 r0Var, int i11) {
        this.f37725a.g().F(j10, j11, N(this, i0Var, f10, 4.0f, i10, v3.f38275b.b(), l2Var, f11, r0Var, i11, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void f3(long j10, float f10, long j11, @x(from = 0.0d, to = 1.0d) float f11, @NotNull i iVar, @Nullable r0 r0Var, int i10) {
        this.f37725a.g().N(j11, f10, w(this, j10, iVar, f11, r0Var, i10, 0, 32, null));
    }

    @Override // androidx.compose.ui.unit.d
    public float getDensity() {
        return this.f37725a.h().getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    @NotNull
    public w getLayoutDirection() {
        return this.f37725a.i();
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void i3(long j10, long j11, long j12, @x(from = 0.0d, to = 1.0d) float f10, @NotNull i iVar, @Nullable r0 r0Var, int i10) {
        k0 k0VarG = this.f37725a.g();
        int i11 = (int) (j11 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i11);
        int i12 = (int) (j11 & com.rabbitmq.client.k0.f265952a);
        k0VarG.y(fIntBitsToFloat, Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 & com.rabbitmq.client.k0.f265952a)), w(this, j10, iVar, f10, r0Var, i10, 0, 32, null));
    }

    @Override // androidx.compose.ui.unit.n
    public float m0() {
        return this.f37725a.h().m0();
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void m8(@NotNull i0 i0Var, float f10, long j10, @x(from = 0.0d, to = 1.0d) float f11, @NotNull i iVar, @Nullable r0 r0Var, int i10) {
        this.f37725a.g().N(j10, f10, I(this, i0Var, iVar, f11, r0Var, i10, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void n6(long j10, long j11, long j12, long j13, @NotNull i iVar, @x(from = 0.0d, to = 1.0d) float f10, @Nullable r0 r0Var, int i10) {
        k0 k0VarG = this.f37725a.g();
        int i11 = (int) (j11 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i11);
        int i12 = (int) (j11 & com.rabbitmq.client.k0.f265952a);
        k0VarG.P(fIntBitsToFloat, Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 & com.rabbitmq.client.k0.f265952a)), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & com.rabbitmq.client.k0.f265952a)), w(this, j10, iVar, f10, r0Var, i10, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void n8(@NotNull t1 t1Var, long j10, long j11, long j12, long j13, @x(from = 0.0d, to = 1.0d) float f10, @NotNull i iVar, @Nullable r0 r0Var, int i10, int i11) {
        this.f37725a.g().g(t1Var, j10, j11, j12, j13, x(null, iVar, f10, r0Var, i10, i11));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void o1(@NotNull List<n0.g> list, int i10, @NotNull i0 i0Var, float f10, int i11, @Nullable l2 l2Var, @x(from = 0.0d, to = 1.0d) float f11, @Nullable r0 r0Var, int i12) {
        this.f37725a.g().f(i10, list, N(this, i0Var, f10, 4.0f, i11, v3.f38275b.b(), l2Var, f11, r0Var, i12, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.f
    public void r3(long j10, float f10, float f11, boolean z10, long j11, long j12, @x(from = 0.0d, to = 1.0d) float f12, @NotNull i iVar, @Nullable r0 r0Var, int i10) {
        k0 k0VarG = this.f37725a.g();
        int i11 = (int) (j11 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i11);
        int i12 = (int) (j11 & com.rabbitmq.client.k0.f265952a);
        k0VarG.n(fIntBitsToFloat, Float.intBitsToFloat(i12), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 & com.rabbitmq.client.k0.f265952a)), f10, f11, z10, w(this, j10, iVar, f12, r0Var, i10, 0, 32, null));
    }
}
