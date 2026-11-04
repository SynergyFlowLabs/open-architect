package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f18022b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.m<l> f18023a;

    public w0(@NotNull androidx.compose.foundation.lazy.layout.m<l> mVar) {
        this.f18023a = mVar;
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.m<l> a() {
        return this.f18023a;
    }

    public final boolean b(int i10) {
        if (i10 >= 0 && i10 < this.f18023a.getSize()) {
            androidx.compose.foundation.lazy.layout.m.a<l> aVar = this.f18023a.get(i10);
            Function1<Integer, f1> function1B = aVar.c().b();
            int iB = i10 - aVar.b();
            if (function1B != null && function1B.invoke(Integer.valueOf(iB)) == f1.f17824b.a()) {
                return true;
            }
        }
        return false;
    }
}
