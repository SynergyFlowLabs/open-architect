package com.google.android.gms.internal.location;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SimpleDateFormat f108154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SimpleDateFormat f108155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("sharedStringBuilder")
    private static final StringBuilder f108156c;

    static {
        Locale locale = Locale.ROOT;
        f108154a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        f108155b = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        f108156c = new StringBuilder(33);
    }

    public static String a(long j10) {
        return j10 >= 0 ? f108154a.format(new Date(j10)) : Long.toString(j10);
    }

    public static String b(long j10) {
        String string;
        StringBuilder sb2 = f108156c;
        synchronized (sb2) {
            sb2.setLength(0);
            c(j10, sb2);
            string = sb2.toString();
        }
        return string;
    }

    public static StringBuilder c(long j10, StringBuilder sb2) {
        if (j10 == 0) {
            sb2.append("0s");
            return sb2;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z10 = false;
        if (j10 < 0) {
            sb2.append("-");
            if (j10 != Long.MIN_VALUE) {
                j10 = -j10;
            } else {
                j10 = Long.MAX_VALUE;
                z10 = true;
            }
        }
        if (j10 >= 86400000) {
            sb2.append(j10 / 86400000);
            sb2.append("d");
            j10 %= 86400000;
        }
        if (true == z10) {
            j10 = 25975808;
        }
        if (j10 >= 3600000) {
            sb2.append(j10 / 3600000);
            sb2.append(androidx.media3.exoplayer.upstream.h.f65993g);
            j10 %= 3600000;
        }
        if (j10 >= 60000) {
            sb2.append(j10 / 60000);
            sb2.append(androidx.media3.exoplayer.upstream.h.f66001o);
            j10 %= 60000;
        }
        if (j10 >= 1000) {
            sb2.append(j10 / 1000);
            sb2.append("s");
            j10 %= 1000;
        }
        if (j10 > 0) {
            sb2.append(j10);
            sb2.append("ms");
        }
        return sb2;
    }
}
