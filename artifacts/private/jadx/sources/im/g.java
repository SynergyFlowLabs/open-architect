package im;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes13.dex */
public class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f287252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TreeMap<String, String> f287253b = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    @Override // im.c
    public void a(String str, String str2) {
        this.f287253b.put(str, str2);
    }

    @Override // im.c
    public void f(byte[] bArr) {
        this.f287252a = bArr;
    }

    @Override // im.f
    public String g(String str) {
        String str2 = this.f287253b.get(str);
        return str2 == null ? "" : str2;
    }

    @Override // im.f
    public byte[] getContent() {
        return this.f287252a;
    }

    @Override // im.f
    public boolean i(String str) {
        return this.f287253b.containsKey(str);
    }

    @Override // im.f
    public Iterator<String> j() {
        return Collections.unmodifiableSet(this.f287253b.keySet()).iterator();
    }
}
