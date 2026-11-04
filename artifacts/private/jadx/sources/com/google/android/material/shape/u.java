package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    p f113684c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f113682a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f113683b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    RectF f113685d = new RectF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Path f113686e = new Path();

    @NonNull
    public static u a(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 33 ? new x(view) : new w(view);
    }

    private boolean d() {
        RectF rectF = this.f113685d;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    private void k() {
        if (!d() || this.f113684c == null) {
            return;
        }
        q.k().d(this.f113684c, 1.0f, this.f113685d, this.f113686e);
    }

    abstract void b(@NonNull View view);

    public boolean c() {
        return this.f113682a;
    }

    public void e(@NonNull Canvas canvas, @NonNull s6.a.InterfaceC2504a interfaceC2504a) {
        if (!j() || this.f113686e.isEmpty()) {
            interfaceC2504a.a(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.f113686e);
        interfaceC2504a.a(canvas);
        canvas.restore();
    }

    public void f(@NonNull View view, @NonNull RectF rectF) {
        this.f113685d = rectF;
        k();
        b(view);
    }

    public void g(@NonNull View view, @NonNull p pVar) {
        this.f113684c = pVar;
        k();
        b(view);
    }

    public void h(@NonNull View view, boolean z10) {
        if (z10 != this.f113682a) {
            this.f113682a = z10;
            b(view);
        }
    }

    public void i(@NonNull View view, boolean z10) {
        this.f113683b = z10;
        b(view);
    }

    abstract boolean j();
}
