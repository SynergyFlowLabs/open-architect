package androidx.media3.extractor.metadata.icy;

import androidx.annotation.p0;
import androidx.media3.common.q0;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c implements r0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f67523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final String f67524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final String f67525c;

    public c(byte[] bArr, @p0 String str, @p0 String str2) {
        this.f67523a = bArr;
        this.f67524b = str;
        this.f67525c = str2;
    }

    @Override // androidx.media3.common.r0.a
    public void a(q0.b bVar) {
        String str = this.f67524b;
        if (str != null) {
            bVar.r0(str);
        }
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f67523a, ((c) obj).f67523a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f67523a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f67524b, this.f67525c, Integer.valueOf(this.f67523a.length));
    }
}
