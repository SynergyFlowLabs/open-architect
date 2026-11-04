package io.sentry;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class m7 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f305875d = 52428800;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f305876e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n7 f305877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Callable<byte[]> f305878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private byte[] f305879c;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private byte[] f305880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Callable<byte[]> f305881b;

        public a(@Nullable Callable<byte[]> callable) {
            this.f305881b = callable;
        }

        @NotNull
        private static byte[] b(@Nullable byte[] bArr) {
            return bArr != null ? bArr : new byte[0];
        }

        @NotNull
        public byte[] a() throws Exception {
            Callable<byte[]> callable;
            if (this.f305880a == null && (callable = this.f305881b) != null) {
                this.f305880a = callable.call();
            }
            return b(this.f305880a);
        }
    }

    m7(@NotNull n7 n7Var, byte[] bArr) {
        this.f305877a = (n7) io.sentry.util.y.c(n7Var, "SentryEnvelopeItemHeader is required.");
        this.f305879c = bArr;
        this.f305878b = null;
    }

    public static /* synthetic */ byte[] C(b bVar, long j10, n1 n1Var, ILogger iLogger) throws io.sentry.exception.c {
        byte[] bArrCall;
        if (bVar.g() != null) {
            byte[] bArrG = bVar.g();
            E(bArrG.length, j10, bVar.i());
            return bArrG;
        }
        if (bVar.k() != null) {
            byte[] bArrB = io.sentry.util.r.b(n1Var, iLogger, bVar.k());
            if (bArrB != null) {
                E(bArrB.length, j10, bVar.i());
                return bArrB;
            }
        } else {
            if (bVar.j() != null) {
                return io.sentry.util.i.b(bVar.j(), j10);
            }
            if (bVar.f() != null && (bArrCall = bVar.f().call()) != null) {
                E(bArrCall.length, j10, bVar.i());
                return bArrCall;
            }
        }
        throw new io.sentry.exception.c(String.format("Couldn't attach the attachment %s.\nPlease check that either bytes, serializable, path or provider is set.", bVar.i()));
    }

    private static void E(long j10, long j11, @NotNull String str) throws io.sentry.exception.c {
        if (j10 > j11) {
            throw new io.sentry.exception.c(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static m7 F(@NotNull final n1 n1Var, @NotNull final ILogger iLogger, @NotNull final b bVar, final long j10) {
        final a aVar = new a(new Callable() { // from class: io.sentry.f7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m7.C(bVar, j10, n1Var, iLogger);
            }
        });
        return new m7(new n7(x7.Attachment, new Callable() { // from class: io.sentry.g7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, bVar.h(), bVar.i(), bVar.e()), (Callable<byte[]>) new Callable() { // from class: io.sentry.h7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static m7 G(@NotNull final n1 n1Var, @NotNull final h hVar) {
        io.sentry.util.y.c(n1Var, "ISerializer is required.");
        io.sentry.util.y.c(hVar, "CheckIn is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.y6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m7.p(n1Var, hVar);
            }
        });
        return new m7(new n7(x7.CheckIn, new Callable() { // from class: io.sentry.z6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.a7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    @NotNull
    public static m7 H(@NotNull final n1 n1Var, @NotNull final io.sentry.clientreport.c cVar) throws IOException {
        io.sentry.util.y.c(n1Var, "ISerializer is required.");
        io.sentry.util.y.c(cVar, "ClientReport is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.v6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m7.d(n1Var, cVar);
            }
        });
        return new m7(new n7(x7.resolve(cVar), new Callable() { // from class: io.sentry.w6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.x6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    @NotNull
    public static m7 I(@NotNull final n1 n1Var, @NotNull final z5 z5Var) {
        io.sentry.util.y.c(n1Var, "ISerializer is required.");
        io.sentry.util.y.c(z5Var, "SentryEvent is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.l6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m7.r(n1Var, z5Var);
            }
        });
        return new m7(new n7(x7.resolve(z5Var), new Callable() { // from class: io.sentry.m6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.n6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static m7 J(@NotNull final n1 n1Var, @NotNull final c8 c8Var) {
        io.sentry.util.y.c(n1Var, "ISerializer is required.");
        io.sentry.util.y.c(c8Var, "SentryLogEvents is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.b7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m7.y(n1Var, c8Var);
            }
        });
        return new m7(new n7(x7.Log, (Callable<Integer>) new Callable() { // from class: io.sentry.c7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(c8Var.a().size())), (Callable<byte[]>) new Callable() { // from class: io.sentry.d7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    @NotNull
    public static m7 K(@NotNull final g4 g4Var, @NotNull final n1 n1Var) throws io.sentry.exception.c {
        final File fileY = g4Var.y();
        final a aVar = new a(new Callable() { // from class: io.sentry.r6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m7.o(fileY, g4Var, n1Var);
            }
        });
        return new m7(new n7(x7.ProfileChunk, (Callable<Integer>) new Callable() { // from class: io.sentry.s6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application-json", fileY.getName(), (String) null, g4Var.s(), (Integer) null), (Callable<byte[]>) new Callable() { // from class: io.sentry.u6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    @NotNull
    public static m7 L(@NotNull final k4 k4Var, final long j10, @NotNull final n1 n1Var) throws io.sentry.exception.c {
        final File fileU = k4Var.U();
        final a aVar = new a(new Callable() { // from class: io.sentry.i7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m7.s(fileU, j10, k4Var, n1Var);
            }
        });
        return new m7(new n7(x7.Profile, new Callable() { // from class: io.sentry.j7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application-json", fileU.getName()), (Callable<byte[]>) new Callable() { // from class: io.sentry.k7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static m7 M(@NotNull final n1 n1Var, @NotNull final ILogger iLogger, @NotNull final o8 o8Var, @Nullable final p4 p4Var, final boolean z10) {
        final File fileW0 = o8Var.w0();
        final a aVar = new a(new Callable() { // from class: io.sentry.i6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m7.c(n1Var, o8Var, p4Var, fileW0, iLogger, z10);
            }
        });
        return new m7(new n7(x7.ReplayVideo, new Callable() { // from class: io.sentry.t6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, null, null), (Callable<byte[]>) new Callable() { // from class: io.sentry.e7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    @NotNull
    public static m7 N(@NotNull final n1 n1Var, @NotNull final k9 k9Var) throws IOException {
        io.sentry.util.y.c(n1Var, "ISerializer is required.");
        io.sentry.util.y.c(k9Var, "Session is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.l7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m7.z(n1Var, k9Var);
            }
        });
        return new m7(new n7(x7.Session, new Callable() { // from class: io.sentry.j6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.k6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    public static m7 O(@NotNull final n1 n1Var, @NotNull final na naVar) {
        io.sentry.util.y.c(n1Var, "ISerializer is required.");
        io.sentry.util.y.c(naVar, "UserFeedback is required.");
        final a aVar = new a(new Callable() { // from class: io.sentry.o6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m7.v(n1Var, naVar);
            }
        });
        return new m7(new n7(x7.UserFeedback, new Callable() { // from class: io.sentry.p6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(aVar.a().length);
            }
        }, "application/json", null), (Callable<byte[]>) new Callable() { // from class: io.sentry.q6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return aVar.a();
            }
        });
    }

    private static byte[] V(@NotNull Map<String, byte[]> map) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (map.size() | 128));
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                byte[] bytes = entry.getKey().getBytes(f305876e);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] value = entry.getValue();
                int length2 = value.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(value);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ byte[] c(n1 n1Var, o8 o8Var, p4 p4Var, File file, ILogger iLogger, boolean z10) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f305876e));
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    n1Var.a(o8Var, bufferedWriter);
                    linkedHashMap.put(x7.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.reset();
                    if (p4Var != null) {
                        n1Var.a(p4Var, bufferedWriter);
                        linkedHashMap.put(x7.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                        byteArrayOutputStream.reset();
                    }
                    if (file != null && file.exists()) {
                        byte[] bArrB = io.sentry.util.i.b(file.getPath(), o8.f305969h3);
                        if (bArrB.length > 0) {
                            linkedHashMap.put(x7.ReplayVideo.getItemType(), bArrB);
                        }
                    }
                    byte[] bArrV = V(linkedHashMap);
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    if (file != null) {
                        if (z10) {
                            io.sentry.util.i.a(file.getParentFile());
                            return bArrV;
                        }
                        file.delete();
                    }
                    return bArrV;
                } catch (Throwable th2) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            try {
                iLogger.a(y7.ERROR, "Could not serialize replay recording", th6);
                if (file != null) {
                    if (z10) {
                        io.sentry.util.i.a(file.getParentFile());
                    } else {
                        file.delete();
                    }
                }
                return null;
            } catch (Throwable th7) {
                if (file != null) {
                    if (z10) {
                        io.sentry.util.i.a(file.getParentFile());
                    } else {
                        file.delete();
                    }
                }
                throw th7;
            }
        }
    }

    public static /* synthetic */ byte[] d(n1 n1Var, io.sentry.clientreport.c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f305876e));
            try {
                n1Var.a(cVar, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static /* synthetic */ byte[] o(File file, g4 g4Var, n1 n1Var) throws io.sentry.exception.c {
        if (!file.exists()) {
            throw new io.sentry.exception.c(String.format("Dropping profile chunk, because the file '%s' doesn't exists", file.getName()));
        }
        if ("java".equals(g4Var.s())) {
            e1 e1VarB = io.sentry.profiling.c.b();
            if (e1VarB == null) {
                throw new io.sentry.exception.c("Could not load a ProfileConverter, dropping chunk.");
            }
            try {
                g4Var.C(e1VarB.a(file.getAbsolutePath()));
            } catch (Exception e10) {
                throw new io.sentry.exception.c("Profile conversion failed", e10);
            }
        } else {
            String strF = io.sentry.vendor.a.f(io.sentry.util.i.b(file.getPath(), f305875d), 3);
            if (strF.isEmpty()) {
                throw new io.sentry.exception.c("Profiling trace file is empty");
            }
            g4Var.B(strF);
        }
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f305876e));
                    try {
                        n1Var.a(g4Var, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        file.delete();
                        return byteArray;
                    } catch (Throwable th2) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (IOException e11) {
                throw new io.sentry.exception.c(String.format("Failed to serialize profile chunk\n%s", e11.getMessage()));
            }
        } catch (Throwable th6) {
            file.delete();
            throw th6;
        }
    }

    public static /* synthetic */ byte[] p(n1 n1Var, h hVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f305876e));
            try {
                n1Var.a(hVar, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static /* synthetic */ byte[] r(n1 n1Var, z5 z5Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f305876e));
            try {
                n1Var.a(z5Var, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static /* synthetic */ byte[] s(File file, long j10, k4 k4Var, n1 n1Var) throws io.sentry.exception.c {
        if (!file.exists()) {
            throw new io.sentry.exception.c(String.format("Dropping profiling trace data, because the file '%s' doesn't exists", file.getName()));
        }
        String strF = io.sentry.vendor.a.f(io.sentry.util.i.b(file.getPath(), j10), 3);
        if (strF.isEmpty()) {
            throw new io.sentry.exception.c("Profiling trace file is empty");
        }
        k4Var.s0(strF);
        k4Var.c0();
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f305876e));
                    try {
                        n1Var.a(k4Var, bufferedWriter);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        file.delete();
                        return byteArray;
                    } catch (Throwable th2) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (IOException e10) {
                throw new io.sentry.exception.c(String.format("Failed to serialize profiling trace data\n%s", e10.getMessage()));
            }
        } catch (Throwable th6) {
            file.delete();
            throw th6;
        }
    }

    public static /* synthetic */ byte[] v(n1 n1Var, na naVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f305876e));
            try {
                n1Var.a(naVar, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static /* synthetic */ byte[] y(n1 n1Var, c8 c8Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f305876e));
            try {
                n1Var.a(c8Var, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static /* synthetic */ byte[] z(n1 n1Var, k9 k9Var) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f305876e));
            try {
                n1Var.a(k9Var, bufferedWriter);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                bufferedWriter.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    @Nullable
    public io.sentry.clientreport.c P(@NotNull n1 n1Var) throws Exception {
        n7 n7Var = this.f305877a;
        if (n7Var == null || n7Var.f() != x7.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(Q()), f305876e));
        try {
            io.sentry.clientreport.c cVar = (io.sentry.clientreport.c) n1Var.c(bufferedReader, io.sentry.clientreport.c.class);
            bufferedReader.close();
            return cVar;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NotNull
    public byte[] Q() throws Exception {
        Callable<byte[]> callable;
        if (this.f305879c == null && (callable = this.f305878b) != null) {
            this.f305879c = callable.call();
        }
        return this.f305879c;
    }

    @Nullable
    public o7 R(@NotNull n1 n1Var) throws Exception {
        n7 n7Var = this.f305877a;
        if (n7Var == null || n7Var.f() != x7.Event) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(Q()), f305876e));
        try {
            o7 o7Var = (o7) n1Var.c(bufferedReader, o7.class);
            bufferedReader.close();
            return o7Var;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NotNull
    public n7 S() {
        return this.f305877a;
    }

    @Nullable
    public c8 T(@NotNull n1 n1Var) throws Exception {
        n7 n7Var = this.f305877a;
        if (n7Var == null || n7Var.f() != x7.Log) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(Q()), f305876e));
        try {
            c8 c8Var = (c8) n1Var.c(bufferedReader, c8.class);
            bufferedReader.close();
            return c8Var;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Nullable
    public io.sentry.protocol.c0 U(@NotNull n1 n1Var) throws Exception {
        n7 n7Var = this.f305877a;
        if (n7Var != null && n7Var.f() == x7.Transaction) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(Q()), f305876e));
            try {
                io.sentry.protocol.c0 c0Var = (io.sentry.protocol.c0) n1Var.c(bufferedReader, io.sentry.protocol.c0.class);
                bufferedReader.close();
                return c0Var;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return null;
    }

    m7(@NotNull n7 n7Var, @Nullable Callable<byte[]> callable) {
        this.f305877a = (n7) io.sentry.util.y.c(n7Var, "SentryEnvelopeItemHeader is required.");
        this.f305878b = (Callable) io.sentry.util.y.c(callable, "DataFactory is required.");
        this.f305879c = null;
    }
}
