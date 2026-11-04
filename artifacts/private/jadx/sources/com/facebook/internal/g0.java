package com.facebook.internal;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidParameterException;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final String f99848k = "key";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final String f99849l = "tag";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f99851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final e f99852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final File f99853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f99854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f99855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f99856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Condition f99857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final AtomicLong f99858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final c f99846i = new c(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f99847j = g0.class.getSimpleName();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final AtomicLong f99850m = new AtomicLong();

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final String f99860b = "buffer";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f99859a = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private static final FilenameFilter f99861c = new FilenameFilter() { // from class: com.facebook.internal.e0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return g0.a.f(file, str);
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private static final FilenameFilter f99862d = new FilenameFilter() { // from class: com.facebook.internal.f0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return g0.a.g(file, str);
            }
        };

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean f(File file, String filename) {
            Intrinsics.checkNotNullExpressionValue(filename, "filename");
            return !StringsKt.u2(filename, f99860b, false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean g(File file, String filename) {
            Intrinsics.checkNotNullExpressionValue(filename, "filename");
            return StringsKt.u2(filename, f99860b, false, 2, null);
        }

        public final void c(@NotNull File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            File[] fileArrListFiles = root.listFiles(e());
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                int i10 = 0;
                while (i10 < length) {
                    File file = fileArrListFiles[i10];
                    i10++;
                    file.delete();
                }
            }
        }

        @NotNull
        public final FilenameFilter d() {
            return f99861c;
        }

        @NotNull
        public final FilenameFilter e() {
            return f99862d;
        }

        @NotNull
        public final File h(@Nullable File file) {
            return new File(file, Intrinsics.stringPlus(f99860b, Long.valueOf(g0.f99850m.incrementAndGet())));
        }
    }

    private static final class b extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final OutputStream f99863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final g f99864b;

        public b(@NotNull OutputStream innerStream, @NotNull g callback) {
            Intrinsics.checkNotNullParameter(innerStream, "innerStream");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f99863a = innerStream;
            this.f99864b = callback;
        }

        @NotNull
        public final g a() {
            return this.f99864b;
        }

        @NotNull
        public final OutputStream b() {
            return this.f99863a;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.f99863a.close();
                this.f99864b.onClose();
            } catch (Throwable th2) {
                this.f99864b.onClose();
                throw th2;
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f99863a.flush();
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] buffer, int i10, int i11) throws IOException {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            this.f99863a.write(buffer, i10, i11);
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] buffer) throws IOException {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            this.f99863a.write(buffer);
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            this.f99863a.write(i10);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return g0.f99847j;
        }

        private c() {
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f99867a = 1048576;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f99868b = 1024;

        public final int a() {
            return this.f99867a;
        }

        public final int b() {
            return this.f99868b;
        }

        public final void c(int i10) {
            if (i10 < 0) {
                throw new InvalidParameterException("Cache byte-count limit must be >= 0");
            }
            this.f99867a = i10;
        }

        public final void d(int i10) {
            if (i10 < 0) {
                throw new InvalidParameterException("Cache file count limit must be >= 0");
            }
            this.f99868b = i10;
        }
    }

    private static final class f implements Comparable<f> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f99869c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f99870d = 29;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f99871e = 37;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final File f99872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f99873b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public f(@NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            this.f99872a = file;
            this.f99873b = file.lastModified();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull f another) {
            Intrinsics.checkNotNullParameter(another, "another");
            long j10 = this.f99873b;
            long j11 = another.f99873b;
            if (j10 < j11) {
                return -1;
            }
            if (j10 > j11) {
                return 1;
            }
            return this.f99872a.compareTo(another.f99872a);
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof f) && compareTo((f) obj) == 0;
        }

        public int hashCode() {
            return ((1073 + this.f99872a.hashCode()) * 37) + ((int) (this.f99873b % ((long) Integer.MAX_VALUE)));
        }

        @NotNull
        public final File k() {
            return this.f99872a;
        }

        public final long l() {
            return this.f99873b;
        }
    }

    private interface g {
        void onClose();
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final h f99874a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f99875b = 0;

        private h() {
        }

        @Nullable
        public final JSONObject a(@NotNull InputStream stream) throws IOException {
            Intrinsics.checkNotNullParameter(stream, "stream");
            if (stream.read() != 0) {
                return null;
            }
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = stream.read();
                if (i13 == -1) {
                    t0.a aVar = t0.f100109e;
                    com.facebook.t0 t0Var = com.facebook.t0.CACHE;
                    String TAG = g0.f99846i.a();
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    aVar.d(t0Var, TAG, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i11 = (i11 << 8) + (i13 & 255);
            }
            byte[] bArr = new byte[i11];
            while (i10 < i11) {
                int i14 = stream.read(bArr, i10, i11 - i10);
                if (i14 < 1) {
                    t0.a aVar2 = t0.f100109e;
                    com.facebook.t0 t0Var2 = com.facebook.t0.CACHE;
                    String TAG2 = g0.f99846i.a();
                    Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    aVar2.d(t0Var2, TAG2, "readHeader: stream.read stopped at " + Integer.valueOf(i10) + " when expected " + i11);
                    return null;
                }
                i10 += i14;
            }
            try {
                Object objNextValue = new JSONTokener(new String(bArr, Charsets.UTF_8)).nextValue();
                if (objNextValue instanceof JSONObject) {
                    return (JSONObject) objNextValue;
                }
                t0.a aVar3 = t0.f100109e;
                com.facebook.t0 t0Var3 = com.facebook.t0.CACHE;
                String TAG3 = g0.f99846i.a();
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                aVar3.d(t0Var3, TAG3, Intrinsics.stringPlus("readHeader: expected JSONObject, got ", objNextValue.getClass().getCanonicalName()));
                return null;
            } catch (JSONException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final void b(@NotNull OutputStream stream, @NotNull JSONObject header) throws IOException {
            Intrinsics.checkNotNullParameter(stream, "stream");
            Intrinsics.checkNotNullParameter(header, "header");
            String string = header.toString();
            Intrinsics.checkNotNullExpressionValue(string, "header.toString()");
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            stream.write(0);
            stream.write((bytes.length >> 16) & 255);
            stream.write((bytes.length >> 8) & 255);
            stream.write(bytes.length & 255);
            stream.write(bytes);
        }
    }

    public static final class i implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f99876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f99877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f99878c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f99879d;

        i(long j10, g0 g0Var, File file, String str) {
            this.f99876a = j10;
            this.f99877b = g0Var;
            this.f99878c = file;
            this.f99879d = str;
        }

        @Override // com.facebook.internal.g0.g
        public void onClose() {
            if (this.f99876a < this.f99877b.f99858h.get()) {
                this.f99878c.delete();
            } else {
                this.f99877b.s(this.f99879d, this.f99878c);
            }
        }
    }

    public g0(@NotNull String tag, @NotNull e limits) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.f99851a = tag;
        this.f99852b = limits;
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        File file = new File(com.facebook.g0.t(), tag);
        this.f99853c = file;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f99856f = reentrantLock;
        this.f99857g = reentrantLock.newCondition();
        this.f99858h = new AtomicLong(0L);
        if (file.mkdirs() || file.isDirectory()) {
            a.f99859a.c(file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(File[] filesToDelete) {
        Intrinsics.checkNotNullExpressionValue(filesToDelete, "filesToDelete");
        int length = filesToDelete.length;
        int i10 = 0;
        while (i10 < length) {
            File file = filesToDelete[i10];
            i10++;
            file.delete();
        }
    }

    public static /* synthetic */ InputStream k(g0 g0Var, String str, String str2, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return g0Var.j(str, str2);
    }

    public static /* synthetic */ OutputStream p(g0 g0Var, String str, String str2, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return g0Var.o(str, str2);
    }

    private final void q() {
        ReentrantLock reentrantLock = this.f99856f;
        reentrantLock.lock();
        try {
            if (!this.f99854d) {
                this.f99854d = true;
                com.facebook.g0 g0Var = com.facebook.g0.f99617a;
                com.facebook.g0.y().execute(new Runnable() { // from class: com.facebook.internal.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        g0.r(this.f99791a);
                    }
                });
            }
            Unit unit = Unit.f312394a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(g0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(String str, File file) {
        File file2 = this.f99853c;
        e1 e1Var = e1.f99794a;
        if (!file.renameTo(new File(file2, e1.j0(str)))) {
            file.delete();
        }
        q();
    }

    private final void u() {
        PriorityQueue priorityQueue;
        long j10;
        ReentrantLock reentrantLock = this.f99856f;
        reentrantLock.lock();
        try {
            this.f99854d = false;
            this.f99855e = true;
            Unit unit = Unit.f312394a;
            reentrantLock.unlock();
            try {
                t0.a aVar = t0.f100109e;
                com.facebook.t0 t0Var = com.facebook.t0.CACHE;
                String TAG = f99847j;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                aVar.d(t0Var, TAG, "trim started");
                PriorityQueue priorityQueue2 = new PriorityQueue();
                File[] fileArrListFiles = this.f99853c.listFiles(a.f99859a.d());
                long length = 0;
                if (fileArrListFiles != null) {
                    int length2 = fileArrListFiles.length;
                    int i10 = 0;
                    j10 = 0;
                    while (i10 < length2) {
                        File file = fileArrListFiles[i10];
                        i10++;
                        Intrinsics.checkNotNullExpressionValue(file, "file");
                        f fVar = new f(file);
                        priorityQueue2.add(fVar);
                        t0.a aVar2 = t0.f100109e;
                        com.facebook.t0 t0Var2 = com.facebook.t0.CACHE;
                        String TAG2 = f99847j;
                        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                        aVar2.d(t0Var2, TAG2, "  trim considering time=" + Long.valueOf(fVar.l()) + " name=" + ((Object) fVar.k().getName()));
                        length += file.length();
                        j10++;
                        priorityQueue2 = priorityQueue2;
                    }
                    priorityQueue = priorityQueue2;
                } else {
                    priorityQueue = priorityQueue2;
                    j10 = 0;
                }
                while (true) {
                    if (length <= this.f99852b.a() && j10 <= this.f99852b.b()) {
                        ReentrantLock reentrantLock2 = this.f99856f;
                        reentrantLock2.lock();
                        try {
                            this.f99855e = false;
                            this.f99857g.signalAll();
                            Unit unit2 = Unit.f312394a;
                            return;
                        } finally {
                            reentrantLock2.unlock();
                        }
                    }
                    File fileK = ((f) priorityQueue.remove()).k();
                    t0.a aVar3 = t0.f100109e;
                    com.facebook.t0 t0Var3 = com.facebook.t0.CACHE;
                    String TAG3 = f99847j;
                    Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                    aVar3.d(t0Var3, TAG3, Intrinsics.stringPlus("  trim removing ", fileK.getName()));
                    length -= fileK.length();
                    j10--;
                    fileK.delete();
                }
            } catch (Throwable th2) {
                ReentrantLock reentrantLock3 = this.f99856f;
                reentrantLock3.lock();
                try {
                    this.f99855e = false;
                    this.f99857g.signalAll();
                    Unit unit3 = Unit.f312394a;
                    throw th2;
                } finally {
                    reentrantLock3.unlock();
                }
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final void g() {
        final File[] fileArrListFiles = this.f99853c.listFiles(a.f99859a.d());
        this.f99858h.set(System.currentTimeMillis());
        if (fileArrListFiles != null) {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            com.facebook.g0.y().execute(new Runnable() { // from class: com.facebook.internal.c0
                @Override // java.lang.Runnable
                public final void run() {
                    g0.h(fileArrListFiles);
                }
            });
        }
    }

    @oj.j
    @Nullable
    public final InputStream i(@NotNull String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        return k(this, key, null, 2, null);
    }

    @oj.j
    @Nullable
    public final InputStream j(@NotNull String key, @Nullable String str) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        File file = this.f99853c;
        e1 e1Var = e1.f99794a;
        File file2 = new File(file, e1.j0(key));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2), 8192);
            try {
                JSONObject jSONObjectA = h.f99874a.a(bufferedInputStream);
                if (jSONObjectA == null) {
                    bufferedInputStream.close();
                    return null;
                }
                if (!Intrinsics.areEqual(jSONObjectA.optString(f99848k), key)) {
                    bufferedInputStream.close();
                    return null;
                }
                String strOptString = jSONObjectA.optString("tag", null);
                if (str == null && !Intrinsics.areEqual(str, strOptString)) {
                    bufferedInputStream.close();
                    return null;
                }
                long time = new Date().getTime();
                t0.a aVar = t0.f100109e;
                com.facebook.t0 t0Var = com.facebook.t0.CACHE;
                String TAG = f99847j;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                aVar.d(t0Var, TAG, "Setting lastModified to " + Long.valueOf(time) + " for " + ((Object) file2.getName()));
                file2.setLastModified(time);
                return bufferedInputStream;
            } catch (Throwable th2) {
                bufferedInputStream.close();
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @NotNull
    public final String l() {
        String path = this.f99853c.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "directory.path");
        return path;
    }

    @NotNull
    public final InputStream m(@NotNull String key, @NotNull InputStream input) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(input, "input");
        return new d(input, p(this, key, null, 2, null));
    }

    @oj.j
    @NotNull
    public final OutputStream n(@NotNull String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        return p(this, key, null, 2, null);
    }

    @oj.j
    @NotNull
    public final OutputStream o(@NotNull String key, @Nullable String str) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        File fileH = a.f99859a.h(this.f99853c);
        fileH.delete();
        if (!fileH.createNewFile()) {
            throw new IOException(Intrinsics.stringPlus("Could not create file at ", fileH.getAbsolutePath()));
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new b(new FileOutputStream(fileH), new i(System.currentTimeMillis(), this, fileH, key)), 8192);
            try {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(f99848k, key);
                    e1 e1Var = e1.f99794a;
                    if (!e1.Z(str)) {
                        jSONObject.put("tag", str);
                    }
                    h.f99874a.b(bufferedOutputStream, jSONObject);
                    return bufferedOutputStream;
                } catch (JSONException e10) {
                    t0.a aVar = t0.f100109e;
                    com.facebook.t0 t0Var = com.facebook.t0.CACHE;
                    String TAG = f99847j;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    aVar.b(t0Var, 5, TAG, Intrinsics.stringPlus("Error creating JSON header for cache file: ", e10));
                    throw new IOException(e10.getMessage());
                }
            } catch (Throwable th2) {
                bufferedOutputStream.close();
                throw th2;
            }
        } catch (FileNotFoundException e11) {
            t0.a aVar2 = t0.f100109e;
            com.facebook.t0 t0Var2 = com.facebook.t0.CACHE;
            String TAG2 = f99847j;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            aVar2.b(t0Var2, 5, TAG2, Intrinsics.stringPlus("Error creating buffer output stream: ", e11));
            throw new IOException(e11.getMessage());
        }
    }

    public final long t() {
        ReentrantLock reentrantLock = this.f99856f;
        reentrantLock.lock();
        while (true) {
            try {
                if (!this.f99854d && !this.f99855e) {
                    break;
                }
                try {
                    this.f99857g.await();
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        Unit unit = Unit.f312394a;
        reentrantLock.unlock();
        File[] fileArrListFiles = this.f99853c.listFiles();
        long length = 0;
        if (fileArrListFiles != null) {
            int length2 = fileArrListFiles.length;
            int i10 = 0;
            while (i10 < length2) {
                File file = fileArrListFiles[i10];
                i10++;
                length += file.length();
            }
        }
        return length;
    }

    @NotNull
    public String toString() {
        return "{FileLruCache: tag:" + this.f99851a + " file:" + ((Object) this.f99853c.getName()) + AbstractJsonLexerKt.END_OBJ;
    }

    private static final class d extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final InputStream f99865a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final OutputStream f99866b;

        public d(@NotNull InputStream input, @NotNull OutputStream output) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(output, "output");
            this.f99865a = input;
            this.f99866b = output;
        }

        @NotNull
        public final InputStream a() {
            return this.f99865a;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f99865a.available();
        }

        @NotNull
        public final OutputStream b() {
            return this.f99866b;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                this.f99865a.close();
            } finally {
                this.f99866b.close();
            }
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return false;
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] buffer) throws IOException {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            int i10 = this.f99865a.read(buffer);
            if (i10 > 0) {
                this.f99866b.write(buffer, 0, i10);
            }
            return i10;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            try {
                throw new UnsupportedOperationException();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.InputStream
        public long skip(long j10) throws IOException {
            int i10;
            byte[] bArr = new byte[1024];
            long j11 = 0;
            while (j11 < j10 && (i10 = read(bArr, 0, (int) Math.min(j10 - j11, 1024))) >= 0) {
                j11 += (long) i10;
            }
            return j11;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            int i10 = this.f99865a.read();
            if (i10 >= 0) {
                this.f99866b.write(i10);
            }
            return i10;
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] buffer, int i10, int i11) throws IOException {
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            int i12 = this.f99865a.read(buffer, i10, i11);
            if (i12 > 0) {
                this.f99866b.write(buffer, i10, i12);
            }
            return i12;
        }
    }
}
