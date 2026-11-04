package com.google.android.gms.internal.fido;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f108026a;

    l0(String str) {
        this.f108026a = str;
    }

    @Override // com.google.android.gms.internal.fido.m0
    protected final int a() {
        return 3;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        m0 m0Var = (m0) obj;
        m0Var.a();
        String str = this.f108026a;
        int length = str.length();
        String str2 = ((l0) m0Var).f108026a;
        return length != str2.length() ? str.length() - str2.length() : str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l0.class == obj.getClass()) {
            return this.f108026a.equals(((l0) obj).f108026a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{3, this.f108026a});
    }

    public final String toString() {
        return "\"" + this.f108026a + "\"";
    }
}
