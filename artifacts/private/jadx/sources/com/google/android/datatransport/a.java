package com.google.android.datatransport;

import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
final class a<T> extends f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f103172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f103173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f103174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f103175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f103176e;

    a(@p0 Integer num, T t10, h hVar, @p0 i iVar, @p0 g gVar) {
        this.f103172a = num;
        if (t10 == null) {
            throw new NullPointerException("Null payload");
        }
        this.f103173b = t10;
        if (hVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f103174c = hVar;
        this.f103175d = iVar;
        this.f103176e = gVar;
    }

    @Override // com.google.android.datatransport.f
    @p0
    public Integer a() {
        return this.f103172a;
    }

    @Override // com.google.android.datatransport.f
    @p0
    public g b() {
        return this.f103176e;
    }

    @Override // com.google.android.datatransport.f
    public T c() {
        return this.f103173b;
    }

    @Override // com.google.android.datatransport.f
    public h d() {
        return this.f103174c;
    }

    @Override // com.google.android.datatransport.f
    @p0
    public i e() {
        return this.f103175d;
    }

    public boolean equals(Object obj) {
        g gVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            Integer num = this.f103172a;
            if (num != null ? num.equals(fVar.a()) : fVar.a() == null) {
                if (this.f103173b.equals(fVar.c()) && this.f103174c.equals(fVar.d())) {
                    i iVar = this.f103175d;
                    if (iVar == null) {
                        if (fVar.e() == null) {
                            gVar = this.f103176e;
                            if (gVar == null ? gVar.equals(fVar.b()) : fVar.b() == null) {
                                return true;
                            }
                        }
                    } else if (iVar.equals(fVar.e())) {
                        gVar = this.f103176e;
                        if (gVar == null) {
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f103172a;
        int iHashCode = 0;
        int iHashCode2 = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f103173b.hashCode()) * 1000003) ^ this.f103174c.hashCode()) * 1000003;
        i iVar = this.f103175d;
        int iHashCode3 = (iHashCode2 ^ (iVar == null ? 0 : iVar.hashCode())) * 1000003;
        g gVar = this.f103176e;
        if (gVar != null) {
            iHashCode = gVar.hashCode();
        }
        return iHashCode3 ^ iHashCode;
    }

    public String toString() {
        return "Event{code=" + this.f103172a + ", payload=" + this.f103173b + ", priority=" + this.f103174c + ", productData=" + this.f103175d + ", eventContext=" + this.f103176e + "}";
    }
}
