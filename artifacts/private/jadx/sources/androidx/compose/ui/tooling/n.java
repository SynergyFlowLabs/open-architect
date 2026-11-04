package androidx.compose.ui.tooling;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class n implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<androidx.compose.runtime.tooling.f> f42631b = Collections.newSetFromMap(new WeakHashMap());

    @Override // androidx.compose.ui.tooling.m
    @NotNull
    public Set<androidx.compose.runtime.tooling.f> a() {
        return this.f42631b;
    }
}
