package com.google.api.client.googleapis.batch;

import com.google.api.client.http.a0;
import com.google.api.client.http.b0;
import com.google.api.client.http.c0;
import com.google.api.client.http.e0;
import com.google.api.client.http.f0;
import com.google.api.client.http.j;
import com.google.api.client.http.m;
import com.google.api.client.http.q;
import com.google.api.client.http.u;
import com.google.api.client.http.x;
import com.google.api.client.util.i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f115385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.google.api.client.googleapis.batch.b.C1014b<?, ?>> f115386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InputStream f115387c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f115390f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f115392h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f115388d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    List<com.google.api.client.googleapis.batch.b.C1014b<?, ?>> f115389e = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f115391g = 0;

    class a extends FilterInputStream {
        a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    private static class b extends e0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private InputStream f115394e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f115395f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List<String> f115396g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private List<String> f115397h;

        b(InputStream inputStream, int i10, List<String> list, List<String> list2) {
            this.f115394e = inputStream;
            this.f115395f = i10;
            this.f115396g = list;
            this.f115397h = list2;
        }

        @Override // com.google.api.client.http.e0
        public void a(String str, String str2) {
        }

        @Override // com.google.api.client.http.e0
        public f0 b() {
            return new C1015c(this.f115394e, this.f115395f, this.f115396g, this.f115397h);
        }
    }

    /* JADX INFO: renamed from: com.google.api.client.googleapis.batch.c$c, reason: collision with other inner class name */
    private static class C1015c extends f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InputStream f115398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f115399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f115400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List<String> f115401d;

        C1015c(InputStream inputStream, int i10, List<String> list, List<String> list2) {
            this.f115400c = new ArrayList();
            new ArrayList();
            this.f115398a = inputStream;
            this.f115399b = i10;
            this.f115400c = list;
            this.f115401d = list2;
        }

        @Override // com.google.api.client.http.f0
        public InputStream b() {
            return this.f115398a;
        }

        @Override // com.google.api.client.http.f0
        public String c() {
            return null;
        }

        @Override // com.google.api.client.http.f0
        public long d() {
            return 0L;
        }

        @Override // com.google.api.client.http.f0
        public String e() {
            return null;
        }

        @Override // com.google.api.client.http.f0
        public int f() {
            return this.f115400c.size();
        }

        @Override // com.google.api.client.http.f0
        public String g(int i10) {
            return this.f115400c.get(i10);
        }

        @Override // com.google.api.client.http.f0
        public String h(int i10) {
            return this.f115401d.get(i10);
        }

        @Override // com.google.api.client.http.f0
        public String i() {
            return null;
        }

        @Override // com.google.api.client.http.f0
        public int j() {
            return this.f115399b;
        }

        @Override // com.google.api.client.http.f0
        public String k() {
            return null;
        }
    }

    private static class d extends b0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f115402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private InputStream f115403d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<String> f115404e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List<String> f115405f;

        d(int i10, InputStream inputStream, List<String> list, List<String> list2) {
            this.f115402c = i10;
            this.f115403d = inputStream;
            this.f115404e = list;
            this.f115405f = list2;
        }

        @Override // com.google.api.client.http.b0
        protected e0 b(String str, String str2) {
            return new b(this.f115403d, this.f115402c, this.f115404e, this.f115405f);
        }
    }

    c(InputStream inputStream, String str, List<com.google.api.client.googleapis.batch.b.C1014b<?, ?>> list, boolean z10) throws IOException {
        this.f115385a = str;
        this.f115386b = list;
        this.f115392h = z10;
        this.f115387c = inputStream;
        a(f());
    }

    private void a(String str) throws IOException {
        if (str.equals(this.f115385a + "--")) {
            this.f115388d = false;
            this.f115387c.close();
        }
    }

    private x b(int i10, InputStream inputStream, List<String> list, List<String> list2) throws IOException {
        u uVarE = new d(i10, inputStream, list, list2).c().e(new j(com.google.api.client.testing.http.b.f115977a), null);
        uVarE.M(false);
        uVarE.W(false);
        return uVarE.a();
    }

    private <A, T, E> A c(Class<A> cls, x xVar, com.google.api.client.googleapis.batch.b.C1014b<T, E> c1014b) throws IOException {
        if (cls == Void.class) {
            return null;
        }
        return (A) c1014b.f115384d.n().a(xVar.c(), xVar.d(), cls);
    }

    private <T, E> void d(com.google.api.client.googleapis.batch.b.C1014b<T, E> c1014b, int i10, x xVar) throws IOException {
        com.google.api.client.googleapis.batch.a<T, E> aVar = c1014b.f115381a;
        q qVarH = xVar.h();
        c0 c0VarX = c1014b.f115384d.x();
        com.google.api.client.http.c cVarD = c1014b.f115384d.d();
        boolean z10 = false;
        this.f115390f = false;
        if (!a0.b(i10)) {
            m mVarF = c1014b.f115384d.f();
            boolean z11 = this.f115392h && (mVarF == null || mVarF.a());
            boolean zC = c0VarX != null ? c0VarX.c(c1014b.f115384d, xVar, z11) : false;
            if (!zC) {
                if (c1014b.f115384d.z(xVar.k(), xVar.h())) {
                    z10 = true;
                } else if (z11 && cVarD != null && cVarD.b(xVar.k())) {
                    this.f115390f = true;
                }
            }
            if (z11 && (zC || this.f115390f || z10)) {
                this.f115389e.add(c1014b);
            } else if (aVar != null) {
                aVar.a((E) c(c1014b.f115383c, xVar, c1014b), qVarH);
            }
        } else if (aVar != null) {
            aVar.b((T) c(c1014b.f115382b, xVar, c1014b), qVarH);
        }
    }

    private String f() throws IOException {
        return i(g());
    }

    private String g() throws IOException {
        int i10 = this.f115387c.read();
        int i11 = 6 ^ (-1);
        if (i10 == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        while (i10 != -1) {
            sb2.append((char) i10);
            if (i10 == 10) {
                break;
            }
            i10 = this.f115387c.read();
        }
        return sb2.toString();
    }

    private static InputStream h(byte[] bArr) {
        int length = bArr.length;
        if (length > 0 && bArr[length - 1] == 10) {
            length--;
        }
        if (length > 0 && bArr[length - 1] == 13) {
            length--;
        }
        return new ByteArrayInputStream(bArr, 0, length);
    }

    private static String i(String str) {
        if (str.endsWith("\r\n")) {
            return str.substring(0, str.length() - 2);
        }
        return str.endsWith("\n") ? str.substring(0, str.length() - 1) : str;
    }

    void e() throws IOException {
        String strF;
        String strF2;
        InputStream aVar;
        String strG;
        boolean z10 = !true;
        this.f115391g++;
        do {
            strF = f();
            if (strF == null) {
                break;
            }
        } while (!strF.equals(""));
        int i10 = Integer.parseInt(f().split(" ")[1]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long j10 = -1;
        while (true) {
            strF2 = f();
            if (strF2 == null || strF2.equals("")) {
                break;
            }
            String[] strArrSplit = strF2.split(": ", 2);
            String str = strArrSplit[0];
            String str2 = strArrSplit[1];
            arrayList.add(str);
            arrayList2.add(str2);
            if ("Content-Length".equalsIgnoreCase(str.trim())) {
                j10 = Long.parseLong(str2);
            }
        }
        if (j10 == -1) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                strG = g();
                if (strG == null || strG.startsWith(this.f115385a)) {
                    break;
                } else {
                    byteArrayOutputStream.write(strG.getBytes("ISO-8859-1"));
                }
            }
            aVar = h(byteArrayOutputStream.toByteArray());
            strF2 = i(strG);
        } else {
            aVar = new a(i.b(this.f115387c, j10));
        }
        d(this.f115386b.get(this.f115391g - 1), i10, b(i10, aVar, arrayList, arrayList2));
        while (true) {
            if (aVar.skip(j10) <= 0 && aVar.read() == -1) {
                break;
            }
        }
        if (j10 != -1) {
            strF2 = f();
        }
        while (strF2 != null && strF2.length() == 0) {
            strF2 = f();
        }
        a(strF2);
    }
}
