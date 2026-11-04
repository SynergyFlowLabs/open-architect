package io.ably.lib.types;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f288042d = "RecoveryKeyContext";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f288043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f288044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, String> f288045c;

    public j0(String str, long j10, Map<String, String> map) {
        HashMap map2 = new HashMap();
        this.f288045c = map2;
        this.f288043a = str;
        this.f288044b = j10;
        map2.putAll(map);
    }

    public static j0 a(String str) {
        try {
            return (j0) io.ably.lib.util.p.f288250c.r(str, j0.class);
        } catch (com.google.gson.v e10) {
            io.ably.lib.util.k.d(f288042d, "Cannot create recovery key from json: " + e10.getMessage());
            return null;
        }
    }

    public String b() {
        return io.ably.lib.util.p.f288250c.D(this);
    }

    public Map<String, String> c() {
        return this.f288045c;
    }

    public String d() {
        return this.f288043a;
    }

    public long e() {
        return this.f288044b;
    }
}
