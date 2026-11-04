package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@k2
@kotlin.l(level = kotlin.n.ERROR, message = "This is internal API and may be removed in the future releases")
public interface u extends o1 {

    public static final class a {
        @k2
        public static /* synthetic */ void a() {
        }
    }

    @k2
    boolean c(@NotNull Throwable th2);

    @Nullable
    p2 getParent();
}
