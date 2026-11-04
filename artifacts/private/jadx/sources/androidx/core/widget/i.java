package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.k1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
public class i extends ProgressBar {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f49127g = 500;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f49128h = 500;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f49129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f49130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f49131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f49132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f49133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f49134f;

    public i(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ void c(i iVar) {
        iVar.f49131c = false;
        if (iVar.f49132d) {
            return;
        }
        iVar.f49129a = System.currentTimeMillis();
        iVar.setVisibility(0);
    }

    public static /* synthetic */ void d(i iVar) {
        iVar.f49130b = false;
        iVar.f49129a = -1L;
        iVar.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @k1
    public void f() {
        this.f49132d = true;
        removeCallbacks(this.f49134f);
        this.f49131c = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f49129a;
        long j11 = jCurrentTimeMillis - j10;
        if (j11 >= 500 || j10 == -1) {
            setVisibility(8);
        } else {
            if (this.f49130b) {
                return;
            }
            postDelayed(this.f49133e, 500 - j11);
            this.f49130b = true;
        }
    }

    private void g() {
        removeCallbacks(this.f49133e);
        removeCallbacks(this.f49134f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @k1
    public void i() {
        this.f49129a = -1L;
        this.f49132d = false;
        removeCallbacks(this.f49133e);
        this.f49130b = false;
        if (this.f49131c) {
            return;
        }
        postDelayed(this.f49134f, 500L);
        this.f49131c = true;
    }

    public void e() {
        post(new Runnable() { // from class: androidx.core.widget.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f49126a.f();
            }
        });
    }

    public void h() {
        post(new Runnable() { // from class: androidx.core.widget.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f49125a.i();
            }
        });
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    public i(@NonNull Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f49129a = -1L;
        this.f49130b = false;
        this.f49131c = false;
        this.f49132d = false;
        this.f49133e = new Runnable() { // from class: androidx.core.widget.e
            @Override // java.lang.Runnable
            public final void run() {
                i.d(this.f49123a);
            }
        };
        this.f49134f = new Runnable() { // from class: androidx.core.widget.f
            @Override // java.lang.Runnable
            public final void run() {
                i.c(this.f49124a);
            }
        };
    }
}
