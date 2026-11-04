package androidx.media3.extractor.metadata.id3;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class b extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f67531b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f67531b = bArr;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f67574a.equals(bVar.f67574a) && Arrays.equals(this.f67531b, bVar.f67531b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f67574a.hashCode()) * 31) + Arrays.hashCode(this.f67531b);
    }
}
