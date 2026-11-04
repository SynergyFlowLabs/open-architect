package com.airbnb.lottie.model;

import androidx.annotation.b1;
import androidx.annotation.j;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f88535c = new e("COMPOSITION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f88536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private f f88537b;

    public e(String... strArr) {
        this.f88536a = Arrays.asList(strArr);
    }

    private boolean b() {
        List<String> list = this.f88536a;
        return list.get(list.size() - 1).equals("**");
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    @j
    @b1({b1.a.LIBRARY})
    public e a(String str) {
        e eVar = new e(this);
        eVar.f88536a.add(str);
        return eVar;
    }

    @b1({b1.a.LIBRARY})
    public boolean c(String str, int i10) {
        if (i10 >= this.f88536a.size()) {
            return false;
        }
        boolean z10 = i10 == this.f88536a.size() - 1;
        String str2 = this.f88536a.get(i10);
        if (!str2.equals("**")) {
            return (z10 || (i10 == this.f88536a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z10 && this.f88536a.get(i10 + 1).equals(str)) {
            return i10 == this.f88536a.size() + (-2) || (i10 == this.f88536a.size() + (-3) && b());
        }
        if (z10) {
            return true;
        }
        int i11 = i10 + 1;
        if (i11 < this.f88536a.size() - 1) {
            return false;
        }
        return this.f88536a.get(i11).equals(str);
    }

    @b1({b1.a.LIBRARY})
    @p0
    public f d() {
        return this.f88537b;
    }

    @b1({b1.a.LIBRARY})
    public int e(String str, int i10) {
        if (f(str)) {
            return 0;
        }
        if (this.f88536a.get(i10).equals("**")) {
            return (i10 != this.f88536a.size() - 1 && this.f88536a.get(i10 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (!this.f88536a.equals(eVar.f88536a)) {
                return false;
            }
            f fVar = this.f88537b;
            if (fVar != null) {
                return fVar.equals(eVar.f88537b);
            }
            if (eVar.f88537b == null) {
                return true;
            }
        }
        return false;
    }

    public String g() {
        return this.f88536a.toString();
    }

    @b1({b1.a.LIBRARY})
    public boolean h(String str, int i10) {
        if (f(str)) {
            return true;
        }
        if (i10 >= this.f88536a.size()) {
            return false;
        }
        return this.f88536a.get(i10).equals(str) || this.f88536a.get(i10).equals("**") || this.f88536a.get(i10).equals("*");
    }

    public int hashCode() {
        int iHashCode = this.f88536a.hashCode() * 31;
        f fVar = this.f88537b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    @b1({b1.a.LIBRARY})
    public boolean i(String str, int i10) {
        return "__container".equals(str) || i10 < this.f88536a.size() - 1 || this.f88536a.get(i10).equals("**");
    }

    @b1({b1.a.LIBRARY})
    public e j(f fVar) {
        e eVar = new e(this);
        eVar.f88537b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f88536a);
        sb2.append(",resolved=");
        sb2.append(this.f88537b != null);
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    private e(e eVar) {
        this.f88536a = new ArrayList(eVar.f88536a);
        this.f88537b = eVar.f88537b;
    }
}
