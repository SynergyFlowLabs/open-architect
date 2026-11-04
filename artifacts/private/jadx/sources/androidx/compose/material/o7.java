package androidx.compose.material;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class o7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o7 f24039a = new o7();

    private o7() {
    }

    @Nullable
    public final androidx.compose.animation.core.o<androidx.compose.ui.unit.h> a(@NotNull androidx.compose.foundation.interaction.g gVar) {
        if (!(gVar instanceof androidx.compose.foundation.interaction.l.b) && !(gVar instanceof androidx.compose.foundation.interaction.a.b) && !(gVar instanceof androidx.compose.foundation.interaction.e.a) && !(gVar instanceof androidx.compose.foundation.interaction.c.a)) {
            return null;
        }
        return p7.f24166a;
    }

    @Nullable
    public final androidx.compose.animation.core.o<androidx.compose.ui.unit.h> b(@NotNull androidx.compose.foundation.interaction.g gVar) {
        if (!(gVar instanceof androidx.compose.foundation.interaction.l.b) && !(gVar instanceof androidx.compose.foundation.interaction.a.b)) {
            if (gVar instanceof androidx.compose.foundation.interaction.e.a) {
                return p7.f24168c;
            }
            if (gVar instanceof androidx.compose.foundation.interaction.c.a) {
                return p7.f24167b;
            }
            return null;
        }
        return p7.f24167b;
    }
}
