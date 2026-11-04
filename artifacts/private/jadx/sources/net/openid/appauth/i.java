package net.openid.appauth;

import android.net.Uri;
import android.os.AsyncTask;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f333050e = ".well-known";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f333051f = "openid-configuration";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f333052g = "authorizationEndpoint";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f333053h = "tokenEndpoint";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f333054i = "registrationEndpoint";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f333055j = "discoveryDoc";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Uri f333056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Uri f333057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    public final Uri f333058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public final j f333059d;

    private static class a extends AsyncTask<Void, Void, i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f333060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ik.a f333061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f333062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private e f333063d = null;

        a(Uri uri, ik.a aVar, b bVar) {
            this.f333060a = uri;
            this.f333061b = aVar;
            this.f333062c = bVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Not initialized variable reg: 1, insn: 0x003c: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:8:0x003c */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i doInBackground(Void... voidArr) throws Throwable {
            InputStream inputStream;
            InputStream inputStream2;
            InputStream inputStream3 = null;
            try {
                try {
                    HttpURLConnection httpURLConnectionA = this.f333061b.a(this.f333060a);
                    httpURLConnectionA.setRequestMethod("GET");
                    httpURLConnectionA.setDoInput(true);
                    httpURLConnectionA.connect();
                    inputStream = httpURLConnectionA.getInputStream();
                    try {
                        i iVar = new i(new j(new JSONObject(b0.b(inputStream))));
                        b0.a(inputStream);
                        return iVar;
                    } catch (IOException e10) {
                        e = e10;
                        net.openid.appauth.internal.a.d(e, "Network error when retrieving discovery document", new Object[0]);
                        this.f333063d = e.m(e.b.f332929d, e);
                        b0.a(inputStream);
                        return null;
                    } catch (j.a e11) {
                        e = e11;
                        net.openid.appauth.internal.a.d(e, "Malformed discovery document", new Object[0]);
                        this.f333063d = e.m(e.b.f332926a, e);
                        b0.a(inputStream);
                        return null;
                    } catch (JSONException e12) {
                        e = e12;
                        net.openid.appauth.internal.a.d(e, "Error parsing discovery document", new Object[0]);
                        this.f333063d = e.m(e.b.f332931f, e);
                        b0.a(inputStream);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream3 = inputStream2;
                    b0.a(inputStream3);
                    throw th;
                }
            } catch (IOException e13) {
                e = e13;
                inputStream = null;
            } catch (j.a e14) {
                e = e14;
                inputStream = null;
            } catch (JSONException e15) {
                e = e15;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
                b0.a(inputStream3);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(i iVar) {
            e eVar = this.f333063d;
            if (eVar != null) {
                this.f333062c.a(null, eVar);
            } else {
                this.f333062c.a(iVar, null);
            }
        }
    }

    public interface b {
        void a(@p0 i iVar, @p0 e eVar);
    }

    public i(@NonNull Uri uri, @NonNull Uri uri2) {
        this(uri, uri2, null);
    }

    static Uri a(Uri uri) {
        return uri.buildUpon().appendPath(f333050e).appendPath(f333051f).build();
    }

    public static void b(@NonNull Uri uri, @NonNull b bVar) {
        c(a(uri), bVar);
    }

    public static void c(@NonNull Uri uri, @NonNull b bVar) {
        d(uri, bVar, ik.b.f287245a);
    }

    public static void d(@NonNull Uri uri, @NonNull b bVar, @NonNull ik.a aVar) {
        t.g(uri, "openIDConnectDiscoveryUri cannot be null");
        t.g(bVar, "callback cannot be null");
        t.g(aVar, "connectionBuilder must not be null");
        new a(uri, aVar, bVar).execute(new Void[0]);
    }

    public static i e(@NonNull String str) throws JSONException {
        t.g(str, "json cannot be null");
        return f(new JSONObject(str));
    }

    @NonNull
    public static i f(@NonNull JSONObject jSONObject) throws JSONException {
        t.g(jSONObject, "json object cannot be null");
        if (!jSONObject.has(f333055j)) {
            t.b(jSONObject.has(f333052g), "missing authorizationEndpoint");
            t.b(jSONObject.has(f333053h), "missing tokenEndpoint");
            return new i(r.i(jSONObject, f333052g), r.i(jSONObject, f333053h), r.j(jSONObject, f333054i));
        }
        try {
            return new i(new j(jSONObject.optJSONObject(f333055j)));
        } catch (j.a e10) {
            throw new JSONException("Missing required field in discovery doc: " + e10.a());
        }
    }

    @NonNull
    public JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        r.n(jSONObject, f333052g, this.f333056a.toString());
        r.n(jSONObject, f333053h, this.f333057b.toString());
        Uri uri = this.f333058c;
        if (uri != null) {
            r.n(jSONObject, f333054i, uri.toString());
        }
        j jVar = this.f333059d;
        if (jVar != null) {
            r.p(jSONObject, f333055j, jVar.f333094a);
        }
        return jSONObject;
    }

    public String h() {
        return g().toString();
    }

    public i(@NonNull Uri uri, @NonNull Uri uri2, @p0 Uri uri3) {
        this.f333056a = (Uri) t.f(uri);
        this.f333057b = (Uri) t.f(uri2);
        this.f333058c = uri3;
        int i10 = 4 & 0;
        this.f333059d = null;
    }

    public i(@NonNull j jVar) {
        t.g(jVar, "docJson cannot be null");
        this.f333059d = jVar;
        this.f333056a = jVar.e();
        this.f333057b = jVar.A();
        this.f333058c = jVar.r();
    }
}
