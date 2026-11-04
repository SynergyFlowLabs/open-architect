package androidx.compose.foundation.lazy.layout;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.b2
public interface m2 {
    @kotlin.l(level = kotlin.n.WARNING, message = "Please use schedulePrecomposition(index) instead")
    default void a(int i10) {
        d(i10);
    }

    void b(int i10, long j10);

    @kotlin.l(level = kotlin.n.WARNING, message = "Please use schedulePremeasure(index, constraints) instead")
    default void c(int i10, long j10) {
        b(i10, j10);
    }

    void d(int i10);

    default int e() {
        return -1;
    }
}
