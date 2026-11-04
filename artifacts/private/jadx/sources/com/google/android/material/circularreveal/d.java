package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final boolean f111923k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f111924l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f111925m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f111926n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f111927o = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f111928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final View f111929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final Path f111930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final Paint f111931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final Paint f111932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private g.e f111933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private Drawable f111934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Paint f111935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f111936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f111937j;

    public interface a {
        void b(Canvas canvas);

        boolean c();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(a aVar) {
        this.f111928a = aVar;
        View view = (View) aVar;
        this.f111929b = view;
        view.setWillNotDraw(false);
        this.f111930c = new Path();
        this.f111931d = new Paint(7);
        Paint paint = new Paint(1);
        this.f111932e = paint;
        paint.setColor(0);
    }

    private void d(@NonNull Canvas canvas, int i10, float f10) {
        this.f111935h.setColor(i10);
        this.f111935h.setStrokeWidth(f10);
        g.e eVar = this.f111933f;
        canvas.drawCircle(eVar.f111945a, eVar.f111946b, eVar.f111947c - (f10 / 2.0f), this.f111935h);
    }

    private void e(@NonNull Canvas canvas) {
        this.f111928a.b(canvas);
        if (r()) {
            g.e eVar = this.f111933f;
            canvas.drawCircle(eVar.f111945a, eVar.f111946b, eVar.f111947c, this.f111932e);
        }
        if (p()) {
            d(canvas, -16777216, 10.0f);
            d(canvas, l1.a.f316127c, 5.0f);
        }
        f(canvas);
    }

    private void f(@NonNull Canvas canvas) {
        if (q()) {
            Rect bounds = this.f111934g.getBounds();
            float fWidth = this.f111933f.f111945a - (bounds.width() / 2.0f);
            float fHeight = this.f111933f.f111946b - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.f111934g.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    private float i(@NonNull g.e eVar) {
        return y6.a.b(eVar.f111945a, eVar.f111946b, 0.0f, 0.0f, this.f111929b.getWidth(), this.f111929b.getHeight());
    }

    private void k() {
        if (f111927o == 1) {
            this.f111930c.rewind();
            g.e eVar = this.f111933f;
            if (eVar != null) {
                this.f111930c.addCircle(eVar.f111945a, eVar.f111946b, eVar.f111947c, Path.Direction.CW);
            }
        }
        this.f111929b.invalidate();
    }

    private boolean p() {
        g.e eVar = this.f111933f;
        boolean z10 = eVar == null || eVar.a();
        if (f111927o == 0) {
            return !z10 && this.f111937j;
        }
        return !z10;
    }

    private boolean q() {
        return (this.f111936i || this.f111934g == null || this.f111933f == null) ? false : true;
    }

    private boolean r() {
        if (this.f111936i || Color.alpha(this.f111932e.getColor()) == 0) {
            return false;
        }
        int i10 = 7 << 1;
        return true;
    }

    public void a() {
        if (f111927o == 0) {
            this.f111936i = true;
            this.f111937j = false;
            this.f111929b.buildDrawingCache();
            Bitmap drawingCache = this.f111929b.getDrawingCache();
            if (drawingCache == null && this.f111929b.getWidth() != 0 && this.f111929b.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f111929b.getWidth(), this.f111929b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f111929b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f111931d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f111936i = false;
            this.f111937j = true;
        }
    }

    public void b() {
        if (f111927o == 0) {
            this.f111937j = false;
            this.f111929b.destroyDrawingCache();
            this.f111931d.setShader(null);
            this.f111929b.invalidate();
        }
    }

    public void c(@NonNull Canvas canvas) {
        Canvas canvas2;
        if (p()) {
            int i10 = f111927o;
            if (i10 == 0) {
                canvas2 = canvas;
                g.e eVar = this.f111933f;
                canvas2.drawCircle(eVar.f111945a, eVar.f111946b, eVar.f111947c, this.f111931d);
                if (r()) {
                    g.e eVar2 = this.f111933f;
                    canvas2.drawCircle(eVar2.f111945a, eVar2.f111946b, eVar2.f111947c, this.f111932e);
                }
            } else if (i10 == 1) {
                canvas2 = canvas;
                int iSave = canvas2.save();
                canvas2.clipPath(this.f111930c);
                this.f111928a.b(canvas2);
                if (r()) {
                    canvas2.drawRect(0.0f, 0.0f, this.f111929b.getWidth(), this.f111929b.getHeight(), this.f111932e);
                }
                canvas2.restoreToCount(iSave);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("Unsupported strategy " + i10);
                }
                this.f111928a.b(canvas);
                if (r()) {
                    canvas.drawRect(0.0f, 0.0f, this.f111929b.getWidth(), this.f111929b.getHeight(), this.f111932e);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
            }
        } else {
            canvas2 = canvas;
            this.f111928a.b(canvas2);
            if (r()) {
                canvas2.drawRect(0.0f, 0.0f, this.f111929b.getWidth(), this.f111929b.getHeight(), this.f111932e);
            }
        }
        f(canvas2);
    }

    @p0
    public Drawable g() {
        return this.f111934g;
    }

    @l
    public int h() {
        return this.f111932e.getColor();
    }

    @p0
    public g.e j() {
        g.e eVar = this.f111933f;
        if (eVar == null) {
            return null;
        }
        g.e eVar2 = new g.e(eVar);
        if (eVar2.a()) {
            eVar2.f111947c = i(eVar2);
        }
        return eVar2;
    }

    public boolean l() {
        return this.f111928a.c() && !p();
    }

    public void m(@p0 Drawable drawable) {
        this.f111934g = drawable;
        this.f111929b.invalidate();
    }

    public void n(@l int i10) {
        this.f111932e.setColor(i10);
        this.f111929b.invalidate();
    }

    public void o(@p0 g.e eVar) {
        if (eVar == null) {
            this.f111933f = null;
        } else {
            g.e eVar2 = this.f111933f;
            if (eVar2 == null) {
                this.f111933f = new g.e(eVar);
            } else {
                eVar2.c(eVar);
            }
            if (y6.a.e(eVar.f111947c, i(eVar), 1.0E-4f)) {
                this.f111933f.f111947c = Float.MAX_VALUE;
            }
        }
        k();
    }
}
