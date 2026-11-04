package androidx.media3.extractor.metadata.id3;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class e extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f67545e = "COMM";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f67548d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f67546b = str;
        this.f67547c = str2;
        this.f67548d = str3;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f67547c, eVar.f67547c) && Objects.equals(this.f67546b, eVar.f67546b) && Objects.equals(this.f67548d, eVar.f67548d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f67546b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f67547c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f67548d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.i
    public String toString() {
        return this.f67574a + ": language=" + this.f67546b + ", description=" + this.f67547c + ", text=" + this.f67548d;
    }
}
