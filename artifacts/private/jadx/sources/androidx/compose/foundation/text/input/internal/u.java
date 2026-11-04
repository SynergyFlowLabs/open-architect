package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.k7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    @k7
    @NotNull
    public static final t a(@NotNull t.a aVar, char c10) {
        return new e4(c10);
    }

    @NotNull
    public static final CharSequence b(@NotNull androidx.compose.foundation.text.input.l lVar, @NotNull t tVar, @NotNull g4 g4Var) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        while (i10 < lVar.length()) {
            int iB = s.b(lVar, i10);
            int iA = tVar.a(i11, iB);
            int iA2 = s.a(iB);
            if (iA != iB) {
                g4Var.e(sb2.length(), sb2.length() + iA2, s.a(iA));
                z10 = true;
            }
            androidx.compose.foundation.text.c5.a(sb2, iA);
            i10 += iA2;
            i11++;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return z10 ? string : lVar;
    }
}
