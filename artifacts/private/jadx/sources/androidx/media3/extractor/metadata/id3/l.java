package androidx.media3.extractor.metadata.id3;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class l extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f67580g = "MLLT";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f67582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f67583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f67584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f67585f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f67581b = i10;
        this.f67582c = i11;
        this.f67583d = i12;
        this.f67584e = iArr;
        this.f67585f = iArr2;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f67581b == lVar.f67581b && this.f67582c == lVar.f67582c && this.f67583d == lVar.f67583d && Arrays.equals(this.f67584e, lVar.f67584e) && Arrays.equals(this.f67585f, lVar.f67585f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f67581b) * 31) + this.f67582c) * 31) + this.f67583d) * 31) + Arrays.hashCode(this.f67584e)) * 31) + Arrays.hashCode(this.f67585f);
    }
}
