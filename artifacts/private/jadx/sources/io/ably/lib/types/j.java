package io.ably.lib.types;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.google.gson.f f288038c = new com.google.gson.f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.gson.q f288039d = new com.google.gson.q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.gson.o f288040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f288041b;

    public j() {
        this.f288040a = new com.google.gson.o();
    }

    public static String c(String str) throws a {
        if (str != null && !str.isEmpty()) {
            try {
                return new j((com.google.gson.o) f288039d.c(str)).toString();
            } catch (com.google.gson.p | ClassCastException e10) {
                throw a.c(e10);
            }
        }
        return null;
    }

    public void a(String str, String str2) {
        com.google.gson.i iVar = (com.google.gson.i) this.f288040a.S(str);
        if (iVar == null) {
            iVar = new com.google.gson.i();
            this.f288040a.L(str, iVar);
        }
        int size = iVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (iVar.U(i10).D().equals(str2)) {
                return;
            }
        }
        iVar.P(str2);
        this.f288041b = true;
    }

    public void b(String str, String... strArr) {
        this.f288040a.L(str, (com.google.gson.i) f288038c.K(strArr));
        this.f288041b = true;
    }

    public void d(String str, String str2) {
        com.google.gson.i iVar = (com.google.gson.i) this.f288040a.S(str);
        if (iVar == null) {
            return;
        }
        int size = iVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (iVar.U(i10).D().equals(str2)) {
                if (size == 1) {
                    this.f288040a.Z(str);
                    return;
                } else {
                    iVar.W(i10);
                    return;
                }
            }
        }
    }

    public void e(String str) {
        this.f288040a.Z(str);
    }

    public String toString() {
        if (this.f288041b) {
            Set<Map.Entry<String, com.google.gson.l>> setEntrySet = this.f288040a.entrySet();
            if (setEntrySet.isEmpty()) {
                return "";
            }
            int size = setEntrySet.size();
            String[] strArr = new String[size];
            Iterator<Map.Entry<String, com.google.gson.l>> it = setEntrySet.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                strArr[i10] = it.next().getKey();
                i10++;
            }
            Arrays.sort(strArr);
            com.google.gson.o oVar = new com.google.gson.o();
            for (int i11 = 0; i11 < size; i11++) {
                String str = strArr[i11];
                com.google.gson.i iVarT = this.f288040a.S(str).t();
                int size2 = iVarT.size();
                String[] strArr2 = new String[size2];
                for (int i12 = 0; i12 < size2; i12++) {
                    strArr2[i12] = iVarT.U(i12).D();
                }
                Arrays.sort(strArr2);
                oVar.L(str, f288038c.K(strArr2));
            }
            this.f288040a = oVar;
            this.f288041b = false;
        }
        return f288038c.C(this.f288040a);
    }

    private j(com.google.gson.o oVar) {
        this.f288040a = oVar;
        this.f288041b = true;
    }
}
