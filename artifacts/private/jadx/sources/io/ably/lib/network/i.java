package io.ably.lib.network;

import java.util.Arrays;
import lombok.Generated;

/* JADX INFO: loaded from: classes13.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f287434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f287435b;

    @Generated
    public i(String str, byte[] bArr) {
        this.f287434a = str;
        this.f287435b = bArr;
    }

    @Generated
    protected boolean a(Object obj) {
        return obj instanceof i;
    }

    @Generated
    public byte[] b() {
        return this.f287435b;
    }

    @Generated
    public String c() {
        return this.f287434a;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!iVar.a(this)) {
            return false;
        }
        String strC = c();
        String strC2 = iVar.c();
        if (strC != null ? strC.equals(strC2) : strC2 == null) {
            return Arrays.equals(b(), iVar.b());
        }
        return false;
    }

    @Generated
    public int hashCode() {
        String strC = c();
        return (((strC == null ? 43 : strC.hashCode()) + 59) * 59) + Arrays.hashCode(b());
    }

    @Generated
    public String toString() {
        return "HttpBody(contentType=" + c() + ", content=" + Arrays.toString(b()) + ")";
    }
}
