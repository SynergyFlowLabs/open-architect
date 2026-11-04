package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 extends OutputStream implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Handler f102178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<GraphRequest, d1> f102179b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private GraphRequest f102180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private d1 f102181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f102182e;

    public y0(@Nullable Handler handler) {
        this.f102178a = handler;
    }

    @Override // com.facebook.b1
    public void a(@Nullable GraphRequest graphRequest) {
        this.f102180c = graphRequest;
        this.f102181d = graphRequest != null ? this.f102179b.get(graphRequest) : null;
    }

    public final void b(long j10) {
        GraphRequest graphRequest = this.f102180c;
        if (graphRequest == null) {
            return;
        }
        if (this.f102181d == null) {
            d1 d1Var = new d1(this.f102178a, graphRequest);
            this.f102181d = d1Var;
            this.f102179b.put(graphRequest, d1Var);
        }
        d1 d1Var2 = this.f102181d;
        if (d1Var2 != null) {
            d1Var2.c(j10);
        }
        this.f102182e += (int) j10;
    }

    public final int c() {
        return this.f102182e;
    }

    @NotNull
    public final Map<GraphRequest, d1> d() {
        return this.f102179b;
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        b(buffer.length);
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        b(i11);
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        b(1L);
    }
}
