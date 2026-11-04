package androidx.media3.common;

import android.graphics.Rect;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.common.collect.l6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public abstract class r3 extends androidx.media3.common.g {

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private static final long f61181j1 = 1000;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private final androidx.media3.common.util.y<z0.g> f61182c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private final Looper f61183d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private final androidx.media3.common.util.u f61184e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private final HashSet<com.google.common.util.concurrent.t1<?>> f61185f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private final z3.b f61186g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private h f61187h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private boolean f61188i1;

    protected static final class b implements g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f61189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f61190c = -9223372036854775807L;

        public b(g gVar) {
            this.f61189b = gVar;
        }

        public void e(long j10) {
            this.f61190c = j10;
        }

        @Override // androidx.media3.common.r3.g
        public long get() {
            long j10 = this.f61190c;
            return j10 != -9223372036854775807L ? j10 : this.f61189b.get();
        }
    }

    protected static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f61191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i4 f61192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k0 f61193c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        public final q0 f61194d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        public final Object f61195e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        public final k0.g f61196f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f61197g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f61198h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f61199i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f61200j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f61201k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final long f61202l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final long f61203m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final long f61204n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f61205o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final l6<d> f61206p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final long[] f61207q;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Object f61208a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private i4 f61209b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private k0 f61210c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @androidx.annotation.p0
            private q0 f61211d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @androidx.annotation.p0
            private Object f61212e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @androidx.annotation.p0
            private k0.g f61213f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private long f61214g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private long f61215h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private long f61216i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f61217j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private boolean f61218k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private long f61219l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private long f61220m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private long f61221n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private boolean f61222o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private l6<d> f61223p;

            @z7.a
            public a A(@androidx.annotation.p0 q0 q0Var) {
                this.f61211d = q0Var;
                return this;
            }

            @z7.a
            public a B(List<d> list) {
                int size = list.size();
                int i10 = 0;
                while (i10 < size - 1) {
                    androidx.media3.common.util.a.b(list.get(i10).f61225b != -9223372036854775807L, "Periods other than last need a duration");
                    int i11 = i10 + 1;
                    for (int i12 = i11; i12 < size; i12++) {
                        androidx.media3.common.util.a.b(!list.get(i10).f61224a.equals(list.get(i12).f61224a), "Duplicate PeriodData UIDs in period list");
                    }
                    i10 = i11;
                }
                this.f61223p = l6.w(list);
                return this;
            }

            @z7.a
            public a C(long j10) {
                androidx.media3.common.util.a.a(j10 >= 0);
                this.f61221n = j10;
                return this;
            }

            @z7.a
            public a D(long j10) {
                this.f61214g = j10;
                return this;
            }

            @z7.a
            public a E(i4 i4Var) {
                this.f61209b = i4Var;
                return this;
            }

            @z7.a
            public a F(Object obj) {
                this.f61208a = obj;
                return this;
            }

            @z7.a
            public a G(long j10) {
                this.f61215h = j10;
                return this;
            }

            public c q() {
                return new c(this);
            }

            @z7.a
            public a r(long j10) {
                boolean z10;
                if (j10 >= 0) {
                    z10 = true;
                    boolean z11 = !true;
                } else {
                    z10 = false;
                }
                androidx.media3.common.util.a.a(z10);
                this.f61219l = j10;
                return this;
            }

            @z7.a
            public a s(long j10) {
                androidx.media3.common.util.a.a(j10 == -9223372036854775807L || j10 >= 0);
                this.f61220m = j10;
                return this;
            }

            @z7.a
            public a t(long j10) {
                this.f61216i = j10;
                return this;
            }

            @z7.a
            public a u(boolean z10) {
                this.f61218k = z10;
                return this;
            }

            @z7.a
            public a v(boolean z10) {
                this.f61222o = z10;
                return this;
            }

            @z7.a
            public a w(boolean z10) {
                this.f61217j = z10;
                return this;
            }

            @z7.a
            public a x(@androidx.annotation.p0 k0.g gVar) {
                this.f61213f = gVar;
                return this;
            }

            @z7.a
            public a y(@androidx.annotation.p0 Object obj) {
                this.f61212e = obj;
                return this;
            }

            @z7.a
            public a z(k0 k0Var) {
                this.f61210c = k0Var;
                return this;
            }

            public a(Object obj) {
                this.f61208a = obj;
                this.f61209b = i4.f60639b;
                this.f61210c = k0.f60814j;
                this.f61211d = null;
                this.f61212e = null;
                this.f61213f = null;
                this.f61214g = -9223372036854775807L;
                this.f61215h = -9223372036854775807L;
                this.f61216i = -9223372036854775807L;
                this.f61217j = false;
                this.f61218k = false;
                this.f61219l = 0L;
                this.f61220m = -9223372036854775807L;
                this.f61221n = 0L;
                this.f61222o = false;
                this.f61223p = l6.F();
            }

            private a(c cVar) {
                this.f61208a = cVar.f61191a;
                this.f61209b = cVar.f61192b;
                this.f61210c = cVar.f61193c;
                this.f61211d = cVar.f61194d;
                this.f61212e = cVar.f61195e;
                this.f61213f = cVar.f61196f;
                this.f61214g = cVar.f61197g;
                this.f61215h = cVar.f61198h;
                this.f61216i = cVar.f61199i;
                this.f61217j = cVar.f61200j;
                this.f61218k = cVar.f61201k;
                this.f61219l = cVar.f61202l;
                this.f61220m = cVar.f61203m;
                this.f61221n = cVar.f61204n;
                this.f61222o = cVar.f61205o;
                this.f61223p = cVar.f61206p;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c e(h hVar, int i10, z3.b bVar, z3.d dVar) {
            boolean z10 = r3.a4(hVar) == i10;
            hVar.f61261y.t(i10, dVar);
            l6.a aVarS = l6.s();
            for (int i11 = dVar.f62001n; i11 <= dVar.f62002o; i11++) {
                hVar.f61261y.k(i11, bVar, true);
                aVarS.a(new d.a(androidx.media3.common.util.a.g(bVar.f61968b)).f(bVar.f61973g).g(bVar.f61970d).h(bVar.f61972f).e());
            }
            return new a(dVar.f61988a).r(dVar.f61999l).s(dVar.f62000m).t(dVar.f61994g).u(dVar.f61996i).v(dVar.f61998k).w(dVar.f61995h).x(dVar.f61997j).y(dVar.f61991d).z(dVar.f61990c).A(z10 ? hVar.A : null).B(aVarS.e()).C(dVar.f62003p).D(dVar.f61992e).E(z10 ? hVar.f61262z : i4.f60639b).G(dVar.f61993f).q();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public z3.b g(int i10, int i11, z3.b bVar) {
            if (this.f61206p.isEmpty()) {
                Object obj = this.f61191a;
                bVar.w(obj, obj, i10, this.f61204n + this.f61203m, 0L, androidx.media3.common.b.f60416l, this.f61205o);
                return bVar;
            }
            d dVar = this.f61206p.get(i11);
            Object obj2 = dVar.f61224a;
            bVar.w(obj2, Pair.create(this.f61191a, obj2), i10, dVar.f61225b, this.f61207q[i11], dVar.f61226c, dVar.f61227d);
            return bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object h(int i10) {
            if (this.f61206p.isEmpty()) {
                return this.f61191a;
            }
            return Pair.create(this.f61191a, this.f61206p.get(i10).f61224a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public z3.d i(int i10, z3.d dVar) {
            int size;
            boolean z10;
            if (this.f61206p.isEmpty()) {
                size = 1;
                z10 = true;
            } else {
                size = this.f61206p.size();
                z10 = true;
            }
            dVar.j(this.f61191a, this.f61193c, this.f61195e, this.f61197g, this.f61198h, this.f61199i, this.f61200j, this.f61201k, this.f61196f, this.f61202l, this.f61203m, i10, (i10 + size) - 1, this.f61204n);
            dVar.f61998k = this.f61205o;
            return dVar;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f61191a.equals(cVar.f61191a) && this.f61192b.equals(cVar.f61192b) && this.f61193c.equals(cVar.f61193c) && Objects.equals(this.f61194d, cVar.f61194d) && Objects.equals(this.f61195e, cVar.f61195e) && Objects.equals(this.f61196f, cVar.f61196f) && this.f61197g == cVar.f61197g && this.f61198h == cVar.f61198h && this.f61199i == cVar.f61199i && this.f61200j == cVar.f61200j && this.f61201k == cVar.f61201k && this.f61202l == cVar.f61202l && this.f61203m == cVar.f61203m && this.f61204n == cVar.f61204n && this.f61205o == cVar.f61205o && this.f61206p.equals(cVar.f61206p);
        }

        public a f() {
            return new a();
        }

        public int hashCode() {
            int iHashCode = (((((217 + this.f61191a.hashCode()) * 31) + this.f61192b.hashCode()) * 31) + this.f61193c.hashCode()) * 31;
            q0 q0Var = this.f61194d;
            int iHashCode2 = (iHashCode + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
            Object obj = this.f61195e;
            int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
            k0.g gVar = this.f61196f;
            int iHashCode4 = (iHashCode3 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j10 = this.f61197g;
            int i10 = (iHashCode4 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f61198h;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f61199i;
            int i12 = (((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f61200j ? 1 : 0)) * 31) + (this.f61201k ? 1 : 0)) * 31;
            long j13 = this.f61202l;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f61203m;
            int i14 = (i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
            long j15 = this.f61204n;
            return ((((i14 + ((int) (j15 ^ (j15 >>> 32)))) * 31) + (this.f61205o ? 1 : 0)) * 31) + this.f61206p.hashCode();
        }

        private c(a aVar) {
            int i10 = 0;
            if (aVar.f61213f == null) {
                androidx.media3.common.util.a.b(aVar.f61214g == -9223372036854775807L, "presentationStartTimeMs can only be set if liveConfiguration != null");
                androidx.media3.common.util.a.b(aVar.f61215h == -9223372036854775807L, "windowStartTimeMs can only be set if liveConfiguration != null");
                androidx.media3.common.util.a.b(aVar.f61216i == -9223372036854775807L, "elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null");
            } else if (aVar.f61214g != -9223372036854775807L && aVar.f61215h != -9223372036854775807L) {
                androidx.media3.common.util.a.b(aVar.f61215h >= aVar.f61214g, "windowStartTimeMs can't be less than presentationStartTimeMs");
            }
            int size = aVar.f61223p.size();
            if (aVar.f61220m != -9223372036854775807L) {
                androidx.media3.common.util.a.b(aVar.f61219l <= aVar.f61220m, "defaultPositionUs can't be greater than durationUs");
            }
            this.f61191a = aVar.f61208a;
            this.f61192b = aVar.f61209b;
            this.f61193c = aVar.f61210c;
            this.f61194d = aVar.f61211d;
            this.f61195e = aVar.f61212e;
            this.f61196f = aVar.f61213f;
            this.f61197g = aVar.f61214g;
            this.f61198h = aVar.f61215h;
            this.f61199i = aVar.f61216i;
            this.f61200j = aVar.f61217j;
            this.f61201k = aVar.f61218k;
            this.f61202l = aVar.f61219l;
            this.f61203m = aVar.f61220m;
            long j10 = aVar.f61221n;
            this.f61204n = j10;
            this.f61205o = aVar.f61222o;
            l6<d> l6Var = aVar.f61223p;
            this.f61206p = l6Var;
            long[] jArr = new long[l6Var.size()];
            this.f61207q = jArr;
            if (l6Var.isEmpty()) {
                return;
            }
            jArr[0] = -j10;
            while (i10 < size - 1) {
                long[] jArr2 = this.f61207q;
                int i11 = i10 + 1;
                jArr2[i11] = jArr2[i10] + this.f61206p.get(i10).f61225b;
                i10 = i11;
            }
        }
    }

    protected static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f61224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f61225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final androidx.media3.common.b f61226c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f61227d;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Object f61228a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private long f61229b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private androidx.media3.common.b f61230c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f61231d;

            public d e() {
                return new d(this);
            }

            @z7.a
            public a f(androidx.media3.common.b bVar) {
                this.f61230c = bVar;
                return this;
            }

            @z7.a
            public a g(long j10) {
                androidx.media3.common.util.a.a(j10 == -9223372036854775807L || j10 >= 0);
                this.f61229b = j10;
                return this;
            }

            @z7.a
            public a h(boolean z10) {
                this.f61231d = z10;
                return this;
            }

            @z7.a
            public a i(Object obj) {
                this.f61228a = obj;
                return this;
            }

            public a(Object obj) {
                this.f61228a = obj;
                this.f61229b = 0L;
                this.f61230c = androidx.media3.common.b.f60416l;
                this.f61231d = false;
            }

            private a(d dVar) {
                this.f61228a = dVar.f61224a;
                this.f61229b = dVar.f61225b;
                this.f61230c = dVar.f61226c;
                this.f61231d = dVar.f61227d;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f61224a.equals(dVar.f61224a) && this.f61225b == dVar.f61225b && this.f61226c.equals(dVar.f61226c) && this.f61227d == dVar.f61227d;
        }

        public int hashCode() {
            int iHashCode = (217 + this.f61224a.hashCode()) * 31;
            long j10 = this.f61225b;
            return ((((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f61226c.hashCode()) * 31) + (this.f61227d ? 1 : 0);
        }

        private d(a aVar) {
            this.f61224a = aVar.f61228a;
            this.f61225b = aVar.f61229b;
            this.f61226c = aVar.f61230c;
            this.f61227d = aVar.f61231d;
        }
    }

    private static final class e {
        private e() {
        }
    }

    private static final class f extends z3 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final l6<c> f61232e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f61233f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int[] f61234g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final HashMap<Object, Integer> f61235h;

        public f(List<c> list) {
            int size = list.size();
            this.f61232e = l6.w(list);
            this.f61233f = new int[size];
            int iA = 0;
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = list.get(i10);
                this.f61233f[i10] = iA;
                iA += A(cVar);
            }
            this.f61234g = new int[iA];
            this.f61235h = new HashMap<>();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                c cVar2 = list.get(i12);
                for (int i13 = 0; i13 < A(cVar2); i13++) {
                    this.f61235h.put(cVar2.h(i13), Integer.valueOf(i11));
                    this.f61234g[i11] = i12;
                    i11++;
                }
            }
        }

        private static int A(c cVar) {
            if (cVar.f61206p.isEmpty()) {
                return 1;
            }
            return cVar.f61206p.size();
        }

        @Override // androidx.media3.common.z3
        public int e(boolean z10) {
            return super.e(z10);
        }

        @Override // androidx.media3.common.z3
        public int f(Object obj) {
            Integer num = this.f61235h.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // androidx.media3.common.z3
        public int g(boolean z10) {
            return super.g(z10);
        }

        @Override // androidx.media3.common.z3
        public int i(int i10, int i11, boolean z10) {
            return super.i(i10, i11, z10);
        }

        @Override // androidx.media3.common.z3
        public z3.b k(int i10, z3.b bVar, boolean z10) {
            int i11 = this.f61234g[i10];
            return this.f61232e.get(i11).g(i11, i10 - this.f61233f[i11], bVar);
        }

        @Override // androidx.media3.common.z3
        public z3.b l(Object obj, z3.b bVar) {
            return k(((Integer) androidx.media3.common.util.a.g(this.f61235h.get(obj))).intValue(), bVar, true);
        }

        @Override // androidx.media3.common.z3
        public int m() {
            return this.f61234g.length;
        }

        @Override // androidx.media3.common.z3
        public int r(int i10, int i11, boolean z10) {
            return super.r(i10, i11, z10);
        }

        @Override // androidx.media3.common.z3
        public Object s(int i10) {
            int i11 = this.f61234g[i10];
            return this.f61232e.get(i11).h(i10 - this.f61233f[i11]);
        }

        @Override // androidx.media3.common.z3
        public z3.d u(int i10, z3.d dVar, long j10) {
            return this.f61232e.get(i10).i(this.f61233f[i10], dVar);
        }

        @Override // androidx.media3.common.z3
        public int v() {
            return this.f61232e.size();
        }
    }

    protected interface g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f61236a = d(0);

        static /* synthetic */ long a(long j10) {
            return j10;
        }

        static g b(final long j10, final float f10) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            return new g() { // from class: androidx.media3.common.s3
                @Override // androidx.media3.common.r3.g
                public final long get() {
                    return r3.g.c(j10, jElapsedRealtime, f10);
                }
            };
        }

        static /* synthetic */ long c(long j10, long j11, float f10) {
            return j10 + ((long) ((SystemClock.elapsedRealtime() - j11) * f10));
        }

        static g d(final long j10) {
            return new g() { // from class: androidx.media3.common.t3
                @Override // androidx.media3.common.r3.g
                public final long get() {
                    return r3.g.a(j10);
                }
            };
        }

        long get();
    }

    public static final class h {
        public final q0 A;
        public final q0 B;
        public final int C;
        public final int D;
        public final int E;
        public final g F;
        public final g G;
        public final g H;
        public final g I;
        public final g J;
        public final boolean K;
        public final int L;
        public final long M;
        private final boolean N;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z0.c f61237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f61238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f61239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f61240d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f61241e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        public final x0 f61242f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f61243g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f61244h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f61245i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f61246j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f61247k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final long f61248l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final y0 f61249m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final e4 f61250n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final androidx.media3.common.d f61251o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @androidx.annotation.x(from = 0.0d, to = 1.0d)
        public final float f61252p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final n4 f61253q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final androidx.media3.common.text.d f61254r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final o f61255s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @androidx.annotation.g0(from = 0)
        public final int f61256t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final boolean f61257u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final androidx.media3.common.util.r0 f61258v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f61259w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final r0 f61260x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final z3 f61261y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final i4 f61262z;

        public static final class a {

            @androidx.annotation.p0
            private i4 A;

            @androidx.annotation.p0
            private q0 B;
            private q0 C;
            private int D;
            private int E;
            private int F;

            @androidx.annotation.p0
            private Long G;
            private g H;

            @androidx.annotation.p0
            private Long I;
            private g J;
            private g K;
            private g L;
            private g M;
            private boolean N;
            private int O;
            private long P;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private z0.c f61263a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f61264b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f61265c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f61266d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f61267e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @androidx.annotation.p0
            private x0 f61268f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f61269g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f61270h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f61271i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private long f61272j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private long f61273k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private long f61274l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private y0 f61275m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private e4 f61276n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private androidx.media3.common.d f61277o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private float f61278p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private n4 f61279q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private androidx.media3.common.text.d f61280r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private o f61281s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private int f61282t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            private boolean f61283u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            private androidx.media3.common.util.r0 f61284v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            private boolean f61285w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            private r0 f61286x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            @androidx.annotation.p0
            private l6<c> f61287y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            private z3 f61288z;

            @z7.a
            public a A0(n4 n4Var) {
                this.f61279q = n4Var;
                return this;
            }

            @z7.a
            public a B0(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
                androidx.media3.common.util.a.a(f10 >= 0.0f && f10 <= 1.0f);
                this.f61278p = f10;
                return this;
            }

            public h Q() {
                return new h(this);
            }

            @z7.a
            public a R() {
                this.N = false;
                return this;
            }

            @z7.a
            public a S(g gVar) {
                this.L = gVar;
                return this;
            }

            @z7.a
            public a T(long j10) {
                this.I = Long.valueOf(j10);
                return this;
            }

            @z7.a
            public a U(g gVar) {
                this.I = null;
                this.J = gVar;
                return this;
            }

            @z7.a
            public a V(androidx.media3.common.d dVar) {
                this.f61277o = dVar;
                return this;
            }

            @z7.a
            public a W(z0.c cVar) {
                this.f61263a = cVar;
                return this;
            }

            @z7.a
            public a X(g gVar) {
                this.K = gVar;
                return this;
            }

            @z7.a
            public a Y(long j10) {
                this.G = Long.valueOf(j10);
                return this;
            }

            @z7.a
            public a Z(g gVar) {
                this.G = null;
                this.H = gVar;
                return this;
            }

            @z7.a
            public a a0(int i10, int i11) {
                androidx.media3.common.util.a.a((i10 == -1) == (i11 == -1));
                this.E = i10;
                this.F = i11;
                return this;
            }

            @z7.a
            public a b0(androidx.media3.common.text.d dVar) {
                this.f61280r = dVar;
                return this;
            }

            @z7.a
            public a c0(int i10) {
                this.D = i10;
                return this;
            }

            @z7.a
            public a d0(o oVar) {
                this.f61281s = oVar;
                return this;
            }

            @z7.a
            public a e0(@androidx.annotation.g0(from = 0) int i10) {
                androidx.media3.common.util.a.a(i10 >= 0);
                this.f61282t = i10;
                return this;
            }

            @z7.a
            public a f0(boolean z10) {
                this.f61283u = z10;
                return this;
            }

            @z7.a
            public a g0(boolean z10) {
                this.f61271i = z10;
                return this;
            }

            @z7.a
            public a h0(long j10) {
                this.f61274l = j10;
                return this;
            }

            @z7.a
            public a i0(boolean z10) {
                this.f61285w = z10;
                return this;
            }

            @z7.a
            public a j0(boolean z10, int i10) {
                this.f61264b = z10;
                this.f61265c = i10;
                return this;
            }

            @z7.a
            public a k0(y0 y0Var) {
                this.f61275m = y0Var;
                return this;
            }

            @z7.a
            public a l0(int i10) {
                this.f61266d = i10;
                return this;
            }

            @z7.a
            public a m0(int i10) {
                this.f61267e = i10;
                return this;
            }

            @z7.a
            public a n0(@androidx.annotation.p0 x0 x0Var) {
                this.f61268f = x0Var;
                return this;
            }

            @z7.a
            public a o0(z3 z3Var, i4 i4Var, @androidx.annotation.p0 q0 q0Var) {
                this.f61287y = null;
                this.f61288z = z3Var;
                this.A = i4Var;
                this.B = q0Var;
                return this;
            }

            @z7.a
            public a p0(List<c> list) {
                HashSet hashSet = new HashSet();
                for (int i10 = 0; i10 < list.size(); i10++) {
                    androidx.media3.common.util.a.b(hashSet.add(list.get(i10).f61191a), "Duplicate MediaItemData UID in playlist");
                }
                this.f61287y = l6.w(list);
                this.f61288z = new f(this.f61287y);
                this.A = null;
                this.B = null;
                return this;
            }

            @z7.a
            public a q0(q0 q0Var) {
                this.C = q0Var;
                return this;
            }

            @z7.a
            public a r0(int i10, long j10) {
                this.N = true;
                this.O = i10;
                this.P = j10;
                return this;
            }

            @z7.a
            public a s0(int i10) {
                this.f61269g = i10;
                return this;
            }

            @z7.a
            public a t0(long j10) {
                this.f61272j = j10;
                return this;
            }

            @z7.a
            public a u0(long j10) {
                this.f61273k = j10;
                return this;
            }

            @z7.a
            public a v0(boolean z10) {
                this.f61270h = z10;
                return this;
            }

            @z7.a
            public a w0(androidx.media3.common.util.r0 r0Var) {
                this.f61284v = r0Var;
                return this;
            }

            @z7.a
            public a x0(r0 r0Var) {
                this.f61286x = r0Var;
                return this;
            }

            @z7.a
            public a y0(g gVar) {
                this.M = gVar;
                return this;
            }

            @z7.a
            public a z0(e4 e4Var) {
                this.f61276n = e4Var;
                return this;
            }

            public a() {
                this.f61263a = z0.c.f61933b;
                this.f61264b = false;
                this.f61265c = 1;
                this.f61266d = 1;
                this.f61267e = 0;
                this.f61268f = null;
                this.f61269g = 0;
                this.f61270h = false;
                this.f61271i = false;
                this.f61272j = 5000L;
                this.f61273k = 15000L;
                this.f61274l = j.f60679f2;
                this.f61275m = y0.f61871d;
                this.f61276n = e4.F;
                this.f61277o = androidx.media3.common.d.f60472g;
                this.f61278p = 1.0f;
                this.f61279q = n4.f60993h;
                this.f61280r = androidx.media3.common.text.d.f61409c;
                this.f61281s = o.f61003g;
                this.f61282t = 0;
                this.f61283u = false;
                this.f61284v = androidx.media3.common.util.r0.f61638c;
                this.f61285w = false;
                this.f61286x = new r0(-9223372036854775807L, new r0.a[0]);
                this.f61287y = l6.F();
                this.f61288z = z3.f61958a;
                this.A = null;
                this.B = null;
                this.C = q0.X0;
                this.D = -1;
                this.E = -1;
                this.F = -1;
                this.G = null;
                this.H = g.d(-9223372036854775807L);
                this.I = null;
                g gVar = g.f61236a;
                this.J = gVar;
                this.K = g.d(-9223372036854775807L);
                this.L = gVar;
                this.M = gVar;
                this.N = false;
                this.O = 5;
                this.P = 0L;
            }

            private a(h hVar) {
                this.f61263a = hVar.f61237a;
                this.f61264b = hVar.f61238b;
                this.f61265c = hVar.f61239c;
                this.f61266d = hVar.f61240d;
                this.f61267e = hVar.f61241e;
                this.f61268f = hVar.f61242f;
                this.f61269g = hVar.f61243g;
                this.f61270h = hVar.f61244h;
                this.f61271i = hVar.f61245i;
                this.f61272j = hVar.f61246j;
                this.f61273k = hVar.f61247k;
                this.f61274l = hVar.f61248l;
                this.f61275m = hVar.f61249m;
                this.f61276n = hVar.f61250n;
                this.f61277o = hVar.f61251o;
                this.f61278p = hVar.f61252p;
                this.f61279q = hVar.f61253q;
                this.f61280r = hVar.f61254r;
                this.f61281s = hVar.f61255s;
                this.f61282t = hVar.f61256t;
                this.f61283u = hVar.f61257u;
                this.f61284v = hVar.f61258v;
                this.f61285w = hVar.f61259w;
                this.f61286x = hVar.f61260x;
                z3 z3Var = hVar.f61261y;
                this.f61288z = z3Var;
                if (z3Var instanceof f) {
                    this.f61287y = ((f) z3Var).f61232e;
                } else {
                    this.A = hVar.f61262z;
                    this.B = hVar.N ? null : hVar.A;
                }
                this.C = hVar.B;
                this.D = hVar.C;
                this.E = hVar.D;
                this.F = hVar.E;
                this.G = null;
                this.H = hVar.F;
                this.I = null;
                this.J = hVar.G;
                this.K = hVar.H;
                this.L = hVar.I;
                this.M = hVar.J;
                this.N = hVar.K;
                this.O = hVar.L;
                this.P = hVar.M;
            }
        }

        public a b() {
            return new a();
        }

        public l6<c> c() {
            z3 z3Var = this.f61261y;
            if (z3Var instanceof f) {
                return ((f) z3Var).f61232e;
            }
            z3.d dVar = new z3.d();
            z3.b bVar = new z3.b();
            l6.a aVarT = l6.t(this.f61261y.v());
            for (int i10 = 0; i10 < this.f61261y.v(); i10++) {
                aVarT.a(c.e(this, i10, bVar, dVar));
            }
            return aVarT.e();
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f61238b == hVar.f61238b && this.f61239c == hVar.f61239c && this.f61237a.equals(hVar.f61237a) && this.f61240d == hVar.f61240d && this.f61241e == hVar.f61241e && Objects.equals(this.f61242f, hVar.f61242f) && this.f61243g == hVar.f61243g && this.f61244h == hVar.f61244h && this.f61245i == hVar.f61245i && this.f61246j == hVar.f61246j && this.f61247k == hVar.f61247k && this.f61248l == hVar.f61248l && this.f61249m.equals(hVar.f61249m) && this.f61250n.equals(hVar.f61250n) && this.f61251o.equals(hVar.f61251o) && this.f61252p == hVar.f61252p && this.f61253q.equals(hVar.f61253q) && this.f61254r.equals(hVar.f61254r) && this.f61255s.equals(hVar.f61255s) && this.f61256t == hVar.f61256t && this.f61257u == hVar.f61257u && this.f61258v.equals(hVar.f61258v) && this.f61259w == hVar.f61259w && this.f61260x.equals(hVar.f61260x) && this.f61261y.equals(hVar.f61261y) && this.f61262z.equals(hVar.f61262z) && this.A.equals(hVar.A) && this.B.equals(hVar.B) && this.C == hVar.C && this.D == hVar.D && this.E == hVar.E && this.F.equals(hVar.F) && this.G.equals(hVar.G) && this.H.equals(hVar.H) && this.I.equals(hVar.I) && this.J.equals(hVar.J) && this.K == hVar.K && this.L == hVar.L && this.M == hVar.M;
        }

        public int hashCode() {
            int iHashCode = (((((((((217 + this.f61237a.hashCode()) * 31) + (this.f61238b ? 1 : 0)) * 31) + this.f61239c) * 31) + this.f61240d) * 31) + this.f61241e) * 31;
            x0 x0Var = this.f61242f;
            int iHashCode2 = (((((((iHashCode + (x0Var == null ? 0 : x0Var.hashCode())) * 31) + this.f61243g) * 31) + (this.f61244h ? 1 : 0)) * 31) + (this.f61245i ? 1 : 0)) * 31;
            long j10 = this.f61246j;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f61247k;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f61248l;
            int iHashCode3 = (((((((((((((((((((((((((((((((((((((((((((((((((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f61249m.hashCode()) * 31) + this.f61250n.hashCode()) * 31) + this.f61251o.hashCode()) * 31) + Float.floatToRawIntBits(this.f61252p)) * 31) + this.f61253q.hashCode()) * 31) + this.f61254r.hashCode()) * 31) + this.f61255s.hashCode()) * 31) + this.f61256t) * 31) + (this.f61257u ? 1 : 0)) * 31) + this.f61258v.hashCode()) * 31) + (this.f61259w ? 1 : 0)) * 31) + this.f61260x.hashCode()) * 31) + this.f61261y.hashCode()) * 31) + this.f61262z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F.hashCode()) * 31) + this.G.hashCode()) * 31) + this.H.hashCode()) * 31) + this.I.hashCode()) * 31) + this.J.hashCode()) * 31) + (this.K ? 1 : 0)) * 31) + this.L) * 31;
            long j13 = this.M;
            return iHashCode3 + ((int) (j13 ^ (j13 >>> 32)));
        }

        /* JADX WARN: Code duplicated, block: B:56:0x0113  */
        /* JADX WARN: Code duplicated, block: B:58:0x0119  */
        /* JADX WARN: Code duplicated, block: B:64:0x012d  */
        /* JADX WARN: Code duplicated, block: B:67:0x0142  */
        /* JADX WARN: Code duplicated, block: B:78:0x0183  */
        /* JADX WARN: Code duplicated, block: B:81:0x0199  */
        /* JADX WARN: Code duplicated, block: B:90:0x01c0  */
        /* JADX WARN: Multi-variable type inference failed */
        private h(a aVar) {
            int i10;
            boolean z10;
            g gVarD;
            g gVarD2;
            i4 i4Var = aVar.A;
            q0 q0VarX3 = aVar.B;
            if (!aVar.f61288z.w()) {
                int i11 = aVar.D;
                if (i11 == -1) {
                    i10 = 0;
                } else {
                    androidx.media3.common.util.a.b(aVar.D < aVar.f61288z.v(), "currentMediaItemIndex must be less than playlist.size()");
                    i10 = i11;
                }
                if (aVar.E != -1) {
                    z3.b bVar = new z3.b();
                    aVar.f61288z.j(r3.f4(aVar.f61288z, i10, aVar.G != null ? aVar.G.longValue() : aVar.H.get(), new z3.d(), bVar), bVar);
                    androidx.media3.common.util.a.b(aVar.E < bVar.d(), "PeriodData has less ad groups than adGroupIndex");
                    int iB = bVar.b(aVar.E);
                    if (iB != -1) {
                        androidx.media3.common.util.a.b(aVar.F < iB, "Ad group has less ads than adIndexInGroupIndex");
                    }
                }
                if (aVar.f61287y != null) {
                    c cVar = (c) aVar.f61287y.get(i10);
                    i4 i4Var2 = cVar.f61192b;
                    q0VarX3 = cVar.f61194d;
                    i4Var = i4Var2;
                }
                if (q0VarX3 == null) {
                    q0VarX3 = r3.X3(aVar.f61288z.t(i10, new z3.d()).f61990c, (i4) androidx.media3.common.util.a.g(i4Var));
                    z10 = true;
                }
                if (aVar.f61268f != null) {
                    androidx.media3.common.util.a.b(aVar.f61266d == 1, "Player error only allowed in STATE_IDLE");
                }
                if (aVar.f61266d != 1 || aVar.f61266d == 4) {
                    androidx.media3.common.util.a.b(!aVar.f61271i, "isLoading only allowed when not in STATE_IDLE or STATE_ENDED");
                }
                gVarD = aVar.H;
                if (aVar.G != null) {
                    if (aVar.E != -1 && aVar.f61264b && aVar.f61266d == 3 && aVar.f61267e == 0 && aVar.G.longValue() != -9223372036854775807L) {
                        gVarD = g.b(aVar.G.longValue(), aVar.f61275m.f61874a);
                    } else {
                        gVarD = g.d(aVar.G.longValue());
                    }
                }
                gVarD2 = aVar.J;
                if (aVar.I != null) {
                    if (aVar.E == -1 && aVar.f61264b && aVar.f61266d == 3 && aVar.f61267e == 0) {
                        gVarD2 = g.b(aVar.I.longValue(), 1.0f);
                    } else {
                        gVarD2 = g.d(aVar.I.longValue());
                    }
                }
                this.f61237a = aVar.f61263a;
                this.f61238b = aVar.f61264b;
                this.f61239c = aVar.f61265c;
                this.f61240d = aVar.f61266d;
                this.f61241e = aVar.f61267e;
                this.f61242f = aVar.f61268f;
                this.f61243g = aVar.f61269g;
                this.f61244h = aVar.f61270h;
                this.f61245i = aVar.f61271i;
                this.f61246j = aVar.f61272j;
                this.f61247k = aVar.f61273k;
                this.f61248l = aVar.f61274l;
                this.f61249m = aVar.f61275m;
                this.f61250n = aVar.f61276n;
                this.f61251o = aVar.f61277o;
                this.f61252p = aVar.f61278p;
                this.f61253q = aVar.f61279q;
                this.f61254r = aVar.f61280r;
                this.f61255s = aVar.f61281s;
                this.f61256t = aVar.f61282t;
                this.f61257u = aVar.f61283u;
                this.f61258v = aVar.f61284v;
                this.f61259w = aVar.f61285w;
                this.f61260x = aVar.f61286x;
                this.f61261y = aVar.f61288z;
                this.f61262z = (i4) androidx.media3.common.util.a.g(i4Var);
                this.A = q0VarX3;
                this.B = aVar.C;
                this.C = aVar.D;
                this.D = aVar.E;
                this.E = aVar.F;
                this.F = gVarD;
                this.G = gVarD2;
                this.H = aVar.K;
                this.I = aVar.L;
                this.J = aVar.M;
                this.K = aVar.N;
                this.L = aVar.O;
                this.M = aVar.P;
                this.N = z10;
            }
            androidx.media3.common.util.a.b(aVar.f61266d == 1 || aVar.f61266d == 4, "Empty playlist only allowed in STATE_IDLE or STATE_ENDED");
            androidx.media3.common.util.a.b(aVar.E == -1 && aVar.F == -1, "Ads not allowed if playlist is empty");
            i4Var = i4Var == null ? i4.f60639b : i4Var;
            if (q0VarX3 == null) {
                q0VarX3 = q0.X0;
            }
            z10 = false;
            if (aVar.f61268f != null) {
                androidx.media3.common.util.a.b(aVar.f61266d == 1, "Player error only allowed in STATE_IDLE");
            }
            if (aVar.f61266d != 1) {
                androidx.media3.common.util.a.b(!aVar.f61271i, "isLoading only allowed when not in STATE_IDLE or STATE_ENDED");
            } else {
                androidx.media3.common.util.a.b(!aVar.f61271i, "isLoading only allowed when not in STATE_IDLE or STATE_ENDED");
            }
            gVarD = aVar.H;
            if (aVar.G != null) {
                if (aVar.E != -1) {
                    gVarD = g.d(aVar.G.longValue());
                } else {
                    gVarD = g.d(aVar.G.longValue());
                }
            }
            gVarD2 = aVar.J;
            if (aVar.I != null) {
                if (aVar.E == -1) {
                    gVarD2 = g.d(aVar.I.longValue());
                } else {
                    gVarD2 = g.d(aVar.I.longValue());
                }
            }
            this.f61237a = aVar.f61263a;
            this.f61238b = aVar.f61264b;
            this.f61239c = aVar.f61265c;
            this.f61240d = aVar.f61266d;
            this.f61241e = aVar.f61267e;
            this.f61242f = aVar.f61268f;
            this.f61243g = aVar.f61269g;
            this.f61244h = aVar.f61270h;
            this.f61245i = aVar.f61271i;
            this.f61246j = aVar.f61272j;
            this.f61247k = aVar.f61273k;
            this.f61248l = aVar.f61274l;
            this.f61249m = aVar.f61275m;
            this.f61250n = aVar.f61276n;
            this.f61251o = aVar.f61277o;
            this.f61252p = aVar.f61278p;
            this.f61253q = aVar.f61279q;
            this.f61254r = aVar.f61280r;
            this.f61255s = aVar.f61281s;
            this.f61256t = aVar.f61282t;
            this.f61257u = aVar.f61283u;
            this.f61258v = aVar.f61284v;
            this.f61259w = aVar.f61285w;
            this.f61260x = aVar.f61286x;
            this.f61261y = aVar.f61288z;
            this.f61262z = (i4) androidx.media3.common.util.a.g(i4Var);
            this.A = q0VarX3;
            this.B = aVar.C;
            this.C = aVar.D;
            this.D = aVar.E;
            this.E = aVar.F;
            this.F = gVarD;
            this.G = gVarD2;
            this.H = aVar.K;
            this.I = aVar.L;
            this.J = aVar.M;
            this.K = aVar.N;
            this.L = aVar.O;
            this.M = aVar.P;
            this.N = z10;
        }
    }

    protected r3(Looper looper) {
        this(looper, androidx.media3.common.util.j.f61520a);
    }

    public static /* synthetic */ h F2(r3 r3Var, List list, h hVar, int i10, long j10) {
        r3Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            arrayList.add(r3Var.h4((k0) list.get(i11)));
        }
        return o4(hVar, arrayList, i10, j10, r3Var.f60604b1);
    }

    public static /* synthetic */ h H2(r3 r3Var, h hVar, int i10, int i11) {
        List<c> listU3 = U3(hVar, r3Var.f61186g1, r3Var.f60604b1);
        androidx.media3.common.util.k1.T1(listU3, i10, i11);
        return n4(hVar, listU3, r3Var.f61186g1, r3Var.f60604b1);
    }

    public static /* synthetic */ h J2(r3 r3Var, boolean z10, h hVar, int i10, long j10) {
        if (!z10) {
            return o4(hVar, null, i10, j10, r3Var.f60604b1);
        }
        r3Var.getClass();
        return hVar;
    }

    private static boolean P4(h hVar) {
        return hVar.f61238b && hVar.f61240d == 3 && hVar.f61241e == 0;
    }

    public static /* synthetic */ h Q3(h hVar) {
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q4(Runnable runnable) {
        if (this.f61184e1.f() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.f61184e1.g(runnable);
        }
    }

    @il.m({"state"})
    private void R4(final List<k0> list, final int i10, final long j10) {
        androidx.media3.common.util.a.a(i10 == -1 || i10 >= 0);
        final h hVar = this.f61187h1;
        if (S4(20) || (list.size() == 1 && S4(31))) {
            U4(E4(list, i10, j10), new com.google.common.base.s0() { // from class: androidx.media3.common.g2
                @Override // com.google.common.base.s0
                public final Object get() {
                    return r3.F2(this.f60612a, list, hVar, i10, j10);
                }
            });
        }
    }

    @il.m({"state"})
    private boolean S4(int i10) {
        return !this.f61188i1 && this.f61187h1.f61237a.c(i10);
    }

    public static /* synthetic */ h T2(r3 r3Var, h hVar, List list, int i10, int i11) {
        List<c> listU3 = U3(hVar, r3Var.f61186g1, r3Var.f60604b1);
        for (int i12 = 0; i12 < list.size(); i12++) {
            listU3.add(i12 + i10, r3Var.h4((k0) list.get(i12)));
        }
        h hVarN4 = !hVar.f61261y.w() ? n4(hVar, listU3, r3Var.f61186g1, r3Var.f60604b1) : o4(hVar, listU3, hVar.C, hVar.F.get(), r3Var.f60604b1);
        if (i11 >= i10) {
            return hVarN4;
        }
        androidx.media3.common.util.k1.T1(listU3, i11, i10);
        return n4(hVarN4, listU3, r3Var.f61186g1, r3Var.f60604b1);
    }

    @il.m({"state"})
    private void T4(final h hVar, boolean z10, boolean z11) {
        h hVar2 = this.f61187h1;
        this.f61187h1 = hVar;
        if (hVar.K || hVar.f61259w) {
            this.f61187h1 = hVar.b().R().i0(false).Q();
        }
        int i10 = 3 >> 1;
        boolean z12 = hVar2.f61238b != hVar.f61238b;
        boolean z13 = hVar2.f61240d != hVar.f61240d;
        final int iJ4 = j4(hVar2, hVar, z10, this.f60604b1, this.f61186g1);
        boolean zEquals = hVar2.f61261y.equals(hVar.f61261y);
        final int iE4 = e4(hVar2, hVar, iJ4, z11, this.f60604b1);
        if (!zEquals) {
            final int iQ4 = q4(hVar2.f61261y, hVar.f61261y, this.f60604b1);
            this.f61182c1.i(0, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.l2
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    z0.g gVar = (z0.g) obj;
                    gVar.V(hVar.f61261y, iQ4);
                }
            });
        }
        if (iJ4 != -1) {
            final z0.k kVarK4 = k4(hVar2, false, this.f60604b1, this.f61186g1);
            final z0.k kVarK5 = k4(hVar, hVar.K, this.f60604b1, this.f61186g1);
            this.f61182c1.i(11, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.j1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    r3.k3(iJ4, kVarK4, kVarK5, (z0.g) obj);
                }
            });
        }
        if (iE4 != -1) {
            final k0 k0Var = hVar.f61261y.w() ? null : hVar.f61261y.t(a4(hVar), this.f60604b1).f61990c;
            this.f61182c1.i(1, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.v1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).l0(k0Var, iE4);
                }
            });
        }
        if (!Objects.equals(hVar2.f61242f, hVar.f61242f)) {
            this.f61182c1.i(10, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.x1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).w0(hVar.f61242f);
                }
            });
            if (hVar.f61242f != null) {
                this.f61182c1.i(10, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.y1
                    @Override // androidx.media3.common.util.y.a
                    public final void invoke(Object obj) {
                        ((z0.g) obj).O((x0) androidx.media3.common.util.k1.o(hVar.f61242f));
                    }
                });
            }
        }
        if (!hVar2.f61250n.equals(hVar.f61250n)) {
            this.f61182c1.i(19, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.z1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).k0(hVar.f61250n);
                }
            });
        }
        if (!hVar2.f61262z.equals(hVar.f61262z)) {
            this.f61182c1.i(2, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.b2
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).X(hVar.f61262z);
                }
            });
        }
        if (!hVar2.A.equals(hVar.A)) {
            this.f61182c1.i(14, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.c2
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).N(hVar.A);
                }
            });
        }
        if (hVar2.f61245i != hVar.f61245i) {
            this.f61182c1.i(3, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.d2
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    r3.g3(hVar, (z0.g) obj);
                }
            });
        }
        if (z12 || z13) {
            this.f61182c1.i(-1, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.e2
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    r3.h hVar3 = hVar;
                    ((z0.g) obj).C(hVar3.f61238b, hVar3.f61240d);
                }
            });
        }
        if (z13) {
            this.f61182c1.i(4, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.w2
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).h0(hVar.f61240d);
                }
            });
        }
        if (z12 || hVar2.f61239c != hVar.f61239c) {
            this.f61182c1.i(5, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.h3
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    r3.h hVar3 = hVar;
                    ((z0.g) obj).a0(hVar3.f61238b, hVar3.f61239c);
                }
            });
        }
        if (hVar2.f61241e != hVar.f61241e) {
            this.f61182c1.i(6, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.n3
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).f0(hVar.f61241e);
                }
            });
        }
        if (P4(hVar2) != P4(hVar)) {
            int i11 = 0 << 7;
            this.f61182c1.i(7, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.o3
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).e0(r3.P4(hVar));
                }
            });
        }
        if (!hVar2.f61249m.equals(hVar.f61249m)) {
            this.f61182c1.i(12, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.p3
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).u(hVar.f61249m);
                }
            });
        }
        if (hVar2.f61243g != hVar.f61243g) {
            this.f61182c1.i(8, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.q3
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).x(hVar.f61243g);
                }
            });
        }
        if (hVar2.f61244h != hVar.f61244h) {
            this.f61182c1.i(9, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.f1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).n(hVar.f61244h);
                }
            });
        }
        if (hVar2.f61246j != hVar.f61246j) {
            this.f61182c1.i(16, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.g1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).j0(hVar.f61246j);
                }
            });
        }
        if (hVar2.f61247k != hVar.f61247k) {
            this.f61182c1.i(17, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.h1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).W(hVar.f61247k);
                }
            });
        }
        if (hVar2.f61248l != hVar.f61248l) {
            this.f61182c1.i(18, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.i1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).x0(hVar.f61248l);
                }
            });
        }
        if (!hVar2.f61251o.equals(hVar.f61251o)) {
            this.f61182c1.i(20, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.k1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).r0(hVar.f61251o);
                }
            });
        }
        if (!hVar2.f61253q.equals(hVar.f61253q)) {
            this.f61182c1.i(25, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.l1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).a(hVar.f61253q);
                }
            });
        }
        if (!hVar2.f61255s.equals(hVar.f61255s)) {
            this.f61182c1.i(29, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.m1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).Y(hVar.f61255s);
                }
            });
        }
        if (!hVar2.B.equals(hVar.B)) {
            this.f61182c1.i(15, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.n1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).v0(hVar.B);
                }
            });
        }
        if (hVar.f61259w) {
            this.f61182c1.i(26, new o1());
        }
        if (!hVar2.f61258v.equals(hVar.f61258v)) {
            this.f61182c1.i(24, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.q1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    r3.h hVar3 = hVar;
                    ((z0.g) obj).z(hVar3.f61258v.b(), hVar3.f61258v.a());
                }
            });
        }
        if (hVar2.f61252p != hVar.f61252p) {
            this.f61182c1.i(22, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.r1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).B(hVar.f61252p);
                }
            });
        }
        if (hVar2.f61256t != hVar.f61256t || hVar2.f61257u != hVar.f61257u) {
            this.f61182c1.i(30, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.s1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    r3.h hVar3 = hVar;
                    ((z0.g) obj).M(hVar3.f61256t, hVar3.f61257u);
                }
            });
        }
        if (!hVar2.f61254r.equals(hVar.f61254r)) {
            this.f61182c1.i(27, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.t1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    r3.w3(hVar, (z0.g) obj);
                }
            });
        }
        if (!hVar2.f61260x.equals(hVar.f61260x) && hVar.f61260x.f61177b != -9223372036854775807L) {
            this.f61182c1.i(28, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.u1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).F(hVar.f61260x);
                }
            });
        }
        if (!hVar2.f61237a.equals(hVar.f61237a)) {
            this.f61182c1.i(13, new androidx.media3.common.util.y.a() { // from class: androidx.media3.common.w1
                @Override // androidx.media3.common.util.y.a
                public final void invoke(Object obj) {
                    ((z0.g) obj).Q(hVar.f61237a);
                }
            });
        }
        this.f61182c1.g();
    }

    public static /* synthetic */ void U2(r3 r3Var, com.google.common.util.concurrent.t1 t1Var) {
        androidx.media3.common.util.k1.o(r3Var.f61187h1);
        r3Var.f61185f1.remove(t1Var);
        if (!r3Var.f61185f1.isEmpty() || r3Var.f61188i1) {
            return;
        }
        r3Var.T4(r3Var.m4(), false, false);
    }

    private static List<c> U3(h hVar, z3.b bVar, z3.d dVar) {
        if (hVar.f61261y instanceof f) {
            return new ArrayList(((f) hVar.f61261y).f61232e);
        }
        ArrayList arrayList = new ArrayList(hVar.f61261y.v());
        for (int i10 = 0; i10 < hVar.f61261y.v(); i10++) {
            arrayList.add(c.e(hVar, i10, bVar, dVar));
        }
        return arrayList;
    }

    @il.m({"state"})
    private void U4(com.google.common.util.concurrent.t1<?> t1Var, com.google.common.base.s0<h> s0Var) {
        V4(t1Var, s0Var, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static h V3(h.a aVar, h hVar, long j10, z3 z3Var, int i10, long j11, boolean z10, z3.d dVar) {
        long jC;
        int i11 = i10;
        long jL4 = l4(j10, hVar, dVar);
        boolean z11 = false;
        if (z3Var.w() || (i11 != -1 && i11 < z3Var.v())) {
            jC = j11;
        } else {
            jC = -9223372036854775807L;
            i11 = 0;
        }
        if (!z3Var.w() && jC == -9223372036854775807L) {
            jC = z3Var.t(i11, dVar).c();
        }
        boolean z12 = hVar.f61261y.w() || z3Var.w();
        boolean z13 = (z12 || hVar.f61261y.t(a4(hVar), dVar).f61988a.equals(z3Var.t(i11, dVar).f61988a)) ? false : true;
        if (z3Var.w()) {
            aVar.o0(z3Var, i4.f60639b, null);
        } else if (z3Var instanceof f) {
            c cVar = (c) ((f) z3Var).f61232e.get(i11);
            aVar.o0(z3Var, cVar.f61192b, cVar.f61194d);
        } else {
            if (!z12 && !z13) {
                z11 = true;
            }
            aVar.o0(z3Var, z11 ? hVar.f61262z : i4.f60639b, z11 ? hVar.A : null);
        }
        if (z12 || z13 || jC < jL4) {
            aVar.c0(i11).a0(-1, -1).Y(jC).X(g.d(jC)).y0(g.f61236a);
        } else if (jC == jL4) {
            aVar.c0(i11);
            if (hVar.D == -1 || !z10) {
                aVar.a0(-1, -1).y0(g.d(Y3(hVar, dVar) - jL4));
            } else {
                aVar.y0(g.d(hVar.I.get() - hVar.G.get()));
            }
        } else {
            aVar.c0(i11).a0(-1, -1).Y(jC).X(g.d(Math.max(Y3(hVar, dVar), jC))).y0(g.d(Math.max(0L, hVar.J.get() - (jC - jL4))));
        }
        return aVar.Q();
    }

    @il.m({"state"})
    private void V4(final com.google.common.util.concurrent.t1<?> t1Var, com.google.common.base.s0<h> s0Var, boolean z10, boolean z11) {
        if (t1Var.isDone() && this.f61185f1.isEmpty()) {
            T4(m4(), z10, z11);
            return;
        }
        this.f61185f1.add(t1Var);
        T4(i4(s0Var.get()), z10, z11);
        t1Var.m0(new Runnable() { // from class: androidx.media3.common.i2
            @Override // java.lang.Runnable
            public final void run() {
                r3.U2(this.f60636a, t1Var);
            }
        }, new Executor() { // from class: androidx.media3.common.j2
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f60788a.Q4(runnable);
            }
        });
    }

    public static /* synthetic */ com.google.common.util.concurrent.t1 W2(com.google.common.util.concurrent.t1 t1Var, Object obj) {
        return t1Var;
    }

    private void W3(@androidx.annotation.p0 Object obj) {
        X4();
        final h hVar = this.f61187h1;
        if (S4(27)) {
            U4(s4(obj), new com.google.common.base.s0() { // from class: androidx.media3.common.z2
                @Override // com.google.common.base.s0
                public final Object get() {
                    return hVar.b().w0(androidx.media3.common.util.r0.f61639d).Q();
                }
            });
        }
    }

    public static /* synthetic */ void X2(r3 r3Var, z0.g gVar, s sVar) {
        r3Var.getClass();
        gVar.S(r3Var, new z0.f(sVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static q0 X3(k0 k0Var, i4 i4Var) {
        q0.b bVar = new q0.b();
        int size = i4Var.c().size();
        for (int i10 = 0; i10 < size; i10++) {
            i4.a aVar = i4Var.c().get(i10);
            for (int i11 = 0; i11 < aVar.f60646a; i11++) {
                if (aVar.k(i11)) {
                    w wVarD = aVar.d(i11);
                    if (wVarD.f61758l != null) {
                        for (int i12 = 0; i12 < wVarD.f61758l.e(); i12++) {
                            wVarD.f61758l.d(i12).a(bVar);
                        }
                    }
                }
            }
        }
        return bVar.L(k0Var.f60825e).J();
    }

    @il.d({"state"})
    private void X4() {
        W4();
        if (this.f61187h1 == null) {
            this.f61187h1 = m4();
        }
    }

    private static long Y3(h hVar, z3.d dVar) {
        return l4(hVar.H.get(), hVar, dVar);
    }

    private static long Z3(h hVar, z3.d dVar) {
        return l4(hVar.F.get(), hVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a4(h hVar) {
        int i10 = hVar.C;
        if (i10 != -1) {
            return i10;
        }
        return 0;
    }

    private static int b4(h hVar, z3.d dVar, z3.b bVar) {
        int iA4 = a4(hVar);
        return hVar.f61261y.w() ? iA4 : f4(hVar.f61261y, iA4, Z3(hVar, dVar), dVar, bVar);
    }

    private static long c4(h hVar, Object obj, z3.b bVar, z3.d dVar) {
        return hVar.D != -1 ? hVar.G.get() : Z3(hVar, dVar) - hVar.f61261y.l(obj, bVar).p();
    }

    private static int d4(z3 z3Var, z3 z3Var2, int i10, z3.b bVar, z3.d dVar) {
        if (z3Var.w()) {
            if (i10 < z3Var2.v()) {
                return i10;
            }
            return -1;
        }
        Object objG = androidx.media3.common.util.a.g(z3Var.k(z3Var.t(i10, dVar).f62001n, bVar, true).f61968b);
        if (z3Var2.f(objG) == -1) {
            return -1;
        }
        return z3Var2.l(objG, bVar).f61969c;
    }

    private static int e4(h hVar, h hVar2, int i10, boolean z10, z3.d dVar) {
        z3 z3Var = hVar.f61261y;
        z3 z3Var2 = hVar2.f61261y;
        if (z3Var2.w() && z3Var.w()) {
            return -1;
        }
        if (z3Var2.w() != z3Var.w()) {
            return 3;
        }
        Object obj = hVar.f61261y.t(a4(hVar), dVar).f61988a;
        Object obj2 = hVar2.f61261y.t(a4(hVar2), dVar).f61988a;
        if ((obj instanceof e) && !(obj2 instanceof e)) {
            return -1;
        }
        if (!obj.equals(obj2)) {
            if (i10 == 0) {
                return 1;
            }
            return i10 == 1 ? 2 : 3;
        }
        if (i10 != 0 || Z3(hVar, dVar) <= Z3(hVar2, dVar)) {
            return (i10 == 1 && z10) ? 2 : -1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f4(z3 z3Var, int i10, long j10, z3.d dVar, z3.b bVar) {
        return z3Var.f(z3Var.p(dVar, bVar, i10, androidx.media3.common.util.k1.D1(j10)).first);
    }

    public static /* synthetic */ void g3(h hVar, z0.g gVar) {
        gVar.j(hVar.f61245i);
        gVar.q0(hVar.f61245i);
    }

    private static long g4(h hVar, Object obj, z3.b bVar) {
        hVar.f61261y.l(obj, bVar);
        int i10 = hVar.D;
        return androidx.media3.common.util.k1.A2(i10 == -1 ? bVar.f61970d : bVar.c(i10, hVar.E));
    }

    public static /* synthetic */ h i3(r3 r3Var, h hVar, List list, int i10) {
        List<c> listU3 = U3(hVar, r3Var.f61186g1, r3Var.f60604b1);
        for (int i11 = 0; i11 < list.size(); i11++) {
            listU3.add(i11 + i10, r3Var.h4((k0) list.get(i11)));
        }
        return !hVar.f61261y.w() ? n4(hVar, listU3, r3Var.f61186g1, r3Var.f60604b1) : o4(hVar, listU3, hVar.C, hVar.F.get(), r3Var.f60604b1);
    }

    private static int j4(h hVar, h hVar2, boolean z10, z3.d dVar, z3.b bVar) {
        if (hVar2.K) {
            return hVar2.L;
        }
        if (z10) {
            return 1;
        }
        if (hVar.f61261y.w()) {
            return -1;
        }
        if (hVar2.f61261y.w()) {
            return 4;
        }
        Object objS = hVar.f61261y.s(b4(hVar, dVar, bVar));
        Object objS2 = hVar2.f61261y.s(b4(hVar2, dVar, bVar));
        if ((objS instanceof e) && !(objS2 instanceof e)) {
            return -1;
        }
        if (objS2.equals(objS) && hVar.D == hVar2.D && hVar.E == hVar2.E) {
            long jC4 = c4(hVar, objS, bVar, dVar);
            if (Math.abs(jC4 - c4(hVar2, objS2, bVar, dVar)) < 1000) {
                return -1;
            }
            long jG4 = g4(hVar, objS, bVar);
            return (jG4 == -9223372036854775807L || jC4 < jG4) ? 5 : 0;
        }
        if (hVar2.f61261y.f(objS) == -1) {
            return 4;
        }
        long jC5 = c4(hVar, objS, bVar, dVar);
        long jG5 = g4(hVar, objS, bVar);
        return (jG5 == -9223372036854775807L || jC5 < jG5) ? 3 : 0;
    }

    public static /* synthetic */ void k3(int i10, z0.k kVar, z0.k kVar2, z0.g gVar) {
        gVar.A(i10);
        gVar.d0(kVar, kVar2, i10);
    }

    private static z0.k k4(h hVar, boolean z10, z3.d dVar, z3.b bVar) {
        k0 k0Var;
        Object obj;
        Object obj2;
        int i10;
        long jZ3;
        long j10;
        int iA4 = a4(hVar);
        if (hVar.f61261y.w()) {
            k0Var = null;
            obj = null;
            obj2 = null;
            i10 = -1;
        } else {
            int iB4 = b4(hVar, dVar, bVar);
            Object obj3 = hVar.f61261y.k(iB4, bVar, true).f61968b;
            obj = hVar.f61261y.t(iA4, dVar).f61988a;
            obj2 = obj3;
            k0Var = dVar.f61990c;
            i10 = iB4;
        }
        if (z10) {
            j10 = hVar.M;
            jZ3 = hVar.D == -1 ? j10 : Z3(hVar, dVar);
        } else {
            jZ3 = Z3(hVar, dVar);
            j10 = hVar.D != -1 ? hVar.G.get() : jZ3;
        }
        return new z0.k(obj, iA4, k0Var, obj2, i10, j10, jZ3, hVar.D, hVar.E);
    }

    private static long l4(long j10, h hVar, z3.d dVar) {
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        if (hVar.f61261y.w()) {
            return 0L;
        }
        return hVar.f61261y.t(a4(hVar), dVar).c();
    }

    public static /* synthetic */ h n3(r3 r3Var, h hVar, int i10, int i11, int i12) {
        List<c> listU3 = U3(hVar, r3Var.f61186g1, r3Var.f60604b1);
        androidx.media3.common.util.k1.C1(listU3, i10, i11, i12);
        return n4(hVar, listU3, r3Var.f61186g1, r3Var.f60604b1);
    }

    private static h n4(h hVar, List<c> list, z3.b bVar, z3.d dVar) {
        h.a aVarB = hVar.b();
        f fVar = new f(list);
        z3 z3Var = hVar.f61261y;
        long j10 = hVar.F.get();
        int iA4 = a4(hVar);
        int iD4 = d4(z3Var, fVar, iA4, bVar, dVar);
        long j11 = iD4 == -1 ? -9223372036854775807L : j10;
        for (int i10 = iA4 + 1; iD4 == -1 && i10 < z3Var.v(); i10++) {
            iD4 = d4(z3Var, fVar, i10, bVar, dVar);
        }
        if (hVar.f61240d != 1 && iD4 == -1) {
            aVarB.l0(4).g0(false);
        }
        return V3(aVarB, hVar, j10, fVar, iD4, j11, true, dVar);
    }

    private static h o4(h hVar, @androidx.annotation.p0 List<c> list, int i10, long j10, z3.d dVar) {
        h.a aVarB = hVar.b();
        z3 fVar = list == null ? hVar.f61261y : new f(list);
        if (hVar.f61240d != 1) {
            if (fVar.w() || (i10 != -1 && i10 >= fVar.v())) {
                aVarB.l0(4).g0(false);
            } else {
                aVarB.l0(2);
            }
        }
        return V3(aVarB, hVar, hVar.F.get(), fVar, i10, j10, false, dVar);
    }

    private static androidx.media3.common.util.r0 p4(SurfaceHolder surfaceHolder) {
        if (!surfaceHolder.getSurface().isValid()) {
            return androidx.media3.common.util.r0.f61639d;
        }
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        return new androidx.media3.common.util.r0(surfaceFrame.width(), surfaceFrame.height());
    }

    private static int q4(z3 z3Var, z3 z3Var2, z3.d dVar) {
        if (z3Var.v() != z3Var2.v()) {
            return 0;
        }
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= z3Var.v()) {
                return 1;
            }
            Object obj = z3Var.t(i10, dVar).f61988a;
            Object obj2 = z3Var2.t(i10, dVar).f61988a;
            if (!(obj instanceof e) || (obj2 instanceof e)) {
                z10 = false;
            }
            if (!obj.equals(obj2) && !z10) {
                return 0;
            }
            i10++;
        }
    }

    public static /* synthetic */ h v3(r3 r3Var, h hVar) {
        r3Var.getClass();
        return hVar.b().l0(1).y0(g.f61236a).X(g.d(Z3(hVar, r3Var.f60604b1))).S(hVar.G).g0(false).Q();
    }

    public static /* synthetic */ void w3(h hVar, z0.g gVar) {
        gVar.i(hVar.f61254r.f61412a);
        gVar.E(hVar.f61254r);
    }

    @Override // androidx.media3.common.z0
    public final void A() {
        X4();
        final h hVar = this.f61187h1;
        if (S4(2)) {
            U4(w4(), new com.google.common.base.s0() { // from class: androidx.media3.common.i3
                @Override // com.google.common.base.s0
                public final Object get() {
                    r3.h hVar2 = hVar;
                    return hVar2.b().n0(null).l0(hVar2.f61261y.w() ? 4 : 2).Q();
                }
            });
        }
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> A4(int i10, long j10, int i11) {
        throw new IllegalStateException("Missing implementation to handle one of the COMMAND_SEEK_*");
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public final void B1() {
        X4();
        final h hVar = this.f61187h1;
        if (S4(26)) {
            U4(t4(1), new com.google.common.base.s0() { // from class: androidx.media3.common.p2
                @Override // com.google.common.base.s0
                public final Object get() {
                    r3.h hVar2 = hVar;
                    return hVar2.b().e0(Math.max(0, hVar2.f61256t - 1)).Q();
                }
            });
        }
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> B4(androidx.media3.common.d dVar, boolean z10) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_AUDIO_ATTRIBUTES");
    }

    @Override // androidx.media3.common.z0
    public final int C() {
        X4();
        return this.f61187h1.f61243g;
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> C4(boolean z10, int i10) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @Override // androidx.media3.common.z0
    public final void D(final int i10) {
        X4();
        final h hVar = this.f61187h1;
        if (S4(15)) {
            U4(I4(i10), new com.google.common.base.s0() { // from class: androidx.media3.common.s2
                @Override // com.google.common.base.s0
                public final Object get() {
                    return hVar.b().s0(i10).Q();
                }
            });
        }
    }

    @Override // androidx.media3.common.z0
    public final void D0(int i10) {
        X4();
        final h hVar = this.f61187h1;
        if (S4(34)) {
            U4(u4(i10), new com.google.common.base.s0() { // from class: androidx.media3.common.k2
                @Override // com.google.common.base.s0
                public final Object get() {
                    r3.h hVar2 = hVar;
                    return hVar2.b().e0(hVar2.f61256t + 1).Q();
                }
            });
        }
    }

    @Override // androidx.media3.common.z0
    public final androidx.media3.common.util.r0 D1() {
        X4();
        return this.f61187h1.f61258v;
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> D4(@androidx.annotation.g0(from = 0) int i10, int i11) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_DEVICE_VOLUME or COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS");
    }

    @Override // androidx.media3.common.z0
    public final int E() {
        X4();
        return this.f61187h1.D;
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> E4(List<k0> list, int i10, long j10) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_MEDIA_ITEM(S)");
    }

    @Override // androidx.media3.common.z0
    public final void F0(final q0 q0Var) {
        X4();
        final h hVar = this.f61187h1;
        if (S4(19)) {
            U4(H4(q0Var), new com.google.common.base.s0() { // from class: androidx.media3.common.r2
                @Override // com.google.common.base.s0
                public final Object get() {
                    return hVar.b().q0(q0Var).Q();
                }
            });
        }
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> F4(boolean z10) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PLAY_PAUSE");
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> G4(y0 y0Var) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SPEED_AND_PITCH");
    }

    @Override // androidx.media3.common.z0
    public final int H() {
        X4();
        return this.f61187h1.f61240d;
    }

    @Override // androidx.media3.common.z0
    public final void H0(final int i10, int i11) {
        final int iMin;
        X4();
        androidx.media3.common.util.a.a(i10 >= 0 && i11 >= i10);
        final h hVar = this.f61187h1;
        int iV = hVar.f61261y.v();
        if (!S4(20) || iV == 0 || i10 >= iV || i10 == (iMin = Math.min(i11, iV))) {
            return;
        }
        U4(y4(i10, iMin), new com.google.common.base.s0() { // from class: androidx.media3.common.e3
            @Override // com.google.common.base.s0
            public final Object get() {
                return r3.H2(this.f60509a, hVar, i10, iMin);
            }
        });
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> H4(q0 q0Var) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_PLAYLIST_METADATA");
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> I4(int i10) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_REPEAT_MODE");
    }

    @Override // androidx.media3.common.z0
    public final boolean J() {
        X4();
        return this.f61187h1.f61238b;
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> J4(boolean z10) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SHUFFLE_MODE");
    }

    @Override // androidx.media3.common.z0
    public final void K(final boolean z10) {
        X4();
        final h hVar = this.f61187h1;
        if (S4(14)) {
            U4(J4(z10), new com.google.common.base.s0() { // from class: androidx.media3.common.n2
                @Override // com.google.common.base.s0
                public final Object get() {
                    return hVar.b().v0(z10).Q();
                }
            });
        }
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> K4(e4 e4Var) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_TRACK_SELECTION_PARAMETERS");
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> L4(Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    @Override // androidx.media3.common.z0
    public final i4 M0() {
        X4();
        return this.f61187h1.f61262z;
    }

    @Override // androidx.media3.common.z0
    public final void M1(int i10) {
        X4();
        final h hVar = this.f61187h1;
        if (S4(34)) {
            U4(t4(i10), new com.google.common.base.s0() { // from class: androidx.media3.common.j3
                @Override // com.google.common.base.s0
                public final Object get() {
                    r3.h hVar2 = hVar;
                    return hVar2.b().e0(Math.max(0, hVar2.f61256t - 1)).Q();
                }
            });
        }
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> M4(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f10) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VOLUME");
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> N4() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_STOP");
    }

    @Override // androidx.media3.common.z0
    public final int O() {
        X4();
        return b4(this.f61187h1, this.f60604b1, this.f61186g1);
    }

    protected final void O4() {
        X4();
        if (this.f61185f1.isEmpty() && !this.f61188i1) {
            T4(m4(), false, false);
        }
    }

    @Override // androidx.media3.common.z0
    public final int P() {
        X4();
        return this.f61187h1.E;
    }

    @Override // androidx.media3.common.z0
    public final androidx.media3.common.text.d P1() {
        X4();
        return this.f61187h1.f61254r;
    }

    @Override // androidx.media3.common.z0
    public final void Q1(z0.g gVar) {
        X4();
        this.f61182c1.k(gVar);
    }

    @Override // androidx.media3.common.z0
    public final long R() {
        X4();
        return Math.max(Y3(this.f61187h1, this.f60604b1), Z3(this.f61187h1, this.f60604b1));
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public final void R0(final boolean z10) {
        X4();
        final h hVar = this.f61187h1;
        if (S4(26)) {
            U4(C4(z10, 1), new com.google.common.base.s0() { // from class: androidx.media3.common.y2
                @Override // com.google.common.base.s0
                public final Object get() {
                    return hVar.b().f0(z10).Q();
                }
            });
        }
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public final void U0() {
        X4();
        final h hVar = this.f61187h1;
        if (S4(26)) {
            U4(u4(1), new com.google.common.base.s0() { // from class: androidx.media3.common.b3
                @Override // com.google.common.base.s0
                public final Object get() {
                    r3.h hVar2 = hVar;
                    return hVar2.b().e0(hVar2.f61256t + 1).Q();
                }
            });
        }
    }

    @Override // androidx.media3.common.z0
    public final void U1(z0.g gVar) {
        this.f61182c1.c((z0.g) androidx.media3.common.util.a.g(gVar));
    }

    @Override // androidx.media3.common.z0
    public final q0 V() {
        X4();
        return this.f61187h1.B;
    }

    @Override // androidx.media3.common.z0
    public final e4 V0() {
        X4();
        return this.f61187h1.f61250n;
    }

    @Override // androidx.media3.common.z0
    public final int V1() {
        X4();
        return this.f61187h1.f61241e;
    }

    @Override // androidx.media3.common.z0
    public final int W0() {
        X4();
        return this.f61187h1.f61256t;
    }

    protected final void W4() {
        if (Thread.currentThread() != this.f61183d1.getThread()) {
            throw new IllegalStateException(androidx.media3.common.util.k1.S("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\n", Thread.currentThread().getName(), this.f61183d1.getThread().getName()));
        }
    }

    @Override // androidx.media3.common.z0
    public final long Z0() {
        X4();
        return this.f61187h1.f61248l;
    }

    @Override // androidx.media3.common.z0
    @androidx.annotation.p0
    public final x0 a() {
        X4();
        return this.f61187h1.f61242f;
    }

    @Override // androidx.media3.common.z0
    public final z0.c a2() {
        X4();
        return this.f61187h1.f61237a;
    }

    @Override // androidx.media3.common.z0
    public final void b0(final boolean z10) {
        X4();
        final h hVar = this.f61187h1;
        if (S4(1)) {
            U4(F4(z10), new com.google.common.base.s0() { // from class: androidx.media3.common.e1
                @Override // com.google.common.base.s0
                public final Object get() {
                    return hVar.b().j0(z10, 1).Q();
                }
            });
        }
    }

    @Override // androidx.media3.common.z0
    public final void b2(final int i10, int i11) {
        X4();
        final h hVar = this.f61187h1;
        if (S4(33)) {
            U4(D4(i10, i11), new com.google.common.base.s0() { // from class: androidx.media3.common.o2
                @Override // com.google.common.base.s0
                public final Object get() {
                    return hVar.b().e0(i10).Q();
                }
            });
        }
    }

    @Override // androidx.media3.common.z0
    public final y0 c() {
        X4();
        return this.f61187h1.f61249m;
    }

    @Override // androidx.media3.common.z0
    public final z3 c0() {
        X4();
        return this.f61187h1.f61261y;
    }

    @Override // androidx.media3.common.z0
    public final void c1(final androidx.media3.common.d dVar, boolean z10) {
        X4();
        final h hVar = this.f61187h1;
        if (S4(35)) {
            U4(B4(dVar, z10), new com.google.common.base.s0() { // from class: androidx.media3.common.c3
                @Override // com.google.common.base.s0
                public final Object get() {
                    return hVar.b().V(dVar).Q();
                }
            });
        }
    }

    @Override // androidx.media3.common.z0
    public final boolean d() {
        X4();
        return this.f61187h1.f61245i;
    }

    @Override // androidx.media3.common.z0
    public final Looper d0() {
        return this.f61183d1;
    }

    @Override // androidx.media3.common.z0
    public final o d1() {
        X4();
        return this.f61187h1.f61255s;
    }

    @Override // androidx.media3.common.z0
    public final androidx.media3.common.d e() {
        X4();
        return this.f61187h1.f61251o;
    }

    @Override // androidx.media3.common.z0
    public final void f(final float f10) {
        X4();
        final h hVar = this.f61187h1;
        if (S4(24)) {
            U4(M4(f10), new com.google.common.base.s0() { // from class: androidx.media3.common.t2
                @Override // com.google.common.base.s0
                public final Object get() {
                    return hVar.b().B0(f10).Q();
                }
            });
        }
    }

    @Override // androidx.media3.common.z0
    public final void f0(@androidx.annotation.p0 TextureView textureView) {
        X4();
        final h hVar = this.f61187h1;
        if (S4(27)) {
            if (textureView == null) {
                m0();
            } else {
                final androidx.media3.common.util.r0 r0Var = textureView.isAvailable() ? new androidx.media3.common.util.r0(textureView.getWidth(), textureView.getHeight()) : androidx.media3.common.util.r0.f61639d;
                U4(L4(textureView), new com.google.common.base.s0() { // from class: androidx.media3.common.a2
                    @Override // com.google.common.base.s0
                    public final Object get() {
                        return hVar.b().w0(r0Var).Q();
                    }
                });
            }
        }
    }

    @Override // androidx.media3.common.z0
    public final void g2(int i10, final List<k0> list) {
        X4();
        androidx.media3.common.util.a.a(i10 >= 0);
        final h hVar = this.f61187h1;
        int iV = hVar.f61261y.v();
        if (S4(20) && !list.isEmpty()) {
            final int iMin = Math.min(i10, iV);
            U4(r4(iMin, list), new com.google.common.base.s0() { // from class: androidx.media3.common.m2
                @Override // com.google.common.base.s0
                public final Object get() {
                    return r3.i3(this.f60979a, hVar, list, iMin);
                }
            });
        }
    }

    @Override // androidx.media3.common.z0
    public final long getCurrentPosition() {
        X4();
        return x() ? this.f61187h1.G.get() : n0();
    }

    @Override // androidx.media3.common.z0
    public final long getDuration() {
        X4();
        if (!x()) {
            return N();
        }
        this.f61187h1.f61261y.j(O(), this.f61186g1);
        z3.b bVar = this.f61186g1;
        h hVar = this.f61187h1;
        return androidx.media3.common.util.k1.A2(bVar.c(hVar.D, hVar.E));
    }

    @Override // androidx.media3.common.z0
    public final void h(final y0 y0Var) {
        X4();
        final h hVar = this.f61187h1;
        if (S4(13)) {
            U4(G4(y0Var), new com.google.common.base.s0() { // from class: androidx.media3.common.k3
                @Override // com.google.common.base.s0
                public final Object get() {
                    return hVar.b().k0(y0Var).Q();
                }
            });
        }
    }

    @Override // androidx.media3.common.z0
    public final n4 h0() {
        X4();
        return this.f61187h1.f61253q;
    }

    @Override // androidx.media3.common.z0
    public final void h1(List<k0> list, int i10, long j10) {
        X4();
        if (i10 == -1) {
            h hVar = this.f61187h1;
            int i11 = hVar.C;
            long j11 = hVar.F.get();
            i10 = i11;
            j10 = j11;
        }
        R4(list, i10, j10);
    }

    @z7.g
    protected c h4(k0 k0Var) {
        return new c.a(new e()).z(k0Var).u(true).v(true).q();
    }

    @Override // androidx.media3.common.z0
    public final void i(@androidx.annotation.p0 Surface surface) {
        X4();
        final h hVar = this.f61187h1;
        if (S4(27)) {
            if (surface == null) {
                m0();
            } else {
                U4(L4(surface), new com.google.common.base.s0() { // from class: androidx.media3.common.h2
                    @Override // com.google.common.base.s0
                    public final Object get() {
                        return hVar.b().w0(androidx.media3.common.util.r0.f61638c).Q();
                    }
                });
            }
        }
    }

    @Override // androidx.media3.common.z0
    public final long i1() {
        X4();
        return this.f61187h1.f61247k;
    }

    @z7.g
    protected h i4(h hVar) {
        return hVar;
    }

    @Override // androidx.media3.common.z0
    public final void j(@androidx.annotation.p0 final SurfaceView surfaceView) {
        X4();
        final h hVar = this.f61187h1;
        if (S4(27)) {
            if (surfaceView == null) {
                m0();
            } else {
                U4(L4(surfaceView), new com.google.common.base.s0() { // from class: androidx.media3.common.x2
                    @Override // com.google.common.base.s0
                    public final Object get() {
                        return hVar.b().w0(r3.p4(surfaceView.getHolder())).Q();
                    }
                });
            }
        }
    }

    @Override // androidx.media3.common.z0
    public final float k0() {
        X4();
        return this.f61187h1.f61252p;
    }

    @Override // androidx.media3.common.z0
    public final void l(@androidx.annotation.p0 final SurfaceHolder surfaceHolder) {
        X4();
        final h hVar = this.f61187h1;
        if (S4(27)) {
            if (surfaceHolder == null) {
                m0();
            } else {
                U4(L4(surfaceHolder), new com.google.common.base.s0() { // from class: androidx.media3.common.u2
                    @Override // com.google.common.base.s0
                    public final Object get() {
                        return hVar.b().w0(r3.p4(surfaceHolder)).Q();
                    }
                });
            }
        }
    }

    @Override // androidx.media3.common.z0
    public final int l0() {
        X4();
        return a4(this.f61187h1);
    }

    @Override // androidx.media3.common.z0
    public final void m(@androidx.annotation.p0 SurfaceHolder surfaceHolder) {
        W3(surfaceHolder);
    }

    @Override // androidx.media3.common.z0
    public final void m0() {
        W3(null);
    }

    @z7.g
    protected abstract h m4();

    @Override // androidx.media3.common.z0
    public final long n0() {
        X4();
        return Z3(this.f61187h1, this.f60604b1);
    }

    @Override // androidx.media3.common.z0
    public final void n1(final e4 e4Var) {
        X4();
        final h hVar = this.f61187h1;
        if (S4(29)) {
            U4(K4(e4Var), new com.google.common.base.s0() { // from class: androidx.media3.common.m3
                @Override // com.google.common.base.s0
                public final Object get() {
                    return hVar.b().z0(e4Var).Q();
                }
            });
        }
    }

    @Override // androidx.media3.common.z0
    public final void o2(final int i10, int i11, int i12) {
        X4();
        androidx.media3.common.util.a.a(i10 >= 0 && i11 >= i10 && i12 >= 0);
        final h hVar = this.f61187h1;
        int iV = hVar.f61261y.v();
        if (S4(20) && iV != 0 && i10 < iV) {
            final int iMin = Math.min(i11, iV);
            final int iMin2 = Math.min(i12, iV - (iMin - i10));
            if (i10 != iMin && iMin2 != i10) {
                U4(v4(i10, iMin, iMin2), new com.google.common.base.s0() { // from class: androidx.media3.common.a3
                    @Override // com.google.common.base.s0
                    public final Object get() {
                        return r3.n3(this.f60293a, hVar, i10, iMin, iMin2);
                    }
                });
            }
        }
    }

    @Override // androidx.media3.common.z0
    public final void p(@androidx.annotation.p0 TextureView textureView) {
        W3(textureView);
    }

    @Override // androidx.media3.common.z0
    public final boolean q1() {
        X4();
        return this.f61187h1.f61257u;
    }

    @Override // androidx.media3.common.z0
    public final void r0(@androidx.annotation.p0 SurfaceView surfaceView) {
        W3(surfaceView);
    }

    @Override // androidx.media3.common.z0
    @Deprecated
    public final void r2(final int i10) {
        X4();
        final h hVar = this.f61187h1;
        if (S4(25)) {
            U4(D4(i10, 1), new com.google.common.base.s0() { // from class: androidx.media3.common.p1
                @Override // com.google.common.base.s0
                public final Object get() {
                    return hVar.b().e0(i10).Q();
                }
            });
        }
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> r4(int i10, List<k0> list) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @Override // androidx.media3.common.z0
    public final void release() {
        X4();
        final h hVar = this.f61187h1;
        if (S4(32)) {
            U4(x4(), new com.google.common.base.s0() { // from class: androidx.media3.common.v2
                @Override // com.google.common.base.s0
                public final Object get() {
                    return r3.Q3(hVar);
                }
            });
            this.f61188i1 = true;
            this.f61182c1.j();
            this.f61187h1 = this.f61187h1.b().l0(1).y0(g.f61236a).X(g.d(Z3(hVar, this.f60604b1))).S(hVar.G).g0(false).Q();
        }
    }

    @Override // androidx.media3.common.z0
    public final boolean s0() {
        X4();
        return this.f61187h1.f61244h;
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> s4(@androidx.annotation.p0 Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    @Override // androidx.media3.common.z0
    public final void stop() {
        X4();
        final h hVar = this.f61187h1;
        if (S4(3)) {
            U4(N4(), new com.google.common.base.s0() { // from class: androidx.media3.common.g3
                @Override // com.google.common.base.s0
                public final Object get() {
                    return r3.v3(this.f60617a, hVar);
                }
            });
        }
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> t4(int i10) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @Override // androidx.media3.common.z0
    public final void u(@androidx.annotation.p0 Surface surface) {
        W3(surface);
    }

    @Override // androidx.media3.common.z0
    public final q0 u2() {
        X4();
        return this.f61187h1.A;
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> u4(int i10) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    @Override // androidx.media3.common.z0
    public final long v() {
        X4();
        return x() ? Math.max(this.f61187h1.I.get(), this.f61187h1.G.get()) : R();
    }

    @Override // androidx.media3.common.z0
    public final long v2() {
        X4();
        return this.f61187h1.f61246j;
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> v4(int i10, int i11, int i12) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @Override // androidx.media3.common.z0
    public final void w(final int i10, int i11, final List<k0> list) {
        X4();
        androidx.media3.common.util.a.a(i10 >= 0 && i10 <= i11);
        final h hVar = this.f61187h1;
        int iV = hVar.f61261y.v();
        if (S4(20) && i10 <= iV) {
            final int iMin = Math.min(i11, iV);
            U4(z4(i10, iMin, list), new com.google.common.base.s0() { // from class: androidx.media3.common.f2
                @Override // com.google.common.base.s0
                public final Object get() {
                    return r3.T2(this.f60598a, hVar, list, iMin, i10);
                }
            });
        }
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> w4() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PREPARE");
    }

    @Override // androidx.media3.common.z0
    public final boolean x() {
        X4();
        return this.f61187h1.D != -1;
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> x4() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_RELEASE");
    }

    @Override // androidx.media3.common.z0
    public final long y() {
        X4();
        return this.f61187h1.J.get();
    }

    @Override // androidx.media3.common.z0
    public final void y1(final boolean z10, int i10) {
        X4();
        final h hVar = this.f61187h1;
        if (S4(34)) {
            U4(C4(z10, i10), new com.google.common.base.s0() { // from class: androidx.media3.common.l3
                @Override // com.google.common.base.s0
                public final Object get() {
                    return hVar.b().f0(z10).Q();
                }
            });
        }
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> y4(int i10, int i11) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    @Override // androidx.media3.common.z0
    public final void z0(List<k0> list, boolean z10) {
        X4();
        R4(list, z10 ? -1 : this.f61187h1.C, z10 ? -9223372036854775807L : this.f61187h1.F.get());
    }

    @Override // androidx.media3.common.g
    protected final void z2(final int i10, final long j10, int i11, boolean z10) {
        X4();
        androidx.media3.common.util.a.a(i10 == -1 || i10 >= 0);
        final h hVar = this.f61187h1;
        if (S4(i11)) {
            final boolean z11 = i10 == -1 || x() || (!hVar.f61261y.w() && i10 >= hVar.f61261y.v());
            V4(A4(i10, j10, i11), new com.google.common.base.s0() { // from class: androidx.media3.common.d3
                @Override // com.google.common.base.s0
                public final Object get() {
                    return r3.J2(this.f60499a, z11, hVar, i10, j10);
                }
            }, !z11, z10);
        }
    }

    @z7.g
    protected com.google.common.util.concurrent.t1<?> z4(int i10, int i11, List<k0> list) {
        com.google.common.util.concurrent.t1<?> t1VarR4 = r4(i11, list);
        if (i10 == i11) {
            return t1VarR4;
        }
        final com.google.common.util.concurrent.t1<?> t1VarY4 = y4(i10, i11);
        return androidx.media3.common.util.k1.y2(t1VarR4, new com.google.common.util.concurrent.w() { // from class: androidx.media3.common.f3
            @Override // com.google.common.util.concurrent.w
            public final com.google.common.util.concurrent.t1 apply(Object obj) {
                return r3.W2(t1VarY4, obj);
            }
        });
    }

    protected r3(Looper looper, androidx.media3.common.util.j jVar) {
        this.f61183d1 = looper;
        this.f61184e1 = jVar.d(looper, null);
        this.f61185f1 = new HashSet<>();
        this.f61186g1 = new z3.b();
        this.f61182c1 = new androidx.media3.common.util.y<>(looper, jVar, new androidx.media3.common.util.y.b() { // from class: androidx.media3.common.q2
            @Override // androidx.media3.common.util.y.b
            public final void a(Object obj, s sVar) {
                r3.X2(this.f61136a, (z0.g) obj, sVar);
            }
        });
    }
}
