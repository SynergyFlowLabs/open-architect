package io.grpc;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
@e0("https://github.com/grpc/grpc-java/issues/1704")
public interface z {
    String B();

    InputStream a(InputStream inputStream) throws IOException;
}
