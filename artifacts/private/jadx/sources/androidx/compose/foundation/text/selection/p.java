package androidx.compose.foundation.text.selection;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p f21305a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private static androidx.compose.ui.graphics.t1 f21306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static androidx.compose.ui.graphics.k0 f21307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private static androidx.compose.ui.graphics.drawscope.a f21308d;

    private p() {
    }

    @Nullable
    public final androidx.compose.ui.graphics.k0 a() {
        return f21307c;
    }

    @Nullable
    public final androidx.compose.ui.graphics.drawscope.a b() {
        return f21308d;
    }

    @Nullable
    public final androidx.compose.ui.graphics.t1 c() {
        return f21306b;
    }

    public final void d(@Nullable androidx.compose.ui.graphics.k0 k0Var) {
        f21307c = k0Var;
    }

    public final void e(@Nullable androidx.compose.ui.graphics.drawscope.a aVar) {
        f21308d = aVar;
    }

    public final void f(@Nullable androidx.compose.ui.graphics.t1 t1Var) {
        f21306b = t1Var;
    }
}
