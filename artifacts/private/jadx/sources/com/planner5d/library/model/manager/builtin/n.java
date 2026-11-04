package com.planner5d.library.model.manager.builtin;

import android.content.res.AssetManager;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.m1;
import com.planner5d.library.model.ManagedFile;
import com.planner5d.library.model.manager.x1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@ij.f
public class n implements x1, ec.c, ec.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0 f181160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f181161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AssetManager f181162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final fg.e<com.planner5d.library.model.manager.managedfiles.a0> f181163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.planner5d.library.application.b f181164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f181165h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Set<String> f181166i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f181167j = false;

    @ij.a
    public n(com.planner5d.library.application.b bVar, i iVar, g0 g0Var, fg.e<com.planner5d.library.model.manager.managedfiles.a0> eVar) {
        this.f181164g = bVar;
        this.f181162e = bVar.getAssets();
        this.f181161d = iVar;
        this.f181160c = g0Var;
        this.f181163f = eVar;
    }

    @m1
    private String f(String str, @androidx.annotation.p0 MessageDigest messageDigest) {
        try {
            InputStream inputStreamOpen = this.f181162e.open(str);
            try {
                String strG = com.planner5d.library.services.utility.e0.g(inputStreamOpen, messageDigest);
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                return strG;
            } catch (Throwable th2) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    @m1
    private File k(String str, boolean z10) throws Throwable {
        File file = new File(i(), str);
        if (z10 && this.f181163f.get().m(str) && (!file.isFile() || !this.f181163f.get().l(str))) {
            this.f181163f.get().p(str);
        }
        return file;
    }

    private String m(String str) {
        return ManagedFile.f180551n + str + ".p3d";
    }

    private Boolean n(String str) {
        Boolean boolValueOf;
        synchronized (this.f181165h) {
            if (!this.f181167j) {
                try {
                    this.f181166i = new HashSet(org.apache.commons.io.p.c0(this.f181162e.open("generated.assets.txt"), Charset.defaultCharset()));
                } catch (IOException unused) {
                }
                this.f181167j = true;
            }
            Set<String> set = this.f181166i;
            boolValueOf = set == null ? null : Boolean.valueOf(set.contains(str));
        }
        return boolValueOf;
    }

    @Override // ec.b
    @m1
    public InputStream a(String str) throws Throwable {
        String strM = m(str);
        String strM2 = m(str + "_0");
        File fileK = k(strM, true);
        if (this.f181161d.l0(strM2)) {
            k(strM2, true);
        }
        return fileK.isFile() ? new FileInputStream(fileK) : this.f181162e.open(h(strM));
    }

    @Override // ec.c
    @m1
    public String b(String str) {
        String str2 = "an";
        String strM = m(str);
        LinkedList linkedList = new LinkedList();
        String str3 = "y";
        linkedList.add(str == null ? "n" : "y");
        try {
            linkedList.add(this.f181163f.get().d(strM) ? "ey" : "en");
            linkedList.add(this.f181163f.get().m(strM) ? "dy" : "dn");
            linkedList.add(this.f181163f.get().l(strM) ? "ay" : "an");
            if (!k(strM, false).isFile()) {
                str3 = "n";
            }
            linkedList.add(str3);
        } catch (Throwable unused) {
            linkedList.add("e");
        }
        try {
            Boolean boolN = n(strM);
            if (boolN != null && boolN.booleanValue()) {
                str2 = "ay";
            }
            linkedList.add(str2);
        } catch (Throwable unused2) {
            linkedList.add("ae");
        }
        return org.apache.commons.lang3.z.K0(linkedList, ":");
    }

    public boolean c(@androidx.annotation.p0 String str) {
        if (str == null) {
            return false;
        }
        try {
            org.apache.commons.io.p.k(this.f181164g.getResources().getAssets().open(str));
            return true;
        } catch (Throwable unused) {
            org.apache.commons.io.p.k(null);
            return false;
        }
    }

    @m1
    public String d(String str) {
        return f(str, null);
    }

    public String h(String str) {
        return "datafile/" + str;
    }

    public File i() {
        return com.planner5d.library.services.w.f229889a.a(this.f181164g, "data");
    }

    @m1
    public File j(String str) throws Throwable {
        return k(str, false);
    }

    @m1
    public Pair<Integer, String> l(String str) {
        File fileK;
        try {
            String strT = this.f181161d.T(str, i.a.Active);
            if ((strT == null || !strT.equals(d(str))) && (fileK = k(str, true)) != null && fileK.isFile()) {
                return new Pair<>(1, fileK.getAbsolutePath());
            }
        } catch (Throwable unused) {
        }
        return new Pair<>(2, h(str));
    }

    @m1
    public boolean o(String str, String str2, MessageDigest messageDigest) {
        String strH = h(str);
        Boolean boolN = n(strH);
        return (boolN == null || boolN.booleanValue()) && str2.equals(f(strH, messageDigest));
    }

    @m1
    public boolean p(String str, String str2, MessageDigest messageDigest) {
        try {
            File fileK = k(str, false);
            if (str2 != null && fileK != null && fileK.isFile() && str2.equals(com.planner5d.library.services.utility.e0.e(fileK, messageDigest))) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @m1
    public boolean q(@NonNull String str, @androidx.annotation.p0 String str2) {
        return str2 != null && str2.equalsIgnoreCase(d(str));
    }

    @NonNull
    @m1
    public InputStream r(String str) throws IOException {
        return this.f181162e.open(str);
    }

    public void t() {
        this.f181160c.i();
    }
}
