package io.sentry.instrumentation.file;

import io.sentry.h5;
import io.sentry.i1;
import io.sentry.p1;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends FileOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final FileOutputStream f305606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.instrumentation.file.a f305607b;

    public static final class b {
        public static FileOutputStream a(@NotNull FileOutputStream fileOutputStream, @Nullable File file) throws FileNotFoundException {
            return g(h5.q()) ? new l(l.g(file, false, fileOutputStream, h5.q())) : fileOutputStream;
        }

        public static FileOutputStream b(@NotNull FileOutputStream fileOutputStream, @Nullable File file, @NotNull i1 i1Var) throws FileNotFoundException {
            return g(i1Var) ? new l(l.g(file, false, fileOutputStream, i1Var)) : fileOutputStream;
        }

        public static FileOutputStream c(@NotNull FileOutputStream fileOutputStream, @Nullable File file, boolean z10) throws FileNotFoundException {
            return g(h5.q()) ? new l(l.g(file, z10, fileOutputStream, h5.q())) : fileOutputStream;
        }

        public static FileOutputStream d(@NotNull FileOutputStream fileOutputStream, @NotNull FileDescriptor fileDescriptor) {
            return g(h5.q()) ? new l(l.h(fileDescriptor, fileOutputStream, h5.q()), fileDescriptor) : fileOutputStream;
        }

        public static FileOutputStream e(@NotNull FileOutputStream fileOutputStream, @Nullable String str) throws FileNotFoundException {
            if (g(h5.q())) {
                return new l(l.g(str != null ? new File(str) : null, false, fileOutputStream, h5.q()));
            }
            return fileOutputStream;
        }

        public static FileOutputStream f(@NotNull FileOutputStream fileOutputStream, @Nullable String str, boolean z10) throws FileNotFoundException {
            if (g(h5.q())) {
                return new l(l.g(str != null ? new File(str) : null, z10, fileOutputStream, h5.q()));
            }
            return fileOutputStream;
        }

        private static boolean g(@NotNull i1 i1Var) {
            return i1Var.b().isTracingEnabled();
        }
    }

    public static /* synthetic */ Integer a(l lVar, byte[] bArr) throws IOException {
        lVar.f305606a.write(bArr);
        return Integer.valueOf(bArr.length);
    }

    public static /* synthetic */ Integer b(l lVar, byte[] bArr, int i10, int i11) throws IOException {
        lVar.f305606a.write(bArr, i10, i11);
        return Integer.valueOf(i11);
    }

    public static /* synthetic */ Integer c(l lVar, int i10) throws IOException {
        lVar.f305606a.write(i10);
        return 1;
    }

    private static FileDescriptor f(@NotNull FileOutputStream fileOutputStream) throws FileNotFoundException {
        try {
            return fileOutputStream.getFD();
        } catch (IOException unused) {
            throw new FileNotFoundException("No file descriptor");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c g(@Nullable File file, boolean z10, @Nullable FileOutputStream fileOutputStream, @NotNull i1 i1Var) throws FileNotFoundException {
        p1 p1VarE = io.sentry.instrumentation.file.a.e(i1Var, "file.write");
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(file, z10);
        }
        return new c(file, z10, p1VarE, fileOutputStream, i1Var.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c h(@NotNull FileDescriptor fileDescriptor, @Nullable FileOutputStream fileOutputStream, @NotNull i1 i1Var) {
        p1 p1VarE = io.sentry.instrumentation.file.a.e(i1Var, "file.write");
        if (fileOutputStream == null) {
            fileOutputStream = new FileOutputStream(fileDescriptor);
        }
        return new c(null, false, p1VarE, fileOutputStream, i1Var.b());
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f305607b.a(this.f305606a);
        super.close();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(final int i10) throws IOException {
        this.f305607b.d(new io.sentry.instrumentation.file.a.InterfaceC2223a() { // from class: io.sentry.instrumentation.file.j
            @Override // io.sentry.instrumentation.file.a.InterfaceC2223a
            public final Object call() {
                return l.c(this.f305602a, i10);
            }
        });
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(final byte[] bArr) throws IOException {
        this.f305607b.d(new io.sentry.instrumentation.file.a.InterfaceC2223a() { // from class: io.sentry.instrumentation.file.k
            @Override // io.sentry.instrumentation.file.a.InterfaceC2223a
            public final Object call() {
                return l.a(this.f305604a, bArr);
            }
        });
    }

    public l(@Nullable String str) throws FileNotFoundException {
        this(str != null ? new File(str) : null, false, (i1) h5.q());
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream
    public void write(final byte[] bArr, final int i10, final int i11) throws IOException {
        this.f305607b.d(new io.sentry.instrumentation.file.a.InterfaceC2223a() { // from class: io.sentry.instrumentation.file.i
            @Override // io.sentry.instrumentation.file.a.InterfaceC2223a
            public final Object call() {
                return l.b(this.f305598a, bArr, i10, i11);
            }
        });
    }

    public l(@Nullable String str, boolean z10) throws FileNotFoundException {
        this(g(str != null ? new File(str) : null, z10, null, h5.q()));
    }

    public l(@Nullable File file) throws FileNotFoundException {
        this(file, false, (i1) h5.q());
    }

    public l(@Nullable File file, boolean z10) throws FileNotFoundException {
        this(g(file, z10, null, h5.q()));
    }

    public l(@NotNull FileDescriptor fileDescriptor) {
        this(h(fileDescriptor, null, h5.q()), fileDescriptor);
    }

    l(@Nullable File file, boolean z10, @NotNull i1 i1Var) throws FileNotFoundException {
        this(g(file, z10, null, i1Var));
    }

    private l(@NotNull c cVar, @NotNull FileDescriptor fileDescriptor) {
        super(fileDescriptor);
        this.f305607b = new io.sentry.instrumentation.file.a(cVar.f305582b, cVar.f305581a, cVar.f305585e);
        this.f305606a = cVar.f305584d;
    }

    private l(@NotNull c cVar) throws FileNotFoundException {
        super(f(cVar.f305584d));
        this.f305607b = new io.sentry.instrumentation.file.a(cVar.f305582b, cVar.f305581a, cVar.f305585e);
        this.f305606a = cVar.f305584d;
    }
}
