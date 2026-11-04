package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nVectorizedMonoSplineKeyframesSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedMonoSplineKeyframesSpec.kt\nandroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n*L\n1#1,190:1\n65#2:191\n65#2:192\n70#2:195\n425#3:193\n425#3:194\n*S KotlinDebug\n*F\n+ 1 VectorizedMonoSplineKeyframesSpec.kt\nandroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec\n*L\n50#1:191\n67#1:192\n161#1:195\n82#1:193\n86#1:194\n*E\n"})
public final class e5<V extends w> implements x4<V> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f12905m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.collection.f0 f12906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.collection.j0<Pair<V, l0>> f12907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f12910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private V f12911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private V f12912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f12913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private t1 f12914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private float[][] f12915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private V f12916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private V f12917l;

    public e5(@NotNull androidx.collection.f0 f0Var, @NotNull androidx.collection.j0<Pair<V, l0>> j0Var, int i10, int i11, float f10) {
        this.f12906a = f0Var;
        this.f12907b = j0Var;
        this.f12908c = i10;
        this.f12909d = i11;
        this.f12910e = f10;
    }

    private final int n(int i10) {
        int iF = androidx.collection.f0.f(this.f12906a, i10, 0, 0, 6, null);
        return iF < -1 ? -(iF + 2) : iF;
    }

    private final float o(int i10, int i11) {
        float f10;
        androidx.collection.f0 f0Var = this.f12906a;
        if (i10 >= f0Var.f12216b - 1) {
            f10 = i11;
        } else {
            int iW = f0Var.w(i10);
            int iW2 = this.f12906a.w(i10 + 1);
            if (i11 != iW) {
                l0 l0VarP = p(i10);
                float f11 = i11 - iW;
                float f12 = iW2 - iW;
                return ((f12 * l0VarP.a(f11 / f12)) + iW) / 1000;
            }
            f10 = iW;
        }
        return f10 / 1000;
    }

    private final l0 p(int i10) {
        l0 second;
        Pair<V, l0> pairN = this.f12907b.n(this.f12906a.w(i10));
        return (pairN == null || (second = pairN.getSecond()) == null) ? u0.e() : second;
    }

    private final void q(V v10, V v11, V v12) {
        float[] fArr;
        if (this.f12911f == null) {
            this.f12911f = (V) x.g(v10);
            this.f12912g = (V) x.g(v12);
            int i10 = this.f12906a.f12216b;
            float[] fArr2 = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr2[i11] = this.f12906a.w(i11) / 1000;
            }
            this.f12913h = fArr2;
        }
        if (this.f12914i != null && Intrinsics.areEqual(this.f12916k, v10) && Intrinsics.areEqual(this.f12917l, v11)) {
            return;
        }
        boolean zAreEqual = Intrinsics.areEqual(this.f12916k, v10);
        boolean zAreEqual2 = Intrinsics.areEqual(this.f12917l, v11);
        this.f12916k = v10;
        this.f12917l = v11;
        int iB = v10.b();
        float[][] fArr3 = this.f12915j;
        if (fArr3 == null) {
            int i12 = this.f12906a.f12216b;
            fArr3 = new float[i12][];
            for (int i13 = 0; i13 < i12; i13++) {
                int iW = this.f12906a.w(i13);
                Pair<V, l0> pairN = this.f12907b.n(iW);
                if (iW == 0 && pairN == null) {
                    fArr = new float[iB];
                    for (int i14 = 0; i14 < iB; i14++) {
                        fArr[i14] = v10.a(i14);
                    }
                } else if (iW == a() && pairN == null) {
                    fArr = new float[iB];
                    for (int i15 = 0; i15 < iB; i15++) {
                        fArr[i15] = v11.a(i15);
                    }
                } else {
                    Intrinsics.checkNotNull(pairN);
                    V first = pairN.getFirst();
                    float[] fArr4 = new float[iB];
                    for (int i16 = 0; i16 < iB; i16++) {
                        fArr4[i16] = first.a(i16);
                    }
                    fArr = fArr4;
                }
                fArr3[i13] = fArr;
            }
            this.f12915j = fArr3;
        } else {
            if (!zAreEqual && !this.f12907b.e(0)) {
                int iF = androidx.collection.f0.f(this.f12906a, 0, 0, 0, 6, null);
                float[] fArr5 = new float[iB];
                for (int i17 = 0; i17 < iB; i17++) {
                    fArr5[i17] = v10.a(i17);
                }
                fArr3[iF] = fArr5;
            }
            if (!zAreEqual2 && !this.f12907b.e(a())) {
                int iF2 = androidx.collection.f0.f(this.f12906a, a(), 0, 0, 6, null);
                float[] fArr6 = new float[iB];
                for (int i18 = 0; i18 < iB; i18++) {
                    fArr6[i18] = v11.a(i18);
                }
                fArr3[iF2] = fArr6;
            }
        }
        float[] fArr7 = this.f12913h;
        if (fArr7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("times");
            fArr7 = null;
        }
        this.f12914i = new t1(fArr7, fArr3, this.f12910e);
    }

    @Override // androidx.compose.animation.core.x4
    public int a() {
        return this.f12908c;
    }

    @Override // androidx.compose.animation.core.u4
    @NotNull
    public V g(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        int iE = (int) v4.e(this, j10 / 1000000);
        q(v10, v11, v12);
        int iN = n(iE);
        V v13 = this.f12912g;
        Intrinsics.checkNotNull(v13);
        t1 t1Var = this.f12914i;
        Intrinsics.checkNotNull(t1Var);
        t1Var.e(o(iN, iE), v13, iN);
        return v13;
    }

    @Override // androidx.compose.animation.core.u4
    @NotNull
    public V i(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        int iE = (int) v4.e(this, j10 / 1000000);
        Pair<V, l0> pairN = this.f12907b.n(iE);
        if (pairN != null) {
            return pairN.getFirst();
        }
        if (iE >= a()) {
            return v11;
        }
        if (iE <= 0) {
            return v10;
        }
        q(v10, v11, v12);
        int iN = n(iE);
        V v13 = this.f12911f;
        Intrinsics.checkNotNull(v13);
        t1 t1Var = this.f12914i;
        Intrinsics.checkNotNull(t1Var);
        t1Var.b(o(iN, iE), v13, iN);
        return v13;
    }

    @Override // androidx.compose.animation.core.x4
    public int k() {
        return this.f12909d;
    }
}
