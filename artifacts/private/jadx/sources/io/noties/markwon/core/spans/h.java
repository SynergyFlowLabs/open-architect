package io.noties.markwon.core.spans;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import androidx.annotation.NonNull;
import androidx.annotation.t0;

/* JADX INFO: loaded from: classes8.dex */
public class h implements LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f297575a;

    public h(@t0 int i10) {
        this.f297575a = i10;
    }

    @NonNull
    public static h a(@t0 int i10) {
        return new h(i10);
    }

    private static boolean b(int i10, CharSequence charSequence, Object obj) {
        int spanEnd = ((Spanned) charSequence).getSpanEnd(obj);
        if (spanEnd != i10 && spanEnd != i10 - 1) {
            return false;
        }
        return true;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        if (b(i11, charSequence, this)) {
            int i14 = fontMetricsInt.descent;
            int i15 = this.f297575a;
            fontMetricsInt.descent = i14 + i15;
            fontMetricsInt.bottom += i15;
        }
    }
}
