package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class j implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.noties.markwon.core.c f297579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f297580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f297581c = i.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f297582d;

    public j(@NonNull io.noties.markwon.core.c cVar, @NonNull String str) {
        this.f297579a = cVar;
        this.f297580b = str;
    }

    public static void a(@NonNull TextView textView, @NonNull CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            j[] jVarArr = (j[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), j.class);
            if (jVarArr != null) {
                TextPaint paint = textView.getPaint();
                for (j jVar : jVarArr) {
                    jVar.f297582d = (int) (paint.measureText(jVar.f297580b) + 0.5f);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        if (z10 && io.noties.markwon.utils.f.b(i15, charSequence, this)) {
            this.f297581c.set(paint);
            this.f297579a.h(this.f297581c);
            int iMeasureText = (int) (this.f297581c.measureText(this.f297580b) + 0.5f);
            int iN = this.f297579a.n();
            if (iMeasureText > iN) {
                this.f297582d = iMeasureText;
                iN = iMeasureText;
            } else {
                this.f297582d = 0;
            }
            canvas.drawText(this.f297580b, i11 > 0 ? (i10 + (iN * i11)) - iMeasureText : i10 + (i11 * iN) + (iN - iMeasureText), i13, this.f297581c);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return Math.max(this.f297582d, this.f297579a.n());
    }
}
