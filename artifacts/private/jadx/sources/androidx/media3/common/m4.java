package androidx.media3.common;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public interface m4 {

    @androidx.media3.common.util.b1
    public interface a {
        default void a(k4 k4Var) {
        }

        default void b(float f10) {
        }

        default void d(long j10) {
        }

        default void e(int i10, int i11) {
        }

        default void h(long j10) {
        }
    }

    l4 b(int i10);

    void c(@androidx.annotation.p0 v3 v3Var);

    boolean d();

    void e(@androidx.annotation.g0(from = 0) int i10) throws k4;

    void initialize() throws k4;

    void release();
}
