package kotlin.jvm.internal;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class l0<R> implements d0<R>, Serializable {
    private final int arity;

    public l0(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.d0
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        String strX = j1.x(this);
        Intrinsics.checkNotNullExpressionValue(strX, "renderLambdaToString(...)");
        return strX;
    }
}
