package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nTextLayout.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout_androidKt\n+ 2 InlineClassUtils.android.kt\nandroidx/compose/ui/text/android/InlineClassUtils_androidKt\n*L\n1#1,1124:1\n23#2:1125\n*S KotlinDebug\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout_androidKt\n*L\n956#1:1125\n*E\n"})
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final e1 f41402a = new e1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f41403b = a(0, 0);

    public static final long a(int i10, int i11) {
        return i1.b((((long) i11) & com.rabbitmq.client.k0.f265952a) | (((long) i10) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt h(f1 f1Var, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, w0.h[] hVarArr) {
        int iR = f1Var.r() - 1;
        if (f1Var.k().getLineStart(iR) != f1Var.k().getLineEnd(iR) || hVarArr == null || hVarArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        w0.h hVar = (w0.h) ArraysKt.first(hVarArr);
        spannableString.setSpan(hVar.b(0, spannableString.length(), (iR == 0 || !hVar.g()) ? hVar.g() : false), 0, spannableString.length(), 33);
        StaticLayout staticLayoutA = y0.f41451a.a(spannableString, textPaint, Integer.MAX_VALUE, (2072512 & 8) != 0 ? 0 : 0, (2072512 & 16) != 0 ? spannableString.length() : spannableString.length(), (2072512 & 32) != 0 ? b0.f41303a.b() : textDirectionHeuristic, (2072512 & 64) != 0 ? b0.f41303a.a() : null, (2072512 & 128) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 256) != 0 ? null : null, (2072512 & 512) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 1024) != 0 ? 1.0f : 0.0f, (2072512 & 2048) != 0 ? 0.0f : 0.0f, (2072512 & 4096) != 0 ? 0 : 0, (2072512 & 8192) != 0 ? false : f1Var.j(), (2072512 & 16384) != 0 ? true : f1Var.g(), (32768 & 2072512) != 0 ? 0 : 0, (65536 & 2072512) != 0 ? 0 : 0, (131072 & 2072512) != 0 ? 0 : 0, (262144 & 2072512) != 0 ? 0 : 0, (524288 & 2072512) != 0 ? null : null, (2072512 & 1048576) != 0 ? null : null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = staticLayoutA.getLineAscent(0);
        fontMetricsInt.descent = staticLayoutA.getLineDescent(0);
        fontMetricsInt.top = staticLayoutA.getLineTop(0);
        fontMetricsInt.bottom = staticLayoutA.getLineBottom(0);
        return fontMetricsInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(w0.h[] hVarArr) {
        int iMax = 0;
        int iMax2 = 0;
        for (w0.h hVar : hVarArr) {
            if (hVar.d() < 0) {
                iMax = Math.max(iMax, Math.abs(hVar.d()));
            }
            if (hVar.e() < 0) {
                iMax2 = Math.max(iMax, Math.abs(hVar.e()));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? f41403b : a(iMax, iMax2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w0.h[] j(f1 f1Var) {
        if (!(f1Var.P() instanceof Spanned)) {
            return null;
        }
        CharSequence charSequenceP = f1Var.P();
        Intrinsics.checkNotNull(charSequenceP, "null cannot be cast to non-null type android.text.Spanned");
        if (!l0.a((Spanned) charSequenceP, w0.h.class) && f1Var.P().length() > 0) {
            return null;
        }
        CharSequence charSequenceP2 = f1Var.P();
        Intrinsics.checkNotNull(charSequenceP2, "null cannot be cast to non-null type android.text.Spanned");
        return (w0.h[]) ((Spanned) charSequenceP2).getSpans(0, f1Var.P().length(), w0.h.class);
    }

    @NotNull
    public static final TextDirectionHeuristic k(int i10) {
        if (i10 == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i10 == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i10 == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i10 == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i10 != 4) {
            return i10 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.ANYRTL_LTR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(f1 f1Var) {
        if (f1Var.j() || f1Var.U()) {
            return f41403b;
        }
        TextPaint paint = f1Var.k().getPaint();
        CharSequence text = f1Var.k().getText();
        Rect rectC = k0.c(paint, text, f1Var.k().getLineStart(0), f1Var.k().getLineEnd(0));
        int lineAscent = f1Var.k().getLineAscent(0);
        int i10 = rectC.top;
        int topPadding = i10 < lineAscent ? lineAscent - i10 : f1Var.k().getTopPadding();
        if (f1Var.r() != 1) {
            int iR = f1Var.r() - 1;
            rectC = k0.c(paint, text, f1Var.k().getLineStart(iR), f1Var.k().getLineEnd(iR));
        }
        int lineDescent = f1Var.k().getLineDescent(f1Var.r() - 1);
        int i11 = rectC.bottom;
        int bottomPadding = i11 > lineDescent ? i11 - lineDescent : f1Var.k().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? f41403b : a(topPadding, bottomPadding);
    }

    public static final boolean m(@NotNull Layout layout, int i10) {
        return layout.getEllipsisCount(i10) > 0;
    }
}
