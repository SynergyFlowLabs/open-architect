package com.google.vr.sdk.base;

import android.content.Context;
import com.google.vr.cardboard.a0;
import com.google.vr.cardboard.b0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@e.b(24)
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f127592a = "HeadsetSelector";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f127593b = new b(g.b().D());

    public static b b(Context context) {
        a0 a0VarA = b0.a(context);
        b bVar = f127593b;
        try {
            com.google.vr.sdk.proto.nano.a.c cVarD = a0VarA.d();
            if (cVarD != null) {
                bVar = new b(cVarD);
            }
            a0VarA.close();
            return bVar;
        } catch (Exception unused) {
            a0VarA.close();
            return bVar;
        } catch (Throwable th2) {
            a0VarA.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(com.google.vr.sdk.proto.nano.a.c cVar) {
        String strX = cVar.x();
        String strU = cVar.u();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strX).length() + 1 + String.valueOf(strU).length());
        sb2.append(strX);
        sb2.append("_");
        sb2.append(strU);
        return sb2.toString();
    }

    public static List<b> d(Context context) {
        ArrayList arrayList = new ArrayList();
        com.google.vr.sdk.proto.nano.a.d dVarI = com.google.vr.ndk.base.k.I(context);
        if (dVarI != null) {
            com.google.vr.sdk.proto.nano.a.c[] cVarArr = dVarI.f129895c;
            if (cVarArr.length > 0) {
                for (com.google.vr.sdk.proto.nano.a.c cVar : cVarArr) {
                    arrayList.add(new b(cVar));
                }
            }
        }
        if (!arrayList.isEmpty() && (arrayList.size() != 1 || ((b) arrayList.get(0)).e())) {
            return arrayList;
        }
        arrayList.add(f127593b);
        return arrayList;
    }

    public static boolean e(Context context, b bVar) {
        boolean z10 = false;
        if (bVar == null) {
            return false;
        }
        a0 a0VarA = b0.a(context);
        try {
            com.google.vr.sdk.proto.nano.a.d dVarB = a0VarA.b();
            if (dVarB != null) {
                com.google.vr.sdk.proto.nano.a.c[] cVarArr = dVarB.f129895c;
                if (cVarArr.length > 0) {
                    for (com.google.vr.sdk.proto.nano.a.c cVar : cVarArr) {
                        if (bVar.c(cVar)) {
                            boolean zG = a0VarA.g(cVar);
                            a0VarA.close();
                            return zG;
                        }
                    }
                }
            }
            b bVar2 = f127593b;
            if (bVar.equals(bVar2) && a0VarA.g(bVar2.f127594a)) {
                z10 = true;
            }
            a0VarA.close();
            return z10;
        } catch (Exception unused) {
            a0VarA.close();
            return false;
        } catch (Throwable th2) {
            a0VarA.close();
            throw th2;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.vr.sdk.proto.nano.a.c f127594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f127595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f127596c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f127597d;

        private b(com.google.vr.sdk.proto.nano.a.c cVar) {
            this(cVar, com.google.vr.ndk.base.m.e(cVar), !com.google.vr.ndk.base.m.h(cVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(com.google.vr.sdk.proto.nano.a.c cVar) {
            return this.f127595b.equalsIgnoreCase(j.c(cVar));
        }

        public static b f(String str, String str2, String str3, boolean z10) {
            com.google.vr.sdk.proto.nano.a.c cVar = new com.google.vr.sdk.proto.nano.a.c();
            cVar.G(str);
            cVar.D(str2);
            return new b(cVar, str3, z10);
        }

        public final String d() {
            return this.f127596c;
        }

        public final boolean e() {
            return this.f127597d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f127595b.equalsIgnoreCase(((b) obj).f127595b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f127595b.hashCode();
        }

        private b(com.google.vr.sdk.proto.nano.a.c cVar, String str, boolean z10) {
            this.f127594a = cVar;
            this.f127595b = j.c(cVar);
            this.f127596c = str;
            this.f127597d = z10;
        }
    }
}
