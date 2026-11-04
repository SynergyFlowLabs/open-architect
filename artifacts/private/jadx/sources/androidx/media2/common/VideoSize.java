package androidx.media2.common;

import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.versionedparcelable.h;

/* JADX INFO: loaded from: classes2.dex */
public class VideoSize implements h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f53081q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f53082r;

    VideoSize() {
    }

    @g0(from = 0)
    public int d() {
        return this.f53082r;
    }

    public boolean equals(@p0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoSize) {
            VideoSize videoSize = (VideoSize) obj;
            if (this.f53081q == videoSize.f53081q && this.f53082r == videoSize.f53082r) {
                return true;
            }
        }
        return false;
    }

    @g0(from = 0)
    public int f() {
        return this.f53081q;
    }

    public int hashCode() {
        int i10 = this.f53082r;
        int i11 = this.f53081q;
        return ((i11 >>> 16) | (i11 << 16)) ^ i10;
    }

    @NonNull
    public String toString() {
        return this.f53081q + "x" + this.f53082r;
    }

    public VideoSize(@g0(from = 0) int i10, @g0(from = 0) int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("width can not be negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("height can not be negative");
        }
        this.f53081q = i10;
        this.f53082r = i11;
    }
}
