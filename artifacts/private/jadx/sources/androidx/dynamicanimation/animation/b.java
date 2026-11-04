package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.annotation.b1;
import androidx.annotation.x;
import androidx.core.view.u1;
import androidx.dynamicanimation.animation.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<T extends b<T>> implements androidx.dynamicanimation.animation.a.b {
    public static final float A = 1.0f;
    public static final float B = 0.1f;
    public static final float C = 0.00390625f;
    public static final float D = 0.002f;
    private static final float E = Float.MAX_VALUE;
    private static final float F = 0.75f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final s f50987m = new g("translationX");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f50988n = new h("translationY");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f50989o = new i("translationZ");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s f50990p = new j("scaleX");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final s f50991q = new k("scaleY");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s f50992r = new l(androidx.constraintlayout.motion.widget.f.f45124i);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s f50993s = new m("rotationX");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s f50994t = new n("rotationY");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s f50995u = new o("x");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s f50996v = new a("y");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final s f50997w = new C0460b("z");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s f50998x = new c("alpha");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final s f50999y = new d("scrollX");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final s f51000z = new e("scrollY");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f51001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f51002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f51003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f51004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final androidx.dynamicanimation.animation.d f51005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f51006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f51007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f51008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f51009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f51010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList<q> f51011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ArrayList<r> f51012l;

    static class a extends s {
        a(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getY();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setY(f10);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.b$b, reason: collision with other inner class name */
    static class C0460b extends s {
        C0460b(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return u1.I0(view);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            u1.J2(view, f10);
        }
    }

    static class c extends s {
        c(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getAlpha();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    static class d extends s {
        d(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getScrollX();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    static class e extends s {
        e(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getScrollY();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    class f extends androidx.dynamicanimation.animation.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.dynamicanimation.animation.e f51013b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, androidx.dynamicanimation.animation.e eVar) {
            super(str);
            this.f51013b = eVar;
        }

        @Override // androidx.dynamicanimation.animation.d
        public float b(Object obj) {
            return this.f51013b.a();
        }

        @Override // androidx.dynamicanimation.animation.d
        public void c(Object obj, float f10) {
            this.f51013b.b(f10);
        }
    }

    static class g extends s {
        g(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    static class h extends s {
        h(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getTranslationY();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    static class i extends s {
        i(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return u1.D0(view);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            u1.F2(view, f10);
        }
    }

    static class j extends s {
        j(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getScaleX();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    static class k extends s {
        k(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getScaleY();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    static class l extends s {
        l(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getRotation();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setRotation(f10);
        }
    }

    static class m extends s {
        m(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getRotationX();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    static class n extends s {
        n(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getRotationY();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    static class o extends s {
        o(String str) {
            super(str, null);
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getX();
        }

        @Override // androidx.dynamicanimation.animation.d
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setX(f10);
        }
    }

    static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f51015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f51016b;

        p() {
        }
    }

    public interface q {
        void a(b bVar, boolean z10, float f10, float f11);
    }

    public interface r {
        void g(b bVar, float f10, float f11);
    }

    public static abstract class s extends androidx.dynamicanimation.animation.d<View> {
        /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        private s(String str) {
            super(str);
        }
    }

    b(androidx.dynamicanimation.animation.e eVar) {
        this.f51001a = 0.0f;
        this.f51002b = Float.MAX_VALUE;
        this.f51003c = false;
        this.f51006f = false;
        this.f51007g = Float.MAX_VALUE;
        this.f51008h = -Float.MAX_VALUE;
        this.f51009i = 0L;
        this.f51011k = new ArrayList<>();
        this.f51012l = new ArrayList<>();
        this.f51004d = null;
        this.f51005e = new f("FloatValueHolder", eVar);
        this.f51010j = 1.0f;
    }

    private void e(boolean z10) {
        this.f51006f = false;
        androidx.dynamicanimation.animation.a.e().h(this);
        this.f51009i = 0L;
        this.f51003c = false;
        for (int i10 = 0; i10 < this.f51011k.size(); i10++) {
            if (this.f51011k.get(i10) != null) {
                this.f51011k.get(i10).a(this, z10, this.f51002b, this.f51001a);
            }
        }
        n(this.f51011k);
    }

    private float h() {
        return this.f51005e.b(this.f51004d);
    }

    private static <T> void m(ArrayList<T> arrayList, T t10) {
        int iIndexOf = arrayList.indexOf(t10);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    private static <T> void n(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void x() {
        if (this.f51006f) {
            return;
        }
        this.f51006f = true;
        if (!this.f51003c) {
            this.f51002b = h();
        }
        float f10 = this.f51002b;
        if (f10 > this.f51007g || f10 < this.f51008h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        androidx.dynamicanimation.animation.a.e().a(this, 0L);
    }

    @Override // androidx.dynamicanimation.animation.a.b
    @b1({b1.a.LIBRARY})
    public boolean a(long j10) {
        long j11 = this.f51009i;
        if (j11 == 0) {
            this.f51009i = j10;
            s(this.f51002b);
            return false;
        }
        this.f51009i = j10;
        boolean zY = y(j10 - j11);
        float fMin = Math.min(this.f51002b, this.f51007g);
        this.f51002b = fMin;
        float fMax = Math.max(fMin, this.f51008h);
        this.f51002b = fMax;
        s(fMax);
        if (zY) {
            e(false);
        }
        return zY;
    }

    public T b(q qVar) {
        if (!this.f51011k.contains(qVar)) {
            this.f51011k.add(qVar);
        }
        return this;
    }

    public T c(r rVar) {
        if (k()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f51012l.contains(rVar)) {
            this.f51012l.add(rVar);
        }
        return this;
    }

    public void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f51006f) {
            e(true);
        }
    }

    abstract float f(float f10, float f11);

    public float g() {
        return this.f51010j;
    }

    float i() {
        return this.f51010j * 0.75f;
    }

    abstract boolean j(float f10, float f11);

    public boolean k() {
        return this.f51006f;
    }

    public void l(q qVar) {
        m(this.f51011k, qVar);
    }

    public void o(r rVar) {
        m(this.f51012l, rVar);
    }

    public T p(float f10) {
        this.f51007g = f10;
        return this;
    }

    public T q(float f10) {
        this.f51008h = f10;
        return this;
    }

    public T r(@x(from = 0.0d, fromInclusive = false) float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f51010j = f10;
        v(f10 * 0.75f);
        return this;
    }

    void s(float f10) {
        this.f51005e.c(this.f51004d, f10);
        for (int i10 = 0; i10 < this.f51012l.size(); i10++) {
            if (this.f51012l.get(i10) != null) {
                this.f51012l.get(i10).g(this, this.f51002b, this.f51001a);
            }
        }
        n(this.f51012l);
    }

    public T t(float f10) {
        this.f51002b = f10;
        this.f51003c = true;
        return this;
    }

    public T u(float f10) {
        this.f51001a = f10;
        return this;
    }

    abstract void v(float f10);

    public void w() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f51006f) {
            return;
        }
        x();
    }

    abstract boolean y(long j10);

    <K> b(K k10, androidx.dynamicanimation.animation.d<K> dVar) {
        this.f51001a = 0.0f;
        this.f51002b = Float.MAX_VALUE;
        this.f51003c = false;
        this.f51006f = false;
        this.f51007g = Float.MAX_VALUE;
        this.f51008h = -Float.MAX_VALUE;
        this.f51009i = 0L;
        this.f51011k = new ArrayList<>();
        this.f51012l = new ArrayList<>();
        this.f51004d = k10;
        this.f51005e = dVar;
        if (dVar != f50992r && dVar != f50993s && dVar != f50994t) {
            if (dVar == f50998x) {
                this.f51010j = 0.00390625f;
                return;
            } else if (dVar == f50990p || dVar == f50991q) {
                this.f51010j = 0.00390625f;
                return;
            } else {
                this.f51010j = 1.0f;
                return;
            }
        }
        this.f51010j = 0.1f;
    }
}
