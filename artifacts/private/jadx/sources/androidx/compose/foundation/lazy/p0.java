package androidx.compose.foundation.lazy;

import androidx.compose.ui.layout.i2;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public abstract class p0 extends androidx.compose.foundation.lazy.layout.b1<n0> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f17696f = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final w f17697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.w0 f17698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f17699e;

    public /* synthetic */ p0(long j10, boolean z10, w wVar, androidx.compose.foundation.lazy.layout.w0 w0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, z10, wVar, w0Var);
    }

    public static /* synthetic */ n0 f(p0 p0Var, int i10, long j10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAndMeasure-0kLqBqw");
        }
        if ((i11 & 2) != 0) {
            j10 = p0Var.f17699e;
        }
        return p0Var.e(i10, j10);
    }

    @NotNull
    public abstract n0 c(int i10, @NotNull Object obj, @Nullable Object obj2, @NotNull List<? extends i2> list, long j10);

    @Override // androidx.compose.foundation.lazy.layout.b1
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public n0 a(int i10, int i11, int i12, long j10) {
        return e(i10, j10);
    }

    @NotNull
    public final n0 e(int i10, long j10) {
        return c(i10, this.f17697c.d(i10), this.f17697c.f(i10), b(this.f17698d, i10, j10), j10);
    }

    public final long g() {
        return this.f17699e;
    }

    @NotNull
    public final androidx.collection.f0 h() {
        return this.f17697c.e();
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.o0 i() {
        return this.f17697c.b();
    }

    public final void j(int i10) {
        this.f17698d.g8(i10);
    }

    private p0(long j10, boolean z10, w wVar, androidx.compose.foundation.lazy.layout.w0 w0Var) {
        this.f17697c = wVar;
        this.f17698d = w0Var;
        this.f17699e = androidx.compose.ui.unit.c.b(0, z10 ? androidx.compose.ui.unit.b.p(j10) : Integer.MAX_VALUE, 0, z10 ? Integer.MAX_VALUE : androidx.compose.ui.unit.b.o(j10), 5, null);
    }
}
