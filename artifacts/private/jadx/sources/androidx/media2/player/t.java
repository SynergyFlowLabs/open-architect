package androidx.media2.player;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
public class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f58455c = "TimedMetaData";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f58456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f58457b;

    @b1({b1.a.LIBRARY})
    public t(long j10, byte[] bArr) {
        this.f58456a = j10;
        this.f58457b = bArr;
    }

    public byte[] a() {
        return this.f58457b;
    }

    public long b() {
        return this.f58456a;
    }
}
