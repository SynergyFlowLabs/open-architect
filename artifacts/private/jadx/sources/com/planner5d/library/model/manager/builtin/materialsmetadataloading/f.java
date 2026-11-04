package com.planner5d.library.model.manager.builtin.materialsmetadataloading;

import android.app.Application;
import androidx.annotation.m1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.builtin.e1;
import com.planner5d.library.services.download.k;
import com.planner5d.library.services.download.l;
import com.planner5d.library.services.utility.c2;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.i1;
import com.planner5d.library.services.z;
import java.io.File;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.HttpURLConnection;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.g0;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMetadataLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetadataLoader.kt\ncom/planner5d/library/model/manager/builtin/materialsmetadataloading/MetadataLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
public abstract class f<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f181145h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f181146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.d.g f181147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final e1 f181148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final g f181149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final c2 f181150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final i1 f181151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final z f181152g;

    private static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f181153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f181154b;

        public a(T t10, long j10) {
            this.f181153a = t10;
            this.f181154b = j10;
        }

        public final T a() {
            return this.f181153a;
        }

        public final long b() {
            return this.f181154b;
        }
    }

    /* synthetic */ class b implements l, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f<T> f181155a;

        b(f<T> fVar) {
            this.f181155a = fVar;
        }

        @Override // kotlin.jvm.internal.c0
        public final x<?> b() {
            return new g0(1, this.f181155a, f.class, "configureAndExecuteDownloading", "configureAndExecuteDownloading(Lcom/planner5d/library/services/download/DownloadUri;)Lcom/planner5d/library/model/manager/builtin/materialsmetadataloading/MetadataLoader$DataWithLastModifiedTime;", 0);
        }

        @Override // com.planner5d.library.services.download.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final a<T> a(com.planner5d.library.services.download.g p10) {
            Intrinsics.checkNotNullParameter(p10, "p0");
            return this.f181155a.b(p10);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof l) && (obj instanceof c0)) {
                return Intrinsics.areEqual(b(), ((c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public f(@NotNull Application application, @NotNull com.planner5d.library.services.bitmaploader.d.g uriLoader, @NotNull e1 materialFilePaths, @NotNull g dataPaths, @NotNull c2 networkStateUtility, @NotNull i1 internetStateMonitor, @NotNull z privateFiles) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(uriLoader, "uriLoader");
        Intrinsics.checkNotNullParameter(materialFilePaths, "materialFilePaths");
        Intrinsics.checkNotNullParameter(dataPaths, "dataPaths");
        Intrinsics.checkNotNullParameter(networkStateUtility, "networkStateUtility");
        Intrinsics.checkNotNullParameter(internetStateMonitor, "internetStateMonitor");
        Intrinsics.checkNotNullParameter(privateFiles, "privateFiles");
        this.f181146a = application;
        this.f181147b = uriLoader;
        this.f181148c = materialFilePaths;
        this.f181149d = dataPaths;
        this.f181150e = networkStateUtility;
        this.f181151f = internetStateMonitor;
        this.f181152g = privateFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    public final a<T> b(com.planner5d.library.services.download.g gVar) throws Throwable {
        HttpURLConnection httpURLConnectionD0 = h3.d0(gVar.b());
        try {
            pe.d dVar = pe.d.f345635a;
            Intrinsics.checkNotNull(httpURLConnectionD0);
            dVar.b(httpURLConnectionD0, d().lastModified());
            InputStream inputStream = httpURLConnectionD0.getInputStream();
            try {
                T tH = h(inputStream);
                kotlin.io.c.a(inputStream, null);
                a<T> aVar = new a<>(tH, httpURLConnectionD0.getLastModified());
                httpURLConnectionD0.disconnect();
                return aVar;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(inputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            if (httpURLConnectionD0 != null) {
                try {
                    if (httpURLConnectionD0.getResponseCode() == pe.d.b.NotModified.l()) {
                        throw new k();
                    }
                } catch (Throwable th5) {
                    if (httpURLConnectionD0 != null) {
                        httpURLConnectionD0.disconnect();
                    }
                    throw th5;
                }
            }
            throw th4;
        }
    }

    @m1
    private final void c() {
        File file = new File(j());
        if (!file.isFile()) {
            file = null;
        }
        if (file != null) {
            file.delete();
        }
    }

    private final File d() {
        return this.f181152g.a(this.f181149d.b());
    }

    @m1
    private final T g() throws Exception {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(this.f181152g.c(this.f181149d.b()));
            try {
                T t10 = (T) objectInputStream.readObject();
                kotlin.io.c.a(objectInputStream, null);
                return t10;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(objectInputStream, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            String strA = this.f181149d.a();
            InputStream inputStreamOpen = strA != null ? this.f181146a.getAssets().open(strA) : null;
            try {
                T tF = f(inputStreamOpen);
                kotlin.io.c.a(inputStreamOpen, null);
                return tF;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    kotlin.io.c.a(inputStreamOpen, th4);
                    throw th5;
                }
            }
        }
    }

    @m1
    private final void i(a<T> aVar) throws Exception {
        String strJ = j();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(this.f181152g.d(strJ));
        try {
            objectOutputStream.writeObject(aVar.a());
            Unit unit = Unit.f312394a;
            kotlin.io.c.a(objectOutputStream, null);
            File fileA = this.f181152g.a(strJ);
            fileA.setLastModified(aVar.b());
            fileA.renameTo(d());
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(objectOutputStream, th2);
                throw th3;
            }
        }
    }

    private final String j() {
        return this.f181149d.b() + ".tmp";
    }

    @m1
    public final T e(@Nullable com.planner5d.library.model.d dVar) throws Exception {
        c();
        try {
            a<T> aVar = (a) this.f181147b.a(this.f181146a, this.f181148c.e(dVar, this.f181149d.c()), new b(this), this.f181150e, this.f181151f);
            try {
                Intrinsics.checkNotNull(aVar);
                i(aVar);
            } catch (Exception e10) {
                timber.log.b.f381052a.f(e10, "Could not save downloaded data to local file: " + getClass().getName(), new Object[0]);
            }
            return aVar.a();
        } catch (Throwable unused) {
            return g();
        }
    }

    @m1
    protected abstract T f(@Nullable InputStream inputStream) throws Exception;

    @m1
    protected abstract T h(@NotNull InputStream inputStream) throws Throwable;
}
