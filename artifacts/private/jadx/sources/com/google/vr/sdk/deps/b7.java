package com.google.vr.sdk.deps;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class b7 extends IOException {
    public b7(String str) {
        super(str);
    }

    static b7 a() {
        return new b7("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static b7 b() {
        return new b7("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static b7 c() {
        return new b7("CodedInputStream encountered a malformed varint.");
    }

    static b7 d() {
        return new b7("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public b7(String str, Exception exc) {
        super(str, exc);
    }
}
