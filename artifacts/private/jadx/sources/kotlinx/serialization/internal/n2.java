package kotlinx.serialization.internal;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public abstract class n2<Array> {
    public static /* synthetic */ void c(n2 n2Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i11 & 1) != 0) {
            i10 = n2Var.d() + 1;
        }
        n2Var.b(i10);
    }

    public abstract Array a();

    public abstract void b(int i10);

    public abstract int d();
}
