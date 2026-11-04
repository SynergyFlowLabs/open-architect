package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class q7 implements u6<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q7 f36324a = new q7();

    private q7() {
    }

    @Override // androidx.compose.runtime.u6
    public boolean b(@Nullable Object obj, @Nullable Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    @NotNull
    public String toString() {
        return "StructuralEqualityPolicy";
    }
}
