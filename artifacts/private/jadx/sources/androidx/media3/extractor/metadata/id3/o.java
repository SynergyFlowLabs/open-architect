package androidx.media3.extractor.metadata.id3;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class o extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f67592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67593c;

    public o(String str, @p0 String str2, String str3) {
        super(str);
        this.f67592b = str2;
        this.f67593c = str3;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f67574a.equals(oVar.f67574a) && Objects.equals(this.f67592b, oVar.f67592b) && Objects.equals(this.f67593c, oVar.f67593c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f67574a.hashCode()) * 31;
        String str = this.f67592b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f67593c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.i
    public String toString() {
        return this.f67574a + ": url=" + this.f67593c;
    }
}
