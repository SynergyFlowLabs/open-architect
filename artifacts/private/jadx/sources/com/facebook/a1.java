package com.facebook;

import android.os.Handler;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends FilterOutputStream implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p0 f98576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<GraphRequest, d1> f98577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f98578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f98579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f98580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f98581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private d1 f98582g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(@NotNull OutputStream out, @NotNull p0 requests, @NotNull Map<GraphRequest, d1> progressMap, long j10) {
        super(out);
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(progressMap, "progressMap");
        this.f98576a = requests;
        this.f98577b = progressMap;
        this.f98578c = j10;
        g0 g0Var = g0.f99617a;
        this.f98579d = g0.H();
    }

    private final void c(long j10) {
        d1 d1Var = this.f98582g;
        if (d1Var != null) {
            d1Var.b(j10);
        }
        long j11 = this.f98580e + j10;
        this.f98580e = j11;
        if (j11 >= this.f98581f + this.f98579d || j11 >= this.f98578c) {
            f();
        }
    }

    private final void f() {
        if (this.f98580e > this.f98581f) {
            for (final p0.a aVar : this.f98576a.u()) {
                if (aVar instanceof p0.c) {
                    Handler handlerT = this.f98576a.t();
                    if ((handlerT == null ? null : Boolean.valueOf(handlerT.post(new Runnable() { // from class: com.facebook.z0
                        @Override // java.lang.Runnable
                        public final void run() {
                            a1.g(aVar, this);
                        }
                    }))) == null) {
                        ((p0.c) aVar).b(this.f98576a, this.f98580e, this.f98578c);
                    }
                }
            }
            this.f98581f = this.f98580e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(p0.a callback, a1 this$0) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((p0.c) callback).b(this$0.f98576a, this$0.d(), this$0.e());
    }

    @Override // com.facebook.b1
    public void a(@Nullable GraphRequest graphRequest) {
        this.f98582g = graphRequest != null ? this.f98577b.get(graphRequest) : null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        Iterator<d1> it = this.f98577b.values().iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        f();
    }

    public final long d() {
        return this.f98580e;
    }

    public final long e() {
        return this.f98578c;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(@NotNull byte[] buffer) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer);
        c(buffer.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(@NotNull byte[] buffer, int i10, int i11) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer, i10, i11);
        c(i11);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        ((FilterOutputStream) this).out.write(i10);
        c(1L);
    }
}
