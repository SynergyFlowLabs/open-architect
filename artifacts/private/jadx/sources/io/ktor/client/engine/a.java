package io.ktor.client.engine;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Throwable f294285a;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.f294285a;
    }

    public /* synthetic */ a(Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : th2);
    }

    public a(@Nullable Throwable th2) {
        super("Client already closed");
        this.f294285a = th2;
    }
}
