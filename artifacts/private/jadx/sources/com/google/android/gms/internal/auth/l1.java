package com.google.android.gms.internal.auth;

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
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile e2 f107698a;

    private l1() {
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c A[Catch: all -> 0x0024, TryCatch #3 {all -> 0x0024, blocks: (B:4:0x0006, B:6:0x000a, B:8:0x0018, B:18:0x003c, B:74:0x016e, B:13:0x0028, B:15:0x0031, B:20:0x0044, B:22:0x004b, B:24:0x0052, B:25:0x0057, B:73:0x0169, B:75:0x0172, B:76:0x0175, B:77:0x0176, B:26:0x005c, B:28:0x0062, B:29:0x0073, B:31:0x007b, B:36:0x008d, B:38:0x0093, B:39:0x0098, B:60:0x0131, B:61:0x0135, B:69:0x015c, B:68:0x0144, B:70:0x015d, B:71:0x0164, B:72:0x0165, B:34:0x0084, B:35:0x0089), top: B:88:0x0006, inners: #0 }] */
    public static e2 a(Context context) {
        e2 e2Var;
        e2 e2VarC;
        e2 e2VarC2;
        synchronized (l1.class) {
            try {
                e2Var = f107698a;
                if (e2Var == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        e2VarC2 = e2.c();
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        if (y0.b() && !context.isDeviceProtectedStorage()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            try {
                                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                                e2VarC = file.exists() ? e2.d(file) : e2.c();
                            } catch (RuntimeException unused) {
                                e2VarC = e2.c();
                            }
                            if (e2VarC.b()) {
                                Object objA = e2VarC.a();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream((File) objA)));
                                    try {
                                        androidx.collection.h3 h3Var = new androidx.collection.h3();
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length == 3) {
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
                                                if (!h3Var.containsKey(str3)) {
                                                    h3Var.put(str3, new androidx.collection.h3());
                                                }
                                                ((androidx.collection.h3) h3Var.get(str3)).put(strDecode, strDecode2);
                                            }
                                        }
                                        objA.toString();
                                        context.getPackageName();
                                        e1 e1Var = new e1(h3Var);
                                        bufferedReader.close();
                                        e2VarC2 = e2.d(e1Var);
                                    } catch (Throwable th2) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable th3) {
                                            try {
                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        throw th2;
                                    }
                                } catch (IOException e10) {
                                    throw new RuntimeException(e10);
                                }
                            } else {
                                e2VarC2 = e2.c();
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th4) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th4;
                        }
                    } else {
                        e2VarC2 = e2.c();
                    }
                    e2Var = e2VarC2;
                    f107698a = e2Var;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return e2Var;
    }
}
