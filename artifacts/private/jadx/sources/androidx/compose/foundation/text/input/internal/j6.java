package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.n7;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nTextFieldLayoutStateCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldLayoutStateCache.kt\nandroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,528:1\n252#1,4:541\n257#1:550\n85#2:529\n117#2,2:530\n85#2:532\n117#2,2:533\n72#3,5:535\n2474#4:540\n2354#4:545\n1893#4:546\n2355#4:548\n2354#4:551\n1893#4:552\n2355#4:554\n33#5:547\n33#5:553\n1#6:549\n1#6:555\n1#6:556\n*S KotlinDebug\n*F\n+ 1 TextFieldLayoutStateCache.kt\nandroidx/compose/foundation/text/input/internal/TextFieldLayoutStateCache\n*L\n229#1:541,4\n229#1:550\n71#1:529\n71#1:530,2\n73#1:532\n73#1:533,2\n147#1:535,5\n165#1:540\n229#1:545\n229#1:546\n229#1:548\n255#1:551\n255#1:552\n255#1:554\n229#1:547\n255#1:553\n229#1:549\n255#1:555\n*E\n"})
public final class j6 implements n7<androidx.compose.ui.text.p3>, androidx.compose.runtime.snapshots.c1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f19647e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.text.r3 f19650c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f19648a = androidx.compose.runtime.w6.k(null, c.f19672f.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f19649b = androidx.compose.runtime.w6.k(null, b.f19664g.a());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private a f19651d = new a();

    private static final class a extends androidx.compose.runtime.snapshots.e1 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private CharSequence f19652d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> f19653e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private androidx.compose.ui.text.w3 f19654f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private androidx.compose.ui.text.y3 f19655g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f19656h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f19657i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        private androidx.compose.ui.unit.w f19660l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @Nullable
        private androidx.compose.ui.text.font.y.b f19661m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @Nullable
        private androidx.compose.ui.text.p3 f19663o;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f19658j = Float.NaN;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f19659k = Float.NaN;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f19662n = androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null);

        public final void A(@Nullable androidx.compose.ui.text.font.y.b bVar) {
            this.f19661m = bVar;
        }

        public final void B(float f10) {
            this.f19659k = f10;
        }

        public final void C(@Nullable androidx.compose.ui.unit.w wVar) {
            this.f19660l = wVar;
        }

        public final void D(@Nullable androidx.compose.ui.text.p3 p3Var) {
            this.f19663o = p3Var;
        }

        public final void E(boolean z10) {
            this.f19656h = z10;
        }

        public final void F(boolean z10) {
            this.f19657i = z10;
        }

        public final void G(@Nullable androidx.compose.ui.text.y3 y3Var) {
            this.f19655g = y3Var;
        }

        public final void H(@Nullable CharSequence charSequence) {
            this.f19652d = charSequence;
        }

        @Override // androidx.compose.runtime.snapshots.e1
        public void b(@NotNull androidx.compose.runtime.snapshots.e1 e1Var) {
            Intrinsics.checkNotNull(e1Var, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
            a aVar = (a) e1Var;
            this.f19652d = aVar.f19652d;
            this.f19653e = aVar.f19653e;
            this.f19654f = aVar.f19654f;
            this.f19655g = aVar.f19655g;
            this.f19656h = aVar.f19656h;
            this.f19657i = aVar.f19657i;
            this.f19658j = aVar.f19658j;
            this.f19659k = aVar.f19659k;
            this.f19660l = aVar.f19660l;
            this.f19661m = aVar.f19661m;
            this.f19662n = aVar.f19662n;
            this.f19663o = aVar.f19663o;
        }

        @Override // androidx.compose.runtime.snapshots.e1
        @NotNull
        public androidx.compose.runtime.snapshots.e1 c() {
            return new a();
        }

        @Nullable
        public final List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> k() {
            return this.f19653e;
        }

        @Nullable
        public final androidx.compose.ui.text.w3 l() {
            return this.f19654f;
        }

        public final long m() {
            return this.f19662n;
        }

        public final float n() {
            return this.f19658j;
        }

        @Nullable
        public final androidx.compose.ui.text.font.y.b o() {
            return this.f19661m;
        }

        public final float p() {
            return this.f19659k;
        }

        @Nullable
        public final androidx.compose.ui.unit.w q() {
            return this.f19660l;
        }

        @Nullable
        public final androidx.compose.ui.text.p3 r() {
            return this.f19663o;
        }

        public final boolean s() {
            return this.f19656h;
        }

        public final boolean t() {
            return this.f19657i;
        }

        @NotNull
        public String toString() {
            return "CacheRecord(visualText=" + ((Object) this.f19652d) + ", annotations=" + this.f19653e + ", composition=" + this.f19654f + ", textStyle=" + this.f19655g + ", singleLine=" + this.f19656h + ", softWrap=" + this.f19657i + ", densityValue=" + this.f19658j + ", fontScale=" + this.f19659k + ", layoutDirection=" + this.f19660l + ", fontFamilyResolver=" + this.f19661m + ", constraints=" + ((Object) androidx.compose.ui.unit.b.w(this.f19662n)) + ", layoutResult=" + this.f19663o + ')';
        }

        @Nullable
        public final androidx.compose.ui.text.y3 u() {
            return this.f19655g;
        }

        @Nullable
        public final CharSequence v() {
            return this.f19652d;
        }

        public final void w(@Nullable List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> list) {
            this.f19653e = list;
        }

        public final void x(@Nullable androidx.compose.ui.text.w3 w3Var) {
            this.f19654f = w3Var;
        }

        public final void y(long j10) {
            this.f19662n = j10;
        }

        public final void z(float f10) {
            this.f19658j = f10;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final C0138b f19664g = new C0138b(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        private static final androidx.compose.runtime.u6<b> f19665h = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.unit.d f19666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.unit.w f19667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.text.font.y.b f19668c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f19669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f19670e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f19671f;

        public static final class a implements androidx.compose.runtime.u6<b> {
            a() {
            }

            @Override // androidx.compose.runtime.u6
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public boolean b(b bVar, b bVar2) {
                if (bVar == null || bVar2 == null) {
                    return !((bVar == null) ^ (bVar2 == null));
                }
                return bVar.d() == bVar2.d() && bVar.f() == bVar2.f() && bVar.g() == bVar2.g() && Intrinsics.areEqual(bVar.e(), bVar2.e()) && androidx.compose.ui.unit.b.g(bVar.b(), bVar2.b());
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.j6$b$b, reason: collision with other inner class name */
        public static final class C0138b {
            public /* synthetic */ C0138b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final androidx.compose.runtime.u6<b> a() {
                return b.f19665h;
            }

            private C0138b() {
            }
        }

        public /* synthetic */ b(androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.w wVar, androidx.compose.ui.text.font.y.b bVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, wVar, bVar, j10);
        }

        public final long b() {
            return this.f19669d;
        }

        @NotNull
        public final androidx.compose.ui.unit.d c() {
            return this.f19666a;
        }

        public final float d() {
            return this.f19670e;
        }

        @NotNull
        public final androidx.compose.ui.text.font.y.b e() {
            return this.f19668c;
        }

        public final float f() {
            return this.f19671f;
        }

        @NotNull
        public final androidx.compose.ui.unit.w g() {
            return this.f19667b;
        }

        @NotNull
        public String toString() {
            return "MeasureInputs(density=" + this.f19666a + ", densityValue=" + this.f19670e + ", fontScale=" + this.f19671f + ", layoutDirection=" + this.f19667b + ", fontFamilyResolver=" + this.f19668c + ", constraints=" + ((Object) androidx.compose.ui.unit.b.w(this.f19669d)) + ')';
        }

        private b(androidx.compose.ui.unit.d dVar, androidx.compose.ui.unit.w wVar, androidx.compose.ui.text.font.y.b bVar, long j10) {
            this.f19666a = dVar;
            this.f19667b = wVar;
            this.f19668c = bVar;
            this.f19669d = j10;
            this.f19670e = dVar.getDensity();
            this.f19671f = dVar.m0();
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final b f19672f = new b(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private static final androidx.compose.runtime.u6<c> f19673g = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final w6 f19674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.text.y3 f19675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f19676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f19677d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f19678e;

        public static final class a implements androidx.compose.runtime.u6<c> {
            a() {
            }

            @Override // androidx.compose.runtime.u6
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public boolean b(c cVar, c cVar2) {
                if (cVar == null || cVar2 == null) {
                    return !((cVar == null) ^ (cVar2 == null));
                }
                return cVar.d() == cVar2.d() && Intrinsics.areEqual(cVar.e(), cVar2.e()) && cVar.b() == cVar2.b() && cVar.c() == cVar2.c() && cVar.f() == cVar2.f();
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final androidx.compose.runtime.u6<c> a() {
                return c.f19673g;
            }

            private b() {
            }
        }

        public c(@NotNull w6 w6Var, @NotNull androidx.compose.ui.text.y3 y3Var, boolean z10, boolean z11, boolean z12) {
            this.f19674a = w6Var;
            this.f19675b = y3Var;
            this.f19676c = z10;
            this.f19677d = z11;
            this.f19678e = z12;
        }

        public final boolean b() {
            return this.f19676c;
        }

        public final boolean c() {
            return this.f19677d;
        }

        @NotNull
        public final w6 d() {
            return this.f19674a;
        }

        @NotNull
        public final androidx.compose.ui.text.y3 e() {
            return this.f19675b;
        }

        public final boolean f() {
            return this.f19678e;
        }

        @NotNull
        public String toString() {
            return "NonMeasureInputs(textFieldState=" + this.f19674a + ", textStyle=" + this.f19675b + ", singleLine=" + this.f19676c + ", softWrap=" + this.f19677d + ", isKeyboardTypePhone=" + this.f19678e + ')';
        }
    }

    private final androidx.compose.ui.text.r3 F(b bVar) {
        androidx.compose.ui.text.r3 r3Var = this.f19650c;
        if (r3Var == null) {
            r3Var = new androidx.compose.ui.text.r3(bVar.e(), bVar.c(), bVar.g(), 1);
            this.f19650c = r3Var;
        }
        return r3Var;
    }

    private final void G(b bVar) {
        this.f19649b.setValue(bVar);
    }

    private final void H(c cVar) {
        this.f19648a.setValue(cVar);
    }

    private final void I(Function1<? super a, Unit> function1) {
        androidx.compose.runtime.snapshots.m mVarF = androidx.compose.runtime.snapshots.m.f36535e.f();
        if (mVarF.n()) {
            return;
        }
        a aVar = this.f19651d;
        synchronized (androidx.compose.runtime.snapshots.b0.Q()) {
            try {
                function1.invoke(androidx.compose.runtime.snapshots.b0.A0(aVar, this, mVarF));
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.h0.c(1);
        androidx.compose.runtime.snapshots.b0.c0(mVarF, this);
    }

    private final androidx.compose.ui.text.p3 a(androidx.compose.foundation.text.input.l lVar, List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> list, c cVar, b bVar) {
        androidx.compose.ui.text.y3 y3VarE;
        y0.e eVarA;
        androidx.compose.ui.text.r3 r3VarF = F(bVar);
        if (cVar.f()) {
            y0.f fVarK = cVar.e().K();
            if (fVarK == null || (eVarA = fVarK.k(0)) == null) {
                eVarA = y0.e.f390671b.a();
            }
            y3VarE = cVar.e().e0(new androidx.compose.ui.text.y3(0L, 0L, (androidx.compose.ui.text.font.v0) null, (androidx.compose.ui.text.font.q0) null, (androidx.compose.ui.text.font.r0) null, (androidx.compose.ui.text.font.y) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.q) null, (y0.f) null, 0L, (androidx.compose.ui.text.style.k) null, (androidx.compose.ui.graphics.o3) null, (androidx.compose.ui.graphics.drawscope.i) null, 0, l6.a(eVarA.b()), 0L, (androidx.compose.ui.text.style.s) null, (androidx.compose.ui.text.a1) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.u) null, 16711679, (DefaultConstructorMarker) null));
        } else {
            y3VarE = cVar.e();
        }
        return androidx.compose.ui.text.r3.d(r3VarF, new androidx.compose.ui.text.f(lVar.toString(), list == null ? CollectionsKt.emptyList() : list), y3VarE, 0, cVar.c(), cVar.b() ? 1 : Integer.MAX_VALUE, null, bVar.b(), bVar.g(), bVar.c(), bVar.e(), false, 1060, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final b b() {
        return (b) this.f19649b.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final c d() {
        return (c) this.f19648a.getValue();
    }

    private final androidx.compose.ui.text.p3 g(c cVar, b bVar) {
        CharSequence charSequenceV;
        androidx.compose.foundation.text.input.l lVarU = cVar.d().u();
        List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> listB = k6.b(lVarU.c(), lVarU.g());
        a aVar = (a) androidx.compose.runtime.snapshots.b0.L(this.f19651d);
        androidx.compose.ui.text.p3 p3VarR = aVar.r();
        if (p3VarR != null && (charSequenceV = aVar.v()) != null && StringsKt.z1(charSequenceV, lVarU) && Intrinsics.areEqual(aVar.k(), listB) && Intrinsics.areEqual(aVar.l(), lVarU.d()) && aVar.s() == cVar.b() && aVar.t() == cVar.c() && aVar.q() == bVar.g() && aVar.n() == bVar.c().getDensity() && aVar.p() == bVar.c().m0() && androidx.compose.ui.unit.b.g(aVar.m(), bVar.b()) && Intrinsics.areEqual(aVar.o(), bVar.e()) && !p3VarR.x().m().a()) {
            androidx.compose.ui.text.y3 y3VarU = aVar.u();
            boolean zA0 = y3VarU != null ? y3VarU.a0(cVar.e()) : false;
            androidx.compose.ui.text.y3 y3VarU2 = aVar.u();
            boolean Z = y3VarU2 != null ? y3VarU2.Z(cVar.e()) : false;
            if (zA0 && Z) {
                return p3VarR;
            }
            if (zA0) {
                return androidx.compose.ui.text.p3.b(p3VarR, new androidx.compose.ui.text.o3(p3VarR.l().n(), cVar.e(), p3VarR.l().i(), p3VarR.l().g(), p3VarR.l().l(), p3VarR.l().h(), p3VarR.l().d(), p3VarR.l().f(), p3VarR.l().e(), p3VarR.l().c(), (DefaultConstructorMarker) null), 0L, 2, null);
            }
        }
        androidx.compose.ui.text.p3 p3VarA = a(lVarU, listB, cVar, bVar);
        if (!Intrinsics.areEqual(p3VarA, p3VarR)) {
            androidx.compose.runtime.snapshots.m mVarF = androidx.compose.runtime.snapshots.m.f36535e.f();
            if (!mVarF.n()) {
                a aVar2 = this.f19651d;
                synchronized (androidx.compose.runtime.snapshots.b0.Q()) {
                    a aVar3 = (a) androidx.compose.runtime.snapshots.b0.A0(aVar2, this, mVarF);
                    aVar3.H(lVarU);
                    aVar3.w(listB);
                    aVar3.x(lVarU.d());
                    aVar3.E(cVar.b());
                    aVar3.F(cVar.c());
                    aVar3.G(cVar.e());
                    aVar3.C(bVar.g());
                    aVar3.z(bVar.d());
                    aVar3.B(bVar.f());
                    aVar3.y(bVar.b());
                    aVar3.A(bVar.e());
                    aVar3.D(p3VarA);
                    Unit unit = Unit.f312394a;
                }
                androidx.compose.runtime.snapshots.b0.c0(mVarF, this);
                return p3VarA;
            }
        }
        return p3VarA;
    }

    @Override // androidx.compose.runtime.snapshots.c1
    @NotNull
    public androidx.compose.runtime.snapshots.e1 A() {
        return this.f19651d;
    }

    @NotNull
    public final androidx.compose.ui.text.p3 E(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.text.font.y.b bVar, long j10) {
        b bVar2 = new b(dVar, wVar, bVar, j10, null);
        G(bVar2);
        c cVarD = d();
        if (cVarD != null) {
            return g(cVarD, bVar2);
        }
        androidx.compose.foundation.internal.e.j("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
        throw new kotlin.a0();
    }

    public final void J(@NotNull w6 w6Var, @NotNull androidx.compose.ui.text.y3 y3Var, boolean z10, boolean z11, @NotNull androidx.compose.foundation.text.b4 b4Var) {
        H(new c(w6Var, y3Var, z10, z11, androidx.compose.ui.text.input.b0.n(b4Var.v(), androidx.compose.ui.text.input.b0.f41811b.m())));
    }

    @Override // androidx.compose.runtime.n7
    @Nullable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.text.p3 getValue() {
        b bVarB;
        c cVarD = d();
        if (cVarD == null || (bVarB = b()) == null) {
            return null;
        }
        return g(cVarD, bVarB);
    }

    @Override // androidx.compose.runtime.snapshots.c1
    public void p(@NotNull androidx.compose.runtime.snapshots.e1 e1Var) {
        Intrinsics.checkNotNull(e1Var, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
        this.f19651d = (a) e1Var;
    }

    @Override // androidx.compose.runtime.snapshots.c1
    @NotNull
    public androidx.compose.runtime.snapshots.e1 t(@NotNull androidx.compose.runtime.snapshots.e1 e1Var, @NotNull androidx.compose.runtime.snapshots.e1 e1Var2, @NotNull androidx.compose.runtime.snapshots.e1 e1Var3) {
        return e1Var3;
    }
}
