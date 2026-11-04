package androidx.media3.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class n1 extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public static final String f62538l = "rawresource";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f62539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private x f62540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    private AssetFileDescriptor f62541h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private InputStream f62542i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f62543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f62544k;

    public static class a extends u {
        @Deprecated
        public a(String str) {
            super(str, null, 2000);
        }

        @Deprecated
        public a(Throwable th2) {
            super(th2, 2000);
        }

        public a(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public n1(Context context) {
        super(false);
        this.f62539f = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    private static AssetFileDescriptor y(Context context, x xVar) throws a {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = xVar.f62594a.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new a("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = z(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new a("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String strSubstring = (String) androidx.media3.common.util.a.g(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new a("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, androidx.media3.common.x0.f61818h3);
                }
            }
            if (strSubstring.matches("\\d+")) {
                identifier = z(strSubstring);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + strSubstring, "raw", null);
                if (identifier == 0) {
                    throw new a("Resource not found.", null, androidx.media3.common.x0.f61818h3);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new a("Resource is compressed: " + uriNormalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e11) {
            throw new a(null, e11, androidx.media3.common.x0.f61818h3);
        }
    }

    private static int z(String str) throws a {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new a("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    public long c(x xVar) throws a {
        this.f62540g = xVar;
        w(xVar);
        AssetFileDescriptor assetFileDescriptorY = y(this.f62539f, xVar);
        this.f62541h = assetFileDescriptorY;
        long length = assetFileDescriptorY.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f62541h.getFileDescriptor());
        this.f62542i = fileInputStream;
        if (length != -1) {
            try {
                if (xVar.f62600g > length) {
                    throw new a(null, null, 2008);
                }
            } catch (a e10) {
                throw e10;
            } catch (IOException e11) {
                throw new a(null, e11, 2000);
            }
        }
        long startOffset = this.f62541h.getStartOffset();
        long jSkip = fileInputStream.skip(xVar.f62600g + startOffset) - startOffset;
        if (jSkip != xVar.f62600g) {
            throw new a(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f62543j = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.f62543j = size;
                if (size < 0) {
                    throw new a(null, null, 2008);
                }
            }
        } else {
            long j10 = length - jSkip;
            this.f62543j = j10;
            if (j10 < 0) {
                throw new u(2008);
            }
        }
        long jMin = xVar.f62601h;
        if (jMin != -1) {
            long j11 = this.f62543j;
            if (j11 != -1) {
                jMin = Math.min(j11, jMin);
            }
            this.f62543j = jMin;
        }
        this.f62544k = true;
        x(xVar);
        long j12 = xVar.f62601h;
        return j12 != -1 ? j12 : this.f62543j;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005d */
    @Override // androidx.media3.datasource.p, androidx.media3.datasource.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws androidx.media3.datasource.n1.a {
        /*
            r6 = this;
            r0 = 0
            r5 = 7
            r6.f62540g = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.InputStream r3 = r6.f62542i     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L13
            r5 = 7
            if (r3 == 0) goto L15
            r5 = 7
            r3.close()     // Catch: java.lang.Throwable -> L11 java.io.IOException -> L13
            goto L15
        L11:
            r3 = move-exception
            goto L51
        L13:
            r3 = move-exception
            goto L4a
        L15:
            r6.f62542i = r0
            r5 = 1
            android.content.res.AssetFileDescriptor r3 = r6.f62541h     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
            r5 = 4
            if (r3 == 0) goto L27
            r3.close()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
            goto L27
        L21:
            r1 = move-exception
            r5 = 0
            goto L3c
        L24:
            r3 = move-exception
            r5 = 5
            goto L35
        L27:
            r6.f62541h = r0
            r5 = 7
            boolean r0 = r6.f62544k
            if (r0 == 0) goto L34
            r6.f62544k = r2
            r5 = 5
            r6.v()
        L34:
            return
        L35:
            androidx.media3.datasource.n1$a r4 = new androidx.media3.datasource.n1$a     // Catch: java.lang.Throwable -> L21
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L21
            r5 = 1
            throw r4     // Catch: java.lang.Throwable -> L21
        L3c:
            r5 = 4
            r6.f62541h = r0
            r5 = 6
            boolean r0 = r6.f62544k
            if (r0 == 0) goto L49
            r6.f62544k = r2
            r6.v()
        L49:
            throw r1
        L4a:
            r5 = 4
            androidx.media3.datasource.n1$a r4 = new androidx.media3.datasource.n1$a     // Catch: java.lang.Throwable -> L11
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L11
            throw r4     // Catch: java.lang.Throwable -> L11
        L51:
            r6.f62542i = r0
            android.content.res.AssetFileDescriptor r4 = r6.f62541h     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L5f
            if (r4 == 0) goto L62
            r5 = 5
            r4.close()     // Catch: java.lang.Throwable -> L5d java.io.IOException -> L5f
            r5 = 3
            goto L62
        L5d:
            r1 = move-exception
            goto L75
        L5f:
            r3 = move-exception
            r5 = 0
            goto L6f
        L62:
            r6.f62541h = r0
            boolean r0 = r6.f62544k
            if (r0 == 0) goto L6d
            r6.f62544k = r2
            r6.v()
        L6d:
            r5 = 0
            throw r3
        L6f:
            androidx.media3.datasource.n1$a r4 = new androidx.media3.datasource.n1$a     // Catch: java.lang.Throwable -> L5d
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L5d
            throw r4     // Catch: java.lang.Throwable -> L5d
        L75:
            r6.f62541h = r0
            r5 = 2
            boolean r0 = r6.f62544k
            if (r0 == 0) goto L81
            r6.f62544k = r2
            r6.v()
        L81:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.n1.close():void");
    }

    @Override // androidx.media3.datasource.p
    @androidx.annotation.p0
    public Uri getUri() {
        x xVar = this.f62540g;
        if (xVar != null) {
            return xVar.f62594a;
        }
        return null;
    }

    @Override // androidx.media3.common.l, androidx.media3.datasource.g0
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f62543j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(null, e10, 2000);
            }
        }
        int i12 = ((InputStream) androidx.media3.common.util.k1.o(this.f62542i)).read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.f62543j == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f62543j;
        if (j11 != -1) {
            this.f62543j = j11 - ((long) i12);
        }
        u(i12);
        return i12;
    }
}
