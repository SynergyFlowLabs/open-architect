package androidx.media3.extractor.metadata.id3;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class k extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f67576e = "----";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f67579d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f67577b = str;
        this.f67578c = str2;
        this.f67579d = str3;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.f67578c, kVar.f67578c) && Objects.equals(this.f67577b, kVar.f67577b) && Objects.equals(this.f67579d, kVar.f67579d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f67577b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f67578c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f67579d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.i
    public String toString() {
        return this.f67574a + ": domain=" + this.f67577b + ", description=" + this.f67578c;
    }
}
