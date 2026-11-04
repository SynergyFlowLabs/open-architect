package androidx.compose.ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
@androidx.annotation.w0(27)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f36980a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36981b = 0;

    private j() {
    }

    @androidx.annotation.w0(27)
    public final void a(@NotNull View view, @NotNull AutofillManager autofillManager, int i10, boolean z10) {
        autofillManager.notifyViewVisibilityChanged(view, i10, z10);
    }
}
