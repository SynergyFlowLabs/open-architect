package androidx.compose.animation;

import androidx.compose.animation.core.l3;
import androidx.compose.runtime.n7;
import androidx.compose.ui.layout.i2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionModifierNode\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1274:1\n30#2:1275\n30#2:1281\n80#3:1276\n85#3:1278\n90#3:1280\n80#3:1282\n85#3:1284\n90#3:1286\n54#4:1277\n59#4:1279\n54#4:1283\n59#4:1285\n1#5:1287\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionModifierNode\n*L\n1161#1:1275\n1172#1:1281\n1161#1:1276\n1164#1:1278\n1164#1:1280\n1172#1:1282\n1189#1:1284\n1189#1:1286\n1164#1:1277\n1164#1:1279\n1189#1:1283\n1189#1:1285\n*E\n"})
final class c0 extends o0 {
    private boolean H1;

    @Nullable
    private l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> X;

    @NotNull
    private d0 Y;

    @NotNull
    private f0 Z;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.e f12713h3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private Function0<Boolean> f12716p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private m0 f12717p1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private l3<z> f12719t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private l3<z>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> f12720v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> f12721w;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private long f12718p2 = n.e();

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private long f12712g3 = androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @NotNull
    private final Function1<l3.b<z>, androidx.compose.animation.core.y0<androidx.compose.ui.unit.u>> f12714i3 = new i();

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @NotNull
    private final Function1<l3.b<z>, androidx.compose.animation.core.y0<androidx.compose.ui.unit.q>> f12715j3 = new j();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12722a;

        static {
            int[] iArr = new int[z.values().length];
            try {
                iArr[z.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12722a = iArr;
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i2 f12723a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i2 i2Var) {
            super(1);
            this.f12723a = i2Var;
        }

        public final void c(i2.a aVar) {
            i2.a.P(aVar, this.f12723a, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i2 f12724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f12725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f12726c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.graphics.r1, Unit> f12727d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(i2 i2Var, long j10, long j11, Function1<? super androidx.compose.ui.graphics.r1, Unit> function1) {
            super(1);
            this.f12724a = i2Var;
            this.f12725b = j10;
            this.f12726c = j11;
            this.f12727d = function1;
        }

        public final void c(i2.a aVar) {
            int i10 = 5 ^ 0;
            aVar.w0(this.f12724a, androidx.compose.ui.unit.q.n(this.f12726c) + androidx.compose.ui.unit.q.n(this.f12725b), androidx.compose.ui.unit.q.p(this.f12726c) + androidx.compose.ui.unit.q.p(this.f12725b), 0.0f, this.f12727d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function1<i2.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i2 f12728a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(i2 i2Var) {
            super(1);
            this.f12728a = i2Var;
        }

        public final void c(i2.a aVar) {
            i2.a.P(aVar, this.f12728a, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(i2.a aVar) {
            c(aVar);
            return Unit.f312394a;
        }
    }

    static final class e extends kotlin.jvm.internal.l0 implements Function1<z, androidx.compose.ui.unit.u> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f12730b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10) {
            super(1);
            this.f12730b = j10;
        }

        public final long c(z zVar) {
            return c0.this.R9(zVar, this.f12730b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.u invoke(z zVar) {
            return androidx.compose.ui.unit.u.b(c(zVar));
        }
    }

    static final class f extends kotlin.jvm.internal.l0 implements Function1<l3.b<z>, androidx.compose.animation.core.y0<androidx.compose.ui.unit.q>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f12731a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> invoke(l3.b<z> bVar) {
            return b0.f12627c;
        }
    }

    static final class g extends kotlin.jvm.internal.l0 implements Function1<z, androidx.compose.ui.unit.q> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f12733b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j10) {
            super(1);
            this.f12733b = j10;
        }

        public final long c(z zVar) {
            return c0.this.T9(zVar, this.f12733b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.q invoke(z zVar) {
            return androidx.compose.ui.unit.q.c(c(zVar));
        }
    }

    static final class h extends kotlin.jvm.internal.l0 implements Function1<z, androidx.compose.ui.unit.q> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f12735b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j10) {
            super(1);
            this.f12735b = j10;
        }

        public final long c(z zVar) {
            return c0.this.S9(zVar, this.f12735b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.q invoke(z zVar) {
            return androidx.compose.ui.unit.q.c(c(zVar));
        }
    }

    static final class i extends kotlin.jvm.internal.l0 implements Function1<l3.b<z>, androidx.compose.animation.core.y0<androidx.compose.ui.unit.u>> {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> invoke(l3.b<z> bVar) {
            z zVar = z.PreEnter;
            z zVar2 = z.Visible;
            androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> y0VarH = null;
            if (bVar.f(zVar, zVar2)) {
                u uVarI = c0.this.x9().b().i();
                if (uVarI != null) {
                    y0VarH = uVarI.h();
                }
            } else if (bVar.f(zVar2, z.PostExit)) {
                u uVarI2 = c0.this.y9().c().i();
                if (uVarI2 != null) {
                    y0VarH = uVarI2.h();
                }
            } else {
                y0VarH = b0.f12628d;
            }
            return y0VarH == null ? b0.f12628d : y0VarH;
        }
    }

    static final class j extends kotlin.jvm.internal.l0 implements Function1<l3.b<z>, androidx.compose.animation.core.y0<androidx.compose.ui.unit.q>> {
        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> invoke(l3.b<z> bVar) {
            androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0VarE;
            androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0VarE2;
            z zVar = z.PreEnter;
            z zVar2 = z.Visible;
            if (bVar.f(zVar, zVar2)) {
                k1 k1VarN = c0.this.x9().b().n();
                return (k1VarN == null || (y0VarE2 = k1VarN.e()) == null) ? b0.f12627c : y0VarE2;
            }
            if (!bVar.f(zVar2, z.PostExit)) {
                return b0.f12627c;
            }
            k1 k1VarN2 = c0.this.y9().c().n();
            return (k1VarN2 == null || (y0VarE = k1VarN2.e()) == null) ? b0.f12627c : y0VarE;
        }
    }

    public c0(@NotNull l3<z> l3Var, @Nullable l3<z>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> aVar, @Nullable l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> aVar2, @Nullable l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> aVar3, @NotNull d0 d0Var, @NotNull f0 f0Var, @NotNull Function0<Boolean> function0, @NotNull m0 m0Var) {
        this.f12719t = l3Var;
        this.f12720v = aVar;
        this.f12721w = aVar2;
        this.X = aVar3;
        this.Y = d0Var;
        this.Z = f0Var;
        this.f12716p0 = function0;
        this.f12717p1 = m0Var;
        int i10 = 6 >> 0;
    }

    private final void M9(long j10) {
        this.H1 = true;
        this.f12712g3 = j10;
    }

    @Nullable
    public final l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> A9() {
        return this.f12721w;
    }

    @Nullable
    public final l3<z>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> B9() {
        return this.f12720v;
    }

    @NotNull
    public final Function1<l3.b<z>, androidx.compose.animation.core.y0<androidx.compose.ui.unit.u>> C9() {
        return this.f12714i3;
    }

    @Nullable
    public final l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> D9() {
        return this.X;
    }

    @NotNull
    public final Function1<l3.b<z>, androidx.compose.animation.core.y0<androidx.compose.ui.unit.q>> E9() {
        return this.f12715j3;
    }

    @NotNull
    public final l3<z> F9() {
        return this.f12719t;
    }

    @NotNull
    public final Function0<Boolean> G9() {
        return this.f12716p0;
    }

    public final void H9(@Nullable androidx.compose.ui.e eVar) {
        this.f12713h3 = eVar;
    }

    public final void I9(@NotNull Function0<Boolean> function0) {
        this.f12716p0 = function0;
    }

    public final void J9(@NotNull d0 d0Var) {
        this.Y = d0Var;
    }

    public final void K9(@NotNull f0 f0Var) {
        this.Z = f0Var;
    }

    public final void L9(@NotNull m0 m0Var) {
        this.f12717p1 = m0Var;
    }

    public final void N9(@Nullable l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> aVar) {
        this.f12721w = aVar;
    }

    public final void O9(@Nullable l3<z>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> aVar) {
        this.f12720v = aVar;
    }

    public final void P9(@Nullable l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> aVar) {
        this.X = aVar;
    }

    public final void Q9(@NotNull l3<z> l3Var) {
        this.f12719t = l3Var;
    }

    public final long R9(@NotNull z zVar, long j10) {
        Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> function1J;
        Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> function1J2;
        int i10 = a.f12722a[zVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                int i11 = 2 << 3;
                if (i10 != 3) {
                    throw new kotlin.k0();
                }
                u uVarI = this.Z.c().i();
                if (uVarI != null && (function1J2 = uVarI.j()) != null) {
                    return function1J2.invoke(androidx.compose.ui.unit.u.b(j10)).q();
                }
            } else {
                u uVarI2 = this.Y.b().i();
                if (uVarI2 != null && (function1J = uVarI2.j()) != null) {
                    return function1J.invoke(androidx.compose.ui.unit.u.b(j10)).q();
                }
            }
        }
        return j10;
    }

    public final long S9(@NotNull z zVar, long j10) {
        Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> function1F;
        Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> function1F2;
        k1 k1VarN = this.Y.b().n();
        long jB = (k1VarN == null || (function1F2 = k1VarN.f()) == null) ? androidx.compose.ui.unit.q.f42709b.b() : function1F2.invoke(androidx.compose.ui.unit.u.b(j10)).x();
        k1 k1VarN2 = this.Z.c().n();
        long jB2 = (k1VarN2 == null || (function1F = k1VarN2.f()) == null) ? androidx.compose.ui.unit.q.f42709b.b() : function1F.invoke(androidx.compose.ui.unit.u.b(j10)).x();
        int i10 = a.f12722a[zVar.ordinal()];
        if (i10 == 1) {
            return androidx.compose.ui.unit.q.f42709b.b();
        }
        if (i10 == 2) {
            return jB;
        }
        if (i10 == 3) {
            return jB2;
        }
        throw new kotlin.k0();
    }

    public final long T9(@NotNull z zVar, long j10) {
        int i10;
        if (this.f12713h3 != null && v9() != null && !Intrinsics.areEqual(this.f12713h3, v9()) && (i10 = a.f12722a[zVar.ordinal()]) != 1 && i10 != 2) {
            if (i10 != 3) {
                throw new kotlin.k0();
            }
            u uVarI = this.Z.c().i();
            if (uVarI == null) {
                return androidx.compose.ui.unit.q.f42709b.b();
            }
            long jQ = uVarI.j().invoke(androidx.compose.ui.unit.u.b(j10)).q();
            androidx.compose.ui.e eVarV9 = v9();
            Intrinsics.checkNotNull(eVarV9);
            androidx.compose.ui.unit.w wVar = androidx.compose.ui.unit.w.Ltr;
            long jA = eVarV9.a(j10, jQ, wVar);
            androidx.compose.ui.e eVar = this.f12713h3;
            Intrinsics.checkNotNull(eVar);
            return androidx.compose.ui.unit.q.r(jA, eVar.a(j10, jQ, wVar));
        }
        return androidx.compose.ui.unit.q.f42709b.b();
    }

    @Override // androidx.compose.ui.node.g0
    @NotNull
    public androidx.compose.ui.layout.b1 c(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull androidx.compose.ui.layout.z0 z0Var, long j10) {
        n7<androidx.compose.ui.unit.q> n7VarA;
        n7<androidx.compose.ui.unit.q> n7VarA2;
        if (this.f12719t.p() == this.f12719t.y()) {
            this.f12713h3 = null;
        } else if (this.f12713h3 == null) {
            androidx.compose.ui.e eVarV9 = v9();
            if (eVarV9 == null) {
                eVarV9 = androidx.compose.ui.e.f37317a.C();
            }
            this.f12713h3 = eVarV9;
        }
        if (c1Var.P5()) {
            i2 i2VarP0 = z0Var.P0(j10);
            long jE = androidx.compose.ui.unit.u.e((((long) i2VarP0.h1()) << 32) | (((long) i2VarP0.c1()) & com.rabbitmq.client.k0.f265952a));
            this.f12718p2 = jE;
            M9(j10);
            return androidx.compose.ui.layout.c1.h6(c1Var, (int) (jE >> 32), (int) (jE & com.rabbitmq.client.k0.f265952a), null, new b(i2VarP0), 4, null);
        }
        if (!this.f12716p0.invoke().booleanValue()) {
            i2 i2VarP1 = z0Var.P0(j10);
            return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP1.h1(), i2VarP1.c1(), null, new d(i2VarP1), 4, null);
        }
        Function1<androidx.compose.ui.graphics.r1, Unit> function1R = this.f12717p1.r();
        i2 i2VarP2 = z0Var.P0(j10);
        long jE2 = androidx.compose.ui.unit.u.e((((long) i2VarP2.h1()) << 32) | (((long) i2VarP2.c1()) & com.rabbitmq.client.k0.f265952a));
        long j11 = n.f(this.f12718p2) ? this.f12718p2 : jE2;
        l3<z>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> aVar = this.f12720v;
        n7<androidx.compose.ui.unit.u> n7VarA3 = aVar != null ? aVar.a(this.f12714i3, new e(j11)) : null;
        if (n7VarA3 != null) {
            jE2 = n7VarA3.getValue().q();
        }
        long jF = androidx.compose.ui.unit.c.f(j10, jE2);
        l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> aVar2 = this.f12721w;
        long jB = (aVar2 == null || (n7VarA2 = aVar2.a(f.f12731a, new g(j11))) == null) ? androidx.compose.ui.unit.q.f42709b.b() : n7VarA2.getValue().x();
        l3<z>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> aVar3 = this.X;
        long jB2 = (aVar3 == null || (n7VarA = aVar3.a(this.f12715j3, new h(j11))) == null) ? androidx.compose.ui.unit.q.f42709b.b() : n7VarA.getValue().x();
        androidx.compose.ui.e eVar = this.f12713h3;
        return androidx.compose.ui.layout.c1.h6(c1Var, (int) (jF >> 32), (int) (jF & com.rabbitmq.client.k0.f265952a), null, new c(i2VarP2, androidx.compose.ui.unit.q.s(eVar != null ? eVar.a(j11, jF, androidx.compose.ui.unit.w.Ltr) : androidx.compose.ui.unit.q.f42709b.b(), jB2), jB, function1R), 4, null);
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        super.e9();
        this.H1 = false;
        this.f12718p2 = n.e();
    }

    @Nullable
    public final androidx.compose.ui.e v9() {
        androidx.compose.ui.e eVarG;
        androidx.compose.ui.e eVarG2;
        if (this.f12719t.w().f(z.PreEnter, z.Visible)) {
            u uVarI = this.Y.b().i();
            if (uVarI != null && (eVarG2 = uVarI.g()) != null) {
                return eVarG2;
            }
            u uVarI2 = this.Z.c().i();
            if (uVarI2 != null) {
                return uVarI2.g();
            }
            return null;
        }
        u uVarI3 = this.Z.c().i();
        if (uVarI3 != null && (eVarG = uVarI3.g()) != null) {
            return eVarG;
        }
        u uVarI4 = this.Y.b().i();
        if (uVarI4 != null) {
            return uVarI4.g();
        }
        return null;
    }

    @Nullable
    public final androidx.compose.ui.e w9() {
        return this.f12713h3;
    }

    @NotNull
    public final d0 x9() {
        return this.Y;
    }

    @NotNull
    public final f0 y9() {
        return this.Z;
    }

    @NotNull
    public final m0 z9() {
        return this.f12717p1;
    }
}
