package w6;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.core.graphics.h;
import com.google.android.material.color.u;
import com.google.android.material.internal.p0;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f385919f = 4.5f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f385920g = 2.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f385921h = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f385922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f385923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f385924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f385925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f385926e;

    public a(@NonNull Context context) {
        this(com.google.android.material.resources.b.b(context, r6.a.c.f359668y6, false), u.b(context, r6.a.c.f359646x6, 0), u.b(context, r6.a.c.f359624w6, 0), u.b(context, r6.a.c.f359214e4, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean m(@l int i10) {
        return h.D(i10, 255) == this.f385925d;
    }

    public int a(float f10) {
        return Math.round(b(f10) * 255.0f);
    }

    public float b(float f10) {
        float f11 = this.f385926e;
        if (f11 <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / f11)) * f385919f) + 2.0f) / 100.0f, 1.0f);
    }

    @l
    public int c(@l int i10, float f10) {
        int i11;
        float fB = b(f10);
        int iAlpha = Color.alpha(i10);
        int iT = u.t(h.D(i10, 255), this.f385923b, fB);
        if (fB > 0.0f && (i11 = this.f385924c) != 0) {
            iT = u.s(iT, h.D(i11, f385921h));
        }
        return h.D(iT, iAlpha);
    }

    @l
    public int d(@l int i10, float f10, @NonNull View view) {
        return c(i10, f10 + i(view));
    }

    @l
    public int e(@l int i10, float f10) {
        return (this.f385922a && m(i10)) ? c(i10, f10) : i10;
    }

    @l
    public int f(@l int i10, float f10, @NonNull View view) {
        return e(i10, f10 + i(view));
    }

    @l
    public int g(float f10) {
        return e(this.f385925d, f10);
    }

    @l
    public int h(float f10, @NonNull View view) {
        return g(f10 + i(view));
    }

    public float i(@NonNull View view) {
        return p0.p(view);
    }

    @l
    public int j() {
        return this.f385923b;
    }

    @l
    public int k() {
        return this.f385925d;
    }

    public boolean l() {
        return this.f385922a;
    }

    public a(boolean z10, @l int i10, @l int i11, @l int i12, float f10) {
        this.f385922a = z10;
        this.f385923b = i10;
        this.f385924c = i11;
        this.f385925d = i12;
        this.f385926e = f10;
    }
}
