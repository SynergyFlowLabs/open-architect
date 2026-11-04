package dk;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.b4;
import kotlinx.coroutines.d1;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.selects.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final long a(Duration duration) {
        if (duration.compareTo(Duration.ZERO) <= 0) {
            return 0L;
        }
        if (duration.compareTo(ChronoUnit.MILLIS.getDuration()) <= 0) {
            return 1L;
        }
        if (duration.getSeconds() < 9223372036854775L || (duration.getSeconds() == 9223372036854775L && duration.getNano() < 807000000)) {
            return duration.toMillis();
        }
        return Long.MAX_VALUE;
    }

    @e2
    @NotNull
    public static final <T> i<T> b(@NotNull i<? extends T> iVar, @NotNull Duration duration) {
        return k.c0(iVar, a(duration));
    }

    @Nullable
    public static final Object c(@NotNull Duration duration, @NotNull d<? super Unit> dVar) {
        Object objB = d1.b(a(duration), dVar);
        return objB == b.l() ? objB : Unit.f312394a;
    }

    public static final <R> void d(@NotNull kotlinx.coroutines.selects.d<? super R> dVar, @NotNull Duration duration, @NotNull Function1<? super d<? super R>, ? extends Object> function1) {
        c.a(dVar, a(duration), function1);
    }

    @e2
    @NotNull
    public static final <T> i<T> e(@NotNull i<? extends T> iVar, @NotNull Duration duration) {
        return k.D1(iVar, a(duration));
    }

    @Nullable
    public static final <T> Object f(@NotNull Duration duration, @NotNull Function2<? super s0, ? super d<? super T>, ? extends Object> function2, @NotNull d<? super T> dVar) {
        return b4.c(a(duration), function2, dVar);
    }

    @Nullable
    public static final <T> Object g(@NotNull Duration duration, @NotNull Function2<? super s0, ? super d<? super T>, ? extends Object> function2, @NotNull d<? super T> dVar) {
        return b4.e(a(duration), function2, dVar);
    }
}
