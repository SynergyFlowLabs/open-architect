package androidx.media3.extractor.metadata.id3;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class m extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f67586d = "PRIV";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f67588c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f67587b = str;
        this.f67588c = bArr;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f67587b, mVar.f67587b) && Arrays.equals(this.f67588c, mVar.f67588c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f67587b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f67588c);
    }

    @Override // androidx.media3.extractor.metadata.id3.i
    public String toString() {
        return this.f67574a + ": owner=" + this.f67587b;
    }
}
