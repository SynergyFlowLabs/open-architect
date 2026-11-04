package androidx.compose.foundation.text;

import android.view.InputDevice;
import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class s5 {

    static final class a implements Function1<androidx.compose.ui.input.key.c, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.focus.q f20977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g4 f20978b;

        a(androidx.compose.ui.focus.q qVar, g4 g4Var) {
            this.f20977a = qVar;
            this.f20978b = g4Var;
        }

        public final Boolean c(KeyEvent keyEvent) {
            InputDevice device = keyEvent.getDevice();
            boolean zT = false;
            if (device != null && device.supportsSource(androidx.core.view.f0.f48707j) && !device.isVirtual() && androidx.compose.ui.input.key.d.g(androidx.compose.ui.input.key.e.b(keyEvent), androidx.compose.ui.input.key.d.f38913b.a()) && keyEvent.getSource() != 257) {
                if (s5.c(keyEvent, 19)) {
                    zT = this.f20977a.t(androidx.compose.ui.focus.f.f37408b.h());
                } else if (s5.c(keyEvent, 20)) {
                    zT = this.f20977a.t(androidx.compose.ui.focus.f.f37408b.a());
                } else if (s5.c(keyEvent, 21)) {
                    zT = this.f20977a.t(androidx.compose.ui.focus.f.f37408b.d());
                } else if (s5.c(keyEvent, 22)) {
                    zT = this.f20977a.t(androidx.compose.ui.focus.f.f37408b.g());
                } else if (s5.c(keyEvent, 23)) {
                    androidx.compose.ui.platform.z3 z3VarL = this.f20978b.l();
                    if (z3VarL != null) {
                        z3VarL.a();
                    }
                    zT = true;
                }
            }
            return Boolean.valueOf(zT);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
            return c(cVar.h());
        }
    }

    @NotNull
    public static final androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, @NotNull g4 g4Var, @NotNull androidx.compose.ui.focus.q qVar) {
        return androidx.compose.ui.input.key.f.b(a0Var, new a(qVar, g4Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(KeyEvent keyEvent, int i10) {
        return androidx.compose.ui.input.key.i.b(androidx.compose.ui.input.key.e.a(keyEvent)) == i10;
    }
}
