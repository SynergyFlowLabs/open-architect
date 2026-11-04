package androidx.media2.exoplayer.external.text.ttml;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.b1;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class d {
    private d() {
    }

    public static void a(SpannableStringBuilder builder, int start, int end, e style) {
        if (style.h() != -1) {
            builder.setSpan(new StyleSpan(style.h()), start, end, 33);
        }
        if (style.n()) {
            builder.setSpan(new StrikethroughSpan(), start, end, 33);
        }
        if (style.o()) {
            builder.setSpan(new UnderlineSpan(), start, end, 33);
        }
        if (style.k()) {
            builder.setSpan(new ForegroundColorSpan(style.c()), start, end, 33);
        }
        if (style.j()) {
            builder.setSpan(new BackgroundColorSpan(style.b()), start, end, 33);
        }
        if (style.d() != null) {
            builder.setSpan(new TypefaceSpan(style.d()), start, end, 33);
        }
        if (style.i() != null) {
            builder.setSpan(new AlignmentSpan.Standard(style.i()), start, end, 33);
        }
        int iF = style.f();
        if (iF == 1) {
            builder.setSpan(new AbsoluteSizeSpan((int) style.e(), true), start, end, 33);
        } else if (iF == 2) {
            builder.setSpan(new RelativeSizeSpan(style.e()), start, end, 33);
        } else {
            if (iF != 3) {
                return;
            }
            builder.setSpan(new RelativeSizeSpan(style.e() / 100.0f), start, end, 33);
        }
    }

    static String b(String in) {
        return in.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    static void c(SpannableStringBuilder builder) {
        int length = builder.length() - 1;
        while (length >= 0 && builder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || builder.charAt(length) == '\n') {
            return;
        }
        builder.append('\n');
    }

    public static e d(e style, String[] styleIds, Map<String, e> globalStyles) {
        if (style == null && styleIds == null) {
            return null;
        }
        int i10 = 0;
        if (style == null && styleIds.length == 1) {
            return globalStyles.get(styleIds[0]);
        }
        if (style == null && styleIds.length > 1) {
            e eVar = new e();
            int length = styleIds.length;
            while (i10 < length) {
                eVar.a(globalStyles.get(styleIds[i10]));
                i10++;
            }
            return eVar;
        }
        if (style != null && styleIds != null && styleIds.length == 1) {
            return style.a(globalStyles.get(styleIds[0]));
        }
        if (style != null && styleIds != null && styleIds.length > 1) {
            int length2 = styleIds.length;
            while (i10 < length2) {
                style.a(globalStyles.get(styleIds[i10]));
                i10++;
            }
        }
        return style;
    }
}
