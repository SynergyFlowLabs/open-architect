package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.a5;
import androidx.compose.foundation.text.b5;
import androidx.compose.foundation.text.input.internal.n4;
import androidx.compose.foundation.text.input.internal.w6;
import androidx.compose.foundation.text.input.internal.y6;
import androidx.compose.ui.text.p3;
import androidx.compose.ui.text.w3;
import androidx.compose.ui.text.x3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/SelectionMovementDeletionContext\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,587:1\n127#1,11:595\n127#1,11:606\n127#1,11:617\n127#1,11:628\n131#1,7:639\n197#1,5:646\n131#1,5:651\n202#1,15:656\n137#1:671\n197#1,5:672\n131#1,5:677\n202#1,15:682\n137#1:697\n197#1,5:698\n131#1,5:703\n202#1,15:708\n137#1:723\n197#1,5:724\n131#1,5:729\n202#1,15:734\n137#1:749\n197#1,5:750\n131#1,5:755\n202#1,15:760\n137#1:775\n197#1,5:776\n131#1,5:781\n202#1,15:786\n137#1:801\n197#1,5:802\n131#1,5:807\n202#1,15:812\n137#1:827\n197#1,5:828\n131#1,5:833\n202#1,15:838\n137#1:853\n197#1,5:854\n131#1,5:859\n202#1,15:864\n137#1:879\n201#1:880\n131#1,5:881\n202#1,15:886\n137#1:901\n201#1:902\n131#1,5:903\n202#1,15:908\n137#1:923\n197#1,5:924\n131#1,5:929\n202#1,15:934\n137#1:949\n197#1,5:950\n131#1,5:955\n202#1,15:960\n137#1:975\n201#1:976\n131#1,5:977\n202#1,15:982\n137#1:997\n201#1:998\n131#1,5:999\n202#1,15:1004\n137#1:1019\n131#1,7:1020\n131#1,7:1027\n604#2,7:588\n30#3:1034\n53#4,3:1035\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/SelectionMovementDeletionContext\n*L\n140#1:595,11\n142#1:606,11\n159#1:617,11\n172#1:628,11\n201#1:639,7\n218#1:646,5\n218#1:651,5\n218#1:656,15\n218#1:671\n222#1:672,5\n222#1:677,5\n222#1:682,15\n222#1:697\n224#1:698,5\n224#1:703,5\n224#1:708,15\n224#1:723\n226#1:724,5\n226#1:729,5\n226#1:734,15\n226#1:749\n228#1:750,5\n228#1:755,5\n228#1:760,15\n228#1:775\n244#1:776,5\n244#1:781,5\n244#1:786,15\n244#1:801\n248#1:802,5\n248#1:807,5\n248#1:812,15\n248#1:827\n252#1:828,5\n252#1:833,5\n252#1:838,15\n252#1:853\n260#1:854,5\n260#1:859,5\n260#1:864,15\n260#1:879\n271#1:880\n271#1:881,5\n271#1:886,15\n271#1:901\n277#1:902\n277#1:903,5\n277#1:908,15\n277#1:923\n296#1:924,5\n296#1:929,5\n296#1:934,15\n296#1:949\n300#1:950,5\n300#1:955,5\n300#1:960,15\n300#1:975\n305#1:976\n305#1:977,5\n305#1:982,15\n305#1:997\n308#1:998\n308#1:999,5\n308#1:1004,15\n308#1:1019\n312#1:1020,7\n317#1:1027,7\n107#1:588,7\n422#1:1034\n422#1:1035,3\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final a f19949k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f19950l = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f19951m = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w6 f19952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final p3 f19953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f19954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f19955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final n f19956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.text.input.l f19957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final n4 f19958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f19959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private y6 f19960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final String f19961j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public e(@NotNull w6 w6Var, @Nullable p3 p3Var, boolean z10, float f10, @NotNull n nVar) {
        this.f19952a = w6Var;
        this.f19953b = p3Var;
        this.f19954c = z10;
        this.f19955d = f10;
        this.f19956e = nVar;
        androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
        androidx.compose.runtime.snapshots.m mVarG = aVar.g();
        Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
        androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
        try {
            androidx.compose.foundation.text.input.l lVarU = w6Var.u();
            this.f19957f = lVarU;
            this.f19958g = w6Var.s();
            Unit unit = Unit.f312394a;
            aVar.x(mVarG, mVarM, function1L);
            this.f19959h = lVarU.h();
            this.f19961j = lVarU.i().toString();
        } catch (Throwable th2) {
            aVar.x(mVarG, mVarM, function1L);
            throw th2;
        }
    }

    private final int A(int i10) {
        int i11 = w3.i(this.f19957f.h());
        if (this.f19953b == null || Float.isNaN(this.f19955d)) {
            return i11;
        }
        n0.j jVarS = this.f19953b.e(i11).S(0.0f, this.f19955d * i10);
        float fN = this.f19953b.n(this.f19953b.s(jVarS.B()));
        return Math.abs(jVarS.B() - fN) > Math.abs(jVarS.j() - fN) ? this.f19953b.y(jVarS.E()) : this.f19953b.y(jVarS.m());
    }

    private final e O(boolean z10, Function0<Integer> function0) {
        if (z10) {
            this.f19956e.b();
        }
        if (this.f19961j.length() > 0) {
            int i10 = w3.i(w());
            long jA = y0.a(function0.invoke().intValue(), i10, this.f19952a);
            int iB = c.b(jA);
            y6 y6VarC = c.c(jA);
            if (iB != i10 || !w3.h(w())) {
                a0(x3.a(iB));
            }
            if (y6VarC != null) {
                b0(y6VarC);
            }
        }
        return this;
    }

    static /* synthetic */ e P(e eVar, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if (z10) {
            eVar.f19956e.b();
        }
        if (eVar.f19961j.length() > 0) {
            int i11 = w3.i(eVar.w());
            long jA = y0.a(((Number) function0.invoke()).intValue(), i11, eVar.f19952a);
            int iB = c.b(jA);
            y6 y6VarC = c.c(jA);
            if (iB != i11 || !w3.h(eVar.w())) {
                eVar.a0(x3.a(iB));
            }
            if (y6VarC != null) {
                eVar.b0(y6VarC);
            }
        }
        return eVar;
    }

    private final e d(boolean z10, Function1<? super e, Unit> function1) {
        if (z10) {
            this.f19956e.b();
        }
        if (this.f19961j.length() > 0) {
            function1.invoke(this);
        }
        return this;
    }

    static /* synthetic */ e e(e eVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if (z10) {
            eVar.f19956e.b();
        }
        if (eVar.f19961j.length() > 0) {
            function1.invoke(eVar);
        }
        return eVar;
    }

    private final int f(int i10) {
        return kotlin.ranges.r.B(i10, this.f19961j.length() - 1);
    }

    private final int m(p3 p3Var, int i10) {
        return p3Var.p(p3Var.r(i10), true);
    }

    static /* synthetic */ int n(e eVar, p3 p3Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = w3.k(eVar.f19959h);
        }
        return eVar.m(p3Var, i10);
    }

    private final int o(p3 p3Var, int i10) {
        return p3Var.v(p3Var.r(i10));
    }

    static /* synthetic */ int p(e eVar, p3 p3Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = w3.l(eVar.f19959h);
        }
        return eVar.o(p3Var, i10);
    }

    private final int r(p3 p3Var, int i10) {
        while (i10 < this.f19957f.length()) {
            long jD = p3Var.D(f(i10));
            if (w3.i(jD) > i10) {
                return w3.i(jD);
            }
            i10++;
        }
        return this.f19957f.length();
    }

    static /* synthetic */ int s(e eVar, p3 p3Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = w3.i(eVar.f19959h);
        }
        return eVar.r(p3Var, i10);
    }

    private final int u(p3 p3Var, int i10) {
        while (i10 > 0) {
            long jD = p3Var.D(f(i10));
            if (w3.n(jD) < i10) {
                return w3.n(jD);
            }
            i10--;
        }
        return 0;
    }

    static /* synthetic */ int v(e eVar, p3 p3Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = w3.i(eVar.f19959h);
        }
        return eVar.u(p3Var, i10);
    }

    private final boolean y() {
        androidx.compose.ui.text.style.i iVarZ;
        p3 p3Var = this.f19953b;
        if (p3Var != null && (iVarZ = p3Var.z(w3.i(this.f19959h))) != null && iVarZ != androidx.compose.ui.text.style.i.Ltr) {
            return false;
        }
        return true;
    }

    private final int z(p3 p3Var, int i10) {
        int i11 = w3.i(this.f19959h);
        if (Float.isNaN(this.f19956e.a())) {
            this.f19956e.c(p3Var.e(i11).t());
        }
        int iR = p3Var.r(i11) + i10;
        if (iR < 0) {
            return Integer.MIN_VALUE;
        }
        if (iR >= p3Var.o()) {
            return Integer.MAX_VALUE;
        }
        float fN = p3Var.n(iR) - 1;
        float fA = this.f19956e.a();
        if ((y() && fA >= p3Var.u(iR)) || (!y() && fA <= p3Var.t(iR))) {
            return p3Var.p(iR, true);
        }
        return p3Var.y(n0.g.g((((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fN)) & com.rabbitmq.client.k0.f265952a)));
    }

    @NotNull
    public final e B() {
        p3 p3Var = this.f19953b;
        boolean z10 = true;
        int iZ = p3Var != null ? z(p3Var, 1) : Integer.MAX_VALUE;
        if (iZ != Integer.MAX_VALUE) {
            z10 = false;
        }
        if (z10) {
            this.f19956e.b();
        }
        if (this.f19961j.length() > 0) {
            int i10 = w3.i(w());
            long jA = y0.a(kotlin.ranges.r.B(iZ, this.f19961j.length()), i10, this.f19952a);
            int iB = c.b(jA);
            y6 y6VarC = c.c(jA);
            if (iB != i10 || !w3.h(w())) {
                a0(x3.a(iB));
            }
            if (y6VarC != null) {
                b0(y6VarC);
            }
        }
        return this;
    }

    @NotNull
    public final e C() {
        if (this.f19961j.length() > 0) {
            int i10 = w3.i(w());
            long jA = y0.a(A(1), i10, this.f19952a);
            int iB = c.b(jA);
            y6 y6VarC = c.c(jA);
            if (iB != i10 || !w3.h(w())) {
                a0(x3.a(iB));
            }
            if (y6VarC != null) {
                b0(y6VarC);
            }
        }
        return this;
    }

    @NotNull
    public final e D() {
        return y() ? I() : F();
    }

    @NotNull
    public final e E() {
        return y() ? L() : H();
    }

    @NotNull
    public final e F() {
        this.f19956e.b();
        if (this.f19961j.length() > 0) {
            int i10 = w3.i(w());
            long jA = y0.a(b5.c(this.f19961j, w3.i(this.f19959h)), i10, this.f19952a);
            int iB = c.b(jA);
            y6 y6VarC = c.c(jA);
            if (iB != i10 || !w3.h(w())) {
                a0(x3.a(iB));
            }
            if (y6VarC != null) {
                b0(y6VarC);
            }
        }
        return this;
    }

    @NotNull
    public final e G() {
        this.f19956e.b();
        if (this.f19961j.length() > 0) {
            int i10 = w3.i(w());
            int iA = a5.a(this.f19961j, w3.k(this.f19959h));
            if (iA == w3.k(this.f19959h) && iA != this.f19961j.length()) {
                iA = a5.a(this.f19961j, iA + 1);
            }
            long jA = y0.a(iA, i10, this.f19952a);
            int iB = c.b(jA);
            y6 y6VarC = c.c(jA);
            if (iB != i10 || !w3.h(w())) {
                a0(x3.a(iB));
            }
            if (y6VarC != null) {
                b0(y6VarC);
            }
        }
        return this;
    }

    @NotNull
    public final e H() {
        this.f19956e.b();
        if (this.f19961j.length() > 0) {
            int i10 = w3.i(w());
            p3 p3Var = this.f19953b;
            long jA = y0.a(p3Var != null ? s(this, p3Var, 0, 1, null) : this.f19961j.length(), i10, this.f19952a);
            int iB = c.b(jA);
            y6 y6VarC = c.c(jA);
            if (iB != i10 || !w3.h(w())) {
                a0(x3.a(iB));
            }
            if (y6VarC != null) {
                b0(y6VarC);
            }
        }
        return this;
    }

    @NotNull
    public final e I() {
        this.f19956e.b();
        if (this.f19961j.length() > 0) {
            int i10 = w3.i(w());
            long jA = y0.a(b5.d(this.f19961j, w3.i(this.f19959h)), i10, this.f19952a);
            int iB = c.b(jA);
            y6 y6VarC = c.c(jA);
            if (iB != i10 || !w3.h(w())) {
                a0(x3.a(iB));
            }
            if (y6VarC != null) {
                b0(y6VarC);
            }
        }
        return this;
    }

    @NotNull
    public final e J() {
        this.f19956e.b();
        if (this.f19961j.length() > 0) {
            int i10 = w3.i(w());
            int i11 = 1 & (-1);
            long jA = y0.a(b5.b(this.f19961j, w3.i(this.f19959h), -1), i10, this.f19952a);
            int iB = c.b(jA);
            y6 y6VarC = c.c(jA);
            if (iB != i10 || !w3.h(w())) {
                a0(x3.a(iB));
            }
            if (y6VarC != null) {
                b0(y6VarC);
            }
        }
        return this;
    }

    @NotNull
    public final e K() {
        this.f19956e.b();
        if (this.f19961j.length() > 0) {
            int i10 = w3.i(w());
            int iB = a5.b(this.f19961j, w3.l(this.f19959h));
            if (iB == w3.l(this.f19959h) && iB != 0) {
                iB = a5.b(this.f19961j, iB - 1);
            }
            long jA = y0.a(iB, i10, this.f19952a);
            int iB2 = c.b(jA);
            y6 y6VarC = c.c(jA);
            if (iB2 != i10 || !w3.h(w())) {
                a0(x3.a(iB2));
            }
            if (y6VarC != null) {
                b0(y6VarC);
            }
        }
        return this;
    }

    @NotNull
    public final e L() {
        this.f19956e.b();
        if (this.f19961j.length() > 0) {
            int i10 = w3.i(w());
            p3 p3Var = this.f19953b;
            long jA = y0.a(p3Var != null ? v(this, p3Var, 0, 1, null) : 0, i10, this.f19952a);
            int iB = c.b(jA);
            y6 y6VarC = c.c(jA);
            if (iB != i10 || !w3.h(w())) {
                a0(x3.a(iB));
            }
            if (y6VarC != null) {
                b0(y6VarC);
            }
        }
        return this;
    }

    @NotNull
    public final e M() {
        return y() ? F() : I();
    }

    @NotNull
    public final e N() {
        return y() ? H() : L();
    }

    @NotNull
    public final e Q() {
        this.f19956e.b();
        if (this.f19961j.length() > 0) {
            int i10 = w3.i(w());
            long jA = y0.a(this.f19961j.length(), i10, this.f19952a);
            int iB = c.b(jA);
            y6 y6VarC = c.c(jA);
            if (iB != i10 || !w3.h(w())) {
                a0(x3.a(iB));
            }
            if (y6VarC != null) {
                b0(y6VarC);
            }
        }
        return this;
    }

    @NotNull
    public final e R() {
        this.f19956e.b();
        if (this.f19961j.length() > 0) {
            int i10 = w3.i(w());
            long jA = y0.a(0, i10, this.f19952a);
            int iB = c.b(jA);
            y6 y6VarC = c.c(jA);
            if (iB != i10 || !w3.h(w())) {
                a0(x3.a(iB));
            }
            if (y6VarC != null) {
                b0(y6VarC);
            }
        }
        return this;
    }

    @NotNull
    public final e S() {
        int length;
        this.f19956e.b();
        if (this.f19961j.length() > 0) {
            int i10 = w3.i(w());
            p3 p3Var = this.f19953b;
            if (p3Var != null) {
                int i11 = 3 | 1;
                length = n(this, p3Var, 0, 1, null);
            } else {
                length = this.f19961j.length();
            }
            long jA = y0.a(length, i10, this.f19952a);
            int iB = c.b(jA);
            y6 y6VarC = c.c(jA);
            if (iB != i10 || !w3.h(w())) {
                a0(x3.a(iB));
            }
            if (y6VarC != null) {
                b0(y6VarC);
            }
        }
        return this;
    }

    @NotNull
    public final e T() {
        return y() ? V() : S();
    }

    @NotNull
    public final e U() {
        return y() ? S() : V();
    }

    @NotNull
    public final e V() {
        this.f19956e.b();
        if (this.f19961j.length() > 0) {
            int i10 = w3.i(w());
            p3 p3Var = this.f19953b;
            long jA = y0.a(p3Var != null ? p(this, p3Var, 0, 1, null) : 0, i10, this.f19952a);
            int iB = c.b(jA);
            y6 y6VarC = c.c(jA);
            if (iB != i10 || !w3.h(w())) {
                a0(x3.a(iB));
            }
            if (y6VarC != null) {
                b0(y6VarC);
            }
        }
        return this;
    }

    @NotNull
    public final e W() {
        p3 p3Var = this.f19953b;
        int iZ = p3Var != null ? z(p3Var, -1) : Integer.MIN_VALUE;
        if (iZ == Integer.MIN_VALUE) {
            this.f19956e.b();
        }
        if (this.f19961j.length() > 0) {
            int i10 = w3.i(w());
            long jA = y0.a(kotlin.ranges.r.u(iZ, 0), i10, this.f19952a);
            int iB = c.b(jA);
            y6 y6VarC = c.c(jA);
            if (iB != i10 || !w3.h(w())) {
                a0(x3.a(iB));
            }
            if (y6VarC != null) {
                b0(y6VarC);
            }
        }
        return this;
    }

    @NotNull
    public final e X() {
        if (this.f19961j.length() > 0) {
            int i10 = w3.i(w());
            long jA = y0.a(A(-1), i10, this.f19952a);
            int iB = c.b(jA);
            y6 y6VarC = c.c(jA);
            if (iB != i10 || !w3.h(w())) {
                a0(x3.a(iB));
            }
            if (y6VarC != null) {
                b0(y6VarC);
            }
        }
        return this;
    }

    @NotNull
    public final e Y() {
        this.f19956e.b();
        if (this.f19961j.length() > 0) {
            this.f19959h = x3.b(0, this.f19961j.length());
        }
        return this;
    }

    @NotNull
    public final e Z() {
        if (this.f19961j.length() > 0) {
            this.f19959h = x3.b(w3.n(this.f19957f.h()), w3.i(this.f19959h));
        }
        return this;
    }

    public final void a0(long j10) {
        this.f19959h = j10;
    }

    public final void b0(@Nullable y6 y6Var) {
        this.f19960i = y6Var;
    }

    @NotNull
    public final e g(@NotNull Function1<? super e, Unit> function1) {
        this.f19956e.b();
        if (this.f19961j.length() > 0) {
            if (w3.h(this.f19959h)) {
                function1.invoke(this);
                return this;
            }
            if (y()) {
                this.f19959h = x3.a(w3.l(this.f19959h));
                return this;
            }
            this.f19959h = x3.a(w3.k(this.f19959h));
        }
        return this;
    }

    @NotNull
    public final e h(@NotNull Function1<? super e, Unit> function1) {
        this.f19956e.b();
        if (this.f19961j.length() > 0) {
            if (w3.h(this.f19959h)) {
                function1.invoke(this);
                return this;
            }
            if (y()) {
                this.f19959h = x3.a(w3.k(this.f19959h));
                return this;
            }
            this.f19959h = x3.a(w3.l(this.f19959h));
        }
        return this;
    }

    @NotNull
    public final e i() {
        if (this.f19961j.length() > 0) {
            if (w3.h(this.f19957f.h())) {
                w6.J(this.f19952a, "", x3.b(w3.n(this.f19957f.h()), w3.i(this.f19959h)), null, !this.f19954c, 4, null);
            } else {
                this.f19952a.o();
            }
            this.f19959h = this.f19952a.u().h();
            this.f19960i = y6.Start;
        }
        return this;
    }

    @NotNull
    public final e j() {
        this.f19956e.b();
        if (this.f19961j.length() > 0) {
            this.f19959h = x3.a(w3.i(this.f19959h));
        }
        return this;
    }

    @NotNull
    public final androidx.compose.foundation.text.input.l k() {
        return this.f19957f;
    }

    @NotNull
    public final n4 l() {
        return this.f19958g;
    }

    public final int q() {
        return b5.c(this.f19961j, w3.i(this.f19959h));
    }

    public final int t() {
        return b5.d(this.f19961j, w3.i(this.f19959h));
    }

    public final long w() {
        return this.f19959h;
    }

    @Nullable
    public final y6 x() {
        return this.f19960i;
    }
}
