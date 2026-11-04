package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.w0;
import com.facebook.internal.x0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends x0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final a f100452n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f100453o = 5000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final String f100454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final String f100455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f100456m;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c0 a(@NotNull Context context, @NotNull String applicationId, @NotNull String loggerRef, @NotNull String graphApiVersion, long j10, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(loggerRef, "loggerRef");
            Intrinsics.checkNotNullParameter(graphApiVersion, "graphApiVersion");
            return new c0(context, applicationId, loggerRef, graphApiVersion, j10, str);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(@NotNull Context context, @NotNull String applicationId, @NotNull String loggerRef, @NotNull String graphApiVersion, long j10, @Nullable String str) {
        super(context, w0.f100164f0, w0.f100167g0, w0.D, applicationId, str);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(loggerRef, "loggerRef");
        Intrinsics.checkNotNullParameter(graphApiVersion, "graphApiVersion");
        this.f100454k = loggerRef;
        this.f100455l = graphApiVersion;
        this.f100456m = j10;
    }

    @Override // com.facebook.internal.x0
    protected void f(@NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(data, "data");
        data.putString(w0.f100206u0, this.f100454k);
        data.putString(w0.f100210w0, this.f100455l);
        data.putLong(w0.f100208v0, this.f100456m);
    }
}
