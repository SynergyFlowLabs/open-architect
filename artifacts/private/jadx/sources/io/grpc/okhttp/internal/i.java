package io.grpc.okhttp.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public enum i {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f290648a;

    i(String str) {
        this.f290648a = str;
    }

    public static i b(String str) throws IOException {
        i iVar = HTTP_1_0;
        if (str.equals(iVar.f290648a)) {
            return iVar;
        }
        i iVar2 = HTTP_1_1;
        if (str.equals(iVar2.f290648a)) {
            return iVar2;
        }
        i iVar3 = HTTP_2;
        if (str.equals(iVar3.f290648a)) {
            return iVar3;
        }
        i iVar4 = SPDY_3;
        if (str.equals(iVar4.f290648a)) {
            return iVar4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f290648a;
    }
}
