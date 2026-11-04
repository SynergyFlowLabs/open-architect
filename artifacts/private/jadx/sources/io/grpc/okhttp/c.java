package io.grpc.okhttp;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
abstract class c implements io.grpc.okhttp.internal.framed.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.grpc.okhttp.internal.framed.c f290245a;

    public c(io.grpc.okhttp.internal.framed.c cVar) {
        this.f290245a = (io.grpc.okhttp.internal.framed.c) com.google.common.base.j0.F(cVar, "delegate");
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void A2() throws IOException {
        this.f290245a.A2();
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void C8(boolean z10, int i10, List<io.grpc.okhttp.internal.framed.d> list) throws IOException {
        this.f290245a.C8(z10, i10, list);
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void Da(io.grpc.okhttp.internal.framed.i iVar) throws IOException {
        this.f290245a.Da(iVar);
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void F9(boolean z10, int i10, okio.l lVar, int i11) throws IOException {
        this.f290245a.F9(z10, i10, lVar, i11);
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void M1(int i10, io.grpc.okhttp.internal.framed.a aVar) throws IOException {
        this.f290245a.M1(i10, aVar);
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void Q(int i10, int i11, List<io.grpc.okhttp.internal.framed.d> list) throws IOException {
        this.f290245a.Q(i10, i11, list);
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void Q3(io.grpc.okhttp.internal.framed.i iVar) throws IOException {
        this.f290245a.Q3(iVar);
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public int Tb() {
        return this.f290245a.Tb();
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void U1(int i10, List<io.grpc.okhttp.internal.framed.d> list) throws IOException {
        this.f290245a.U1(i10, list);
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void W(boolean z10, int i10, int i11) throws IOException {
        this.f290245a.W(z10, i10, i11);
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void c0(int i10, long j10) throws IOException {
        this.f290245a.c0(i10, j10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f290245a.close();
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void df(boolean z10, boolean z11, int i10, int i11, List<io.grpc.okhttp.internal.framed.d> list) throws IOException {
        this.f290245a.df(z10, z11, i10, i11, list);
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void flush() throws IOException {
        this.f290245a.flush();
    }

    @Override // io.grpc.okhttp.internal.framed.c
    public void tf(int i10, io.grpc.okhttp.internal.framed.a aVar, byte[] bArr) throws IOException {
        this.f290245a.tf(i10, aVar, bArr);
    }
}
