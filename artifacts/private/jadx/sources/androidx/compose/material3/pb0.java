package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class pb0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f31730i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.a0 f31731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final qb0 f31732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.graphics.q3 f31733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final qa0 f31734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Function2<androidx.compose.runtime.c0, Integer, Unit> f31735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.layout.v6 f31736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.layout.q.m f31737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Function2<androidx.compose.runtime.c0, Integer, Unit> f31738h;

    /* JADX WARN: Multi-variable type inference failed */
    public pb0(@NotNull androidx.compose.ui.a0 a0Var, @NotNull qb0 qb0Var, @NotNull androidx.compose.ui.graphics.q3 q3Var, @NotNull qa0 qa0Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull androidx.compose.foundation.layout.v6 v6Var, @NotNull androidx.compose.foundation.layout.q.m mVar, @NotNull Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
        this.f31731a = a0Var;
        this.f31732b = qb0Var;
        this.f31733c = q3Var;
        this.f31734d = qa0Var;
        this.f31735e = function2;
        this.f31736f = v6Var;
        this.f31737g = mVar;
        this.f31738h = function3;
    }

    @NotNull
    public final androidx.compose.foundation.layout.q.m a() {
        return this.f31737g;
    }

    @NotNull
    public final qa0 b() {
        return this.f31734d;
    }

    @NotNull
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> c() {
        return this.f31738h;
    }

    @Nullable
    public final Function2<androidx.compose.runtime.c0, Integer, Unit> d() {
        return this.f31735e;
    }

    @NotNull
    public final androidx.compose.ui.a0 e() {
        return this.f31731a;
    }

    @NotNull
    public final androidx.compose.ui.graphics.q3 f() {
        return this.f31733c;
    }

    @NotNull
    public final qb0 g() {
        return this.f31732b;
    }

    @NotNull
    public final androidx.compose.foundation.layout.v6 h() {
        return this.f31736f;
    }
}
