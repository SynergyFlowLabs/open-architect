package com.bumptech.glide.disklrucache;

import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Closeable {
    static final long X = -1;
    private static final String Y = "CLEAN";
    private static final String Z = "DIRTY";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final String f95973o = "journal";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final String f95974p0 = "REMOVE";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final String f95975p1 = "READ";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final String f95976s = "journal.tmp";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final String f95977t = "journal.bkp";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final String f95978v = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final String f95979w = "1";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f95980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f95981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f95982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f95983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f95984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f95985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f95986g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Writer f95988i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f95990k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f95987h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LinkedHashMap<String, d> f95989j = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f95991l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final ThreadPoolExecutor f95992m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Callable<Void> f95993n = new CallableC0850a();

    /* JADX INFO: renamed from: com.bumptech.glide.disklrucache.a$a, reason: collision with other inner class name */
    class CallableC0850a implements Callable<Void> {
        CallableC0850a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (a.this) {
                try {
                    if (a.this.f95988i == null) {
                        return null;
                    }
                    a.this.r0();
                    if (a.this.T()) {
                        a.this.g0();
                        a.this.f95990k = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ b(CallableC0850a callableC0850a) {
            this();
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f95995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f95996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f95997c;

        /* synthetic */ c(a aVar, d dVar, CallableC0850a callableC0850a) {
            this(dVar);
        }

        private InputStream h(int i10) throws IOException {
            synchronized (a.this) {
                try {
                    if (this.f95995a.f96004f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f95995a.f96003e) {
                        return null;
                    }
                    try {
                        return new FileInputStream(this.f95995a.j(i10));
                    } catch (FileNotFoundException unused) {
                        return null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void a() throws IOException {
            a.this.q(this, false);
        }

        public void b() {
            if (!this.f95997c) {
                try {
                    a();
                } catch (IOException unused) {
                }
            }
        }

        public void e() throws IOException {
            a.this.q(this, true);
            this.f95997c = true;
        }

        public File f(int i10) throws IOException {
            File fileK;
            synchronized (a.this) {
                try {
                    if (this.f95995a.f96004f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f95995a.f96003e) {
                        this.f95996b[i10] = true;
                    }
                    fileK = this.f95995a.k(i10);
                    if (!a.this.f95980a.exists()) {
                        a.this.f95980a.mkdirs();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fileK;
        }

        public String g(int i10) throws IOException {
            InputStream inputStreamH = h(i10);
            if (inputStreamH != null) {
                return a.R(inputStreamH);
            }
            return null;
        }

        public void i(int i10, String str) throws Throwable {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(f(i10)), com.bumptech.glide.disklrucache.c.f96021b);
                try {
                    outputStreamWriter2.write(str);
                    com.bumptech.glide.disklrucache.c.a(outputStreamWriter2);
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = outputStreamWriter2;
                    com.bumptech.glide.disklrucache.c.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private c(d dVar) {
            boolean[] zArr;
            this.f95995a = dVar;
            if (dVar.f96003e) {
                zArr = null;
                int i10 = 7 & 0;
            } else {
                zArr = new boolean[a.this.f95986g];
            }
            this.f95996b = zArr;
        }
    }

    private final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f95999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f96000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        File[] f96001c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        File[] f96002d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f96003e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c f96004f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f96005g;

        /* synthetic */ d(a aVar, String str, CallableC0850a callableC0850a) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != a.this.f95986g) {
                throw m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f96000b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i10) {
            return this.f96001c[i10];
        }

        public File k(int i10) {
            return this.f96002d[i10];
        }

        public String l() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f96000b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        private d(String str) {
            this.f95999a = str;
            this.f96000b = new long[a.this.f95986g];
            this.f96001c = new File[a.this.f95986g];
            this.f96002d = new File[a.this.f95986g];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < a.this.f95986g; i10++) {
                sb2.append(i10);
                this.f96001c[i10] = new File(a.this.f95980a, sb2.toString());
                sb2.append(".tmp");
                this.f96002d[i10] = new File(a.this.f95980a, sb2.toString());
                sb2.setLength(length);
            }
        }
    }

    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f96007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f96008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long[] f96009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final File[] f96010d;

        /* synthetic */ e(a aVar, String str, long j10, File[] fileArr, long[] jArr, CallableC0850a callableC0850a) {
            this(str, j10, fileArr, jArr);
        }

        public c a() throws IOException {
            return a.this.y(this.f96007a, this.f96008b);
        }

        public File b(int i10) {
            return this.f96010d[i10];
        }

        public long c(int i10) {
            return this.f96009c[i10];
        }

        public String d(int i10) throws IOException {
            return a.R(new FileInputStream(this.f96010d[i10]));
        }

        private e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f96007a = str;
            this.f96008b = j10;
            this.f96010d = fileArr;
            this.f96009c = jArr;
        }
    }

    private a(File file, int i10, int i11, long j10) {
        this.f95980a = file;
        this.f95984e = i10;
        this.f95981b = new File(file, "journal");
        this.f95982c = new File(file, "journal.tmp");
        this.f95983d = new File(file, "journal.bkp");
        this.f95986g = i11;
        this.f95985f = j10;
    }

    @e.b(26)
    private static void E(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String R(InputStream inputStream) throws IOException {
        return com.bumptech.glide.disklrucache.c.c(new InputStreamReader(inputStream, com.bumptech.glide.disklrucache.c.f96021b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean T() {
        int i10 = this.f95990k;
        return i10 >= 2000 && i10 >= this.f95989j.size();
    }

    public static a X(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                k0(file2, file3, false);
            }
        }
        a aVar = new a(file, i10, i11, j10);
        if (aVar.f95981b.exists()) {
            try {
                aVar.d0();
                aVar.Y();
                return aVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                aVar.r();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i10, i11, j10);
        aVar2.g0();
        return aVar2;
    }

    private void Y() throws IOException {
        t(this.f95982c);
        Iterator<d> it = this.f95989j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f96004f == null) {
                while (i10 < this.f95986g) {
                    this.f95987h += next.f96000b[i10];
                    i10++;
                }
            } else {
                next.f96004f = null;
                while (i10 < this.f95986g) {
                    t(next.j(i10));
                    t(next.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private void d0() throws IOException {
        com.bumptech.glide.disklrucache.b bVar = new com.bumptech.glide.disklrucache.b(new FileInputStream(this.f95981b), com.bumptech.glide.disklrucache.c.f96020a);
        try {
            String strD = bVar.d();
            String strD2 = bVar.d();
            String strD3 = bVar.d();
            String strD4 = bVar.d();
            String strD5 = bVar.d();
            if (!"libcore.io.DiskLruCache".equals(strD) || !"1".equals(strD2) || !Integer.toString(this.f95984e).equals(strD3) || !Integer.toString(this.f95986g).equals(strD4) || !"".equals(strD5)) {
                throw new IOException("unexpected journal header: [" + strD + ", " + strD2 + ", " + strD4 + ", " + strD5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    f0(bVar.d());
                    i10++;
                } catch (EOFException unused) {
                    this.f95990k = i10 - this.f95989j.size();
                    if (bVar.c()) {
                        g0();
                    } else {
                        this.f95988i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f95981b, true), com.bumptech.glide.disklrucache.c.f96020a));
                    }
                    com.bumptech.glide.disklrucache.c.a(bVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            com.bumptech.glide.disklrucache.c.a(bVar);
            throw th2;
        }
    }

    private void f0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith(f95974p0)) {
                this.f95989j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = this.f95989j.get(strSubstring);
        CallableC0850a callableC0850a = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, callableC0850a);
            this.f95989j.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(Y)) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f96003e = true;
            dVar.f96004f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(Z)) {
            dVar.f96004f = new c(this, dVar, callableC0850a);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith(f95975p1)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void g0() throws IOException {
        try {
            Writer writer = this.f95988i;
            if (writer != null) {
                o(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f95982c), com.bumptech.glide.disklrucache.c.f96020a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f95984e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f95986g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f95989j.values()) {
                    if (dVar.f96004f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f95999a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f95999a + dVar.l() + '\n');
                    }
                }
                o(bufferedWriter);
                if (this.f95981b.exists()) {
                    k0(this.f95981b, this.f95983d, true);
                }
                k0(this.f95982c, this.f95981b, false);
                this.f95983d.delete();
                this.f95988i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f95981b, true), com.bumptech.glide.disklrucache.c.f96020a));
            } catch (Throwable th2) {
                o(bufferedWriter);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private static void k0(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            t(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private void m() {
        if (this.f95988i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @e.b(26)
    private static void o(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
            StrictMode.setThreadPolicy(threadPolicy);
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void q(c cVar, boolean z10) throws IOException {
        try {
            d dVar = cVar.f95995a;
            if (dVar.f96004f != cVar) {
                throw new IllegalStateException();
            }
            if (z10 && !dVar.f96003e) {
                for (int i10 = 0; i10 < this.f95986g; i10++) {
                    if (!cVar.f95996b[i10]) {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                    if (!dVar.k(i10).exists()) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i11 = 0; i11 < this.f95986g; i11++) {
                File fileK = dVar.k(i11);
                if (!z10) {
                    t(fileK);
                } else if (fileK.exists()) {
                    File fileJ = dVar.j(i11);
                    fileK.renameTo(fileJ);
                    long j10 = dVar.f96000b[i11];
                    long length = fileJ.length();
                    dVar.f96000b[i11] = length;
                    this.f95987h = (this.f95987h - j10) + length;
                }
            }
            this.f95990k++;
            dVar.f96004f = null;
            if (dVar.f96003e || z10) {
                dVar.f96003e = true;
                this.f95988i.append((CharSequence) Y);
                this.f95988i.append(' ');
                this.f95988i.append((CharSequence) dVar.f95999a);
                this.f95988i.append((CharSequence) dVar.l());
                this.f95988i.append('\n');
                if (z10) {
                    long j11 = this.f95991l;
                    this.f95991l = 1 + j11;
                    dVar.f96005g = j11;
                }
            } else {
                this.f95989j.remove(dVar.f95999a);
                this.f95988i.append((CharSequence) f95974p0);
                this.f95988i.append(' ');
                this.f95988i.append((CharSequence) dVar.f95999a);
                this.f95988i.append('\n');
            }
            E(this.f95988i);
            if (this.f95987h > this.f95985f || T()) {
                this.f95992m.submit(this.f95993n);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0() throws IOException {
        while (this.f95987h > this.f95985f) {
            j0(this.f95989j.entrySet().iterator().next().getKey());
        }
    }

    private static void t(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized c y(String str, long j10) throws IOException {
        try {
            m();
            d dVar = this.f95989j.get(str);
            CallableC0850a callableC0850a = null;
            if (j10 == -1 || (dVar != null && dVar.f96005g == j10)) {
                if (dVar == null) {
                    dVar = new d(this, str, callableC0850a);
                    this.f95989j.put(str, dVar);
                } else if (dVar.f96004f != null) {
                    return null;
                }
                c cVar = new c(this, dVar, callableC0850a);
                dVar.f96004f = cVar;
                this.f95988i.append((CharSequence) Z);
                this.f95988i.append(' ');
                this.f95988i.append((CharSequence) str);
                this.f95988i.append('\n');
                E(this.f95988i);
                return cVar;
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized e H(String str) throws IOException {
        Throwable th2;
        try {
            try {
                m();
                d dVar = this.f95989j.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f96003e) {
                    return null;
                }
                for (File file : dVar.f96001c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                this.f95990k++;
                this.f95988i.append((CharSequence) f95975p1);
                this.f95988i.append(' ');
                this.f95988i.append((CharSequence) str);
                this.f95988i.append('\n');
                if (T()) {
                    this.f95992m.submit(this.f95993n);
                }
                return new e(this, str, dVar.f96005g, dVar.f96001c, dVar.f96000b, null);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
        }
        throw th2;
    }

    public File I() {
        return this.f95980a;
    }

    public synchronized long N() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f95985f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f95988i == null) {
                return;
            }
            for (d dVar : new ArrayList(this.f95989j.values())) {
                if (dVar.f96004f != null) {
                    dVar.f96004f.a();
                }
            }
            r0();
            o(this.f95988i);
            this.f95988i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void flush() throws IOException {
        try {
            m();
            r0();
            E(this.f95988i);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean isClosed() {
        return this.f95988i == null;
    }

    public synchronized boolean j0(String str) throws IOException {
        try {
            m();
            d dVar = this.f95989j.get(str);
            if (dVar != null && dVar.f96004f == null) {
                for (int i10 = 0; i10 < this.f95986g; i10++) {
                    File fileJ = dVar.j(i10);
                    if (fileJ.exists() && !fileJ.delete()) {
                        throw new IOException("failed to delete " + fileJ);
                    }
                    this.f95987h -= dVar.f96000b[i10];
                    dVar.f96000b[i10] = 0;
                }
                this.f95990k++;
                this.f95988i.append((CharSequence) f95974p0);
                this.f95988i.append(' ');
                this.f95988i.append((CharSequence) str);
                this.f95988i.append('\n');
                this.f95989j.remove(str);
                if (T()) {
                    this.f95992m.submit(this.f95993n);
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void o0(long j10) {
        try {
            this.f95985f = j10;
            this.f95992m.submit(this.f95993n);
        } finally {
        }
    }

    public void r() throws IOException {
        close();
        com.bumptech.glide.disklrucache.c.b(this.f95980a);
    }

    public synchronized long size() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f95987h;
    }

    public c x(String str) throws IOException {
        return y(str, -1L);
    }
}
