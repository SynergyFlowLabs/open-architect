package androidx.compose.foundation.text;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
public final class p3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f20761c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.v0 f20762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final pj.n<String, androidx.compose.runtime.c0, Integer, Unit> f20763b;

    /* JADX WARN: Multi-variable type inference failed */
    public p3(@NotNull androidx.compose.ui.text.v0 v0Var, @NotNull pj.n<? super String, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
        this.f20762a = v0Var;
        this.f20763b = nVar;
    }

    @NotNull
    public final pj.n<String, androidx.compose.runtime.c0, Integer, Unit> a() {
        return this.f20763b;
    }

    @NotNull
    public final androidx.compose.ui.text.v0 b() {
        return this.f20762a;
    }
}
