package kotlinx.coroutines.debug.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final kotlin.coroutines.jvm.internal.e f314004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final StackTraceElement f314005b;

    public s(@Nullable kotlin.coroutines.jvm.internal.e eVar, @NotNull StackTraceElement stackTraceElement) {
        this.f314004a = eVar;
        this.f314005b = stackTraceElement;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @Nullable
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        return this.f314004a;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @NotNull
    public StackTraceElement getStackTraceElement() {
        return this.f314005b;
    }
}
