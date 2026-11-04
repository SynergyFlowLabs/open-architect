package androidx.compose.foundation.text;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f19233a = a.f19234a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f19234a = new a();

        private a() {
        }

        public static /* synthetic */ f5 b(a aVar, long j10, long j11, long j12, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = g5.f19299a.b();
            }
            long j13 = j10;
            if ((i10 & 2) != 0) {
                j11 = g5.f19299a.a();
            }
            long j14 = j11;
            if ((i10 & 4) != 0) {
                j12 = androidx.compose.ui.unit.a0.k(0.25d);
            }
            return aVar.a(j13, j14, j12);
        }

        @NotNull
        public final f5 a(long j10, long j11, long j12) {
            return new j(j10, j11, j12, null);
        }
    }

    long a(@NotNull androidx.compose.foundation.text.modifiers.y yVar, long j10, @NotNull androidx.compose.ui.text.f fVar);

    boolean equals(@Nullable Object obj);

    int hashCode();
}
