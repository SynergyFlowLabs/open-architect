package org.apache.commons.codec.digest;

/* JADX INFO: loaded from: classes9.dex */
public enum d {
    HMAC_MD5("HmacMD5"),
    HMAC_SHA_1("HmacSHA1"),
    HMAC_SHA_224("HmacSHA224"),
    HMAC_SHA_256("HmacSHA256"),
    HMAC_SHA_384("HmacSHA384"),
    HMAC_SHA_512("HmacSHA512");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f335240a;

    d(String str) {
        this.f335240a = str;
    }

    public String getName() {
        return this.f335240a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f335240a;
    }
}
