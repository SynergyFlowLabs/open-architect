package io.grpc.okhttp.internal.framed;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import okio.l;

/* JADX INFO: loaded from: classes13.dex */
public interface c extends Closeable {
    void A2() throws IOException;

    void C8(boolean z10, int i10, List<d> list) throws IOException;

    void Da(i iVar) throws IOException;

    void F9(boolean z10, int i10, l lVar, int i11) throws IOException;

    void M1(int i10, a aVar) throws IOException;

    void Q(int i10, int i11, List<d> list) throws IOException;

    void Q3(i iVar) throws IOException;

    int Tb();

    void U1(int i10, List<d> list) throws IOException;

    void W(boolean z10, int i10, int i11) throws IOException;

    void c0(int i10, long j10) throws IOException;

    void df(boolean z10, boolean z11, int i10, int i11, List<d> list) throws IOException;

    void flush() throws IOException;

    void tf(int i10, a aVar, byte[] bArr) throws IOException;
}
