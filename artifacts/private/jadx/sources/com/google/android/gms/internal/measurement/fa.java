package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
final class fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f108426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f108427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bb f108428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f108429e;

    fa() {
        int i10 = bb.f108300e;
        int i11 = gd.f108451d;
        this.f108428d = bb.f108299d;
    }

    static /* synthetic */ String a(int i10, int i11, byte b10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + b10 + String.valueOf(i10).length());
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
        sb2.append(i10);
        return sb2.toString();
    }

    fa(bb bbVar) {
        bbVar.getClass();
        this.f108428d = bbVar;
    }
}
