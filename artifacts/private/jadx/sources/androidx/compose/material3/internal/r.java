package androidx.compose.material3.internal;

/* JADX INFO: loaded from: classes.dex */
public interface r {
    static /* synthetic */ void b(r rVar, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dragTo");
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        rVar.a(f10, f11);
    }

    void a(float f10, float f11);
}
