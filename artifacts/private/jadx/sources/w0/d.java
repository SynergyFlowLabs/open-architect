package w0;

import android.graphics.Paint;
import android.text.Layout;
import androidx.compose.ui.text.android.h1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f385821a = "…";

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f385822a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f385822a = iArr;
        }
    }

    public static final float a(@NotNull Layout layout, int i10, @NotNull Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i10);
        if (!h1.m(layout, i10) || layout.getParagraphDirection(i10) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i10) + layout.getEllipsisStart(i10)) - lineLeft) + paint.measureText(f385821a);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
        if ((paragraphAlignment == null ? -1 : a.f385822a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return fAbs + width;
    }

    public static /* synthetic */ float b(Layout layout, int i10, Paint paint, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            paint = layout.getPaint();
        }
        return a(layout, i10, paint);
    }

    public static final float c(@NotNull Layout layout, int i10, @NotNull Paint paint) {
        float width;
        float width2;
        if (h1.m(layout, i10)) {
            int i11 = -1;
            if (layout.getParagraphDirection(i10) == -1 && layout.getWidth() < layout.getLineRight(i10)) {
                float lineRight = (layout.getLineRight(i10) - layout.getPrimaryHorizontal(layout.getLineStart(i10) + layout.getEllipsisStart(i10))) + paint.measureText(f385821a);
                Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i10);
                if (paragraphAlignment != null) {
                    i11 = a.f385822a[paragraphAlignment.ordinal()];
                }
                if (i11 == 1) {
                    width = layout.getWidth() - layout.getLineRight(i10);
                    width2 = (layout.getWidth() - lineRight) / 2.0f;
                } else {
                    width = layout.getWidth() - layout.getLineRight(i10);
                    width2 = layout.getWidth() - lineRight;
                }
                return width - width2;
            }
        }
        return 0.0f;
    }

    public static /* synthetic */ float d(Layout layout, int i10, Paint paint, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            paint = layout.getPaint();
        }
        return c(layout, i10, paint);
    }
}
