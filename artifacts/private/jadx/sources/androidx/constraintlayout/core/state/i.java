package androidx.constraintlayout.core.state;

import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i f44324b = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, j> f44325a = new HashMap<>();

    public static i c() {
        return f44324b;
    }

    public String a(String str) {
        j jVar = this.f44325a.get(str);
        if (jVar != null) {
            return jVar.g();
        }
        return null;
    }

    public String b(String str) {
        j jVar = this.f44325a.get(str);
        if (jVar != null) {
            return jVar.h();
        }
        return null;
    }

    public long d(String str) {
        j jVar = this.f44325a.get(str);
        if (jVar != null) {
            return jVar.f();
        }
        return Long.MAX_VALUE;
    }

    public Set<String> e() {
        return this.f44325a.keySet();
    }

    public void f(String str, j jVar) {
        this.f44325a.put(str, jVar);
    }

    public void g(String str, int i10) {
        j jVar = this.f44325a.get(str);
        if (jVar != null) {
            jVar.c(i10);
        }
    }

    public void h(String str, int i10) {
        j jVar = this.f44325a.get(str);
        if (jVar != null) {
            jVar.d(i10);
        }
    }

    public void i(String str, j jVar) {
        this.f44325a.remove(str);
    }

    public void j(String str, String str2) {
        j jVar = this.f44325a.get(str);
        if (jVar != null) {
            jVar.b(str2);
        }
    }

    public void k(String str, int i10, int i11) {
        j jVar = this.f44325a.get(str);
        if (jVar != null) {
            jVar.a(i10, i11);
        }
    }

    public void l(String str, float f10) {
        j jVar = this.f44325a.get(str);
        if (jVar != null) {
            jVar.e(f10);
        }
    }
}
