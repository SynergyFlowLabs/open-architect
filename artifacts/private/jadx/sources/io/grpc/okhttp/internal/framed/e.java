package io.grpc.okhttp.internal.framed;

/* JADX INFO: loaded from: classes13.dex */
public enum e {
    SPDY_SYN_STREAM,
    SPDY_REPLY,
    SPDY_HEADERS,
    HTTP_20_HEADERS;

    public boolean k() {
        return this == SPDY_HEADERS;
    }

    public boolean l() {
        return this == SPDY_REPLY;
    }

    public boolean n() {
        return this == SPDY_REPLY || this == SPDY_HEADERS;
    }

    public boolean o() {
        return this == SPDY_SYN_STREAM;
    }
}
