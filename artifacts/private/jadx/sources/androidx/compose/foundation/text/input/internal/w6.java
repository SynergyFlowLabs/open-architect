package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.n7;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@SourceDebugExtension({"SMAP\nTransformedTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,754:1\n85#2:755\n117#2,2:756\n270#3,15:758\n270#3,15:773\n270#3,15:788\n270#3,15:803\n270#3,15:818\n276#3,9:833\n276#3,9:842\n270#3,15:851\n270#3,15:866\n270#3,15:881\n1#4:896\n318#5,11:897\n*S KotlinDebug\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n*L\n178#1:755\n178#1:756,2\n202#1:758,15\n209#1:773,15\n216#1:788,15\n224#1:803,15\n228#1:818,15\n249#1:833,9\n268#1:842,9\n287#1:851,15\n294#1:866,15\n323#1:881,15\n460#1:897,11\n*E\n"})
public final class w6 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final a f20177h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f20178i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.input.p f20179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.text.input.c f20180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final t f20181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final androidx.compose.foundation.text.input.h f20182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final n7<b> f20183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final n7<b> f20184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f20185g;

    @SourceDebugExtension({"SMAP\nTransformedTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,754:1\n1#2:755\n*E\n"})
    private static final class a {

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.w6$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0144a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f20186a;

            static {
                int[] iArr = new int[y6.values().length];
                try {
                    iArr[y6.Start.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y6.End.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f20186a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @oj.n
        public final b e(androidx.compose.foundation.text.input.l lVar, androidx.compose.foundation.text.input.h hVar, n4 n4Var) {
            List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> list;
            g4 g4Var = new g4();
            androidx.compose.foundation.text.input.j jVar = new androidx.compose.foundation.text.input.j(lVar, null, null, g4Var, 6, null);
            jVar.I(true);
            hVar.a(jVar);
            jVar.I(false);
            List<androidx.compose.ui.text.f.e<androidx.compose.ui.text.f.a>> listV = jVar.v();
            if (jVar.m().a() == 0 && ((list = listV) == null || list.isEmpty())) {
                return null;
            }
            long jH = h(lVar.h(), g4Var, n4Var);
            androidx.compose.ui.text.w3 w3VarD = lVar.d();
            return new b(androidx.compose.foundation.text.input.j.R(jVar, jH, w3VarD != null ? androidx.compose.ui.text.w3.b(w6.f20177h.h(w3VarD.r(), g4Var, n4Var)) : null, null, listV, 4, null), g4Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @oj.n
        public final b f(androidx.compose.foundation.text.input.l lVar, t tVar, n4 n4Var) {
            g4 g4Var = new g4();
            CharSequence charSequenceB = u.b(lVar, tVar, g4Var);
            androidx.compose.ui.text.w3 w3VarB = null;
            if (charSequenceB == lVar) {
                return null;
            }
            long jH = h(lVar.h(), g4Var, n4Var);
            androidx.compose.ui.text.w3 w3VarD = lVar.d();
            if (w3VarD != null) {
                w3VarB = androidx.compose.ui.text.w3.b(w6.f20177h.h(w3VarD.r(), g4Var, n4Var));
            }
            return new b(new androidx.compose.foundation.text.input.l(charSequenceB, jH, w3VarB, null, null, null, 56, null), g4Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @oj.n
        public final long g(long j10, g4 g4Var) {
            long jB = g4Var.b(androidx.compose.ui.text.w3.n(j10));
            long jB2 = androidx.compose.ui.text.w3.h(j10) ? jB : g4Var.b(androidx.compose.ui.text.w3.i(j10));
            int iMin = Math.min(androidx.compose.ui.text.w3.l(jB), androidx.compose.ui.text.w3.l(jB2));
            int iMax = Math.max(androidx.compose.ui.text.w3.k(jB), androidx.compose.ui.text.w3.k(jB2));
            return androidx.compose.ui.text.w3.m(j10) ? androidx.compose.ui.text.x3.b(iMax, iMin) : androidx.compose.ui.text.x3.b(iMin, iMax);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @oj.n
        public final long h(long j10, g4 g4Var, n4 n4Var) {
            long jA;
            long jC = g4Var.c(androidx.compose.ui.text.w3.n(j10));
            long jC2 = androidx.compose.ui.text.w3.h(j10) ? jC : g4Var.c(androidx.compose.ui.text.w3.i(j10));
            y6 y6VarE = null;
            y6 y6VarF = n4Var != null ? n4Var.f() : null;
            if (androidx.compose.ui.text.w3.h(j10)) {
                y6VarE = y6VarF;
            } else if (n4Var != null) {
                y6VarE = n4Var.e();
            }
            if (y6VarF != null && !androidx.compose.ui.text.w3.h(jC)) {
                int i10 = C0144a.f20186a[y6VarF.ordinal()];
                if (i10 == 1) {
                    jC = androidx.compose.ui.text.x3.a(androidx.compose.ui.text.w3.n(jC));
                } else {
                    if (i10 != 2) {
                        throw new kotlin.k0();
                    }
                    jC = androidx.compose.ui.text.x3.a(androidx.compose.ui.text.w3.i(jC));
                }
            }
            if (y6VarE != null && !androidx.compose.ui.text.w3.h(jC2)) {
                int i11 = C0144a.f20186a[y6VarE.ordinal()];
                if (i11 == 1) {
                    jA = androidx.compose.ui.text.x3.a(androidx.compose.ui.text.w3.n(jC2));
                } else {
                    if (i11 != 2) {
                        throw new kotlin.k0();
                    }
                    jA = androidx.compose.ui.text.x3.a(androidx.compose.ui.text.w3.i(jC2));
                }
                jC2 = jA;
            }
            int iMin = Math.min(androidx.compose.ui.text.w3.l(jC), androidx.compose.ui.text.w3.l(jC2));
            int iMax = Math.max(androidx.compose.ui.text.w3.k(jC), androidx.compose.ui.text.w3.k(jC2));
            return androidx.compose.ui.text.w3.m(j10) ? androidx.compose.ui.text.x3.b(iMax, iMin) : androidx.compose.ui.text.x3.b(iMin, iMax);
        }

        static /* synthetic */ long i(a aVar, long j10, g4 g4Var, n4 n4Var, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                n4Var = null;
            }
            return aVar.h(j10, g4Var, n4Var);
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.compose.foundation.text.input.l f20187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final g4 f20188b;

        public b(@NotNull androidx.compose.foundation.text.input.l lVar, @NotNull g4 g4Var) {
            this.f20187a = lVar;
            this.f20188b = g4Var;
        }

        public static /* synthetic */ b d(b bVar, androidx.compose.foundation.text.input.l lVar, g4 g4Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                lVar = bVar.f20187a;
            }
            if ((i10 & 2) != 0) {
                g4Var = bVar.f20188b;
            }
            return bVar.c(lVar, g4Var);
        }

        @NotNull
        public final androidx.compose.foundation.text.input.l a() {
            return this.f20187a;
        }

        @NotNull
        public final g4 b() {
            return this.f20188b;
        }

        @NotNull
        public final b c(@NotNull androidx.compose.foundation.text.input.l lVar, @NotNull g4 g4Var) {
            return new b(lVar, g4Var);
        }

        @NotNull
        public final g4 e() {
            return this.f20188b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f20187a, bVar.f20187a) && Intrinsics.areEqual(this.f20188b, bVar.f20188b);
        }

        @NotNull
        public final androidx.compose.foundation.text.input.l f() {
            return this.f20187a;
        }

        public int hashCode() {
            return (this.f20187a.hashCode() * 31) + this.f20188b.hashCode();
        }

        @NotNull
        public String toString() {
            return "TransformedText(text=" + ((Object) this.f20187a) + ", offsetMapping=" + this.f20188b + ')';
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.input.internal.TransformedTextFieldState", f = "TransformedTextFieldState.kt", i = {0}, l = {755}, m = "collectImeNotifications", n = {"transformedNotifyImeListener"}, s = {"L$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f20189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f20190b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f20192d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20190b = obj;
            this.f20192d |= Integer.MIN_VALUE;
            return w6.this.m(null, this);
        }
    }

    static final class d implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.input.p.a f20194b;

        d(androidx.compose.foundation.text.input.p.a aVar) {
            this.f20194b = aVar;
        }

        public final void c(Throwable th2) {
            w6.this.f20179a.w(this.f20194b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            c(th2);
            return Unit.f312394a;
        }
    }

    public w6(@NotNull androidx.compose.foundation.text.input.p pVar, @Nullable androidx.compose.foundation.text.input.c cVar, @Nullable final t tVar, @Nullable final androidx.compose.foundation.text.input.h hVar) {
        this.f20179a = pVar;
        this.f20180b = cVar;
        this.f20181c = tVar;
        this.f20182d = hVar;
        this.f20183e = hVar != null ? androidx.compose.runtime.w6.e(new Function0() { // from class: androidx.compose.foundation.text.input.internal.u6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.C(this.f20085a, hVar);
            }
        }) : null;
        this.f20184f = tVar != null ? androidx.compose.runtime.w6.e(new Function0() { // from class: androidx.compose.foundation.text.input.internal.v6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.j(this.f20150a, tVar);
            }
        }) : null;
        this.f20185g = d7.g(new n4(y6.Start), null, 2, null);
    }

    @oj.n
    private static final long B(long j10, g4 g4Var, n4 n4Var) {
        return f20177h.h(j10, g4Var, n4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b C(w6 w6Var, androidx.compose.foundation.text.input.h hVar) {
        return f20177h.e(w6Var.f20179a.t(), hVar, w6Var.s());
    }

    public static /* synthetic */ void H(w6 w6Var, CharSequence charSequence, boolean z10, androidx.compose.foundation.text.input.internal.undo.c cVar, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            cVar = androidx.compose.foundation.text.input.internal.undo.c.MergeIfPossible;
        }
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        w6Var.G(charSequence, z10, cVar, z11);
    }

    public static /* synthetic */ void J(w6 w6Var, CharSequence charSequence, long j10, androidx.compose.foundation.text.input.internal.undo.c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            cVar = androidx.compose.foundation.text.input.internal.undo.c.MergeIfPossible;
        }
        androidx.compose.foundation.text.input.internal.undo.c cVar2 = cVar;
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        w6Var.I(charSequence, j10, cVar2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(androidx.compose.foundation.text.input.j jVar) {
        if (jVar.l().a() <= 0 || !androidx.compose.ui.text.w3.h(jVar.w())) {
            return;
        }
        N(new n4(y6.Start));
    }

    @oj.n
    private static final b h(androidx.compose.foundation.text.input.l lVar, androidx.compose.foundation.text.input.h hVar, n4 n4Var) {
        return f20177h.e(lVar, hVar, n4Var);
    }

    @oj.n
    private static final b i(androidx.compose.foundation.text.input.l lVar, t tVar, n4 n4Var) {
        return f20177h.f(lVar, tVar, n4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b j(w6 w6Var, t tVar) {
        androidx.compose.foundation.text.input.l lVarT;
        b value;
        a aVar = f20177h;
        n7<b> n7Var = w6Var.f20183e;
        if (n7Var == null || (value = n7Var.getValue()) == null || (lVarT = value.f()) == null) {
            lVarT = w6Var.f20179a.t();
        }
        return aVar.f(lVarT, tVar, w6Var.s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(androidx.compose.foundation.text.input.p.a aVar, w6 w6Var, androidx.compose.foundation.text.input.l lVar, androidx.compose.foundation.text.input.l lVar2, boolean z10) {
        androidx.compose.foundation.text.input.l lVarF;
        b bVarE = f20177h.e(lVar, w6Var.f20182d, w6Var.s());
        if (bVarE != null && (lVarF = bVarE.f()) != null) {
            lVar = lVarF;
        }
        aVar.a(lVar, w6Var.u(), z10);
    }

    public static /* synthetic */ void q(w6 w6Var, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        androidx.compose.foundation.text.input.p pVar = w6Var.f20179a;
        androidx.compose.foundation.text.input.c cVar = w6Var.f20180b;
        androidx.compose.foundation.text.input.internal.undo.c cVar2 = androidx.compose.foundation.text.input.internal.undo.c.MergeIfPossible;
        pVar.m().l().e();
        androidx.compose.foundation.text.input.j jVarM = pVar.m();
        function1.invoke(jVarM);
        w6Var.Q(jVarM);
        pVar.e(cVar, z10, cVar2);
    }

    @oj.n
    private static final long y(long j10, g4 g4Var) {
        return f20177h.g(j10, g4Var);
    }

    public final long A(long j10) {
        b value;
        b value2;
        n7<b> n7Var = this.f20183e;
        g4 g4VarE = null;
        g4 g4VarE2 = (n7Var == null || (value2 = n7Var.getValue()) == null) ? null : value2.e();
        n7<b> n7Var2 = this.f20184f;
        if (n7Var2 != null && (value = n7Var2.getValue()) != null) {
            g4VarE = value.e();
        }
        if (g4VarE2 != null) {
            j10 = a.i(f20177h, j10, g4VarE2, null, 4, null);
        }
        return g4VarE != null ? f20177h.h(j10, g4VarE, s()) : j10;
    }

    public final void D(int i10) {
        L(androidx.compose.ui.text.x3.a(i10));
    }

    public final void E() {
        this.f20179a.r().f();
    }

    public final void F(@NotNull CharSequence charSequence) {
        androidx.compose.foundation.text.input.p pVar = this.f20179a;
        androidx.compose.foundation.text.input.c cVar = this.f20180b;
        androidx.compose.foundation.text.input.internal.undo.c cVar2 = androidx.compose.foundation.text.input.internal.undo.c.MergeIfPossible;
        pVar.m().l().e();
        androidx.compose.foundation.text.input.j jVarM = pVar.m();
        androidx.compose.foundation.text.input.k.b(jVarM, 0, jVarM.r());
        jVarM.append(charSequence.toString());
        Q(jVarM);
        pVar.e(cVar, true, cVar2);
    }

    public final void G(@NotNull CharSequence charSequence, boolean z10, @NotNull androidx.compose.foundation.text.input.internal.undo.c cVar, boolean z11) {
        androidx.compose.foundation.text.input.p pVar = this.f20179a;
        androidx.compose.foundation.text.input.c cVar2 = this.f20180b;
        pVar.m().l().e();
        androidx.compose.foundation.text.input.j jVarM = pVar.m();
        if (z10) {
            jVarM.i();
        }
        long jW = jVarM.w();
        jVarM.C(androidx.compose.ui.text.w3.l(jW), androidx.compose.ui.text.w3.k(jW), charSequence);
        androidx.compose.foundation.text.input.k.j(jVarM, androidx.compose.ui.text.w3.l(jW) + charSequence.length(), 0, 2, null);
        Q(jVarM);
        pVar.e(cVar2, z11, cVar);
    }

    public final void I(@NotNull CharSequence charSequence, long j10, @NotNull androidx.compose.foundation.text.input.internal.undo.c cVar, boolean z10) {
        androidx.compose.foundation.text.input.p pVar = this.f20179a;
        androidx.compose.foundation.text.input.c cVar2 = this.f20180b;
        pVar.m().l().e();
        androidx.compose.foundation.text.input.j jVarM = pVar.m();
        long jX = x(j10);
        jVarM.C(androidx.compose.ui.text.w3.l(jX), androidx.compose.ui.text.w3.k(jX), charSequence);
        int i10 = 5 >> 2;
        androidx.compose.foundation.text.input.k.j(jVarM, androidx.compose.ui.text.w3.l(jX) + charSequence.length(), 0, 2, null);
        Q(jVarM);
        pVar.e(cVar2, z10, cVar);
    }

    public final void K() {
        androidx.compose.foundation.text.input.p pVar = this.f20179a;
        androidx.compose.foundation.text.input.c cVar = this.f20180b;
        androidx.compose.foundation.text.input.internal.undo.c cVar2 = androidx.compose.foundation.text.input.internal.undo.c.MergeIfPossible;
        pVar.m().l().e();
        androidx.compose.foundation.text.input.j jVarM = pVar.m();
        androidx.compose.foundation.text.input.k.i(jVarM, 0, jVarM.r());
        int i10 = 3 << 1;
        pVar.e(cVar, true, cVar2);
    }

    public final void L(long j10) {
        M(x(j10));
    }

    public final void M(long j10) {
        androidx.compose.foundation.text.input.p pVar = this.f20179a;
        androidx.compose.foundation.text.input.c cVar = this.f20180b;
        androidx.compose.foundation.text.input.internal.undo.c cVar2 = androidx.compose.foundation.text.input.internal.undo.c.MergeIfPossible;
        pVar.m().l().e();
        androidx.compose.foundation.text.input.k.i(pVar.m(), androidx.compose.ui.text.w3.n(j10), androidx.compose.ui.text.w3.i(j10));
        pVar.e(cVar, true, cVar2);
    }

    public final void N(@NotNull n4 n4Var) {
        this.f20185g.setValue(n4Var);
    }

    public final void O() {
        this.f20179a.r().g();
    }

    public final void P(@Nullable androidx.compose.foundation.text.input.c cVar) {
        this.f20180b = cVar;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        if (Intrinsics.areEqual(this.f20179a, w6Var.f20179a) && Intrinsics.areEqual(this.f20181c, w6Var.f20181c)) {
            return Intrinsics.areEqual(this.f20182d, w6Var.f20182d);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f20179a.hashCode() * 31;
        t tVar = this.f20181c;
        int iHashCode2 = (iHashCode + (tVar != null ? tVar.hashCode() : 0)) * 31;
        androidx.compose.foundation.text.input.h hVar = this.f20182d;
        return iHashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final void k() {
        androidx.compose.foundation.text.input.p pVar = this.f20179a;
        androidx.compose.foundation.text.input.c cVar = this.f20180b;
        androidx.compose.foundation.text.input.internal.undo.c cVar2 = androidx.compose.foundation.text.input.internal.undo.c.MergeIfPossible;
        pVar.m().l().e();
        androidx.compose.foundation.text.input.j jVarM = pVar.m();
        androidx.compose.foundation.text.input.k.j(jVarM, androidx.compose.ui.text.w3.i(jVarM.w()), 0, 2, null);
        pVar.e(cVar, true, cVar2);
    }

    public final void l() {
        androidx.compose.foundation.text.input.p pVar = this.f20179a;
        androidx.compose.foundation.text.input.c cVar = this.f20180b;
        androidx.compose.foundation.text.input.internal.undo.c cVar2 = androidx.compose.foundation.text.input.internal.undo.c.MergeIfPossible;
        pVar.m().l().e();
        androidx.compose.foundation.text.input.j jVarM = pVar.m();
        androidx.compose.foundation.text.input.k.j(jVarM, androidx.compose.ui.text.w3.k(jVarM.w()), 0, 2, null);
        pVar.e(cVar, true, cVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object m(@NotNull final androidx.compose.foundation.text.input.p.a aVar, @NotNull kotlin.coroutines.d<?> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f20192d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f20192d = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f20190b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f20192d;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (this.f20182d != null) {
                aVar = new androidx.compose.foundation.text.input.p.a() { // from class: androidx.compose.foundation.text.input.internal.t6
                    @Override // androidx.compose.foundation.text.input.p.a
                    public final void a(androidx.compose.foundation.text.input.l lVar, androidx.compose.foundation.text.input.l lVar2, boolean z10) {
                        w6.n(aVar, this, lVar, lVar2, z10);
                    }
                };
            }
            cVar.f20189a = aVar;
            cVar.f20192d = 1;
            kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(cVar), 1);
            pVar.p0();
            this.f20179a.c(aVar);
            pVar.e0(new d(aVar));
            Object objU = pVar.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(cVar);
            }
            if (objU == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        throw new kotlin.a0();
    }

    public final void o() {
        androidx.compose.foundation.text.input.p pVar = this.f20179a;
        androidx.compose.foundation.text.input.c cVar = this.f20180b;
        androidx.compose.foundation.text.input.internal.undo.c cVar2 = androidx.compose.foundation.text.input.internal.undo.c.NeverMerge;
        pVar.m().l().e();
        androidx.compose.foundation.text.input.j jVarM = pVar.m();
        androidx.compose.foundation.text.input.k.b(jVarM, androidx.compose.ui.text.w3.l(jVarM.w()), androidx.compose.ui.text.w3.k(jVarM.w()));
        androidx.compose.foundation.text.input.k.j(jVarM, androidx.compose.ui.text.w3.l(jVarM.w()), 0, 2, null);
        Q(jVarM);
        pVar.e(cVar, true, cVar2);
    }

    public final void p(boolean z10, @NotNull Function1<? super androidx.compose.foundation.text.input.j, Unit> function1) {
        androidx.compose.foundation.text.input.p pVar = this.f20179a;
        androidx.compose.foundation.text.input.c cVar = this.f20180b;
        androidx.compose.foundation.text.input.internal.undo.c cVar2 = androidx.compose.foundation.text.input.internal.undo.c.MergeIfPossible;
        pVar.m().l().e();
        androidx.compose.foundation.text.input.j jVarM = pVar.m();
        function1.invoke(jVarM);
        Q(jVarM);
        pVar.e(cVar, z10, cVar2);
    }

    @NotNull
    public final androidx.compose.foundation.text.input.l r() {
        b value;
        androidx.compose.foundation.text.input.l lVarF;
        n7<b> n7Var = this.f20183e;
        return (n7Var == null || (value = n7Var.getValue()) == null || (lVarF = value.f()) == null) ? t() : lVarF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final n4 s() {
        return (n4) this.f20185g.getValue();
    }

    @NotNull
    public final androidx.compose.foundation.text.input.l t() {
        return this.f20179a.t();
    }

    @NotNull
    public String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.f20179a + ", outputTransformation=" + this.f20182d + ", outputTransformedText=" + this.f20183e + ", codepointTransformation=" + this.f20181c + ", codepointTransformedText=" + this.f20184f + ", outputText=\"" + ((Object) r()) + "\", visualText=\"" + ((Object) u()) + "\")";
    }

    @NotNull
    public final androidx.compose.foundation.text.input.l u() {
        b value;
        androidx.compose.foundation.text.input.l lVarF;
        n7<b> n7Var = this.f20184f;
        return (n7Var == null || (value = n7Var.getValue()) == null || (lVarF = value.f()) == null) ? r() : lVarF;
    }

    public final void v(int i10, long j10) {
        long jX = x(j10);
        androidx.compose.foundation.text.input.p pVar = this.f20179a;
        androidx.compose.foundation.text.input.c cVar = this.f20180b;
        androidx.compose.foundation.text.input.internal.undo.c cVar2 = androidx.compose.foundation.text.input.internal.undo.c.MergeIfPossible;
        pVar.m().l().e();
        pVar.m().M(i10, androidx.compose.ui.text.w3.n(jX), androidx.compose.ui.text.w3.i(jX));
        pVar.e(cVar, true, cVar2);
    }

    public final long w(int i10) {
        b value;
        b value2;
        n7<b> n7Var = this.f20183e;
        g4 g4VarE = null;
        g4 g4VarE2 = (n7Var == null || (value2 = n7Var.getValue()) == null) ? null : value2.e();
        n7<b> n7Var2 = this.f20184f;
        if (n7Var2 != null && (value = n7Var2.getValue()) != null) {
            g4VarE = value.e();
        }
        long jB = g4VarE != null ? g4VarE.b(i10) : androidx.compose.ui.text.x3.a(i10);
        if (g4VarE2 != null) {
            jB = f20177h.g(jB, g4VarE2);
        }
        return jB;
    }

    public final long x(long j10) {
        b value;
        b value2;
        n7<b> n7Var = this.f20183e;
        g4 g4VarE = null;
        g4 g4VarE2 = (n7Var == null || (value2 = n7Var.getValue()) == null) ? null : value2.e();
        n7<b> n7Var2 = this.f20184f;
        if (n7Var2 != null && (value = n7Var2.getValue()) != null) {
            g4VarE = value.e();
        }
        if (g4VarE != null) {
            j10 = f20177h.g(j10, g4VarE);
        }
        return g4VarE2 != null ? f20177h.g(j10, g4VarE2) : j10;
    }

    public final long z(int i10) {
        b value;
        b value2;
        n7<b> n7Var = this.f20183e;
        g4 g4VarE = null;
        g4 g4VarE2 = (n7Var == null || (value2 = n7Var.getValue()) == null) ? null : value2.e();
        n7<b> n7Var2 = this.f20184f;
        if (n7Var2 != null && (value = n7Var2.getValue()) != null) {
            g4VarE = value.e();
        }
        long jC = g4VarE2 != null ? g4VarE2.c(i10) : androidx.compose.ui.text.x3.a(i10);
        return g4VarE != null ? f20177h.h(jC, g4VarE, s()) : jC;
    }

    public /* synthetic */ w6(androidx.compose.foundation.text.input.p pVar, androidx.compose.foundation.text.input.c cVar, t tVar, androidx.compose.foundation.text.input.h hVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, (i10 & 2) != 0 ? null : cVar, (i10 & 4) != 0 ? null : tVar, (i10 & 8) != 0 ? null : hVar);
    }
}
