package androidx.media2.common;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.core.util.o;
import androidx.versionedparcelable.h;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class SubtitleData implements h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f53072t = "SubtitleData";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    long f53073q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    long f53074r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    byte[] f53075s;

    SubtitleData() {
    }

    @NonNull
    public byte[] d() {
        return this.f53075s;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SubtitleData.class == obj.getClass()) {
            SubtitleData subtitleData = (SubtitleData) obj;
            if (this.f53073q == subtitleData.f53073q && this.f53074r == subtitleData.f53074r && Arrays.equals(this.f53075s, subtitleData.f53075s)) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.f53074r;
    }

    public long g() {
        return this.f53073q;
    }

    public int hashCode() {
        return o.b(Long.valueOf(this.f53073q), Long.valueOf(this.f53074r), Integer.valueOf(Arrays.hashCode(this.f53075s)));
    }

    public SubtitleData(long j10, long j11, @NonNull byte[] bArr) {
        this.f53073q = j10;
        this.f53074r = j11;
        this.f53075s = bArr;
    }
}
