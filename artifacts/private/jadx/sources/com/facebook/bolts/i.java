package com.facebook.bolts;

import java.io.Closeable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Runnable f99343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f99344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private k f99345c;

    public i(@NotNull k tokenSource, @Nullable Runnable runnable) {
        Intrinsics.checkNotNullParameter(tokenSource, "tokenSource");
        this.f99343a = runnable;
        this.f99345c = tokenSource;
    }

    private final void b() {
        if (this.f99344b) {
            throw new IllegalStateException("Object already closed");
        }
    }

    public final void a() {
        synchronized (this) {
            b();
            Runnable runnable = this.f99343a;
            if (runnable != null) {
                runnable.run();
            }
            close();
            Unit unit = Unit.f312394a;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.f99344b) {
                return;
            }
            this.f99344b = true;
            k kVar = this.f99345c;
            if (kVar != null) {
                kVar.q(this);
            }
            this.f99345c = null;
            this.f99343a = null;
            Unit unit = Unit.f312394a;
        }
    }
}
