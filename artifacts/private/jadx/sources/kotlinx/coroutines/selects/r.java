package kotlinx.coroutines.selects;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class r {
    @Nullable
    public static final <R> Object a(@NotNull Function1<? super d<? super R>, Unit> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        u uVar = new u(dVar.getContext());
        function1.invoke(uVar);
        return uVar.w(dVar);
    }

    private static final <R> Object b(Function1<? super d<? super R>, Unit> function1, kotlin.coroutines.d<? super R> dVar) {
        h0.e(3);
        throw null;
    }
}
