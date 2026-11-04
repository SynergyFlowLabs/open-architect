package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class hq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f28227g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.a0 f28228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f28229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f28230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f28231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.layout.v6 f28232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f28233f;

    public /* synthetic */ hq(androidx.compose.ui.a0 a0Var, long j10, long j11, pj.n nVar, androidx.compose.foundation.layout.v6 v6Var, pj.n nVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(a0Var, j10, j11, nVar, v6Var, nVar2);
    }

    public final long a() {
        return this.f28229b;
    }

    @NotNull
    public final pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> b() {
        return this.f28233f;
    }

    public final long c() {
        return this.f28230c;
    }

    @Nullable
    public final pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> d() {
        return this.f28231d;
    }

    @NotNull
    public final androidx.compose.ui.a0 e() {
        return this.f28228a;
    }

    @NotNull
    public final androidx.compose.foundation.layout.v6 f() {
        return this.f28232e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private hq(androidx.compose.ui.a0 a0Var, long j10, long j11, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, androidx.compose.foundation.layout.v6 v6Var, pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2) {
        this.f28228a = a0Var;
        this.f28229b = j10;
        this.f28230c = j11;
        this.f28231d = nVar;
        this.f28232e = v6Var;
        this.f28233f = nVar2;
    }

    public /* synthetic */ hq(androidx.compose.ui.a0 a0Var, long j10, long j11, pj.n nVar, androidx.compose.foundation.layout.v6 v6Var, pj.n nVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var, j10, j11, nVar, v6Var, nVar2, null);
    }
}
