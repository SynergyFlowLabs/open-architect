package io.noties.markwon.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.collection.b3;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f297617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f297618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f297619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f297620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Drawable f297621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f297622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable.Callback f297623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f297624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f297625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f297626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f297627k = false;

    /* JADX INFO: renamed from: io.noties.markwon.image.a$a, reason: collision with other inner class name */
    private class C2113a implements Drawable.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.Callback f297628a;

        C2113a(Drawable.Callback callback) {
            this.f297628a = callback;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
            this.f297628a.invalidateDrawable(a.this);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
            this.f297628a.scheduleDrawable(a.this, runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            this.f297628a.unscheduleDrawable(a.this, runnable);
        }
    }

    public a(@NonNull String str, @NonNull b bVar, @NonNull i iVar, @p0 h hVar) {
        this.f297617a = str;
        this.f297618b = bVar;
        this.f297620d = iVar;
        this.f297619c = hVar;
        Drawable drawableD = bVar.d(this);
        this.f297621e = drawableD;
        if (drawableD != null) {
            p(drawableD);
        }
    }

    private void j() {
        if (this.f297624h == 0) {
            this.f297626j = true;
            setBounds(m(this.f297622f));
            return;
        }
        this.f297626j = false;
        Rect rectN = n();
        this.f297622f.setBounds(rectN);
        this.f297622f.setCallback(this.f297623g);
        setBounds(rectN);
        invalidateSelf();
    }

    @NonNull
    private static Rect m(@p0 Drawable drawable) {
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            if (!bounds.isEmpty()) {
                return bounds;
            }
            Rect rectC = f.c(drawable);
            if (!rectC.isEmpty()) {
                return rectC;
            }
        }
        return new Rect(0, 0, 1, 1);
    }

    @NonNull
    private Rect n() {
        return this.f297620d.a(this);
    }

    public void a() {
        Drawable drawable = this.f297622f;
        if (drawable != null) {
            drawable.setCallback(null);
            this.f297622f = null;
            setBounds(0, 0, 0, 0);
        }
    }

    @NonNull
    public String b() {
        return this.f297617a;
    }

    @p0
    public h c() {
        return this.f297619c;
    }

    @NonNull
    public i d() {
        return this.f297620d;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (i()) {
            this.f297622f.draw(canvas);
        }
    }

    public float e() {
        return this.f297625i;
    }

    public int f() {
        return this.f297624h;
    }

    public Drawable g() {
        return this.f297622f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (i()) {
            return this.f297622f.getIntrinsicHeight();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (i()) {
            return this.f297622f.getIntrinsicWidth();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (i()) {
            return this.f297622f.getOpacity();
        }
        return -2;
    }

    public boolean h() {
        return this.f297624h > 0;
    }

    public boolean i() {
        return this.f297622f != null;
    }

    public void k(int i10, float f10) {
        this.f297624h = i10;
        this.f297625i = f10;
        if (this.f297626j) {
            j();
        }
    }

    public boolean l() {
        return getCallback() != null;
    }

    public void o(@p0 Drawable.Callback callback) {
        this.f297623g = callback == null ? null : new C2113a(callback);
        super.setCallback(callback);
        if (this.f297623g == null) {
            Drawable drawable = this.f297622f;
            if (drawable != null) {
                drawable.setCallback(null);
                Object obj = this.f297622f;
                if (obj instanceof Animatable) {
                    Animatable animatable = (Animatable) obj;
                    boolean zIsRunning = animatable.isRunning();
                    this.f297627k = zIsRunning;
                    if (zIsRunning) {
                        animatable.stop();
                    }
                }
            }
            this.f297618b.a(this);
            return;
        }
        Drawable drawable2 = this.f297622f;
        if (drawable2 != null && drawable2.getCallback() == null) {
            this.f297622f.setCallback(this.f297623g);
        }
        Drawable drawable3 = this.f297622f;
        boolean z10 = drawable3 == null || drawable3 == this.f297621e;
        if (drawable3 != null) {
            drawable3.setCallback(this.f297623g);
            Object obj2 = this.f297622f;
            if ((obj2 instanceof Animatable) && this.f297627k) {
                ((Animatable) obj2).start();
            }
        }
        if (z10) {
            this.f297618b.b(this);
        }
    }

    protected void p(@NonNull Drawable drawable) {
        Drawable drawable2 = this.f297622f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        Rect bounds = drawable.getBounds();
        if (!bounds.isEmpty()) {
            this.f297622f = drawable;
            drawable.setCallback(this.f297623g);
            setBounds(bounds);
            this.f297626j = false;
            return;
        }
        Rect rectC = f.c(drawable);
        if (rectC.isEmpty()) {
            drawable.setBounds(0, 0, 1, 1);
        } else {
            drawable.setBounds(rectC);
        }
        setBounds(drawable.getBounds());
        q(drawable);
    }

    public void q(@NonNull Drawable drawable) {
        this.f297627k = false;
        Drawable drawable2 = this.f297622f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f297622f = drawable;
        j();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@g0(from = 0, to = b3.f12144d) int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@p0 ColorFilter colorFilter) {
    }

    @NonNull
    public String toString() {
        return "AsyncDrawable{destination='" + this.f297617a + "', imageSize=" + this.f297619c + ", result=" + this.f297622f + ", canvasWidth=" + this.f297624h + ", textSize=" + this.f297625i + ", waitingForDimensions=" + this.f297626j + AbstractJsonLexerKt.END_OBJ;
    }
}
