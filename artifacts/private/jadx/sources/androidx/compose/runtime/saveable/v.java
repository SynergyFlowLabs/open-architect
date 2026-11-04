package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface v {

    public interface a {
        void a();
    }

    boolean a(@NotNull Object obj);

    @NotNull
    a b(@NotNull String str, @NotNull Function0<? extends Object> function0);

    @NotNull
    Map<String, List<Object>> c();

    @Nullable
    Object f(@NotNull String str);
}
