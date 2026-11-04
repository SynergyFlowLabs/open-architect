package androidx.databinding;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l0;
import androidx.annotation.p0;
import androidx.lifecycle.d1;
import androidx.lifecycle.e1;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import androidx.lifecycle.w0;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e0 extends androidx.databinding.a implements b4.b {
    private static final int X = 2;
    private static final int Y = 3;
    public static final String Z = "binding_";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f49333p0 = 8;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f49337w = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f49338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f49339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f49340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i0[] f49341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View f49342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.databinding.i<b0, e0, Void> f49343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f49344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Choreographer f49345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Choreographer.FrameCallback f49346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Handler f49347k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final androidx.databinding.l f49348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private e0 f49349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o0 f49350n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private k f49351o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f49352s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP})
    protected boolean f49353t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static int f49336v = Build.VERSION.SDK_INT;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final boolean f49334p1 = true;
    private static final androidx.databinding.j H1 = new a();

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final androidx.databinding.j f49335p2 = new b();

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final androidx.databinding.j f49328g3 = new c();

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final androidx.databinding.j f49329h3 = new d();

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final androidx.databinding.i.a<b0, e0, Void> f49330i3 = new e();

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final ReferenceQueue<e0> f49331j3 = new ReferenceQueue<>();

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final View.OnAttachStateChangeListener f49332k3 = new f();

    class a implements androidx.databinding.j {
        a() {
        }

        @Override // androidx.databinding.j
        public i0 a(e0 e0Var, int i10, ReferenceQueue<e0> referenceQueue) {
            return new o(e0Var, i10, referenceQueue).getListener();
        }
    }

    class b implements androidx.databinding.j {
        b() {
        }

        @Override // androidx.databinding.j
        public i0 a(e0 e0Var, int i10, ReferenceQueue<e0> referenceQueue) {
            return new m(e0Var, i10, referenceQueue).getListener();
        }
    }

    class c implements androidx.databinding.j {
        c() {
        }

        @Override // androidx.databinding.j
        public i0 a(e0 e0Var, int i10, ReferenceQueue<e0> referenceQueue) {
            return new n(e0Var, i10, referenceQueue).getListener();
        }
    }

    class d implements androidx.databinding.j {
        d() {
        }

        @Override // androidx.databinding.j
        public i0 a(e0 e0Var, int i10, ReferenceQueue<e0> referenceQueue) {
            return new j(e0Var, i10, referenceQueue).getListener();
        }
    }

    class e extends androidx.databinding.i.a<b0, e0, Void> {
        e() {
        }

        @Override // androidx.databinding.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(b0 b0Var, e0 e0Var, int i10, Void r10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    b0Var.b(e0Var);
                } else if (i10 == 3) {
                    b0Var.a(e0Var);
                }
            } else if (!b0Var.c(e0Var)) {
                e0Var.f49340d = true;
            }
        }
    }

    class f implements View.OnAttachStateChangeListener {
        f() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @e.b(19)
        public void onViewAttachedToWindow(View view) {
            e0.w(view).f49338b.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    e0.this.f49339c = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            e0.o0();
            if (e0.this.f49342f.isAttachedToWindow()) {
                e0.this.s();
            } else {
                e0.this.f49342f.removeOnAttachStateChangeListener(e0.f49332k3);
                e0.this.f49342f.addOnAttachStateChangeListener(e0.f49332k3);
            }
        }
    }

    class h implements Choreographer.FrameCallback {
        h() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            e0.this.f49338b.run();
        }
    }

    protected static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[][] f49356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[][] f49357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[][] f49358c;

        public i(int i10) {
            this.f49356a = new String[i10][];
            this.f49357b = new int[i10][];
            this.f49358c = new int[i10][];
        }

        public void a(int i10, String[] strArr, int[] iArr, int[] iArr2) {
            this.f49356a[i10] = strArr;
            this.f49357b[i10] = iArr;
            this.f49358c[i10] = iArr2;
        }
    }

    private static class j implements d1, a0<w0<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i0<w0<?>> f49359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        WeakReference<o0> f49360b = null;

        public j(e0 e0Var, int i10, ReferenceQueue<e0> referenceQueue) {
            this.f49359a = new i0<>(e0Var, i10, this, referenceQueue);
        }

        @p0
        private o0 f() {
            WeakReference<o0> weakReference = this.f49360b;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        @Override // androidx.databinding.a0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void e(w0<?> w0Var) {
            o0 o0VarF = f();
            if (o0VarF != null) {
                w0Var.k(o0VarF, this);
            }
        }

        @Override // androidx.databinding.a0
        public void b(@p0 o0 o0Var) {
            o0 o0VarF = f();
            w0<?> w0VarB = this.f49359a.b();
            if (w0VarB != null) {
                if (o0VarF != null) {
                    w0VarB.p(this);
                }
                if (o0Var != null) {
                    w0VarB.k(o0Var, this);
                }
            }
            if (o0Var != null) {
                this.f49360b = new WeakReference<>(o0Var);
            }
        }

        @Override // androidx.lifecycle.d1
        public void c(@p0 Object obj) {
            e0 e0VarA = this.f49359a.a();
            if (e0VarA != null) {
                i0<w0<?>> i0Var = this.f49359a;
                e0VarA.V(i0Var.f49393b, i0Var.b(), 0);
            }
        }

        @Override // androidx.databinding.a0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(w0<?> w0Var) {
            w0Var.p(this);
        }

        @Override // androidx.databinding.a0
        public i0<w0<?>> getListener() {
            return this.f49359a;
        }
    }

    static class k implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference<e0> f49361a;

        /* synthetic */ k(e0 e0Var, a aVar) {
            this(e0Var);
        }

        @e1(androidx.lifecycle.c0.a.ON_START)
        public void onStart() {
            e0 e0Var = this.f49361a.get();
            if (e0Var != null) {
                e0Var.s();
            }
        }

        private k(e0 e0Var) {
            this.f49361a = new WeakReference<>(e0Var);
        }
    }

    protected static abstract class l extends u.a implements androidx.databinding.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f49362a;

        public l(int i10) {
            this.f49362a = i10;
        }

        @Override // androidx.databinding.u.a
        public void c(u uVar, int i10) {
            if (i10 == this.f49362a || i10 == 0) {
                a();
            }
        }
    }

    private static class m extends y.a implements a0<y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i0<y> f49363a;

        public m(e0 e0Var, int i10, ReferenceQueue<e0> referenceQueue) {
            this.f49363a = new i0<>(e0Var, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.y.a
        public void a(y yVar) {
            y yVarB;
            e0 e0VarA = this.f49363a.a();
            if (e0VarA != null && (yVarB = this.f49363a.b()) == yVar) {
                e0VarA.V(this.f49363a.f49393b, yVarB, 0);
            }
        }

        @Override // androidx.databinding.a0
        public void b(o0 o0Var) {
        }

        @Override // androidx.databinding.y.a
        public void c(y yVar, int i10, int i11) {
            a(yVar);
        }

        @Override // androidx.databinding.y.a
        public void f(y yVar, int i10, int i11) {
            a(yVar);
        }

        @Override // androidx.databinding.y.a
        public void g(y yVar, int i10, int i11, int i12) {
            a(yVar);
        }

        @Override // androidx.databinding.a0
        public i0<y> getListener() {
            return this.f49363a;
        }

        @Override // androidx.databinding.y.a
        public void h(y yVar, int i10, int i11) {
            a(yVar);
        }

        @Override // androidx.databinding.a0
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void e(y yVar) {
            yVar.X2(this);
        }

        @Override // androidx.databinding.a0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void d(y yVar) {
            yVar.f3(this);
        }
    }

    private static class n extends z.a implements a0<z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i0<z> f49364a;

        public n(e0 e0Var, int i10, ReferenceQueue<e0> referenceQueue) {
            this.f49364a = new i0<>(e0Var, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.z.a
        public void a(z zVar, Object obj) {
            e0 e0VarA = this.f49364a.a();
            if (e0VarA != null && zVar == this.f49364a.b()) {
                e0VarA.V(this.f49364a.f49393b, zVar, 0);
            }
        }

        @Override // androidx.databinding.a0
        public void b(o0 o0Var) {
        }

        @Override // androidx.databinding.a0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void e(z zVar) {
            zVar.y2(this);
        }

        @Override // androidx.databinding.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(z zVar) {
            zVar.s3(this);
        }

        @Override // androidx.databinding.a0
        public i0<z> getListener() {
            return this.f49364a;
        }
    }

    private static class o extends u.a implements a0<u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i0<u> f49365a;

        public o(e0 e0Var, int i10, ReferenceQueue<e0> referenceQueue) {
            this.f49365a = new i0<>(e0Var, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.a0
        public void b(o0 o0Var) {
        }

        @Override // androidx.databinding.u.a
        public void c(u uVar, int i10) {
            e0 e0VarA = this.f49365a.a();
            if (e0VarA != null && this.f49365a.b() == uVar) {
                e0VarA.V(this.f49365a.f49393b, uVar, i10);
            }
        }

        @Override // androidx.databinding.a0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void e(u uVar) {
            uVar.a(this);
        }

        @Override // androidx.databinding.a0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(u uVar) {
            uVar.b(this);
        }

        @Override // androidx.databinding.a0
        public i0<u> getListener() {
            return this.f49365a;
        }
    }

    protected e0(androidx.databinding.l lVar, View view, int i10) {
        this.f49338b = new g();
        this.f49339c = false;
        this.f49340d = false;
        this.f49348l = lVar;
        this.f49341e = new i0[i10];
        this.f49342f = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (f49334p1) {
            this.f49345i = Choreographer.getInstance();
            this.f49346j = new h();
        } else {
            this.f49346j = null;
            this.f49347k = new Handler(Looper.myLooper());
        }
    }

    protected static Drawable A(View view, int i10) {
        return view.getContext().getDrawable(i10);
    }

    protected static void A0(e0 e0Var, androidx.databinding.o oVar, l lVar) {
        if (oVar != lVar) {
            if (oVar != null) {
                e0Var.b((l) oVar);
            }
            if (lVar != null) {
                e0Var.a(lVar);
            }
        }
    }

    protected static <K, T> T B(Map<K, T> map, K k10) {
        if (map == null) {
            return null;
        }
        return map.get(k10);
    }

    protected static byte C(byte[] bArr, int i10) {
        if (bArr == null || i10 < 0 || i10 >= bArr.length) {
            return (byte) 0;
        }
        return bArr[i10];
    }

    protected static char D(char[] cArr, int i10) {
        if (cArr != null && i10 >= 0 && i10 < cArr.length) {
            return cArr[i10];
        }
        return (char) 0;
    }

    protected static double E(double[] dArr, int i10) {
        if (dArr == null || i10 < 0 || i10 >= dArr.length) {
            return 0.0d;
        }
        return dArr[i10];
    }

    protected static float F(float[] fArr, int i10) {
        if (fArr != null && i10 >= 0 && i10 < fArr.length) {
            return fArr[i10];
        }
        return 0.0f;
    }

    @e.b(16)
    protected static <T> void F0(LongSparseArray<T> longSparseArray, int i10, T t10) {
        if (longSparseArray == null || i10 < 0 || i10 >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i10, t10);
    }

    protected static int G(int[] iArr, int i10) {
        if (iArr == null || i10 < 0 || i10 >= iArr.length) {
            return 0;
        }
        return iArr[i10];
    }

    protected static <T> void G0(SparseArray<T> sparseArray, int i10, T t10) {
        if (sparseArray != null && i10 >= 0 && i10 < sparseArray.size()) {
            sparseArray.put(i10, t10);
        }
    }

    protected static long H(long[] jArr, int i10) {
        if (jArr != null && i10 >= 0 && i10 < jArr.length) {
            return jArr[i10];
        }
        return 0L;
    }

    protected static void H0(SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        if (sparseBooleanArray == null || i10 < 0 || i10 >= sparseBooleanArray.size()) {
            return;
        }
        sparseBooleanArray.put(i10, z10);
    }

    protected static <T> T I(T[] tArr, int i10) {
        if (tArr == null || i10 < 0 || i10 >= tArr.length) {
            return null;
        }
        return tArr[i10];
    }

    protected static void I0(SparseIntArray sparseIntArray, int i10, int i11) {
        if (sparseIntArray == null || i10 < 0 || i10 >= sparseIntArray.size()) {
            return;
        }
        sparseIntArray.put(i10, i11);
    }

    protected static short J(short[] sArr, int i10) {
        if (sArr != null && i10 >= 0 && i10 < sArr.length) {
            return sArr[i10];
        }
        return (short) 0;
    }

    @e.b(18)
    protected static void J0(SparseLongArray sparseLongArray, int i10, long j10) {
        if (sparseLongArray != null && i10 >= 0 && i10 < sparseLongArray.size()) {
            sparseLongArray.put(i10, j10);
        }
    }

    protected static boolean K(boolean[] zArr, int i10) {
        if (zArr == null || i10 < 0 || i10 >= zArr.length) {
            return false;
        }
        return zArr[i10];
    }

    protected static <T> void K0(androidx.collection.b1<T> b1Var, int i10, T t10) {
        if (b1Var == null || i10 < 0 || i10 >= b1Var.size()) {
            return;
        }
        b1Var.n(i10, t10);
    }

    protected static int L(SparseIntArray sparseIntArray, int i10) {
        if (sparseIntArray == null || i10 < 0) {
            return 0;
        }
        return sparseIntArray.get(i10);
    }

    protected static <T> void L0(List<T> list, int i10, T t10) {
        if (list != null && i10 >= 0 && i10 < list.size()) {
            list.set(i10, t10);
        }
    }

    @e.b(18)
    protected static long M(SparseLongArray sparseLongArray, int i10) {
        if (sparseLongArray == null || i10 < 0) {
            return 0L;
        }
        return sparseLongArray.get(i10);
    }

    protected static <K, T> void M0(Map<K, T> map, K k10, T t10) {
        if (map == null) {
            return;
        }
        map.put(k10, t10);
    }

    @e.b(16)
    protected static <T> T N(LongSparseArray<T> longSparseArray, int i10) {
        if (longSparseArray == null || i10 < 0) {
            return null;
        }
        return longSparseArray.get(i10);
    }

    protected static void N0(byte[] bArr, int i10, byte b10) {
        if (bArr == null || i10 < 0 || i10 >= bArr.length) {
            return;
        }
        bArr[i10] = b10;
    }

    protected static <T> T O(SparseArray<T> sparseArray, int i10) {
        if (sparseArray == null || i10 < 0) {
            return null;
        }
        return sparseArray.get(i10);
    }

    protected static <T> T P(androidx.collection.b1<T> b1Var, int i10) {
        if (b1Var != null && i10 >= 0) {
            return b1Var.g(i10);
        }
        return null;
    }

    protected static void P0(char[] cArr, int i10, char c10) {
        if (cArr == null || i10 < 0 || i10 >= cArr.length) {
            return;
        }
        cArr[i10] = c10;
    }

    protected static <T> T Q(List<T> list, int i10) {
        if (list == null || i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    protected static void Q0(double[] dArr, int i10, double d10) {
        if (dArr != null && i10 >= 0 && i10 < dArr.length) {
            dArr[i10] = d10;
        }
    }

    protected static boolean R(SparseBooleanArray sparseBooleanArray, int i10) {
        if (sparseBooleanArray != null && i10 >= 0) {
            return sparseBooleanArray.get(i10);
        }
        return false;
    }

    protected static void R0(float[] fArr, int i10, float f10) {
        if (fArr == null || i10 < 0 || i10 >= fArr.length) {
            return;
        }
        fArr[i10] = f10;
    }

    protected static void S0(int[] iArr, int i10, int i11) {
        if (iArr == null || i10 < 0 || i10 >= iArr.length) {
            return;
        }
        iArr[i10] = i11;
    }

    protected static void T0(long[] jArr, int i10, long j10) {
        if (jArr != null && i10 >= 0 && i10 < jArr.length) {
            jArr[i10] = j10;
        }
    }

    protected static <T> void U0(T[] tArr, int i10, T t10) {
        if (tArr == null || i10 < 0 || i10 >= tArr.length) {
            return;
        }
        tArr[i10] = t10;
    }

    protected static void V0(short[] sArr, int i10, short s10) {
        if (sArr == null || i10 < 0 || i10 >= sArr.length) {
            return;
        }
        sArr[i10] = s10;
    }

    protected static void W0(boolean[] zArr, int i10, boolean z10) {
        if (zArr == null || i10 < 0 || i10 >= zArr.length) {
            return;
        }
        zArr[i10] = z10;
    }

    @b1({b1.a.LIBRARY_GROUP})
    protected static <T extends e0> T X(@NonNull LayoutInflater layoutInflater, int i10, @p0 ViewGroup viewGroup, boolean z10, @p0 Object obj) {
        return (T) androidx.databinding.m.k(layoutInflater, i10, viewGroup, z10, n(obj));
    }

    private static boolean a0(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return false;
        }
        while (i10 < length) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118  */
    private static void b0(androidx.databinding.l lVar, View view, Object[] objArr, i iVar, SparseIntArray sparseIntArray, boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        boolean z13;
        int iT;
        int id2;
        int i13;
        int iN0;
        boolean z14;
        i iVar2 = iVar;
        SparseIntArray sparseIntArray2 = sparseIntArray;
        if (w(view) != null) {
            return;
        }
        Object tag = view.getTag();
        String str = tag instanceof String ? (String) tag : null;
        boolean z15 = true;
        if (z10 && str != null && str.startsWith("layout")) {
            int iLastIndexOf = str.lastIndexOf(95);
            if (iLastIndexOf > 0) {
                int i14 = iLastIndexOf + 1;
                if (a0(str, i14)) {
                    iN0 = n0(str, i14);
                    if (objArr[iN0] == null) {
                        objArr[iN0] = view;
                    }
                    if (iVar2 == null) {
                        iN0 = -1;
                    }
                    z14 = true;
                } else {
                    iN0 = -1;
                    z14 = false;
                }
            } else {
                iN0 = -1;
                z14 = false;
            }
            boolean z16 = z14;
            i10 = iN0;
            z11 = z16;
        } else if (str == null || !str.startsWith(Z)) {
            i10 = -1;
            z11 = false;
        } else {
            int iN1 = n0(str, f49333p0);
            if (objArr[iN1] == null) {
                objArr[iN1] = view;
            }
            if (iVar2 == null) {
                iN1 = -1;
            }
            i10 = iN1;
            z11 = true;
        }
        if (!z11 && (id2 = view.getId()) > 0 && sparseIntArray2 != null && (i13 = sparseIntArray2.get(id2, -1)) >= 0 && objArr[i13] == null) {
            objArr[i13] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i15 = 0;
            int i16 = 0;
            while (i15 < childCount) {
                View childAt = viewGroup.getChildAt(i15);
                if (i10 < 0 || !(childAt.getTag() instanceof String)) {
                    z12 = z15;
                    i11 = i15;
                    i12 = i16;
                    z13 = false;
                } else {
                    String str2 = (String) childAt.getTag();
                    if (!str2.endsWith("_0") || !str2.startsWith("layout") || str2.indexOf(47) <= 0 || (iT = t(str2, i16, iVar2, i10)) < 0) {
                        z12 = z15;
                        i11 = i15;
                        i12 = i16;
                        z13 = false;
                    } else {
                        int i17 = iT + 1;
                        int i18 = iVar2.f49357b[i10][iT];
                        int i19 = iVar2.f49358c[i10][iT];
                        int iU = u(viewGroup, i15);
                        if (iU == i15) {
                            objArr[i18] = androidx.databinding.m.c(lVar, childAt, i19);
                            i11 = i15;
                            z13 = z15;
                            z12 = z13;
                            i12 = i17;
                        } else {
                            int i20 = iU - i15;
                            int i21 = i20 + 1;
                            View[] viewArr = new View[i21];
                            z12 = z15;
                            int i22 = 0;
                            while (i22 < i21) {
                                int i23 = i15;
                                viewArr[i22] = viewGroup.getChildAt(i23 + i22);
                                i22++;
                                i15 = i23;
                            }
                            objArr[i18] = androidx.databinding.m.d(lVar, viewArr, i19);
                            i11 = i15 + i20;
                            i12 = i17;
                            z13 = z12;
                        }
                    }
                }
                if (!z13) {
                    b0(lVar, childAt, objArr, iVar2, sparseIntArray2, false);
                }
                i15 = i11 + 1;
                iVar2 = iVar;
                sparseIntArray2 = sparseIntArray;
                i16 = i12;
                z15 = z12;
            }
        }
    }

    protected static Object[] c0(androidx.databinding.l lVar, View view, int i10, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        b0(lVar, view, objArr, iVar, sparseIntArray, true);
        return objArr;
    }

    protected static Object[] d0(androidx.databinding.l lVar, View[] viewArr, int i10, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        for (View view : viewArr) {
            b0(lVar, view, objArr, iVar, sparseIntArray, true);
        }
        return objArr;
    }

    protected static byte f0(String str, byte b10) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b10;
        }
    }

    protected static char g0(String str, char c10) {
        return (str == null || str.isEmpty()) ? c10 : str.charAt(0);
    }

    protected static double h0(String str, double d10) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d10;
        }
    }

    protected static float i0(String str, float f10) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f10;
        }
    }

    protected static int j0(String str, int i10) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    protected static long k0(String str, long j10) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    protected static short l0(String str, short s10) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s10;
        }
    }

    protected static e0 m(Object obj, View view, int i10) {
        return androidx.databinding.m.c(n(obj), view, i10);
    }

    protected static boolean m0(String str, boolean z10) {
        return str == null ? z10 : Boolean.parseBoolean(str);
    }

    private static androidx.databinding.l n(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof androidx.databinding.l) {
            return (androidx.databinding.l) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    private static int n0(String str, int i10) {
        int length = str.length();
        int iCharAt = 0;
        while (i10 < length) {
            iCharAt = (iCharAt * 10) + (str.charAt(i10) - '0');
            i10++;
        }
        return iCharAt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o0() {
        while (true) {
            Reference<? extends e0> referencePoll = f49331j3.poll();
            if (referencePoll == null) {
                return;
            }
            if (referencePoll instanceof i0) {
                ((i0) referencePoll).e();
            }
        }
    }

    private void q() {
        if (this.f49344h) {
            r0();
            return;
        }
        if (W()) {
            this.f49344h = true;
            this.f49340d = false;
            androidx.databinding.i<b0, e0, Void> iVar = this.f49343g;
            if (iVar != null) {
                iVar.h(this, 1, null);
                if (this.f49340d) {
                    this.f49343g.h(this, 2, null);
                }
            }
            if (!this.f49340d) {
                p();
                androidx.databinding.i<b0, e0, Void> iVar2 = this.f49343g;
                if (iVar2 != null) {
                    iVar2.h(this, 3, null);
                }
            }
            this.f49344h = false;
        }
    }

    protected static void r(e0 e0Var) {
        e0Var.q();
    }

    protected static byte s0(Byte b10) {
        if (b10 == null) {
            return (byte) 0;
        }
        return b10.byteValue();
    }

    private static int t(String str, int i10, i iVar, int i11) {
        CharSequence charSequenceSubSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = iVar.f49356a[i11];
        int length = strArr.length;
        while (i10 < length) {
            if (TextUtils.equals(charSequenceSubSequence, strArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    protected static char t0(Character ch2) {
        if (ch2 == null) {
            return (char) 0;
        }
        return ch2.charValue();
    }

    private static int u(ViewGroup viewGroup, int i10) {
        String str = (String) viewGroup.getChildAt(i10).getTag();
        String strSubstring = str.substring(0, str.length() - 1);
        int length = strSubstring.length();
        int childCount = viewGroup.getChildCount();
        for (int i11 = i10 + 1; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(strSubstring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    break;
                }
                if (a0(str2, length)) {
                    i10 = i11;
                }
            }
        }
        return i10;
    }

    protected static double u0(Double d10) {
        if (d10 == null) {
            return 0.0d;
        }
        return d10.doubleValue();
    }

    protected static float v0(Float f10) {
        if (f10 == null) {
            return 0.0f;
        }
        return f10.floatValue();
    }

    static e0 w(View view) {
        if (view != null) {
            return (e0) view.getTag(u1.a.C2516a.f381118a);
        }
        return null;
    }

    protected static int w0(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static int x() {
        return f49336v;
    }

    protected static long x0(Long l10) {
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    protected static int y(View view, int i10) {
        return view.getContext().getColor(i10);
    }

    protected static short y0(Short sh2) {
        if (sh2 == null) {
            return (short) 0;
        }
        return sh2.shortValue();
    }

    protected static ColorStateList z(View view, int i10) {
        return view.getContext().getColorStateList(i10);
    }

    protected static boolean z0(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    protected void B0(e0 e0Var) {
        if (e0Var != null) {
            e0Var.f49349m = this;
        }
    }

    @l0
    public void C0(@p0 o0 o0Var) {
        o0 o0Var2 = this.f49350n;
        if (o0Var2 == o0Var) {
            return;
        }
        if (o0Var2 != null) {
            o0Var2.getLifecycle().g(this.f49351o);
        }
        this.f49350n = o0Var;
        if (o0Var != null) {
            if (this.f49351o == null) {
                this.f49351o = new k(this, null);
            }
            o0Var.getLifecycle().c(this.f49351o);
        }
        for (i0 i0Var : this.f49341e) {
            if (i0Var != null) {
                i0Var.c(o0Var);
            }
        }
    }

    protected void D0(View view) {
        view.setTag(u1.a.C2516a.f381118a, this);
    }

    protected void E0(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(u1.a.C2516a.f381118a, this);
        }
    }

    @p0
    public o0 S() {
        return this.f49350n;
    }

    protected Object U(int i10) {
        i0 i0Var = this.f49341e[i10];
        if (i0Var == null) {
            return null;
        }
        return i0Var.b();
    }

    @b1({b1.a.LIBRARY_GROUP})
    protected void V(int i10, Object obj, int i11) {
        if (this.f49352s || this.f49353t || !e0(i10, obj, i11)) {
            return;
        }
        r0();
    }

    public abstract boolean W();

    public abstract boolean X0(int i10, @p0 Object obj);

    public void Y0() {
        for (i0 i0Var : this.f49341e) {
            if (i0Var != null) {
                i0Var.e();
            }
        }
    }

    public abstract void Z();

    protected boolean Z0(int i10) {
        i0 i0Var = this.f49341e[i10];
        if (i0Var != null) {
            return i0Var.e();
        }
        return false;
    }

    protected boolean a1(int i10, w0<?> w0Var) {
        this.f49352s = true;
        try {
            return f1(i10, w0Var, f49329h3);
        } finally {
            this.f49352s = false;
        }
    }

    protected boolean b1(int i10, u uVar) {
        return f1(i10, uVar, H1);
    }

    protected boolean c1(int i10, y yVar) {
        return f1(i10, yVar, f49335p2);
    }

    protected abstract boolean e0(int i10, Object obj, int i11);

    protected boolean e1(int i10, z zVar) {
        return f1(i10, zVar, f49328g3);
    }

    @b1({b1.a.LIBRARY_GROUP})
    protected boolean f1(int i10, Object obj, androidx.databinding.j jVar) {
        if (obj == null) {
            return Z0(i10);
        }
        i0 i0Var = this.f49341e[i10];
        if (i0Var == null) {
            p0(i10, obj, jVar);
            return true;
        }
        if (i0Var.b() == obj) {
            return false;
        }
        Z0(i10);
        p0(i10, obj, jVar);
        return true;
    }

    @Override // b4.b
    @NonNull
    public View getRoot() {
        return this.f49342f;
    }

    public void l(@NonNull b0 b0Var) {
        if (this.f49343g == null) {
            this.f49343g = new androidx.databinding.i<>(f49330i3);
        }
        this.f49343g.a(b0Var);
    }

    protected void o(Class<?> cls) {
        if (this.f49348l != null) {
            return;
        }
        throw new IllegalStateException("Required DataBindingComponent is null in class " + getClass().getSimpleName() + ". A BindingAdapter in " + cls.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
    }

    protected abstract void p();

    protected void p0(int i10, Object obj, androidx.databinding.j jVar) {
        if (obj == null) {
            return;
        }
        i0 i0VarA = this.f49341e[i10];
        if (i0VarA == null) {
            i0VarA = jVar.a(this, i10, f49331j3);
            this.f49341e[i10] = i0VarA;
            o0 o0Var = this.f49350n;
            if (o0Var != null) {
                i0VarA.c(o0Var);
            }
        }
        i0VarA.d(obj);
    }

    public void q0(@NonNull b0 b0Var) {
        androidx.databinding.i<b0, e0, Void> iVar = this.f49343g;
        if (iVar != null) {
            iVar.n(b0Var);
        }
    }

    protected void r0() {
        e0 e0Var = this.f49349m;
        if (e0Var != null) {
            e0Var.r0();
            return;
        }
        o0 o0Var = this.f49350n;
        if (o0Var == null || o0Var.getLifecycle().d().n(androidx.lifecycle.c0.b.STARTED)) {
            synchronized (this) {
                try {
                    if (this.f49339c) {
                        return;
                    }
                    this.f49339c = true;
                    if (f49334p1) {
                        this.f49345i.postFrameCallback(this.f49346j);
                    } else {
                        this.f49347k.post(this.f49338b);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void s() {
        e0 e0Var = this.f49349m;
        if (e0Var == null) {
            q();
        } else {
            e0Var.s();
        }
    }

    void v() {
        p();
    }

    protected e0(Object obj, View view, int i10) {
        this(n(obj), view, i10);
    }
}
