package io.grpc;

import io.sentry.k9;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@e0("https://github.com/grpc/grpc-java/issues/1770")
public final class d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e0("https://github.com/grpc/grpc-java/issues/6138")
    public static final io.grpc.a.c<String> f288712d = io.grpc.a.c.a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<SocketAddress> f288713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.grpc.a f288714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f288715c;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @e0("https://github.com/grpc/grpc-java/issues/4972")
    public @interface a {
    }

    public d0(List<SocketAddress> list) {
        this(list, io.grpc.a.f288673c);
    }

    public List<SocketAddress> a() {
        return this.f288713a;
    }

    public io.grpc.a b() {
        return this.f288714b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f288713a.size() != d0Var.f288713a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f288713a.size(); i10++) {
            if (!this.f288713a.get(i10).equals(d0Var.f288713a.get(i10))) {
                return false;
            }
        }
        return this.f288714b.equals(d0Var.f288714b);
    }

    public int hashCode() {
        return this.f288715c;
    }

    public String toString() {
        return "[" + this.f288713a + "/" + this.f288714b + "]";
    }

    public d0(List<SocketAddress> list, io.grpc.a aVar) {
        com.google.common.base.j0.e(!list.isEmpty(), "addrs is empty");
        List<SocketAddress> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f288713a = listUnmodifiableList;
        this.f288714b = (io.grpc.a) com.google.common.base.j0.F(aVar, k9.b.f305803j);
        this.f288715c = listUnmodifiableList.hashCode();
    }

    public d0(SocketAddress socketAddress) {
        this(socketAddress, io.grpc.a.f288673c);
    }

    public d0(SocketAddress socketAddress, io.grpc.a aVar) {
        this((List<SocketAddress>) Collections.singletonList(socketAddress), aVar);
    }
}
