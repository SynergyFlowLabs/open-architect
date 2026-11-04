package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.t;
import com.google.api.client.http.b0;
import com.google.api.client.http.u;
import com.google.api.client.http.x;
import io.sentry.protocol.h0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessControlException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
class b extends p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f115297d = "GOOGLE_APPLICATION_CREDENTIALS";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f115298e = "application_default_credentials.json";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f115299f = "gcloud";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f115300g = "https://developers.google.com/accounts/docs/application-default-credentials";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f115301h = "com.google.api.client.googleapis.extensions.appengine.auth.oauth2.AppIdentityCredential$AppEngineCredentialWrapper";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final String f115302i = "DEVSHELL_CLIENT_PORT";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f115303b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f115304c = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f115305a;

        static {
            int[] iArr = new int[c.values().length];
            f115305a = iArr;
            try {
                iArr[c.ENVIRONMENT_VARIABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f115305a[c.WELL_KNOWN_FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f115305a[c.APP_ENGINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f115305a[c.CLOUD_SHELL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f115305a[c.COMPUTE_ENGINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.api.client.googleapis.auth.oauth2.b$b, reason: collision with other inner class name */
    private static class C1013b extends h {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final String f115306w = o.b() + "/computeMetadata/v1/instance/service-accounts/default/token";

        C1013b(b0 b0Var, com.google.api.client.json.d dVar) {
            super(new h.a().r(b0Var).m(dVar).p(f115306w));
        }

        @Override // com.google.api.client.googleapis.auth.oauth2.h, com.google.api.client.auth.oauth2.j
        protected t d() throws IOException {
            u uVarB = p().c().b(new com.google.api.client.http.j(o()));
            com.google.api.client.json.f fVar = new com.google.api.client.json.f(j());
            uVarB.O(fVar);
            uVarB.j().p("Metadata-Flavor", "Google");
            uVarB.W(false);
            x xVarA = uVarB.a();
            int iK = xVarA.k();
            if (iK != 200) {
                if (iK == 404) {
                    throw new IOException(String.format("Error code %s trying to get security access token from Compute Engine metadata for the default service account. This may be because the virtual machine instance does not have permission scopes specified.", Integer.valueOf(iK)));
                }
                throw new IOException(String.format("Unexpected Error code %s trying to get security access token from Compute Engine metadata for the default service account: %s", Integer.valueOf(iK), xVarA.t()));
            }
            InputStream inputStreamC = xVarA.c();
            if (inputStreamC != null) {
                return (t) fVar.a(inputStreamC, xVarA.d(), t.class);
            }
            throw new IOException("Empty content from metadata token server request.");
        }
    }

    private enum c {
        UNKNOWN,
        ENVIRONMENT_VARIABLE,
        WELL_KNOWN_FILE,
        CLOUD_SHELL,
        APP_ENGINE,
        COMPUTE_ENGINE
    }

    b() {
    }

    private final c c(b0 b0Var) throws IOException {
        if (p()) {
            return c.ENVIRONMENT_VARIABLE;
        }
        if (q()) {
            return c.WELL_KNOWN_FILE;
        }
        if (r()) {
            return c.APP_ENGINE;
        }
        if (o()) {
            return c.CLOUD_SHELL;
        }
        return o.e(b0Var, this) ? c.COMPUTE_ENGINE : c.UNKNOWN;
    }

    private final h f(b0 b0Var, com.google.api.client.json.d dVar) throws IOException {
        try {
            return (h) e(f115301h).getConstructor(b0.class, com.google.api.client.json.d.class).newInstance(b0Var, dVar);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw ((IOException) o.a(new IOException(String.format("Application Default Credentials failed to create the Google App Engine service account credentials class %s. Check that the component 'google-api-client-appengine' is deployed.", f115301h)), e10));
        }
    }

    private h g(com.google.api.client.json.d dVar) {
        return new com.google.api.client.googleapis.auth.oauth2.a(Integer.parseInt(a(f115302i)), dVar);
    }

    private final h h(b0 b0Var, com.google.api.client.json.d dVar) {
        return new C1013b(b0Var, dVar);
    }

    private h i(b0 b0Var, com.google.api.client.json.d dVar) throws Throwable {
        String strA = a(f115297d);
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(strA);
                try {
                    h hVarZ = h.z(fileInputStream2, b0Var, dVar);
                    fileInputStream2.close();
                    return hVarZ;
                } catch (IOException e10) {
                    e = e10;
                    throw ((IOException) o.a(new IOException(String.format("Error reading credential file from environment variable %s, value '%s': %s", f115297d, strA, e.getMessage())), e));
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    private h j(b0 b0Var, com.google.api.client.json.d dVar) throws Throwable {
        File fileN = n();
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileN);
                try {
                    h hVarZ = h.z(fileInputStream2, b0Var, dVar);
                    fileInputStream2.close();
                    return hVarZ;
                } catch (IOException e10) {
                    e = e10;
                    throw new IOException(String.format("Error reading credential file from location %s: %s", fileN, e.getMessage()));
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    private final h l(b0 b0Var, com.google.api.client.json.d dVar) throws IOException {
        if (this.f115304c == null) {
            this.f115304c = c(b0Var);
        }
        int i10 = a.f115305a[this.f115304c.ordinal()];
        if (i10 == 1) {
            return i(b0Var, dVar);
        }
        if (i10 == 2) {
            return j(b0Var, dVar);
        }
        if (i10 == 3) {
            return f(b0Var, dVar);
        }
        if (i10 == 4) {
            return g(dVar);
        }
        if (i10 == 5) {
            return h(b0Var, dVar);
        }
        int i11 = 0 >> 0;
        return null;
    }

    private final File n() {
        return new File(m("os.name", "").toLowerCase(Locale.US).indexOf(h0.b.f306302b) >= 0 ? new File(new File(a("APPDATA")), f115299f) : new File(new File(m("user.home", ""), ".config"), f115299f), f115298e);
    }

    private boolean o() {
        return a(f115302i) != null;
    }

    private boolean p() throws IOException {
        String strA = a(f115297d);
        if (strA != null && strA.length() != 0) {
            try {
                File file = new File(strA);
                if (!file.exists() || file.isDirectory()) {
                    throw new IOException(String.format("Error reading credential file from environment variable %s, value '%s': File does not exist.", f115297d, strA));
                }
                return true;
            } catch (AccessControlException unused) {
            }
        }
        return false;
    }

    private boolean q() {
        try {
            return d(n());
        } catch (AccessControlException unused) {
            return false;
        }
    }

    private boolean r() {
        try {
            try {
                Field field = e("com.google.appengine.api.utils.SystemProperty").getField("environment");
                return field.getType().getMethod("value", null).invoke(field.get(null), null) != null;
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | SecurityException | InvocationTargetException e10) {
                throw ((RuntimeException) o.a(new RuntimeException(String.format("Unexpcted error trying to determine if runnning on Google App Engine: %s", e10.getMessage())), e10));
            }
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    boolean d(File file) {
        return file.exists() && !file.isDirectory();
    }

    Class<?> e(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    final h k(b0 b0Var, com.google.api.client.json.d dVar) throws IOException {
        synchronized (this) {
            try {
                if (this.f115303b == null) {
                    this.f115303b = l(b0Var, dVar);
                }
                h hVar = this.f115303b;
                if (hVar != null) {
                    return hVar;
                }
                throw new IOException(String.format("The Application Default Credentials are not available. They are available if running on Google App Engine, Google Compute Engine, or Google Cloud Shell. Otherwise, the environment variable %s must be defined pointing to a file defining the credentials. See %s for more information.", f115297d, f115300g));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    String m(String str, String str2) {
        return System.getProperty(str, str2);
    }
}
