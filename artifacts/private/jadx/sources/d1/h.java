package d1;

import kotlin.sequences.Sequence;
import kotlin.sequences.o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface h<T> {

    public static final class a {
        @Deprecated
        public static <T> int a(@NotNull h<T> hVar) {
            return h.super.getCount();
        }
    }

    @NotNull
    Sequence<T> O1();

    default int getCount() {
        return o.g0(O1());
    }
}
