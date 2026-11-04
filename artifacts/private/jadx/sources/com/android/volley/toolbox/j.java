package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.l1;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class j implements com.android.volley.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f89561e = 5242880;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l1
    static final float f89562f = 0.9f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f89563g = 538247942;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, b> f89564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f89565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f89566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f89567d;

    class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f89568a;

        a(File file) {
            this.f89568a = file;
        }

        @Override // com.android.volley.toolbox.j.d
        public File get() {
            return this.f89568a;
        }
    }

    public interface d {
        File get();
    }

    public j(File file, int i10) {
        this.f89564a = new LinkedHashMap(16, 0.75f, true);
        this.f89565b = 0L;
        this.f89566c = new a(file);
        this.f89567d = i10;
    }

    private String f(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    private void g() {
        if (!this.f89566c.get().exists()) {
            com.android.volley.b0.b("Re-initializing cache after external clearing.", new Object[0]);
            this.f89564a.clear();
            this.f89565b = 0L;
            initialize();
        }
    }

    private void h() {
        if (this.f89565b < this.f89567d) {
            return;
        }
        int i10 = 0;
        if (com.android.volley.b0.f89376b) {
            com.android.volley.b0.f("Pruning old cache entries.", new Object[0]);
        }
        long j10 = this.f89565b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, b>> it = this.f89564a.entrySet().iterator();
        while (it.hasNext()) {
            b value = it.next().getValue();
            if (e(value.f89571b).delete()) {
                this.f89565b -= value.f89570a;
            } else {
                String str = value.f89571b;
                com.android.volley.b0.b("Could not delete cache entry for key=%s, filename=%s", str, f(str));
            }
            it.remove();
            i10++;
            if (this.f89565b < this.f89567d * f89562f) {
                break;
            }
        }
        if (com.android.volley.b0.f89376b) {
            com.android.volley.b0.f("pruned %d files, %d bytes, %d ms", Integer.valueOf(i10), Long.valueOf(this.f89565b - j10), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    private void i(String str, b bVar) {
        if (this.f89564a.containsKey(str)) {
            this.f89565b += bVar.f89570a - this.f89564a.get(str).f89570a;
        } else {
            this.f89565b += bVar.f89570a;
        }
        this.f89564a.put(str, bVar);
    }

    private static int j(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            return i10;
        }
        throw new EOFException();
    }

    static List<com.android.volley.k> k(c cVar) throws IOException {
        int iL = l(cVar);
        if (iL < 0) {
            throw new IOException("readHeaderList size=" + iL);
        }
        List<com.android.volley.k> arrayList = iL == 0 ? Collections.EMPTY_LIST : new ArrayList<>();
        for (int i10 = 0; i10 < iL; i10++) {
            arrayList.add(new com.android.volley.k(n(cVar).intern(), n(cVar).intern()));
        }
        return arrayList;
    }

    static int l(InputStream inputStream) throws IOException {
        return (j(inputStream) << 24) | j(inputStream) | (j(inputStream) << 8) | (j(inputStream) << 16);
    }

    static long m(InputStream inputStream) throws IOException {
        return (((long) j(inputStream)) & 255) | ((((long) j(inputStream)) & 255) << 8) | ((((long) j(inputStream)) & 255) << 16) | ((((long) j(inputStream)) & 255) << 24) | ((((long) j(inputStream)) & 255) << 32) | ((((long) j(inputStream)) & 255) << 40) | ((((long) j(inputStream)) & 255) << 48) | ((255 & ((long) j(inputStream))) << 56);
    }

    static String n(c cVar) throws IOException {
        return new String(p(cVar, m(cVar)), "UTF-8");
    }

    private void o(String str) {
        b bVarRemove = this.f89564a.remove(str);
        if (bVarRemove != null) {
            this.f89565b -= bVarRemove.f89570a;
        }
    }

    @l1
    static byte[] p(c cVar, long j10) throws IOException {
        long jB = cVar.b();
        if (j10 >= 0 && j10 <= jB) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(cVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j10 + ", maxLength=" + jB);
    }

    static void q(List<com.android.volley.k> list, OutputStream outputStream) throws IOException {
        if (list == null) {
            r(outputStream, 0);
            return;
        }
        r(outputStream, list.size());
        for (com.android.volley.k kVar : list) {
            t(outputStream, kVar.a());
            t(outputStream, kVar.b());
        }
    }

    static void r(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10 & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    static void s(OutputStream outputStream, long j10) throws IOException {
        outputStream.write((byte) j10);
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 48));
        outputStream.write((byte) (j10 >>> 56));
    }

    static void t(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        s(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // com.android.volley.f
    public synchronized void a(String str, boolean z10) {
        try {
            com.android.volley.f.a aVar = get(str);
            if (aVar != null) {
                aVar.f89438f = 0L;
                if (z10) {
                    aVar.f89437e = 0L;
                }
                b(str, aVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.android.volley.f
    public synchronized void b(String str, com.android.volley.f.a aVar) {
        try {
            long j10 = this.f89565b;
            byte[] bArr = aVar.f89433a;
            long length = j10 + ((long) bArr.length);
            int i10 = this.f89567d;
            if (length > i10 && bArr.length > i10 * f89562f) {
                return;
            }
            File fileE = e(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(d(fileE));
                b bVar = new b(str, aVar);
                if (!bVar.d(bufferedOutputStream)) {
                    bufferedOutputStream.close();
                    com.android.volley.b0.b("Failed to write header for %s", fileE.getAbsolutePath());
                    throw new IOException();
                }
                bufferedOutputStream.write(aVar.f89433a);
                bufferedOutputStream.close();
                bVar.f89570a = fileE.length();
                i(str, bVar);
                h();
            } catch (IOException unused) {
                if (!fileE.delete()) {
                    com.android.volley.b0.b("Could not clean up file %s", fileE.getAbsolutePath());
                }
                g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @l1
    InputStream c(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    @Override // com.android.volley.f
    public synchronized void clear() {
        try {
            File[] fileArrListFiles = this.f89566c.get().listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
            this.f89564a.clear();
            this.f89565b = 0L;
            com.android.volley.b0.b("Cache cleared.", new Object[0]);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @l1
    OutputStream d(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    public File e(String str) {
        return new File(this.f89566c.get(), f(str));
    }

    @Override // com.android.volley.f
    public synchronized com.android.volley.f.a get(String str) {
        b bVar = this.f89564a.get(str);
        if (bVar == null) {
            return null;
        }
        File fileE = e(str);
        try {
            c cVar = new c(new BufferedInputStream(c(fileE)), fileE.length());
            try {
                b bVarB = b.b(cVar);
                if (TextUtils.equals(str, bVarB.f89571b)) {
                    com.android.volley.f.a aVarC = bVar.c(p(cVar, cVar.b()));
                    cVar.close();
                    return aVarC;
                }
                com.android.volley.b0.b("%s: key=%s, found=%s", fileE.getAbsolutePath(), str, bVarB.f89571b);
                o(str);
                cVar.close();
                return null;
            } catch (Throwable th2) {
                cVar.close();
                throw th2;
            }
        } catch (IOException e10) {
            com.android.volley.b0.b("%s: %s", fileE.getAbsolutePath(), e10.toString());
            remove(str);
            return null;
        }
    }

    @Override // com.android.volley.f
    public synchronized void initialize() {
        try {
            File file = this.f89566c.get();
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    com.android.volley.b0.c("Unable to create cache dir %s", file.getAbsolutePath());
                }
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                try {
                    long length = file2.length();
                    c cVar = new c(new BufferedInputStream(c(file2)), length);
                    try {
                        b bVarB = b.b(cVar);
                        bVarB.f89570a = length;
                        i(bVarB.f89571b, bVarB);
                        cVar.close();
                    } catch (Throwable th2) {
                        cVar.close();
                        throw th2;
                    }
                } catch (IOException unused) {
                    file2.delete();
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.android.volley.f
    public synchronized void remove(String str) {
        try {
            boolean zDelete = e(str).delete();
            o(str);
            if (!zDelete) {
                com.android.volley.b0.b("Could not delete cache entry for key=%s, filename=%s", str, f(str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @l1
    static class c extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f89578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f89579b;

        c(InputStream inputStream, long j10) {
            super(inputStream);
            this.f89578a = j10;
        }

        @l1
        long a() {
            return this.f89579b;
        }

        long b() {
            return this.f89578a - this.f89579b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i10 = super.read();
            if (i10 != -1) {
                this.f89579b++;
            }
            return i10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = super.read(bArr, i10, i11);
            if (i12 != -1) {
                this.f89579b += (long) i12;
            }
            return i12;
        }
    }

    public j(d dVar, int i10) {
        this.f89564a = new LinkedHashMap(16, 0.75f, true);
        this.f89565b = 0L;
        this.f89566c = dVar;
        this.f89567d = i10;
    }

    @l1
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f89570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f89571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f89572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f89573d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final long f89574e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final long f89575f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final long f89576g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final List<com.android.volley.k> f89577h;

        private b(String str, String str2, long j10, long j11, long j12, long j13, List<com.android.volley.k> list) {
            this.f89571b = str;
            this.f89572c = "".equals(str2) ? null : str2;
            this.f89573d = j10;
            this.f89574e = j11;
            this.f89575f = j12;
            this.f89576g = j13;
            this.f89577h = list;
        }

        private static List<com.android.volley.k> a(com.android.volley.f.a aVar) {
            List<com.android.volley.k> list = aVar.f89440h;
            return list != null ? list : m.i(aVar.f89439g);
        }

        static b b(c cVar) throws IOException {
            if (j.l(cVar) == j.f89563g) {
                return new b(j.n(cVar), j.n(cVar), j.m(cVar), j.m(cVar), j.m(cVar), j.m(cVar), j.k(cVar));
            }
            throw new IOException();
        }

        com.android.volley.f.a c(byte[] bArr) {
            com.android.volley.f.a aVar = new com.android.volley.f.a();
            aVar.f89433a = bArr;
            aVar.f89434b = this.f89572c;
            aVar.f89435c = this.f89573d;
            aVar.f89436d = this.f89574e;
            aVar.f89437e = this.f89575f;
            aVar.f89438f = this.f89576g;
            aVar.f89439g = m.j(this.f89577h);
            aVar.f89440h = Collections.unmodifiableList(this.f89577h);
            return aVar;
        }

        boolean d(OutputStream outputStream) {
            try {
                j.r(outputStream, j.f89563g);
                j.t(outputStream, this.f89571b);
                String str = this.f89572c;
                if (str == null) {
                    str = "";
                }
                j.t(outputStream, str);
                j.s(outputStream, this.f89573d);
                j.s(outputStream, this.f89574e);
                j.s(outputStream, this.f89575f);
                j.s(outputStream, this.f89576g);
                j.q(this.f89577h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e10) {
                com.android.volley.b0.b("%s", e10.toString());
                return false;
            }
        }

        b(String str, com.android.volley.f.a aVar) {
            this(str, aVar.f89434b, aVar.f89435c, aVar.f89436d, aVar.f89437e, aVar.f89438f, a(aVar));
        }
    }

    public j(File file) {
        this(file, f89561e);
    }

    public j(d dVar) {
        this(dVar, f89561e);
    }
}
