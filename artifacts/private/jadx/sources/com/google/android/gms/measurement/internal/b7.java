package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes4.dex */
final class b7 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f109780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f109781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f109782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ d7 f109783d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b7(d7 d7Var, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        Objects.requireNonNull(d7Var);
        this.f109783d = d7Var;
        com.google.android.gms.common.internal.w.r(str);
        long andIncrement = d7.f109876l.getAndIncrement();
        this.f109780a = andIncrement;
        this.f109782c = str;
        this.f109781b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            d7Var.f110184a.a().o().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        b7 b7Var = (b7) obj;
        boolean z10 = b7Var.f109781b;
        boolean z11 = this.f109781b;
        if (z11 != z10) {
            return !z11 ? 1 : -1;
        }
        long j10 = this.f109780a;
        long j11 = b7Var.f109780a;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f109783d.f110184a.a().p().b("Two tasks share the same index. index", Long.valueOf(j10));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th2) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.f109783d.f110184a.a().o().b(this.f109782c, th2);
        if ((th2 instanceof z6) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
        }
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b7(d7 d7Var, Callable callable, boolean z10, String str) {
        super(callable);
        Objects.requireNonNull(d7Var);
        this.f109783d = d7Var;
        com.google.android.gms.common.internal.w.r("Task exception on worker thread");
        long andIncrement = d7.f109876l.getAndIncrement();
        this.f109780a = andIncrement;
        this.f109782c = "Task exception on worker thread";
        this.f109781b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            d7Var.f110184a.a().o().a("Tasks index overflow");
        }
    }
}
