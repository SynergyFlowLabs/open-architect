package com.nineoldandroids.animation;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class q extends com.nineoldandroids.animation.a {
    static final int H1 = 1;
    private static final long Y = 10;
    static final int Z = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final int f131273p0 = 1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    static final int f131274p1 = 0;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    static final int f131275p2 = 2;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final int f131277q3 = 1;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static final int f131278r3 = 2;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static final int f131279s3 = -1;
    HashMap<String, n> X;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f131280b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f131286h;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    n[] f131297w;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static ThreadLocal<f> f131264g3 = new ThreadLocal<>();

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final ThreadLocal<ArrayList<q>> f131265h3 = new a();

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final ThreadLocal<ArrayList<q>> f131266i3 = new b();

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final ThreadLocal<ArrayList<q>> f131267j3 = new c();

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final ThreadLocal<ArrayList<q>> f131268k3 = new d();

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final ThreadLocal<ArrayList<q>> f131269l3 = new e();

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final Interpolator f131270m3 = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final p f131271n3 = new h();

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final p f131272o3 = new com.nineoldandroids.animation.f();

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static long f131276p3 = 10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f131281c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f131282d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f131283e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f131284f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f131285g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f131287i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f131288j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f131289k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f131290l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f131291m = 300;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f131292n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f131293o = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f131294s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Interpolator f131295t = f131270m3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList<g> f131296v = null;

    static class a extends ThreadLocal<ArrayList<q>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<q> initialValue() {
            return new ArrayList<>();
        }
    }

    static class b extends ThreadLocal<ArrayList<q>> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<q> initialValue() {
            return new ArrayList<>();
        }
    }

    static class c extends ThreadLocal<ArrayList<q>> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<q> initialValue() {
            return new ArrayList<>();
        }
    }

    static class d extends ThreadLocal<ArrayList<q>> {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<q> initialValue() {
            return new ArrayList<>();
        }
    }

    static class e extends ThreadLocal<ArrayList<q>> {
        e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<q> initialValue() {
            return new ArrayList<>();
        }
    }

    private static class f extends Handler {
        private f() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z10;
            ArrayList arrayList = (ArrayList) q.f131265h3.get();
            ArrayList arrayList2 = (ArrayList) q.f131267j3.get();
            int i10 = message.what;
            if (i10 == 0) {
                ArrayList arrayList3 = (ArrayList) q.f131266i3.get();
                z10 = arrayList.size() <= 0 && arrayList2.size() <= 0;
                while (arrayList3.size() > 0) {
                    ArrayList arrayList4 = (ArrayList) arrayList3.clone();
                    arrayList3.clear();
                    int size = arrayList4.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        q qVar = (q) arrayList4.get(i11);
                        if (qVar.f131292n == 0) {
                            qVar.p0();
                        } else {
                            arrayList2.add(qVar);
                        }
                    }
                }
            } else if (i10 != 1) {
                return;
            } else {
                z10 = true;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            ArrayList arrayList5 = (ArrayList) q.f131269l3.get();
            ArrayList arrayList6 = (ArrayList) q.f131268k3.get();
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                q qVar2 = (q) arrayList2.get(i12);
                if (qVar2.J(jCurrentAnimationTimeMillis)) {
                    arrayList5.add(qVar2);
                }
            }
            int size3 = arrayList5.size();
            if (size3 > 0) {
                for (int i13 = 0; i13 < size3; i13++) {
                    q qVar3 = (q) arrayList5.get(i13);
                    qVar3.p0();
                    qVar3.f131288j = true;
                    arrayList2.remove(qVar3);
                }
                arrayList5.clear();
            }
            int size4 = arrayList.size();
            int i14 = 0;
            while (i14 < size4) {
                q qVar4 = (q) arrayList.get(i14);
                if (qVar4.G(jCurrentAnimationTimeMillis)) {
                    arrayList6.add(qVar4);
                }
                if (arrayList.size() == size4) {
                    i14++;
                } else {
                    size4--;
                    arrayList6.remove(qVar4);
                }
            }
            if (arrayList6.size() > 0) {
                for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                    ((q) arrayList6.get(i15)).K();
                }
                arrayList6.clear();
            }
            if (z10) {
                if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                    return;
                }
                sendEmptyMessageDelayed(1, Math.max(0L, q.f131276p3 - (AnimationUtils.currentAnimationTimeMillis() - jCurrentAnimationTimeMillis)));
            }
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    public interface g {
        void c(q qVar);
    }

    public static void H() {
        f131265h3.get().clear();
        f131266i3.get().clear();
        f131267j3.get().clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean J(long j10) {
        if (!this.f131285g) {
            this.f131285g = true;
            this.f131286h = j10;
            return false;
        }
        long j11 = j10 - this.f131286h;
        long j12 = this.f131292n;
        if (j11 <= j12) {
            return false;
        }
        this.f131280b = j10 - (j11 - j12);
        this.f131287i = 1;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        ArrayList<com.nineoldandroids.animation.a.InterfaceC1443a> arrayList;
        f131265h3.get().remove(this);
        f131266i3.get().remove(this);
        f131267j3.get().remove(this);
        this.f131287i = 0;
        if (this.f131288j && (arrayList = this.f131154a) != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((com.nineoldandroids.animation.a.InterfaceC1443a) arrayList2.get(i10)).b(this);
            }
        }
        this.f131288j = false;
        this.f131289k = false;
    }

    public static int O() {
        return f131265h3.get().size();
    }

    public static long Q() {
        return f131276p3;
    }

    public static q X(float... fArr) {
        q qVar = new q();
        qVar.h0(fArr);
        return qVar;
    }

    public static q Y(int... iArr) {
        q qVar = new q();
        qVar.j0(iArr);
        return qVar;
    }

    public static q Z(p pVar, Object... objArr) {
        q qVar = new q();
        qVar.k0(objArr);
        qVar.g0(pVar);
        return qVar;
    }

    public static q a0(n... nVarArr) {
        q qVar = new q();
        qVar.n0(nVarArr);
        return qVar;
    }

    public static void i0(long j10) {
        f131276p3 = j10;
    }

    private void o0(boolean z10) {
        if (Looper.myLooper() == null) {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        this.f131282d = z10;
        this.f131283e = 0;
        this.f131287i = 0;
        this.f131289k = true;
        this.f131285g = false;
        f131266i3.get().add(this);
        if (this.f131292n == 0) {
            e0(P());
            this.f131287i = 0;
            this.f131288j = true;
            ArrayList<com.nineoldandroids.animation.a.InterfaceC1443a> arrayList = this.f131154a;
            if (arrayList != null) {
                ArrayList arrayList2 = (ArrayList) arrayList.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((com.nineoldandroids.animation.a.InterfaceC1443a) arrayList2.get(i10)).e(this);
                }
            }
        }
        f fVar = f131264g3.get();
        if (fVar == null) {
            fVar = new f(null);
            f131264g3.set(fVar);
        }
        fVar.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0() {
        ArrayList<com.nineoldandroids.animation.a.InterfaceC1443a> arrayList;
        W();
        f131265h3.get().add(this);
        if (this.f131292n <= 0 || (arrayList = this.f131154a) == null) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) arrayList.clone();
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.nineoldandroids.animation.a.InterfaceC1443a) arrayList2.get(i10)).e(this);
        }
    }

    public void E(g gVar) {
        if (this.f131296v == null) {
            this.f131296v = new ArrayList<>();
        }
        this.f131296v.add(gVar);
    }

    void F(float f10) {
        float interpolation = this.f131295t.getInterpolation(f10);
        this.f131284f = interpolation;
        int length = this.f131297w.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f131297w[i10].a(interpolation);
        }
        ArrayList<g> arrayList = this.f131296v;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f131296v.get(i11).c(this);
            }
        }
    }

    boolean G(long j10) {
        boolean z10 = true;
        if (this.f131287i == 0) {
            this.f131287i = 1;
            long j11 = this.f131281c;
            if (j11 < 0) {
                this.f131280b = j10;
            } else {
                this.f131280b = j10 - j11;
                this.f131281c = -1L;
            }
        }
        int i10 = this.f131287i;
        if (i10 != 1 && i10 != 2) {
            return false;
        }
        long j12 = this.f131291m;
        float fMin = j12 > 0 ? (j10 - this.f131280b) / j12 : 1.0f;
        if (fMin >= 1.0f) {
            int i11 = this.f131283e;
            int i12 = this.f131293o;
            if (i11 < i12 || i12 == -1) {
                ArrayList<com.nineoldandroids.animation.a.InterfaceC1443a> arrayList = this.f131154a;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        this.f131154a.get(i13).a(this);
                    }
                }
                if (this.f131294s == 2) {
                    this.f131282d = !this.f131282d;
                }
                this.f131283e += (int) fMin;
                fMin %= 1.0f;
                this.f131280b += this.f131291m;
                z10 = false;
            } else {
                fMin = Math.min(fMin, 1.0f);
            }
        } else {
            z10 = false;
        }
        if (this.f131282d) {
            fMin = 1.0f - fMin;
        }
        F(fMin);
        return z10;
    }

    @Override // com.nineoldandroids.animation.a
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public q clone() {
        q qVar = (q) super.clone();
        ArrayList<g> arrayList = this.f131296v;
        if (arrayList != null) {
            qVar.f131296v = new ArrayList<>();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                qVar.f131296v.add(arrayList.get(i10));
            }
        }
        qVar.f131281c = -1L;
        qVar.f131282d = false;
        qVar.f131283e = 0;
        qVar.f131290l = false;
        qVar.f131287i = 0;
        qVar.f131285g = false;
        n[] nVarArr = this.f131297w;
        if (nVarArr != null) {
            int length = nVarArr.length;
            qVar.f131297w = new n[length];
            qVar.X = new HashMap<>(length);
            for (int i11 = 0; i11 < length; i11++) {
                n nVarClone = nVarArr[i11].clone();
                qVar.f131297w[i11] = nVarClone;
                qVar.X.put(nVarClone.f(), nVarClone);
            }
        }
        return qVar;
    }

    public float L() {
        return this.f131284f;
    }

    public Object M() {
        n[] nVarArr = this.f131297w;
        if (nVarArr == null || nVarArr.length <= 0) {
            return null;
        }
        return nVarArr[0].c();
    }

    public Object N(String str) {
        n nVar = this.X.get(str);
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public long P() {
        if (!this.f131290l || this.f131287i == 0) {
            return 0L;
        }
        return AnimationUtils.currentAnimationTimeMillis() - this.f131280b;
    }

    public Interpolator S() {
        return this.f131295t;
    }

    public int T() {
        return this.f131293o;
    }

    public int U() {
        return this.f131294s;
    }

    public n[] V() {
        return this.f131297w;
    }

    void W() {
        if (this.f131290l) {
            return;
        }
        int length = this.f131297w.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f131297w[i10].g();
        }
        this.f131290l = true;
    }

    public void b0() {
        ArrayList<g> arrayList = this.f131296v;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
        this.f131296v = null;
    }

    @Override // com.nineoldandroids.animation.a
    public void c() {
        if (!f131265h3.get().contains(this) && !f131266i3.get().contains(this)) {
            boolean z10 = true | false;
            this.f131285g = false;
            p0();
        } else if (!this.f131290l) {
            W();
        }
        int i10 = this.f131293o;
        if (i10 <= 0 || (i10 & 1) != 1) {
            F(1.0f);
        } else {
            F(0.0f);
        }
        K();
    }

    public void c0(g gVar) {
        ArrayList<g> arrayList = this.f131296v;
        if (arrayList != null) {
            arrayList.remove(gVar);
            if (this.f131296v.size() == 0) {
                this.f131296v = null;
            }
        }
    }

    @Override // com.nineoldandroids.animation.a
    public void cancel() {
        ArrayList<com.nineoldandroids.animation.a.InterfaceC1443a> arrayList;
        if (this.f131287i != 0 || f131266i3.get().contains(this) || f131267j3.get().contains(this)) {
            if (this.f131288j && (arrayList = this.f131154a) != null) {
                Iterator it = ((ArrayList) arrayList.clone()).iterator();
                while (it.hasNext()) {
                    ((com.nineoldandroids.animation.a.InterfaceC1443a) it.next()).d(this);
                }
            }
            K();
        }
    }

    @Override // com.nineoldandroids.animation.a
    public long d() {
        return this.f131291m;
    }

    public void d0() {
        this.f131282d = !this.f131282d;
        if (this.f131287i != 1) {
            o0(true);
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f131280b = jCurrentAnimationTimeMillis - (this.f131291m - (jCurrentAnimationTimeMillis - this.f131280b));
    }

    public void e0(long j10) {
        W();
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.f131287i != 1) {
            this.f131281c = j10;
            this.f131287i = 2;
        }
        this.f131280b = jCurrentAnimationTimeMillis - j10;
        G(jCurrentAnimationTimeMillis);
    }

    @Override // com.nineoldandroids.animation.a
    public long f() {
        return this.f131292n;
    }

    @Override // com.nineoldandroids.animation.a
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public q k(long j10) {
        if (j10 >= 0) {
            this.f131291m = j10;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + j10);
    }

    @Override // com.nineoldandroids.animation.a
    public boolean g() {
        return this.f131287i == 1 || this.f131288j;
    }

    public void g0(p pVar) {
        n[] nVarArr;
        if (pVar == null || (nVarArr = this.f131297w) == null || nVarArr.length <= 0) {
            return;
        }
        nVarArr[0].r(pVar);
    }

    @Override // com.nineoldandroids.animation.a
    public boolean h() {
        return this.f131289k;
    }

    public void h0(float... fArr) {
        if (fArr == null || fArr.length == 0) {
            return;
        }
        n[] nVarArr = this.f131297w;
        if (nVarArr == null || nVarArr.length == 0) {
            n0(n.i("", fArr));
        } else {
            nVarArr[0].s(fArr);
        }
        this.f131290l = false;
    }

    public void j0(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            n[] nVarArr = this.f131297w;
            if (nVarArr == null || nVarArr.length == 0) {
                n0(n.k("", iArr));
            } else {
                nVarArr[0].t(iArr);
            }
            this.f131290l = false;
        }
    }

    public void k0(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            n[] nVarArr = this.f131297w;
            if (nVarArr == null || nVarArr.length == 0) {
                n0(n.p("", null, objArr));
            } else {
                nVarArr[0].v(objArr);
            }
            this.f131290l = false;
        }
    }

    @Override // com.nineoldandroids.animation.a
    public void l(Interpolator interpolator) {
        if (interpolator != null) {
            this.f131295t = interpolator;
        } else {
            this.f131295t = new LinearInterpolator();
        }
    }

    public void l0(int i10) {
        this.f131293o = i10;
    }

    public void m0(int i10) {
        this.f131294s = i10;
    }

    @Override // com.nineoldandroids.animation.a
    public void n(long j10) {
        this.f131292n = j10;
    }

    public void n0(n... nVarArr) {
        int length = nVarArr.length;
        this.f131297w = nVarArr;
        this.X = new HashMap<>(length);
        for (n nVar : nVarArr) {
            this.X.put(nVar.f(), nVar);
        }
        this.f131290l = false;
    }

    @Override // com.nineoldandroids.animation.a
    public void r() {
        o0(false);
    }

    public String toString() {
        String str = "ValueAnimator@" + Integer.toHexString(hashCode());
        if (this.f131297w != null) {
            for (int i10 = 0; i10 < this.f131297w.length; i10++) {
                str = str + "\n    " + this.f131297w[i10].toString();
            }
        }
        return str;
    }
}
