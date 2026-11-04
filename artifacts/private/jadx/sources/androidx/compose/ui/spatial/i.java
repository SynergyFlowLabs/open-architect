package androidx.compose.ui.spatial;

import androidx.collection.k0;
import androidx.collection.t1;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.node.k;
import androidx.compose.ui.node.l0;
import androidx.compose.ui.unit.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nThrottledCallbacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacks\n+ 2 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n+ 3 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,529:1\n437#1,6:531\n427#1:561\n428#1,6:578\n434#1:591\n419#1,3:592\n422#1,3:600\n427#1:603\n428#1,6:620\n434#1:633\n419#1,6:634\n837#2:530\n837#2:599\n397#3,3:537\n354#3,6:540\n364#3,3:547\n367#3,9:551\n400#3:560\n397#3,3:562\n354#3,6:565\n364#3,3:572\n367#3,2:576\n370#3,6:584\n400#3:590\n397#3,3:604\n354#3,6:607\n364#3,3:614\n367#3,2:618\n370#3,6:626\n400#3:632\n397#3,3:640\n354#3,6:643\n364#3,3:650\n367#3,9:654\n400#3:663\n1399#4:546\n1270#4:550\n1399#4:571\n1270#4:575\n1399#4:613\n1270#4:617\n1399#4:649\n1270#4:653\n54#5:595\n59#5:597\n85#6:596\n90#6:598\n679#7:664\n1#8:665\n*S KotlinDebug\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacks\n*L\n185#1:531,6\n207#1:561\n207#1:578,6\n207#1:591\n223#1:592,3\n223#1:600,3\n252#1:603\n252#1:620,6\n252#1:633\n263#1:634,6\n122#1:530\n231#1:599\n191#1:537,3\n191#1:540,6\n191#1:547,3\n191#1:551,9\n191#1:560\n207#1:562,3\n207#1:565,6\n207#1:572,3\n207#1:576,2\n207#1:584,6\n207#1:590\n252#1:604,3\n252#1:607,6\n252#1:614,3\n252#1:618,2\n252#1:626,6\n252#1:632\n427#1:640,3\n427#1:643,6\n427#1:650,3\n427#1:654,9\n427#1:663\n191#1:546\n191#1:550\n207#1:571\n207#1:575\n252#1:613\n252#1:617\n427#1:649\n427#1:653\n231#1:595\n231#1:597\n231#1:596\n231#1:598\n445#1:664\n445#1:665\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f41280h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private a f41282b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f41284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f41285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f41286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private float[] f41287g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final t1<a> f41281a = k0.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f41283c = -1;

    public final class a implements androidx.compose.ui.node.j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f41288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f41289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f41290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.node.j f41291d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final Function1<h, Unit> f41292e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private a f41293f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f41294g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f41295h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f41296i = Long.MIN_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f41297j = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(int i10, long j10, @NotNull long j11, @NotNull androidx.compose.ui.node.j jVar, Function1<? super h, Unit> function1) {
            this.f41288a = i10;
            this.f41289b = j10;
            this.f41290c = j11;
            this.f41291d = jVar;
            this.f41292e = function1;
        }

        @Override // androidx.compose.ui.node.j.a
        public void a() {
            i iVar = i.this;
            if (!iVar.u(iVar.m(), this.f41288a, this)) {
                i.this.x(this);
            }
        }

        public final void b(long j10, long j11, long j12, long j13, @Nullable float[] fArr) {
            h hVarA = j.a(this.f41291d, j10, j11, j12, j13, i.this.q(), fArr);
            if (hVarA == null) {
                return;
            }
            this.f41292e.invoke(hVarA);
        }

        public final long c() {
            return this.f41295h;
        }

        @NotNull
        public final Function1<h, Unit> d() {
            return this.f41292e;
        }

        public final long e() {
            return this.f41290c;
        }

        public final int f() {
            return this.f41288a;
        }

        public final long g() {
            return this.f41296i;
        }

        public final long h() {
            return this.f41297j;
        }

        @Nullable
        public final a i() {
            return this.f41293f;
        }

        @NotNull
        public final androidx.compose.ui.node.j j() {
            return this.f41291d;
        }

        public final long k() {
            return this.f41289b;
        }

        public final long l() {
            return this.f41294g;
        }

        public final void m(long j10) {
            this.f41295h = j10;
        }

        public final void n(long j10) {
            this.f41296i = j10;
        }

        public final void o(long j10) {
            this.f41297j = j10;
        }

        public final void p(@Nullable a aVar) {
            this.f41293f = aVar;
        }

        public final void q(long j10) {
            this.f41294g = j10;
        }
    }

    public i() {
        q.a aVar = q.f42709b;
        this.f41284d = aVar.b();
        this.f41285e = aVar.b();
    }

    private final void c(a aVar) {
        aVar.p(this.f41282b);
        this.f41282b = aVar;
    }

    private final long d(a aVar, long j10, long j11, float[] fArr, long j12, long j13) {
        if (aVar.e() <= 0 || aVar.h() <= 0) {
            return j13;
        }
        if (j12 - aVar.h() <= aVar.e()) {
            return Math.min(j13, aVar.h() + aVar.e());
        }
        aVar.n(j12);
        aVar.o(-1L);
        aVar.b(aVar.l(), aVar.c(), j10, j11, fArr);
        return j13;
    }

    private final void e(a aVar, long j10, long j11, float[] fArr, long j12) {
        long jG = aVar.g();
        boolean z10 = j12 - jG > aVar.k() || jG == Long.MIN_VALUE;
        boolean z11 = aVar.e() == 0;
        aVar.o(j12);
        if (z10 && z11) {
            aVar.n(j12);
            aVar.b(aVar.l(), aVar.c(), j10, j11, fArr);
        }
        if (z11) {
            return;
        }
        long j13 = this.f41283c;
        long jE = aVar.e() + j12;
        if (j13 <= 0 || jE >= j13) {
            return;
        }
        this.f41283c = j13;
    }

    private final void r(a aVar, Function1<? super a, Unit> function1) {
        while (aVar != null) {
            function1.invoke(aVar);
            aVar = aVar.i();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005c A[LOOP:0: B:5:0x0010->B:17:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x005f A[EDGE_INSN: B:21:0x005f->B:18:0x005f BREAK  A[LOOP:0: B:5:0x0010->B:17:0x005c], SYNTHETIC] */
    private final void s(t1<a> t1Var, Function1<? super a, Unit> function1) {
        Object[] objArr = t1Var.f12303c;
        long[] jArr = t1Var.f12301a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            for (a aVarI = (a) objArr[(i10 << 3) + i12]; aVarI != null; aVarI = aVarI.i()) {
                                function1.invoke(aVarI);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
    }

    private final a t(t1<a> t1Var, int i10, a aVar) {
        a aVarN = t1Var.n(i10);
        if (aVarN == null) {
            t1Var.j0(i10, aVar);
            aVarN = aVar;
        }
        a aVarI = aVarN;
        if (aVarI != aVar) {
            while (aVarI.i() != null) {
                aVarI = aVarI.i();
                Intrinsics.checkNotNull(aVarI);
            }
            aVarI.p(aVar);
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u(t1<a> t1Var, int i10, a aVar) {
        a aVarE0 = t1Var.e0(i10);
        if (aVarE0 == null) {
            return false;
        }
        if (Intrinsics.areEqual(aVarE0, aVar)) {
            a aVarI = aVar.i();
            aVar.p(null);
            if (aVarI != null) {
                t1Var.c0(i10, aVarI);
            }
            return true;
        }
        t1Var.c0(i10, aVarE0);
        while (aVarE0 != null) {
            a aVarI2 = aVarE0.i();
            if (aVarI2 == null) {
                return false;
            }
            if (aVarI2 == aVar) {
                aVarE0.p(aVar.i());
                aVar.p(null);
                break;
            }
            aVarE0 = aVarE0.i();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean x(a aVar) {
        a aVar2 = this.f41282b;
        if (aVar2 == aVar) {
            this.f41282b = aVar2.i();
            aVar.p(null);
            return true;
        }
        a aVarI = aVar2 != null ? aVar2.i() : null;
        while (true) {
            a aVar3 = aVar2;
            aVar2 = aVarI;
            if (aVar2 == null) {
                return false;
            }
            if (aVar2 == aVar) {
                if (aVar3 != null) {
                    aVar3.p(aVar2.i());
                }
                aVar.p(null);
                return true;
            }
            aVarI = aVar2.i();
        }
    }

    private final long y(long j10) {
        return (j10 >> 3) << 3;
    }

    private final void z(t1<a> t1Var, int i10, Function1<? super a, Unit> function1) {
        for (a aVarN = t1Var.n(i10); aVarN != null; aVarN = aVarN.i()) {
            function1.invoke(aVarN);
        }
    }

    public final void A(@Nullable a aVar) {
        this.f41282b = aVar;
    }

    public final void B(long j10) {
        this.f41283c = j10;
    }

    public final void C(long j10) {
        this.f41285e = j10;
    }

    public final void D(@Nullable float[] fArr) {
        this.f41287g = fArr;
    }

    public final void E(long j10) {
        this.f41284d = j10;
    }

    public final void F(long j10) {
        this.f41286f = j10;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008e A[LOOP:0: B:8:0x0023->B:25:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0098 A[EDGE_INSN: B:39:0x0098->B:27:0x0098 BREAK  A[LOOP:0: B:8:0x0023->B:25:0x008e], SYNTHETIC] */
    public final void G(long j10) {
        long j11;
        long jD;
        int i10;
        if (this.f41283c > j10) {
            return;
        }
        long j12 = this.f41284d;
        long j13 = this.f41285e;
        float[] fArr = this.f41287g;
        t1<a> t1Var = this.f41281a;
        Object[] objArr = t1Var.f12303c;
        long[] jArr = t1Var.f12301a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            jD = Long.MAX_VALUE;
            while (true) {
                long j14 = jArr[i11];
                j11 = Long.MAX_VALUE;
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    long j15 = j14;
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j15 & 255) < 128) {
                            a aVarI = (a) objArr[(i11 << 3) + i13];
                            while (aVarI != null) {
                                int i14 = i11;
                                a aVar = aVarI;
                                jD = d(aVar, j12, j13, fArr, j10, jD);
                                i13 = i13;
                                aVarI = aVar.i();
                                i11 = i14;
                            }
                            i10 = i13;
                        } else {
                            i10 = i13;
                        }
                        j15 >>= 8;
                        i13 = i10 + 1;
                        i11 = i11;
                    }
                    int i15 = i11;
                    if (i12 != 8) {
                        break;
                    }
                    i11 = i15;
                    if (i11 != length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        } else {
            j11 = Long.MAX_VALUE;
            jD = Long.MAX_VALUE;
        }
        a aVarI2 = this.f41282b;
        if (aVarI2 != null) {
            long jD2 = jD;
            while (aVarI2 != null) {
                jD2 = d(aVarI2, j12, j13, fArr, j10, jD2);
                aVarI2 = aVarI2.i();
            }
            jD = jD2;
        }
        if (jD == j11) {
            jD = -1;
        }
        this.f41283c = jD;
    }

    public final boolean H(long j10, long j11, @Nullable float[] fArr, int i10, int i11) {
        boolean z10;
        if (q.k(j11, this.f41284d)) {
            z10 = false;
        } else {
            this.f41284d = j11;
            z10 = true;
        }
        if (!q.k(j10, this.f41285e)) {
            this.f41285e = j10;
            z10 = true;
        }
        if (fArr != null) {
            this.f41287g = fArr;
            z10 = true;
        }
        long j12 = (((long) i10) << 32) | (((long) i11) & com.rabbitmq.client.k0.f265952a);
        if (j12 == this.f41286f) {
            return z10;
        }
        this.f41286f = j12;
        return true;
    }

    public final void f(long j10) {
        long j11 = this.f41284d;
        long j12 = this.f41285e;
        float[] fArr = this.f41287g;
        a aVar = this.f41282b;
        if (aVar != null) {
            for (a aVarI = aVar; aVarI != null; aVarI = aVarI.i()) {
                l0 l0VarU = k.u(aVarI.j());
                long jB0 = l0VarU.B0();
                long jJ0 = l0VarU.j0();
                aVarI.q(jB0);
                aVarI.m((((long) (q.n(jB0) + ((int) (jJ0 >> 32)))) << 32) | (((long) (q.p(jB0) + ((int) (jJ0 & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a));
                e(aVarI, j11, j12, fArr, j10);
            }
        }
    }

    public final void g(long j10) {
        i iVar = this;
        long j11 = iVar.f41284d;
        long j12 = iVar.f41285e;
        float[] fArr = iVar.f41287g;
        t1<a> t1Var = iVar.f41281a;
        Object[] objArr = t1Var.f12303c;
        long[] jArr = t1Var.f12301a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j13 = jArr[i10];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                long j14 = j13;
                int i12 = 0;
                while (i12 < i11) {
                    if ((j14 & 255) < 128) {
                        a aVarI = (a) objArr[(i10 << 3) + i12];
                        while (aVarI != null) {
                            int i13 = i12;
                            a aVar = aVarI;
                            iVar.e(aVar, j11, j12, fArr, j10);
                            aVarI = aVar.i();
                            iVar = this;
                            i12 = i13;
                        }
                    }
                    j14 >>= 8;
                    i12++;
                    iVar = this;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            }
            i10++;
            iVar = this;
        }
    }

    public final void h(int i10, long j10, long j11, long j12) {
        for (a aVarN = this.f41281a.n(i10); aVarN != null; aVarN = aVarN.i()) {
            i(aVarN, j10, j11, j12);
        }
    }

    public final void i(@NotNull a aVar, long j10, long j11, long j12) {
        long jG = aVar.g();
        long jK = aVar.k();
        long jE = aVar.e();
        boolean z10 = j12 - jG >= jK || jG == Long.MIN_VALUE;
        boolean z11 = jE == 0;
        boolean z12 = jK == 0;
        aVar.q(j10);
        aVar.m(j11);
        boolean z13 = !(z11 || z12) || z11;
        if (z10 && z13) {
            aVar.o(-1L);
            aVar.n(j12);
            aVar.b(j10, j11, this.f41284d, this.f41285e, this.f41287g);
        } else {
            if (z11) {
                return;
            }
            aVar.o(j12);
            long j13 = this.f41283c;
            long j14 = j12 + jE;
            if (j13 <= 0 || j14 >= j13) {
                return;
            }
            this.f41283c = j13;
        }
    }

    public final void j(@NotNull Function1<? super a, Unit> function1) {
        t1<a> t1VarM = m();
        Object[] objArr = t1VarM.f12303c;
        long[] jArr = t1VarM.f12301a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        a aVar = (a) objArr[(i10 << 3) + i12];
                        for (a aVarI = aVar; aVarI != null; aVarI = aVarI.i()) {
                            if (aVar.g() == Long.MIN_VALUE) {
                                function1.invoke(aVar);
                            }
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Nullable
    public final a k() {
        return this.f41282b;
    }

    public final long l() {
        return this.f41283c;
    }

    @NotNull
    public final t1<a> m() {
        return this.f41281a;
    }

    public final long n() {
        return this.f41285e;
    }

    @Nullable
    public final float[] o() {
        return this.f41287g;
    }

    public final long p() {
        return this.f41284d;
    }

    public final long q() {
        return this.f41286f;
    }

    @NotNull
    public final androidx.compose.ui.node.j.a v(int i10, long j10, long j11, @NotNull androidx.compose.ui.node.j jVar, @NotNull Function1<? super h, Unit> function1) {
        a aVar = new a(i10, j10, j11 == 0 ? j10 : j11, jVar, function1);
        c(aVar);
        return aVar;
    }

    @NotNull
    public final androidx.compose.ui.node.j.a w(int i10, long j10, long j11, @NotNull androidx.compose.ui.node.j jVar, @NotNull Function1<? super h, Unit> function1) {
        return t(this.f41281a, i10, new a(i10, j10, j11 == 0 ? j10 : j11, jVar, function1));
    }
}
