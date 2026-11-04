package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41181c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u f41182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.s f41183b;

    public w(@NotNull u uVar, @NotNull androidx.compose.ui.unit.s sVar) {
        this.f41182a = uVar;
        this.f41183b = sVar;
    }

    @NotNull
    public final androidx.compose.ui.unit.s a() {
        return this.f41183b;
    }

    @NotNull
    public final u b() {
        return this.f41182a;
    }
}
