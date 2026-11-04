package kotlin.jvm.internal;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.e1(version = com.rabbitmq.tools.jsonrpc.j.f266120g)
public final class z0 implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<?> f312841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f312842b;

    public z0(@NotNull Class<?> jClass, @NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        this.f312841a = jClass;
        this.f312842b = moduleName;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof z0) && Intrinsics.areEqual(l(), ((z0) obj).l());
    }

    @Override // kotlin.reflect.h
    @NotNull
    public Collection<kotlin.reflect.c<?>> f() {
        throw new oj.r();
    }

    public int hashCode() {
        return l().hashCode();
    }

    @Override // kotlin.jvm.internal.t
    @NotNull
    public Class<?> l() {
        return this.f312841a;
    }

    @NotNull
    public String toString() {
        return l().toString() + " (Kotlin reflection is not available)";
    }
}
