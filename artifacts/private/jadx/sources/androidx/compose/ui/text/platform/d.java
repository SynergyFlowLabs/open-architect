package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.text.font.q0;
import androidx.compose.ui.text.font.q1;
import androidx.compose.ui.text.font.v0;
import androidx.compose.ui.text.font.z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@kotlin.l(message = "This path for preloading loading fonts is not supported.")
public final class d implements q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f42065c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.font.y f42066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Typeface f42067b;

    public d(@NotNull z0 z0Var) {
        this.f42066a = z0Var;
        Typeface typefaceCreate = Typeface.create(z0Var.s(), 0);
        Intrinsics.checkNotNull(typefaceCreate);
        this.f42067b = typefaceCreate;
    }

    private final Typeface c(v0 v0Var, int i10) {
        return q1.f41694a.a(this.f42067b, v0Var.O(), q0.f(i10, q0.f41690b.a()));
    }

    @Override // androidx.compose.ui.text.font.n1
    @NotNull
    public androidx.compose.ui.text.font.y a() {
        return this.f42066a;
    }

    @Override // androidx.compose.ui.text.platform.q
    @NotNull
    public Typeface b(@NotNull v0 v0Var, int i10, int i11) {
        return c(v0Var, i10);
    }
}
