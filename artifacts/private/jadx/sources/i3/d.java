package i3;

import androidx.annotation.b1;
import androidx.paging.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY})
public final class d {
    @NotNull
    public static final String a(@Nullable z0 z0Var, @NotNull Function0<String> log) {
        Intrinsics.checkNotNullParameter(log, "log");
        String strInvoke = log.invoke();
        if (z0Var != null) {
            strInvoke = strInvoke + "|   mediatorLoadStates: " + z0Var + '\n';
        }
        return StringsKt.r(strInvoke + "|)", null, 1, null);
    }
}
