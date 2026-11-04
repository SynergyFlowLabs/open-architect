package kotlin.ranges;

import java.lang.Comparable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface g<T extends Comparable<? super T>> {

    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@NotNull g<T> gVar, @NotNull T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.compareTo(gVar.u()) >= 0 && value.compareTo(gVar.i()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean b(@NotNull g<T> gVar) {
            return gVar.u().compareTo(gVar.i()) > 0;
        }
    }

    boolean c(@NotNull T t10);

    @NotNull
    T i();

    boolean isEmpty();

    @NotNull
    T u();
}
