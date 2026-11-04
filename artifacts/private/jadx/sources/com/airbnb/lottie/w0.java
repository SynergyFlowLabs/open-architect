package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.collection.b3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class w0 extends Drawable implements Drawable.Callback, Animatable {
    private static final boolean A3 = false;
    private static final List<String> B3 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    private static final Executor C3 = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new com.airbnb.lottie.utils.e());
    private static final float D3 = 50.0f;
    public static final int E3 = 1;
    public static final int F3 = 2;
    public static final int G3 = -1;
    private j1 H1;
    private int X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f88902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.utils.g f88903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f88904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f88905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f88906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f88907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList<b> f88908g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private final Matrix f88909g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private com.airbnb.lottie.manager.b f88910h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private Bitmap f88911h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private String f88912i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private Canvas f88913i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private com.airbnb.lottie.d f88914j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private Rect f88915j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    private com.airbnb.lottie.manager.a f88916k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private RectF f88917k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    private Map<String, Typeface> f88918l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private Paint f88919l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    String f88920m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private Rect f88921m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    com.airbnb.lottie.c f88922n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private Rect f88923n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.p0
    l1 f88924o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private RectF f88925o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f88926p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f88927p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f88928p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private RectF f88929p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private Matrix f88930q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private Matrix f88931r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f88932s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private boolean f88933s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f88934t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @androidx.annotation.p0
    private com.airbnb.lottie.a f88935t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f88936u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f88937v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private final Semaphore f88938v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.p0
    private com.airbnb.lottie.model.layer.c f88939w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private Handler f88940w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private Runnable f88941x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private final Runnable f88942y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private float f88943z3;

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends com.airbnb.lottie.value.j<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.l f88944d;

        a(com.airbnb.lottie.value.l lVar) {
            this.f88944d = lVar;
        }

        @Override // com.airbnb.lottie.value.j
        public T a(com.airbnb.lottie.value.b<T> bVar) {
            return (T) this.f88944d.a(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface b {
        void a(k kVar);
    }

    private enum c {
        NONE,
        PLAY,
        RESUME
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public w0() {
        com.airbnb.lottie.utils.g gVar = new com.airbnb.lottie.utils.g();
        this.f88903b = gVar;
        this.f88904c = true;
        this.f88905d = false;
        this.f88906e = false;
        this.f88907f = c.NONE;
        this.f88908g = new ArrayList<>();
        this.f88934t = false;
        this.f88937v = true;
        this.X = 255;
        this.f88927p1 = false;
        this.H1 = j1.AUTOMATIC;
        this.f88928p2 = false;
        this.f88909g3 = new Matrix();
        this.f88933s3 = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.airbnb.lottie.r0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                w0.j(this.f88815a, valueAnimator);
            }
        };
        this.f88936u3 = animatorUpdateListener;
        this.f88938v3 = new Semaphore(1);
        this.f88942y3 = new Runnable() { // from class: com.airbnb.lottie.s0
            @Override // java.lang.Runnable
            public final void run() {
                w0.n(this.f88820a);
            }
        };
        this.f88943z3 = -3.4028235E38f;
        gVar.addUpdateListener(animatorUpdateListener);
    }

    private void A() {
        k kVar = this.f88902a;
        if (kVar == null) {
            return;
        }
        com.airbnb.lottie.model.layer.c cVar = new com.airbnb.lottie.model.layer.c(this, com.airbnb.lottie.parser.v.a(kVar), kVar.k(), kVar);
        this.f88939w = cVar;
        if (this.Z) {
            cVar.J(true);
        }
        this.f88939w.R(this.f88937v);
    }

    private void D() {
        k kVar = this.f88902a;
        if (kVar == null) {
            return;
        }
        this.f88928p2 = this.H1.l(Build.VERSION.SDK_INT, kVar.t(), kVar.n());
    }

    private void D0(Canvas canvas, com.airbnb.lottie.model.layer.c cVar) {
        if (this.f88902a == null || cVar == null) {
            return;
        }
        N();
        canvas.getMatrix(this.f88930q3);
        canvas.getClipBounds(this.f88915j3);
        E(this.f88915j3, this.f88917k3);
        this.f88930q3.mapRect(this.f88917k3);
        F(this.f88917k3, this.f88915j3);
        if (this.f88937v) {
            this.f88929p3.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            cVar.a(this.f88929p3, null, false);
        }
        this.f88930q3.mapRect(this.f88929p3);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        H0(this.f88929p3, fWidth, fHeight);
        if (!p0()) {
            RectF rectF = this.f88929p3;
            Rect rect = this.f88915j3;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.f88929p3.width());
        int iCeil2 = (int) Math.ceil(this.f88929p3.height());
        if (iCeil > 0 && iCeil2 > 0) {
            M(iCeil, iCeil2);
            if (this.f88933s3) {
                this.f88909g3.set(this.f88930q3);
                this.f88909g3.preScale(fWidth, fHeight);
                Matrix matrix = this.f88909g3;
                RectF rectF2 = this.f88929p3;
                matrix.postTranslate(-rectF2.left, -rectF2.top);
                this.f88911h3.eraseColor(0);
                cVar.c(this.f88913i3, this.f88909g3, this.X);
                this.f88930q3.invert(this.f88931r3);
                this.f88931r3.mapRect(this.f88925o3, this.f88929p3);
                F(this.f88925o3, this.f88923n3);
            }
            this.f88921m3.set(0, 0, iCeil, iCeil2);
            canvas.drawBitmap(this.f88911h3, this.f88921m3, this.f88923n3, this.f88919l3);
        }
    }

    private void E(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void F(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private void H0(RectF rectF, float f10, float f11) {
        rectF.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
    }

    private void I(Canvas canvas) {
        com.airbnb.lottie.model.layer.c cVar = this.f88939w;
        k kVar = this.f88902a;
        if (cVar != null && kVar != null) {
            this.f88909g3.reset();
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                this.f88909g3.preScale(bounds.width() / kVar.b().width(), bounds.height() / kVar.b().height());
                this.f88909g3.preTranslate(bounds.left, bounds.top);
            }
            cVar.c(canvas, this.f88909g3, this.X);
        }
    }

    private void M(int i10, int i11) {
        Bitmap bitmap = this.f88911h3;
        if (bitmap == null || bitmap.getWidth() < i10 || this.f88911h3.getHeight() < i11) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f88911h3 = bitmapCreateBitmap;
            this.f88913i3.setBitmap(bitmapCreateBitmap);
            this.f88933s3 = true;
            return;
        }
        if (this.f88911h3.getWidth() > i10 || this.f88911h3.getHeight() > i11) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f88911h3, 0, 0, i10, i11);
            this.f88911h3 = bitmapCreateBitmap2;
            this.f88913i3.setBitmap(bitmapCreateBitmap2);
            this.f88933s3 = true;
        }
    }

    private void N() {
        if (this.f88913i3 != null) {
            return;
        }
        this.f88913i3 = new Canvas();
        this.f88929p3 = new RectF();
        this.f88930q3 = new Matrix();
        this.f88931r3 = new Matrix();
        this.f88915j3 = new Rect();
        this.f88917k3 = new RectF();
        this.f88919l3 = new com.airbnb.lottie.animation.a();
        this.f88921m3 = new Rect();
        this.f88923n3 = new Rect();
        this.f88925o3 = new RectF();
    }

    @androidx.annotation.p0
    private Context U() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    private com.airbnb.lottie.manager.a V() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f88916k == null) {
            com.airbnb.lottie.manager.a aVar = new com.airbnb.lottie.manager.a(getCallback(), this.f88922n);
            this.f88916k = aVar;
            String str = this.f88920m;
            if (str != null) {
                aVar.c(str);
            }
        }
        return this.f88916k;
    }

    private com.airbnb.lottie.manager.b Y() {
        com.airbnb.lottie.manager.b bVar = this.f88910h;
        if (bVar != null && !bVar.c(U())) {
            this.f88910h = null;
        }
        if (this.f88910h == null) {
            this.f88910h = new com.airbnb.lottie.manager.b(getCallback(), this.f88912i, this.f88914j, this.f88902a.j());
        }
        return this.f88910h;
    }

    private com.airbnb.lottie.model.h c0() {
        Iterator<String> it = B3.iterator();
        com.airbnb.lottie.model.h hVarL = null;
        while (it.hasNext()) {
            hVarL = this.f88902a.l(it.next());
            if (hVarL != null) {
                break;
            }
        }
        return hVarL;
    }

    public static /* synthetic */ void j(w0 w0Var, ValueAnimator valueAnimator) {
        if (w0Var.P()) {
            w0Var.invalidateSelf();
            return;
        }
        com.airbnb.lottie.model.layer.c cVar = w0Var.f88939w;
        if (cVar != null) {
            cVar.L(w0Var.f88903b.j());
        }
    }

    public static /* synthetic */ void n(final w0 w0Var) {
        com.airbnb.lottie.model.layer.c cVar = w0Var.f88939w;
        if (cVar == null) {
            return;
        }
        try {
            w0Var.f88938v3.acquire();
            cVar.L(w0Var.f88903b.j());
            if (A3 && w0Var.f88933s3) {
                if (w0Var.f88940w3 == null) {
                    w0Var.f88940w3 = new Handler(Looper.getMainLooper());
                    w0Var.f88941x3 = new Runnable() { // from class: com.airbnb.lottie.m0
                        @Override // java.lang.Runnable
                        public final void run() {
                            w0.r(this.f88330a);
                        }
                    };
                }
                w0Var.f88940w3.post(w0Var.f88941x3);
            }
        } catch (InterruptedException unused) {
        } finally {
            w0Var.f88938v3.release();
        }
        Semaphore semaphore = w0Var.f88938v3;
    }

    private boolean p0() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (parent instanceof ViewGroup) {
            return !((ViewGroup) parent).getClipChildren();
        }
        return false;
    }

    private boolean q1() {
        k kVar = this.f88902a;
        if (kVar == null) {
            return false;
        }
        float f10 = this.f88943z3;
        float fJ = this.f88903b.j();
        this.f88943z3 = fJ;
        return Math.abs(fJ - f10) * kVar.d() >= 50.0f;
    }

    public static /* synthetic */ void r(w0 w0Var) {
        Drawable.Callback callback = w0Var.getCallback();
        if (callback != null) {
            callback.invalidateDrawable(w0Var);
        }
    }

    private boolean z() {
        if (!this.f88904c && !this.f88905d) {
            return false;
        }
        return true;
    }

    public void A0(Animator.AnimatorListener animatorListener) {
        this.f88903b.removeListener(animatorListener);
    }

    public void B() {
        this.f88908g.clear();
        this.f88903b.cancel();
        if (isVisible()) {
            return;
        }
        this.f88907f = c.NONE;
    }

    @androidx.annotation.w0(api = 19)
    public void B0(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f88903b.removePauseListener(animatorPauseListener);
    }

    public void C() {
        if (this.f88903b.isRunning()) {
            this.f88903b.cancel();
            if (!isVisible()) {
                this.f88907f = c.NONE;
            }
        }
        this.f88902a = null;
        this.f88939w = null;
        this.f88910h = null;
        this.f88943z3 = -3.4028235E38f;
        this.f88903b.h();
        invalidateSelf();
    }

    public void C0(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f88903b.removeUpdateListener(animatorUpdateListener);
    }

    public List<com.airbnb.lottie.model.e> E0(com.airbnb.lottie.model.e eVar) {
        if (this.f88939w == null) {
            com.airbnb.lottie.utils.d.e("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.f88939w.h(eVar, 0, arrayList, new com.airbnb.lottie.model.e(new String[0]));
        return arrayList;
    }

    @androidx.annotation.l0
    public void F0() {
        if (this.f88939w == null) {
            this.f88908g.add(new b() { // from class: com.airbnb.lottie.n0
                @Override // com.airbnb.lottie.w0.b
                public final void a(k kVar) {
                    this.f88626a.F0();
                }
            });
            return;
        }
        D();
        if (z() || i0() == 0) {
            if (isVisible()) {
                this.f88903b.w();
                this.f88907f = c.NONE;
            } else {
                this.f88907f = c.RESUME;
            }
        }
        if (!z()) {
            Q0((int) (k0() < 0.0f ? e0() : d0()));
            this.f88903b.i();
            if (!isVisible()) {
                this.f88907f = c.NONE;
            }
        }
    }

    @Deprecated
    public void G() {
    }

    public void G0() {
        this.f88903b.x();
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void H(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.model.layer.c cVar = this.f88939w;
        k kVar = this.f88902a;
        if (cVar == null || kVar == null) {
            return;
        }
        boolean zP = P();
        if (zP) {
            try {
                this.f88938v3.acquire();
                if (q1()) {
                    h1(this.f88903b.j());
                }
            } catch (InterruptedException unused) {
                if (zP) {
                    this.f88938v3.release();
                    if (cVar.O() != this.f88903b.j()) {
                        C3.execute(this.f88942y3);
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable th2) {
                if (zP) {
                    this.f88938v3.release();
                    if (cVar.O() != this.f88903b.j()) {
                        C3.execute(this.f88942y3);
                    }
                }
                throw th2;
            }
        }
        if (this.f88928p2) {
            canvas.save();
            canvas.concat(matrix);
            D0(canvas, cVar);
            canvas.restore();
        } else {
            cVar.c(canvas, matrix, this.X);
        }
        this.f88933s3 = false;
        if (zP) {
            this.f88938v3.release();
            if (cVar.O() != this.f88903b.j()) {
                C3.execute(this.f88942y3);
            }
        }
    }

    public void I0(boolean z10) {
        this.f88926p0 = z10;
    }

    public void J(boolean z10) {
        if (this.f88932s == z10) {
            return;
        }
        this.f88932s = z10;
        if (this.f88902a != null) {
            A();
        }
    }

    public void J0(@androidx.annotation.p0 com.airbnb.lottie.a aVar) {
        this.f88935t3 = aVar;
    }

    public boolean K() {
        return this.f88932s;
    }

    public void K0(boolean z10) {
        if (z10 != this.f88927p1) {
            this.f88927p1 = z10;
            invalidateSelf();
        }
    }

    @androidx.annotation.l0
    public void L() {
        this.f88908g.clear();
        this.f88903b.i();
        if (isVisible()) {
            return;
        }
        this.f88907f = c.NONE;
    }

    public void L0(boolean z10) {
        if (z10 != this.f88937v) {
            this.f88937v = z10;
            com.airbnb.lottie.model.layer.c cVar = this.f88939w;
            if (cVar != null) {
                cVar.R(z10);
            }
            invalidateSelf();
        }
    }

    public boolean M0(k kVar) {
        if (this.f88902a == kVar) {
            return false;
        }
        this.f88933s3 = true;
        C();
        this.f88902a = kVar;
        A();
        this.f88903b.z(kVar);
        h1(this.f88903b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f88908g).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                bVar.a(kVar);
            }
            it.remove();
        }
        this.f88908g.clear();
        kVar.z(this.Y);
        D();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void N0(String str) {
        this.f88920m = str;
        com.airbnb.lottie.manager.a aVarV = V();
        if (aVarV != null) {
            aVarV.c(str);
        }
    }

    public com.airbnb.lottie.a O() {
        com.airbnb.lottie.a aVar = this.f88935t3;
        return aVar != null ? aVar : f.d();
    }

    public void O0(com.airbnb.lottie.c cVar) {
        this.f88922n = cVar;
        com.airbnb.lottie.manager.a aVar = this.f88916k;
        if (aVar != null) {
            aVar.d(cVar);
        }
    }

    public boolean P() {
        return O() == com.airbnb.lottie.a.ENABLED;
    }

    public void P0(@androidx.annotation.p0 Map<String, Typeface> map) {
        if (map == this.f88918l) {
            return;
        }
        this.f88918l = map;
        invalidateSelf();
    }

    @androidx.annotation.p0
    public Bitmap Q(String str) {
        com.airbnb.lottie.manager.b bVarY = Y();
        if (bVarY != null) {
            return bVarY.a(str);
        }
        return null;
    }

    public void Q0(final int i10) {
        if (this.f88902a == null) {
            this.f88908g.add(new b() { // from class: com.airbnb.lottie.f0
                @Override // com.airbnb.lottie.w0.b
                public final void a(k kVar) {
                    this.f88220a.Q0(i10);
                }
            });
        } else {
            this.f88903b.A(i10);
        }
    }

    public boolean R() {
        return this.f88927p1;
    }

    public void R0(boolean z10) {
        this.f88905d = z10;
    }

    public boolean S() {
        return this.f88937v;
    }

    public void S0(com.airbnb.lottie.d dVar) {
        this.f88914j = dVar;
        com.airbnb.lottie.manager.b bVar = this.f88910h;
        if (bVar != null) {
            bVar.e(dVar);
        }
    }

    public k T() {
        return this.f88902a;
    }

    public void T0(@androidx.annotation.p0 String str) {
        this.f88912i = str;
    }

    public void U0(boolean z10) {
        this.f88934t = z10;
    }

    public void V0(final int i10) {
        if (this.f88902a == null) {
            this.f88908g.add(new b() { // from class: com.airbnb.lottie.i0
                @Override // com.airbnb.lottie.w0.b
                public final void a(k kVar) {
                    this.f88235a.V0(i10);
                }
            });
        } else {
            this.f88903b.B(i10 + 0.99f);
        }
    }

    public int W() {
        return (int) this.f88903b.k();
    }

    public void W0(final String str) {
        k kVar = this.f88902a;
        if (kVar == null) {
            this.f88908g.add(new b() { // from class: com.airbnb.lottie.p0
                @Override // com.airbnb.lottie.w0.b
                public final void a(k kVar2) {
                    this.f88645a.W0(str);
                }
            });
            return;
        }
        com.airbnb.lottie.model.h hVarL = kVar.l(str);
        if (hVarL != null) {
            V0((int) (hVarL.f88542b + hVarL.f88543c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    @androidx.annotation.p0
    @Deprecated
    public Bitmap X(String str) {
        com.airbnb.lottie.manager.b bVarY = Y();
        if (bVarY != null) {
            return bVarY.a(str);
        }
        k kVar = this.f88902a;
        x0 x0Var = kVar == null ? null : kVar.j().get(str);
        if (x0Var != null) {
            return x0Var.b();
        }
        return null;
    }

    public void X0(@androidx.annotation.x(from = 0.0d, to = 1.0d) final float f10) {
        k kVar = this.f88902a;
        if (kVar == null) {
            this.f88908g.add(new b() { // from class: com.airbnb.lottie.l0
                @Override // com.airbnb.lottie.w0.b
                public final void a(k kVar2) {
                    this.f88323a.X0(f10);
                }
            });
        } else {
            this.f88903b.B(com.airbnb.lottie.utils.i.k(kVar.r(), this.f88902a.f(), f10));
        }
    }

    public void Y0(final int i10, final int i11) {
        if (this.f88902a == null) {
            this.f88908g.add(new b() { // from class: com.airbnb.lottie.h0
                @Override // com.airbnb.lottie.w0.b
                public final void a(k kVar) {
                    this.f88227a.Y0(i10, i11);
                }
            });
        } else {
            this.f88903b.C(i10, i11 + 0.99f);
        }
    }

    @androidx.annotation.p0
    public String Z() {
        return this.f88912i;
    }

    public void Z0(final String str) {
        k kVar = this.f88902a;
        if (kVar == null) {
            this.f88908g.add(new b() { // from class: com.airbnb.lottie.e0
                @Override // com.airbnb.lottie.w0.b
                public final void a(k kVar2) {
                    this.f88201a.Z0(str);
                }
            });
            return;
        }
        com.airbnb.lottie.model.h hVarL = kVar.l(str);
        if (hVarL != null) {
            int i10 = (int) hVarL.f88542b;
            Y0(i10, ((int) hVarL.f88543c) + i10);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    @androidx.annotation.p0
    public x0 a0(String str) {
        k kVar = this.f88902a;
        if (kVar == null) {
            return null;
        }
        return kVar.j().get(str);
    }

    public void a1(final String str, final String str2, final boolean z10) {
        k kVar = this.f88902a;
        if (kVar == null) {
            this.f88908g.add(new b() { // from class: com.airbnb.lottie.o0
                @Override // com.airbnb.lottie.w0.b
                public final void a(k kVar2) {
                    this.f88640a.a1(str, str2, z10);
                }
            });
            return;
        }
        com.airbnb.lottie.model.h hVarL = kVar.l(str);
        if (hVarL == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        int i10 = (int) hVarL.f88542b;
        com.airbnb.lottie.model.h hVarL2 = this.f88902a.l(str2);
        if (hVarL2 != null) {
            Y0(i10, (int) (hVarL2.f88542b + (z10 ? 1.0f : 0.0f)));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str2 + ".");
    }

    public boolean b0() {
        return this.f88934t;
    }

    public void b1(@androidx.annotation.x(from = 0.0d, to = 1.0d) final float f10, @androidx.annotation.x(from = 0.0d, to = 1.0d) final float f11) {
        k kVar = this.f88902a;
        if (kVar == null) {
            this.f88908g.add(new b() { // from class: com.airbnb.lottie.g0
                @Override // com.airbnb.lottie.w0.b
                public final void a(k kVar2) {
                    this.f88222a.b1(f10, f11);
                }
            });
        } else {
            Y0((int) com.airbnb.lottie.utils.i.k(kVar.r(), this.f88902a.f(), f10), (int) com.airbnb.lottie.utils.i.k(this.f88902a.r(), this.f88902a.f(), f11));
        }
    }

    public void c1(final int i10) {
        if (this.f88902a == null) {
            this.f88908g.add(new b() { // from class: com.airbnb.lottie.j0
                @Override // com.airbnb.lottie.w0.b
                public final void a(k kVar) {
                    this.f88291a.c1(i10);
                }
            });
        } else {
            this.f88903b.D(i10);
        }
    }

    public float d0() {
        return this.f88903b.n();
    }

    public void d1(final String str) {
        k kVar = this.f88902a;
        if (kVar == null) {
            this.f88908g.add(new b() { // from class: com.airbnb.lottie.q0
                @Override // com.airbnb.lottie.w0.b
                public final void a(k kVar2) {
                    this.f88811a.d1(str);
                }
            });
            return;
        }
        com.airbnb.lottie.model.h hVarL = kVar.l(str);
        if (hVarL != null) {
            c1((int) hVarL.f88542b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        com.airbnb.lottie.model.layer.c cVar = this.f88939w;
        if (cVar != null) {
            boolean zP = P();
            if (zP) {
                try {
                    this.f88938v3.acquire();
                } catch (InterruptedException unused) {
                    f.c("Drawable#draw");
                    if (zP) {
                        this.f88938v3.release();
                        if (cVar.O() != this.f88903b.j()) {
                        }
                    }
                } catch (Throwable th2) {
                    f.c("Drawable#draw");
                    if (zP) {
                        this.f88938v3.release();
                        if (cVar.O() != this.f88903b.j()) {
                            C3.execute(this.f88942y3);
                        }
                    }
                    throw th2;
                }
            }
            f.b("Drawable#draw");
            if (zP && q1()) {
                h1(this.f88903b.j());
            }
            if (this.f88906e) {
                try {
                    if (this.f88928p2) {
                        D0(canvas, cVar);
                    } else {
                        I(canvas);
                    }
                } catch (Throwable th3) {
                    com.airbnb.lottie.utils.d.c("Lottie crashed in draw!", th3);
                }
            } else if (this.f88928p2) {
                D0(canvas, cVar);
            } else {
                I(canvas);
            }
            this.f88933s3 = false;
            f.c("Drawable#draw");
            if (zP) {
                this.f88938v3.release();
                if (cVar.O() != this.f88903b.j()) {
                    C3.execute(this.f88942y3);
                }
            }
        }
    }

    public float e0() {
        return this.f88903b.o();
    }

    public void e1(final float f10) {
        k kVar = this.f88902a;
        if (kVar == null) {
            this.f88908g.add(new b() { // from class: com.airbnb.lottie.u0
                @Override // com.airbnb.lottie.w0.b
                public final void a(k kVar2) {
                    this.f88826a.e1(f10);
                }
            });
        } else {
            c1((int) com.airbnb.lottie.utils.i.k(kVar.r(), this.f88902a.f(), f10));
        }
    }

    @androidx.annotation.p0
    public h1 f0() {
        k kVar = this.f88902a;
        if (kVar != null) {
            return kVar.o();
        }
        return null;
    }

    public void f1(boolean z10) {
        if (this.Z == z10) {
            return;
        }
        this.Z = z10;
        com.airbnb.lottie.model.layer.c cVar = this.f88939w;
        if (cVar != null) {
            cVar.J(z10);
        }
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    public float g0() {
        return this.f88903b.j();
    }

    public void g1(boolean z10) {
        this.Y = z10;
        k kVar = this.f88902a;
        if (kVar != null) {
            kVar.z(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.X;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        k kVar = this.f88902a;
        if (kVar == null) {
            return -1;
        }
        return kVar.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        k kVar = this.f88902a;
        if (kVar == null) {
            return -1;
        }
        return kVar.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public j1 h0() {
        return this.f88928p2 ? j1.SOFTWARE : j1.HARDWARE;
    }

    public void h1(@androidx.annotation.x(from = 0.0d, to = 1.0d) final float f10) {
        if (this.f88902a == null) {
            this.f88908g.add(new b() { // from class: com.airbnb.lottie.v0
                @Override // com.airbnb.lottie.w0.b
                public final void a(k kVar) {
                    this.f88864a.h1(f10);
                }
            });
            return;
        }
        f.b("Drawable#setProgress");
        this.f88903b.A(this.f88902a.h(f10));
        f.c("Drawable#setProgress");
    }

    public int i0() {
        return this.f88903b.getRepeatCount();
    }

    public void i1(j1 j1Var) {
        this.H1 = j1Var;
        D();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f88933s3) {
            return;
        }
        this.f88933s3 = true;
        if ((!A3 || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return q0();
    }

    @e.a({"WrongConstant"})
    public int j0() {
        return this.f88903b.getRepeatMode();
    }

    public void j1(int i10) {
        this.f88903b.setRepeatCount(i10);
    }

    public float k0() {
        return this.f88903b.p();
    }

    public void k1(int i10) {
        this.f88903b.setRepeatMode(i10);
    }

    @androidx.annotation.p0
    public l1 l0() {
        return this.f88924o;
    }

    public void l1(boolean z10) {
        this.f88906e = z10;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    @androidx.annotation.p0
    public Typeface m0(com.airbnb.lottie.model.c cVar) {
        Map<String, Typeface> map = this.f88918l;
        if (map != null) {
            String strB = cVar.b();
            if (map.containsKey(strB)) {
                return map.get(strB);
            }
            String strC = cVar.c();
            if (map.containsKey(strC)) {
                return map.get(strC);
            }
            String str = cVar.b() + "-" + cVar.d();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        com.airbnb.lottie.manager.a aVarV = V();
        if (aVarV != null) {
            return aVarV.b(cVar);
        }
        return null;
    }

    public void m1(float f10) {
        this.f88903b.E(f10);
    }

    public boolean n0() {
        com.airbnb.lottie.model.layer.c cVar = this.f88939w;
        return cVar != null && cVar.P();
    }

    public void n1(Boolean bool) {
        this.f88904c = bool.booleanValue();
    }

    public boolean o0() {
        com.airbnb.lottie.model.layer.c cVar = this.f88939w;
        return cVar != null && cVar.Q();
    }

    public void o1(l1 l1Var) {
        this.f88924o = l1Var;
    }

    public void p1(boolean z10) {
        this.f88903b.F(z10);
    }

    public boolean q0() {
        com.airbnb.lottie.utils.g gVar = this.f88903b;
        if (gVar == null) {
            return false;
        }
        return gVar.isRunning();
    }

    boolean r0() {
        if (isVisible()) {
            return this.f88903b.isRunning();
        }
        c cVar = this.f88907f;
        return cVar == c.PLAY || cVar == c.RESUME;
    }

    @androidx.annotation.p0
    public Bitmap r1(String str, @androidx.annotation.p0 Bitmap bitmap) {
        com.airbnb.lottie.manager.b bVarY = Y();
        if (bVarY == null) {
            com.airbnb.lottie.utils.d.e("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap bitmapF = bVarY.f(str, bitmap);
        invalidateSelf();
        return bitmapF;
    }

    public boolean s0() {
        return this.f88926p0;
    }

    public boolean s1() {
        return this.f88918l == null && this.f88924o == null && this.f88902a.c().size() > 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@androidx.annotation.g0(from = 0, to = b3.f12144d) int i10) {
        this.X = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@androidx.annotation.p0 ColorFilter colorFilter) {
        com.airbnb.lottie.utils.d.e("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            c cVar = this.f88907f;
            if (cVar == c.PLAY) {
                x0();
                return visible;
            }
            if (cVar == c.RESUME) {
                F0();
                return visible;
            }
        } else {
            if (this.f88903b.isRunning()) {
                w0();
                this.f88907f = c.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.f88907f = c.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    @androidx.annotation.l0
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        x0();
    }

    @Override // android.graphics.drawable.Animatable
    @androidx.annotation.l0
    public void stop() {
        L();
    }

    public boolean t0() {
        return this.f88903b.getRepeatCount() == -1;
    }

    public void u(Animator.AnimatorListener animatorListener) {
        this.f88903b.addListener(animatorListener);
    }

    public boolean u0() {
        return this.f88932s;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    @androidx.annotation.w0(api = 19)
    public void v(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f88903b.addPauseListener(animatorPauseListener);
    }

    @Deprecated
    public void v0(boolean z10) {
        this.f88903b.setRepeatCount(z10 ? -1 : 0);
    }

    public void w(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f88903b.addUpdateListener(animatorUpdateListener);
    }

    public void w0() {
        this.f88908g.clear();
        this.f88903b.r();
        if (!isVisible()) {
            this.f88907f = c.NONE;
        }
    }

    public <T> void x(final com.airbnb.lottie.model.e eVar, final T t10, @androidx.annotation.p0 final com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.model.layer.c cVar = this.f88939w;
        if (cVar == null) {
            this.f88908g.add(new b() { // from class: com.airbnb.lottie.k0
                @Override // com.airbnb.lottie.w0.b
                public final void a(k kVar) {
                    this.f88316a.x(eVar, t10, jVar);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (eVar == com.airbnb.lottie.model.e.f88535c) {
            cVar.g(t10, jVar);
        } else if (eVar.d() != null) {
            eVar.d().g(t10, jVar);
        } else {
            List<com.airbnb.lottie.model.e> listE0 = E0(eVar);
            for (int i10 = 0; i10 < listE0.size(); i10++) {
                listE0.get(i10).d().g(t10, jVar);
            }
            zIsEmpty = true ^ listE0.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t10 == b1.E) {
                h1(g0());
            }
        }
    }

    @androidx.annotation.l0
    public void x0() {
        if (this.f88939w == null) {
            this.f88908g.add(new b() { // from class: com.airbnb.lottie.t0
                @Override // com.airbnb.lottie.w0.b
                public final void a(k kVar) {
                    this.f88822a.x0();
                }
            });
            return;
        }
        D();
        if (z() || i0() == 0) {
            if (isVisible()) {
                this.f88903b.s();
                this.f88907f = c.NONE;
            } else {
                this.f88907f = c.PLAY;
            }
        }
        if (z()) {
            return;
        }
        com.airbnb.lottie.model.h hVarC0 = c0();
        if (hVarC0 != null) {
            Q0((int) hVarC0.f88542b);
        } else {
            Q0((int) (k0() < 0.0f ? e0() : d0()));
        }
        this.f88903b.i();
        if (isVisible()) {
            return;
        }
        this.f88907f = c.NONE;
    }

    public <T> void y(com.airbnb.lottie.model.e eVar, T t10, com.airbnb.lottie.value.l<T> lVar) {
        x(eVar, t10, new a(lVar));
    }

    public void y0() {
        this.f88903b.removeAllListeners();
    }

    public void z0() {
        this.f88903b.removeAllUpdateListeners();
        this.f88903b.addUpdateListener(this.f88936u3);
    }
}
