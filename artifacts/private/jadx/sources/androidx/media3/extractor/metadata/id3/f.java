package androidx.media3.extractor.metadata.id3;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class f extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f67549f = "GEOB";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f67552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f67553e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f67550b = str;
        this.f67551c = str2;
        this.f67552d = str3;
        this.f67553e = bArr;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f67550b, fVar.f67550b) && Objects.equals(this.f67551c, fVar.f67551c) && Objects.equals(this.f67552d, fVar.f67552d) && Arrays.equals(this.f67553e, fVar.f67553e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f67550b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f67551c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f67552d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f67553e);
    }

    @Override // androidx.media3.extractor.metadata.id3.i
    public String toString() {
        return this.f67574a + ": mimeType=" + this.f67550b + ", filename=" + this.f67551c + ", description=" + this.f67552d;
    }
}
