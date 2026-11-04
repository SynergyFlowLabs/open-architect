package com.facebook.internal;

import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n0 f100016a = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f100017b = n0.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g0 f100018c;

    private static final class a extends BufferedInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private HttpURLConnection f100019a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@Nullable InputStream inputStream, @NotNull HttpURLConnection connection) {
            super(inputStream, 8192);
            Intrinsics.checkNotNullParameter(connection, "connection");
            this.f100019a = connection;
        }

        @NotNull
        public final HttpURLConnection a() {
            return this.f100019a;
        }

        public final void b(@NotNull HttpURLConnection httpURLConnection) {
            Intrinsics.checkNotNullParameter(httpURLConnection, "<set-?>");
            this.f100019a = httpURLConnection;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            e1 e1Var = e1.f99794a;
            e1.q(this.f100019a);
        }
    }

    private n0() {
    }

    @oj.n
    public static final void a() {
        try {
            b().g();
        } catch (IOException e10) {
            t0.a aVar = t0.f100109e;
            com.facebook.t0 t0Var = com.facebook.t0.CACHE;
            String TAG = f100017b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            aVar.b(t0Var, 5, TAG, Intrinsics.stringPlus("clearCache failed ", e10.getMessage()));
        }
    }

    @oj.n
    @NotNull
    public static final synchronized g0 b() throws IOException {
        g0 g0Var;
        try {
            if (f100018c == null) {
                String TAG = f100017b;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                f100018c = new g0(TAG, new g0.e());
            }
            g0Var = f100018c;
            if (g0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageCache");
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return g0Var;
    }

    @oj.n
    @Nullable
    public static final InputStream c(@Nullable Uri uri) {
        if (uri != null && f100016a.f(uri)) {
            try {
                g0 g0VarB = b();
                String string = uri.toString();
                Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
                return g0.k(g0VarB, string, null, 2, null);
            } catch (IOException e10) {
                t0.a aVar = t0.f100109e;
                com.facebook.t0 t0Var = com.facebook.t0.CACHE;
                String TAG = f100017b;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                aVar.b(t0Var, 5, TAG, e10.toString());
            }
        }
        return null;
    }

    @oj.n
    @Nullable
    public static final InputStream e(@NotNull HttpURLConnection connection) throws IOException {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (connection.getResponseCode() != 200) {
            return null;
        }
        Uri uri = Uri.parse(connection.getURL().toString());
        InputStream inputStream = connection.getInputStream();
        try {
            if (f100016a.f(uri)) {
                g0 g0VarB = b();
                String string = uri.toString();
                Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
                return g0VarB.m(string, new a(inputStream, connection));
            }
        } catch (IOException unused) {
        }
        return inputStream;
    }

    private final boolean f(Uri uri) {
        String host;
        return (uri == null || (host = uri.getHost()) == null || (!Intrinsics.areEqual(host, "fbcdn.net") && !StringsKt.M1(host, ".fbcdn.net", false, 2, null) && (!StringsKt.u2(host, "fbcdn", false, 2, null) || !StringsKt.M1(host, ".akamaihd.net", false, 2, null)))) ? false : true;
    }

    public final String d() {
        return f100017b;
    }
}
