package io.ktor.util;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class y0 {
    @NotNull
    public static final InputStream a(@NotNull kotlinx.io.c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return new a(c0Var);
    }

    public static final class a extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.io.c0 f296829a;

        a(kotlinx.io.c0 c0Var) {
            this.f296829a = c0Var;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f296829a.close();
        }

        @Override // java.io.InputStream
        public int read() {
            if (ui.p.a(this.f296829a)) {
                return -1;
            }
            return this.f296829a.readByte();
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            return ui.l.g(this.f296829a, j10);
        }

        @Override // java.io.InputStream
        public int read(byte[] buffer, int i10, int i11) {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            if (!ui.p.a(this.f296829a)) {
                return ui.p.b(this.f296829a, buffer, i10, i11);
            }
            int i12 = 1 ^ (-1);
            return -1;
        }
    }
}
