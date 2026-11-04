package androidx.compose.foundation.text.input.internal;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(34)
class b0 extends y {
    public b0(@NotNull View view) {
        super(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.w, androidx.compose.foundation.text.input.internal.v
    public void g() {
        l().startStylusHandwriting(k());
    }

    @Override // androidx.compose.foundation.text.input.internal.w, androidx.compose.foundation.text.input.internal.v
    public void h() {
        l().acceptStylusHandwritingDelegation(k());
    }

    @Override // androidx.compose.foundation.text.input.internal.w, androidx.compose.foundation.text.input.internal.v
    public void i() {
        l().prepareStylusHandwritingDelegation(k());
    }
}
