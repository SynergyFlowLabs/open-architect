package io.grpc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes13.dex */
@e0("https://github.com/grpc/grpc-java/issues/1704")
public interface p extends s, z {

    public static final class a implements p {
        @Override // io.grpc.s, io.grpc.z
        public String B() {
            return "gzip";
        }

        @Override // io.grpc.z
        public InputStream a(InputStream inputStream) throws IOException {
            return new GZIPInputStream(inputStream);
        }

        @Override // io.grpc.s
        public OutputStream b(OutputStream outputStream) throws IOException {
            return new GZIPOutputStream(outputStream);
        }
    }

    public static final class b implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f290837a = new b();

        private b() {
        }

        @Override // io.grpc.s, io.grpc.z
        public String B() {
            return "identity";
        }

        @Override // io.grpc.z
        public InputStream a(InputStream inputStream) {
            return inputStream;
        }

        @Override // io.grpc.s
        public OutputStream b(OutputStream outputStream) {
            return outputStream;
        }
    }
}
