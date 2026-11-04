package io.grpc;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes13.dex */
@gj.d
@e0("https://github.com/grpc/grpc-java/issues/1704")
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final t f290972b = new t(new p.a(), p.b.f290837a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap<String, s> f290973a = new ConcurrentHashMap();

    @com.google.common.annotations.e
    t(s... sVarArr) {
        for (s sVar : sVarArr) {
            this.f290973a.put(sVar.B(), sVar);
        }
    }

    public static t a() {
        return f290972b;
    }

    public static t c() {
        return new t(new s[0]);
    }

    @fj.h
    public s b(String str) {
        return this.f290973a.get(str);
    }

    public void d(s sVar) {
        String strB = sVar.B();
        com.google.common.base.j0.e(!strB.contains(","), "Comma is currently not allowed in message encoding");
        this.f290973a.put(strB, sVar);
    }
}
