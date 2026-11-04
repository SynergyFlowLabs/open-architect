package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class c7 {
    @NotNull
    public static final <T> u6<T> a() {
        r3 r3Var = r3.f36332a;
        Intrinsics.checkNotNull(r3Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        return r3Var;
    }

    @NotNull
    public static final <T> u6<T> b() {
        j5 j5Var = j5.f36175a;
        Intrinsics.checkNotNull(j5Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        return j5Var;
    }

    @NotNull
    public static final <T> u6<T> c() {
        q7 q7Var = q7.f36324a;
        Intrinsics.checkNotNull(q7Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return q7Var;
    }
}
