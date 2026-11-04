package com.planner5d.library.api.support;

import com.planner5d.library.services.utility.p0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.g0;
import okhttp3.x;
import okio.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final byte[] f142375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final x f142376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f142377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.api.c f142378d;

    public j(@NotNull byte[] body, @Nullable x xVar, long j10, @NotNull com.planner5d.library.api.c response) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f142375a = body;
        this.f142376b = xVar;
        this.f142377c = j10;
        this.f142378d = response;
    }

    @NotNull
    public final com.planner5d.library.api.c c() {
        return this.f142378d;
    }

    @Override // okhttp3.g0
    public long contentLength() {
        return this.f142377c;
    }

    @Override // okhttp3.g0
    @Nullable
    public x contentType() {
        return this.f142376b;
    }

    @Override // okhttp3.g0
    @NotNull
    public okio.n source() {
        return l0.e(l0.u(new ByteArrayInputStream(this.f142375a)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(@NotNull g0 body, @NotNull com.planner5d.library.api.c response) {
        this(body.bytes(), body.contentType(), body.contentLength(), response);
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(@NotNull g0 body, @NotNull p0 formatter, int i10) {
        this(body.bytes(), body.contentType(), body.contentLength(), formatter, i10);
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
    }

    private j(byte[] bArr, x xVar, long j10, p0 p0Var, int i10) {
        com.planner5d.library.api.c cVar;
        try {
            Object objT = p0Var.t(bArr);
            if (objT instanceof JSONObject) {
                cVar = new com.planner5d.library.api.c((JSONObject) objT);
            } else {
                if (!(objT instanceof JSONArray)) {
                    throw new IOException("Invalid response JSON body type");
                }
                cVar = new com.planner5d.library.api.c((JSONArray) objT);
            }
        } catch (Throwable th2) {
            cVar = new com.planner5d.library.api.c(th2, i10 + 1110000);
        }
        this(bArr, xVar, j10, cVar);
    }
}
