package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@androidx.annotation.w0(34)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p f19734a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f19735b = 0;

    private p() {
    }

    public final void a(@NotNull InputMethodManager inputMethodManager, @NotNull View view) {
        inputMethodManager.startStylusHandwriting(view);
    }
}
