package okhttp3.internal.http;

import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f334185a = new f();

    private f() {
    }

    @n
    public static final boolean b(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.areEqual(method, "GET") || Intrinsics.areEqual(method, "HEAD")) ? false : true;
    }

    @n
    public static final boolean e(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.areEqual(method, "POST") || Intrinsics.areEqual(method, "PUT") || Intrinsics.areEqual(method, "PATCH") || Intrinsics.areEqual(method, "PROPPATCH") || Intrinsics.areEqual(method, "REPORT");
    }

    public final boolean a(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.areEqual(method, "POST") || Intrinsics.areEqual(method, "PATCH") || Intrinsics.areEqual(method, "PUT") || Intrinsics.areEqual(method, "DELETE") || Intrinsics.areEqual(method, "MOVE");
    }

    public final boolean c(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return !Intrinsics.areEqual(method, "PROPFIND");
    }

    public final boolean d(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.areEqual(method, "PROPFIND");
    }
}
