package androidx.compose.ui.text.font;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@oj.i(name = "DeviceFontFamilyNameFontKt")
public final class v {
    @NotNull
    public static final x a(@NotNull String str, @NotNull v0 v0Var, int i10, @NotNull u0.e eVar) {
        return new u(str, v0Var, i10, eVar, null);
    }

    public static /* synthetic */ x b(String str, v0 v0Var, int i10, u0.e eVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            v0Var = v0.f41742b.m();
        }
        if ((i11 & 4) != 0) {
            i10 = q0.f41690b.c();
        }
        if ((i11 & 8) != 0) {
            eVar = new u0.e(new u0.a[0]);
        }
        return a(str, v0Var, i10, eVar);
    }
}
