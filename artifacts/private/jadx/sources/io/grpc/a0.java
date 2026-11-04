package io.grpc;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes13.dex */
@gj.d
@e0("https://github.com/grpc/grpc-java/issues/1704")
public final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final com.google.common.base.a0 f288680c = com.google.common.base.a0.o(AbstractJsonLexerKt.COMMA);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a0 f288681d = a().g(new p.a(), true).g(p.b.f290837a, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f288682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f288683b;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final z f288684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f288685b;

        a(z zVar, boolean z10) {
            this.f288684a = (z) com.google.common.base.j0.F(zVar, "decompressor");
            this.f288685b = z10;
        }
    }

    private a0(z zVar, boolean z10, a0 a0Var) {
        String strB = zVar.B();
        com.google.common.base.j0.e(!strB.contains(","), "Comma is currently not allowed in message encoding");
        int size = a0Var.f288682a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(a0Var.f288682a.containsKey(zVar.B()) ? size : size + 1);
        for (a aVar : a0Var.f288682a.values()) {
            String strB2 = aVar.f288684a.B();
            if (!strB2.equals(strB)) {
                linkedHashMap.put(strB2, new a(aVar.f288684a, aVar.f288685b));
            }
        }
        linkedHashMap.put(strB, new a(zVar, z10));
        this.f288682a = Collections.unmodifiableMap(linkedHashMap);
        this.f288683b = f288680c.k(b()).getBytes(Charset.forName("US-ASCII"));
    }

    public static a0 a() {
        return new a0();
    }

    public static a0 c() {
        return f288681d;
    }

    @e0("https://github.com/grpc/grpc-java/issues/1704")
    public Set<String> b() {
        HashSet hashSet = new HashSet(this.f288682a.size());
        for (Map.Entry<String, a> entry : this.f288682a.entrySet()) {
            if (entry.getValue().f288685b) {
                hashSet.add(entry.getKey());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public Set<String> d() {
        return this.f288682a.keySet();
    }

    byte[] e() {
        return this.f288683b;
    }

    @fj.h
    public z f(String str) {
        a aVar = this.f288682a.get(str);
        if (aVar != null) {
            return aVar.f288684a;
        }
        return null;
    }

    public a0 g(z zVar, boolean z10) {
        return new a0(zVar, z10, this);
    }

    private a0() {
        this.f288682a = new LinkedHashMap(0);
        this.f288683b = new byte[0];
    }
}
