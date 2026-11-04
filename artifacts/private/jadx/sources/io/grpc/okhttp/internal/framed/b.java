package io.grpc.okhttp.internal.framed;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import okio.n;
import okio.o;

/* JADX INFO: loaded from: classes13.dex */
public interface b extends Closeable {

    public interface a {
        void M1(int i10, io.grpc.okhttp.internal.framed.a aVar);

        void N1(boolean z10, boolean z11, int i10, int i11, List<d> list, e eVar);

        void O1(boolean z10, i iVar);

        void P1(boolean z10, int i10, n nVar, int i11, int i12) throws IOException;

        void Q(int i10, int i11, List<d> list) throws IOException;

        void Q1(int i10, io.grpc.okhttp.internal.framed.a aVar, o oVar);

        void W(boolean z10, int i10, int i11);

        void c0(int i10, long j10);

        void d0(int i10, String str, o oVar, String str2, int i11, long j10);

        void e0();

        void f0(int i10, int i11, int i12, boolean z10);
    }

    void Y3() throws IOException;

    boolean x9(a aVar) throws IOException;
}
