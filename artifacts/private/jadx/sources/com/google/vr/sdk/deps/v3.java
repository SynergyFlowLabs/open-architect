package com.google.vr.sdk.deps;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class v3 extends IOException {
    public v3(String str) {
        super(str);
    }

    static v3 a() {
        return new v3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static v3 b() {
        return new v3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static v3 c() {
        return new v3("CodedInputStream encountered a malformed varint.");
    }

    static v3 d() {
        return new v3("Protocol message end-group tag did not match expected tag.");
    }

    static w3 e() {
        return new w3("Protocol message tag had invalid wire type.");
    }

    static v3 f() {
        return new v3("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static v3 g() {
        return new v3("Failed to parse the message.");
    }

    static v3 h() {
        return new v3("Protocol message had invalid UTF-8.");
    }
}
