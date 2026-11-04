package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.ExtractedText;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f19706a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f19707b = "RecordingIC";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f19708c = "RecordingInputConnection";

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtractedText b(androidx.compose.ui.text.input.y0 y0Var) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = y0Var.m();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = y0Var.m().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = androidx.compose.ui.text.w3.l(y0Var.l());
        extractedText.selectionEnd = androidx.compose.ui.text.w3.k(y0Var.l());
        extractedText.flags = !StringsKt.U2(y0Var.m(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
