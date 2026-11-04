package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nVectorizedAnimationSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedKeyframesSpec\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 IntList.kt\nandroidx/collection/IntList\n+ 4 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt\n*L\n1#1,1038:1\n216#2,2:1039\n216#2,2:1041\n65#3:1043\n65#3:1044\n65#3:1045\n70#3:1047\n71#4:1046\n*S KotlinDebug\n*F\n+ 1 VectorizedAnimationSpec.kt\nandroidx/compose/animation/core/VectorizedKeyframesSpec\n*L\n246#1:1039,2\n259#1:1041,2\n301#1:1043\n304#1:1044\n335#1:1045\n469#1:1047\n418#1:1046\n*E\n"})
public final class d5<V extends w> implements x4<V> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f12874p = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.collection.f0 f12875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.collection.j0<c5<V>> f12876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final l0 f12879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f12880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private int[] f12881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private float[] f12882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private V f12883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private V f12884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private V f12885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private V f12886l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private float[] f12887m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private float[] f12888n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private b0 f12889o;

    public /* synthetic */ d5(androidx.collection.f0 f0Var, androidx.collection.j0 j0Var, int i10, int i11, l0 l0Var, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f0Var, j0Var, i10, i11, l0Var, i12);
    }

    private final int n(int i10) {
        boolean z10 = true;
        int iF = androidx.collection.f0.f(this.f12875a, i10, 0, 0, 6, null);
        return iF < -1 ? -(iF + 2) : iF;
    }

    private final float o(int i10) {
        return p(n(i10), i10, false);
    }

    private final float p(int i10, int i11, boolean z10) {
        l0 l0VarG;
        float f10;
        androidx.collection.f0 f0Var = this.f12875a;
        if (i10 >= f0Var.f12216b - 1) {
            f10 = i11;
        } else {
            int iW = f0Var.w(i10);
            int iW2 = this.f12875a.w(i10 + 1);
            if (i11 != iW) {
                int i12 = iW2 - iW;
                c5<V> c5VarN = this.f12876b.n(iW);
                if (c5VarN == null || (l0VarG = c5VarN.g()) == null) {
                    l0VarG = this.f12879e;
                }
                float f11 = i12;
                float fA = l0VarG.a((i11 - iW) / f11);
                return z10 ? fA : ((f11 * fA) + iW) / 1000;
            }
            f10 = iW;
        }
        return f10 / 1000;
    }

    private final void q(V v10, V v11, V v12) {
        float[] fArr;
        boolean z10 = this.f12889o != v4.f13344c;
        if (this.f12883i == null) {
            this.f12883i = (V) x.g(v10);
            this.f12884j = (V) x.g(v12);
            int i10 = this.f12875a.f12216b;
            float[] fArr2 = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fArr2[i11] = this.f12875a.w(i11) / 1000;
            }
            this.f12882h = fArr2;
            int i12 = this.f12875a.f12216b;
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                c5<V> c5VarN = this.f12876b.n(this.f12875a.w(i13));
                int iF = c5VarN != null ? c5VarN.f() : this.f12880f;
                if (!a0.g(iF, a0.f12738b.c())) {
                    z10 = true;
                }
                iArr[i13] = iF;
            }
            this.f12881g = iArr;
        }
        if (z10) {
            if (this.f12889o != v4.f13344c && Intrinsics.areEqual(this.f12885k, v10) && Intrinsics.areEqual(this.f12886l, v11)) {
                return;
            }
            this.f12885k = v10;
            this.f12886l = v11;
            int iB = (v10.b() % 2) + v10.b();
            this.f12887m = new float[iB];
            this.f12888n = new float[iB];
            int i14 = this.f12875a.f12216b;
            float[][] fArr3 = new float[i14][];
            for (int i15 = 0; i15 < i14; i15++) {
                int iW = this.f12875a.w(i15);
                c5<V> c5VarN2 = this.f12876b.n(iW);
                if (iW == 0 && c5VarN2 == null) {
                    fArr = new float[iB];
                    for (int i16 = 0; i16 < iB; i16++) {
                        fArr[i16] = v10.a(i16);
                    }
                } else if (iW == a() && c5VarN2 == null) {
                    fArr = new float[iB];
                    for (int i17 = 0; i17 < iB; i17++) {
                        fArr[i17] = v11.a(i17);
                    }
                } else {
                    Intrinsics.checkNotNull(c5VarN2);
                    w wVarH = c5VarN2.h();
                    float[] fArr4 = new float[iB];
                    for (int i18 = 0; i18 < iB; i18++) {
                        fArr4[i18] = wVarH.a(i18);
                    }
                    fArr = fArr4;
                }
                fArr3[i15] = fArr;
            }
            this.f12889o = new b0(this.f12881g, this.f12882h, fArr3);
        }
    }

    @Override // androidx.compose.animation.core.x4
    public int a() {
        return this.f12877c;
    }

    @Override // androidx.compose.animation.core.u4
    @NotNull
    public V g(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        long jE = v4.e(this, j10 / 1000000);
        if (jE < 0) {
            return v12;
        }
        q(v10, v11, v12);
        V v13 = this.f12884j;
        Intrinsics.checkNotNull(v13);
        int i10 = 0;
        if (this.f12889o != v4.f13344c) {
            float fO = o((int) jE);
            float[] fArr = this.f12888n;
            this.f12889o.b(fO, fArr);
            int length = fArr.length;
            while (i10 < length) {
                v13.e(i10, fArr[i10]);
                i10++;
            }
        } else {
            w wVarH = v4.h(this, jE - 1, v10, v11, v12);
            w wVarH2 = v4.h(this, jE, v10, v11, v12);
            int iB = wVarH.b();
            while (i10 < iB) {
                v13.e(i10, (wVarH.a(i10) - wVarH2.a(i10)) * 1000.0f);
                i10++;
            }
        }
        return v13;
    }

    @Override // androidx.compose.animation.core.u4
    @NotNull
    public V i(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        w wVarH;
        w wVarH2;
        int iE = (int) v4.e(this, j10 / 1000000);
        c5<V> c5VarN = this.f12876b.n(iE);
        if (c5VarN != null) {
            return (V) c5VarN.h();
        }
        if (iE >= a()) {
            return v11;
        }
        if (iE <= 0) {
            return v10;
        }
        q(v10, v11, v12);
        V v13 = this.f12883i;
        Intrinsics.checkNotNull(v13);
        int i10 = 0;
        if (this.f12889o != v4.f13344c) {
            float fO = o(iE);
            float[] fArr = this.f12887m;
            this.f12889o.a(fO, fArr);
            int length = fArr.length;
            while (i10 < length) {
                v13.e(i10, fArr[i10]);
                i10++;
            }
            return v13;
        }
        int iN = n(iE);
        float fP = p(iN, iE, true);
        c5<V> c5VarN2 = this.f12876b.n(this.f12875a.w(iN));
        if (c5VarN2 != null && (wVarH2 = c5VarN2.h()) != null) {
            v10 = (V) wVarH2;
        }
        c5<V> c5VarN3 = this.f12876b.n(this.f12875a.w(iN + 1));
        if (c5VarN3 != null && (wVarH = c5VarN3.h()) != null) {
            v11 = (V) wVarH;
        }
        int iB = v13.b();
        while (i10 < iB) {
            v13.e(i10, (v10.a(i10) * (1 - fP)) + (v11.a(i10) * fP));
            i10++;
        }
        return v13;
    }

    @Override // androidx.compose.animation.core.x4
    public int k() {
        return this.f12878d;
    }

    private d5(androidx.collection.f0 f0Var, androidx.collection.j0<c5<V>> j0Var, int i10, int i11, l0 l0Var, int i12) {
        this.f12875a = f0Var;
        this.f12876b = j0Var;
        this.f12877c = i10;
        this.f12878d = i11;
        this.f12879e = l0Var;
        this.f12880f = i12;
        this.f12881g = v4.f13342a;
        this.f12882h = v4.f13343b;
        this.f12887m = v4.f13343b;
        this.f12888n = v4.f13343b;
        this.f12889o = v4.f13344c;
    }

    public /* synthetic */ d5(Map map, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, i10, (i12 & 4) != 0 ? 0 : i11);
    }

    public d5(@NotNull Map<Integer, ? extends Pair<? extends V, ? extends l0>> map, int i10, int i11) {
        androidx.collection.r1 r1Var = new androidx.collection.r1(map.size() + 2);
        Iterator<Map.Entry<Integer, ? extends Pair<? extends V, ? extends l0>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            r1Var.b0(it.next().getKey().intValue());
        }
        if (!map.containsKey(0)) {
            r1Var.a0(0, 0);
        }
        if (!map.containsKey(Integer.valueOf(i10))) {
            r1Var.b0(i10);
        }
        r1Var.x0();
        int i12 = 3 | 0;
        androidx.collection.t1 t1Var = new androidx.collection.t1(0, 1, null);
        for (Map.Entry<Integer, ? extends Pair<? extends V, ? extends l0>> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Pair<? extends V, ? extends l0> value = entry.getValue();
            t1Var.j0(iIntValue, new c5(value.getFirst(), value.getSecond(), a0.f12738b.c(), null));
        }
        this(r1Var, t1Var, i10, i11, u0.e(), a0.f12738b.c(), null);
    }
}
