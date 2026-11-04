package androidx.compose.runtime;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class j5 implements u6<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j5 f36175a = new j5();

    private j5() {
    }

    @Override // androidx.compose.runtime.u6
    public boolean b(@Nullable Object obj, @Nullable Object obj2) {
        return obj == obj2;
    }

    @NotNull
    public String toString() {
        return "ReferentialEqualityPolicy";
    }
}
