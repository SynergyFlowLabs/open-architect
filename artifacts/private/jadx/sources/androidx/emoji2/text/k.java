package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
@w0(19)
public abstract class k extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final r f51254b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint.FontMetricsInt f51253a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private short f51255c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private short f51256d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f51257e = 1.0f;

    @b1({b1.a.LIBRARY})
    k(@NonNull r rVar) {
        androidx.core.util.t.m(rVar, "rasterizer cannot be null");
        this.f51254b = rVar;
    }

    @l1
    @b1({b1.a.LIBRARY})
    public final int a() {
        return this.f51256d;
    }

    @l1
    @b1({b1.a.LIBRARY})
    public final int b() {
        return d().g();
    }

    @b1({b1.a.LIBRARY})
    final float c() {
        return this.f51257e;
    }

    @NonNull
    public final r d() {
        return this.f51254b;
    }

    @b1({b1.a.LIBRARY})
    final int e() {
        return this.f51255c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, @e.a({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, @p0 Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f51253a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f51253a;
        this.f51257e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f51254b.f();
        this.f51256d = (short) (this.f51254b.f() * this.f51257e);
        short sK = (short) (this.f51254b.k() * this.f51257e);
        this.f51255c = sK;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f51253a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sK;
    }
}
