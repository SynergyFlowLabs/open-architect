package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.annotation.m1;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, e1<k>> f88177a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<f1> f88178b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f88179c = {80, 75, 3, 4};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f88180d = {com.google.common.base.c.I, -117, 8};

    private c0() {
    }

    public static e1<k> A(final InputStream inputStream, @androidx.annotation.p0 final String str, final boolean z10) {
        return r(str, new Callable() { // from class: com.airbnb.lottie.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c0.C(inputStream, str, z10);
            }
        }, new Runnable() { // from class: com.airbnb.lottie.z
            @Override // java.lang.Runnable
            public final void run() {
                c0.e(z10, inputStream);
            }
        });
    }

    @m1
    public static c1<k> B(InputStream inputStream, @androidx.annotation.p0 String str) {
        return C(inputStream, str, true);
    }

    @m1
    public static c1<k> C(InputStream inputStream, @androidx.annotation.p0 String str, boolean z10) {
        return F(com.airbnb.lottie.parser.moshi.c.b(okio.l0.e(okio.l0.u(inputStream))), str, z10);
    }

    public static e1<k> D(final com.airbnb.lottie.parser.moshi.c cVar, @androidx.annotation.p0 final String str) {
        return r(str, new Callable() { // from class: com.airbnb.lottie.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c0.E(cVar, str);
            }
        }, new Runnable() { // from class: com.airbnb.lottie.m
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.utils.j.c(cVar);
            }
        });
    }

    @m1
    public static c1<k> E(com.airbnb.lottie.parser.moshi.c cVar, @androidx.annotation.p0 String str) {
        return F(cVar, str, true);
    }

    @m1
    public static c1<k> F(com.airbnb.lottie.parser.moshi.c cVar, @androidx.annotation.p0 String str, boolean z10) {
        return G(cVar, str, z10);
    }

    private static c1<k> G(com.airbnb.lottie.parser.moshi.c cVar, @androidx.annotation.p0 String str, boolean z10) {
        k kVarB;
        try {
            if (str == null) {
                kVarB = null;
            } else {
                try {
                    kVarB = com.airbnb.lottie.model.g.c().b(str);
                } catch (Exception e10) {
                    c1<k> c1Var = new c1<>(e10);
                    if (z10) {
                        com.airbnb.lottie.utils.j.c(cVar);
                    }
                    return c1Var;
                }
            }
            if (kVarB != null) {
                c1<k> c1Var2 = new c1<>(kVarB);
                if (z10) {
                    com.airbnb.lottie.utils.j.c(cVar);
                }
                return c1Var2;
            }
            k kVarA = com.airbnb.lottie.parser.w.a(cVar);
            if (str != null) {
                com.airbnb.lottie.model.g.c().d(str, kVarA);
            }
            c1<k> c1Var3 = new c1<>(kVarA);
            if (z10) {
                com.airbnb.lottie.utils.j.c(cVar);
            }
            return c1Var3;
        } catch (Throwable th2) {
            if (z10) {
                com.airbnb.lottie.utils.j.c(cVar);
            }
            throw th2;
        }
    }

    public static e1<k> H(final String str, @androidx.annotation.p0 final String str2) {
        return r(str2, new Callable() { // from class: com.airbnb.lottie.a0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c0.I(str, str2);
            }
        }, null);
    }

    @m1
    public static c1<k> I(String str, @androidx.annotation.p0 String str2) {
        return E(com.airbnb.lottie.parser.moshi.c.b(okio.l0.e(okio.l0.u(new ByteArrayInputStream(str.getBytes())))), str2);
    }

    @m1
    @Deprecated
    public static c1<k> J(JSONObject jSONObject, @androidx.annotation.p0 String str) {
        return I(jSONObject.toString(), str);
    }

    public static e1<k> K(Context context, @androidx.annotation.u0 int i10) {
        return L(context, i10, g0(context, i10));
    }

    public static e1<k> L(Context context, @androidx.annotation.u0 final int i10, @androidx.annotation.p0 final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return r(str, new Callable() { // from class: com.airbnb.lottie.s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c0.a(weakReference, applicationContext, i10, str);
            }
        }, null);
    }

    @m1
    public static c1<k> M(Context context, @androidx.annotation.u0 int i10) {
        return N(context, i10, g0(context, i10));
    }

    @m1
    public static c1<k> N(Context context, @androidx.annotation.u0 int i10, @androidx.annotation.p0 String str) {
        k kVarB = str == null ? null : com.airbnb.lottie.model.g.c().b(str);
        if (kVarB != null) {
            return new c1<>(kVarB);
        }
        try {
            okio.n nVarE = okio.l0.e(okio.l0.u(context.getResources().openRawResource(i10)));
            if (d0(nVarE).booleanValue()) {
                return W(context, new ZipInputStream(nVarE.rf()), str);
            }
            if (!b0(nVarE).booleanValue()) {
                return B(nVarE.rf(), str);
            }
            try {
                return B(new GZIPInputStream(nVarE.rf()), str);
            } catch (IOException e10) {
                return new c1<>((Throwable) e10);
            }
        } catch (Resources.NotFoundException e11) {
            return new c1<>((Throwable) e11);
        }
    }

    public static e1<k> O(Context context, String str) {
        return P(context, str, "url_" + str);
    }

    public static e1<k> P(final Context context, final String str, @androidx.annotation.p0 final String str2) {
        return r(str2, new Callable() { // from class: com.airbnb.lottie.u
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c0.b(context, str, str2);
            }
        }, null);
    }

    @m1
    public static c1<k> Q(Context context, String str) {
        return R(context, str, str);
    }

    @m1
    public static c1<k> R(Context context, String str, @androidx.annotation.p0 String str2) {
        k kVarB = str2 == null ? null : com.airbnb.lottie.model.g.c().b(str2);
        if (kVarB != null) {
            return new c1<>(kVarB);
        }
        c1<k> c1VarC = f.h(context).c(context, str, str2);
        if (str2 != null && c1VarC.b() != null) {
            com.airbnb.lottie.model.g.c().d(str2, c1VarC.b());
        }
        return c1VarC;
    }

    public static e1<k> S(final Context context, final ZipInputStream zipInputStream, @androidx.annotation.p0 final String str) {
        return r(str, new Callable() { // from class: com.airbnb.lottie.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c0.W(context, zipInputStream, str);
            }
        }, new Runnable() { // from class: com.airbnb.lottie.p
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.utils.j.c(zipInputStream);
            }
        });
    }

    public static e1<k> T(final Context context, final ZipInputStream zipInputStream, @androidx.annotation.p0 final String str, boolean z10) {
        return r(str, new Callable() { // from class: com.airbnb.lottie.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c0.W(context, zipInputStream, str);
            }
        }, z10 ? new Runnable() { // from class: com.airbnb.lottie.t
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.utils.j.c(zipInputStream);
            }
        } : null);
    }

    public static e1<k> U(ZipInputStream zipInputStream, @androidx.annotation.p0 String str) {
        return S(null, zipInputStream, str);
    }

    public static e1<k> V(ZipInputStream zipInputStream, @androidx.annotation.p0 String str, boolean z10) {
        return T(null, zipInputStream, str, z10);
    }

    @m1
    public static c1<k> W(@androidx.annotation.p0 Context context, ZipInputStream zipInputStream, @androidx.annotation.p0 String str) {
        return X(context, zipInputStream, str, true);
    }

    @m1
    public static c1<k> X(@androidx.annotation.p0 Context context, ZipInputStream zipInputStream, @androidx.annotation.p0 String str, boolean z10) {
        try {
            c1<k> c1VarA0 = a0(context, zipInputStream, str);
            if (z10) {
                com.airbnb.lottie.utils.j.c(zipInputStream);
            }
            return c1VarA0;
        } catch (Throwable th2) {
            if (z10) {
                com.airbnb.lottie.utils.j.c(zipInputStream);
            }
            throw th2;
        }
    }

    public static c1<k> Y(ZipInputStream zipInputStream, @androidx.annotation.p0 String str) {
        return Z(zipInputStream, str, true);
    }

    public static c1<k> Z(ZipInputStream zipInputStream, @androidx.annotation.p0 String str, boolean z10) {
        return X(null, zipInputStream, str, z10);
    }

    public static /* synthetic */ c1 a(WeakReference weakReference, Context context, int i10, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return N(context, i10, str);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0121 A[Catch: IOException -> 0x027e, TryCatch #3 {IOException -> 0x027e, blocks: (B:7:0x001a, B:9:0x0020, B:12:0x0029, B:14:0x0035, B:62:0x0155, B:15:0x003a, B:17:0x0046, B:18:0x004b, B:20:0x0057, B:21:0x0070, B:24:0x007c, B:26:0x0084, B:28:0x008e, B:31:0x0098, B:33:0x00a2, B:36:0x00ab, B:37:0x00b0, B:57:0x0117, B:59:0x0121, B:60:0x0142, B:56:0x00f6, B:61:0x0146, B:5:0x0010, B:38:0x00ce, B:47:0x00e7, B:55:0x00f5, B:54:0x00f2, B:51:0x00ed, B:40:0x00d5, B:41:0x00d7, B:43:0x00de, B:46:0x00e4), top: B:115:0x0010, inners: #2 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x0121, please report this as an issue */
    @m1
    private static c1<k> a0(Context context, ZipInputStream zipInputStream, @androidx.annotation.p0 String str) {
        k kVarB;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            kVarB = null;
        } else {
            try {
                kVarB = com.airbnb.lottie.model.g.c().b(str);
            } catch (IOException e10) {
                return new c1<>((Throwable) e10);
            }
        }
        if (kVarB != null) {
            return new c1<>(kVarB);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        k kVarB2 = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                kVarB2 = G(com.airbnb.lottie.parser.moshi.c.b(okio.l0.e(okio.l0.u(zipInputStream))), null, false).b();
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                File file = new File(context.getCacheDir(), str2);
                new FileOutputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i10 = zipInputStream.read(bArr);
                            if (i10 == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i10);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    com.airbnb.lottie.utils.d.f("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th4);
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        com.airbnb.lottie.utils.d.e("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    map2.put(str3, typefaceCreateFromFile);
                    nextEntry = zipInputStream.getNextEntry();
                }
                Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                if (!file.delete()) {
                    com.airbnb.lottie.utils.d.e("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile2);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (kVarB2 == null) {
            return new c1<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            x0 x0VarT = t(kVarB2, (String) entry.getKey());
            if (x0VarT != null) {
                x0VarT.i(com.airbnb.lottie.utils.j.m((Bitmap) entry.getValue(), x0VarT.g(), x0VarT.e()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z10 = false;
            for (com.airbnb.lottie.model.c cVar : kVarB2.g().values()) {
                if (cVar.b().equals(entry2.getKey())) {
                    cVar.f((Typeface) entry2.getValue());
                    z10 = true;
                }
            }
            if (!z10) {
                com.airbnb.lottie.utils.d.e("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator<Map.Entry<String, x0>> it = kVarB2.j().entrySet().iterator();
            while (it.hasNext()) {
                x0 value = it.next().getValue();
                if (value == null) {
                    return null;
                }
                String strD = value.d();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (strD.startsWith("data:") && strD.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(strD.substring(strD.indexOf(44) + 1), 0);
                        value.i(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                    } catch (IllegalArgumentException e11) {
                        com.airbnb.lottie.utils.d.f("data URL did not have correct base64 format.", e11);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            com.airbnb.lottie.model.g.c().d(str, kVarB2);
        }
        return new c1<>(kVarB2);
    }

    public static /* synthetic */ c1 b(Context context, String str, String str2) {
        c1<k> c1VarC = f.h(context).c(context, str, str2);
        if (str2 != null && c1VarC.b() != null) {
            com.airbnb.lottie.model.g.c().d(str2, c1VarC.b());
        }
        return c1VarC;
    }

    private static Boolean b0(okio.n nVar) {
        return e0(nVar, f88180d);
    }

    private static boolean c0(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean d0(okio.n nVar) {
        return e0(nVar, f88179c);
    }

    public static /* synthetic */ void e(boolean z10, InputStream inputStream) {
        if (z10) {
            com.airbnb.lottie.utils.j.c(inputStream);
        }
    }

    private static Boolean e0(okio.n nVar, byte[] bArr) {
        try {
            okio.n nVarPeek = nVar.peek();
            int i10 = 6 >> 0;
            for (byte b10 : bArr) {
                if (nVarPeek.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            nVarPeek.close();
            return Boolean.TRUE;
        } catch (Exception e10) {
            com.airbnb.lottie.utils.d.c("Failed to check zip file header", e10);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static /* synthetic */ void f(String str, AtomicBoolean atomicBoolean, k kVar) {
        Map<String, e1<k>> map = f88177a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            f0(true);
        }
    }

    private static void f0(boolean z10) {
        ArrayList arrayList = new ArrayList(f88178b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((f1) arrayList.get(i10)).onIdleChanged(z10);
        }
    }

    private static String g0(Context context, @androidx.annotation.u0 int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(c0(context) ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }

    public static /* synthetic */ void h(String str, AtomicBoolean atomicBoolean, Throwable th2) {
        Map<String, e1<k>> map = f88177a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            f0(true);
        }
    }

    public static void h0(f1 f1Var) {
        f88178b.add(f1Var);
        f1Var.onIdleChanged(f88177a.size() == 0);
    }

    public static void i0(int i10) {
        com.airbnb.lottie.model.g.c().e(i10);
    }

    public static void j0(f1 f1Var) {
        f88178b.remove(f1Var);
    }

    private static e1<k> r(@androidx.annotation.p0 final String str, Callable<c1<k>> callable, @androidx.annotation.p0 Runnable runnable) {
        k kVarB = str == null ? null : com.airbnb.lottie.model.g.c().b(str);
        e1<k> e1Var = kVarB != null ? new e1<>(kVarB) : null;
        if (str != null) {
            Map<String, e1<k>> map = f88177a;
            if (map.containsKey(str)) {
                e1Var = map.get(str);
            }
        }
        if (e1Var != null) {
            if (runnable != null) {
                runnable.run();
            }
            return e1Var;
        }
        e1<k> e1Var2 = new e1<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            e1Var2.d(new y0() { // from class: com.airbnb.lottie.q
                @Override // com.airbnb.lottie.y0
                public final void onResult(Object obj) {
                    c0.f(str, atomicBoolean, (k) obj);
                }
            });
            e1Var2.c(new y0() { // from class: com.airbnb.lottie.r
                @Override // com.airbnb.lottie.y0
                public final void onResult(Object obj) {
                    c0.h(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, e1<k>> map2 = f88177a;
                map2.put(str, e1Var2);
                if (map2.size() == 1) {
                    f0(false);
                }
            }
        }
        return e1Var2;
    }

    public static void s(Context context) {
        f88177a.clear();
        com.airbnb.lottie.model.g.c().a();
        com.airbnb.lottie.network.g gVarG = f.g(context);
        if (gVarG != null) {
            gVarG.a();
        }
    }

    @androidx.annotation.p0
    private static x0 t(k kVar, String str) {
        for (x0 x0Var : kVar.j().values()) {
            if (x0Var.d().equals(str)) {
                return x0Var;
            }
        }
        return null;
    }

    public static e1<k> u(Context context, String str) {
        return v(context, str, "asset_" + str);
    }

    public static e1<k> v(Context context, final String str, @androidx.annotation.p0 final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return r(str2, new Callable() { // from class: com.airbnb.lottie.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c0.x(applicationContext, str, str2);
            }
        }, null);
    }

    @m1
    public static c1<k> w(Context context, String str) {
        return x(context, str, "asset_" + str);
    }

    @m1
    public static c1<k> x(Context context, String str, @androidx.annotation.p0 String str2) {
        k kVarB = str2 == null ? null : com.airbnb.lottie.model.g.c().b(str2);
        if (kVarB != null) {
            return new c1<>(kVarB);
        }
        try {
            okio.n nVarE = okio.l0.e(okio.l0.u(context.getAssets().open(str)));
            if (d0(nVarE).booleanValue()) {
                return W(context, new ZipInputStream(nVarE.rf()), str2);
            }
            return b0(nVarE).booleanValue() ? B(new GZIPInputStream(nVarE.rf()), str2) : B(nVarE.rf(), str2);
        } catch (IOException e10) {
            return new c1<>((Throwable) e10);
        }
    }

    @Deprecated
    public static e1<k> y(final JSONObject jSONObject, @androidx.annotation.p0 final String str) {
        return r(str, new Callable() { // from class: com.airbnb.lottie.x
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c0.J(jSONObject, str);
            }
        }, null);
    }

    public static e1<k> z(final InputStream inputStream, @androidx.annotation.p0 final String str) {
        return r(str, new Callable() { // from class: com.airbnb.lottie.v
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c0.B(inputStream, str);
            }
        }, new Runnable() { // from class: com.airbnb.lottie.w
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.utils.j.c(inputStream);
            }
        });
    }
}
