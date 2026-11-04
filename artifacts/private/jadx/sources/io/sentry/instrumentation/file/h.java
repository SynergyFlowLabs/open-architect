package io.sentry.instrumentation.file;

import io.sentry.h5;
import io.sentry.i1;
import io.sentry.p1;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends FileInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final FileInputStream f305596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.instrumentation.file.a f305597b;

    public static final class b {
        public static FileInputStream a(@NotNull FileInputStream fileInputStream, @Nullable File file) throws FileNotFoundException {
            h5 h5VarQ = h5.q();
            return e(h5VarQ) ? new h(h.h(file, fileInputStream, h5VarQ)) : fileInputStream;
        }

        static FileInputStream b(@NotNull FileInputStream fileInputStream, @Nullable File file, @NotNull i1 i1Var) throws FileNotFoundException {
            return e(i1Var) ? new h(h.h(file, fileInputStream, i1Var)) : fileInputStream;
        }

        public static FileInputStream c(@NotNull FileInputStream fileInputStream, @NotNull FileDescriptor fileDescriptor) {
            h5 h5VarQ = h5.q();
            return e(h5VarQ) ? new h(h.j(fileDescriptor, fileInputStream, h5VarQ), fileDescriptor) : fileInputStream;
        }

        public static FileInputStream d(@NotNull FileInputStream fileInputStream, @Nullable String str) throws FileNotFoundException {
            h5 h5VarQ = h5.q();
            if (e(h5VarQ)) {
                return new h(h.h(str != null ? new File(str) : null, fileInputStream, h5VarQ));
            }
            return fileInputStream;
        }

        private static boolean e(@NotNull i1 i1Var) {
            return i1Var.b().isTracingEnabled();
        }
    }

    public static /* synthetic */ Integer c(h hVar, AtomicInteger atomicInteger) throws IOException {
        int i10 = hVar.f305596a.read();
        atomicInteger.set(i10);
        return Integer.valueOf(i10 != -1 ? 1 : 0);
    }

    private static FileDescriptor g(@NotNull FileInputStream fileInputStream) throws FileNotFoundException {
        try {
            return fileInputStream.getFD();
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static io.sentry.instrumentation.file.b h(@Nullable File file, @Nullable FileInputStream fileInputStream, @NotNull i1 i1Var) throws FileNotFoundException {
        p1 p1VarE = io.sentry.instrumentation.file.a.e(i1Var, "file.read");
        if (fileInputStream == null) {
            fileInputStream = new FileInputStream(file);
        }
        return new io.sentry.instrumentation.file.b(file, p1VarE, fileInputStream, i1Var.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static io.sentry.instrumentation.file.b j(@NotNull FileDescriptor fileDescriptor, @Nullable FileInputStream fileInputStream, @NotNull i1 i1Var) {
        p1 p1VarE = io.sentry.instrumentation.file.a.e(i1Var, "file.read");
        if (fileInputStream == null) {
            fileInputStream = new FileInputStream(fileDescriptor);
        }
        return new io.sentry.instrumentation.file.b(null, p1VarE, fileInputStream, i1Var.b());
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f305597b.a(this.f305596a);
        super.close();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public int read() throws IOException {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        this.f305597b.d(new io.sentry.instrumentation.file.a.InterfaceC2223a() { // from class: io.sentry.instrumentation.file.g
            @Override // io.sentry.instrumentation.file.a.InterfaceC2223a
            public final Object call() {
                return h.c(this.f305594a, atomicInteger);
            }
        });
        return atomicInteger.get();
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public long skip(final long j10) throws IOException {
        return ((Long) this.f305597b.d(new io.sentry.instrumentation.file.a.InterfaceC2223a() { // from class: io.sentry.instrumentation.file.d
            @Override // io.sentry.instrumentation.file.a.InterfaceC2223a
            public final Object call() {
                return Long.valueOf(this.f305586a.f305596a.skip(j10));
            }
        })).longValue();
    }

    public h(@Nullable String str) throws FileNotFoundException {
        this(str != null ? new File(str) : null, h5.q());
    }

    public h(@Nullable File file) throws FileNotFoundException {
        this(file, h5.q());
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public int read(final byte[] bArr) throws IOException {
        return ((Integer) this.f305597b.d(new io.sentry.instrumentation.file.a.InterfaceC2223a() { // from class: io.sentry.instrumentation.file.f
            @Override // io.sentry.instrumentation.file.a.InterfaceC2223a
            public final Object call() {
                return Integer.valueOf(this.f305592a.f305596a.read(bArr));
            }
        })).intValue();
    }

    public h(@NotNull FileDescriptor fileDescriptor) {
        this(fileDescriptor, h5.q());
    }

    @Override // java.io.FileInputStream, java.io.InputStream
    public int read(final byte[] bArr, final int i10, final int i11) throws IOException {
        return ((Integer) this.f305597b.d(new io.sentry.instrumentation.file.a.InterfaceC2223a() { // from class: io.sentry.instrumentation.file.e
            @Override // io.sentry.instrumentation.file.a.InterfaceC2223a
            public final Object call() {
                return Integer.valueOf(this.f305588a.f305596a.read(bArr, i10, i11));
            }
        })).intValue();
    }

    h(@Nullable File file, @NotNull i1 i1Var) throws FileNotFoundException {
        this(h(file, null, i1Var));
    }

    h(@NotNull FileDescriptor fileDescriptor, @NotNull i1 i1Var) {
        this(j(fileDescriptor, null, i1Var), fileDescriptor);
    }

    private h(@NotNull io.sentry.instrumentation.file.b bVar, @NotNull FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.f305597b = new io.sentry.instrumentation.file.a(bVar.f305578b, bVar.f305577a, bVar.f305580d);
        this.f305596a = bVar.f305579c;
    }

    private h(@NotNull io.sentry.instrumentation.file.b bVar) throws FileNotFoundException {
        super(g(bVar.f305579c));
        this.f305597b = new io.sentry.instrumentation.file.a(bVar.f305578b, bVar.f305577a, bVar.f305580d);
        this.f305596a = bVar.f305579c;
    }
}
