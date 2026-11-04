package androidx.navigation;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class r2 extends w0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.navigation.w0
    public final void Z0(@NotNull androidx.lifecycle.o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.Z0(owner);
    }

    @Override // androidx.navigation.w0
    public final void b1(@NotNull androidx.activity.j0 dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        super.b1(dispatcher);
    }

    @Override // androidx.navigation.w0
    public final void c1(@NotNull androidx.lifecycle.l2 viewModelStore) {
        Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
        super.c1(viewModelStore);
    }

    @Override // androidx.navigation.w0
    public final void t(boolean z10) {
        super.t(z10);
    }
}
