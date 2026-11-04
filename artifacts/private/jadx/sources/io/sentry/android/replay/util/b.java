package io.sentry.android.replay.util;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.text.p3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class b implements q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f305000c = p3.f42048g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p3 f305001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f305002b;

    public b(@NotNull p3 layout, boolean z10) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f305001a = layout;
        this.f305002b = z10;
    }

    @Override // io.sentry.android.replay.util.q
    public int a(int i10) {
        return kotlin.math.b.L0(this.f305001a.w(i10));
    }

    @Override // io.sentry.android.replay.util.q
    public int b(int i10) {
        return this.f305001a.v(i10);
    }

    @Override // io.sentry.android.replay.util.q
    public float c(int i10, int i11) {
        float fJ = this.f305001a.j(i11, true);
        return (this.f305002b || g() != 1) ? fJ : fJ - this.f305001a.t(i10);
    }

    @Override // io.sentry.android.replay.util.q
    @Nullable
    public Integer d() {
        return null;
    }

    @Override // io.sentry.android.replay.util.q
    public int e(int i10) {
        return kotlin.math.b.L0(this.f305001a.n(i10));
    }

    @Override // io.sentry.android.replay.util.q
    public int f(int i10) {
        return this.f305001a.p(i10, true);
    }

    @Override // io.sentry.android.replay.util.q
    public int g() {
        return this.f305001a.o();
    }

    @Override // io.sentry.android.replay.util.q
    public int h(int i10) {
        return this.f305001a.E(i10) ? 1 : 0;
    }

    @NotNull
    public final p3 i() {
        return this.f305001a;
    }
}
