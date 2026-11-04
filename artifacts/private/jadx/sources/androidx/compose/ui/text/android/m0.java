package androidx.compose.ui.text.android;

import android.os.Build;
import android.text.StaticLayout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(23)
final class m0 implements a1 {
    @Override // androidx.compose.ui.text.android.a1
    @NotNull
    public StaticLayout a(@NotNull c1 c1Var) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(c1Var.r(), c1Var.q(), c1Var.e(), c1Var.o(), c1Var.u());
        builderObtain.setTextDirection(c1Var.s());
        builderObtain.setAlignment(c1Var.a());
        builderObtain.setMaxLines(c1Var.n());
        builderObtain.setEllipsize(c1Var.c());
        builderObtain.setEllipsizedWidth(c1Var.d());
        builderObtain.setLineSpacing(c1Var.l(), c1Var.m());
        builderObtain.setIncludePad(c1Var.g());
        builderObtain.setBreakStrategy(c1Var.b());
        builderObtain.setHyphenationFrequency(c1Var.f());
        builderObtain.setIndents(c1Var.i(), c1Var.p());
        int i10 = Build.VERSION.SDK_INT;
        n0.a(builderObtain, c1Var.h());
        o0.a(builderObtain, c1Var.t());
        if (i10 >= 33) {
            v0.b(builderObtain, c1Var.j(), c1Var.k());
        }
        if (i10 >= 35) {
            x0.a(builderObtain);
        }
        return builderObtain.build();
    }

    @Override // androidx.compose.ui.text.android.a1
    public boolean b(@NotNull StaticLayout staticLayout, boolean z10) {
        return Build.VERSION.SDK_INT >= 33 ? v0.a(staticLayout) : z10;
    }
}
