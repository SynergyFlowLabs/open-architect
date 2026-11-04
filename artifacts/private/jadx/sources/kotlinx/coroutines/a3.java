package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a3 extends n0 {
    @NotNull
    public abstract a3 M0();

    @k2
    @Nullable
    protected final String O0() {
        a3 a3VarM0;
        a3 a3VarE = l1.e();
        if (this == a3VarE) {
            return "Dispatchers.Main";
        }
        try {
            a3VarM0 = a3VarE.M0();
        } catch (UnsupportedOperationException unused) {
            a3VarM0 = null;
        }
        if (this == a3VarM0) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // kotlinx.coroutines.n0
    @NotNull
    public n0 Y(int i10, @Nullable String str) {
        kotlinx.coroutines.internal.a0.a(i10);
        return kotlinx.coroutines.internal.a0.b(this, str);
    }

    @Override // kotlinx.coroutines.n0
    @NotNull
    public String toString() {
        String strO0 = O0();
        if (strO0 != null) {
            return strO0;
        }
        return x0.a(this) + '@' + x0.b(this);
    }
}
