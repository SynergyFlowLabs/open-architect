package io.ably.lib.http;

import io.ably.lib.types.b0;
import io.ably.lib.types.r;
import java.net.URL;

/* JADX INFO: loaded from: classes13.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f287362a = "io.ably.lib.http.j";

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements f.b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f287363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f287364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b0[] f287365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b0[] f287366d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i.c f287367e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ i.e f287368f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f287369g;

        a(String str, String str2, b0[] b0VarArr, b0[] b0VarArr2, i.c cVar, i.e eVar, boolean z10) {
            this.f287363a = str;
            this.f287364b = str2;
            this.f287365c = b0VarArr;
            this.f287366d = b0VarArr2;
            this.f287367e = cVar;
            this.f287368f = eVar;
            this.f287369g = z10;
        }

        @Override // io.ably.lib.http.f.b
        public void a(l lVar, io.ably.lib.types.i<T> iVar) throws io.ably.lib.types.a {
            lVar.e(this.f287363a, this.f287364b, this.f287365c, this.f287366d, this.f287367e, this.f287368f, this.f287369g, iVar);
        }
    }

    class b implements i.e<byte[]> {
        b() {
        }

        @Override // io.ably.lib.http.i.e
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public byte[] a(i.d dVar, r rVar) throws io.ably.lib.types.a {
            if (rVar == null) {
                return dVar.f287361f;
            }
            throw io.ably.lib.types.a.a(rVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class c<T> implements f.b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f287370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0[] f287371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b0[] f287372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i.c f287373d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i.e f287374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f287375f;

        c(String str, b0[] b0VarArr, b0[] b0VarArr2, i.c cVar, i.e eVar, boolean z10) {
            this.f287370a = str;
            this.f287371b = b0VarArr;
            this.f287372c = b0VarArr2;
            this.f287373d = cVar;
            this.f287374e = eVar;
            this.f287375f = z10;
        }

        @Override // io.ably.lib.http.f.b
        public void a(l lVar, io.ably.lib.types.i<T> iVar) throws io.ably.lib.types.a {
            lVar.l(this.f287370a, this.f287371b, this.f287372c, this.f287373d, this.f287374e, this.f287375f, iVar);
        }
    }

    public static <T> T a(f fVar, String str, String str2, b0[] b0VarArr, b0[] b0VarArr2, i.c cVar, i.e<T> eVar, boolean z10) throws io.ably.lib.types.a {
        return (T) fVar.e(new a(str, str2, b0VarArr, b0VarArr2, cVar, eVar, z10)).b();
    }

    public static <T> T b(i iVar, String str, b0[] b0VarArr, b0[] b0VarArr2, i.e<T> eVar) throws io.ably.lib.types.a {
        return (T) e(iVar, m.b(str, b0VarArr2), "GET", b0VarArr, null, eVar);
    }

    public static byte[] c(i iVar, String str) throws io.ably.lib.types.a {
        try {
            return (byte[]) e(iVar, new URL(str), "GET", null, null, new b());
        } catch (Exception e10) {
            throw io.ably.lib.types.a.c(e10);
        }
    }

    public static String d(i iVar, String str) throws io.ably.lib.types.a {
        byte[] bArrC = c(iVar, str);
        if (bArrC != null) {
            return new String(bArrC);
        }
        throw io.ably.lib.types.a.a(new r("Empty response body", 500, 50000));
    }

    public static <T> T e(i iVar, URL url, String str, b0[] b0VarArr, i.c cVar, i.e<T> eVar) throws io.ably.lib.types.a {
        return (T) iVar.i(url, str, b0VarArr, cVar, eVar, false);
    }

    public static <T> T f(f fVar, String str, b0[] b0VarArr, b0[] b0VarArr2, i.c cVar, i.e<T> eVar, boolean z10) throws io.ably.lib.types.a {
        return (T) fVar.e(new c(str, b0VarArr, b0VarArr2, cVar, eVar, z10)).b();
    }

    public static <T> T g(i iVar, String str, b0[] b0VarArr, b0[] b0VarArr2, b0[] b0VarArr3, i.e<T> eVar) throws io.ably.lib.types.a {
        return (T) e(iVar, m.b(str, b0VarArr2), "POST", b0VarArr, new m.b(b0VarArr3), eVar);
    }
}
