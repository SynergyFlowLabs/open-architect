package androidx.compose.ui.text.android;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f41401a = true;

    private static /* synthetic */ void d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029 A[ORIG_RETURN, RETURN] */
    public static final boolean e(float f10, CharSequence charSequence, TextPaint textPaint) {
        if (f10 == 0.0f) {
            return false;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (!l0.a(spanned, w0.f.class) && !l0.a(spanned, w0.e.class)) {
                if (textPaint.getLetterSpacing() == 0.0f) {
                    return false;
                }
            }
        } else if (textPaint.getLetterSpacing() == 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence f(CharSequence charSequence) {
        CharacterStyle[] characterStyleArr;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (l0.a(spanned, CharacterStyle.class) && (characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class)) != null && characterStyleArr.length != 0) {
                Iterator itA = kotlin.jvm.internal.i.a(characterStyleArr);
                SpannableString spannableString = null;
                while (itA.hasNext()) {
                    CharacterStyle characterStyle = (CharacterStyle) itA.next();
                    if (!(characterStyle instanceof MetricAffectingSpan)) {
                        if (spannableString == null) {
                            spannableString = new SpannableString(charSequence);
                        }
                        spannableString.removeSpan(characterStyle);
                    }
                }
                if (spannableString != null) {
                    return spannableString;
                }
            }
        }
        return charSequence;
    }
}
