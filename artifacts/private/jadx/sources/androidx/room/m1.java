package androidx.room;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 implements w3.e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w3.e.c f75006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Executor f75007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b2.g f75008c;

    public m1(@NotNull w3.e.c delegate, @NotNull Executor queryCallbackExecutor, @NotNull b2.g queryCallback) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(queryCallbackExecutor, "queryCallbackExecutor");
        Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
        this.f75006a = delegate;
        this.f75007b = queryCallbackExecutor;
        this.f75008c = queryCallback;
    }

    @Override // w3.e.c
    @NotNull
    public w3.e a(@NotNull w3.e.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new l1(this.f75006a.a(configuration), this.f75007b, this.f75008c);
    }
}
