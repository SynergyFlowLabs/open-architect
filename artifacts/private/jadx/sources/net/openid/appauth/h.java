package net.openid.appauth;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l1
    Context f333036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final net.openid.appauth.b f333037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final net.openid.appauth.browser.h f333038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final net.openid.appauth.browser.c f333039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f333040e;

    private static class a extends AsyncTask<Void, Void, JSONObject> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private v f333041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ik.a f333042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f333043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private e f333044d;

        a(v vVar, ik.a aVar, b bVar) {
            this.f333041a = vVar;
            this.f333042b = aVar;
            this.f333043c = bVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r2v3 */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public JSONObject doInBackground(Void... voidArr) throws Throwable {
            InputStream inputStream;
            String strG = this.f333041a.g();
            ?? r10 = 0;
            try {
                try {
                    HttpURLConnection httpURLConnectionA = this.f333042b.a(this.f333041a.f333268a.f333058c);
                    httpURLConnectionA.setRequestMethod("POST");
                    httpURLConnectionA.setRequestProperty("Content-Type", "application/json");
                    httpURLConnectionA.setDoOutput(true);
                    httpURLConnectionA.setRequestProperty("Content-Length", String.valueOf(strG.length()));
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnectionA.getOutputStream());
                    outputStreamWriter.write(strG);
                    outputStreamWriter.flush();
                    inputStream = httpURLConnectionA.getInputStream();
                    try {
                        JSONObject jSONObject = new JSONObject(b0.b(inputStream));
                        b0.a(inputStream);
                        return jSONObject;
                    } catch (IOException e10) {
                        e = e10;
                        net.openid.appauth.internal.a.b(e, "Failed to complete registration request", new Object[0]);
                        this.f333044d = e.m(e.b.f332929d, e);
                        b0.a(inputStream);
                        return null;
                    } catch (JSONException e11) {
                        e = e11;
                        net.openid.appauth.internal.a.b(e, "Failed to complete registration request", new Object[0]);
                        this.f333044d = e.m(e.b.f332931f, e);
                        b0.a(inputStream);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r10 = strG;
                    b0.a(r10);
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
                inputStream = null;
            } catch (JSONException e13) {
                e = e13;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
                b0.a(r10);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(JSONObject jSONObject) {
            e eVarM;
            e eVar = this.f333044d;
            if (eVar != null) {
                this.f333043c.a(null, eVar);
                return;
            }
            if (jSONObject.has("error")) {
                try {
                    String string = jSONObject.getString("error");
                    eVarM = e.l(e.c.a(string), string, jSONObject.getString("error_description"), net.openid.appauth.internal.b.g(jSONObject.getString(e.f332899i)));
                } catch (JSONException e10) {
                    eVarM = e.m(e.b.f332931f, e10);
                }
                this.f333043c.a(null, eVarM);
                return;
            }
            try {
                w wVarA = new w.b(this.f333041a).b(jSONObject).a();
                net.openid.appauth.internal.a.a("Dynamic registration with %s completed", this.f333041a.f333268a.f333058c);
                this.f333043c.a(wVarA, null);
            } catch (w.c e11) {
                net.openid.appauth.internal.a.d(e11, "Malformed registration response", new Object[0]);
                this.f333044d = e.m(e.b.f332933h, e11);
            } catch (JSONException e12) {
                this.f333043c.a(null, e.m(e.b.f332931f, e12));
            }
        }
    }

    public interface b {
        void a(@p0 w wVar, @p0 e eVar);
    }

    private static class c extends AsyncTask<Void, Void, JSONObject> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private z f333045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private l f333046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ik.a f333047c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d f333048d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e f333049e;

        c(z zVar, @NonNull l lVar, @NonNull ik.a aVar, d dVar) {
            this.f333045a = zVar;
            this.f333046b = lVar;
            this.f333047c = aVar;
            this.f333048d = dVar;
        }

        private void a(URLConnection uRLConnection) {
            if (TextUtils.isEmpty(uRLConnection.getRequestProperty("Accept"))) {
                uRLConnection.setRequestProperty("Accept", "application/json");
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public JSONObject doInBackground(Void... voidArr) throws Throwable {
            InputStream inputStream;
            InputStream inputStream2 = null;
            try {
                try {
                    HttpURLConnection httpURLConnectionA = this.f333047c.a(this.f333045a.f333333a.f333057b);
                    httpURLConnectionA.setRequestMethod("POST");
                    httpURLConnectionA.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                    a(httpURLConnectionA);
                    httpURLConnectionA.setDoOutput(true);
                    Map<String, String> mapB = this.f333046b.b(this.f333045a.f333334b);
                    if (mapB != null) {
                        for (Map.Entry<String, String> entry : mapB.entrySet()) {
                            httpURLConnectionA.setRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    Map<String, String> mapB2 = this.f333045a.b();
                    Map<String, String> mapA = this.f333046b.a(this.f333045a.f333334b);
                    if (mapA != null) {
                        mapB2.putAll(mapA);
                    }
                    String strD = net.openid.appauth.internal.b.d(mapB2);
                    httpURLConnectionA.setRequestProperty("Content-Length", String.valueOf(strD.length()));
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnectionA.getOutputStream());
                    outputStreamWriter.write(strD);
                    outputStreamWriter.flush();
                    InputStream errorStream = (httpURLConnectionA.getResponseCode() < 200 || httpURLConnectionA.getResponseCode() >= 300) ? httpURLConnectionA.getErrorStream() : httpURLConnectionA.getInputStream();
                    try {
                        JSONObject jSONObject = new JSONObject(b0.b(errorStream));
                        b0.a(errorStream);
                        return jSONObject;
                    } catch (IOException e10) {
                        inputStream = errorStream;
                        e = e10;
                        net.openid.appauth.internal.a.b(e, "Failed to complete exchange request", new Object[0]);
                        this.f333049e = e.m(e.b.f332929d, e);
                        b0.a(inputStream);
                        return null;
                    } catch (JSONException e11) {
                        inputStream = errorStream;
                        e = e11;
                        net.openid.appauth.internal.a.b(e, "Failed to complete exchange request", new Object[0]);
                        this.f333049e = e.m(e.b.f332931f, e);
                        b0.a(inputStream);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream2 = errorStream;
                        b0.a(inputStream2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream2 = inputStream;
                }
            } catch (IOException e12) {
                e = e12;
                inputStream = null;
            } catch (JSONException e13) {
                e = e13;
                inputStream = null;
            } catch (Throwable th4) {
                th = th4;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(JSONObject jSONObject) {
            e eVarM;
            e eVar = this.f333049e;
            if (eVar != null) {
                this.f333048d.a(null, eVar);
                return;
            }
            if (jSONObject.has("error")) {
                try {
                    String string = jSONObject.getString("error");
                    eVarM = e.l(e.d.a(string), string, jSONObject.optString("error_description", null), net.openid.appauth.internal.b.g(jSONObject.optString(e.f332899i)));
                } catch (JSONException e10) {
                    eVarM = e.m(e.b.f332931f, e10);
                }
                this.f333048d.a(null, eVarM);
                return;
            }
            try {
                a0 a0VarA = new a0.a(this.f333045a).b(jSONObject).a();
                net.openid.appauth.internal.a.a("Token exchange with %s completed", this.f333045a.f333333a.f333057b);
                this.f333048d.a(a0VarA, null);
            } catch (JSONException e11) {
                this.f333048d.a(null, e.m(e.b.f332931f, e11));
            }
        }
    }

    public interface d {
        void a(@p0 a0 a0Var, @p0 e eVar);
    }

    public h(@NonNull Context context) {
        this(context, net.openid.appauth.b.f332823c);
    }

    private void a() {
        if (this.f333040e) {
            throw new IllegalStateException("Service has been disposed and rendered inoperable");
        }
    }

    private Intent o(f fVar, androidx.browser.customtabs.d dVar) {
        a();
        if (this.f333039d == null) {
            throw new ActivityNotFoundException();
        }
        Uri uriJ = fVar.j();
        Intent intent = this.f333039d.f332836d.booleanValue() ? dVar.f11897a : new Intent("android.intent.action.VIEW");
        intent.setPackage(this.f333039d.f332833a);
        intent.setData(uriJ);
        net.openid.appauth.internal.a.a("Using %s as browser for auth, custom tab = %s", intent.getPackage(), this.f333039d.f332836d.toString());
        net.openid.appauth.internal.a.a("Initiating authorization request to %s", fVar.f332961a.f333056a);
        return intent;
    }

    public androidx.browser.customtabs.d.c b(Uri... uriArr) {
        a();
        return this.f333038c.e(uriArr);
    }

    public void c() {
        if (this.f333040e) {
            return;
        }
        this.f333038c.f();
        this.f333040e = true;
    }

    @e.b(21)
    public Intent d(@NonNull f fVar) {
        return e(fVar, b(new Uri[0]).d());
    }

    @e.b(21)
    public Intent e(@NonNull f fVar, @NonNull androidx.browser.customtabs.d dVar) {
        return AuthorizationManagementActivity.c(this.f333036a, fVar, o(fVar, dVar));
    }

    public net.openid.appauth.browser.c f() {
        return this.f333039d;
    }

    public net.openid.appauth.browser.h g() {
        return this.f333038c;
    }

    public void h(@NonNull f fVar, @NonNull PendingIntent pendingIntent) {
        j(fVar, pendingIntent, null, b(new Uri[0]).d());
    }

    public void i(@NonNull f fVar, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
        j(fVar, pendingIntent, pendingIntent2, b(new Uri[0]).d());
    }

    public void j(@NonNull f fVar, @NonNull PendingIntent pendingIntent, @p0 PendingIntent pendingIntent2, @NonNull androidx.browser.customtabs.d dVar) {
        a();
        t.f(fVar);
        t.f(pendingIntent);
        t.f(dVar);
        Intent intentO = o(fVar, dVar);
        Context context = this.f333036a;
        context.startActivity(AuthorizationManagementActivity.d(context, fVar, intentO, pendingIntent, pendingIntent2));
    }

    public void k(@NonNull f fVar, @NonNull PendingIntent pendingIntent, @NonNull androidx.browser.customtabs.d dVar) {
        j(fVar, pendingIntent, null, dVar);
    }

    public void l(@NonNull v vVar, @NonNull b bVar) {
        a();
        net.openid.appauth.internal.a.a("Initiating dynamic client registration %s", vVar.f333268a.f333058c.toString());
        new a(vVar, this.f333037b.b(), bVar).execute(new Void[0]);
    }

    public void m(@NonNull z zVar, @NonNull d dVar) {
        n(zVar, s.f333124b, dVar);
    }

    public void n(@NonNull z zVar, @NonNull l lVar, @NonNull d dVar) {
        a();
        net.openid.appauth.internal.a.a("Initiating code exchange request to %s", zVar.f333333a.f333057b);
        new c(zVar, lVar, this.f333037b.b(), dVar).execute(new Void[0]);
    }

    public h(@NonNull Context context, @NonNull net.openid.appauth.b bVar) {
        this(context, bVar, net.openid.appauth.browser.e.d(context, bVar.a()), new net.openid.appauth.browser.h(context));
    }

    @l1
    h(@NonNull Context context, @NonNull net.openid.appauth.b bVar, @p0 net.openid.appauth.browser.c cVar, @NonNull net.openid.appauth.browser.h hVar) {
        this.f333040e = false;
        this.f333036a = (Context) t.f(context);
        this.f333037b = bVar;
        this.f333038c = hVar;
        this.f333039d = cVar;
        if (cVar == null || !cVar.f332836d.booleanValue()) {
            return;
        }
        hVar.c(cVar.f332833a);
    }
}
