package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.l1;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class o0 extends AsyncTask<Void, Void, List<? extends q0>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f101725d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f101726e = o0.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final HttpURLConnection f101727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p0 f101728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Exception f101729c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public o0(@Nullable HttpURLConnection httpURLConnection, @NotNull p0 requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f101727a = httpURLConnection;
        this.f101728b = requests;
    }

    @l1(otherwise = 4)
    @Nullable
    public List<q0> a(@NotNull Void... params) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(params, "params");
                try {
                    HttpURLConnection httpURLConnection = this.f101727a;
                    return httpURLConnection == null ? this.f101728b.l() : GraphRequest.f98518n.p(httpURLConnection, this.f101728b);
                } catch (Exception e10) {
                    this.f101729c = e10;
                    return null;
                }
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
                return null;
            }
        } catch (Throwable th3) {
            com.facebook.internal.instrument.crashshield.b.c(th3, this);
            return null;
        }
    }

    @Nullable
    protected final Exception b() {
        return this.f101729c;
    }

    @NotNull
    public final p0 c() {
        return this.f101728b;
    }

    protected void d(@NotNull List<q0> result) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(result, "result");
                super.onPostExecute(result);
                Exception exc = this.f101729c;
                if (exc != null) {
                    com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                    String str = f101726e;
                    q1 q1Var = q1.f312784a;
                    String str2 = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
                    com.facebook.internal.e1.g0(str, str2);
                    return;
                }
                return;
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
                return;
            }
            com.facebook.internal.instrument.crashshield.b.c(th, this);
        } catch (Throwable th3) {
            com.facebook.internal.instrument.crashshield.b.c(th3, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.util.List<? extends com.facebook.q0>] */
    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ List<? extends q0> doInBackground(Void[] voidArr) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return null;
        }
        try {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return null;
            }
            try {
                this = a(voidArr);
                return this;
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
                return null;
            }
        } catch (Throwable th3) {
            com.facebook.internal.instrument.crashshield.b.c(th3, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(List<? extends q0> list) {
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
                    try {
                        d(list);
                    } catch (Throwable th2) {
                        com.facebook.internal.instrument.crashshield.b.c(th2, this);
                    }
                }
            } catch (Throwable th3) {
                com.facebook.internal.instrument.crashshield.b.c(th3, this);
            }
        }
    }

    @Override // android.os.AsyncTask
    @l1(otherwise = 4)
    public void onPreExecute() {
        if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
            try {
                if (!com.facebook.internal.instrument.crashshield.b.e(this)) {
                    try {
                        super.onPreExecute();
                        g0 g0Var = g0.f99617a;
                        if (g0.K()) {
                            com.facebook.internal.e1 e1Var = com.facebook.internal.e1.f99794a;
                            String str = f101726e;
                            q1 q1Var = q1.f312784a;
                            String str2 = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                            Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
                            com.facebook.internal.e1.g0(str, str2);
                        }
                        if (this.f101728b.t() == null) {
                            this.f101728b.N(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
                        }
                    } catch (Throwable th2) {
                        com.facebook.internal.instrument.crashshield.b.c(th2, this);
                    }
                }
            } catch (Throwable th3) {
                com.facebook.internal.instrument.crashshield.b.c(th3, this);
            }
        }
    }

    @NotNull
    public String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.f101727a + ", requests: " + this.f101728b + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(@NotNull GraphRequest... requests) {
        this((HttpURLConnection) null, new p0((GraphRequest[]) Arrays.copyOf(requests, requests.length)));
        Intrinsics.checkNotNullParameter(requests, "requests");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(@NotNull Collection<GraphRequest> requests) {
        this((HttpURLConnection) null, new p0(requests));
        Intrinsics.checkNotNullParameter(requests, "requests");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(@NotNull p0 requests) {
        this((HttpURLConnection) null, requests);
        Intrinsics.checkNotNullParameter(requests, "requests");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(@Nullable HttpURLConnection httpURLConnection, @NotNull GraphRequest... requests) {
        this(httpURLConnection, new p0((GraphRequest[]) Arrays.copyOf(requests, requests.length)));
        Intrinsics.checkNotNullParameter(requests, "requests");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(@Nullable HttpURLConnection httpURLConnection, @NotNull Collection<GraphRequest> requests) {
        this(httpURLConnection, new p0(requests));
        Intrinsics.checkNotNullParameter(requests, "requests");
    }
}
