package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import com.google.firebase.h;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f123232c = "PersistedInstallation";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f123233d = "Fid";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f123234e = "AuthToken";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f123235f = "RefreshToken";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f123236g = "TokenCreationEpochInSecs";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f123237h = "ExpiresInSecs";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f123238i = "Status";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f123239j = "FisError";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f123240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final h f123241b;

    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(@NonNull h hVar) {
        this.f123241b = hVar;
    }

    private File b() {
        if (this.f123240a == null) {
            synchronized (this) {
                try {
                    if (this.f123240a == null) {
                        this.f123240a = new File(this.f123241b.n().getFilesDir(), "PersistedInstallation." + this.f123241b.t() + ".json");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f123240a;
    }

    private JSONObject d() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(b());
            while (true) {
                try {
                    int i10 = fileInputStream.read(bArr, 0, 16384);
                    if (i10 < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public void a() {
        b().delete();
    }

    @NonNull
    public d c(@NonNull d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f123233d, dVar.d());
            jSONObject.put(f123238i, dVar.g().ordinal());
            jSONObject.put(f123234e, dVar.b());
            jSONObject.put(f123235f, dVar.f());
            jSONObject.put(f123236g, dVar.h());
            jSONObject.put(f123237h, dVar.c());
            jSONObject.put(f123239j, dVar.e());
            File fileCreateTempFile = File.createTempFile(f123232c, "tmp", this.f123241b.n().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(b())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
        return dVar;
    }

    @NonNull
    public d e() {
        JSONObject jSONObjectD = d();
        int i10 = 3 & 0;
        String strOptString = jSONObjectD.optString(f123233d, null);
        int iOptInt = jSONObjectD.optInt(f123238i, a.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectD.optString(f123234e, null);
        String strOptString3 = jSONObjectD.optString(f123235f, null);
        long jOptLong = jSONObjectD.optLong(f123236g, 0L);
        long jOptLong2 = jSONObjectD.optLong(f123237h, 0L);
        return d.a().d(strOptString).g(a.values()[iOptInt]).b(strOptString2).f(strOptString3).h(jOptLong).c(jOptLong2).e(jSONObjectD.optString(f123239j, null)).a();
    }
}
