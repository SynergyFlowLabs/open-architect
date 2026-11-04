package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class a implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.noties.markwon.core.c f297556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f297557b = i.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f297558c = i.a();

    public a(@NonNull io.noties.markwon.core.c cVar) {
        this.f297556a = cVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
        int iO = this.f297556a.o();
        this.f297558c.set(paint);
        this.f297556a.a(this.f297558c);
        int i17 = i11 * iO;
        int i18 = i10 + i17;
        int i19 = i17 + i18;
        this.f297557b.set(Math.min(i18, i19), i12, Math.max(i18, i19), i14);
        canvas.drawRect(this.f297557b, this.f297558c);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return this.f297556a.n();
    }
}
