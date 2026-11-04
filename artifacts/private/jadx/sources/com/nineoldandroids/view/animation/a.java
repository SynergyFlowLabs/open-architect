package com.nineoldandroids.view.animation;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends Animation {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f131306t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final WeakHashMap<View, a> f131307v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<View> f131308a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f131310c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f131312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f131313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f131314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f131315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f131316i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f131319l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f131320m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Camera f131309b = new Camera();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f131311d = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f131317j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f131318k = 1.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RectF f131321n = new RectF();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final RectF f131322o = new RectF();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Matrix f131323s = new Matrix();

    static {
        f131306t = Integer.valueOf(Build.VERSION.SDK).intValue() < 11;
        f131307v = new WeakHashMap<>();
    }

    private a(View view) {
        setDuration(0L);
        setFillAfter(true);
        view.setAnimation(this);
        this.f131308a = new WeakReference<>(view);
    }

    private void H(Matrix matrix, View view) {
        float width = view.getWidth();
        float height = view.getHeight();
        boolean z10 = this.f131310c;
        float f10 = z10 ? this.f131312e : width / 2.0f;
        float f11 = z10 ? this.f131313f : height / 2.0f;
        float f12 = this.f131314g;
        float f13 = this.f131315h;
        float f14 = this.f131316i;
        if (f12 != 0.0f || f13 != 0.0f || f14 != 0.0f) {
            Camera camera = this.f131309b;
            camera.save();
            camera.rotateX(f12);
            camera.rotateY(f13);
            camera.rotateZ(-f14);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f10, -f11);
            matrix.postTranslate(f10, f11);
        }
        float f15 = this.f131317j;
        float f16 = this.f131318k;
        if (f15 != 1.0f || f16 != 1.0f) {
            matrix.postScale(f15, f16);
            matrix.postTranslate((-(f10 / width)) * ((f15 * width) - width), (-(f11 / height)) * ((f16 * height) - height));
        }
        matrix.postTranslate(this.f131319l, this.f131320m);
    }

    public static a I(View view) {
        WeakHashMap<View, a> weakHashMap = f131307v;
        a aVar = weakHashMap.get(view);
        if (aVar != null && aVar == view.getAnimation()) {
            return aVar;
        }
        a aVar2 = new a(view);
        weakHashMap.put(view, aVar2);
        return aVar2;
    }

    private void a(RectF rectF, View view) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        Matrix matrix = this.f131323s;
        matrix.reset();
        H(matrix, view);
        this.f131323s.mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        float f10 = rectF.right;
        float f11 = rectF.left;
        if (f10 < f11) {
            rectF.right = f11;
            rectF.left = f10;
        }
        float f12 = rectF.bottom;
        float f13 = rectF.top;
        if (f12 < f13) {
            rectF.top = f12;
            rectF.bottom = f13;
        }
    }

    private void q() {
        View view = this.f131308a.get();
        if (view == null || view.getParent() == null) {
            return;
        }
        RectF rectF = this.f131322o;
        a(rectF, view);
        rectF.union(this.f131321n);
        ((View) view.getParent()).invalidate((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void r() {
        View view = this.f131308a.get();
        if (view != null) {
            a(this.f131321n, view);
        }
    }

    public void A(float f10) {
        if (this.f131318k != f10) {
            r();
            this.f131318k = f10;
            q();
        }
    }

    public void B(int i10) {
        View view = this.f131308a.get();
        if (view != null) {
            view.scrollTo(i10, view.getScrollY());
        }
    }

    public void C(int i10) {
        View view = this.f131308a.get();
        if (view != null) {
            view.scrollTo(view.getScrollX(), i10);
        }
    }

    public void D(float f10) {
        if (this.f131319l != f10) {
            r();
            this.f131319l = f10;
            q();
        }
    }

    public void E(float f10) {
        if (this.f131320m != f10) {
            r();
            this.f131320m = f10;
            q();
        }
    }

    public void F(float f10) {
        View view = this.f131308a.get();
        if (view != null) {
            D(f10 - view.getLeft());
        }
    }

    public void G(float f10) {
        View view = this.f131308a.get();
        if (view != null) {
            E(f10 - view.getTop());
        }
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f10, Transformation transformation) {
        View view = this.f131308a.get();
        if (view != null) {
            transformation.setAlpha(this.f131311d);
            H(transformation.getMatrix(), view);
        }
    }

    public float b() {
        return this.f131311d;
    }

    public float c() {
        return this.f131312e;
    }

    public float d() {
        return this.f131313f;
    }

    public float e() {
        return this.f131316i;
    }

    public float f() {
        return this.f131314g;
    }

    public float g() {
        return this.f131315h;
    }

    public float h() {
        return this.f131317j;
    }

    public float i() {
        return this.f131318k;
    }

    public int j() {
        View view = this.f131308a.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollX();
    }

    public int k() {
        View view = this.f131308a.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollY();
    }

    public float l() {
        return this.f131319l;
    }

    public float n() {
        return this.f131320m;
    }

    public float o() {
        View view = this.f131308a.get();
        if (view == null) {
            return 0.0f;
        }
        return view.getLeft() + this.f131319l;
    }

    public float p() {
        View view = this.f131308a.get();
        if (view == null) {
            return 0.0f;
        }
        return view.getTop() + this.f131320m;
    }

    public void s(float f10) {
        if (this.f131311d != f10) {
            this.f131311d = f10;
            View view = this.f131308a.get();
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public void t(float f10) {
        if (this.f131310c && this.f131312e == f10) {
            return;
        }
        r();
        this.f131310c = true;
        this.f131312e = f10;
        q();
    }

    public void u(float f10) {
        if (this.f131310c && this.f131313f == f10) {
            return;
        }
        r();
        this.f131310c = true;
        this.f131313f = f10;
        q();
    }

    public void v(float f10) {
        if (this.f131316i != f10) {
            r();
            this.f131316i = f10;
            q();
        }
    }

    public void w(float f10) {
        if (this.f131314g != f10) {
            r();
            this.f131314g = f10;
            q();
        }
    }

    public void x(float f10) {
        if (this.f131315h != f10) {
            r();
            this.f131315h = f10;
            q();
        }
    }

    public void z(float f10) {
        if (this.f131317j != f10) {
            r();
            this.f131317j = f10;
            q();
        }
    }
}
