package com.google.gson.internal.bind;

import com.google.gson.r;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends com.google.gson.stream.d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Writer f125346v = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final r f125347w = new r(MetricTracker.Action.CLOSED);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List<com.google.gson.l> f125348o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f125349s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.google.gson.l f125350t;

    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public h() {
        super(f125346v);
        this.f125348o = new ArrayList();
        this.f125350t = com.google.gson.n.f125555a;
    }

    private com.google.gson.l H0() {
        List<com.google.gson.l> list = this.f125348o;
        return list.get(list.size() - 1);
    }

    private void M0(com.google.gson.l lVar) {
        if (this.f125349s != null) {
            if (!lVar.G() || l()) {
                ((com.google.gson.o) H0()).L(this.f125349s, lVar);
            }
            this.f125349s = null;
            return;
        }
        if (this.f125348o.isEmpty()) {
            this.f125350t = lVar;
            return;
        }
        com.google.gson.l lVarH0 = H0();
        if (!(lVarH0 instanceof com.google.gson.i)) {
            throw new IllegalStateException();
        }
        ((com.google.gson.i) lVarH0).L(lVar);
    }

    public com.google.gson.l B0() {
        if (this.f125348o.isEmpty()) {
            return this.f125350t;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f125348o);
    }

    @Override // com.google.gson.stream.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f125348o.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f125348o.add(f125347w);
    }

    @Override // com.google.gson.stream.d
    @z7.a
    public com.google.gson.stream.d d() throws IOException {
        com.google.gson.i iVar = new com.google.gson.i();
        M0(iVar);
        this.f125348o.add(iVar);
        return this;
    }

    @Override // com.google.gson.stream.d
    @z7.a
    public com.google.gson.stream.d e() throws IOException {
        com.google.gson.o oVar = new com.google.gson.o();
        M0(oVar);
        this.f125348o.add(oVar);
        return this;
    }

    @Override // com.google.gson.stream.d, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.google.gson.stream.d
    @z7.a
    public com.google.gson.stream.d g() throws IOException {
        if (this.f125348o.isEmpty() || this.f125349s != null) {
            throw new IllegalStateException();
        }
        if (!(H0() instanceof com.google.gson.i)) {
            throw new IllegalStateException();
        }
        List<com.google.gson.l> list = this.f125348o;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.d
    @z7.a
    public com.google.gson.stream.d g0(double d10) throws IOException {
        if (q() || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            M0(new r(Double.valueOf(d10)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
    }

    @Override // com.google.gson.stream.d
    @z7.a
    public com.google.gson.stream.d h() throws IOException {
        if (this.f125348o.isEmpty() || this.f125349s != null) {
            throw new IllegalStateException();
        }
        if (!(H0() instanceof com.google.gson.o)) {
            throw new IllegalStateException();
        }
        List<com.google.gson.l> list = this.f125348o;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.d
    @z7.a
    public com.google.gson.stream.d j0(float f10) throws IOException {
        if (q() || !(Float.isNaN(f10) || Float.isInfinite(f10))) {
            M0(new r(Float.valueOf(f10)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f10);
    }

    @Override // com.google.gson.stream.d
    @z7.a
    public com.google.gson.stream.d k0(long j10) throws IOException {
        M0(new r(Long.valueOf(j10)));
        return this;
    }

    @Override // com.google.gson.stream.d
    @z7.a
    public com.google.gson.stream.d o0(Boolean bool) throws IOException {
        if (bool == null) {
            return y();
        }
        M0(new r(bool));
        return this;
    }

    @Override // com.google.gson.stream.d
    public com.google.gson.stream.d r(String str) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.gson.stream.d
    @z7.a
    public com.google.gson.stream.d r0(Number number) throws IOException {
        if (number == null) {
            return y();
        }
        if (!q()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        M0(new r(number));
        return this;
    }

    @Override // com.google.gson.stream.d
    @z7.a
    public com.google.gson.stream.d t(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f125348o.isEmpty() || this.f125349s != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(H0() instanceof com.google.gson.o)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f125349s = str;
        return this;
    }

    @Override // com.google.gson.stream.d
    @z7.a
    public com.google.gson.stream.d w0(String str) throws IOException {
        if (str == null) {
            return y();
        }
        M0(new r(str));
        return this;
    }

    @Override // com.google.gson.stream.d
    @z7.a
    public com.google.gson.stream.d x0(boolean z10) throws IOException {
        M0(new r(Boolean.valueOf(z10)));
        return this;
    }

    @Override // com.google.gson.stream.d
    @z7.a
    public com.google.gson.stream.d y() throws IOException {
        M0(com.google.gson.n.f125555a);
        return this;
    }
}
