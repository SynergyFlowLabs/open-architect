package androidx.work.impl.utils;

import androidx.annotation.b1;
import androidx.work.l0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.work.impl.u f77161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.work.impl.a0 f77162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f77163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f77164d;

    public a0(@NotNull androidx.work.impl.u processor, @NotNull androidx.work.impl.a0 token, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f77161a = processor;
        this.f77162b = token;
        this.f77163c = z10;
        this.f77164d = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zT = this.f77163c ? this.f77161a.t(this.f77162b, this.f77164d) : this.f77161a.u(this.f77162b, this.f77164d);
        androidx.work.v.e().a(androidx.work.v.i("StopWorkRunnable"), "StopWorkRunnable for " + this.f77162b.a().f() + "; Processor.stopWork = " + zT);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(@NotNull androidx.work.impl.u processor, @NotNull androidx.work.impl.a0 token, boolean z10) {
        this(processor, token, z10, l0.f77348o);
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(token, "token");
    }
}
