package kotlin.coroutines.jvm.internal;

import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@e1(version = "1.3")
public abstract class o extends d implements d0<Object>, n {
    private final int arity;

    public o(int i10, @Nullable kotlin.coroutines.d<Object> dVar) {
        super(dVar);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.d0
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strW = j1.w(this);
        Intrinsics.checkNotNullExpressionValue(strW, "renderLambdaToString(...)");
        return strW;
    }

    public o(int i10) {
        this(i10, null);
    }
}
