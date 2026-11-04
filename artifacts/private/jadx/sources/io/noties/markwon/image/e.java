package io.noties.markwon.image;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes8.dex */
public class e extends ReplacementSpan {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f297642e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f297643f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f297644g = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.noties.markwon.core.c f297645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f297646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f297647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f297648d;

    public e(@NonNull io.noties.markwon.core.c cVar, @NonNull a aVar, int i10, boolean z10) {
        this.f297645a = cVar;
        this.f297646b = aVar;
        this.f297647c = i10;
        this.f297648d = z10;
    }

    private static float b(int i10, int i11, @NonNull Paint paint) {
        return (int) ((i10 + ((i11 - i10) / 2)) - (((paint.descent() + paint.ascent()) / 2.0f) + 0.5f));
    }

    @NonNull
    public a a() {
        return this.f297646b;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, CharSequence charSequence, @g0(from = 0) int i10, @g0(from = 0) int i11, float f10, int i12, int i13, int i14, @NonNull Paint paint) {
        int iHeight;
        this.f297646b.k(io.noties.markwon.utils.i.a(canvas, charSequence), paint.getTextSize());
        a aVar = this.f297646b;
        if (!aVar.i()) {
            float fB = b(i12, i14, paint);
            if (this.f297648d) {
                this.f297645a.f(paint);
            }
            canvas.drawText(charSequence, i10, i11, f10, fB, paint);
            return;
        }
        int i15 = i14 - aVar.getBounds().bottom;
        int iSave = canvas.save();
        try {
            int i16 = this.f297647c;
            if (2 != i16) {
                if (1 == i16) {
                    iHeight = paint.getFontMetricsInt().descent;
                }
                canvas.translate(f10, i15);
                aVar.draw(canvas);
            }
            iHeight = ((i14 - i12) - aVar.getBounds().height()) / 2;
            i15 -= iHeight;
            canvas.translate(f10, i15);
            aVar.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, CharSequence charSequence, @g0(from = 0) int i10, @g0(from = 0) int i11, @p0 Paint.FontMetricsInt fontMetricsInt) {
        if (!this.f297646b.i()) {
            if (this.f297648d) {
                this.f297645a.f(paint);
            }
            return (int) (paint.measureText(charSequence, i10, i11) + 0.5f);
        }
        Rect bounds = this.f297646b.getBounds();
        if (fontMetricsInt != null) {
            int i12 = -bounds.bottom;
            fontMetricsInt.ascent = i12;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i12;
            fontMetricsInt.bottom = 0;
        }
        return bounds.right;
    }
}
