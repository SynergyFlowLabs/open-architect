package kotlin.ranges;

import java.lang.Comparable;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.m2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@m2(markerClass = {kotlin.s.class})
@e1(version = "1.9")
public interface q<T extends Comparable<? super T>> {

    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@NotNull q<T> qVar, @NotNull T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.compareTo(qVar.u()) >= 0 && value.compareTo(qVar.k()) < 0;
        }

        public static <T extends Comparable<? super T>> boolean b(@NotNull q<T> qVar) {
            return qVar.u().compareTo(qVar.k()) >= 0;
        }
    }

    boolean c(@NotNull T t10);

    boolean isEmpty();

    @NotNull
    T k();

    @NotNull
    T u();
}
