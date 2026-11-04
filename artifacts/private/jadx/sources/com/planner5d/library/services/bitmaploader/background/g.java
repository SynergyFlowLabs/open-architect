package com.planner5d.library.services.bitmaploader.background;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.annotation.m1;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.planner5d.library.services.utility.h3;
import com.planner5d.library.services.utility.i3;
import com.planner5d.library.services.utility.o3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.apache.commons.io.p;

/* JADX INFO: loaded from: classes10.dex */
class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Bitmap f224076f = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f224077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f224078b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f224079c = System.currentTimeMillis();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AssetManager f224080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f224081e;

    static class a extends Exception {
        a() {
        }
    }

    @m1
    g(Context context) {
        this.f224081e = context;
        this.f224080d = context.getAssets();
        this.f224077a = new e(context);
    }

    @m1
    private void b() {
        synchronized (this.f224078b) {
            try {
                if (System.currentTimeMillis() - this.f224079c < 60000) {
                    return;
                }
                this.f224079c = System.currentTimeMillis();
                this.f224077a.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @m1
    private void c(URL url, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        try {
            File fileA = i3.f225278a.a("temp", "image", file.getParentFile());
            InputStream inputStream = null;
            try {
                InputStream inputStreamK = k(url);
                try {
                    fileOutputStream = new FileOutputStream(fileA);
                    try {
                        p.v(inputStreamK, fileOutputStream);
                        p.r(inputStreamK, fileOutputStream);
                        if ((!file.exists() || file.delete()) && !fileA.renameTo(file)) {
                            fileA.delete();
                        }
                    } catch (IOException unused) {
                        inputStream = inputStreamK;
                        try {
                            fileA.delete();
                            p.r(inputStream, fileOutputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            p.r(inputStream, fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = inputStreamK;
                        p.r(inputStream, fileOutputStream);
                        throw th;
                    }
                } catch (IOException unused2) {
                    fileOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = null;
                }
            } catch (IOException unused3) {
                fileOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                fileOutputStream = null;
            }
        } catch (Throwable unused4) {
        }
    }

    @m1
    private void d(URL url, long cacheExpire, File file) throws Throwable {
        try {
            c(url, file);
        } catch (a unused) {
            this.f224077a.m(url, cacheExpire);
            throw new FileNotFoundException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0089 A[Catch: all -> 0x0084, FileNotFoundException | IOException | OutOfMemoryError -> 0x00ba, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:28:0x0071, B:30:0x007a, B:37:0x0092, B:41:0x00a1, B:44:0x00a7, B:40:0x009e, B:33:0x0089), top: B:55:0x0071 }] */
    @m1
    private Bitmap g(final int source, final String uri, final int width, final int height, final long cacheExpire) throws Throwable {
        Throwable th2;
        InputStream inputStreamE;
        Bitmap bitmapDecodeByteArray;
        File fileH = this.f224077a.h(source, uri, width, height, cacheExpire);
        if (!this.f224077a.j(fileH, cacheExpire)) {
            if (source == 10) {
                return f224076f;
            }
            Bitmap bitmapK = td.a.f380845a.k(fileH);
            if (bitmapK != null) {
                return bitmapK;
            }
        }
        InputStream inputStream = null;
        if (source == 10) {
            try {
                p.k(e(0, uri, cacheExpire));
                return f224076f;
            } catch (Throwable th3) {
                p.k(null);
                throw th3;
            }
        }
        Bitmap bitmapW = td.a.f380845a.w(width, height, new td.a.InterfaceC2511a() { // from class: com.planner5d.library.services.bitmaploader.background.f
            @Override // td.a.InterfaceC2511a
            public final InputStream a() {
                return this.f224072a.e(source, uri, cacheExpire);
            }
        });
        if (bitmapW != null) {
            return this.f224077a.l(bitmapW, fileH);
        }
        try {
            inputStreamE = e(source, uri, cacheExpire);
            if (inputStreamE == null) {
                p.k(inputStreamE);
                return null;
            }
            if (source != 0) {
                try {
                    try {
                        if (uri.endsWith(".webp")) {
                            byte[] bArrO0 = p.o0(inputStreamE);
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrO0, 0, bArrO0.length);
                        } else {
                            bitmapDecodeByteArray = BitmapFactory.decodeStream(inputStreamE, null, null);
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        inputStream = inputStreamE;
                        p.k(inputStream);
                        throw th2;
                    }
                } catch (FileNotFoundException | IOException | OutOfMemoryError unused) {
                    p.k(inputStreamE);
                    return null;
                }
            } else {
                bitmapDecodeByteArray = BitmapFactory.decodeStream(inputStreamE, null, null);
            }
            Bitmap bitmapO = null;
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    bitmapO = td.a.f380845a.o(bitmapDecodeByteArray, width, height, td.a.b.CenterInsideKeepOriginalAspect);
                } catch (OutOfMemoryError unused2) {
                    o3.c(2000L);
                }
            }
            if (bitmapDecodeByteArray != bitmapO) {
                this.f224077a.l(bitmapO, fileH);
            }
            p.k(inputStreamE);
            return bitmapO;
        } catch (FileNotFoundException | IOException | OutOfMemoryError unused3) {
            inputStreamE = null;
        } catch (Throwable th5) {
            th2 = th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @m1
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream e(int source, String uri, long cacheExpire) throws IOException {
        if (source == 0) {
            return j(new URL(uri), cacheExpire);
        }
        if (source == 1) {
            return new FileInputStream(new File(uri));
        }
        if (source == 2) {
            return this.f224080d.open(uri);
        }
        if (source != 4) {
            if (source == 5 || source == 7) {
                return this.f224081e.getContentResolver().openInputStream(Uri.parse(uri));
            }
            throw new IOException("Invalid source type: " + source);
        }
        int iZ = h3.z(this.f224081e, uri, "raw");
        if (iZ != 0) {
            return this.f224081e.getResources().openRawResource(iZ);
        }
        throw new IOException("Cannot find resource: " + uri);
    }

    private InputStream i(URL url) throws a, IOException {
        HttpURLConnection httpURLConnection;
        IOException e10;
        try {
            url.toString();
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            try {
                if (httpURLConnection.getResponseCode() != 404) {
                    httpURLConnection.disconnect();
                    return FirebasePerfUrlConnection.openStream(url);
                }
                httpURLConnection.disconnect();
                throw new a();
            } catch (IOException e11) {
                e10 = e11;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw e10;
            }
        } catch (IOException e12) {
            httpURLConnection = null;
            e10 = e12;
        }
    }

    @m1
    private InputStream j(URL url, long cacheExpire) throws Throwable {
        File fileG = this.f224077a.g(url, cacheExpire);
        if (fileG == null || !fileG.exists()) {
            if (this.f224077a.k(url, cacheExpire)) {
                url.toString();
                throw new FileNotFoundException();
            }
            d(url, cacheExpire, fileG);
        } else if (this.f224077a.j(fileG, cacheExpire)) {
            d(url, cacheExpire, fileG);
        }
        return new FileInputStream(fileG);
    }

    private InputStream k(URL url) throws IOException, a {
        return ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection())) instanceof HttpURLConnection ? i(url) : new FileInputStream(url.getPath());
    }

    @m1
    Bitmap f(final int source, final String uri, int width, int height, final long cacheExpire) throws IOException {
        b();
        this.f224077a.a(1);
        try {
            try {
                try {
                    Bitmap bitmapG = g(source, uri, width, height, cacheExpire);
                    if (bitmapG != null) {
                        Bitmap.Config config = bitmapG.getConfig();
                        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                        if (!config.equals(config2)) {
                            Bitmap bitmapCopy = bitmapG.copy(config2, false);
                            bitmapG.recycle();
                            bitmapG = bitmapCopy;
                        }
                    }
                    this.f224077a.a(-1);
                    return bitmapG;
                } catch (IOException e10) {
                    throw e10;
                }
            } catch (Throwable th2) {
                throw new IOException(th2);
            }
        } catch (Throwable th3) {
            this.f224077a.a(-1);
            throw th3;
        }
    }
}
