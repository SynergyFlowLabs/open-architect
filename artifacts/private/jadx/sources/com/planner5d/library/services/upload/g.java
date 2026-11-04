package com.planner5d.library.services.upload;

import androidx.compose.runtime.internal.w0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@w0(parameters = 0)
@ij.f
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f225034c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f225035a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicReference<com.planner5d.library.database.model.spaces.documents.a> f225036b = new AtomicReference<>();

    @ij.a
    public g() {
    }

    @Nullable
    public final com.planner5d.library.database.model.spaces.documents.a a() {
        return this.f225036b.get();
    }

    public final boolean b() {
        return this.f225035a.get();
    }

    public final boolean c(boolean z10) {
        return this.f225035a.getAndSet(z10);
    }

    public final void d(@Nullable com.planner5d.library.database.model.spaces.documents.a aVar) {
        this.f225036b.set(aVar);
    }

    public final void e(boolean z10) {
        this.f225035a.set(z10);
    }
}
