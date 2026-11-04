package androidx.room;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 implements w3.e, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w3.e f74999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Executor f75000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b2.g f75001c;

    public l1(@NotNull w3.e delegate, @NotNull Executor queryCallbackExecutor, @NotNull b2.g queryCallback) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(queryCallbackExecutor, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
        this.f74999a = delegate;
        this.f75000b = queryCallbackExecutor;
        this.f75001c = queryCallback;
    }

    @Override // w3.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f74999a.close();
    }

    @Override // androidx.room.p
    @NotNull
    public w3.e e() {
        return this.f74999a;
    }

    @Override // w3.e
    @Nullable
    public String getDatabaseName() {
        return this.f74999a.getDatabaseName();
    }

    @Override // w3.e
    @NotNull
    public w3.d getReadableDatabase() {
        return new k1(e().getReadableDatabase(), this.f75000b, this.f75001c);
    }

    @Override // w3.e
    @NotNull
    public w3.d getWritableDatabase() {
        return new k1(e().getWritableDatabase(), this.f75000b, this.f75001c);
    }

    @Override // w3.e
    @androidx.annotation.w0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f74999a.setWriteAheadLoggingEnabled(z10);
    }
}
