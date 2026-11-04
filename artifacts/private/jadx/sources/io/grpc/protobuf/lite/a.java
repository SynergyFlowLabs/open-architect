package io.grpc.protobuf.lite;

import com.google.protobuf.b0;
import com.google.protobuf.f3;
import com.google.protobuf.n2;
import fj.h;
import io.grpc.c0;
import io.grpc.n1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes13.dex */
final class a extends InputStream implements c0, n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @h
    private n2 f290848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f3<?> f290849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @h
    private ByteArrayInputStream f290850c;

    a(n2 n2Var, f3<?> f3Var) {
        this.f290848a = n2Var;
        this.f290849b = f3Var;
    }

    @Override // io.grpc.c0
    public int a(OutputStream outputStream) throws IOException {
        n2 n2Var = this.f290848a;
        if (n2Var != null) {
            int iW1 = n2Var.w1();
            this.f290848a.writeTo(outputStream);
            this.f290848a = null;
            return iW1;
        }
        ByteArrayInputStream byteArrayInputStream = this.f290850c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int iA = (int) b.a(byteArrayInputStream, outputStream);
        this.f290850c = null;
        return iA;
    }

    @Override // java.io.InputStream, io.grpc.n1
    public int available() {
        n2 n2Var = this.f290848a;
        if (n2Var != null) {
            return n2Var.w1();
        }
        ByteArrayInputStream byteArrayInputStream = this.f290850c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    n2 b() {
        n2 n2Var = this.f290848a;
        if (n2Var != null) {
            return n2Var;
        }
        throw new IllegalStateException("message not available");
    }

    f3<?> c() {
        return this.f290849b;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f290848a != null) {
            this.f290850c = new ByteArrayInputStream(this.f290848a.H0());
            int i10 = 7 >> 0;
            this.f290848a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f290850c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        n2 n2Var = this.f290848a;
        if (n2Var != null) {
            int iW1 = n2Var.w1();
            if (iW1 == 0) {
                this.f290848a = null;
                this.f290850c = null;
                return -1;
            }
            if (i11 >= iW1) {
                b0 b0VarO1 = b0.o1(bArr, i10, iW1);
                this.f290848a.Nb(b0VarO1);
                b0VarO1.e1();
                b0VarO1.Z();
                this.f290848a = null;
                this.f290850c = null;
                return iW1;
            }
            this.f290850c = new ByteArrayInputStream(this.f290848a.H0());
            this.f290848a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f290850c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i10, i11);
        }
        return -1;
    }
}
