package qb;

import com.planner5d.library.math.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public interface g extends qb.a {

    public static final class a {
        public static /* synthetic */ k a(g gVar, b bVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEnd");
            }
            if ((i10 & 1) != 0) {
                bVar = null;
            }
            return gVar.e(bVar);
        }

        public static /* synthetic */ k b(g gVar, b bVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStart");
            }
            if ((i10 & 1) != 0) {
                bVar = null;
            }
            return gVar.c(bVar);
        }
    }

    public enum b {
        InLine,
        OutLine
    }

    @NotNull
    k c(@Nullable b bVar);

    @NotNull
    k e(@Nullable b bVar);

    float f();

    boolean isHidden();
}
