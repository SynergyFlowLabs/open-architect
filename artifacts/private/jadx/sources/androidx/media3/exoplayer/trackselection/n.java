package androidx.media3.exoplayer.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media3.common.b4;
import androidx.media3.common.c4;
import androidx.media3.common.e4;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.z3;
import androidx.media3.exoplayer.a5;
import androidx.media3.exoplayer.c5;
import androidx.media3.exoplayer.source.h2;
import androidx.media3.exoplayer.source.t0;
import androidx.media3.exoplayer.z4;
import com.google.common.collect.a9;
import com.google.common.collect.l6;
import com.google.common.collect.n3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class n extends e0 implements a5.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f65723j = "DefaultTrackSelector";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f65724k = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final int f65725l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected static final int f65726m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final int f65727n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f65728o = 0.98f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final a9<Integer> f65729p = a9.i(new Comparator() { // from class: androidx.media3.exoplayer.trackselection.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n.w((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f65730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final Context f65731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c0.b f65732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private e f65733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private h f65734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private androidx.media3.common.d f65735i;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends j<b> implements Comparable<b> {
        private final int X;
        private final int Y;
        private final boolean Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f65736e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f65737f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private final String f65738g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final e f65739h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f65740i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f65741j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f65742k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f65743l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f65744m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f65745n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f65746o;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        private final boolean f65747p0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        private final boolean f65748p1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f65749s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f65750t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final int f65751v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final int f65752w;

        public b(int i10, b4 b4Var, int i11, e eVar, int i12, boolean z10, com.google.common.base.k0<androidx.media3.common.w> k0Var, int i13) {
            int i14;
            int iJ;
            int iJ2;
            super(i10, b4Var, i11);
            this.f65739h = eVar;
            int i15 = eVar.f65768z0 ? 24 : 16;
            this.f65744m = eVar.f65764v0 && (i13 & i15) != 0;
            this.f65738g = n.X(this.f65794d.f61750d);
            this.f65740i = a5.I(i12, false);
            int i16 = 0;
            while (true) {
                i14 = Integer.MAX_VALUE;
                if (i16 >= eVar.f60544p.size()) {
                    iJ = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                } else {
                    iJ = n.J(this.f65794d, eVar.f60544p.get(i16), false);
                    if (iJ > 0) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f65742k = i16;
            this.f65741j = iJ;
            this.f65743l = n.N(this.f65794d.f61752f, eVar.f60545q);
            androidx.media3.common.w wVar = this.f65794d;
            int i17 = wVar.f61752f;
            this.f65745n = i17 == 0 || (i17 & 1) != 0;
            this.f65750t = (wVar.f61751e & 1) != 0;
            this.f65748p1 = n.R(wVar);
            androidx.media3.common.w wVar2 = this.f65794d;
            int i18 = wVar2.E;
            this.f65751v = i18;
            this.f65752w = wVar2.F;
            int i19 = wVar2.f61756j;
            this.X = i19;
            this.f65737f = (i19 == -1 || i19 <= eVar.f60547s) && (i18 == -1 || i18 <= eVar.f60546r) && k0Var.apply(wVar2);
            String[] strArrK0 = k1.K0();
            int i20 = 0;
            while (true) {
                if (i20 >= strArrK0.length) {
                    iJ2 = 0;
                    i20 = Integer.MAX_VALUE;
                    break;
                } else {
                    iJ2 = n.J(this.f65794d, strArrK0[i20], false);
                    if (iJ2 > 0) {
                        break;
                    } else {
                        i20++;
                    }
                }
            }
            this.f65746o = i20;
            this.f65749s = iJ2;
            for (int i21 = 0; i21 < eVar.f60548t.size(); i21++) {
                String str = this.f65794d.f61761o;
                if (str != null && str.equals(eVar.f60548t.get(i21))) {
                    i14 = i21;
                    break;
                }
            }
            this.Y = i14;
            this.Z = a5.H(i12) == 128;
            this.f65747p0 = a5.C(i12) == 64;
            this.f65736e = q(i12, z10, i15);
        }

        public static int n(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static l6<b> p(int i10, b4 b4Var, e eVar, int[] iArr, boolean z10, com.google.common.base.k0<androidx.media3.common.w> k0Var, int i11) {
            l6.a aVarS = l6.s();
            for (int i12 = 0; i12 < b4Var.f60459a; i12++) {
                aVarS.a(new b(i10, b4Var, i12, eVar, iArr[i12], z10, k0Var, i11));
            }
            return aVarS.e();
        }

        private int q(int i10, boolean z10, int i11) {
            if (!a5.I(i10, this.f65739h.B0)) {
                return 0;
            }
            if (!this.f65737f && !this.f65739h.f65763u0) {
                return 0;
            }
            e eVar = this.f65739h;
            if (eVar.f60549u.f60562a == 2 && !n.Y(eVar, i10, this.f65794d)) {
                return 0;
            }
            if (a5.I(i10, false) && this.f65737f && this.f65794d.f61756j != -1) {
                e eVar2 = this.f65739h;
                if (!eVar2.C && !eVar2.B && ((eVar2.D0 || !z10) && eVar2.f60549u.f60562a != 2 && (i10 & i11) != 0)) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // androidx.media3.exoplayer.trackselection.n.j
        public int k() {
            return this.f65736e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            a9 a9VarE = (this.f65737f && this.f65740i) ? n.f65729p : n.f65729p.E();
            n3 n3VarJ = n3.n().k(this.f65740i, bVar.f65740i).j(Integer.valueOf(this.f65742k), Integer.valueOf(bVar.f65742k), a9.z().E()).f(this.f65741j, bVar.f65741j).f(this.f65743l, bVar.f65743l).k(this.f65750t, bVar.f65750t).k(this.f65745n, bVar.f65745n).j(Integer.valueOf(this.f65746o), Integer.valueOf(bVar.f65746o), a9.z().E()).f(this.f65749s, bVar.f65749s).k(this.f65737f, bVar.f65737f).j(Integer.valueOf(this.Y), Integer.valueOf(bVar.Y), a9.z().E());
            if (this.f65739h.B) {
                n3VarJ = n3VarJ.j(Integer.valueOf(this.X), Integer.valueOf(bVar.X), n.f65729p.E());
            }
            n3 n3VarJ2 = n3VarJ.k(this.Z, bVar.Z).k(this.f65747p0, bVar.f65747p0).k(this.f65748p1, bVar.f65748p1).j(Integer.valueOf(this.f65751v), Integer.valueOf(bVar.f65751v), a9VarE).j(Integer.valueOf(this.f65752w), Integer.valueOf(bVar.f65752w), a9VarE);
            if (Objects.equals(this.f65738g, bVar.f65738g)) {
                n3VarJ2 = n3VarJ2.j(Integer.valueOf(this.X), Integer.valueOf(bVar.X), a9VarE);
            }
            return n3VarJ2.m();
        }

        @Override // androidx.media3.exoplayer.trackselection.n.j
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public boolean l(b bVar) {
            int i10;
            String str;
            int i11;
            if (!this.f65739h.f65766x0 && ((i11 = this.f65794d.E) == -1 || i11 != bVar.f65794d.E)) {
                return false;
            }
            if (!this.f65744m && ((str = this.f65794d.f61761o) == null || !TextUtils.equals(str, bVar.f65794d.f61761o))) {
                return false;
            }
            e eVar = this.f65739h;
            if (eVar.f65765w0 || ((i10 = this.f65794d.F) != -1 && i10 == bVar.f65794d.F)) {
                return eVar.f65767y0 || (this.Z == bVar.Z && this.f65747p0 == bVar.f65747p0);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends j<c> implements Comparable<c> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f65753e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f65754f;

        public c(int i10, b4 b4Var, int i11, e eVar, int i12) {
            super(i10, b4Var, i11);
            this.f65753e = a5.I(i12, eVar.B0) ? 1 : 0;
            this.f65754f = this.f65794d.g();
        }

        public static int n(List<c> list, List<c> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static l6<c> p(int i10, b4 b4Var, e eVar, int[] iArr) {
            l6.a aVarS = l6.s();
            for (int i11 = 0; i11 < b4Var.f60459a; i11++) {
                aVarS.a(new c(i10, b4Var, i11, eVar, iArr[i11]));
            }
            return aVarS.e();
        }

        @Override // androidx.media3.exoplayer.trackselection.n.j
        public int k() {
            return this.f65753e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return Integer.compare(this.f65754f, cVar.f65754f);
        }

        @Override // androidx.media3.exoplayer.trackselection.n.j
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public boolean l(c cVar) {
            return false;
        }
    }

    private static final class d implements Comparable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f65755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f65756b;

        public d(androidx.media3.common.w wVar, int i10) {
            this.f65755a = (wVar.f61751e & 1) != 0;
            this.f65756b = a5.I(i10, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return n3.n().k(this.f65756b, dVar.f65756b).k(this.f65755a, dVar.f65755a).m();
        }
    }

    public static final class e extends e4 {
        public static final e H0;

        @Deprecated
        public static final e I0;
        private static final String J0;
        private static final String K0;
        private static final String L0;
        private static final String M0;
        private static final String N0;
        private static final String O0;
        private static final String P0;
        private static final String Q0;
        private static final String R0;
        private static final String S0;
        private static final String T0;
        private static final String U0;
        private static final String V0;
        private static final String W0;
        private static final String X0;
        private static final String Y0;
        private static final String Z0;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        private static final String f65757a1;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        private static final String f65758b1;
        public final boolean A0;
        public final boolean B0;
        public final boolean C0;
        public final boolean D0;
        public final boolean E0;
        private final SparseArray<Map<h2, g>> F0;
        private final SparseBooleanArray G0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f65759q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f65760r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f65761s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f65762t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f65763u0;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public final boolean f65764v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final boolean f65765w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final boolean f65766x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final boolean f65767y0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public final boolean f65768z0;

        static {
            e eVarG = new a().G();
            H0 = eVarG;
            I0 = eVarG;
            J0 = k1.c1(1000);
            K0 = k1.c1(1001);
            L0 = k1.c1(1002);
            M0 = k1.c1(1003);
            N0 = k1.c1(1004);
            O0 = k1.c1(1005);
            P0 = k1.c1(1006);
            Q0 = k1.c1(1007);
            R0 = k1.c1(1008);
            S0 = k1.c1(1009);
            T0 = k1.c1(1010);
            U0 = k1.c1(1011);
            V0 = k1.c1(1012);
            W0 = k1.c1(1013);
            X0 = k1.c1(1014);
            Y0 = k1.c1(1015);
            Z0 = k1.c1(1016);
            f65757a1 = k1.c1(1017);
            f65758b1 = k1.c1(1018);
        }

        private static boolean O(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean P(SparseArray<Map<h2, g>> sparseArray, SparseArray<Map<h2, g>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (iIndexOfKey < 0 || !Q(sparseArray.valueAt(i10), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean Q(Map<h2, g> map, Map<h2, g> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<h2, g> entry : map.entrySet()) {
                h2 key = entry.getKey();
                if (!map2.containsKey(key) || !Objects.equals(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        public static e S(Bundle bundle) {
            return new a(bundle).G();
        }

        @Deprecated
        public static e T(Context context) {
            return H0;
        }

        private static int[] U(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
                iArr[i10] = sparseBooleanArray.keyAt(i10);
            }
            return iArr;
        }

        private static void Y(Bundle bundle, SparseArray<Map<h2, g>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                int iKeyAt = sparseArray.keyAt(i10);
                for (Map.Entry<h2, g> entry : sparseArray.valueAt(i10).entrySet()) {
                    g value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(T0, com.google.common.primitives.l.E(arrayList));
                bundle.putParcelableArrayList(U0, androidx.media3.common.util.i.i(arrayList2, new com.google.common.base.t() { // from class: androidx.media3.exoplayer.trackselection.o
                    @Override // com.google.common.base.t
                    public final Object apply(Object obj) {
                        return ((h2) obj).g();
                    }
                }));
                bundle.putSparseParcelableArray(V0, androidx.media3.common.util.i.k(sparseArray2, new com.google.common.base.t() { // from class: androidx.media3.exoplayer.trackselection.p
                    @Override // com.google.common.base.t
                    public final Object apply(Object obj) {
                        return ((n.g) obj).c();
                    }
                }));
            }
        }

        @Override // androidx.media3.common.e4
        public Bundle L() {
            Bundle bundleL = super.L();
            bundleL.putBoolean(J0, this.f65759q0);
            bundleL.putBoolean(K0, this.f65760r0);
            bundleL.putBoolean(L0, this.f65761s0);
            bundleL.putBoolean(X0, this.f65762t0);
            bundleL.putBoolean(M0, this.f65763u0);
            bundleL.putBoolean(N0, this.f65764v0);
            bundleL.putBoolean(O0, this.f65765w0);
            bundleL.putBoolean(P0, this.f65766x0);
            bundleL.putBoolean(Y0, this.f65767y0);
            bundleL.putBoolean(f65758b1, this.f65768z0);
            bundleL.putBoolean(Z0, this.A0);
            bundleL.putBoolean(Q0, this.B0);
            bundleL.putBoolean(R0, this.C0);
            bundleL.putBoolean(S0, this.D0);
            bundleL.putBoolean(f65757a1, this.E0);
            Y(bundleL, this.F0);
            bundleL.putIntArray(W0, U(this.G0));
            return bundleL;
        }

        @Override // androidx.media3.common.e4
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public a I() {
            return new a();
        }

        public boolean V(int i10) {
            return this.G0.get(i10);
        }

        @p0
        @Deprecated
        public g W(int i10, h2 h2Var) {
            Map<h2, g> map = this.F0.get(i10);
            if (map != null) {
                return map.get(h2Var);
            }
            return null;
        }

        @Deprecated
        public boolean X(int i10, h2 h2Var) {
            Map<h2, g> map = this.F0.get(i10);
            return map != null && map.containsKey(h2Var);
        }

        @Override // androidx.media3.common.e4
        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (super.equals(eVar) && this.f65759q0 == eVar.f65759q0 && this.f65760r0 == eVar.f65760r0 && this.f65761s0 == eVar.f65761s0 && this.f65762t0 == eVar.f65762t0 && this.f65763u0 == eVar.f65763u0 && this.f65764v0 == eVar.f65764v0 && this.f65765w0 == eVar.f65765w0 && this.f65766x0 == eVar.f65766x0 && this.f65767y0 == eVar.f65767y0 && this.f65768z0 == eVar.f65768z0 && this.A0 == eVar.A0 && this.B0 == eVar.B0 && this.C0 == eVar.C0 && this.D0 == eVar.D0 && this.E0 == eVar.E0 && O(this.G0, eVar.G0) && P(this.F0, eVar.F0)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.common.e4
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f65759q0 ? 1 : 0)) * 31) + (this.f65760r0 ? 1 : 0)) * 31) + (this.f65761s0 ? 1 : 0)) * 31) + (this.f65762t0 ? 1 : 0)) * 31) + (this.f65763u0 ? 1 : 0)) * 31) + (this.f65764v0 ? 1 : 0)) * 31) + (this.f65765w0 ? 1 : 0)) * 31) + (this.f65766x0 ? 1 : 0)) * 31) + (this.f65767y0 ? 1 : 0)) * 31) + (this.f65768z0 ? 1 : 0)) * 31) + (this.A0 ? 1 : 0)) * 31) + (this.B0 ? 1 : 0)) * 31) + (this.C0 ? 1 : 0)) * 31) + (this.D0 ? 1 : 0)) * 31) + (this.E0 ? 1 : 0);
        }

        public static final class a extends e4.c {
            private boolean F;
            private boolean G;
            private boolean H;
            private boolean I;
            private boolean J;
            private boolean K;
            private boolean L;
            private boolean M;
            private boolean N;
            private boolean O;
            private boolean P;
            private boolean Q;
            private boolean R;
            private boolean S;
            private boolean T;
            private final SparseArray<Map<h2, g>> U;
            private final SparseBooleanArray V;

            private static SparseArray<Map<h2, g>> b1(SparseArray<Map<h2, g>> sparseArray) {
                SparseArray<Map<h2, g>> sparseArray2 = new SparseArray<>();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            private void c1() {
                this.F = true;
                this.G = false;
                this.H = true;
                this.I = false;
                this.J = true;
                this.K = false;
                this.L = false;
                this.M = false;
                this.N = false;
                this.O = true;
                this.P = true;
                this.Q = true;
                this.R = false;
                this.S = true;
                this.T = false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private void c2(Bundle bundle) {
                int[] intArray = bundle.getIntArray(e.T0);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(e.U0);
                l6 l6VarF = parcelableArrayList == null ? l6.F() : androidx.media3.common.util.i.d(new com.google.common.base.t() { // from class: androidx.media3.exoplayer.trackselection.q
                    @Override // com.google.common.base.t
                    public final Object apply(Object obj) {
                        return h2.b((Bundle) obj);
                    }
                }, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(e.V0);
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : androidx.media3.common.util.i.e(new com.google.common.base.t() { // from class: androidx.media3.exoplayer.trackselection.r
                    @Override // com.google.common.base.t
                    public final Object apply(Object obj) {
                        return n.g.b((Bundle) obj);
                    }
                }, sparseParcelableArray);
                if (intArray == null || intArray.length != l6VarF.size()) {
                    return;
                }
                for (int i10 = 0; i10 < intArray.length; i10++) {
                    b2(intArray[i10], (h2) l6VarF.get(i10), (g) sparseArray.get(i10));
                }
            }

            private SparseBooleanArray d1(@p0 int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i10 : iArr) {
                    sparseBooleanArray.append(i10, true);
                }
                return sparseBooleanArray;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: A1, reason: merged with bridge method [inline-methods] */
            public a W(int i10) {
                super.W(i10);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
            public a X(int i10) {
                super.X(i10);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
            public a Y(int i10) {
                super.Y(i10);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
            public a Z(int i10, int i11) {
                super.Z(i10, i11);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] */
            public a a0() {
                super.a0();
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: F1, reason: merged with bridge method [inline-methods] */
            public a b0(int i10) {
                super.b0(i10);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: G1, reason: merged with bridge method [inline-methods] */
            public a c0(int i10) {
                super.c0(i10);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: H1, reason: merged with bridge method [inline-methods] */
            public a d0(int i10, int i11) {
                super.d0(i10, i11);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: I1, reason: merged with bridge method [inline-methods] */
            public a e0(c4 c4Var) {
                super.e0(c4Var);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: J1, reason: merged with bridge method [inline-methods] */
            public a f0(@p0 String str) {
                super.f0(str);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: K1, reason: merged with bridge method [inline-methods] */
            public a g0(String... strArr) {
                super.g0(strArr);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: L1, reason: merged with bridge method [inline-methods] */
            public a h0(@p0 String str) {
                super.h0(str);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: M1, reason: merged with bridge method [inline-methods] */
            public a i0(String... strArr) {
                super.i0(strArr);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: N1, reason: merged with bridge method [inline-methods] */
            public a j0(int i10) {
                super.j0(i10);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: O1, reason: merged with bridge method [inline-methods] */
            public a k0(@p0 String str) {
                super.k0(str);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: P1, reason: merged with bridge method [inline-methods] */
            public a l0() {
                super.l0();
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            @Deprecated
            /* JADX INFO: renamed from: Q1, reason: merged with bridge method [inline-methods] */
            public a m0(Context context) {
                super.m0(context);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
            public a F(c4 c4Var) {
                super.F(c4Var);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: R1, reason: merged with bridge method [inline-methods] */
            public a n0(String... strArr) {
                super.n0(strArr);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
            public e G() {
                return new e(this);
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: S1, reason: merged with bridge method [inline-methods] */
            public a o0(int i10) {
                super.o0(i10);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
            public a H(b4 b4Var) {
                super.H(b4Var);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: T1, reason: merged with bridge method [inline-methods] */
            public a p0(@p0 String str) {
                super.p0(str);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
            public a I() {
                super.I();
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: U1, reason: merged with bridge method [inline-methods] */
            public a q0(String... strArr) {
                super.q0(strArr);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
            public a J(int i10) {
                super.J(i10);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: V1, reason: merged with bridge method [inline-methods] */
            public a r0(@p0 String str) {
                super.r0(str);
                return this;
            }

            @z7.a
            @Deprecated
            public a W0(int i10, h2 h2Var) {
                Map<h2, g> map = this.U.get(i10);
                if (map != null && map.containsKey(h2Var)) {
                    map.remove(h2Var);
                    if (map.isEmpty()) {
                        this.U.remove(i10);
                    }
                }
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: W1, reason: merged with bridge method [inline-methods] */
            public a s0(String... strArr) {
                super.s0(strArr);
                return this;
            }

            @z7.a
            @Deprecated
            public a X0() {
                if (this.U.size() == 0) {
                    return this;
                }
                this.U.clear();
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: X1, reason: merged with bridge method [inline-methods] */
            public a t0(int i10) {
                super.t0(i10);
                return this;
            }

            @z7.a
            @Deprecated
            public a Y0(int i10) {
                Map<h2, g> map = this.U.get(i10);
                if (map != null && !map.isEmpty()) {
                    this.U.remove(i10);
                }
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
            public a u0(boolean z10) {
                super.u0(z10);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
            public a K() {
                super.K();
                return this;
            }

            @z7.a
            public a Z1(int i10, boolean z10) {
                if (this.V.get(i10) == z10) {
                    return this;
                }
                if (z10) {
                    this.V.put(i10, true);
                    return this;
                }
                this.V.delete(i10);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
            public a L() {
                super.L();
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
            public a v0(boolean z10) {
                super.v0(z10);
                return this;
            }

            @z7.a
            @Deprecated
            public a b2(int i10, h2 h2Var, @p0 g gVar) {
                Map<h2, g> map = this.U.get(i10);
                if (map == null) {
                    map = new HashMap<>();
                    this.U.put(i10, map);
                }
                if (map.containsKey(h2Var) && Objects.equals(map.get(h2Var), gVar)) {
                    return this;
                }
                map.put(h2Var, gVar);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
            public a w0(int i10, boolean z10) {
                super.w0(i10, z10);
                return this;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
            public a P(e4 e4Var) {
                super.P(e4Var);
                return this;
            }

            @z7.a
            public a e2(boolean z10) {
                this.R = z10;
                return this;
            }

            @z7.a
            public a f1(boolean z10) {
                this.M = z10;
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: f2, reason: merged with bridge method [inline-methods] */
            public a x0(int i10, int i11, boolean z10) {
                super.x0(i10, i11, z10);
                return this;
            }

            @z7.a
            public a g1(boolean z10) {
                this.N = z10;
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            @Deprecated
            /* JADX INFO: renamed from: g2, reason: merged with bridge method [inline-methods] */
            public a y0(Context context, boolean z10) {
                super.y0(context, z10);
                return this;
            }

            @z7.a
            public a h1(boolean z10) {
                this.K = z10;
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: h2, reason: merged with bridge method [inline-methods] */
            public a z0(boolean z10) {
                super.z0(z10);
                return this;
            }

            @z7.a
            public a i1(boolean z10) {
                this.L = z10;
                return this;
            }

            @z7.a
            public a j1(boolean z10) {
                this.O = z10;
                return this;
            }

            @z7.a
            public a k1(boolean z10) {
                this.T = z10;
                return this;
            }

            @z7.a
            public a l1(boolean z10) {
                this.S = z10;
                return this;
            }

            @z7.a
            public a m1(boolean z10) {
                this.I = z10;
                return this;
            }

            @z7.a
            public a n1(boolean z10) {
                this.G = z10;
                return this;
            }

            @z7.a
            public a o1(boolean z10) {
                this.H = z10;
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
            public a Q(e4.b bVar) {
                super.Q(bVar);
                return this;
            }

            @z7.a
            public a q1(boolean z10) {
                this.P = z10;
                return this;
            }

            @z7.a
            @Deprecated
            public a r1(int i10) {
                return U(i10);
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            @Deprecated
            /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
            public a R(Set<Integer> set) {
                super.R(set);
                return this;
            }

            @z7.a
            public a t1(boolean z10) {
                this.J = z10;
                return this;
            }

            @z7.a
            public a u1(boolean z10) {
                this.Q = z10;
                return this;
            }

            @z7.a
            public a v1(boolean z10) {
                this.F = z10;
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
            public a S(boolean z10) {
                super.S(z10);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
            public a T(boolean z10) {
                super.T(z10);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
            public a U(int i10) {
                super.U(i10);
                return this;
            }

            @Override // androidx.media3.common.e4.c
            @z7.a
            /* JADX INFO: renamed from: z1, reason: merged with bridge method [inline-methods] */
            public a V(int i10) {
                super.V(i10);
                return this;
            }

            public a() {
                this.U = new SparseArray<>();
                this.V = new SparseBooleanArray();
                c1();
            }

            @z7.m(replacement = "this()")
            @Deprecated
            public a(Context context) {
                this();
            }

            private a(e eVar) {
                super(eVar);
                this.F = eVar.f65759q0;
                this.G = eVar.f65760r0;
                this.H = eVar.f65761s0;
                this.I = eVar.f65762t0;
                this.J = eVar.f65763u0;
                this.K = eVar.f65764v0;
                this.L = eVar.f65765w0;
                this.M = eVar.f65766x0;
                this.N = eVar.f65767y0;
                this.O = eVar.f65768z0;
                this.P = eVar.A0;
                this.Q = eVar.B0;
                this.R = eVar.C0;
                this.S = eVar.D0;
                this.T = eVar.E0;
                this.U = b1(eVar.F0);
                this.V = eVar.G0.clone();
            }

            private a(Bundle bundle) {
                super(bundle);
                c1();
                e eVar = e.H0;
                v1(bundle.getBoolean(e.J0, eVar.f65759q0));
                n1(bundle.getBoolean(e.K0, eVar.f65760r0));
                o1(bundle.getBoolean(e.L0, eVar.f65761s0));
                m1(bundle.getBoolean(e.X0, eVar.f65762t0));
                t1(bundle.getBoolean(e.M0, eVar.f65763u0));
                h1(bundle.getBoolean(e.N0, eVar.f65764v0));
                i1(bundle.getBoolean(e.O0, eVar.f65765w0));
                f1(bundle.getBoolean(e.P0, eVar.f65766x0));
                g1(bundle.getBoolean(e.Y0, eVar.f65767y0));
                j1(bundle.getBoolean(e.f65758b1, eVar.f65768z0));
                q1(bundle.getBoolean(e.Z0, eVar.A0));
                u1(bundle.getBoolean(e.Q0, eVar.B0));
                e2(bundle.getBoolean(e.R0, eVar.C0));
                l1(bundle.getBoolean(e.S0, eVar.D0));
                k1(bundle.getBoolean(e.f65757a1, eVar.E0));
                this.U = new SparseArray<>();
                c2(bundle);
                this.V = d1(bundle.getIntArray(e.W0));
            }
        }

        private e(a aVar) {
            super(aVar);
            this.f65759q0 = aVar.F;
            this.f65760r0 = aVar.G;
            this.f65761s0 = aVar.H;
            this.f65762t0 = aVar.I;
            this.f65763u0 = aVar.J;
            this.f65764v0 = aVar.K;
            this.f65765w0 = aVar.L;
            this.f65766x0 = aVar.M;
            this.f65767y0 = aVar.N;
            this.f65768z0 = aVar.O;
            this.A0 = aVar.P;
            this.B0 = aVar.Q;
            this.C0 = aVar.R;
            this.D0 = aVar.S;
            this.E0 = aVar.T;
            this.F0 = aVar.U;
            this.G0 = aVar.V;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f65769e = k1.c1(0);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f65770f = k1.c1(1);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f65771g = k1.c1(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f65773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f65774c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f65775d;

        public g(int i10, int... iArr) {
            this(i10, iArr, 0);
        }

        @b1
        public static g b(Bundle bundle) {
            int i10 = bundle.getInt(f65769e, -1);
            int[] intArray = bundle.getIntArray(f65770f);
            int i11 = bundle.getInt(f65771g, -1);
            androidx.media3.common.util.a.a(i10 >= 0 && i11 >= 0);
            androidx.media3.common.util.a.g(intArray);
            return new g(i10, intArray, i11);
        }

        public boolean a(int i10) {
            for (int i11 : this.f65773b) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        @b1
        public Bundle c() {
            Bundle bundle = new Bundle();
            bundle.putInt(f65769e, this.f65772a);
            bundle.putIntArray(f65770f, this.f65773b);
            bundle.putInt(f65771g, this.f65775d);
            return bundle;
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                if (this.f65772a == gVar.f65772a && Arrays.equals(this.f65773b, gVar.f65773b) && this.f65775d == gVar.f65775d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f65772a * 31) + Arrays.hashCode(this.f65773b)) * 31) + this.f65775d;
        }

        @b1
        public g(int i10, int[] iArr, int i11) {
            this.f65772a = i10;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f65773b = iArrCopyOf;
            this.f65774c = iArr.length;
            this.f65775d = i11;
            Arrays.sort(iArrCopyOf);
        }
    }

    @w0(32)
    private static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private final Spatializer f65776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f65777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private final Handler f65778c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private final Spatializer$OnSpatializerStateChangedListener f65779d;

        class a implements Spatializer$OnSpatializerStateChangedListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f65780a;

            a(n nVar) {
                this.f65780a = nVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f65780a.V();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f65780a.V();
            }
        }

        public h(@p0 Context context, n nVar) {
            AudioManager audioManagerC = context == null ? null : androidx.media3.common.audio.d.c(context);
            if (audioManagerC == null || k1.p1((Context) androidx.media3.common.util.a.g(context))) {
                this.f65776a = null;
                this.f65777b = false;
                this.f65778c = null;
                this.f65779d = null;
                return;
            }
            Spatializer spatializer = audioManagerC.getSpatializer();
            this.f65776a = spatializer;
            this.f65777b = spatializer.getImmersiveAudioLevel() != 0;
            a aVar = new a(nVar);
            this.f65779d = aVar;
            Handler handler = new Handler((Looper) androidx.media3.common.util.a.k(Looper.myLooper()));
            this.f65778c = handler;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new androidx.emoji2.text.a(handler), aVar);
        }

        public boolean a(androidx.media3.common.d dVar, androidx.media3.common.w wVar) {
            int i10;
            if (Objects.equals(wVar.f61761o, "audio/eac3-joc")) {
                i10 = wVar.E;
                if (i10 == 16) {
                    i10 = 12;
                }
            } else if (Objects.equals(wVar.f61761o, s0.f61324m0)) {
                i10 = wVar.E;
                if (i10 == -1) {
                    i10 = 6;
                    int i11 = 0 & 6;
                }
            } else if (Objects.equals(wVar.f61761o, "audio/ac4")) {
                i10 = wVar.E;
                if (i10 == 18 || i10 == 21) {
                    i10 = 24;
                }
            } else {
                i10 = wVar.E;
            }
            int iA0 = k1.a0(i10);
            if (iA0 == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iA0);
            int i12 = wVar.F;
            if (i12 != -1) {
                channelMask.setSampleRate(i12);
            }
            return v.a(androidx.media3.common.util.a.g(this.f65776a)).canBeSpatialized(dVar.b().f60484a, channelMask.build());
        }

        public boolean b() {
            return v.a(androidx.media3.common.util.a.g(this.f65776a)).isAvailable();
        }

        public boolean c() {
            return v.a(androidx.media3.common.util.a.g(this.f65776a)).isEnabled();
        }

        public boolean d() {
            return this.f65777b;
        }

        public void e() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
            Spatializer spatializer = this.f65776a;
            if (spatializer != null && (spatializer$OnSpatializerStateChangedListener = this.f65779d) != null && this.f65778c != null) {
                spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
                this.f65778c.removeCallbacksAndMessages(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class i extends j<i> implements Comparable<i> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f65782e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f65783f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f65784g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f65785h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f65786i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f65787j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f65788k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f65789l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final boolean f65790m;

        public i(int i10, b4 b4Var, int i11, e eVar, int i12, @p0 String str, @p0 String str2) {
            int iJ;
            super(i10, b4Var, i11);
            int i13 = 0;
            this.f65783f = a5.I(i12, false);
            int i14 = this.f65794d.f61751e & (~eVar.f60553y);
            this.f65784g = (i14 & 1) != 0;
            this.f65785h = (i14 & 2) != 0;
            l6<String> l6VarG = str2 != null ? l6.G(str2) : eVar.f60550v.isEmpty() ? l6.G("") : eVar.f60550v;
            int i15 = 0;
            while (true) {
                if (i15 >= l6VarG.size()) {
                    i15 = Integer.MAX_VALUE;
                    iJ = 0;
                    break;
                } else {
                    iJ = n.J(this.f65794d, l6VarG.get(i15), eVar.f60554z);
                    if (iJ > 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f65786i = i15;
            this.f65787j = iJ;
            int iN = n.N(this.f65794d.f61752f, str2 != null ? 1088 : eVar.f60551w);
            this.f65788k = iN;
            this.f65790m = (1088 & this.f65794d.f61752f) != 0;
            int iJ2 = n.J(this.f65794d, str, n.X(str) == null);
            this.f65789l = iJ2;
            boolean z10 = iJ > 0 || (eVar.f60550v.isEmpty() && iN > 0) || this.f65784g || (this.f65785h && iJ2 > 0);
            if (a5.I(i12, eVar.B0) && z10) {
                i13 = 1;
            }
            this.f65782e = i13;
        }

        public static int n(List<i> list, List<i> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static l6<i> p(int i10, b4 b4Var, e eVar, int[] iArr, @p0 String str, @p0 String str2) {
            l6.a aVarS = l6.s();
            for (int i11 = 0; i11 < b4Var.f60459a; i11++) {
                aVarS.a(new i(i10, b4Var, i11, eVar, iArr[i11], str, str2));
            }
            return aVarS.e();
        }

        @Override // androidx.media3.exoplayer.trackselection.n.j
        public int k() {
            return this.f65782e;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public int compareTo(i iVar) {
            n3 n3VarF = n3.n().k(this.f65783f, iVar.f65783f).j(Integer.valueOf(this.f65786i), Integer.valueOf(iVar.f65786i), a9.z().E()).f(this.f65787j, iVar.f65787j).f(this.f65788k, iVar.f65788k).k(this.f65784g, iVar.f65784g).j(Boolean.valueOf(this.f65785h), Boolean.valueOf(iVar.f65785h), this.f65787j == 0 ? a9.z() : a9.z().E()).f(this.f65789l, iVar.f65789l);
            if (this.f65788k == 0) {
                n3VarF = n3VarF.l(this.f65790m, iVar.f65790m);
            }
            return n3VarF.m();
        }

        @Override // androidx.media3.exoplayer.trackselection.n.j
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public boolean l(i iVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class j<T extends j<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b4 f65792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f65793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final androidx.media3.common.w f65794d;

        public interface a<T extends j<T>> {
            List<T> a(int i10, b4 b4Var, int[] iArr);
        }

        public j(int i10, b4 b4Var, int i11) {
            this.f65791a = i10;
            this.f65792b = b4Var;
            this.f65793c = i11;
            this.f65794d = b4Var.c(i11);
        }

        public abstract int k();

        public abstract boolean l(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class k extends j<k> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        private static final float f65795p0 = 10.0f;
        private final boolean X;
        private final boolean Y;
        private final int Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f65796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final e f65797f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f65798g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f65799h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f65800i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f65801j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f65802k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f65803l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f65804m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f65805n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f65806o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final boolean f65807s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f65808t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final boolean f65809v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final int f65810w;

        /* JADX WARN: Code duplicated, block: B:31:0x0058  */
        /* JADX WARN: Code duplicated, block: B:51:0x008c  */
        public k(int i10, b4 b4Var, int i11, e eVar, int i12, @p0 String str, int i13, boolean z10) {
            boolean z11;
            boolean z12;
            int i14;
            int iJ;
            androidx.media3.common.w wVar;
            int i15;
            int i16;
            int i17;
            androidx.media3.common.w wVar2;
            int i18;
            int i19;
            int i20;
            super(i10, b4Var, i11);
            this.f65797f = eVar;
            int i21 = eVar.f65761s0 ? 24 : 16;
            this.f65809v = eVar.f65760r0 && (i13 & i21) != 0;
            if (!z10 || (((i18 = (wVar2 = this.f65794d).f61768v) != -1 && i18 > eVar.f60529a) || ((i19 = wVar2.f61769w) != -1 && i19 > eVar.f60530b))) {
                z11 = false;
            } else {
                float f10 = wVar2.f61770x;
                if ((f10 == -1.0f || f10 <= eVar.f60531c) && ((i20 = wVar2.f61756j) == -1 || i20 <= eVar.f60532d)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            this.f65796e = z11;
            if (!z10 || (((i15 = (wVar = this.f65794d).f61768v) != -1 && i15 < eVar.f60533e) || ((i16 = wVar.f61769w) != -1 && i16 < eVar.f60534f))) {
                z12 = false;
            } else {
                float f11 = wVar.f61770x;
                if ((f11 == -1.0f || f11 >= eVar.f60535g) && ((i17 = wVar.f61756j) == -1 || i17 >= eVar.f60536h)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            this.f65798g = z12;
            this.f65799h = a5.I(i12, false);
            androidx.media3.common.w wVar3 = this.f65794d;
            float f12 = wVar3.f61770x;
            this.f65800i = f12 != -1.0f && f12 >= 10.0f;
            this.f65801j = wVar3.f61756j;
            this.f65802k = wVar3.g();
            int i22 = 0;
            while (true) {
                i14 = Integer.MAX_VALUE;
                if (i22 >= eVar.f60542n.size()) {
                    i22 = Integer.MAX_VALUE;
                    iJ = 0;
                    break;
                } else {
                    iJ = n.J(this.f65794d, eVar.f60542n.get(i22), false);
                    if (iJ > 0) {
                        break;
                    } else {
                        i22++;
                    }
                }
            }
            this.f65804m = i22;
            this.f65805n = iJ;
            this.f65806o = n.N(this.f65794d.f61752f, eVar.f60543o);
            int i23 = this.f65794d.f61752f;
            this.f65807s = i23 == 0 || (i23 & 1) != 0;
            this.f65808t = n.J(this.f65794d, str, n.X(str) == null);
            for (int i24 = 0; i24 < eVar.f60541m.size(); i24++) {
                String str2 = this.f65794d.f61761o;
                if (str2 != null && str2.equals(eVar.f60541m.get(i24))) {
                    i14 = i24;
                    break;
                }
            }
            this.f65803l = i14;
            this.X = a5.H(i12) == 128;
            this.Y = a5.C(i12) == 64;
            this.Z = n.O(this.f65794d.f61761o);
            this.f65810w = t(i12, i21);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int p(k kVar, k kVar2) {
            n3 n3VarK = n3.n().k(kVar.f65799h, kVar2.f65799h).j(Integer.valueOf(kVar.f65804m), Integer.valueOf(kVar2.f65804m), a9.z().E()).f(kVar.f65805n, kVar2.f65805n).f(kVar.f65806o, kVar2.f65806o).k(kVar.f65807s, kVar2.f65807s).f(kVar.f65808t, kVar2.f65808t).k(kVar.f65800i, kVar2.f65800i).k(kVar.f65796e, kVar2.f65796e).k(kVar.f65798g, kVar2.f65798g).j(Integer.valueOf(kVar.f65803l), Integer.valueOf(kVar2.f65803l), a9.z().E()).k(kVar.X, kVar2.X).k(kVar.Y, kVar2.Y);
            if (kVar.X && kVar.Y) {
                n3VarK = n3VarK.f(kVar.Z, kVar2.Z);
            }
            return n3VarK.m();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int q(k kVar, k kVar2) {
            a9 a9VarE = (kVar.f65796e && kVar.f65799h) ? n.f65729p : n.f65729p.E();
            n3 n3VarN = n3.n();
            if (kVar.f65797f.B) {
                n3VarN = n3VarN.j(Integer.valueOf(kVar.f65801j), Integer.valueOf(kVar2.f65801j), n.f65729p.E());
            }
            return n3VarN.j(Integer.valueOf(kVar.f65802k), Integer.valueOf(kVar2.f65802k), a9VarE).j(Integer.valueOf(kVar.f65801j), Integer.valueOf(kVar2.f65801j), a9VarE).m();
        }

        public static int r(List<k> list, List<k> list2) {
            return n3.n().j((k) Collections.max(list, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.a0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.k.p((n.k) obj, (n.k) obj2);
                }
            }), (k) Collections.max(list2, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.a0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.k.p((n.k) obj, (n.k) obj2);
                }
            }), new Comparator() { // from class: androidx.media3.exoplayer.trackselection.a0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.k.p((n.k) obj, (n.k) obj2);
                }
            }).f(list.size(), list2.size()).j((k) Collections.max(list, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.b0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.k.q((n.k) obj, (n.k) obj2);
                }
            }), (k) Collections.max(list2, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.b0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.k.q((n.k) obj, (n.k) obj2);
                }
            }), new Comparator() { // from class: androidx.media3.exoplayer.trackselection.b0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.k.q((n.k) obj, (n.k) obj2);
                }
            }).m();
        }

        public static l6<k> s(int i10, b4 b4Var, e eVar, int[] iArr, @p0 String str, int i11, @p0 Point point) {
            int iK = n.K(b4Var, point != null ? point.x : eVar.f60537i, point != null ? point.y : eVar.f60538j, eVar.f60540l);
            l6.a aVarS = l6.s();
            for (int i12 = 0; i12 < b4Var.f60459a; i12++) {
                int iG = b4Var.c(i12).g();
                aVarS.a(new k(i10, b4Var, i12, eVar, iArr[i12], str, i11, iK == Integer.MAX_VALUE || (iG != -1 && iG <= iK)));
            }
            return aVarS.e();
        }

        private int t(int i10, int i11) {
            if ((this.f65794d.f61752f & 16384) != 0 || !a5.I(i10, this.f65797f.B0)) {
                return 0;
            }
            if (!this.f65796e && !this.f65797f.f65759q0) {
                return 0;
            }
            if (a5.I(i10, false) && this.f65798g && this.f65796e && this.f65794d.f61756j != -1) {
                e eVar = this.f65797f;
                if (!eVar.C && !eVar.B && (i10 & i11) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // androidx.media3.exoplayer.trackselection.n.j
        public int k() {
            return this.f65810w;
        }

        @Override // androidx.media3.exoplayer.trackselection.n.j
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public boolean l(k kVar) {
            if (this.f65809v || Objects.equals(this.f65794d.f61761o, kVar.f65794d.f61761o)) {
                if (this.f65797f.f65762t0) {
                    return true;
                }
                if (this.X == kVar.X && this.Y == kVar.Y) {
                    return true;
                }
            }
            return false;
        }
    }

    public n(Context context) {
        this(context, new androidx.media3.exoplayer.trackselection.a.b());
    }

    private static void F(e0.a aVar, e eVar, c0.a[] aVarArr) {
        int iD = aVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            h2 h2VarH = aVar.h(i10);
            if (eVar.X(i10, h2VarH)) {
                g gVarW = eVar.W(i10, h2VarH);
                aVarArr[i10] = (gVarW == null || gVarW.f65773b.length == 0) ? null : new c0.a(h2VarH.c(gVarW.f65772a), gVarW.f65773b, gVarW.f65775d);
            }
        }
    }

    private static void G(e0.a aVar, e4 e4Var, c0.a[] aVarArr) {
        int iD = aVar.d();
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < iD; i10++) {
            I(aVar.h(i10), e4Var, map);
        }
        I(aVar.k(), e4Var, map);
        for (int i11 = 0; i11 < iD; i11++) {
            c4 c4Var = (c4) map.get(Integer.valueOf(aVar.g(i11)));
            if (c4Var != null) {
                aVarArr[i11] = (c4Var.f60471b.isEmpty() || aVar.h(i11).e(c4Var.f60470a) == -1) ? null : new c0.a(c4Var.f60470a, com.google.common.primitives.l.E(c4Var.f60471b));
            }
        }
    }

    private static void I(h2 h2Var, e4 e4Var, Map<Integer, c4> map) {
        c4 c4Var;
        for (int i10 = 0; i10 < h2Var.f65076a; i10++) {
            c4 c4Var2 = e4Var.D.get(h2Var.c(i10));
            if (c4Var2 != null && ((c4Var = map.get(Integer.valueOf(c4Var2.b()))) == null || (c4Var.f60471b.isEmpty() && !c4Var2.f60471b.isEmpty()))) {
                map.put(Integer.valueOf(c4Var2.b()), c4Var2);
            }
        }
    }

    protected static int J(androidx.media3.common.w wVar, @p0 String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(wVar.f61750d)) {
            return 4;
        }
        String strX = X(str);
        String strX2 = X(wVar.f61750d);
        if (strX2 == null || strX == null) {
            return (z10 && strX2 == null) ? 1 : 0;
        }
        if (strX2.startsWith(strX) || strX.startsWith(strX2)) {
            return 3;
        }
        return k1.m2(strX2, "-")[0].equals(k1.m2(strX, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int K(b4 b4Var, int i10, int i11, boolean z10) {
        int i12;
        int i13 = Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            for (int i14 = 0; i14 < b4Var.f60459a; i14++) {
                androidx.media3.common.w wVarC = b4Var.c(i14);
                int i15 = wVarC.f61768v;
                if (i15 > 0 && (i12 = wVarC.f61769w) > 0) {
                    Point pointE = j0.e(z10, i10, i11, i15, i12);
                    int i16 = wVarC.f61768v;
                    int i17 = wVarC.f61769w;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (pointE.x * f65728o)) && i17 >= ((int) (pointE.y * f65728o)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    @p0
    private static String M(@p0 Context context) {
        CaptioningManager captioningManager;
        Locale locale;
        if (context != null && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled() && (locale = captioningManager.getLocale()) != null) {
            return k1.x0(locale);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int N(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int O(@p0 String str) {
        if (str == null) {
            return 0;
        }
        int i10 = 6 ^ 3;
        switch (str) {
            case "video/dolby-vision":
                return 5;
            case "video/av01":
                return 4;
            case "video/hevc":
                return 3;
            case "video/avc":
                return 1;
            case "video/x-vnd.on2.vp9":
                return 2;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean P(androidx.media3.common.w wVar, e eVar) {
        int i10;
        h hVar;
        h hVar2;
        if (!eVar.A0 || (i10 = wVar.E) == -1 || i10 <= 2) {
            return true;
        }
        if (!Q(wVar) || (k1.f61540a >= 32 && (hVar2 = this.f65734h) != null && hVar2.d())) {
            return k1.f61540a >= 32 && (hVar = this.f65734h) != null && hVar.d() && this.f65734h.b() && this.f65734h.c() && this.f65734h.a(this.f65735i, wVar);
        }
        return true;
    }

    private static boolean Q(androidx.media3.common.w wVar) {
        String str = wVar.f61761o;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/ac4":
            case "audio/eac3":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean R(androidx.media3.common.w wVar) {
        String str = wVar.f61761o;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/ac4":
            case "audio/iamf":
                return true;
            default:
                return false;
        }
    }

    @Deprecated
    protected static boolean S(int i10, boolean z10) {
        return a5.I(i10, z10);
    }

    private static void T(e eVar, e0.a aVar, int[][][] iArr, c5[] c5VarArr, c0[] c0VarArr) {
        int i10 = -1;
        boolean z10 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < aVar.d(); i12++) {
            int iG = aVar.g(i12);
            c0 c0Var = c0VarArr[i12];
            if (iG != 1 && c0Var != null) {
                return;
            }
            if (iG == 1 && c0Var != null && c0Var.length() == 1) {
                if (Y(eVar, iArr[i12][aVar.h(i12).e(c0Var.g())][c0Var.b(0)], c0Var.k())) {
                    i11++;
                    i10 = i12;
                }
            }
        }
        if (i11 == 1) {
            int i13 = eVar.f60549u.f60563b ? 1 : 2;
            c5 c5Var = c5VarArr[i10];
            if (c5Var != null && c5Var.f63544b) {
                z10 = true;
            }
            c5VarArr[i10] = new c5(i13, z10);
        }
    }

    private static void U(e0.a aVar, int[][][] iArr, c5[] c5VarArr, c0[] c0VarArr) {
        boolean z10;
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= aVar.d()) {
                z10 = true;
                break;
            }
            int iG = aVar.g(i12);
            c0 c0Var = c0VarArr[i12];
            if ((iG == 1 || iG == 2) && c0Var != null && Z(iArr[i12], aVar.h(i12), c0Var)) {
                if (iG == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else {
                    if (i10 != -1) {
                        z10 = false;
                        break;
                    }
                    i10 = i12;
                }
            }
            i12++;
        }
        if (z10 && ((i11 == -1 || i10 == -1) ? false : true)) {
            c5 c5Var = new c5(0, true);
            c5VarArr[i11] = c5Var;
            c5VarArr[i10] = c5Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        boolean z10;
        h hVar;
        synchronized (this.f65730d) {
            try {
                z10 = this.f65733g.A0 && k1.f61540a >= 32 && (hVar = this.f65734h) != null && hVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            f();
        }
    }

    private void W(z4 z4Var) {
        boolean z10;
        synchronized (this.f65730d) {
            try {
                z10 = this.f65733g.E0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            g(z4Var);
        }
    }

    @p0
    protected static String X(@p0 String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Y(e eVar, int i10, androidx.media3.common.w wVar) {
        if (a5.z(i10) == 0) {
            return false;
        }
        if (eVar.f60549u.f60564c && (a5.z(i10) & 2048) == 0) {
            return false;
        }
        if (eVar.f60549u.f60563b) {
            boolean z10 = (wVar.H == 0 && wVar.I == 0) ? false : true;
            boolean z11 = (a5.z(i10) & 1024) != 0;
            if (z10 && !z11) {
                return false;
            }
        }
        return true;
    }

    private static boolean Z(int[][] iArr, h2 h2Var, c0 c0Var) {
        if (c0Var == null) {
            return false;
        }
        int iE = h2Var.e(c0Var.g());
        for (int i10 = 0; i10 < c0Var.length(); i10++) {
            if (a5.L(iArr[iE][c0Var.b(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    @p0
    private <T extends j<T>> Pair<c0.a, Integer> f0(int i10, e0.a aVar, int[][][] iArr, j.a<T> aVar2, Comparator<List<T>> comparator) {
        int i11;
        RandomAccess randomAccessG;
        e0.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int iD = aVar3.d();
        int i12 = 0;
        while (i12 < iD) {
            if (i10 == aVar3.g(i12)) {
                h2 h2VarH = aVar3.h(i12);
                for (int i13 = 0; i13 < h2VarH.f65076a; i13++) {
                    b4 b4VarC = h2VarH.c(i13);
                    List<T> listA = aVar2.a(i12, b4VarC, iArr[i12][i13]);
                    boolean[] zArr = new boolean[b4VarC.f60459a];
                    int i14 = 0;
                    while (i14 < b4VarC.f60459a) {
                        T t10 = listA.get(i14);
                        int iK = t10.k();
                        if (zArr[i14] || iK == 0) {
                            i11 = iD;
                        } else {
                            if (iK == 1) {
                                randomAccessG = l6.G(t10);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t10);
                                int i15 = i14 + 1;
                                while (i15 < b4VarC.f60459a) {
                                    T t11 = listA.get(i15);
                                    int i16 = iD;
                                    if (t11.k() == 2 && t10.l(t11)) {
                                        arrayList2.add(t11);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    iD = i16;
                                }
                                randomAccessG = arrayList2;
                            }
                            i11 = iD;
                            arrayList.add(randomAccessG);
                        }
                        i14++;
                        iD = i11;
                    }
                }
            }
            i12++;
            aVar3 = aVar;
            iD = iD;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((j) list.get(i17)).f65793c;
        }
        j jVar = (j) list.get(0);
        return Pair.create(new c0.a(jVar.f65792b, iArr2), Integer.valueOf(jVar.f65791a));
    }

    private void j0(e eVar) {
        boolean zEquals;
        androidx.media3.common.util.a.g(eVar);
        synchronized (this.f65730d) {
            zEquals = this.f65733g.equals(eVar);
            this.f65733g = eVar;
        }
        if (!zEquals) {
            if (eVar.A0 && this.f65731e == null) {
                androidx.media3.common.util.z.n(f65723j, f65724k);
            }
            f();
        }
    }

    public static /* synthetic */ List s(final n nVar, final e eVar, boolean z10, int[] iArr, int i10, b4 b4Var, int[] iArr2) {
        nVar.getClass();
        return b.p(i10, b4Var, eVar, iArr2, z10, new com.google.common.base.k0() { // from class: androidx.media3.exoplayer.trackselection.g
            @Override // com.google.common.base.k0
            public final boolean apply(Object obj) {
                return this.f65695a.P((androidx.media3.common.w) obj, eVar);
            }
        }, iArr[i10]);
    }

    public static /* synthetic */ int w(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public e.a H() {
        return c().I();
    }

    @Override // androidx.media3.exoplayer.trackselection.k0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public e c() {
        e eVar;
        synchronized (this.f65730d) {
            eVar = this.f65733g;
        }
        return eVar;
    }

    @Override // androidx.media3.exoplayer.a5.f
    public void a(z4 z4Var) {
        W(z4Var);
    }

    protected c0.a[] a0(e0.a aVar, int[][][] iArr, int[] iArr2, e eVar) throws androidx.media3.exoplayer.s0 {
        String str;
        int iD = aVar.d();
        c0.a[] aVarArr = new c0.a[iD];
        Pair<c0.a, Integer> pairB0 = b0(aVar, iArr, iArr2, eVar);
        if (pairB0 != null) {
            aVarArr[((Integer) pairB0.second).intValue()] = (c0.a) pairB0.first;
        }
        if (pairB0 == null) {
            str = null;
        } else {
            Object obj = pairB0.first;
            str = ((c0.a) obj).f65676a.c(((c0.a) obj).f65677b[0]).f61750d;
        }
        Pair<c0.a, Integer> pairG0 = g0(aVar, iArr, iArr2, eVar, str);
        String str2 = str;
        Pair<c0.a, Integer> pairC0 = (eVar.A || pairG0 == null) ? c0(aVar, iArr, eVar) : null;
        if (pairC0 != null) {
            aVarArr[((Integer) pairC0.second).intValue()] = (c0.a) pairC0.first;
        } else if (pairG0 != null) {
            aVarArr[((Integer) pairG0.second).intValue()] = (c0.a) pairG0.first;
        }
        Pair<c0.a, Integer> pairE0 = e0(aVar, iArr, eVar, str2);
        if (pairE0 != null) {
            aVarArr[((Integer) pairE0.second).intValue()] = (c0.a) pairE0.first;
        }
        for (int i10 = 0; i10 < iD; i10++) {
            int iG = aVar.g(i10);
            if (iG != 2 && iG != 1 && iG != 3 && iG != 4) {
                aVarArr[i10] = d0(iG, aVar.h(i10), iArr[i10], eVar);
            }
        }
        return aVarArr;
    }

    @p0
    protected Pair<c0.a, Integer> b0(e0.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) throws androidx.media3.exoplayer.s0 {
        final boolean z10 = false;
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            if (2 == aVar.g(i10) && aVar.h(i10).f65076a > 0) {
                z10 = true;
                break;
            }
        }
        return f0(1, aVar, iArr, new j.a() { // from class: androidx.media3.exoplayer.trackselection.j
            @Override // androidx.media3.exoplayer.trackselection.n.j.a
            public final List a(int i11, b4 b4Var, int[] iArr3) {
                return n.s(this.f65709a, eVar, z10, iArr2, i11, b4Var, iArr3);
            }
        }, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.b.n((List) obj, (List) obj2);
            }
        });
    }

    @p0
    protected Pair<c0.a, Integer> c0(e0.a aVar, int[][][] iArr, final e eVar) throws androidx.media3.exoplayer.s0 {
        if (eVar.f60549u.f60562a == 2) {
            return null;
        }
        return f0(4, aVar, iArr, new j.a() { // from class: androidx.media3.exoplayer.trackselection.e
            @Override // androidx.media3.exoplayer.trackselection.n.j.a
            public final List a(int i10, b4 b4Var, int[] iArr2) {
                return n.c.p(i10, b4Var, eVar, iArr2);
            }
        }, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.c.n((List) obj, (List) obj2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.trackselection.k0
    @p0
    public a5.f d() {
        return this;
    }

    @p0
    protected c0.a d0(int i10, h2 h2Var, int[][] iArr, e eVar) throws androidx.media3.exoplayer.s0 {
        if (eVar.f60549u.f60562a == 2) {
            return null;
        }
        int i11 = 0;
        b4 b4Var = null;
        d dVar = null;
        for (int i12 = 0; i12 < h2Var.f65076a; i12++) {
            b4 b4VarC = h2Var.c(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < b4VarC.f60459a; i13++) {
                if (a5.I(iArr2[i13], eVar.B0)) {
                    d dVar2 = new d(b4VarC.c(i13), iArr2[i13]);
                    if (dVar == null || dVar2.compareTo(dVar) > 0) {
                        b4Var = b4VarC;
                        i11 = i13;
                        dVar = dVar2;
                    }
                }
            }
        }
        if (b4Var == null) {
            return null;
        }
        return new c0.a(b4Var, i11);
    }

    @p0
    protected Pair<c0.a, Integer> e0(e0.a aVar, int[][][] iArr, final e eVar, @p0 final String str) throws androidx.media3.exoplayer.s0 {
        if (eVar.f60549u.f60562a == 2) {
            return null;
        }
        final String strM = eVar.f60552x ? M(this.f65731e) : null;
        return f0(3, aVar, iArr, new j.a() { // from class: androidx.media3.exoplayer.trackselection.l
            @Override // androidx.media3.exoplayer.trackselection.n.j.a
            public final List a(int i10, b4 b4Var, int[] iArr2) {
                return n.i.p(i10, b4Var, eVar, iArr2, str, strM);
            }
        }, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.m
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.i.n((List) obj, (List) obj2);
            }
        });
    }

    @p0
    protected Pair<c0.a, Integer> g0(e0.a aVar, int[][][] iArr, final int[] iArr2, final e eVar, @p0 final String str) throws androidx.media3.exoplayer.s0 {
        Context context;
        int i10 = 6 | 2;
        final Point pointL0 = null;
        if (eVar.f60549u.f60562a == 2) {
            return null;
        }
        if (eVar.f60539k && (context = this.f65731e) != null) {
            pointL0 = k1.l0(context);
        }
        return f0(2, aVar, iArr, new j.a() { // from class: androidx.media3.exoplayer.trackselection.h
            @Override // androidx.media3.exoplayer.trackselection.n.j.a
            public final List a(int i11, b4 b4Var, int[] iArr3) {
                return n.k.s(i11, b4Var, eVar, iArr3, str, iArr2[i11], pointL0);
            }
        }, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.k.r((List) obj, (List) obj2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.trackselection.k0
    public boolean h() {
        return true;
    }

    public void h0(e.a aVar) {
        j0(aVar.G());
    }

    @Deprecated
    public void i0(f fVar) {
        j0(fVar.G());
    }

    @Override // androidx.media3.exoplayer.trackselection.k0
    public void j() {
        h hVar;
        if (k1.f61540a >= 32 && (hVar = this.f65734h) != null) {
            hVar.e();
        }
        super.j();
    }

    @Override // androidx.media3.exoplayer.trackselection.k0
    public void l(androidx.media3.common.d dVar) {
        if (this.f65735i.equals(dVar)) {
            return;
        }
        this.f65735i = dVar;
        V();
    }

    @Override // androidx.media3.exoplayer.trackselection.k0
    public void m(e4 e4Var) {
        if (e4Var instanceof e) {
            j0((e) e4Var);
        }
        j0(new e.a().P(e4Var).G());
    }

    @Override // androidx.media3.exoplayer.trackselection.e0
    protected final Pair<c5[], c0[]> r(e0.a aVar, int[][][] iArr, int[] iArr2, t0.b bVar, z3 z3Var) throws androidx.media3.exoplayer.s0 {
        e eVar;
        synchronized (this.f65730d) {
            eVar = this.f65733g;
        }
        if (eVar.A0 && k1.f61540a >= 32 && this.f65734h == null) {
            this.f65734h = new h(this.f65731e, this);
        }
        int iD = aVar.d();
        c0.a[] aVarArrA0 = a0(aVar, iArr, iArr2, eVar);
        G(aVar, eVar, aVarArrA0);
        F(aVar, eVar, aVarArrA0);
        for (int i10 = 0; i10 < iD; i10++) {
            int iG = aVar.g(i10);
            if (eVar.V(i10) || eVar.E.contains(Integer.valueOf(iG))) {
                aVarArrA0[i10] = null;
            }
        }
        c0[] c0VarArrA = this.f65732f.a(aVarArrA0, b(), bVar, z3Var);
        c5[] c5VarArr = new c5[iD];
        for (int i11 = 0; i11 < iD; i11++) {
            c5VarArr[i11] = (eVar.V(i11) || eVar.E.contains(Integer.valueOf(aVar.g(i11))) || (aVar.g(i11) != -2 && c0VarArrA[i11] == null)) ? null : c5.f63542c;
        }
        if (eVar.C0) {
            U(aVar, iArr, c5VarArr, c0VarArrA);
        }
        if (eVar.f60549u.f60562a != 0) {
            T(eVar, aVar, iArr, c5VarArr, c0VarArrA);
        }
        return Pair.create(c5VarArr, c0VarArrA);
    }

    @Deprecated
    public static final class f extends e4.c {
        private final e.a F;

        public f() {
            this.F = new e.a();
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
        public f F(c4 c4Var) {
            this.F.F(c4Var);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: A1, reason: merged with bridge method [inline-methods] */
        public f t0(int i10) {
            this.F.t0(i10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
        public e G() {
            return this.F.G();
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
        public f u0(boolean z10) {
            this.F.u0(z10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
        public f H(b4 b4Var) {
            this.F.H(b4Var);
            return this;
        }

        @z7.a
        public f C1(int i10, boolean z10) {
            this.F.Z1(i10, z10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
        public f I() {
            this.F.I();
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
        public f v0(boolean z10) {
            this.F.v0(z10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
        public f J(int i10) {
            this.F.J(i10);
            return this;
        }

        @z7.a
        @Deprecated
        public f E1(int i10, h2 h2Var, @p0 g gVar) {
            this.F.b2(i10, h2Var, gVar);
            return this;
        }

        @z7.a
        @Deprecated
        public f F0(int i10, h2 h2Var) {
            this.F.W0(i10, h2Var);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: F1, reason: merged with bridge method [inline-methods] */
        public f w0(int i10, boolean z10) {
            this.F.w0(i10, z10);
            return this;
        }

        @z7.a
        @Deprecated
        public f G0() {
            this.F.X0();
            return this;
        }

        @z7.a
        public f G1(boolean z10) {
            this.F.e2(z10);
            return this;
        }

        @z7.a
        @Deprecated
        public f H0(int i10) {
            this.F.Y0(i10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: H1, reason: merged with bridge method [inline-methods] */
        public f x0(int i10, int i11, boolean z10) {
            this.F.x0(i10, i11, z10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
        public f K() {
            this.F.K();
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: I1, reason: merged with bridge method [inline-methods] */
        public f y0(Context context, boolean z10) {
            this.F.y0(context, z10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
        public f L() {
            this.F.L();
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: J1, reason: merged with bridge method [inline-methods] */
        public f z0(boolean z10) {
            this.F.z0(z10);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
        public f P(e4 e4Var) {
            this.F.P(e4Var);
            return this;
        }

        @z7.a
        public f L0(boolean z10) {
            this.F.f1(z10);
            return this;
        }

        @z7.a
        public f M0(boolean z10) {
            this.F.g1(z10);
            return this;
        }

        @z7.a
        public f N0(boolean z10) {
            this.F.h1(z10);
            return this;
        }

        @z7.a
        public f O0(boolean z10) {
            this.F.i1(z10);
            return this;
        }

        @z7.a
        public f P0(boolean z10) {
            this.F.l1(z10);
            return this;
        }

        @z7.a
        public f Q0(boolean z10) {
            this.F.m1(z10);
            return this;
        }

        @z7.a
        public f R0(boolean z10) {
            this.F.n1(z10);
            return this;
        }

        @z7.a
        public f S0(boolean z10) {
            this.F.o1(z10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
        public f Q(e4.b bVar) {
            this.F.Q(bVar);
            return this;
        }

        @z7.a
        @Deprecated
        public f U0(int i10) {
            this.F.r1(i10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        @Deprecated
        /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
        public f R(Set<Integer> set) {
            this.F.R(set);
            return this;
        }

        @z7.a
        public f W0(boolean z10) {
            this.F.t1(z10);
            return this;
        }

        @z7.a
        public f X0(boolean z10) {
            this.F.u1(z10);
            return this;
        }

        @z7.a
        public f Y0(boolean z10) {
            this.F.v1(z10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
        public f S(boolean z10) {
            this.F.S(z10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
        public f T(boolean z10) {
            this.F.T(z10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
        public f U(int i10) {
            this.F.U(i10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
        public f V(int i10) {
            this.F.V(i10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
        public f W(int i10) {
            this.F.W(i10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
        public f X(int i10) {
            this.F.X(i10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
        public f Y(int i10) {
            this.F.Y(i10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
        public f Z(int i10, int i11) {
            this.F.Z(i10, i11);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
        public f a0() {
            this.F.a0();
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
        public f b0(int i10) {
            this.F.b0(i10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
        public f c0(int i10) {
            this.F.c0(i10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: k1, reason: merged with bridge method [inline-methods] */
        public f d0(int i10, int i11) {
            this.F.d0(i10, i11);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
        public f e0(c4 c4Var) {
            this.F.e0(c4Var);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
        public f f0(@p0 String str) {
            this.F.f0(str);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
        public f g0(String... strArr) {
            this.F.g0(strArr);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
        public f h0(@p0 String str) {
            this.F.h0(str);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
        public f i0(String... strArr) {
            this.F.i0(strArr);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
        public f j0(int i10) {
            this.F.j0(i10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
        public f k0(@p0 String str) {
            this.F.k0(str);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
        public f l0() {
            this.F.l0();
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
        public f m0(Context context) {
            this.F.m0(context);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
        public f n0(String... strArr) {
            this.F.n0(strArr);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
        public f o0(int i10) {
            this.F.o0(i10);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
        public f p0(@p0 String str) {
            super.p0(str);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
        public f q0(String... strArr) {
            super.q0(strArr);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
        public f r0(@p0 String str) {
            this.F.r0(str);
            return this;
        }

        @Override // androidx.media3.common.e4.c
        @z7.a
        /* JADX INFO: renamed from: z1, reason: merged with bridge method [inline-methods] */
        public f s0(String... strArr) {
            this.F.s0(strArr);
            return this;
        }

        public f(Context context) {
            this.F = new e.a(context);
        }
    }

    public n(Context context, c0.b bVar) {
        this(context, e.H0, bVar);
    }

    public n(Context context, e4 e4Var) {
        this(context, e4Var, new androidx.media3.exoplayer.trackselection.a.b());
    }

    @Deprecated
    public n(e4 e4Var, c0.b bVar) {
        this(e4Var, bVar, (Context) null);
    }

    public n(Context context, e4 e4Var, c0.b bVar) {
        this(e4Var, bVar, context);
    }

    private n(e4 e4Var, c0.b bVar, @p0 Context context) {
        this.f65730d = new Object();
        this.f65731e = context != null ? context.getApplicationContext() : null;
        this.f65732f = bVar;
        if (e4Var instanceof e) {
            this.f65733g = (e) e4Var;
        } else {
            this.f65733g = e.H0.I().P(e4Var).G();
        }
        this.f65735i = androidx.media3.common.d.f60472g;
        if (this.f65733g.A0 && context == null) {
            androidx.media3.common.util.z.n(f65723j, f65724k);
        }
    }
}
