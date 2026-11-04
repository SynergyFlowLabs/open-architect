package w0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.text.android.h1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
public final class c implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f385820a = 0;

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(@Nullable Canvas canvas, @Nullable Paint paint, int i10, int i11, int i12, int i13, int i14, @Nullable CharSequence charSequence, int i15, int i16, boolean z10, @Nullable Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i15)) != layout.getLineCount() - 1 || !h1.m(layout, lineForOffset)) {
            return;
        }
        float fA = d.a(layout, lineForOffset, paint) + d.c(layout, lineForOffset, paint);
        if (fA == 0.0f) {
            return;
        }
        Intrinsics.checkNotNull(canvas);
        canvas.translate(fA, 0.0f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z10) {
        return 0;
    }
}
