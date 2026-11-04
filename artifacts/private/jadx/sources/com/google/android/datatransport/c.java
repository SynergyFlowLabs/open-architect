package com.google.android.datatransport;

import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
final class c extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f103183a;

    c(@p0 Integer num) {
        this.f103183a = num;
    }

    @Override // com.google.android.datatransport.i
    @p0
    public Integer a() {
        return this.f103183a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        Integer num = this.f103183a;
        if (num == null) {
            return iVar.a() == null;
        }
        return num.equals(iVar.a());
    }

    public int hashCode() {
        Integer num = this.f103183a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f103183a + "}";
    }
}
