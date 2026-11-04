package io.ktor.network.sockets;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.SocketAddress;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class g1 extends i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final a f296227b = new a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private static final Class<?> f296228c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SocketAddress f296229a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Class<?> b() {
            Class<?> cls = g1.f296228c;
            if (cls != null) {
                return cls;
            }
            throw new IllegalStateException("Unix domain sockets are unsupported before Java 16.");
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class<?> cls = null;
        try {
            cls = Class.forName(j0.f296268a);
        } catch (ClassNotFoundException unused) {
        }
        f296228c = cls;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(@NotNull SocketAddress address) {
        super(null);
        Intrinsics.checkNotNullParameter(address, "address");
        this.f296229a = address;
        if (!Intrinsics.areEqual(a().getClass().getName(), j0.f296268a)) {
            throw new IllegalStateException("address should be java.net.UnixDomainSocketAddress");
        }
    }

    public static /* synthetic */ g1 e(g1 g1Var, String str, int i10, Object obj) throws NoSuchMethodException {
        if ((i10 & 1) != 0) {
            str = g1Var.f();
        }
        return g1Var.d(str);
    }

    @Override // io.ktor.network.sockets.i0
    @NotNull
    public SocketAddress a() {
        return this.f296229a;
    }

    @NotNull
    public final String c() {
        return f();
    }

    @NotNull
    public final g1 d(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return new g1(path);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(g1.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.ktor.network.sockets.UnixSocketAddress");
        return Intrinsics.areEqual(a(), ((g1) obj).a());
    }

    @NotNull
    public final String f() throws NoSuchMethodException {
        Method method = f296227b.b().getMethod("getPath", null);
        Intrinsics.checkNotNullExpressionValue(method, "getMethod(...)");
        return method.invoke(a(), null).toString();
    }

    public int hashCode() {
        return a().hashCode();
    }

    @NotNull
    public String toString() {
        return a().toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g1(@NotNull String path) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(path, "path");
        Object objInvoke = f296227b.b().getMethod("of", String.class).invoke(null, path);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type java.net.SocketAddress");
        this((SocketAddress) objInvoke);
    }
}
