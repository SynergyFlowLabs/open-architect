package com.fasterxml.jackson.core;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.CharArrayReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public class f implements w, Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f102305k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f102306l = "JSON";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected static final int f102307m = a.k();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected static final int f102308n = JsonParser.a.k();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected static final int f102309o = h.b.k();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final s f102310s = com.fasterxml.jackson.core.util.e.f102806i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final transient com.fasterxml.jackson.core.sym.b f102311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final transient com.fasterxml.jackson.core.sym.a f102312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected q f102313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f102314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f102315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f102316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected com.fasterxml.jackson.core.io.b f102317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected com.fasterxml.jackson.core.io.e f102318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected com.fasterxml.jackson.core.io.k f102319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected s f102320j;

    public enum a {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f102326a;

        a(boolean z10) {
            this.f102326a = z10;
        }

        public static int k() {
            int iO = 0;
            for (a aVar : values()) {
                if (aVar.l()) {
                    iO |= aVar.o();
                }
            }
            return iO;
        }

        public boolean l() {
            return this.f102326a;
        }

        public boolean n(int i10) {
            return (o() & i10) != 0;
        }

        public int o() {
            return 1 << ordinal();
        }
    }

    public f() {
        this(null);
    }

    private final boolean r() {
        return l0() == f102306l;
    }

    private final void t(String str) {
        if (!r()) {
            throw new UnsupportedOperationException(String.format(str, l0()));
        }
    }

    public final f A(JsonParser.a aVar, boolean z10) {
        return z10 ? i0(aVar) : f0(aVar);
    }

    public f A0(com.fasterxml.jackson.core.io.e eVar) {
        this.f102318h = eVar;
        return this;
    }

    public f B() {
        a(f.class);
        return new f(this, null);
    }

    public f B0(com.fasterxml.jackson.core.io.k kVar) {
        this.f102319i = kVar;
        return this;
    }

    public h C(DataOutput dataOutput) throws IOException {
        return G(c(dataOutput), e.UTF8);
    }

    public f C0(String str) {
        this.f102320j = str == null ? null : new com.fasterxml.jackson.core.io.m(str);
        return this;
    }

    public h D(DataOutput dataOutput, e eVar) throws IOException {
        return G(c(dataOutput), eVar);
    }

    public h E(File file, e eVar) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream(file);
        com.fasterxml.jackson.core.io.d dVarB = b(fileOutputStream, true);
        dVarB.x(eVar);
        return eVar == e.UTF8 ? j(n(fileOutputStream, dVarB), dVarB) : d(p(k(fileOutputStream, eVar, dVarB), dVarB), dVarB);
    }

    public h F(OutputStream outputStream) throws IOException {
        return G(outputStream, e.UTF8);
    }

    public h G(OutputStream outputStream, e eVar) throws IOException {
        com.fasterxml.jackson.core.io.d dVarB = b(outputStream, false);
        dVarB.x(eVar);
        return eVar == e.UTF8 ? j(n(outputStream, dVarB), dVarB) : d(p(k(outputStream, eVar, dVarB), dVarB), dVarB);
    }

    public h H(Writer writer) throws IOException {
        com.fasterxml.jackson.core.io.d dVarB = b(writer, false);
        return d(p(writer, dVarB), dVarB);
    }

    @Deprecated
    public h I(OutputStream outputStream) throws IOException {
        return G(outputStream, e.UTF8);
    }

    @Deprecated
    public h J(OutputStream outputStream, e eVar) throws IOException {
        return G(outputStream, eVar);
    }

    @Deprecated
    public h K(Writer writer) throws IOException {
        return H(writer);
    }

    @Deprecated
    public JsonParser L(File file) throws IOException {
        return U(file);
    }

    @Deprecated
    public JsonParser M(InputStream inputStream) throws IOException {
        return V(inputStream);
    }

    @Deprecated
    public JsonParser N(Reader reader) throws IOException {
        return W(reader);
    }

    @Deprecated
    public JsonParser O(String str) throws IOException {
        return X(str);
    }

    @Deprecated
    public JsonParser P(URL url) throws IOException {
        return Y(url);
    }

    @Deprecated
    public JsonParser Q(byte[] bArr) throws IOException {
        return Z(bArr);
    }

    @Deprecated
    public JsonParser R(byte[] bArr, int i10, int i11) throws IOException {
        return a0(bArr, i10, i11);
    }

    public JsonParser S() throws IOException {
        t("Non-blocking source not (yet?) support for this format (%s)");
        return new com.fasterxml.jackson.core.json.async.a(b(null, false), this.f102315e, this.f102312b.L(this.f102314d));
    }

    public JsonParser T(DataInput dataInput) throws IOException {
        com.fasterxml.jackson.core.io.d dVarB = b(dataInput, false);
        return e(l(dataInput, dVarB), dVarB);
    }

    public JsonParser U(File file) throws IOException {
        com.fasterxml.jackson.core.io.d dVarB = b(file, true);
        return f(m(new FileInputStream(file), dVarB), dVarB);
    }

    public JsonParser V(InputStream inputStream) throws IOException {
        com.fasterxml.jackson.core.io.d dVarB = b(inputStream, false);
        return f(m(inputStream, dVarB), dVarB);
    }

    public JsonParser W(Reader reader) throws IOException {
        com.fasterxml.jackson.core.io.d dVarB = b(reader, false);
        return g(o(reader, dVarB), dVarB);
    }

    public JsonParser X(String str) throws IOException {
        int length = str.length();
        if (this.f102318h != null || length > 32768 || !w()) {
            return W(new StringReader(str));
        }
        com.fasterxml.jackson.core.io.d dVarB = b(str, true);
        char[] cArrK = dVarB.k(length);
        str.getChars(0, length, cArrK, 0);
        return i(cArrK, 0, length, dVarB, true);
    }

    public JsonParser Y(URL url) throws IOException {
        com.fasterxml.jackson.core.io.d dVarB = b(url, true);
        return f(m(s(url), dVarB), dVarB);
    }

    public JsonParser Z(byte[] bArr) throws IOException {
        InputStream inputStreamC;
        com.fasterxml.jackson.core.io.d dVarB = b(bArr, true);
        com.fasterxml.jackson.core.io.e eVar = this.f102318h;
        return (eVar == null || (inputStreamC = eVar.c(dVarB, bArr, 0, bArr.length)) == null) ? h(bArr, 0, bArr.length, dVarB) : f(inputStreamC, dVarB);
    }

    protected void a(Class<?> cls) {
        if (getClass() == cls) {
            return;
        }
        throw new IllegalStateException("Failed copy(): " + getClass().getName() + " (version: " + version() + ") does not override copy(); it has to");
    }

    public JsonParser a0(byte[] bArr, int i10, int i11) throws IOException {
        InputStream inputStreamC;
        com.fasterxml.jackson.core.io.d dVarB = b(bArr, true);
        com.fasterxml.jackson.core.io.e eVar = this.f102318h;
        return (eVar == null || (inputStreamC = eVar.c(dVarB, bArr, i10, i11)) == null) ? h(bArr, i10, i11, dVarB) : f(inputStreamC, dVarB);
    }

    protected com.fasterxml.jackson.core.io.d b(Object obj, boolean z10) {
        return new com.fasterxml.jackson.core.io.d(q(), obj, z10);
    }

    public JsonParser b0(char[] cArr) throws IOException {
        return c0(cArr, 0, cArr.length);
    }

    protected OutputStream c(DataOutput dataOutput) {
        return new com.fasterxml.jackson.core.io.c(dataOutput);
    }

    public JsonParser c0(char[] cArr, int i10, int i11) throws IOException {
        return this.f102318h != null ? W(new CharArrayReader(cArr, i10, i11)) : i(cArr, i10, i11, b(cArr, true), false);
    }

    protected h d(Writer writer, com.fasterxml.jackson.core.io.d dVar) throws IOException {
        com.fasterxml.jackson.core.json.k kVar = new com.fasterxml.jackson.core.json.k(dVar, this.f102316f, this.f102313c, writer);
        com.fasterxml.jackson.core.io.b bVar = this.f102317g;
        if (bVar != null) {
            kVar.o0(bVar);
        }
        s sVar = this.f102320j;
        if (sVar != f102310s) {
            kVar.H0(sVar);
        }
        return kVar;
    }

    public f d0(a aVar) {
        this.f102314d = (~aVar.o()) & this.f102314d;
        return this;
    }

    protected JsonParser e(DataInput dataInput, com.fasterxml.jackson.core.io.d dVar) throws IOException {
        t("InputData source not (yet?) support for this format (%s)");
        int iL = com.fasterxml.jackson.core.json.a.l(dataInput);
        return new com.fasterxml.jackson.core.json.h(dVar, this.f102315e, dataInput, this.f102313c, this.f102312b.L(this.f102314d), iL);
    }

    public f e0(h.b bVar) {
        this.f102316f = (~bVar.o()) & this.f102316f;
        return this;
    }

    protected JsonParser f(InputStream inputStream, com.fasterxml.jackson.core.io.d dVar) throws IOException {
        return new com.fasterxml.jackson.core.json.a(dVar, inputStream).c(this.f102315e, this.f102313c, this.f102312b, this.f102311a, this.f102314d);
    }

    public f f0(JsonParser.a aVar) {
        this.f102315e = (~aVar.o()) & this.f102315e;
        return this;
    }

    protected JsonParser g(Reader reader, com.fasterxml.jackson.core.io.d dVar) throws IOException {
        return new com.fasterxml.jackson.core.json.g(dVar, this.f102315e, reader, this.f102313c, this.f102311a.s(this.f102314d));
    }

    public f g0(a aVar) {
        this.f102314d = aVar.o() | this.f102314d;
        return this;
    }

    protected JsonParser h(byte[] bArr, int i10, int i11, com.fasterxml.jackson.core.io.d dVar) throws IOException {
        return new com.fasterxml.jackson.core.json.a(dVar, bArr, i10, i11).c(this.f102315e, this.f102313c, this.f102312b, this.f102311a, this.f102314d);
    }

    public f h0(h.b bVar) {
        this.f102316f = bVar.o() | this.f102316f;
        return this;
    }

    protected JsonParser i(char[] cArr, int i10, int i11, com.fasterxml.jackson.core.io.d dVar, boolean z10) throws IOException {
        return new com.fasterxml.jackson.core.json.g(dVar, this.f102315e, null, this.f102313c, this.f102311a.s(this.f102314d), cArr, i10, i10 + i11, z10);
    }

    public f i0(JsonParser.a aVar) {
        this.f102315e = aVar.o() | this.f102315e;
        return this;
    }

    protected h j(OutputStream outputStream, com.fasterxml.jackson.core.io.d dVar) throws IOException {
        com.fasterxml.jackson.core.json.i iVar = new com.fasterxml.jackson.core.json.i(dVar, this.f102316f, this.f102313c, outputStream);
        com.fasterxml.jackson.core.io.b bVar = this.f102317g;
        if (bVar != null) {
            iVar.o0(bVar);
        }
        s sVar = this.f102320j;
        if (sVar != f102310s) {
            iVar.H0(sVar);
        }
        return iVar;
    }

    public com.fasterxml.jackson.core.io.b j0() {
        return this.f102317g;
    }

    protected Writer k(OutputStream outputStream, e eVar, com.fasterxml.jackson.core.io.d dVar) throws IOException {
        return eVar == e.UTF8 ? new com.fasterxml.jackson.core.io.o(dVar, outputStream) : new OutputStreamWriter(outputStream, eVar.l());
    }

    public q k0() {
        return this.f102313c;
    }

    protected final DataInput l(DataInput dataInput, com.fasterxml.jackson.core.io.d dVar) throws IOException {
        DataInput dataInputA;
        com.fasterxml.jackson.core.io.e eVar = this.f102318h;
        return (eVar == null || (dataInputA = eVar.a(dVar, dataInput)) == null) ? dataInput : dataInputA;
    }

    public String l0() {
        if (getClass() == f.class) {
            return f102306l;
        }
        return null;
    }

    protected final InputStream m(InputStream inputStream, com.fasterxml.jackson.core.io.d dVar) throws IOException {
        InputStream inputStreamB;
        com.fasterxml.jackson.core.io.e eVar = this.f102318h;
        return (eVar == null || (inputStreamB = eVar.b(dVar, inputStream)) == null) ? inputStream : inputStreamB;
    }

    public Class<? extends c> m0() {
        return null;
    }

    protected final OutputStream n(OutputStream outputStream, com.fasterxml.jackson.core.io.d dVar) throws IOException {
        OutputStream outputStreamA;
        com.fasterxml.jackson.core.io.k kVar = this.f102319i;
        return (kVar == null || (outputStreamA = kVar.a(dVar, outputStream)) == null) ? outputStream : outputStreamA;
    }

    public Class<? extends c> n0() {
        return null;
    }

    protected final Reader o(Reader reader, com.fasterxml.jackson.core.io.d dVar) throws IOException {
        Reader readerD;
        com.fasterxml.jackson.core.io.e eVar = this.f102318h;
        return (eVar == null || (readerD = eVar.d(dVar, reader)) == null) ? reader : readerD;
    }

    public com.fasterxml.jackson.core.io.e o0() {
        return this.f102318h;
    }

    protected final Writer p(Writer writer, com.fasterxml.jackson.core.io.d dVar) throws IOException {
        Writer writerB;
        com.fasterxml.jackson.core.io.k kVar = this.f102319i;
        return (kVar == null || (writerB = kVar.b(dVar, writer)) == null) ? writer : writerB;
    }

    public com.fasterxml.jackson.core.io.k p0() {
        return this.f102319i;
    }

    public com.fasterxml.jackson.core.util.a q() {
        return a.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.n(this.f102314d) ? com.fasterxml.jackson.core.util.b.b() : new com.fasterxml.jackson.core.util.a();
    }

    public String q0() {
        s sVar = this.f102320j;
        if (sVar == null) {
            return null;
        }
        return sVar.getValue();
    }

    public com.fasterxml.jackson.core.format.d r0(com.fasterxml.jackson.core.format.c cVar) throws IOException {
        if (getClass() == f.class) {
            return s0(cVar);
        }
        return null;
    }

    protected Object readResolve() {
        return new f(this, this.f102313c);
    }

    protected InputStream s(URL url) throws IOException {
        String host;
        return (!com.facebook.share.internal.k.f101891c.equals(url.getProtocol()) || !((host = url.getHost()) == null || host.length() == 0) || url.getPath().indexOf(37) >= 0) ? FirebasePerfUrlConnection.openStream(url) : new FileInputStream(url.getPath());
    }

    protected com.fasterxml.jackson.core.format.d s0(com.fasterxml.jackson.core.format.c cVar) throws IOException {
        return com.fasterxml.jackson.core.json.a.h(cVar);
    }

    public final boolean t0(a aVar) {
        return (this.f102314d & aVar.o()) != 0;
    }

    public boolean u() {
        return false;
    }

    public final boolean u0(h.b bVar) {
        return (this.f102316f & bVar.o()) != 0;
    }

    public boolean v() {
        return r();
    }

    public final boolean v0(JsonParser.a aVar) {
        return (this.f102315e & aVar.o()) != 0;
    }

    @Override // com.fasterxml.jackson.core.w
    public v version() {
        return com.fasterxml.jackson.core.json.f.f102565a;
    }

    public boolean w() {
        return true;
    }

    public boolean w0() {
        return false;
    }

    public boolean x(d dVar) {
        if (dVar == null) {
            return false;
        }
        String strL0 = l0();
        return strL0 != null && strL0.equals(dVar.a());
    }

    public boolean x0() {
        return false;
    }

    public final f y(a aVar, boolean z10) {
        return z10 ? g0(aVar) : d0(aVar);
    }

    public f y0(com.fasterxml.jackson.core.io.b bVar) {
        this.f102317g = bVar;
        return this;
    }

    public final f z(h.b bVar, boolean z10) {
        return z10 ? h0(bVar) : e0(bVar);
    }

    public f z0(q qVar) {
        this.f102313c = qVar;
        return this;
    }

    public f(q qVar) {
        this.f102311a = com.fasterxml.jackson.core.sym.b.o();
        this.f102312b = com.fasterxml.jackson.core.sym.a.E();
        this.f102314d = f102307m;
        this.f102315e = f102308n;
        this.f102316f = f102309o;
        this.f102320j = f102310s;
        this.f102313c = qVar;
    }

    protected f(f fVar, q qVar) {
        this.f102311a = com.fasterxml.jackson.core.sym.b.o();
        this.f102312b = com.fasterxml.jackson.core.sym.a.E();
        this.f102314d = f102307m;
        this.f102315e = f102308n;
        this.f102316f = f102309o;
        this.f102320j = f102310s;
        this.f102313c = qVar;
        this.f102314d = fVar.f102314d;
        this.f102315e = fVar.f102315e;
        this.f102316f = fVar.f102316f;
        this.f102317g = fVar.f102317g;
        this.f102318h = fVar.f102318h;
        this.f102319i = fVar.f102319i;
        this.f102320j = fVar.f102320j;
    }
}
