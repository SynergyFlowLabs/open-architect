package androidx.savedstate;

import android.os.Bundle;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final <T> T a(@NotNull Bundle bundle, @NotNull Function1<? super f, ? extends T> function1) {
        return (T) d.a(bundle, function1);
    }

    @NotNull
    public static final Bundle b(@NotNull Bundle bundle, @NotNull Function1<? super n, Unit> function1) {
        return e.a(bundle, function1);
    }

    @NotNull
    public static final Bundle c(@NotNull Map<String, ? extends Object> map, @NotNull Function1<? super n, Unit> function1) {
        return e.b(map, function1);
    }

    public static final <T> T f(@NotNull Bundle bundle, @NotNull Function1<? super n, ? extends T> function1) {
        return (T) d.b(bundle, function1);
    }
}
