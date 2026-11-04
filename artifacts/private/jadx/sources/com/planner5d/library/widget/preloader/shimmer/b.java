package com.planner5d.library.widget.preloader.shimmer;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f258589e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f258590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f258591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final int[] f258592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Paint f258593d;

    public b(@NotNull c options, @NotNull d products) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(products, "products");
        this.f258590a = options;
        this.f258591b = products;
        this.f258592c = new int[2];
        Paint paint = new Paint();
        paint.setAntiAlias(false);
        paint.setDither(false);
        paint.setShader(new LinearGradient(0.0f, 0.0f, options.m(), 0.0f, new int[]{options.k(), options.j(), options.k()}, (float[]) null, Shader.TileMode.CLAMP));
        this.f258593d = paint;
    }

    private final float a(long j10) {
        return (j10 % ((long) this.f258590a.i())) / this.f258590a.i();
    }

    public final void b(@NotNull Canvas canvas, long j10) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        canvas.translate(-this.f258591b.c(), 0.0f);
        canvas.translate(this.f258591b.d() * a(j10), 0.0f);
        int[] iArr = this.f258592c;
        canvas.translate(-iArr[0], -iArr[1]);
        canvas.rotate(this.f258590a.l());
        canvas.drawColor(this.f258590a.k());
        canvas.drawRect(0.0f, -this.f258591b.b(), this.f258590a.m(), this.f258591b.a(), this.f258593d);
        canvas.restore();
    }

    @NotNull
    public final int[] c() {
        return this.f258592c;
    }
}
