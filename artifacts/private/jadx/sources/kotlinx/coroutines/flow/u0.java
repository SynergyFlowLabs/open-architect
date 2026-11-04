package kotlinx.coroutines.flow;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f314834a = a.f314835a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f314835a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final u0 f314836b = new w0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final u0 f314837c = new x0();

        private a() {
        }

        public static /* synthetic */ u0 b(a aVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            if ((i10 & 2) != 0) {
                j11 = Long.MAX_VALUE;
            }
            return aVar.a(j10, j11);
        }

        @NotNull
        public final u0 a(long j10, long j11) {
            return new y0(j10, j11);
        }

        @NotNull
        public final u0 c() {
            return f314836b;
        }

        @NotNull
        public final u0 d() {
            return f314837c;
        }
    }

    @NotNull
    i<s0> a(@NotNull z0<Integer> z0Var);
}
