package com.google.protobuf.nano;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class h extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f126207a = -1616151763072450476L;

    public h(String str) {
        super(str);
    }

    static h a() {
        return new h("Protocol message end-group tag did not match expected tag.");
    }

    static h b() {
        return new h("Protocol message contained an invalid tag (zero).");
    }

    static h c() {
        return new h("Protocol message tag had invalid wire type.");
    }

    static h d() {
        return new h("CodedInputStream encountered a malformed varint.");
    }

    static h e() {
        return new h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static h f() {
        return new h("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static h g() {
        return new h("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static h h() {
        return new h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
