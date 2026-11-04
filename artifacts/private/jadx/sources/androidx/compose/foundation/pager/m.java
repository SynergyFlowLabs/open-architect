package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.q3;
import androidx.compose.ui.layout.i2;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMeasuredPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasuredPage.kt\nandroidx/compose/foundation/pager/MeasuredPage\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,129:1\n125#1:153\n35#2,5:130\n71#2,3:135\n75#2:148\n109#3,5:138\n109#3,5:143\n97#3,4:149\n32#4:154\n32#4:156\n32#4:158\n80#5:155\n80#5:157\n80#5:159\n*S KotlinDebug\n*F\n+ 1 MeasuredPage.kt\nandroidx/compose/foundation/pager/MeasuredPage\n*L\n94#1:153\n52#1:130,5\n68#1:135,3\n68#1:148\n72#1:138,5\n79#1:143,5\n88#1:149,4\n94#1:154\n119#1:156\n125#1:158\n94#1:155\n119#1:157\n125#1:159\n*E\n"})
public final class m implements o {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f18362o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<i2> f18365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f18366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f18367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.e.b f18368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.e.c f18369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.w f18370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f18371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f18372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f18373k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final int[] f18374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f18375m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f18376n;

    public /* synthetic */ m(int i10, int i11, List list, long j10, Object obj, q3 q3Var, androidx.compose.ui.e.b bVar, androidx.compose.ui.e.c cVar, androidx.compose.ui.unit.w wVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, list, j10, obj, q3Var, bVar, cVar, wVar, z10);
    }

    private final long b(long j10, Function1<? super Integer, Integer> function1) {
        return androidx.compose.ui.unit.q.f((((long) (this.f18372j ? androidx.compose.ui.unit.q.n(j10) : function1.invoke(Integer.valueOf(androidx.compose.ui.unit.q.n(j10))).intValue())) << 32) | (((long) (this.f18372j ? function1.invoke(Integer.valueOf(androidx.compose.ui.unit.q.p(j10))).intValue() : androidx.compose.ui.unit.q.p(j10))) & com.rabbitmq.client.k0.f265952a));
    }

    private final int d(i2 i2Var) {
        return this.f18372j ? i2Var.c1() : i2Var.h1();
    }

    private final long e(int i10) {
        int[] iArr = this.f18374l;
        int i11 = i10 * 2;
        int i12 = iArr[i11];
        return androidx.compose.ui.unit.q.f((((long) iArr[i11 + 1]) & com.rabbitmq.client.k0.f265952a) | (((long) i12) << 32));
    }

    public final void a(int i10) {
        this.f18375m = getOffset() + i10;
        int length = this.f18374l.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolean z10 = this.f18372j;
            if ((z10 && i11 % 2 == 1) || (!z10 && i11 % 2 == 0)) {
                int[] iArr = this.f18374l;
                iArr[i11] = iArr[i11] + i10;
            }
        }
    }

    public final int c() {
        return this.f18373k;
    }

    public final int f() {
        return this.f18364b;
    }

    public final void g(@NotNull i2.a aVar) {
        i2.a aVar2;
        int iN;
        int iP;
        int i10 = 0;
        if (!(this.f18376n != Integer.MIN_VALUE)) {
            androidx.compose.foundation.internal.e.g("position() should be called first");
        }
        int size = this.f18365c.size();
        while (i10 < size) {
            i2 i2Var = this.f18365c.get(i10);
            long jE = e(i10);
            if (this.f18371i) {
                if (this.f18372j) {
                    iN = androidx.compose.ui.unit.q.n(jE);
                } else {
                    iN = (this.f18376n - androidx.compose.ui.unit.q.n(jE)) - d(i2Var);
                }
                if (this.f18372j) {
                    iP = (this.f18376n - androidx.compose.ui.unit.q.p(jE)) - d(i2Var);
                } else {
                    iP = androidx.compose.ui.unit.q.p(jE);
                }
                jE = androidx.compose.ui.unit.q.f((((long) iN) << 32) | (((long) iP) & com.rabbitmq.client.k0.f265952a));
            }
            long jS = androidx.compose.ui.unit.q.s(jE, this.f18366d);
            if (this.f18372j) {
                aVar2 = aVar;
                i2.a.H0(aVar2, i2Var, jS, 0.0f, null, 6, null);
            } else {
                aVar2 = aVar;
                i2.a.t0(aVar2, i2Var, jS, 0.0f, null, 6, null);
            }
            i10++;
            aVar = aVar2;
        }
    }

    @Override // androidx.compose.foundation.pager.o
    public int getIndex() {
        return this.f18363a;
    }

    @Override // androidx.compose.foundation.pager.o
    @NotNull
    public Object getKey() {
        return this.f18367e;
    }

    @Override // androidx.compose.foundation.pager.o
    public int getOffset() {
        return this.f18375m;
    }

    public final void h(int i10, int i11, int i12) {
        int iH1;
        this.f18375m = i10;
        this.f18376n = this.f18372j ? i12 : i11;
        List<i2> list = this.f18365c;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            i2 i2Var = list.get(i13);
            int i14 = i13 * 2;
            if (this.f18372j) {
                int[] iArr = this.f18374l;
                androidx.compose.ui.e.b bVar = this.f18368f;
                if (bVar == null) {
                    androidx.compose.foundation.internal.e.h("null horizontalAlignment");
                    throw new kotlin.a0();
                }
                iArr[i14] = bVar.a(i2Var.h1(), i11, this.f18370h);
                this.f18374l[i14 + 1] = i10;
                iH1 = i2Var.c1();
            } else {
                int[] iArr2 = this.f18374l;
                iArr2[i14] = i10;
                int i15 = i14 + 1;
                androidx.compose.ui.e.c cVar = this.f18369g;
                if (cVar == null) {
                    androidx.compose.foundation.internal.e.h("null verticalAlignment");
                    throw new kotlin.a0();
                }
                iArr2[i15] = cVar.a(i2Var.c1(), i12);
                iH1 = i2Var.h1();
            }
            i10 += iH1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private m(int i10, int i11, List<? extends i2> list, long j10, Object obj, q3 q3Var, androidx.compose.ui.e.b bVar, androidx.compose.ui.e.c cVar, androidx.compose.ui.unit.w wVar, boolean z10) {
        this.f18363a = i10;
        this.f18364b = i11;
        this.f18365c = list;
        this.f18366d = j10;
        this.f18367e = obj;
        this.f18368f = bVar;
        this.f18369g = cVar;
        this.f18370h = wVar;
        this.f18371i = z10;
        this.f18372j = q3Var == q3.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i2 i2Var = (i2) list.get(i12);
            iMax = Math.max(iMax, !this.f18372j ? i2Var.c1() : i2Var.h1());
        }
        this.f18373k = iMax;
        this.f18374l = new int[this.f18365c.size() * 2];
        this.f18376n = Integer.MIN_VALUE;
    }
}
