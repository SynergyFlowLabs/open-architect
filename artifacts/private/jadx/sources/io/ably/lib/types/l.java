package io.ably.lib.types;

import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, String> f288105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k[] f288106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f288107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f288108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f288109e = true;

    @Deprecated
    public static l a(String str) throws a {
        return b(io.ably.lib.util.b.a(str));
    }

    @Deprecated
    public static l b(byte[] bArr) throws a {
        return h(bArr);
    }

    public static l g(String str) throws a {
        return h(io.ably.lib.util.b.a(str));
    }

    public static l h(byte[] bArr) throws a {
        l lVar = new l();
        lVar.f288108d = true;
        lVar.f288107c = io.ably.lib.util.e.j(bArr);
        return lVar;
    }

    public synchronized io.ably.lib.util.e.b c() throws a {
        io.ably.lib.util.e.b bVarA;
        bVarA = io.ably.lib.util.e.a(this.f288107c);
        if (this.f288107c == null) {
            this.f288107c = bVarA;
        }
        return bVarA;
    }

    public int d() {
        int iL = 0;
        for (k kVar : this.f288106b) {
            iL |= kVar.l();
        }
        return iL;
    }

    public boolean e() {
        k[] kVarArr = this.f288106b;
        return (kVarArr == null || kVarArr.length == 0) ? false : true;
    }

    public boolean f() {
        Map<String, String> map = this.f288105a;
        return (map == null || map.isEmpty()) ? false : true;
    }
}
