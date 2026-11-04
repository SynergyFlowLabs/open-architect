package androidx.room;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class k2 implements w3.e, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f74950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f74951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final File f74952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Callable<InputStream> f74953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f74954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final w3.e f74955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private n f74956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f74957h;

    public static final class a extends w3.e.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f74958d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, int i11) {
            super(i11);
            this.f74958d = i10;
        }

        @Override // w3.e.a
        public void d(@NotNull w3.d db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        @Override // w3.e.a
        public void f(@NotNull w3.d db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            int i10 = this.f74958d;
            if (i10 < 1) {
                db2.kc(i10);
            }
        }

        @Override // w3.e.a
        public void g(@NotNull w3.d db2, int i10, int i11) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }
    }

    public k2(@NotNull Context context, @Nullable String str, @Nullable File file, @Nullable Callable<InputStream> callable, int i10, @NotNull w3.e delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f74950a = context;
        this.f74951b = str;
        this.f74952c = file;
        this.f74953d = callable;
        this.f74954e = i10;
        this.f74955f = delegate;
    }

    private final void a(File file, boolean z10) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.f74951b != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.f74950a.getAssets().open(this.f74951b));
            Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f74952c != null) {
            readableByteChannelNewChannel = new FileInputStream(this.f74952c).getChannel();
            Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable<InputStream> callable = this.f74953d;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel(callable.call());
                Intrinsics.checkNotNullExpressionValue(readableByteChannelNewChannel, "newChannel(inputStream)");
            } catch (Exception e10) {
                throw new IOException("inputStreamCallable exception on call", e10);
            }
        }
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.f74950a.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        Intrinsics.checkNotNullExpressionValue(output, "output");
        androidx.room.util.c.a(readableByteChannelNewChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        Intrinsics.checkNotNullExpressionValue(intermediateFile, "intermediateFile");
        c(intermediateFile, z10);
        if (intermediateFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final w3.e b(File file) {
        try {
            int iG = androidx.room.util.b.g(file);
            return new androidx.sqlite.db.framework.f().a(w3.e.b.f385895f.a(this.f74950a).d(file.getAbsolutePath()).c(new a(iG, kotlin.ranges.r.u(iG, 1))).b());
        } catch (IOException e10) {
            throw new RuntimeException("Malformed database file, unable to read version.", e10);
        }
    }

    private final void c(File file, boolean z10) throws IOException {
        n nVar = this.f74956g;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            nVar = null;
        }
        if (nVar.f75029q == null) {
            return;
        }
        w3.e eVarB = b(file);
        try {
            w3.d writableDatabase = z10 ? eVarB.getWritableDatabase() : eVarB.getReadableDatabase();
            n nVar2 = this.f74956g;
            if (nVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                nVar2 = null;
            }
            b2.f fVar = nVar2.f75029q;
            Intrinsics.checkNotNull(fVar);
            fVar.a(writableDatabase);
            Unit unit = Unit.f312394a;
            kotlin.io.c.a(eVarB, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(eVarB, th2);
                throw th3;
            }
        }
    }

    private final void f(boolean z10) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databaseFile = this.f74950a.getDatabasePath(databaseName);
        n nVar = this.f74956g;
        n nVar2 = null;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            nVar = null;
        }
        x3.a aVar = new x3.a(databaseName, this.f74950a.getFilesDir(), nVar.f75032t);
        try {
            x3.a.c(aVar, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                    a(databaseFile, z10);
                    aVar.d();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                int iG = androidx.room.util.b.g(databaseFile);
                if (iG == this.f74954e) {
                    aVar.d();
                    return;
                }
                n nVar3 = this.f74956g;
                if (nVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                } else {
                    nVar2 = nVar3;
                }
                if (nVar2.a(iG, this.f74954e)) {
                    aVar.d();
                    return;
                }
                if (this.f74950a.deleteDatabase(databaseName)) {
                    try {
                        a(databaseFile, z10);
                    } catch (IOException unused) {
                    }
                }
                aVar.d();
            } catch (IOException unused2) {
                aVar.d();
            }
        } catch (Throwable th2) {
            aVar.d();
            throw th2;
        }
    }

    @Override // w3.e, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        e().close();
        this.f74957h = false;
    }

    public final void d(@NotNull n databaseConfiguration) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "databaseConfiguration");
        this.f74956g = databaseConfiguration;
    }

    @Override // androidx.room.p
    @NotNull
    public w3.e e() {
        return this.f74955f;
    }

    @Override // w3.e
    @Nullable
    public String getDatabaseName() {
        return e().getDatabaseName();
    }

    @Override // w3.e
    @NotNull
    public w3.d getReadableDatabase() {
        if (!this.f74957h) {
            f(false);
            this.f74957h = true;
        }
        return e().getReadableDatabase();
    }

    @Override // w3.e
    @NotNull
    public w3.d getWritableDatabase() {
        if (!this.f74957h) {
            f(true);
            this.f74957h = true;
        }
        return e().getWritableDatabase();
    }

    @Override // w3.e
    @androidx.annotation.w0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z10) {
        e().setWriteAheadLoggingEnabled(z10);
    }
}
