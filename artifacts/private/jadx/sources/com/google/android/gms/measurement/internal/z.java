package com.google.android.gms.measurement.internal;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends l8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f110739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f110740d;

    z(h7 h7Var) {
        super(h7Var);
    }

    @Override // com.google.android.gms.measurement.internal.l8
    protected final boolean i() {
        Calendar calendar = Calendar.getInstance();
        this.f110739c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb2.append(lowerCase);
        sb2.append("-");
        sb2.append(lowerCase2);
        this.f110740d = sb2.toString();
        return false;
    }

    public final long o() {
        l();
        return this.f110739c;
    }

    public final String p() {
        l();
        return this.f110740d;
    }
}
