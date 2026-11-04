package com.google.api.client.http.javanet;

import com.google.api.client.http.f0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class d extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f115642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f115643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f115644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<String> f115645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList<String> f115646e;

    d(HttpURLConnection httpURLConnection) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f115645d = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.f115646e = arrayList2;
        this.f115642a = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        this.f115643b = responseCode == -1 ? 0 : responseCode;
        this.f115644c = httpURLConnection.getResponseMessage();
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                for (String str : entry.getValue()) {
                    if (str != null) {
                        arrayList.add(key);
                        arrayList2.add(str);
                    }
                }
            }
        }
    }

    @Override // com.google.api.client.http.f0
    public void a() {
        this.f115642a.disconnect();
    }

    @Override // com.google.api.client.http.f0
    public InputStream b() throws IOException {
        InputStream errorStream;
        try {
            errorStream = this.f115642a.getInputStream();
        } catch (IOException unused) {
            errorStream = this.f115642a.getErrorStream();
        }
        if (errorStream == null) {
            return null;
        }
        return new a(errorStream);
    }

    @Override // com.google.api.client.http.f0
    public String c() {
        return this.f115642a.getContentEncoding();
    }

    @Override // com.google.api.client.http.f0
    public long d() {
        String headerField = this.f115642a.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1L;
        }
        return Long.parseLong(headerField);
    }

    @Override // com.google.api.client.http.f0
    public String e() {
        return this.f115642a.getHeaderField("Content-Type");
    }

    @Override // com.google.api.client.http.f0
    public int f() {
        return this.f115645d.size();
    }

    @Override // com.google.api.client.http.f0
    public String g(int i10) {
        return this.f115645d.get(i10);
    }

    @Override // com.google.api.client.http.f0
    public String h(int i10) {
        return this.f115646e.get(i10);
    }

    @Override // com.google.api.client.http.f0
    public String i() {
        return this.f115644c;
    }

    @Override // com.google.api.client.http.f0
    public int j() {
        return this.f115643b;
    }

    @Override // com.google.api.client.http.f0
    public String k() {
        String headerField = this.f115642a.getHeaderField(0);
        if (headerField == null || !headerField.startsWith("HTTP/1.")) {
            return null;
        }
        return headerField;
    }

    private final class a extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f115647a;

        public a(InputStream inputStream) {
            super(inputStream);
            this.f115647a = 0L;
        }

        private void a() throws IOException {
            long jD = d.this.d();
            if (jD == -1) {
                return;
            }
            long j10 = this.f115647a;
            if (j10 == 0 || j10 >= jD) {
                return;
            }
            throw new IOException("Connection closed prematurely: bytesRead = " + this.f115647a + ", Content-Length = " + jD);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
            if (i12 == -1) {
                a();
                return i12;
            }
            this.f115647a += (long) i12;
            return i12;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i10 = ((FilterInputStream) this).in.read();
            if (i10 == -1) {
                a();
                return i10;
            }
            this.f115647a++;
            return i10;
        }
    }
}
