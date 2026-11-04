package androidx.compose.material3.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m2 f29018a = new m2();

    private m2() {
    }

    @Nullable
    public final androidx.compose.animation.core.o<androidx.compose.ui.unit.h> a(@NotNull androidx.compose.foundation.interaction.g gVar) {
        if (!(gVar instanceof androidx.compose.foundation.interaction.l.b) && !(gVar instanceof androidx.compose.foundation.interaction.a.b) && !(gVar instanceof androidx.compose.foundation.interaction.e.a) && !(gVar instanceof androidx.compose.foundation.interaction.c.a)) {
            return null;
        }
        return n2.f29022b;
    }

    @Nullable
    public final androidx.compose.animation.core.o<androidx.compose.ui.unit.h> b(@NotNull androidx.compose.foundation.interaction.g gVar) {
        if (!(gVar instanceof androidx.compose.foundation.interaction.l.b) && !(gVar instanceof androidx.compose.foundation.interaction.a.b)) {
            if (gVar instanceof androidx.compose.foundation.interaction.e.a) {
                return n2.f29024d;
            }
            if (gVar instanceof androidx.compose.foundation.interaction.c.a) {
                return n2.f29023c;
            }
            return null;
        }
        return n2.f29023c;
    }
}
