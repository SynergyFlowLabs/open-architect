package androidx.compose.ui.unit;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    @NotNull
    public static final d a(@NotNull Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        f1.a aVarB = f1.b.f274919a.b(f10);
        if (aVarB == null) {
            aVarB = new x(f10);
        }
        return new g(f11, f10, aVarB);
    }
}
