package ad;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public interface b {

    public static final class a {
        public static void a(@NotNull b bVar, @NotNull Object configurableInstance) {
            Intrinsics.checkNotNullParameter(configurableInstance, "configurableInstance");
            bVar.apply(configurableInstance, null);
        }
    }

    void apply(@NotNull Object obj);

    void apply(@NotNull Object obj, @Nullable Object obj2);
}
