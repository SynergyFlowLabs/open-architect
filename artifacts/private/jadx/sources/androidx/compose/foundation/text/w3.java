package androidx.compose.foundation.text;

import android.view.KeyEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final u3 f21706a = new a();

    public static final class a implements u3 {
        a() {
        }

        @Override // androidx.compose.foundation.text.u3
        public s3 a(KeyEvent keyEvent) {
            s3 s3Var = null;
            if (androidx.compose.ui.input.key.e.g(keyEvent) && androidx.compose.ui.input.key.e.d(keyEvent)) {
                long jA = androidx.compose.ui.input.key.e.a(keyEvent);
                t4 t4Var = t4.f21583a;
                if (androidx.compose.ui.input.key.b.E4(jA, t4Var.j())) {
                    s3Var = s3.SELECT_LINE_LEFT;
                } else if (androidx.compose.ui.input.key.b.E4(jA, t4Var.k())) {
                    s3Var = s3.SELECT_LINE_RIGHT;
                } else if (androidx.compose.ui.input.key.b.E4(jA, t4Var.l())) {
                    s3Var = s3.SELECT_HOME;
                } else if (androidx.compose.ui.input.key.b.E4(jA, t4Var.i())) {
                    s3Var = s3.SELECT_END;
                }
            } else if (androidx.compose.ui.input.key.e.d(keyEvent)) {
                long jA2 = androidx.compose.ui.input.key.e.a(keyEvent);
                t4 t4Var2 = t4.f21583a;
                if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.j())) {
                    s3Var = s3.LINE_LEFT;
                } else if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.k())) {
                    s3Var = s3.LINE_RIGHT;
                } else if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.l())) {
                    s3Var = s3.HOME;
                } else if (androidx.compose.ui.input.key.b.E4(jA2, t4Var2.i())) {
                    s3Var = s3.END;
                }
            }
            return s3Var == null ? v3.b().a(keyEvent) : s3Var;
        }
    }

    @NotNull
    public static final u3 a() {
        return f21706a;
    }
}
