package androidx.navigation.compose;

import androidx.lifecycle.f2;
import androidx.lifecycle.l1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nNavBackStackEntryProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntryProvider.kt\nandroidx/navigation/compose/BackStackEntryIdViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
public final class a extends f2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f70634d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f70635a = "SaveableStateHolder_BackStackEntryKey";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f70636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e3.c<androidx.compose.runtime.saveable.m> f70637c;

    public a(@NotNull l1 l1Var) {
        String strD = (String) l1Var.e("SaveableStateHolder_BackStackEntryKey");
        if (strD == null) {
            strD = e3.b.d();
            l1Var.n("SaveableStateHolder_BackStackEntryKey", strD);
        }
        this.f70636b = strD;
    }

    @NotNull
    public final String U() {
        return this.f70636b;
    }

    @NotNull
    public final e3.c<androidx.compose.runtime.saveable.m> V() {
        e3.c<androidx.compose.runtime.saveable.m> cVar = this.f70637c;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("saveableStateHolderRef");
        return null;
    }

    public final void W(@NotNull e3.c<androidx.compose.runtime.saveable.m> cVar) {
        this.f70637c = cVar;
    }

    @Override // androidx.lifecycle.f2
    protected void onCleared() {
        super.onCleared();
        androidx.compose.runtime.saveable.m mVarB = V().b();
        if (mVarB != null) {
            mVarB.d(this.f70636b);
        }
        V().a();
    }
}
