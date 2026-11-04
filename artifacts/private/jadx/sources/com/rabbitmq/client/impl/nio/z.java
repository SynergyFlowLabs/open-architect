package com.rabbitmq.client.impl.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes13.dex */
public class z extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SSLEngine f265636i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ByteBuffer f265637j;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f265638a;

        static {
            int[] iArr = new int[SSLEngineResult.Status.values().length];
            f265638a = iArr;
            try {
                iArr[SSLEngineResult.Status.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f265638a[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f265638a[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int i10 = 1 << 4;
                f265638a[SSLEngineResult.Status.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public z(SSLEngine sSLEngine, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ReadableByteChannel readableByteChannel) {
        super(readableByteChannel, byteBuffer);
        this.f265636i = sSLEngine;
        this.f265637j = byteBuffer2;
    }

    @Override // com.rabbitmq.client.impl.nio.f
    protected boolean d() throws IOException {
        if (this.f265565b.hasRemaining()) {
            return true;
        }
        this.f265565b.clear();
        while (true) {
            SSLEngineResult sSLEngineResultUnwrap = this.f265636i.unwrap(this.f265637j, this.f265565b);
            int i10 = a.f265638a[sSLEngineResultUnwrap.getStatus().ordinal()];
            if (i10 == 1) {
                this.f265565b.flip();
                if (this.f265565b.hasRemaining()) {
                    return true;
                }
                this.f265565b.clear();
            } else {
                if (i10 == 2) {
                    throw new SSLException("buffer overflow in read");
                }
                if (i10 != 3) {
                    if (i10 == 4) {
                        throw new SSLException("closed in read");
                    }
                    throw new IllegalStateException("Invalid SSL status: " + sSLEngineResultUnwrap.getStatus());
                }
                this.f265637j.compact();
                if (j.a(this.f265564a, this.f265637j) == 0) {
                    return false;
                }
                this.f265637j.flip();
            }
        }
    }
}
