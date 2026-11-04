package com.airbnb.lottie.network;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.m1;
import androidx.annotation.p0;
import com.airbnb.lottie.c0;
import com.airbnb.lottie.c1;
import com.airbnb.lottie.k;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY})
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final g f88634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final f f88635b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88636a;

        static {
            int[] iArr = new int[c.values().length];
            f88636a = iArr;
            try {
                iArr[c.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88636a[c.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public h(@p0 g gVar, @NonNull f fVar) {
        this.f88634a = gVar;
        this.f88635b = fVar;
    }

    @m1
    @p0
    private k a(Context context, @NonNull String str, @p0 String str2) {
        g gVar;
        c1<k> c1VarW;
        if (str2 != null && (gVar = this.f88634a) != null) {
            Pair<c, InputStream> pairB = gVar.b(str);
            if (pairB == null) {
                return null;
            }
            c cVar = (c) pairB.first;
            InputStream inputStream = (InputStream) pairB.second;
            int i10 = a.f88636a[cVar.ordinal()];
            if (i10 == 1) {
                c1VarW = c0.W(context, new ZipInputStream(inputStream), str2);
            } else if (i10 != 2) {
                c1VarW = c0.B(inputStream, str2);
            } else {
                try {
                    c1VarW = c0.B(new GZIPInputStream(inputStream), str2);
                } catch (IOException e10) {
                    c1VarW = new c1<>(e10);
                }
            }
            if (c1VarW.b() != null) {
                return c1VarW.b();
            }
        }
        return null;
    }

    @NonNull
    @m1
    private c1<k> b(Context context, @NonNull String str, @p0 String str2) {
        c1<k> c1Var;
        com.airbnb.lottie.utils.d.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                d dVarA = this.f88635b.a(str);
                if (dVarA.isSuccessful()) {
                    c1Var = e(context, str, dVarA.Ia(), dVarA.oa(), str2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Completed fetch from network. Success: ");
                    sb2.append(c1Var.b() != null);
                    com.airbnb.lottie.utils.d.a(sb2.toString());
                } else {
                    c1Var = new c1<>(new IllegalArgumentException(dVarA.error()));
                }
                try {
                    dVarA.close();
                    return c1Var;
                } catch (IOException e10) {
                    com.airbnb.lottie.utils.d.f("LottieFetchResult close failed ", e10);
                    return c1Var;
                }
            } catch (Exception e11) {
                c1<k> c1Var2 = new c1<>(e11);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e12) {
                        com.airbnb.lottie.utils.d.f("LottieFetchResult close failed ", e12);
                    }
                }
                return c1Var2;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                throw th2;
            }
            try {
                closeable.close();
                throw th2;
            } catch (IOException e13) {
                com.airbnb.lottie.utils.d.f("LottieFetchResult close failed ", e13);
                throw th2;
            }
        }
    }

    @NonNull
    private c1<k> d(@NonNull String str, @NonNull InputStream inputStream, @p0 String str2) throws IOException {
        g gVar;
        return (str2 == null || (gVar = this.f88634a) == null) ? c0.B(new GZIPInputStream(inputStream), null) : c0.B(new GZIPInputStream(new FileInputStream(gVar.h(str, inputStream, c.GZIP))), str);
    }

    @NonNull
    private c1<k> e(Context context, @NonNull String str, @NonNull InputStream inputStream, @p0 String str2, @p0 String str3) throws IOException {
        c1<k> c1VarG;
        c cVar;
        g gVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            com.airbnb.lottie.utils.d.a("Handling zip response.");
            c cVar2 = c.ZIP;
            c1VarG = g(context, str, inputStream, str3);
            cVar = cVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            com.airbnb.lottie.utils.d.a("Handling gzip response.");
            cVar = c.GZIP;
            c1VarG = d(str, inputStream, str3);
        } else {
            com.airbnb.lottie.utils.d.a("Received json response.");
            cVar = c.JSON;
            c1VarG = f(str, inputStream, str3);
        }
        if (str3 != null && c1VarG.b() != null && (gVar = this.f88634a) != null) {
            gVar.g(str, cVar);
        }
        return c1VarG;
    }

    @NonNull
    private c1<k> f(@NonNull String str, @NonNull InputStream inputStream, @p0 String str2) throws IOException {
        g gVar;
        return (str2 == null || (gVar = this.f88634a) == null) ? c0.B(inputStream, null) : c0.B(new FileInputStream(gVar.h(str, inputStream, c.JSON).getAbsolutePath()), str);
    }

    @NonNull
    private c1<k> g(Context context, @NonNull String str, @NonNull InputStream inputStream, @p0 String str2) throws IOException {
        g gVar;
        if (str2 != null && (gVar = this.f88634a) != null) {
            return c0.W(context, new ZipInputStream(new FileInputStream(gVar.h(str, inputStream, c.ZIP))), str);
        }
        return c0.W(context, new ZipInputStream(inputStream), null);
    }

    @NonNull
    @m1
    public c1<k> c(Context context, @NonNull String str, @p0 String str2) {
        k kVarA = a(context, str, str2);
        if (kVarA != null) {
            return new c1<>(kVarA);
        }
        com.airbnb.lottie.utils.d.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(context, str, str2);
    }
}
