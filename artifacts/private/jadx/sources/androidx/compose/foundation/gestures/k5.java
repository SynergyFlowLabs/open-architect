package androidx.compose.foundation.gestures;

/* JADX INFO: loaded from: classes.dex */
public interface k5 {

    public static final class a {
    }

    static /* synthetic */ void b(k5 k5Var, float f10, long j10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
        }
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            j10 = n0.g.f332700b.e();
        }
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        k5Var.a(f10, j10, f11);
    }

    void a(float f10, long j10, float f11);
}
