package io.ktor.client.plugins.sse;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final io.ktor.client.statement.c f295078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Throwable f295079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f295080c;

    public j0() {
        this(null, null, null, 7, null);
    }

    @Nullable
    public final io.ktor.client.statement.c a() {
        return this.f295078a;
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.f295079b;
    }

    @Override // java.lang.Throwable
    @Nullable
    public String getMessage() {
        return this.f295080c;
    }

    public /* synthetic */ j0(io.ktor.client.statement.c cVar, Throwable th2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : cVar, (i10 & 2) != 0 ? null : th2, (i10 & 4) != 0 ? null : str);
    }

    public j0(@Nullable io.ktor.client.statement.c cVar, @Nullable Throwable th2, @Nullable String str) {
        this.f295078a = cVar;
        this.f295079b = th2;
        this.f295080c = str;
    }
}
