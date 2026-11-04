package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 4)
public final class m<T, V extends w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f13184c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final q<T, V> f13185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i f13186b;

    public m(@NotNull q<T, V> qVar, @NotNull i iVar) {
        this.f13185a = qVar;
        this.f13186b = iVar;
    }

    @NotNull
    public final i a() {
        return this.f13186b;
    }

    @NotNull
    public final q<T, V> b() {
        return this.f13185a;
    }

    @NotNull
    public String toString() {
        return "AnimationResult(endReason=" + this.f13186b + ", endState=" + this.f13185a + ')';
    }
}
