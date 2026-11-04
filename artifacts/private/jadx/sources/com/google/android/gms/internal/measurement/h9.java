package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class h9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile com.google.common.base.e0 f108483a;

    private h9() {
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0042 A[Catch: all -> 0x002b, TryCatch #3 {all -> 0x002b, blocks: (B:6:0x000a, B:8:0x000e, B:10:0x001f, B:20:0x0042, B:76:0x017b, B:15:0x002f, B:17:0x0039, B:22:0x0049, B:24:0x0050, B:26:0x0058, B:27:0x005d, B:75:0x0176, B:77:0x017f, B:78:0x0183, B:79:0x0184, B:28:0x0061, B:30:0x0067, B:31:0x0075, B:33:0x007c, B:38:0x008e, B:40:0x0095, B:41:0x009c, B:61:0x0154, B:62:0x0157, B:71:0x0169, B:69:0x0164, B:72:0x016a, B:73:0x0171, B:74:0x0172, B:36:0x0085, B:37:0x008a), top: B:90:0x000a, inners: #0 }] */
    public static com.google.common.base.e0 a(Context context) {
        com.google.common.base.e0 e0Var;
        com.google.common.base.e0 e0VarA;
        com.google.common.base.e0 e0VarA2;
        com.google.common.base.e0 e0Var2 = f108483a;
        if (e0Var2 != null) {
            return e0Var2;
        }
        synchronized (h9.class) {
            try {
                e0Var = f108483a;
                if (e0Var == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    int i10 = k9.f108601b;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        e0VarA2 = com.google.common.base.e0.a();
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        if (u8.a() && !context.isDeviceProtectedStorage()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            try {
                                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                                e0VarA = file.exists() ? com.google.common.base.e0.f(file) : com.google.common.base.e0.a();
                            } catch (RuntimeException unused) {
                                e0VarA = com.google.common.base.e0.a();
                            }
                            if (e0VarA.e()) {
                                File file2 = (File) e0VarA.d();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        androidx.collection.h3 h3Var = new androidx.collection.h3();
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                new StringBuilder(line.length() + 9);
                                            } else {
                                                String str3 = new String(strArrSplit[0]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                androidx.collection.h3 h3Var2 = (androidx.collection.h3) h3Var.get(str3);
                                                if (h3Var2 == null) {
                                                    h3Var2 = new androidx.collection.h3();
                                                    h3Var.put(str3, h3Var2);
                                                }
                                                h3Var2.put(strDecode, strDecode2);
                                            }
                                        }
                                        new StringBuilder(file2.toString().length() + 28 + String.valueOf(context.getPackageName()).length());
                                        b9 b9Var = new b9(h3Var);
                                        bufferedReader.close();
                                        e0VarA2 = com.google.common.base.e0.f(b9Var);
                                    } catch (Throwable th2) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                        }
                                        throw th2;
                                    }
                                } catch (IOException e10) {
                                    throw new RuntimeException(e10);
                                }
                            } else {
                                e0VarA2 = com.google.common.base.e0.a();
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th4) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th4;
                        }
                    } else {
                        e0VarA2 = com.google.common.base.e0.a();
                    }
                    e0Var = e0VarA2;
                    f108483a = e0Var;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return e0Var;
    }
}
