package kotlinx.coroutines.sync;

import kotlin.Unit;
import kotlin.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface a {

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.a$a, reason: collision with other inner class name */
    public static final class C2318a {
        @kotlin.l(level = n.WARNING, message = "Mutex.onLock deprecated without replacement. For additional details please refer to #2794")
        public static /* synthetic */ void a() {
        }

        public static /* synthetic */ Object b(a aVar, Object obj, kotlin.coroutines.d dVar, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return aVar.h(obj, dVar);
        }

        public static /* synthetic */ boolean c(a aVar, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return aVar.b(obj);
        }

        public static /* synthetic */ void d(a aVar, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            aVar.i(obj);
        }
    }

    boolean b(@Nullable Object obj);

    boolean c();

    boolean d(@NotNull Object obj);

    @NotNull
    kotlinx.coroutines.selects.j<Object, a> e();

    @Nullable
    Object h(@Nullable Object obj, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    void i(@Nullable Object obj);
}
