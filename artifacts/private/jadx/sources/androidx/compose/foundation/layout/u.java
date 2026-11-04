package androidx.compose.foundation.layout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class u extends androidx.compose.ui.a0.d implements androidx.compose.ui.node.a2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.e f16455s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f16456t;

    public u(@NotNull androidx.compose.ui.e eVar, boolean z10) {
        this.f16455s = eVar;
        this.f16456t = z10;
    }

    @NotNull
    public final androidx.compose.ui.e v9() {
        return this.f16455s;
    }

    public final boolean w9() {
        return this.f16456t;
    }

    @Override // androidx.compose.ui.node.a2
    @NotNull
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public u V(@NotNull androidx.compose.ui.unit.d dVar, @Nullable Object obj) {
        return this;
    }

    public final void y9(@NotNull androidx.compose.ui.e eVar) {
        this.f16455s = eVar;
    }

    public final void z9(boolean z10) {
        this.f16456t = z10;
    }
}
