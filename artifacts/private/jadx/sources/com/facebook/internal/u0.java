package com.facebook.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final u0 f100117a = new u0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f100118b = u0.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f100119c = "com.facebook.NativeAppCallAttachmentStore.files";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private static File f100120d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final UUID f100121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Bitmap f100122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final Uri f100123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f100124d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private final String f100125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f100126f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f100127g;

        public a(@NotNull UUID callId, @Nullable Bitmap bitmap, @Nullable Uri uri) {
            String strA;
            Intrinsics.checkNotNullParameter(callId, "callId");
            this.f100121a = callId;
            this.f100122b = bitmap;
            this.f100123c = uri;
            if (uri != null) {
                String scheme = uri.getScheme();
                if (StringsKt.N1(FirebaseAnalytics.d.P, scheme, true)) {
                    this.f100126f = true;
                    String authority = uri.getAuthority();
                    this.f100127g = (authority == null || StringsKt.u2(authority, "media", false, 2, null)) ? false : true;
                } else if (StringsKt.N1(com.facebook.share.internal.k.f101891c, uri.getScheme(), true)) {
                    this.f100127g = true;
                } else {
                    e1 e1Var = e1.f99794a;
                    if (!e1.b0(uri)) {
                        throw new com.facebook.u(Intrinsics.stringPlus("Unsupported scheme for media Uri : ", scheme));
                    }
                }
            } else {
                if (bitmap == null) {
                    throw new com.facebook.u("Cannot share media without a bitmap or Uri set");
                }
                this.f100127g = true;
            }
            String string = this.f100127g ? UUID.randomUUID().toString() : null;
            this.f100125e = string;
            if (this.f100127g) {
                com.facebook.q.a aVar = com.facebook.q.f101742a;
                com.facebook.g0 g0Var = com.facebook.g0.f99617a;
                strA = aVar.a(com.facebook.g0.o(), callId, string);
            } else {
                strA = String.valueOf(uri);
            }
            this.f100124d = strA;
        }

        @Nullable
        public final String a() {
            return this.f100125e;
        }

        @NotNull
        public final String b() {
            return this.f100124d;
        }

        @Nullable
        public final Bitmap c() {
            return this.f100122b;
        }

        @NotNull
        public final UUID d() {
            return this.f100121a;
        }

        @Nullable
        public final Uri e() {
            return this.f100123c;
        }

        public final boolean f() {
            return this.f100127g;
        }

        public final boolean g() {
            return this.f100126f;
        }

        public final void h(boolean z10) {
            this.f100126f = z10;
        }

        public final void i(boolean z10) {
            this.f100127g = z10;
        }
    }

    private u0() {
    }

    @oj.n
    public static final void a(@Nullable Collection<a> collection) throws com.facebook.u {
        File fileG;
        if (collection == null || collection.isEmpty()) {
            return;
        }
        if (f100120d == null) {
            b();
        }
        f();
        ArrayList<File> arrayList = new ArrayList();
        try {
            for (a aVar : collection) {
                if (aVar.f() && (fileG = g(aVar.d(), aVar.a(), true)) != null) {
                    arrayList.add(fileG);
                    if (aVar.c() != null) {
                        f100117a.k(aVar.c(), fileG);
                    } else if (aVar.e() != null) {
                        f100117a.l(aVar.e(), aVar.g(), fileG);
                    }
                }
            }
        } catch (IOException e10) {
            Intrinsics.stringPlus("Got unexpected exception:", e10);
            for (File file : arrayList) {
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
            }
            throw new com.facebook.u(e10);
        }
    }

    @oj.n
    public static final void b() {
        File fileH = h();
        if (fileH == null) {
            return;
        }
        kotlin.io.l.Y(fileH);
    }

    @oj.n
    public static final void c(@NotNull UUID callId) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        File fileI = i(callId, false);
        if (fileI == null) {
            return;
        }
        kotlin.io.l.Y(fileI);
    }

    @oj.n
    @NotNull
    public static final a d(@NotNull UUID callId, @NotNull Bitmap attachmentBitmap) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(attachmentBitmap, "attachmentBitmap");
        int i10 = 5 | 0;
        return new a(callId, attachmentBitmap, null);
    }

    @oj.n
    @NotNull
    public static final a e(@NotNull UUID callId, @NotNull Uri attachmentUri) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(attachmentUri, "attachmentUri");
        return new a(callId, null, attachmentUri);
    }

    @oj.n
    @Nullable
    public static final File f() {
        File fileH = h();
        if (fileH == null) {
            return fileH;
        }
        fileH.mkdirs();
        return fileH;
    }

    @oj.n
    @Nullable
    public static final File g(@NotNull UUID callId, @Nullable String str, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(callId, "callId");
        File fileI = i(callId, z10);
        if (fileI == null) {
            return null;
        }
        try {
            return new File(fileI, URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @oj.n
    @Nullable
    public static final synchronized File h() {
        try {
            if (f100120d == null) {
                com.facebook.g0 g0Var = com.facebook.g0.f99617a;
                f100120d = new File(com.facebook.g0.n().getCacheDir(), f100119c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f100120d;
    }

    @oj.n
    @Nullable
    public static final File i(@NotNull UUID callId, boolean z10) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        if (f100120d == null) {
            int i10 = 4 ^ 0;
            return null;
        }
        File file = new File(f100120d, callId.toString());
        if (z10 && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @oj.n
    @Nullable
    public static final File j(@Nullable UUID uuid, @Nullable String str) throws FileNotFoundException {
        e1 e1Var = e1.f99794a;
        if (e1.Z(str) || uuid == null) {
            throw new FileNotFoundException();
        }
        try {
            return g(uuid, str, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }

    private final void k(Bitmap bitmap, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            e1 e1Var = e1.f99794a;
            e1.j(fileOutputStream);
        } catch (Throwable th2) {
            e1 e1Var2 = e1.f99794a;
            e1.j(fileOutputStream);
            throw th2;
        }
    }

    private final void l(Uri uri, boolean z10, File file) throws IOException {
        InputStream inputStreamOpenInputStream;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            if (z10) {
                com.facebook.g0 g0Var = com.facebook.g0.f99617a;
                inputStreamOpenInputStream = com.facebook.g0.n().getContentResolver().openInputStream(uri);
            } else {
                inputStreamOpenInputStream = new FileInputStream(uri.getPath());
            }
            e1 e1Var = e1.f99794a;
            e1.p(inputStreamOpenInputStream, fileOutputStream);
            e1.j(fileOutputStream);
        } catch (Throwable th2) {
            e1 e1Var2 = e1.f99794a;
            e1.j(fileOutputStream);
            throw th2;
        }
    }
}
