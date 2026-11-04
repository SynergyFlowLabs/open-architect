package androidx.media3.common;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f60504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f60505b;

    public e0(w wVar, long j10) {
        androidx.media3.common.util.a.b(wVar.C != null, "format colorInfo must be set");
        androidx.media3.common.util.a.b(wVar.f61768v > 0, "format width must be positive, but is: " + wVar.f61768v);
        androidx.media3.common.util.a.b(wVar.f61769w > 0, "format height must be positive, but is: " + wVar.f61769w);
        this.f60504a = wVar;
        this.f60505b = j10;
    }
}
