package kotlinx.coroutines.selects;

import kotlin.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.c2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface d<R> {

    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static <R, P, Q> void a(@NotNull d<? super R> dVar, @NotNull j<? super P, ? extends Q> jVar, @NotNull Function2<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2) {
            dVar.c(jVar, null, function2);
        }

        @kotlin.internal.h
        @c2
        @kotlin.l(level = kotlin.n.ERROR, message = "Replaced with the same extension function", replaceWith = @b1(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
        public static <R> void b(@NotNull d<? super R> dVar, long j10, @NotNull Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1) {
            c.a(dVar, j10, function1);
        }
    }

    void a(@NotNull f fVar, @NotNull Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1);

    <P, Q> void c(@NotNull j<? super P, ? extends Q> jVar, P p10, @NotNull Function2<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2);

    @kotlin.internal.h
    @c2
    @kotlin.l(level = kotlin.n.ERROR, message = "Replaced with the same extension function", replaceWith = @b1(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    void d(long j10, @NotNull Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1);

    <P, Q> void h(@NotNull j<? super P, ? extends Q> jVar, @NotNull Function2<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2);

    <Q> void j(@NotNull h<? extends Q> hVar, @NotNull Function2<? super Q, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2);
}
