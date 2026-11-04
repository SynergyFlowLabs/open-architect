package fd;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class l {
    @NotNull
    public static final String a(@Nullable k kVar, @NotNull Context context, boolean z10) {
        String strP;
        Intrinsics.checkNotNullParameter(context, "context");
        if (kVar != null && (strP = kVar.p(context, z10)) != null) {
            return strP;
        }
        String string = context.getString(qd.b.q.rt);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
