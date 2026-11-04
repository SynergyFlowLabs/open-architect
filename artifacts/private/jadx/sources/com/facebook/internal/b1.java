package com.facebook.internal;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b1 f99756a = new b1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f99757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f99758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private static g0 f99759d;

    static {
        String strQ = kotlin.jvm.internal.j1.d(b1.class).Q();
        if (strQ == null) {
            strQ = "UrlRedirectCache";
        }
        f99757b = strQ;
        f99758c = Intrinsics.stringPlus(strQ, "_Redirect");
    }

    private b1() {
    }

    @oj.n
    public static final void a(@Nullable Uri uri, @Nullable Uri uri2) {
        if (uri == null || uri2 == null) {
            return;
        }
        OutputStream outputStreamO = null;
        try {
            try {
                g0 g0VarC = c();
                String string = uri.toString();
                Intrinsics.checkNotNullExpressionValue(string, "fromUri.toString()");
                outputStreamO = g0VarC.o(string, f99758c);
                String string2 = uri2.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toUri.toString()");
                byte[] bytes = string2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStreamO.write(bytes);
            } catch (IOException e10) {
                t0.f100109e.b(com.facebook.t0.CACHE, 4, f99757b, Intrinsics.stringPlus("IOException when accessing cache: ", e10.getMessage()));
            }
            e1 e1Var = e1.f99794a;
        } finally {
            e1 e1Var2 = e1.f99794a;
            e1.j(outputStreamO);
        }
    }

    @oj.n
    public static final void b() {
        try {
            c().g();
        } catch (IOException e10) {
            t0.f100109e.b(com.facebook.t0.CACHE, 5, f99757b, Intrinsics.stringPlus("clearCache failed ", e10.getMessage()));
        }
    }

    @oj.n
    @NotNull
    public static final synchronized g0 c() throws IOException {
        g0 g0Var;
        try {
            g0Var = f99759d;
            if (g0Var == null) {
                g0Var = new g0(f99757b, new g0.e());
            }
            f99759d = g0Var;
        } catch (Throwable th2) {
            throw th2;
        }
        return g0Var;
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00a2: MOVE (r0 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:30:0x00a2 */
    @oj.n
    @Nullable
    public static final Uri d(@Nullable Uri uri) throws Throwable {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        InputStreamReader inputStreamReader3 = null;
        if (uri == null) {
            return null;
        }
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
        HashSet hashSet = new HashSet();
        hashSet.add(string);
        try {
            try {
                g0 g0VarC = c();
                InputStream inputStreamJ = g0VarC.j(string, f99758c);
                inputStreamReader = null;
                boolean z10 = false;
                while (inputStreamJ != null) {
                    try {
                        InputStreamReader inputStreamReader4 = new InputStreamReader(inputStreamJ);
                        try {
                            char[] cArr = new char[128];
                            StringBuilder sb2 = new StringBuilder();
                            for (int i10 = inputStreamReader4.read(cArr, 0, 128); i10 > 0; i10 = inputStreamReader4.read(cArr, 0, 128)) {
                                sb2.append(cArr, 0, i10);
                            }
                            e1 e1Var = e1.f99794a;
                            e1.j(inputStreamReader4);
                            String string2 = sb2.toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "urlBuilder.toString()");
                            if (hashSet.contains(string2)) {
                                if (Intrinsics.areEqual(string2, string)) {
                                    inputStreamReader = inputStreamReader4;
                                    z10 = true;
                                    break;
                                }
                                t0.f100109e.b(com.facebook.t0.CACHE, 6, f99757b, "A loop detected in UrlRedirectCache");
                                e1.j(inputStreamReader4);
                                return null;
                            }
                            hashSet.add(string2);
                            inputStreamJ = g0VarC.j(string2, f99758c);
                            string = string2;
                            inputStreamReader = inputStreamReader4;
                            z10 = true;
                        } catch (IOException e10) {
                            e = e10;
                            inputStreamReader = inputStreamReader4;
                            t0.f100109e.b(com.facebook.t0.CACHE, 4, f99757b, Intrinsics.stringPlus("IOException when accessing cache: ", e.getMessage()));
                        } catch (Throwable th2) {
                            th = th2;
                            inputStreamReader3 = inputStreamReader4;
                            e1 e1Var2 = e1.f99794a;
                            e1.j(inputStreamReader3);
                            throw th;
                        }
                    } catch (IOException e11) {
                        e = e11;
                    }
                }
                if (z10) {
                    Uri uri2 = Uri.parse(string);
                    e1 e1Var3 = e1.f99794a;
                    e1.j(inputStreamReader);
                    return uri2;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader3 = inputStreamReader2;
            }
        } catch (IOException e12) {
            e = e12;
            inputStreamReader = null;
        } catch (Throwable th4) {
            th = th4;
        }
        e1 e1Var4 = e1.f99794a;
        e1.j(inputStreamReader);
        return null;
    }
}
