package io.grpc;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes13.dex */
@e0("https://github.com/grpc/grpc-java/issues/1704")
public interface s {
    String B();

    OutputStream b(OutputStream outputStream) throws IOException;
}
