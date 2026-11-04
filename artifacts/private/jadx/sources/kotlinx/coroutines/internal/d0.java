package kotlinx.coroutines.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class d0 extends f0 {
    public final void C(@NotNull Function1<? super f0, Unit> function1) {
        Object objJ = j();
        Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        for (f0 f0VarK = (f0) objJ; !Intrinsics.areEqual(f0VarK, this); f0VarK = f0VarK.k()) {
            function1.invoke(f0VarK);
        }
    }

    @NotNull
    public final Void D() {
        throw new IllegalStateException("head cannot be removed");
    }

    @Override // kotlinx.coroutines.internal.f0
    public boolean t() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.f0
    public /* bridge */ /* synthetic */ boolean v() {
        return ((Boolean) D()).booleanValue();
    }
}
