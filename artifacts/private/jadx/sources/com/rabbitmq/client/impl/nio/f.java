package com.rabbitmq.client.impl.nio;

import com.rabbitmq.client.impl.s0;
import com.rabbitmq.client.l0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: loaded from: classes13.dex */
public class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f265563h = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ReadableByteChannel f265564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final ByteBuffer f265565b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f265567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f265568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f265569f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f265566c = new int[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f265570g = 0;

    public f(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) {
        this.f265564a = readableByteChannel;
        this.f265565b = byteBuffer;
    }

    private void a() throws IOException {
        l0 l0Var;
        byte[] bArr = {77, 81, 80};
        int i10 = 0;
        while (d() && i10 < 3) {
            int iC = c();
            if (iC != bArr[i10]) {
                throw new l0("Invalid AMQP protocol header from server: expected character " + ((int) bArr[i10]) + ", got " + iC);
            }
            i10++;
        }
        if (i10 != 3) {
            throw new l0("Invalid AMQP protocol header from server: read only " + (i10 + 1) + " byte(s) instead of 4");
        }
        int[] iArr = new int[4];
        for (int i11 = 0; i11 < 4; i11++) {
            if (!d()) {
                throw new l0("Invalid AMQP protocol header from server");
            }
            iArr[i11] = c();
        }
        if (iArr[0] == 1 && iArr[1] == 1 && iArr[2] == 8 && iArr[3] == 0) {
            l0Var = new l0("AMQP protocol version mismatch; we are version 0-9-1, server is 0-8");
        } else {
            String str = "";
            for (int i12 = 0; i12 < 4; i12++) {
                if (i12 != 0) {
                    str = str + ",";
                }
                str = str + iArr[i12];
            }
            l0Var = new l0("AMQP protocol version mismatch; we are version 0-9-1, server sent signature " + str);
        }
        throw l0Var;
    }

    private int c() {
        return this.f265565b.get() & 255;
    }

    public s0 b() throws IOException {
        while (d()) {
            int i10 = this.f265570g;
            if (i10 == 0) {
                int iC = c();
                this.f265567d = iC;
                if (iC == 65) {
                    a();
                }
            } else if (i10 == 1) {
                this.f265566c[0] = c();
            } else if (i10 == 2) {
                this.f265568e = (this.f265566c[0] << 8) + c();
            } else if (i10 == 3) {
                this.f265566c[0] = c();
            } else if (i10 == 4) {
                this.f265566c[1] = c();
            } else if (i10 == 5) {
                this.f265566c[2] = c();
            } else {
                if (i10 != 6) {
                    if (i10 >= 7) {
                        byte[] bArr = this.f265569f;
                        if (i10 < bArr.length + 7) {
                            bArr[i10 - 7] = (byte) c();
                        }
                    }
                    if (i10 != this.f265569f.length + 7) {
                        throw new IllegalStateException("Number of read bytes incorrect: " + this.f265570g);
                    }
                    int iC2 = c();
                    if (iC2 == 206) {
                        this.f265570g = 0;
                        return new s0(this.f265567d, this.f265568e, this.f265569f);
                    }
                    throw new l0("Bad frame end marker: " + iC2);
                }
                int[] iArr = this.f265566c;
                this.f265569f = new byte[(iArr[0] << 24) + (iArr[1] << 16) + (iArr[2] << 8) + c()];
            }
            this.f265570g++;
        }
        return null;
    }

    protected boolean d() throws IOException {
        if (this.f265565b.hasRemaining()) {
            return true;
        }
        this.f265565b.clear();
        int iA = j.a(this.f265564a, this.f265565b);
        this.f265565b.flip();
        return iA > 0;
    }
}
