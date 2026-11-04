package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.devtodev.analytics.internal.storage.sqlite.PeopleCardEntry;
import com.google.android.datatransport.cct.internal.o;
import com.google.android.datatransport.cct.internal.p;
import com.google.android.datatransport.cct.internal.q;
import com.google.android.datatransport.cct.internal.r;
import com.google.android.datatransport.cct.internal.s;
import com.google.android.datatransport.cct.internal.t;
import com.google.android.datatransport.cct.internal.u;
import com.google.android.datatransport.cct.internal.v;
import com.google.android.datatransport.cct.internal.w;
import com.google.android.datatransport.cct.internal.x;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.h;
import com.google.android.datatransport.runtime.backends.n;
import com.google.android.datatransport.runtime.i;
import com.google.android.datatransport.runtime.j;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes4.dex */
final class d implements n {
    private static final String A = "fingerprint";
    private static final String B = "locale";
    private static final String C = "country";
    private static final String D = "mcc_mnc";
    private static final String E = "tz-offset";
    private static final String F = "application_build";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f103196h = "CctTransportBackend";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f103197i = 30000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f103198j = 130000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f103199k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f103200l = "Accept-Encoding";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f103201m = "Content-Encoding";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f103202n = "gzip";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f103203o = "Content-Type";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final String f103204p = "X-Goog-Api-Key";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f103205q = "application/json";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @l1
    static final String f103206r = "net-type";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @l1
    static final String f103207s = "mobile-subtype";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f103208t = "sdk-version";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f103209u = "model";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f103210v = "hardware";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f103211w = "device";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f103212x = "product";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f103213y = "os-uild";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f103214z = "manufacturer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.encoders.a f103215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f103216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f103217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final URL f103218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f103219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.time.a f103220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f103221g;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final URL f103222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.google.android.datatransport.cct.internal.n f103223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        final String f103224c;

        a(URL url, com.google.android.datatransport.cct.internal.n nVar, @p0 String str) {
            this.f103222a = url;
            this.f103223b = nVar;
            this.f103224c = str;
        }

        a a(URL url) {
            return new a(url, this.f103223b, this.f103224c);
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f103225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        final URL f103226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f103227c;

        b(int i10, @p0 URL url, long j10) {
            this.f103225a = i10;
            this.f103226b = url;
            this.f103227c = j10;
        }
    }

    d(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2, int i10) {
        this.f103215a = com.google.android.datatransport.cct.internal.n.b();
        this.f103217c = context;
        this.f103216b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f103218d = n(com.google.android.datatransport.cct.a.f103185d);
        this.f103219e = aVar2;
        this.f103220f = aVar;
        this.f103221g = i10;
    }

    public static /* synthetic */ a d(a aVar, b bVar) {
        URL url = bVar.f103226b;
        if (url == null) {
            return null;
        }
        z5.a.c(f103196h, "Following redirect to: %s", url);
        return aVar.a(bVar.f103226b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) throws IOException {
        z5.a.h(f103196h, "Making request to: %s", aVar.f103222a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f103222a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f103221g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty(com.google.common.net.d.P, String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", f103202n);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", f103202n);
        String str = aVar.f103224c;
        if (str != null) {
            httpURLConnection.setRequestProperty(f103204p, str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f103215a.b(aVar.f103223b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    z5.a.h(f103196h, "Status Code: %d", Integer.valueOf(responseCode));
                    z5.a.c(f103196h, "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    z5.a.c(f103196h, "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField(com.google.common.net.d.f119539t0)), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamM = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, v.b(new BufferedReader(new InputStreamReader(inputStreamM))).c());
                            if (inputStreamM != null) {
                                inputStreamM.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th2) {
                            if (inputStreamM != null) {
                                try {
                                    inputStreamM.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            } catch (Throwable th8) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                    }
                }
                throw th8;
            }
        } catch (com.google.firebase.encoders.c | IOException e10) {
            z5.a.f(f103196h, "Couldn't encode request, returning with 400", e10);
            return new b(400, null, 0L);
        } catch (ConnectException | UnknownHostException e11) {
            z5.a.f(f103196h, "Couldn't open connection, returning with 500", e11);
            return new b(500, null, 0L);
        }
    }

    private static String f(Context context) {
        String simOperator = k(context).getSimOperator();
        return simOperator != null ? simOperator : "";
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return w.b.UNKNOWN_MOBILE_SUBTYPE.k();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return w.b.COMBINED.k();
        }
        if (w.b.b(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int h(NetworkInfo networkInfo) {
        return networkInfo == null ? w.c.NONE.k() : networkInfo.getType();
    }

    private static int i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            z5.a.f(f103196h, "Unable to find version code for package", e10);
            return -1;
        }
    }

    private com.google.android.datatransport.cct.internal.n j(g gVar) {
        t.a aVarL;
        HashMap map = new HashMap();
        for (j jVar : gVar.c()) {
            String strP = jVar.p();
            if (map.containsKey(strP)) {
                ((List) map.get(strP)).add(jVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(jVar);
                map.put(strP, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            j jVar2 = (j) ((List) entry.getValue()).get(0);
            u.a aVarB = u.a().f(x.DEFAULT).g(this.f103220f.V()).h(this.f103219e.V()).b(o.a().c(o.b.ANDROID_FIREBASE).b(com.google.android.datatransport.cct.internal.a.a().m(Integer.valueOf(jVar2.i(f103208t))).j(jVar2.b("model")).f(jVar2.b(f103210v)).d(jVar2.b("device")).l(jVar2.b(f103212x)).k(jVar2.b(f103213y)).h(jVar2.b("manufacturer")).e(jVar2.b("fingerprint")).c(jVar2.b("country")).g(jVar2.b("locale")).i(jVar2.b(D)).b(jVar2.b(F)).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (j jVar3 : (List) entry.getValue()) {
                i iVarE = jVar3.e();
                com.google.android.datatransport.e eVarB = iVarE.b();
                if (eVarB.equals(com.google.android.datatransport.e.b("proto"))) {
                    aVarL = t.l(iVarE.a());
                } else if (eVarB.equals(com.google.android.datatransport.e.b(PeopleCardEntry.json))) {
                    aVarL = t.k(new String(iVarE.a(), Charset.forName("UTF-8")));
                } else {
                    z5.a.i(f103196h, "Received event of unsupported encoding %s. Skipping...", eVarB);
                }
                aVarL.d(jVar3.f()).e(jVar3.q()).j(jVar3.j(E)).g(w.a().c(w.c.b(jVar3.i(f103206r))).b(w.b.b(jVar3.i(f103207s))).a());
                if (jVar3.d() != null) {
                    aVarL.c(jVar3.d());
                }
                if (jVar3.n() != null) {
                    aVarL.b(p.a().b(s.a().b(r.a().b(jVar3.n()).a()).a()).c(p.b.EVENT_OVERRIDE).a());
                }
                if (jVar3.g() != null || jVar3.h() != null) {
                    q.a aVarA = q.a();
                    if (jVar3.g() != null) {
                        aVarA.b(jVar3.g());
                    }
                    if (jVar3.h() != null) {
                        aVarA.c(jVar3.h());
                    }
                    aVarL.f(aVarA.a());
                }
                arrayList3.add(aVarL.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return com.google.android.datatransport.cct.internal.n.a(arrayList2);
    }

    private static TelephonyManager k(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    @l1
    static long l() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    private static InputStream m(InputStream inputStream, String str) throws IOException {
        return f103202n.equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.n
    public j a(j jVar) {
        NetworkInfo activeNetworkInfo = this.f103216b.getActiveNetworkInfo();
        return jVar.r().a(f103208t, Build.VERSION.SDK_INT).c("model", Build.MODEL).c(f103210v, Build.HARDWARE).c("device", Build.DEVICE).c(f103212x, Build.PRODUCT).c(f103213y, Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b(E, l()).a(f103206r, h(activeNetworkInfo)).a(f103207s, g(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c(D, f(this.f103217c)).c(F, Integer.toString(i(this.f103217c))).d();
    }

    @Override // com.google.android.datatransport.runtime.backends.n
    public h b(g gVar) {
        com.google.android.datatransport.cct.internal.n nVarJ = j(gVar);
        URL urlN = this.f103218d;
        String strF = null;
        if (gVar.d() != null) {
            try {
                com.google.android.datatransport.cct.a aVarE = com.google.android.datatransport.cct.a.e(gVar.d());
                strF = aVarE.f() != null ? aVarE.f() : null;
                if (aVarE.g() != null) {
                    urlN = n(aVarE.g());
                }
            } catch (IllegalArgumentException unused) {
                return h.a();
            }
        }
        try {
            b bVar = (b) a6.b.a(5, new a(urlN, nVarJ, strF), new a6.a() { // from class: com.google.android.datatransport.cct.b
                @Override // a6.a
                public final Object apply(Object obj) {
                    return this.f103195a.e((d.a) obj);
                }
            }, new a6.c() { // from class: com.google.android.datatransport.cct.c
                @Override // a6.c
                public final Object a(Object obj, Object obj2) {
                    return d.d((d.a) obj, (d.b) obj2);
                }
            });
            int i10 = bVar.f103225a;
            if (i10 == 200) {
                return h.e(bVar.f103227c);
            }
            if (i10 < 500 && i10 != 404) {
                return i10 == 400 ? h.d() : h.a();
            }
            return h.f();
        } catch (IOException e10) {
            z5.a.f(f103196h, "Could not make request to the backend", e10);
            return h.f();
        }
    }

    d(Context context, com.google.android.datatransport.runtime.time.a aVar, com.google.android.datatransport.runtime.time.a aVar2) {
        this(context, aVar, aVar2, f103198j);
    }
}
