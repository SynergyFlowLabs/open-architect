package kotlinx.coroutines.selects;

import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.d1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    @c2
    public static final <R> void a(@NotNull d<? super R> dVar, long j10, @NotNull Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1) {
        dVar.a(new b(j10).c(), function1);
    }

    @c2
    public static final <R> void b(@NotNull d<? super R> dVar, long j10, @NotNull Function1<? super kotlin.coroutines.d<? super R>, ? extends Object> function1) {
        a(dVar, d1.e(j10), function1);
    }
}
