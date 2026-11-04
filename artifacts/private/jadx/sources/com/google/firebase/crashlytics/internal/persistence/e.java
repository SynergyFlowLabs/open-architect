package com.google.firebase.crashlytics.internal.persistence;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.firebase.crashlytics.internal.common.m;
import com.google.firebase.crashlytics.internal.metadata.p;
import com.google.firebase.crashlytics.internal.model.f0;
import com.google.firebase.crashlytics.internal.model.serialization.j;
import com.google.firebase.crashlytics.internal.settings.k;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f121776f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f121777g = "report";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f121778h = "start-time";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f121779i = "event";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f121780j = 10;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f121781k = "%010d";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f121783m = "_";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f121784n = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f121788a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f121789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f121790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m f121791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f121775e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f121782l = 15;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final j f121785o = new j();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Comparator<? super File> f121786p = new Comparator() { // from class: com.google.firebase.crashlytics.internal.persistence.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final FilenameFilter f121787q = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.persistence.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("event");
        }
    };

    public e(g gVar, k kVar, m mVar) {
        this.f121789b = gVar;
        this.f121790c = kVar;
        this.f121791d = mVar;
    }

    private void A(@NonNull File file, @NonNull f0.e eVar, @NonNull String str, f0.a aVar) {
        String strD = this.f121791d.d(str);
        try {
            j jVar = f121785o;
            E(this.f121789b.j(str), jVar.O(jVar.N(z(file)).v(eVar).r(aVar).q(strD)));
        } catch (IOException e10) {
            com.google.firebase.crashlytics.internal.g.f().n("Could not synthesize final native report file for " + file, e10);
        }
    }

    private void B(String str, long j10) {
        boolean z10;
        List<File> listS = this.f121789b.s(str, f121787q);
        if (listS.isEmpty()) {
            com.google.firebase.crashlytics.internal.g.f().k("Session " + str + " has no events.");
            return;
        }
        Collections.sort(listS);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = listS.iterator();
        loop0: while (true) {
            z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File next = it.next();
                try {
                    arrayList.add(f121785o.l(z(next)));
                    if (z10 || s(next.getName())) {
                        z10 = true;
                    }
                } catch (IOException e10) {
                    com.google.firebase.crashlytics.internal.g.f().n("Could not add event to report for " + next, e10);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            C(this.f121789b.r(str, f121777g), arrayList, j10, z10, p.m(str, this.f121789b), this.f121791d.d(str));
        } else {
            com.google.firebase.crashlytics.internal.g.f().m("Could not parse event files for session " + str);
        }
    }

    private void C(@NonNull File file, @NonNull List<f0.f.d> list, long j10, boolean z10, @p0 String str, @p0 String str2) {
        try {
            j jVar = f121785o;
            f0 f0VarS = jVar.N(z(file)).x(j10, z10, str).q(str2).s(list);
            f0.f fVarN = f0VarS.n();
            if (fVarN == null) {
                return;
            }
            com.google.firebase.crashlytics.internal.g.f().b("appQualitySessionId: " + str2);
            E(z10 ? this.f121789b.m(fVarN.i()) : this.f121789b.o(fVarN.i()), jVar.O(f0VarS));
        } catch (IOException e10) {
            com.google.firebase.crashlytics.internal.g.f().n("Could not synthesize final report file for " + file, e10);
        }
    }

    private int D(String str, int i10) {
        List<File> listS = this.f121789b.s(str, new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.persistence.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return e.t(file, str2);
            }
        });
        Collections.sort(listS, new Comparator() { // from class: com.google.firebase.crashlytics.internal.persistence.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return e.v((File) obj, (File) obj2);
            }
        });
        return f(listS, i10);
    }

    private static void E(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f121775e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static void F(File file, String str, long j10) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f121775e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j10));
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private SortedSet<String> e(@p0 String str) {
        this.f121789b.d();
        SortedSet<String> sortedSetP = p();
        if (str != null) {
            sortedSetP.remove(str);
        }
        if (sortedSetP.size() > 8) {
            while (sortedSetP.size() > 8) {
                String strLast = sortedSetP.last();
                com.google.firebase.crashlytics.internal.g.f().b("Removing session over cap: " + strLast);
                this.f121789b.f(strLast);
                sortedSetP.remove(strLast);
            }
        }
        return sortedSetP;
    }

    private static int f(List<File> list, int i10) {
        int size = list.size();
        for (File file : list) {
            if (size <= i10) {
                break;
            }
            g.v(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i10 = this.f121790c.a().f121860a.f121872b;
        List<File> listN = n();
        int size = listN.size();
        if (size <= i10) {
            return;
        }
        Iterator<File> it = listN.subList(i10, size).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static long h(long j10) {
        return j10 * 1000;
    }

    private void j(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    @NonNull
    private static String m(int i10, boolean z10) {
        return "event" + String.format(Locale.US, f121781k, Integer.valueOf(i10)) + (z10 ? f121783m : "");
    }

    private List<File> n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f121789b.n());
        arrayList.addAll(this.f121789b.k());
        Comparator<? super File> comparator = f121786p;
        Collections.sort(arrayList, comparator);
        List<File> listP = this.f121789b.p();
        Collections.sort(listP, comparator);
        arrayList.addAll(listP);
        return arrayList;
    }

    @NonNull
    private static String o(@NonNull String str) {
        return str.substring(0, f121782l);
    }

    private static boolean s(@NonNull String str) {
        return str.startsWith("event") && str.endsWith(f121783m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(@NonNull File file, @NonNull String str) {
        return str.startsWith("event") && !str.endsWith(f121783m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int v(@NonNull File file, @NonNull File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    @NonNull
    private static String z(@NonNull File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f121775e);
                    fileInputStream.close();
                    return str;
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
    }

    public void i() {
        j(this.f121789b.p());
        j(this.f121789b.n());
        j(this.f121789b.k());
    }

    public void k(@p0 String str, long j10) {
        for (String str2 : e(str)) {
            com.google.firebase.crashlytics.internal.g.f().k("Finalizing report for session " + str2);
            B(str2, j10);
            this.f121789b.f(str2);
        }
        g();
    }

    public void l(String str, f0.e eVar, f0.a aVar) {
        File fileR = this.f121789b.r(str, f121777g);
        com.google.firebase.crashlytics.internal.g.f().b("Writing native session report for " + str + " to file: " + fileR);
        A(fileR, eVar, str, aVar);
    }

    public SortedSet<String> p() {
        return new TreeSet(this.f121789b.g()).descendingSet();
    }

    public long q(String str) {
        return this.f121789b.r(str, f121778h).lastModified();
    }

    public boolean r() {
        return (this.f121789b.p().isEmpty() && this.f121789b.n().isEmpty() && this.f121789b.k().isEmpty()) ? false : true;
    }

    @NonNull
    public List<com.google.firebase.crashlytics.internal.common.f0> u() {
        List<File> listN = n();
        ArrayList arrayList = new ArrayList();
        for (File file : listN) {
            try {
                arrayList.add(com.google.firebase.crashlytics.internal.common.f0.a(f121785o.N(z(file)), file.getName(), file));
            } catch (IOException e10) {
                com.google.firebase.crashlytics.internal.g.f().n("Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        return arrayList;
    }

    public void w(@NonNull f0.f.d dVar, @NonNull String str) {
        x(dVar, str, false);
    }

    public void x(@NonNull f0.f.d dVar, @NonNull String str, boolean z10) {
        int i10 = this.f121790c.a().f121860a.f121871a;
        try {
            E(this.f121789b.r(str, m(this.f121788a.getAndIncrement(), z10)), f121785o.m(dVar));
        } catch (IOException e10) {
            com.google.firebase.crashlytics.internal.g.f().n("Could not persist event for session " + str, e10);
        }
        D(str, i10);
    }

    public void y(@NonNull f0 f0Var) {
        f0.f fVarN = f0Var.n();
        if (fVarN == null) {
            com.google.firebase.crashlytics.internal.g.f().b("Could not get session for report");
            return;
        }
        String strI = fVarN.i();
        try {
            E(this.f121789b.r(strI, f121777g), f121785o.O(f0Var));
            F(this.f121789b.r(strI, f121778h), "", fVarN.l());
        } catch (IOException e10) {
            com.google.firebase.crashlytics.internal.g.f().c("Could not persist report for session " + strI, e10);
        }
    }
}
