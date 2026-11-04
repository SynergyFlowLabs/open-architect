package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class k1 {
    @NotNull
    public static final h1 a() {
        return new i1();
    }

    @androidx.annotation.l1
    @NotNull
    public static final String b(@NotNull String str, @NotNull v0 v0Var) {
        int iO = v0Var.O() / 100;
        if (iO >= 0 && iO < 2) {
            return str + "-thin";
        }
        if (2 <= iO && iO < 4) {
            return str + "-light";
        }
        if (iO == 4) {
            return str;
        }
        if (iO == 5) {
            return str + "-medium";
        }
        if ((6 <= iO && iO < 8) || 8 > iO || iO >= 11) {
            return str;
        }
        return str + "-black";
    }

    @androidx.compose.ui.text.v
    @Nullable
    public static final Typeface c(@Nullable Typeface typeface, @NotNull u0.e eVar, @NotNull Context context) {
        return p1.f41684a.a(typeface, eVar, context);
    }
}
