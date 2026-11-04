package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.core.view.u1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g0 implements Cloneable {
    private static final int A3 = 4;
    private static final String B3 = "instance";
    private static final String C3 = "name";
    private static final String D3 = "id";
    private static final String E3 = "itemId";

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final String f75616s3 = "Transition";

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    static final boolean f75618u3 = false;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final int f75619v3 = 1;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final int f75620w3 = 1;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final int f75621x3 = 2;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final int f75622y3 = 3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final int f75623z3 = 4;
    private ArrayList<u0> X;
    private ArrayList<u0> Y;
    private j[] Z;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    q0 f75641l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private f f75643m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private androidx.collection.a<String, String> f75645n3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    long f75651p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    i f75652q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    long f75653r3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final Animator[] f75617t3 = new Animator[0];
    private static final int[] F3 = {2, 1, 3, 4};
    private static final w G3 = new a();
    private static ThreadLocal<androidx.collection.a<Animator, d>> H3 = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f75624a = getClass().getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f75625b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f75626c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TimeInterpolator f75627d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<Integer> f75628e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList<View> f75629f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList<String> f75630g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList<Class<?>> f75632h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList<Integer> f75634i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList<View> f75636j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList<Class<?>> f75638k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ArrayList<String> f75640l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList<Integer> f75642m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList<View> f75644n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ArrayList<Class<?>> f75646o = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private v0 f75654s = new v0();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private v0 f75655t = new v0();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    s0 f75656v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f75657w = F3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    boolean f75648p0 = false;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    ArrayList<Animator> f75649p1 = new ArrayList<>();
    private Animator[] H1 = f75617t3;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    int f75650p2 = 0;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private boolean f75631g3 = false;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    boolean f75633h3 = false;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private g0 f75635i3 = null;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private ArrayList<j> f75637j3 = null;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    ArrayList<Animator> f75639k3 = new ArrayList<>();

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private w f75647o3 = G3;

    class a extends w {
        a() {
        }

        @Override // androidx.transition.w
        @NonNull
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f75658a;

        b(androidx.collection.a aVar) {
            this.f75658a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f75658a.remove(animator);
            g0.this.f75649p1.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g0.this.f75649p1.add(animator);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g0.this.w();
            animator.removeListener(this);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f75661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f75662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        u0 f75663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        WindowId f75664d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        g0 f75665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Animator f75666f;

        d(View view, String str, g0 g0Var, WindowId windowId, u0 u0Var, Animator animator) {
            this.f75661a = view;
            this.f75662b = str;
            this.f75663c = u0Var;
            this.f75664d = windowId;
            this.f75665e = g0Var;
            this.f75666f = animator;
        }
    }

    private static class e {
        private e() {
        }

        static <T> ArrayList<T> a(ArrayList<T> arrayList, T t10) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t10)) {
                arrayList.add(t10);
            }
            return arrayList;
        }

        static <T> ArrayList<T> b(ArrayList<T> arrayList, T t10) {
            if (arrayList != null) {
                arrayList.remove(t10);
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
            }
            return arrayList;
        }
    }

    public static abstract class f {
        @androidx.annotation.p0
        public abstract Rect a(@NonNull g0 g0Var);
    }

    @androidx.annotation.w0(26)
    private static class g {
        private g() {
        }

        @androidx.annotation.u
        static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        @androidx.annotation.u
        static void b(Animator animator, long j10) {
            ((AnimatorSet) animator).setCurrentPlayTime(j10);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public @interface h {
    }

    @androidx.annotation.w0(34)
    class i extends o0 implements r0, androidx.dynamicanimation.animation.b.r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f75670d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f75671e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.dynamicanimation.animation.g f75672f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Runnable f75675i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f75667a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList<androidx.core.util.e<r0>> f75668b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ArrayList<androidx.core.util.e<r0>> f75669c = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private androidx.core.util.e<r0>[] f75673g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final x0 f75674h = new x0();

        i() {
        }

        public static /* synthetic */ void s(i iVar, androidx.dynamicanimation.animation.b bVar, boolean z10, float f10, float f11) {
            if (z10) {
                iVar.getClass();
                return;
            }
            if (f10 >= 1.0f) {
                g0.this.p0(k.f75678b, false);
                return;
            }
            long jA = iVar.a();
            g0 g0VarV0 = ((s0) g0.this).V0(0);
            g0 g0Var = g0VarV0.f75635i3;
            g0VarV0.f75635i3 = null;
            g0.this.D0(-1L, iVar.f75667a);
            g0.this.D0(jA, -1L);
            iVar.f75667a = jA;
            Runnable runnable = iVar.f75675i;
            if (runnable != null) {
                runnable.run();
            }
            g0.this.f75639k3.clear();
            if (g0Var != null) {
                g0Var.p0(k.f75678b, true);
            }
        }

        private void t() {
            ArrayList<androidx.core.util.e<r0>> arrayList = this.f75669c;
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = this.f75669c.size();
                if (this.f75673g == null) {
                    this.f75673g = new androidx.core.util.e[size];
                }
                androidx.core.util.e<r0>[] eVarArr = (androidx.core.util.e[]) this.f75669c.toArray(this.f75673g);
                this.f75673g = null;
                for (int i10 = 0; i10 < size; i10++) {
                    eVarArr[i10].accept(this);
                    eVarArr[i10] = null;
                }
                this.f75673g = eVarArr;
            }
        }

        private void u() {
            if (this.f75672f != null) {
                return;
            }
            this.f75674h.a(AnimationUtils.currentAnimationTimeMillis(), this.f75667a);
            this.f75672f = new androidx.dynamicanimation.animation.g(new androidx.dynamicanimation.animation.e());
            androidx.dynamicanimation.animation.h hVar = new androidx.dynamicanimation.animation.h();
            hVar.g(1.0f);
            hVar.i(200.0f);
            this.f75672f.D(hVar);
            this.f75672f.t(this.f75667a);
            this.f75672f.c(this);
            this.f75672f.u(this.f75674h.b());
            this.f75672f.p(a() + 1);
            this.f75672f.q(-1.0f);
            this.f75672f.r(4.0f);
            this.f75672f.b(new androidx.dynamicanimation.animation.b.q() { // from class: androidx.transition.h0
                @Override // androidx.dynamicanimation.animation.b.q
                public final void a(androidx.dynamicanimation.animation.b bVar, boolean z10, float f10, float f11) {
                    g0.i.s(this.f75708a, bVar, z10, f10, f11);
                }
            });
        }

        @Override // androidx.transition.r0
        public long a() {
            return g0.this.a0();
        }

        @Override // androidx.transition.r0
        public void c(float f10) {
            if (this.f75672f != null) {
                throw new IllegalStateException("setCurrentFraction() called after animation has been started");
            }
            l((long) (f10 * a()));
        }

        @Override // androidx.transition.r0
        public void d(@NonNull androidx.core.util.e<r0> eVar) {
            ArrayList<androidx.core.util.e<r0>> arrayList = this.f75669c;
            if (arrayList != null) {
                arrayList.remove(eVar);
            }
        }

        @Override // androidx.transition.r0
        public long e() {
            return Math.min(a(), Math.max(0L, this.f75667a));
        }

        @Override // androidx.transition.r0
        public void f() {
            u();
            this.f75672f.z(a() + 1);
        }

        @Override // androidx.dynamicanimation.animation.b.r
        public void g(androidx.dynamicanimation.animation.b bVar, float f10, float f11) {
            long jMax = Math.max(-1L, Math.min(a() + 1, Math.round(f10)));
            g0.this.D0(jMax, this.f75667a);
            this.f75667a = jMax;
            t();
        }

        @Override // androidx.transition.r0
        public float getCurrentFraction() {
            return e() / a();
        }

        @Override // androidx.transition.r0
        public void h(@NonNull androidx.core.util.e<r0> eVar) {
            if (isReady()) {
                eVar.accept(this);
                return;
            }
            if (this.f75668b == null) {
                this.f75668b = new ArrayList<>();
            }
            this.f75668b.add(eVar);
        }

        @Override // androidx.transition.r0
        public void i(@NonNull androidx.core.util.e<r0> eVar) {
            ArrayList<androidx.core.util.e<r0>> arrayList = this.f75668b;
            if (arrayList != null) {
                arrayList.remove(eVar);
                if (this.f75668b.isEmpty()) {
                    this.f75668b = null;
                }
            }
        }

        @Override // androidx.transition.r0
        public boolean isReady() {
            return this.f75670d;
        }

        @Override // androidx.transition.r0
        public void l(long j10) {
            if (this.f75672f != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j10 != this.f75667a && isReady()) {
                if (!this.f75671e) {
                    if (j10 != 0 || this.f75667a <= 0) {
                        long jA = a();
                        if (j10 == jA && this.f75667a < jA) {
                            j10 = 1 + jA;
                        }
                    } else {
                        j10 = -1;
                    }
                    long j11 = this.f75667a;
                    if (j10 != j11) {
                        g0.this.D0(j10, j11);
                        this.f75667a = j10;
                    }
                }
                t();
                this.f75674h.a(AnimationUtils.currentAnimationTimeMillis(), j10);
            }
        }

        @Override // androidx.transition.r0
        public void n(@NonNull androidx.core.util.e<r0> eVar) {
            if (this.f75669c == null) {
                this.f75669c = new ArrayList<>();
            }
            this.f75669c.add(eVar);
        }

        @Override // androidx.transition.r0
        public void p(@NonNull Runnable runnable) {
            this.f75675i = runnable;
            u();
            this.f75672f.z(0.0f);
        }

        @Override // androidx.transition.o0, androidx.transition.g0.j
        public void q(@NonNull g0 g0Var) {
            this.f75671e = true;
        }

        void v() {
            long j10 = a() == 0 ? 1L : 0L;
            g0.this.D0(j10, this.f75667a);
            this.f75667a = j10;
        }

        public void w() {
            this.f75670d = true;
            ArrayList<androidx.core.util.e<r0>> arrayList = this.f75668b;
            if (arrayList != null) {
                this.f75668b = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(this);
                }
            }
            t();
        }
    }

    public interface j {
        void b(@NonNull g0 g0Var);

        void j(@NonNull g0 g0Var);

        void k(@NonNull g0 g0Var);

        default void m(@NonNull g0 g0Var, boolean z10) {
            o(g0Var);
        }

        void o(@NonNull g0 g0Var);

        void q(@NonNull g0 g0Var);

        default void r(@NonNull g0 g0Var, boolean z10) {
            j(g0Var);
        }
    }

    interface k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f75677a = new k() { // from class: androidx.transition.i0
            @Override // androidx.transition.g0.k
            public final void d(g0.j jVar, g0 g0Var, boolean z10) {
                jVar.r(g0Var, z10);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final k f75678b = new k() { // from class: androidx.transition.j0
            @Override // androidx.transition.g0.k
            public final void d(g0.j jVar, g0 g0Var, boolean z10) {
                jVar.m(g0Var, z10);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f75679c = new k() { // from class: androidx.transition.k0
            @Override // androidx.transition.g0.k
            public final void d(g0.j jVar, g0 g0Var, boolean z10) {
                jVar.q(g0Var);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final k f75680d = new k() { // from class: androidx.transition.l0
            @Override // androidx.transition.g0.k
            public final void d(g0.j jVar, g0 g0Var, boolean z10) {
                jVar.k(g0Var);
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final k f75681e = new k() { // from class: androidx.transition.m0
            @Override // androidx.transition.g0.k
            public final void d(g0.j jVar, g0 g0Var, boolean z10) {
                jVar.b(g0Var);
            }
        };

        void d(@NonNull j jVar, @NonNull g0 g0Var, boolean z10);
    }

    public g0() {
    }

    private void A0(Animator animator, androidx.collection.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            k(animator);
        }
    }

    private ArrayList<Integer> B(ArrayList<Integer> arrayList, int i10, boolean z10) {
        if (i10 > 0) {
            return z10 ? e.a(arrayList, Integer.valueOf(i10)) : e.b(arrayList, Integer.valueOf(i10));
        }
        return arrayList;
    }

    private static <T> ArrayList<T> C(ArrayList<T> arrayList, T t10, boolean z10) {
        if (t10 != null) {
            return z10 ? e.a(arrayList, t10) : e.b(arrayList, t10);
        }
        return arrayList;
    }

    private ArrayList<Class<?>> H(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z10) {
        if (cls != null) {
            return z10 ? e.a(arrayList, cls) : e.b(arrayList, cls);
        }
        return arrayList;
    }

    private ArrayList<View> I(ArrayList<View> arrayList, View view, boolean z10) {
        if (view != null) {
            return z10 ? e.a(arrayList, view) : e.b(arrayList, view);
        }
        return arrayList;
    }

    private static androidx.collection.a<Animator, d> U() {
        androidx.collection.a<Animator, d> aVar = H3.get();
        if (aVar == null) {
            aVar = new androidx.collection.a<>();
            H3.set(aVar);
        }
        return aVar;
    }

    private static boolean g0(int i10) {
        return i10 >= 1 && i10 <= 4;
    }

    private void h(androidx.collection.a<View, u0> aVar, androidx.collection.a<View, u0> aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            u0 u0VarK = aVar.k(i10);
            if (h0(u0VarK.f75776b)) {
                this.X.add(u0VarK);
                this.Y.add(null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            u0 u0VarK2 = aVar2.k(i11);
            if (h0(u0VarK2.f75776b)) {
                this.Y.add(u0VarK2);
                this.X.add(null);
            }
        }
    }

    private static void i(v0 v0Var, View view, u0 u0Var) {
        v0Var.f75778a.put(view, u0Var);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (v0Var.f75779b.indexOfKey(id2) >= 0) {
                v0Var.f75779b.put(id2, null);
            } else {
                v0Var.f75779b.put(id2, view);
            }
        }
        String strA0 = u1.A0(view);
        if (strA0 != null) {
            if (v0Var.f75781d.containsKey(strA0)) {
                v0Var.f75781d.put(strA0, null);
            } else {
                v0Var.f75781d.put(strA0, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (v0Var.f75780c.i(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    v0Var.f75780c.n(itemIdAtPosition, view);
                    return;
                }
                View viewG = v0Var.f75780c.g(itemIdAtPosition);
                if (viewG != null) {
                    viewG.setHasTransientState(false);
                    v0Var.f75780c.n(itemIdAtPosition, null);
                }
            }
        }
    }

    private static boolean i0(u0 u0Var, u0 u0Var2, String str) {
        Object obj = u0Var.f75775a.get(str);
        Object obj2 = u0Var2.f75775a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private static boolean j(int[] iArr, int i10) {
        int i11 = iArr[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            if (iArr[i12] == i11) {
                return true;
            }
        }
        return false;
    }

    private void j0(androidx.collection.a<View, u0> aVar, androidx.collection.a<View, u0> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View viewValueAt = sparseArray.valueAt(i10);
            if (viewValueAt != null && h0(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && h0(view)) {
                u0 u0Var = aVar.get(viewValueAt);
                u0 u0Var2 = aVar2.get(view);
                if (u0Var != null && u0Var2 != null) {
                    this.X.add(u0Var);
                    this.Y.add(u0Var2);
                    aVar.remove(viewValueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void k0(androidx.collection.a<View, u0> aVar, androidx.collection.a<View, u0> aVar2) {
        u0 u0VarRemove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewG = aVar.g(size);
            if (viewG != null && h0(viewG) && (u0VarRemove = aVar2.remove(viewG)) != null && h0(u0VarRemove.f75776b)) {
                this.X.add(aVar.i(size));
                this.Y.add(u0VarRemove);
            }
        }
    }

    private void l0(androidx.collection.a<View, u0> aVar, androidx.collection.a<View, u0> aVar2, androidx.collection.b1<View> b1Var, androidx.collection.b1<View> b1Var2) {
        View viewG;
        int size = b1Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            View viewW = b1Var.w(i10);
            if (viewW != null && h0(viewW) && (viewG = b1Var2.g(b1Var.l(i10))) != null && h0(viewG)) {
                u0 u0Var = aVar.get(viewW);
                u0 u0Var2 = aVar2.get(viewG);
                if (u0Var != null && u0Var2 != null) {
                    this.X.add(u0Var);
                    this.Y.add(u0Var2);
                    aVar.remove(viewW);
                    aVar2.remove(viewG);
                }
            }
        }
    }

    private void m0(androidx.collection.a<View, u0> aVar, androidx.collection.a<View, u0> aVar2, androidx.collection.a<String, View> aVar3, androidx.collection.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View viewK = aVar3.k(i10);
            if (viewK != null && h0(viewK) && (view = aVar4.get(aVar3.g(i10))) != null && h0(view)) {
                u0 u0Var = aVar.get(viewK);
                u0 u0Var2 = aVar2.get(view);
                if (u0Var != null && u0Var2 != null) {
                    this.X.add(u0Var);
                    this.Y.add(u0Var2);
                    aVar.remove(viewK);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void n(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f75634i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.f75636j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f75638k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f75638k.get(i10).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    u0 u0Var = new u0(view);
                    if (z10) {
                        p(u0Var);
                    } else {
                        l(u0Var);
                    }
                    u0Var.f75777c.add(this);
                    o(u0Var);
                    if (z10) {
                        i(this.f75654s, view, u0Var);
                    } else {
                        i(this.f75655t, view, u0Var);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f75642m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.f75644n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f75646o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.f75646o.get(i11).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                n(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    private void n0(v0 v0Var, v0 v0Var2) {
        androidx.collection.a<View, u0> aVar = new androidx.collection.a<>(v0Var.f75778a);
        androidx.collection.a<View, u0> aVar2 = new androidx.collection.a<>(v0Var2.f75778a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f75657w;
            if (i10 >= iArr.length) {
                h(aVar, aVar2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                k0(aVar, aVar2);
            } else if (i11 == 2) {
                m0(aVar, aVar2, v0Var.f75781d, v0Var2.f75781d);
            } else if (i11 == 3) {
                j0(aVar, aVar2, v0Var.f75779b, v0Var2.f75779b);
            } else if (i11 == 4) {
                l0(aVar, aVar2, v0Var.f75780c, v0Var2.f75780c);
            }
            i10++;
        }
    }

    private void o0(g0 g0Var, k kVar, boolean z10) {
        g0 g0Var2 = this.f75635i3;
        if (g0Var2 != null) {
            g0Var2.o0(g0Var, kVar, z10);
        }
        ArrayList<j> arrayList = this.f75637j3;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f75637j3.size();
        j[] jVarArr = this.Z;
        if (jVarArr == null) {
            jVarArr = new j[size];
        }
        this.Z = null;
        j[] jVarArr2 = (j[]) this.f75637j3.toArray(jVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            kVar.d(jVarArr2[i10], g0Var, z10);
            jVarArr2[i10] = null;
        }
        this.Z = jVarArr2;
    }

    private static int[] q0(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i10 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(strTrim)) {
                iArr[i10] = 3;
            } else if (B3.equalsIgnoreCase(strTrim)) {
                iArr[i10] = 1;
            } else if ("name".equalsIgnoreCase(strTrim)) {
                iArr[i10] = 2;
            } else if (E3.equalsIgnoreCase(strTrim)) {
                iArr[i10] = 4;
            } else {
                if (!strTrim.isEmpty()) {
                    throw new InflateException("Unknown match type in matchOrder: '" + strTrim + "'");
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                i10--;
                iArr = iArr2;
            }
            i10++;
        }
        return iArr;
    }

    @NonNull
    public g0 A(@NonNull Class<?> cls, boolean z10) {
        this.f75646o = H(this.f75646o, cls, z10);
        return this;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    protected void B0() {
        L0();
        androidx.collection.a<Animator, d> aVarU = U();
        for (Animator animator : this.f75639k3) {
            if (aVarU.containsKey(animator)) {
                L0();
                A0(animator, aVarU);
            }
        }
        this.f75639k3.clear();
        w();
    }

    void C0(boolean z10) {
        this.f75648p0 = z10;
    }

    @NonNull
    public g0 D(@androidx.annotation.d0 int i10, boolean z10) {
        this.f75634i = B(this.f75634i, i10, z10);
        return this;
    }

    @androidx.annotation.w0(34)
    void D0(long j10, long j11) {
        long jA0 = a0();
        int i10 = 0;
        boolean z10 = j10 < j11;
        if ((j11 < 0 && j10 >= 0) || (j11 > jA0 && j10 <= jA0)) {
            this.f75633h3 = false;
            p0(k.f75677a, z10);
        }
        int size = this.f75649p1.size();
        Animator[] animatorArr = (Animator[]) this.f75649p1.toArray(this.H1);
        this.H1 = f75617t3;
        while (i10 < size) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            g.b(animator, Math.min(Math.max(0L, j10), g.a(animator)));
            i10++;
            jA0 = jA0;
        }
        long j12 = jA0;
        this.H1 = animatorArr;
        if ((j10 <= j12 || j11 > j12) && (j10 >= 0 || j11 < 0)) {
            return;
        }
        if (j10 > j12) {
            this.f75633h3 = true;
        }
        p0(k.f75678b, z10);
    }

    @NonNull
    public g0 E(@NonNull View view, boolean z10) {
        this.f75636j = I(this.f75636j, view, z10);
        return this;
    }

    @NonNull
    public g0 E0(long j10) {
        this.f75626c = j10;
        return this;
    }

    @NonNull
    public g0 F(@NonNull Class<?> cls, boolean z10) {
        this.f75638k = H(this.f75638k, cls, z10);
        return this;
    }

    public void F0(@androidx.annotation.p0 f fVar) {
        this.f75643m3 = fVar;
    }

    @NonNull
    public g0 G(@NonNull String str, boolean z10) {
        this.f75640l = C(this.f75640l, str, z10);
        return this;
    }

    @NonNull
    public g0 G0(@androidx.annotation.p0 TimeInterpolator timeInterpolator) {
        this.f75627d = timeInterpolator;
        return this;
    }

    public void H0(@androidx.annotation.p0 int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f75657w = F3;
            return;
        }
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (!g0(iArr[i10])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (j(iArr, i10)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.f75657w = (int[]) iArr.clone();
    }

    public void I0(@androidx.annotation.p0 w wVar) {
        if (wVar == null) {
            this.f75647o3 = G3;
        } else {
            this.f75647o3 = wVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    void J(@androidx.annotation.p0 ViewGroup viewGroup) {
        androidx.collection.a<Animator, d> aVarU = U();
        int size = aVarU.size();
        if (viewGroup != null && size != 0) {
            WindowId windowId = viewGroup.getWindowId();
            androidx.collection.a aVar = new androidx.collection.a(aVarU);
            aVarU.clear();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = (d) aVar.k(i10);
                if (dVar.f75661a != null && windowId.equals(dVar.f75664d)) {
                    ((Animator) aVar.g(i10)).end();
                }
            }
        }
    }

    public void J0(@androidx.annotation.p0 q0 q0Var) {
        this.f75641l3 = q0Var;
    }

    public long K() {
        return this.f75626c;
    }

    @NonNull
    public g0 K0(long j10) {
        this.f75625b = j10;
        return this;
    }

    @androidx.annotation.p0
    public Rect L() {
        f fVar = this.f75643m3;
        if (fVar == null) {
            return null;
        }
        return fVar.a(this);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    protected void L0() {
        if (this.f75650p2 == 0) {
            p0(k.f75677a, false);
            this.f75633h3 = false;
        }
        this.f75650p2++;
    }

    @androidx.annotation.p0
    public f M() {
        return this.f75643m3;
    }

    String M0(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f75626c != -1) {
            sb2.append("dur(");
            sb2.append(this.f75626c);
            sb2.append(") ");
        }
        if (this.f75625b != -1) {
            sb2.append("dly(");
            sb2.append(this.f75625b);
            sb2.append(") ");
        }
        if (this.f75627d != null) {
            sb2.append("interp(");
            sb2.append(this.f75627d);
            sb2.append(") ");
        }
        if (this.f75628e.size() > 0 || this.f75629f.size() > 0) {
            sb2.append("tgts(");
            if (this.f75628e.size() > 0) {
                for (int i10 = 0; i10 < this.f75628e.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f75628e.get(i10));
                }
            }
            if (this.f75629f.size() > 0) {
                for (int i11 = 0; i11 < this.f75629f.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f75629f.get(i11));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    @androidx.annotation.p0
    public TimeInterpolator N() {
        return this.f75627d;
    }

    u0 O(View view, boolean z10) {
        s0 s0Var = this.f75656v;
        if (s0Var != null) {
            return s0Var.O(view, z10);
        }
        ArrayList<u0> arrayList = z10 ? this.X : this.Y;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            u0 u0Var = arrayList.get(i10);
            if (u0Var == null) {
                return null;
            }
            if (u0Var.f75776b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (z10 ? this.Y : this.X).get(i10);
        }
        return null;
    }

    @NonNull
    public String P() {
        return this.f75624a;
    }

    @NonNull
    public w Q() {
        return this.f75647o3;
    }

    @androidx.annotation.p0
    public q0 S() {
        return this.f75641l3;
    }

    @NonNull
    public final g0 T() {
        s0 s0Var = this.f75656v;
        return s0Var != null ? s0Var.T() : this;
    }

    public long V() {
        return this.f75625b;
    }

    @NonNull
    public List<Integer> W() {
        return this.f75628e;
    }

    @androidx.annotation.p0
    public List<String> X() {
        return this.f75630g;
    }

    @androidx.annotation.p0
    public List<Class<?>> Y() {
        return this.f75632h;
    }

    @NonNull
    public List<View> Z() {
        return this.f75629f;
    }

    final long a0() {
        return this.f75651p3;
    }

    @androidx.annotation.p0
    public String[] b0() {
        return null;
    }

    @NonNull
    public g0 c(@NonNull j jVar) {
        if (this.f75637j3 == null) {
            this.f75637j3 = new ArrayList<>();
        }
        this.f75637j3.add(jVar);
        return this;
    }

    @androidx.annotation.p0
    public u0 c0(@NonNull View view, boolean z10) {
        s0 s0Var = this.f75656v;
        if (s0Var != null) {
            return s0Var.c0(view, z10);
        }
        return (z10 ? this.f75654s : this.f75655t).f75778a.get(view);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    protected void cancel() {
        int size = this.f75649p1.size();
        Animator[] animatorArr = (Animator[]) this.f75649p1.toArray(this.H1);
        this.H1 = f75617t3;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.H1 = animatorArr;
        p0(k.f75679c, false);
    }

    @NonNull
    public g0 d(@androidx.annotation.d0 int i10) {
        if (i10 != 0) {
            this.f75628e.add(Integer.valueOf(i10));
        }
        return this;
    }

    boolean d0() {
        return !this.f75649p1.isEmpty();
    }

    @NonNull
    public g0 e(@NonNull View view) {
        this.f75629f.add(view);
        return this;
    }

    public boolean e0() {
        return false;
    }

    @NonNull
    public g0 f(@NonNull Class<?> cls) {
        if (this.f75632h == null) {
            this.f75632h = new ArrayList<>();
        }
        this.f75632h.add(cls);
        return this;
    }

    public boolean f0(@androidx.annotation.p0 u0 u0Var, @androidx.annotation.p0 u0 u0Var2) {
        if (u0Var != null && u0Var2 != null) {
            String[] strArrB0 = b0();
            if (strArrB0 != null) {
                for (String str : strArrB0) {
                    if (i0(u0Var, u0Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator<String> it = u0Var.f75775a.keySet().iterator();
                while (it.hasNext()) {
                    if (i0(u0Var, u0Var2, it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @NonNull
    public g0 g(@NonNull String str) {
        if (this.f75630g == null) {
            this.f75630g = new ArrayList<>();
        }
        this.f75630g.add(str);
        return this;
    }

    boolean h0(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f75634i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f75636j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f75638k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f75638k.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f75640l != null && u1.A0(view) != null && this.f75640l.contains(u1.A0(view))) {
            return false;
        }
        if (this.f75628e.size() == 0 && this.f75629f.size() == 0 && (((arrayList = this.f75632h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f75630g) == null || arrayList2.isEmpty()))) {
            return true;
        }
        if (this.f75628e.contains(Integer.valueOf(id2)) || this.f75629f.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f75630g;
        if (arrayList6 != null && arrayList6.contains(u1.A0(view))) {
            return true;
        }
        if (this.f75632h != null) {
            for (int i11 = 0; i11 < this.f75632h.size(); i11++) {
                if (this.f75632h.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    protected void k(@androidx.annotation.p0 Animator animator) {
        if (animator == null) {
            w();
            return;
        }
        if (K() >= 0) {
            animator.setDuration(K());
        }
        if (V() >= 0) {
            animator.setStartDelay(V() + animator.getStartDelay());
        }
        if (N() != null) {
            animator.setInterpolator(N());
        }
        animator.addListener(new c());
        animator.start();
    }

    public abstract void l(@NonNull u0 u0Var);

    void o(u0 u0Var) {
        String[] strArrB;
        if (this.f75641l3 == null || u0Var.f75775a.isEmpty() || (strArrB = this.f75641l3.b()) == null) {
            return;
        }
        for (String str : strArrB) {
            if (!u0Var.f75775a.containsKey(str)) {
                this.f75641l3.a(u0Var);
                return;
            }
        }
    }

    public abstract void p(@NonNull u0 u0Var);

    void p0(k kVar, boolean z10) {
        o0(this, kVar, z10);
    }

    void q(@NonNull ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        androidx.collection.a<String, String> aVar;
        r(z10);
        if ((this.f75628e.size() > 0 || this.f75629f.size() > 0) && (((arrayList = this.f75630g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f75632h) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f75628e.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(this.f75628e.get(i10).intValue());
                if (viewFindViewById != null) {
                    u0 u0Var = new u0(viewFindViewById);
                    if (z10) {
                        p(u0Var);
                    } else {
                        l(u0Var);
                    }
                    u0Var.f75777c.add(this);
                    o(u0Var);
                    if (z10) {
                        i(this.f75654s, viewFindViewById, u0Var);
                    } else {
                        i(this.f75655t, viewFindViewById, u0Var);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f75629f.size(); i11++) {
                View view = this.f75629f.get(i11);
                u0 u0Var2 = new u0(view);
                if (z10) {
                    p(u0Var2);
                } else {
                    l(u0Var2);
                }
                u0Var2.f75777c.add(this);
                o(u0Var2);
                if (z10) {
                    i(this.f75654s, view, u0Var2);
                } else {
                    i(this.f75655t, view, u0Var2);
                }
            }
        } else {
            n(viewGroup, z10);
        }
        if (!z10 && (aVar = this.f75645n3) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList3.add(this.f75654s.f75781d.remove(this.f75645n3.g(i12)));
            }
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = (View) arrayList3.get(i13);
                if (view2 != null) {
                    this.f75654s.f75781d.put(this.f75645n3.k(i13), view2);
                }
            }
        }
    }

    void r(boolean z10) {
        if (z10) {
            this.f75654s.f75778a.clear();
            this.f75654s.f75779b.clear();
            this.f75654s.f75780c.b();
        } else {
            this.f75655t.f75778a.clear();
            this.f75655t.f75779b.clear();
            this.f75655t.f75780c.b();
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void r0(@androidx.annotation.p0 View view) {
        if (this.f75633h3) {
            return;
        }
        int size = this.f75649p1.size();
        Animator[] animatorArr = (Animator[]) this.f75649p1.toArray(this.H1);
        this.H1 = f75617t3;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.H1 = animatorArr;
        p0(k.f75680d, false);
        this.f75631g3 = true;
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public g0 clone() {
        try {
            g0 g0Var = (g0) super.clone();
            g0Var.f75639k3 = new ArrayList<>();
            g0Var.f75654s = new v0();
            g0Var.f75655t = new v0();
            g0Var.X = null;
            g0Var.Y = null;
            g0Var.f75652q3 = null;
            g0Var.f75635i3 = this;
            g0Var.f75637j3 = null;
            return g0Var;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    void s0(@NonNull ViewGroup viewGroup) {
        d dVar;
        this.X = new ArrayList<>();
        this.Y = new ArrayList<>();
        n0(this.f75654s, this.f75655t);
        androidx.collection.a<Animator, d> aVarU = U();
        int size = aVarU.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animatorG = aVarU.g(i10);
            if (animatorG != null && (dVar = aVarU.get(animatorG)) != null && dVar.f75661a != null && windowId.equals(dVar.f75664d)) {
                u0 u0Var = dVar.f75663c;
                View view = dVar.f75661a;
                u0 u0VarC0 = c0(view, true);
                u0 u0VarO = O(view, true);
                if (u0VarC0 == null && u0VarO == null) {
                    u0VarO = this.f75655t.f75778a.get(view);
                }
                if ((u0VarC0 != null || u0VarO != null) && dVar.f75665e.f0(u0Var, u0VarO)) {
                    g0 g0Var = dVar.f75665e;
                    if (g0Var.T().f75652q3 != null) {
                        animatorG.cancel();
                        g0Var.f75649p1.remove(animatorG);
                        aVarU.remove(animatorG);
                        if (g0Var.f75649p1.size() == 0) {
                            g0Var.p0(k.f75679c, false);
                            if (!g0Var.f75633h3) {
                                g0Var.f75633h3 = true;
                                g0Var.p0(k.f75678b, false);
                            }
                        }
                    } else if (animatorG.isRunning() || animatorG.isStarted()) {
                        animatorG.cancel();
                    } else {
                        aVarU.remove(animatorG);
                    }
                }
            }
        }
        u(viewGroup, this.f75654s, this.f75655t, this.X, this.Y);
        if (this.f75652q3 == null) {
            B0();
        } else if (Build.VERSION.SDK_INT >= 34) {
            t0();
            this.f75652q3.v();
            this.f75652q3.w();
        }
    }

    @androidx.annotation.p0
    public Animator t(@NonNull ViewGroup viewGroup, @androidx.annotation.p0 u0 u0Var, @androidx.annotation.p0 u0 u0Var2) {
        return null;
    }

    @androidx.annotation.w0(34)
    void t0() {
        androidx.collection.a<Animator, d> aVarU = U();
        this.f75651p3 = 0L;
        for (int i10 = 0; i10 < this.f75639k3.size(); i10++) {
            Animator animator = this.f75639k3.get(i10);
            d dVar = aVarU.get(animator);
            if (animator != null && dVar != null) {
                if (K() >= 0) {
                    dVar.f75666f.setDuration(K());
                }
                if (V() >= 0) {
                    dVar.f75666f.setStartDelay(V() + dVar.f75666f.getStartDelay());
                }
                if (N() != null) {
                    dVar.f75666f.setInterpolator(N());
                }
                this.f75649p1.add(animator);
                this.f75651p3 = Math.max(this.f75651p3, g.a(animator));
            }
        }
        this.f75639k3.clear();
    }

    @NonNull
    public String toString() {
        return M0("");
    }

    void u(@NonNull ViewGroup viewGroup, @NonNull v0 v0Var, @NonNull v0 v0Var2, @NonNull ArrayList<u0> arrayList, @NonNull ArrayList<u0> arrayList2) {
        Animator animatorT;
        int i10;
        boolean z10;
        int i11;
        View view;
        u0 u0Var;
        Animator animator;
        Animator animator2;
        u0 u0Var2;
        androidx.collection.a<Animator, d> aVarU = U();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z11 = T().f75652q3 != null;
        long jMin = Long.MAX_VALUE;
        int i12 = 0;
        while (i12 < size) {
            u0 u0Var3 = arrayList.get(i12);
            u0 u0Var4 = arrayList2.get(i12);
            if (u0Var3 != null && !u0Var3.f75777c.contains(this)) {
                u0Var3 = null;
            }
            if (u0Var4 != null && !u0Var4.f75777c.contains(this)) {
                u0Var4 = null;
            }
            if (!(u0Var3 == null && u0Var4 == null) && ((u0Var3 == null || u0Var4 == null || f0(u0Var3, u0Var4)) && (animatorT = t(viewGroup, u0Var3, u0Var4)) != null)) {
                if (u0Var4 != null) {
                    View view2 = u0Var4.f75776b;
                    String[] strArrB0 = b0();
                    if (strArrB0 != null && strArrB0.length > 0) {
                        u0Var2 = new u0(view2);
                        i10 = size;
                        z10 = z11;
                        u0 u0Var5 = v0Var2.f75778a.get(view2);
                        i11 = i12;
                        if (u0Var5 != null) {
                            int i13 = 0;
                            while (i13 < strArrB0.length) {
                                Map<String, Object> map = u0Var2.f75775a;
                                int i14 = i13;
                                String str = strArrB0[i14];
                                map.put(str, u0Var5.f75775a.get(str));
                                i13 = i14 + 1;
                                strArrB0 = strArrB0;
                            }
                        }
                        int size2 = aVarU.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                view = view2;
                                animator2 = animatorT;
                                break;
                            }
                            d dVar = aVarU.get(aVarU.g(i15));
                            if (dVar.f75663c != null && dVar.f75661a == view2) {
                                view = view2;
                                if (dVar.f75662b.equals(P()) && dVar.f75663c.equals(u0Var2)) {
                                    animator2 = null;
                                    break;
                                }
                            } else {
                                view = view2;
                            }
                            i15++;
                            view2 = view;
                        }
                    } else {
                        view = view2;
                        i10 = size;
                        z10 = z11;
                        i11 = i12;
                        animator2 = animatorT;
                        u0Var2 = null;
                    }
                    u0 u0Var6 = u0Var2;
                    animator = animator2;
                    u0Var = u0Var6;
                } else {
                    i10 = size;
                    z10 = z11;
                    i11 = i12;
                    view = u0Var3.f75776b;
                    u0Var = null;
                }
                if (animator != null) {
                    animator = animatorT;
                    q0 q0Var = this.f75641l3;
                    if (q0Var != null) {
                        long jC = q0Var.c(viewGroup, this, u0Var3, u0Var4);
                        sparseIntArray.put(this.f75639k3.size(), (int) jC);
                        jMin = Math.min(jC, jMin);
                    }
                    long j10 = jMin;
                    d dVar2 = new d(view, P(), this, viewGroup.getWindowId(), u0Var, animator);
                    Animator animator3 = animator;
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animator);
                        animator3 = animatorSet;
                    }
                    aVarU.put(animator3, dVar2);
                    this.f75639k3.add(animator3);
                    jMin = j10;
                } else {
                    animator = animatorT;
                }
            } else {
                i10 = size;
                z10 = z11;
                i11 = i12;
            }
            i12 = i11 + 1;
            size = i10;
            z11 = z10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                d dVar3 = aVarU.get(this.f75639k3.get(sparseIntArray.keyAt(i16)));
                dVar3.f75666f.setStartDelay((((long) sparseIntArray.valueAt(i16)) - jMin) + dVar3.f75666f.getStartDelay());
            }
        }
    }

    @NonNull
    public g0 u0(@NonNull j jVar) {
        g0 g0Var;
        ArrayList<j> arrayList = this.f75637j3;
        if (arrayList != null) {
            if (!arrayList.remove(jVar) && (g0Var = this.f75635i3) != null) {
                g0Var.u0(jVar);
            }
            if (this.f75637j3.size() == 0) {
                this.f75637j3 = null;
            }
        }
        return this;
    }

    @NonNull
    @androidx.annotation.w0(34)
    r0 v() {
        i iVar = new i();
        this.f75652q3 = iVar;
        c(iVar);
        return this.f75652q3;
    }

    @NonNull
    public g0 v0(@androidx.annotation.d0 int i10) {
        if (i10 != 0) {
            this.f75628e.remove(Integer.valueOf(i10));
        }
        return this;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    protected void w() {
        int i10 = this.f75650p2 - 1;
        this.f75650p2 = i10;
        if (i10 == 0) {
            p0(k.f75678b, false);
            for (int i11 = 0; i11 < this.f75654s.f75780c.size(); i11++) {
                View viewW = this.f75654s.f75780c.w(i11);
                if (viewW != null) {
                    viewW.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.f75655t.f75780c.size(); i12++) {
                View viewW2 = this.f75655t.f75780c.w(i12);
                if (viewW2 != null) {
                    viewW2.setHasTransientState(false);
                }
            }
            this.f75633h3 = true;
        }
    }

    @NonNull
    public g0 w0(@NonNull View view) {
        this.f75629f.remove(view);
        return this;
    }

    @NonNull
    public g0 x(@androidx.annotation.d0 int i10, boolean z10) {
        this.f75642m = B(this.f75642m, i10, z10);
        return this;
    }

    @NonNull
    public g0 x0(@NonNull Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.f75632h;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @NonNull
    public g0 y0(@NonNull String str) {
        ArrayList<String> arrayList = this.f75630g;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @NonNull
    public g0 z(@NonNull View view, boolean z10) {
        this.f75644n = I(this.f75644n, view, z10);
        return this;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void z0(@androidx.annotation.p0 View view) {
        if (this.f75631g3) {
            if (!this.f75633h3) {
                int size = this.f75649p1.size();
                Animator[] animatorArr = (Animator[]) this.f75649p1.toArray(this.H1);
                this.H1 = f75617t3;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.H1 = animatorArr;
                p0(k.f75681e, false);
            }
            this.f75631g3 = false;
        }
    }

    public g0(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.f75566c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jK = androidx.core.content.res.n.k(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jK >= 0) {
            E0(jK);
        }
        long jK2 = androidx.core.content.res.n.k(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (jK2 > 0) {
            K0(jK2);
        }
        int iL = androidx.core.content.res.n.l(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (iL > 0) {
            G0(AnimationUtils.loadInterpolator(context, iL));
        }
        String strM = androidx.core.content.res.n.m(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strM != null) {
            H0(q0(strM));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
