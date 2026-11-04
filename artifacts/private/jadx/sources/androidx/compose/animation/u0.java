package androidx.compose.animation;

import androidx.compose.runtime.o2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@o2
@i0
public final class u0 implements a1.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13745d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.layout.l f13746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e f13747c;

    public u0(@NotNull androidx.compose.ui.layout.l lVar, @NotNull androidx.compose.ui.e eVar) {
        this.f13746b = lVar;
        this.f13747c = eVar;
    }

    @NotNull
    public final androidx.compose.ui.e a() {
        return this.f13747c;
    }

    @NotNull
    public final androidx.compose.ui.layout.l b() {
        return this.f13746b;
    }
}
