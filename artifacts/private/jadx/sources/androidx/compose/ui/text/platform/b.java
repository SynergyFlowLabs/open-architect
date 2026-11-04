package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.text.font.q0;
import androidx.compose.ui.text.font.q1;
import androidx.compose.ui.text.font.v0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
@kotlin.l(message = "This path for preloading fonts is not supported")
public final class b implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f42056b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.font.y f42057a = androidx.compose.ui.text.font.y.f41770b.b();

    @Override // androidx.compose.ui.text.font.n1
    @NotNull
    public androidx.compose.ui.text.font.y a() {
        return this.f42057a;
    }

    @Override // androidx.compose.ui.text.platform.q
    @NotNull
    public Typeface b(@NotNull v0 v0Var, int i10, int i11) {
        return q1.f41694a.a(Typeface.DEFAULT, v0Var.O(), q0.f(i10, q0.f41690b.a()));
    }
}
