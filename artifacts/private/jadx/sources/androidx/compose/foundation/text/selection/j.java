package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.a5;
import androidx.compose.foundation.text.b5;
import androidx.compose.foundation.text.selection.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,413:1\n73#1,9:414\n73#1,9:423\n73#1,9:432\n73#1,9:441\n73#1,9:450\n73#1,9:459\n73#1,9:468\n73#1,9:477\n73#1,9:486\n73#1,9:495\n73#1,9:504\n73#1,9:513\n73#1,7:522\n81#1:530\n73#1,9:531\n73#1,9:540\n73#1,9:549\n75#1,7:558\n75#1,7:565\n73#1,9:572\n73#1,9:581\n73#1,9:590\n73#1,9:599\n75#1,7:608\n1#2:529\n30#3:615\n53#4,3:616\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n*L\n92#1:414,9\n94#1:423,9\n96#1:432,9\n104#1:441,9\n113#1:450,9\n126#1:459,9\n158#1:468,9\n163#1:477,9\n168#1:486,9\n170#1:495,9\n172#1:504,9\n180#1:513,9\n190#1:522,7\n190#1:530\n194#1:531,9\n196#1:540,9\n204#1:549,9\n213#1:558,7\n216#1:565,7\n220#1:572,9\n224#1:581,9\n226#1:590,9\n234#1:599,9\n244#1:608,7\n322#1:615\n322#1:616,3\n*E\n"})
public abstract class j<T extends j<T>> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f21176h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f21177i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f21178j = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.f f21179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f21180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.text.p3 f21181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.input.m0 f21182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final v4 f21183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f21184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.text.f f21185g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ j(androidx.compose.ui.text.f fVar, long j10, androidx.compose.ui.text.p3 p3Var, androidx.compose.ui.text.input.m0 m0Var, v4 v4Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, j10, p3Var, m0Var, v4Var);
    }

    private final boolean D() {
        androidx.compose.ui.text.p3 p3Var = this.f21181c;
        return (p3Var != null ? p3Var.z(d0()) : null) != androidx.compose.ui.text.style.i.Rtl;
    }

    private final int E(androidx.compose.ui.text.p3 p3Var, int i10) {
        int iD0 = d0();
        if (this.f21183e.a() == null) {
            this.f21183e.c(Float.valueOf(p3Var.e(iD0).t()));
        }
        int iR = p3Var.r(iD0) + i10;
        if (iR < 0) {
            return 0;
        }
        if (iR >= p3Var.o()) {
            return C().length();
        }
        float fN = p3Var.n(iR) - 1;
        Float fA = this.f21183e.a();
        Intrinsics.checkNotNull(fA);
        float fFloatValue = fA.floatValue();
        if ((D() && fFloatValue >= p3Var.u(iR)) || (!D() && fFloatValue <= p3Var.t(iR))) {
            return p3Var.p(iR, true);
        }
        return this.f21182d.a(p3Var.y(n0.g.g((((long) Float.floatToRawIntBits(fA.floatValue())) << 32) | (((long) Float.floatToRawIntBits(fN)) & com.rabbitmq.client.k0.f265952a))));
    }

    private final T I() {
        B().b();
        if (C().length() > 0) {
            int iO = o();
            int i10 = 1 ^ (-1);
            if (iO != -1) {
                a0(iO);
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T K() {
        Integer numP;
        B().b();
        if (C().length() > 0 && (numP = p()) != null) {
            a0(numP.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T L() {
        int iV;
        B().b();
        if (C().length() > 0 && (iV = v()) != -1) {
            a0(iV);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final T N() {
        Integer numZ;
        B().b();
        if (C().length() > 0 && (numZ = z()) != null) {
            a0(numZ.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public static /* synthetic */ j b(j jVar, Object obj, boolean z10, Function1 function1, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if (z10) {
            jVar.B().b();
        }
        if (jVar.C().length() > 0) {
            function1.invoke(obj);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (j) obj;
    }

    private final int c(int i10) {
        return kotlin.ranges.r.B(i10, C().length() - 1);
    }

    private final int d0() {
        return this.f21182d.b(androidx.compose.ui.text.w3.i(this.f21184f));
    }

    private final int e0() {
        return this.f21182d.b(androidx.compose.ui.text.w3.k(this.f21184f));
    }

    private final int f0() {
        return this.f21182d.b(androidx.compose.ui.text.w3.l(this.f21184f));
    }

    private final int j(androidx.compose.ui.text.p3 p3Var, int i10) {
        return this.f21182d.a(p3Var.p(p3Var.r(i10), true));
    }

    static /* synthetic */ int k(j jVar, androidx.compose.ui.text.p3 p3Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i11 & 1) != 0) {
            i10 = jVar.e0();
        }
        return jVar.j(p3Var, i10);
    }

    private final int m(androidx.compose.ui.text.p3 p3Var, int i10) {
        return this.f21182d.a(p3Var.v(p3Var.r(i10)));
    }

    static /* synthetic */ int n(j jVar, androidx.compose.ui.text.p3 p3Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i11 & 1) != 0) {
            i10 = jVar.f0();
        }
        return jVar.m(p3Var, i10);
    }

    private final int q(androidx.compose.ui.text.p3 p3Var, int i10) {
        while (i10 < this.f21179a.length()) {
            long jD = p3Var.D(c(i10));
            if (androidx.compose.ui.text.w3.i(jD) > i10) {
                return this.f21182d.a(androidx.compose.ui.text.w3.i(jD));
            }
            i10++;
        }
        return this.f21179a.length();
    }

    static /* synthetic */ int r(j jVar, androidx.compose.ui.text.p3 p3Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i11 & 1) != 0) {
            i10 = jVar.d0();
        }
        return jVar.q(p3Var, i10);
    }

    private final int x(androidx.compose.ui.text.p3 p3Var, int i10) {
        while (i10 > 0) {
            long jD = p3Var.D(c(i10));
            if (androidx.compose.ui.text.w3.n(jD) < i10) {
                return this.f21182d.a(androidx.compose.ui.text.w3.n(jD));
            }
            i10--;
        }
        return 0;
    }

    static /* synthetic */ int y(j jVar, androidx.compose.ui.text.p3 p3Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i11 & 1) != 0) {
            i10 = jVar.d0();
        }
        return jVar.x(p3Var, i10);
    }

    public final long A() {
        return this.f21184f;
    }

    @NotNull
    public final v4 B() {
        return this.f21183e;
    }

    @NotNull
    public final String C() {
        return this.f21185g.m();
    }

    @NotNull
    public final T F() {
        androidx.compose.ui.text.p3 p3Var;
        if (C().length() > 0 && (p3Var = this.f21181c) != null) {
            a0(E(p3Var, 1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T G() {
        B().b();
        if (C().length() > 0) {
            if (D()) {
                L();
            } else {
                I();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T H() {
        B().b();
        if (C().length() > 0) {
            if (D()) {
                N();
            } else {
                K();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T J() {
        B().b();
        if (C().length() > 0) {
            int iA = a5.a(C(), androidx.compose.ui.text.w3.k(this.f21184f));
            if (iA == androidx.compose.ui.text.w3.k(this.f21184f) && iA != C().length()) {
                iA = a5.a(C(), iA + 1);
            }
            a0(iA);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T M() {
        B().b();
        if (C().length() > 0) {
            int iB = a5.b(C(), androidx.compose.ui.text.w3.l(this.f21184f));
            if (iB == androidx.compose.ui.text.w3.l(this.f21184f) && iB != 0) {
                iB = a5.b(C(), iB - 1);
            }
            a0(iB);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T O() {
        B().b();
        if (C().length() > 0) {
            if (D()) {
                I();
            } else {
                L();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T P() {
        B().b();
        if (C().length() > 0) {
            if (D()) {
                K();
            } else {
                N();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T Q() {
        B().b();
        if (C().length() > 0) {
            a0(C().length());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T R() {
        B().b();
        if (C().length() > 0) {
            a0(0);
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T S() {
        Integer numI;
        B().b();
        if (C().length() > 0 && (numI = i()) != null) {
            a0(numI.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T T() {
        B().b();
        if (C().length() > 0) {
            if (D()) {
                V();
            } else {
                S();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T U() {
        B().b();
        if (C().length() > 0) {
            if (D()) {
                S();
            } else {
                V();
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T V() {
        Integer numL;
        B().b();
        if (C().length() > 0 && (numL = l()) != null) {
            a0(numL.intValue());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T W() {
        androidx.compose.ui.text.p3 p3Var;
        if (C().length() > 0 && (p3Var = this.f21181c) != null) {
            a0(E(p3Var, -1));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T X() {
        B().b();
        if (C().length() > 0) {
            b0(0, C().length());
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T Y() {
        if (C().length() > 0) {
            this.f21184f = androidx.compose.ui.text.x3.b(androidx.compose.ui.text.w3.n(this.f21180b), androidx.compose.ui.text.w3.i(this.f21184f));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final void Z(@NotNull androidx.compose.ui.text.f fVar) {
        this.f21185g = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    protected final <U> T a(U u10, boolean z10, @NotNull Function1<? super U, Unit> function1) {
        if (z10) {
            B().b();
        }
        if (C().length() > 0) {
            function1.invoke(u10);
        }
        Intrinsics.checkNotNull(u10, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return (T) u10;
    }

    protected final void a0(int i10) {
        b0(i10, i10);
    }

    protected final void b0(int i10, int i11) {
        this.f21184f = androidx.compose.ui.text.x3.b(i10, i11);
    }

    public final void c0(long j10) {
        this.f21184f = j10;
    }

    @NotNull
    public final T d(@NotNull Function1<? super T, Unit> function1) {
        B().b();
        if (C().length() > 0) {
            if (androidx.compose.ui.text.w3.h(this.f21184f)) {
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
                function1.invoke(this);
            } else if (D()) {
                a0(androidx.compose.ui.text.w3.l(this.f21184f));
            } else {
                a0(androidx.compose.ui.text.w3.k(this.f21184f));
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T e(@NotNull Function1<? super T, Unit> function1) {
        B().b();
        if (C().length() > 0) {
            if (androidx.compose.ui.text.w3.h(this.f21184f)) {
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
                function1.invoke(this);
            } else if (D()) {
                a0(androidx.compose.ui.text.w3.k(this.f21184f));
            } else {
                a0(androidx.compose.ui.text.w3.l(this.f21184f));
            }
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final T f() {
        B().b();
        if (C().length() > 0) {
            a0(androidx.compose.ui.text.w3.i(this.f21184f));
        }
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @NotNull
    public final androidx.compose.ui.text.f g() {
        return this.f21185g;
    }

    @Nullable
    public final androidx.compose.ui.text.p3 h() {
        return this.f21181c;
    }

    @Nullable
    public final Integer i() {
        androidx.compose.ui.text.p3 p3Var = this.f21181c;
        if (p3Var != null) {
            return Integer.valueOf(k(this, p3Var, 0, 1, null));
        }
        return null;
    }

    @Nullable
    public final Integer l() {
        androidx.compose.ui.text.p3 p3Var = this.f21181c;
        if (p3Var != null) {
            return Integer.valueOf(n(this, p3Var, 0, 1, null));
        }
        return null;
    }

    public final int o() {
        return b5.c(this.f21185g.m(), androidx.compose.ui.text.w3.i(this.f21184f));
    }

    @Nullable
    public final Integer p() {
        androidx.compose.ui.text.p3 p3Var = this.f21181c;
        if (p3Var != null) {
            return Integer.valueOf(r(this, p3Var, 0, 1, null));
        }
        return null;
    }

    @NotNull
    public final androidx.compose.ui.text.input.m0 s() {
        return this.f21182d;
    }

    public final long t() {
        return this.f21180b;
    }

    @NotNull
    public final androidx.compose.ui.text.f u() {
        return this.f21179a;
    }

    public final int v() {
        return b5.d(this.f21185g.m(), androidx.compose.ui.text.w3.i(this.f21184f));
    }

    public final int w() {
        return b5.b(this.f21185g.m(), androidx.compose.ui.text.w3.i(this.f21184f), -1);
    }

    @Nullable
    public final Integer z() {
        androidx.compose.ui.text.p3 p3Var = this.f21181c;
        if (p3Var != null) {
            return Integer.valueOf(y(this, p3Var, 0, 1, null));
        }
        return null;
    }

    private j(androidx.compose.ui.text.f fVar, long j10, androidx.compose.ui.text.p3 p3Var, androidx.compose.ui.text.input.m0 m0Var, v4 v4Var) {
        this.f21179a = fVar;
        this.f21180b = j10;
        this.f21181c = p3Var;
        this.f21182d = m0Var;
        this.f21183e = v4Var;
        this.f21184f = j10;
        this.f21185g = fVar;
    }
}
