package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.core.graphics.h;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f113512i = 68;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f113513j = 20;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f113514k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f113515l = new int[3];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float[] f113516m = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f113517n = new int[4];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float[] f113518o = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Paint f113519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Paint f113520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final Paint f113521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f113522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f113523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f113524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f113525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f113526h;

    public b() {
        this(-16777216);
    }

    public void a(@NonNull Canvas canvas, @p0 Matrix matrix, @NonNull RectF rectF, int i10, float f10, float f11) {
        float f12;
        boolean z10 = f11 < 0.0f;
        Path path = this.f113525g;
        if (z10) {
            int[] iArr = f113517n;
            iArr[0] = 0;
            iArr[1] = this.f113524f;
            iArr[2] = this.f113523e;
            iArr[3] = this.f113522d;
            f12 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f12 = f10;
            path.arcTo(rectF, f12, f11);
            path.close();
            float f13 = -i10;
            rectF.inset(f13, f13);
            int[] iArr2 = f113517n;
            iArr2[0] = 0;
            iArr2[1] = this.f113522d;
            iArr2[2] = this.f113523e;
            iArr2[3] = this.f113524f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f14 = 1.0f - (i10 / fWidth);
        float[] fArr = f113518o;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.f113520b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f113517n, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f113526h);
        }
        canvas.drawArc(rectF, f12, f11, true, this.f113520b);
        canvas.restore();
    }

    public void b(@NonNull Canvas canvas, @p0 Matrix matrix, @NonNull RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f113515l;
        iArr[0] = this.f113524f;
        iArr[1] = this.f113523e;
        iArr[2] = this.f113522d;
        Paint paint = this.f113521c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f113516m, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f113521c);
        canvas.restore();
    }

    public void c(@NonNull Canvas canvas, @p0 Matrix matrix, @NonNull RectF rectF, int i10, float f10, float f11, @NonNull float[] fArr) {
        if (f11 > 0.0f) {
            f10 += f11;
            f11 = -f11;
        }
        float f12 = f10;
        float f13 = f11;
        a(canvas, matrix, rectF, i10, f12, f13);
        Path path = this.f113525g;
        path.rewind();
        path.moveTo(fArr[0], fArr[1]);
        path.arcTo(rectF, f12, f13);
        path.close();
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        canvas.drawPath(path, this.f113526h);
        canvas.drawPath(path, this.f113519a);
        canvas.restore();
    }

    @NonNull
    public Paint d() {
        return this.f113519a;
    }

    public void e(int i10) {
        this.f113522d = h.D(i10, 68);
        this.f113523e = h.D(i10, 20);
        int i11 = 3 | 0;
        this.f113524f = h.D(i10, 0);
        this.f113519a.setColor(this.f113522d);
    }

    public b(int i10) {
        this.f113525g = new Path();
        Paint paint = new Paint();
        this.f113526h = paint;
        this.f113519a = new Paint();
        e(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f113520b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f113521c = new Paint(paint2);
    }
}
