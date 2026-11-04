package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.l1;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 {
    private static final void a(Rect rect, Rect rect2) {
        rect.right += rect2.width();
        rect.top = Math.min(rect.top, rect2.top);
        rect.bottom = Math.max(rect.bottom, rect2.bottom);
    }

    private static final void b(Paint paint, CharSequence charSequence, int i10, int i11, Rect rect) {
        j0.a(paint, charSequence, i10, i11, rect);
    }

    @NotNull
    public static final Rect c(@NotNull TextPaint textPaint, @NotNull CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (l0.b(spanned, MetricAffectingSpan.class, i10, i11)) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i10 < i11) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i10, i11, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i10, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    Iterator itA = kotlin.jvm.internal.i.a(metricAffectingSpanArr);
                    while (itA.hasNext()) {
                        MetricAffectingSpan metricAffectingSpan = (MetricAffectingSpan) itA.next();
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    b(textPaint2, charSequence, i10, iNextSpanTransition, rect2);
                    a(rect, rect2);
                    i10 = iNextSpanTransition;
                }
                return rect;
            }
        }
        return d(textPaint, charSequence, i10, i11);
    }

    @l1
    @NotNull
    public static final Rect d(@NotNull Paint paint, @NotNull CharSequence charSequence, int i10, int i11) {
        Rect rect = new Rect();
        b(paint, charSequence, i10, i11, rect);
        return rect;
    }
}
