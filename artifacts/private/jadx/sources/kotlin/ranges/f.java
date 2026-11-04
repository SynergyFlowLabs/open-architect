package kotlin.ranges;

import java.lang.Comparable;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
public interface f<T extends Comparable<? super T>> extends g<T> {

    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@NotNull f<T> fVar, @NotNull T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return fVar.d(fVar.u(), value) && fVar.d(value, fVar.i());
        }

        public static <T extends Comparable<? super T>> boolean b(@NotNull f<T> fVar) {
            return !fVar.d(fVar.u(), fVar.i());
        }
    }

    @Override // kotlin.ranges.g
    boolean c(@NotNull T t10);

    boolean d(@NotNull T t10, @NotNull T t11);

    @Override // kotlin.ranges.g
    boolean isEmpty();
}
