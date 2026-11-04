package io.ktor.client.call;

import fi.w;
import io.ktor.http.i1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final byte[] f294261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f294262i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull io.ktor.client.c client, @NotNull w request, @NotNull io.ktor.client.statement.c response, @NotNull byte[] responseBody) {
        super(client);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        this.f294261h = responseBody;
        n(new h(this, request));
        p(new i(this, responseBody, response));
        l.a(i1.d(response), responseBody.length, request.getMethod());
        this.f294262i = true;
    }

    @Override // io.ktor.client.call.b
    protected boolean f() {
        return this.f294262i;
    }

    @Override // io.ktor.client.call.b
    @Nullable
    protected Object l(@NotNull kotlin.coroutines.d<? super io.ktor.utils.io.h> dVar) {
        return io.ktor.utils.io.c.e(this.f294261h, 0, 0, 6, null);
    }
}
