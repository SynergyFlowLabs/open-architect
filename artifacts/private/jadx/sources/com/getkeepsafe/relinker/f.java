package com.getkeepsafe.relinker;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f102900g = "lib";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Set<String> f102901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final e.b f102902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final e.a f102903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f102904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f102905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected e.d f102906f;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f102907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f102908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f102909c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e.c f102910d;

        a(final Context val$context, final String val$library, final String val$version, final e.c val$listener) {
            this.f102907a = val$context;
            this.f102908b = val$library;
            this.f102909c = val$version;
            this.f102910d = val$listener;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                f.this.j(this.f102907a, this.f102908b, this.f102909c);
                this.f102910d.b();
            } catch (c e10) {
                this.f102910d.a(e10);
            } catch (UnsatisfiedLinkError e11) {
                this.f102910d.a(e11);
            }
        }
    }

    class b implements FilenameFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f102912a;

        b(final String val$mappedLibraryName) {
            this.f102912a = val$mappedLibraryName;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File dir, String filename) {
            return filename.startsWith(this.f102912a);
        }
    }

    protected f() {
        this(new g(), new com.getkeepsafe.relinker.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(final Context context, final String library, final String version) throws Throwable {
        f fVar;
        Context context2;
        com.getkeepsafe.relinker.elf.f fVar2;
        Throwable th2;
        if (this.f102901a.contains(library) && !this.f102904d) {
            m("%s already loaded previously!", library);
            return;
        }
        try {
            this.f102902b.d(library);
            this.f102901a.add(library);
            m("%s (%s) was loaded normally!", library, version);
        } catch (UnsatisfiedLinkError e10) {
            m("Loading the library normally failed: %s", Log.getStackTraceString(e10));
            m("%s (%s) was not loaded normally, re-linking...", library, version);
            File fileE = e(context, library, version);
            if (!fileE.exists() || this.f102904d) {
                if (this.f102904d) {
                    m("Forcing a re-link of %s (%s)...", library, version);
                }
                b(context, library, version);
                fVar = this;
                context2 = context;
                this.f102903c.a(context2, this.f102902b.b(), this.f102902b.e(library), fileE, fVar);
            } else {
                fVar = this;
                context2 = context;
            }
            try {
                if (fVar.f102905e) {
                    try {
                        fVar2 = new com.getkeepsafe.relinker.elf.f(fileE);
                        try {
                            List<String> listC = fVar2.c();
                            fVar2.close();
                            Iterator<String> it = listC.iterator();
                            while (it.hasNext()) {
                                fVar.f(context2, fVar.f102902b.a(it.next()));
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            if (fVar2 != null) {
                                fVar2.close();
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        fVar2 = null;
                        th2 = th4;
                    }
                }
            } catch (IOException unused) {
            }
            fVar.f102902b.c(fileE.getAbsolutePath());
            fVar.f102901a.add(library);
            fVar.m("%s (%s) was re-linked!", library, version);
        }
    }

    protected void b(final Context context, final String library, final String currentVersion) {
        File fileD = d(context);
        File fileE = e(context, library, currentVersion);
        File[] fileArrListFiles = fileD.listFiles(new b(this.f102902b.e(library)));
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.f102904d || !file.getAbsolutePath().equals(fileE.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    public f c() {
        this.f102904d = true;
        return this;
    }

    protected File d(final Context context) {
        return context.getDir(f102900g, 0);
    }

    protected File e(final Context context, final String library, final String version) {
        String strE = this.f102902b.e(library);
        if (h.a(version)) {
            return new File(d(context), strE);
        }
        return new File(d(context), strE + "." + version);
    }

    public void f(final Context context, final String library) {
        i(context, library, null, null);
    }

    public void g(final Context context, final String library, final e.c listener) {
        i(context, library, null, listener);
    }

    public void h(final Context context, final String library, final String version) {
        i(context, library, version, null);
    }

    public void i(final Context context, final String library, final String version, final e.c listener) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (h.a(library)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        m("Beginning load of %s...", library);
        if (listener == null) {
            j(context, library, version);
        } else {
            new Thread(new a(context, library, version, listener)).start();
        }
    }

    public f k(final e.d logger) {
        this.f102906f = logger;
        return this;
    }

    public void l(final String message) {
        e.d dVar = this.f102906f;
        if (dVar != null) {
            dVar.a(message);
        }
    }

    public void m(final String format, final Object... args) {
        l(String.format(Locale.US, format, args));
    }

    public f n() {
        this.f102905e = true;
        return this;
    }

    protected f(final e.b libraryLoader, final e.a libraryInstaller) {
        this.f102901a = new HashSet();
        if (libraryLoader == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (libraryInstaller == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.f102902b = libraryLoader;
        this.f102903c = libraryInstaller;
    }
}
