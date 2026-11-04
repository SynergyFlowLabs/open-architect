package androidx.compose.foundation.text.input.internal;

import android.view.InputDevice;
import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class d extends h6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f19520f = 8;

    @Override // androidx.compose.foundation.text.input.internal.h6
    public boolean d(@NotNull KeyEvent keyEvent, @NotNull w6 w6Var, @NotNull q6 q6Var, @NotNull androidx.compose.foundation.text.input.internal.selection.d0 d0Var, @NotNull Function1<? super androidx.compose.foundation.text.s3, ? extends Unit> function1, @NotNull androidx.compose.ui.platform.z3 z3Var, boolean z10, boolean z11, @NotNull Function0<Boolean> function0) {
        if (androidx.compose.ui.input.key.d.g(androidx.compose.ui.input.key.e.b(keyEvent), androidx.compose.ui.input.key.d.f38913b.a()) && keyEvent.isFromSource(257) && !i6.c(keyEvent)) {
            d0Var.d1(false);
        }
        return super.d(keyEvent, w6Var, q6Var, d0Var, function1, z3Var, z10, z11, function0);
    }

    @Override // androidx.compose.foundation.text.input.internal.h6
    public boolean e(@NotNull KeyEvent keyEvent, @NotNull w6 w6Var, @NotNull androidx.compose.foundation.text.input.internal.selection.d0 d0Var, @NotNull androidx.compose.ui.focus.q qVar, @NotNull androidx.compose.ui.platform.z3 z3Var) {
        boolean zE = super.e(keyEvent, w6Var, d0Var, qVar, z3Var);
        if (androidx.compose.foundation.s1.f18608m) {
            return zE;
        }
        if (zE) {
            return true;
        }
        InputDevice device = keyEvent.getDevice();
        if (device != null && device.supportsSource(androidx.core.view.f0.f48707j) && !device.isVirtual() && androidx.compose.ui.input.key.d.g(androidx.compose.ui.input.key.e.b(keyEvent), androidx.compose.ui.input.key.d.f38913b.a()) && keyEvent.getSource() != 257) {
            if (i6.d(keyEvent, 19)) {
                return qVar.t(androidx.compose.ui.focus.f.f37408b.h());
            }
            if (i6.d(keyEvent, 20)) {
                return qVar.t(androidx.compose.ui.focus.f.f37408b.a());
            }
            if (i6.d(keyEvent, 21)) {
                return qVar.t(androidx.compose.ui.focus.f.f37408b.d());
            }
            if (i6.d(keyEvent, 22)) {
                return qVar.t(androidx.compose.ui.focus.f.f37408b.g());
            }
            if (!i6.d(keyEvent, 23)) {
                return false;
            }
            z3Var.a();
            return true;
        }
        return false;
    }
}
