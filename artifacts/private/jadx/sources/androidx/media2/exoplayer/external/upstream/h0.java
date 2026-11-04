package androidx.media2.exoplayer.external.upstream;

import androidx.annotation.b1;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface h0 {

    public static final class a implements h0 {
        @Override // androidx.media2.exoplayer.external.upstream.h0
        public void a() throws IOException {
        }

        @Override // androidx.media2.exoplayer.external.upstream.h0
        public void b(int minRetryCount) throws IOException {
        }
    }

    void a() throws IOException;

    void b(int minRetryCount) throws IOException;
}
