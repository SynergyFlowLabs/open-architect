package com.planner5d.library.services.download;

import androidx.compose.runtime.internal.w0;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
@ij.f
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f224275b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f224276a = new AtomicBoolean(false);

    @ij.a
    public d() {
    }

    public final boolean a() {
        return this.f224276a.get();
    }

    public final boolean b(boolean z10) {
        return this.f224276a.getAndSet(z10);
    }

    public final void c(boolean z10) {
        this.f224276a.set(z10);
    }
}
