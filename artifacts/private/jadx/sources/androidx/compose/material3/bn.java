package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class bn {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f26324g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.a0 f26325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f26327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f26328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.layout.v6 f26329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f26330f;

    public /* synthetic */ bn(androidx.compose.ui.a0 a0Var, long j10, long j11, float f10, androidx.compose.foundation.layout.v6 v6Var, pj.n nVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(a0Var, j10, j11, f10, v6Var, nVar);
    }

    public final long a() {
        return this.f26326b;
    }

    @NotNull
    public final pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> b() {
        return this.f26330f;
    }

    public final long c() {
        return this.f26327c;
    }

    @NotNull
    public final androidx.compose.ui.a0 d() {
        return this.f26325a;
    }

    public final float e() {
        return this.f26328d;
    }

    @NotNull
    public final androidx.compose.foundation.layout.v6 f() {
        return this.f26329e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private bn(androidx.compose.ui.a0 a0Var, long j10, long j11, float f10, androidx.compose.foundation.layout.v6 v6Var, pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
        this.f26325a = a0Var;
        this.f26326b = j10;
        this.f26327c = j11;
        this.f26328d = f10;
        this.f26329e = v6Var;
        this.f26330f = nVar;
    }

    public /* synthetic */ bn(androidx.compose.ui.a0 a0Var, long j10, long j11, float f10, androidx.compose.foundation.layout.v6 v6Var, pj.n nVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? androidx.compose.ui.a0.E : a0Var, j10, j11, f10, v6Var, nVar, null);
    }
}
