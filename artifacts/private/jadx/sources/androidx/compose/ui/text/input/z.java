package androidx.compose.ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.text.w3;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class z {
    @NotNull
    public static final ExtractedText a(@NotNull y0 y0Var) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = y0Var.m();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = y0Var.m().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = w3.l(y0Var.l());
        extractedText.selectionEnd = w3.k(y0Var.l());
        extractedText.flags = !StringsKt.U2(y0Var.m(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
