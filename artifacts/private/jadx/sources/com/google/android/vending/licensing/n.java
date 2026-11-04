package com.google.android.vending.licensing;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f115080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f115081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f115082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f115083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f115084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f115085g;

    public static n a(String str) {
        int iIndexOf = str.indexOf(58);
        String strSubstring = "";
        if (-1 != iIndexOf) {
            String strSubstring2 = str.substring(0, iIndexOf);
            strSubstring = iIndexOf < str.length() ? str.substring(iIndexOf + 1) : "";
            str = strSubstring2;
        }
        String[] strArrSplit = TextUtils.split(str, Pattern.quote("|"));
        if (strArrSplit.length < 6) {
            throw new IllegalArgumentException("Wrong number of fields.");
        }
        n nVar = new n();
        nVar.f115085g = strSubstring;
        nVar.f115079a = Integer.parseInt(strArrSplit[0]);
        nVar.f115080b = Integer.parseInt(strArrSplit[1]);
        nVar.f115081c = strArrSplit[2];
        int i10 = 6 | 3;
        nVar.f115082d = strArrSplit[3];
        nVar.f115083e = strArrSplit[4];
        nVar.f115084f = Long.parseLong(strArrSplit[5]);
        return nVar;
    }

    public String toString() {
        return TextUtils.join("|", new Object[]{Integer.valueOf(this.f115079a), Integer.valueOf(this.f115080b), this.f115081c, this.f115082d, this.f115083e, Long.valueOf(this.f115084f)});
    }
}
