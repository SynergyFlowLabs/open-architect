package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@androidx.annotation.w0(26)
public final class x implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f37068b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AutofillManager f37069a;

    public x(@NotNull AutofillManager autofillManager) {
        this.f37069a = autofillManager;
    }

    @Override // androidx.compose.ui.autofill.w
    public void a(@NotNull View view, int i10, @NotNull AutofillValue autofillValue) {
        this.f37069a.notifyValueChanged(view, i10, autofillValue);
    }

    @Override // androidx.compose.ui.autofill.w
    public void b(@NotNull View view, int i10, @NotNull Rect rect) {
        this.f37069a.notifyViewEntered(view, i10, rect);
    }

    @Override // androidx.compose.ui.autofill.w
    public void c(@NotNull View view, int i10) {
        this.f37069a.notifyViewExited(view, i10);
    }

    @Override // androidx.compose.ui.autofill.w
    public void cancel() {
        this.f37069a.cancel();
    }

    @Override // androidx.compose.ui.autofill.w
    public void commit() {
        this.f37069a.commit();
    }

    @Override // androidx.compose.ui.autofill.w
    public void d(@NotNull View view, int i10, @NotNull Rect rect) {
        this.f37069a.requestAutofill(view, i10, rect);
    }

    @Override // androidx.compose.ui.autofill.w
    public void e(@NotNull View view, int i10, boolean z10) {
        j.f36980a.a(view, this.f37069a, i10, z10);
    }

    @NotNull
    public final AutofillManager f() {
        return this.f37069a;
    }
}
