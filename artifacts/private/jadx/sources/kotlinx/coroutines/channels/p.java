package kotlinx.coroutines.channels;

import kotlin.b1;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.internal.c1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface p<E> extends o0<E>, n0<E> {

    @NotNull
    public static final b N2 = b.f313861a;
    public static final int O2 = Integer.MAX_VALUE;
    public static final int P2 = 0;
    public static final int Q2 = -1;
    public static final int R2 = -2;
    public static final int S2 = -3;

    @NotNull
    public static final String T2 = "kotlinx.coroutines.channels.defaultBuffer";

    public static final class a {
        @NotNull
        public static <E> kotlinx.coroutines.selects.h<E> b(@NotNull p<E> pVar) {
            return n0.a.d(pVar);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@NotNull p<E> pVar, E e10) {
            return o0.a.c(pVar, e10);
        }

        @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @b1(expression = "tryReceive().getOrNull()", imports = {}))
        @Nullable
        public static <E> E d(@NotNull p<E> pVar) {
            return (E) n0.a.h(pVar);
        }

        @kotlin.internal.h
        @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
        @Nullable
        public static <E> Object e(@NotNull p<E> pVar, @NotNull kotlin.coroutines.d<? super E> dVar) {
            return n0.a.i(pVar, dVar);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f313862b = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f313863c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f313864d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f313865e = -2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f313866f = -3;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final String f313867g = "kotlinx.coroutines.channels.defaultBuffer";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f313861a = new b();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f313868h = c1.b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        private b() {
        }

        @f1
        public static /* synthetic */ void b() {
        }

        public final int a() {
            return f313868h;
        }
    }
}
