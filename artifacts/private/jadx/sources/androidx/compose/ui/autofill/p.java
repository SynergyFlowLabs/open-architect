package androidx.compose.ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@androidx.annotation.w0(26)
public final class p extends AutofillManager.AutofillCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p f36996a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36997b = 8;

    private p() {
    }

    public final void a(@NotNull b bVar) {
        w wVarG = bVar.g();
        Intrinsics.checkNotNull(wVarG, "null cannot be cast to non-null type androidx.compose.ui.autofill.PlatformAutofillManagerImpl");
        ((x) wVarG).f().registerCallback(this);
    }

    public final void b(@NotNull b bVar) {
        w wVarG = bVar.g();
        Intrinsics.checkNotNull(wVarG, "null cannot be cast to non-null type androidx.compose.ui.autofill.PlatformAutofillManagerImpl");
        ((x) wVarG).f().unregisterCallback(this);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(@NotNull View view, int i10, int i11) {
        super.onAutofillEvent(view, i10, i11);
    }
}
