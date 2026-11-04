package androidx.compose.ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@androidx.annotation.w0(26)
public final class l extends AutofillManager.AutofillCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f36984a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36985b = 8;

    private l() {
    }

    public final void a(@NotNull a aVar) {
        aVar.c().registerCallback(this);
    }

    public final void b(@NotNull a aVar) {
        aVar.c().unregisterCallback(this);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(@NotNull View view, int i10, int i11) {
        super.onAutofillEvent(view, i10, i11);
    }
}
