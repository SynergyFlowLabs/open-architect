package androidx.media3.extractor.metadata.emsg;

import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.o0;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class b extends androidx.media3.extractor.metadata.c {
    @Override // androidx.media3.extractor.metadata.c
    protected r0 b(androidx.media3.extractor.metadata.b bVar, ByteBuffer byteBuffer) {
        return new r0(c(new o0(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(o0 o0Var) {
        return new a((String) androidx.media3.common.util.a.g(o0Var.F()), (String) androidx.media3.common.util.a.g(o0Var.F()), o0Var.E(), o0Var.E(), Arrays.copyOfRange(o0Var.e(), o0Var.f(), o0Var.g()));
    }
}
