package io.grpc.internal;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes13.dex */
public final class g0 extends io.grpc.y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f289214a = "dns";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f289215b = io.grpc.k1.c(g0.class.getClassLoader());

    @Override // io.grpc.x1.d
    public String a() {
        return f289214a;
    }

    @Override // io.grpc.x1.d
    public io.grpc.x1 b(URI uri, io.grpc.x1.b bVar) {
        if (!f289214a.equals(uri.getScheme())) {
            return null;
        }
        String str = (String) com.google.common.base.j0.F(uri.getPath(), "targetPath");
        com.google.common.base.j0.y(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
        return new f0(uri.getAuthority(), str.substring(1), bVar, v0.K, com.google.common.base.q0.e(), f289215b);
    }

    @Override // io.grpc.y1
    public Collection<Class<? extends SocketAddress>> c() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // io.grpc.y1
    protected boolean e() {
        return true;
    }

    @Override // io.grpc.y1
    public int f() {
        return 5;
    }
}
