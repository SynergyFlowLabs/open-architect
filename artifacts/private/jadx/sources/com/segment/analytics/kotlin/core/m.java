package com.segment.analytics.kotlin.core;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f266831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final q f266832b;

    static final class a extends l0 implements Function1<Map<String, String>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MalformedURLException f266833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f266834b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(MalformedURLException malformedURLException, m mVar) {
            super(1);
            this.f266833a = malformedURLException;
            this.f266834b = mVar;
        }

        public final void c(@NotNull Map<String, String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.put("error", this.f266833a.toString());
            it.put("writekey", this.f266834b.f266831a);
            it.put("message", "Malformed url");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, String> map) {
            c(map);
            return Unit.f312394a;
        }
    }

    public m(@NotNull String writeKey, @NotNull q requestFactory) {
        Intrinsics.checkNotNullParameter(writeKey, "writeKey");
        Intrinsics.checkNotNullParameter(requestFactory, "requestFactory");
        this.f266831a = writeKey;
        this.f266832b = requestFactory;
    }

    private final HttpURLConnection b(String str) throws IOException {
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
            Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(androidx.core.view.accessibility.j.f48528u0);
            httpURLConnection.setRequestProperty(com.google.common.net.d.P, "analytics-kotlin/1.19.2");
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        } catch (MalformedURLException e10) {
            IOException iOException = new IOException("Attempted to use malformed url: " + str, e10);
            k.a(null, e10, "Attempted to use malformed url: " + str, w.f267065d, kotlin.p.i(e10), new a(e10, this));
            throw iOException;
        }
    }

    @NotNull
    public final h c(@NotNull String cdnHost) {
        Intrinsics.checkNotNullParameter(cdnHost, "cdnHost");
        return n.a(this.f266832b.b(cdnHost, this.f266831a));
    }

    @NotNull
    public final h d(@NotNull String apiHost) {
        Intrinsics.checkNotNullParameter(apiHost, "apiHost");
        return n.b(this.f266832b.c(apiHost));
    }

    public /* synthetic */ m(String str, q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? new q() : qVar);
    }
}
