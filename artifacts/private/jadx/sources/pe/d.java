package pe;

import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f345635a = new d();

    public enum a {
        LastModified(com.google.common.net.d.f119533r0),
        IfModifiedSince(com.google.common.net.d.f119556z);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f345639e = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f345640a;

        a(String str) {
            this.f345640a = str;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f345639e;
        }

        @NotNull
        public final String n() {
            return this.f345640a;
        }
    }

    public enum b {
        NotModified(304),
        TooManyRequests(429);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f345644e = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f345645a;

        b(int i10) {
            this.f345645a = i10;
        }

        @NotNull
        public static kotlin.enums.a<b> n() {
            return f345644e;
        }

        public final int l() {
            return this.f345645a;
        }
    }

    private d() {
    }

    private final String a(Map<String, ? extends List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list != null) {
            return (String) CollectionsKt.lastOrNull((List) list);
        }
        return null;
    }

    private final void c(HttpURLConnection httpURLConnection, a aVar, String str) {
        httpURLConnection.setRequestProperty(aVar.n(), str);
    }

    public final void b(@NotNull HttpURLConnection connection, long j10) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        c(connection, a.IfModifiedSince, c.f345633a.b(j10));
    }
}
