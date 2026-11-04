package androidx.media2.exoplayer.external;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0 f57728b = new v0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57729a;

    public v0(int tunnelingAudioSessionId) {
        this.f57729a = tunnelingAudioSessionId;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && v0.class == obj.getClass() && this.f57729a == ((v0) obj).f57729a;
    }

    public int hashCode() {
        return this.f57729a;
    }
}
