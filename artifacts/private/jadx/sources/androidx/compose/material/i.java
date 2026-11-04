package androidx.compose.material;

/* JADX INFO: loaded from: classes.dex */
@u7
public interface i {
    static /* synthetic */ void b(i iVar, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dragTo");
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        iVar.a(f10, f11);
    }

    void a(float f10, float f11);
}
