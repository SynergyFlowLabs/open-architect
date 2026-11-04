package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;
import androidx.annotation.g0;

/* JADX INFO: loaded from: classes8.dex */
public class b implements LeadingMarginSpan {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f297559f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.noties.markwon.core.c f297560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f297561b = i.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f297562c = i.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f297563d = i.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f297564e;

    public b(@NonNull io.noties.markwon.core.c cVar, @g0(from = 0) int i10) {
        this.f297560a = cVar;
        this.f297564e = i10;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int iMin;
        int iMax;
        if (z10 && io.noties.markwon.utils.f.b(i15, charSequence, this)) {
            this.f297561b.set(paint);
            this.f297560a.h(this.f297561b);
            int iSave = canvas.save();
            try {
                int iN = this.f297560a.n();
                int iP = this.f297560a.p((int) ((this.f297561b.descent() - this.f297561b.ascent()) + 0.5f));
                int i17 = (iN - iP) / 2;
                if (f297559f) {
                    int width = i11 < 0 ? i10 - (layout.getWidth() - (iN * this.f297564e)) : (iN * this.f297564e) - i10;
                    int i18 = i10 + (i17 * i11);
                    int i19 = (i11 * iP) + i18;
                    int i20 = i11 * width;
                    iMin = Math.min(i18, i19) + i20;
                    iMax = Math.max(i18, i19) + i20;
                } else {
                    if (i11 <= 0) {
                        i10 -= iN;
                    }
                    iMin = i10 + i17;
                    iMax = iMin + iP;
                }
                int iDescent = (i13 + ((int) (((this.f297561b.descent() + this.f297561b.ascent()) / 2.0f) + 0.5f))) - (iP / 2);
                int i21 = iP + iDescent;
                int i22 = this.f297564e;
                if (i22 == 0 || i22 == 1) {
                    this.f297562c.set(iMin, iDescent, iMax, i21);
                    this.f297561b.setStyle(this.f297564e == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(this.f297562c, this.f297561b);
                } else {
                    this.f297563d.set(iMin, iDescent, iMax, i21);
                    this.f297561b.setStyle(Paint.Style.FILL);
                    canvas.drawRect(this.f297563d, this.f297561b);
                }
                canvas.restoreToCount(iSave);
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave);
                throw th2;
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return this.f297560a.n();
    }
}
