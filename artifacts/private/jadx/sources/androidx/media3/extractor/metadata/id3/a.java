package androidx.media3.extractor.metadata.id3;

import androidx.annotation.p0;
import androidx.media3.common.q0;
import androidx.media3.common.util.b1;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f67526f = "APIC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f67528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f67529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f67530e;

    public a(String str, @p0 String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f67527b = str;
        this.f67528c = str2;
        this.f67529d = i10;
        this.f67530e = bArr;
    }

    @Override // androidx.media3.common.r0.a
    public void a(q0.b bVar) {
        bVar.K(this.f67530e, this.f67529d);
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f67529d == aVar.f67529d && Objects.equals(this.f67527b, aVar.f67527b) && Objects.equals(this.f67528c, aVar.f67528c) && Arrays.equals(this.f67530e, aVar.f67530e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (527 + this.f67529d) * 31;
        String str = this.f67527b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f67528c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f67530e);
    }

    @Override // androidx.media3.extractor.metadata.id3.i
    public String toString() {
        return this.f67574a + ": mimeType=" + this.f67527b + ", description=" + this.f67528c;
    }
}
