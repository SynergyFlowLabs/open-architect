package androidx.compose.ui.autofill;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
final class g implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<String> f36977b;

    public g(@NotNull Set<String> set) {
        this.f36977b = set;
    }

    @Override // androidx.compose.ui.autofill.u
    @NotNull
    public u a(@NotNull u uVar) {
        Intrinsics.checkNotNull(uVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return new g(SetsKt.plus((Set) this.f36977b, (Iterable) ((g) uVar).f36977b));
    }

    @NotNull
    public final Set<String> b() {
        return this.f36977b;
    }
}
