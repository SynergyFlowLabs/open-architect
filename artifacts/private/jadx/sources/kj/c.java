package kj;

import kotlin.e1;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@f
@e1(version = "1.3")
@kotlin.internal.b
public interface c {

    public static final class a {
        public static /* synthetic */ kj.a a(c cVar, x xVar, g gVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callsInPlace");
            }
            if ((i10 & 2) != 0) {
                gVar = g.UNKNOWN;
            }
            return cVar.a(xVar, gVar);
        }
    }

    @kotlin.internal.b
    @NotNull
    <R> kj.a a(@NotNull x<? extends R> xVar, @NotNull g gVar);

    @kotlin.internal.b
    @NotNull
    h b();

    @kotlin.internal.b
    @NotNull
    h c(@Nullable Object obj);

    @kotlin.internal.b
    @NotNull
    i d();
}
