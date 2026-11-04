package com.google.android.gms.location;

import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.location.n3;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final DecimalFormat f109664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final DecimalFormat f109665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0("sharedStringBuilder")
    private static final StringBuilder f109666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f109667d = 0;

    static {
        Locale locale = Locale.ROOT;
        f109664a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        f109665b = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        f109666c = new StringBuilder();
    }

    public static StringBuilder a(Location location, StringBuilder sb2) {
        sb2.ensureCapacity(100);
        if (location == null) {
            sb2.append((String) null);
            return sb2;
        }
        sb2.append("{");
        sb2.append(location.getProvider());
        sb2.append(", ");
        if (androidx.core.location.d.t(location)) {
            sb2.append("mock, ");
        }
        DecimalFormat decimalFormat = f109664a;
        sb2.append(decimalFormat.format(location.getLatitude()));
        sb2.append(",");
        sb2.append(decimalFormat.format(location.getLongitude()));
        if (location.hasAccuracy()) {
            sb2.append("±");
            sb2.append(f109665b.format(location.getAccuracy()));
            sb2.append(androidx.media3.exoplayer.upstream.h.f66001o);
        }
        if (location.hasAltitude()) {
            sb2.append(", alt=");
            DecimalFormat decimalFormat2 = f109665b;
            sb2.append(decimalFormat2.format(location.getAltitude()));
            if (androidx.core.location.d.s(location)) {
                sb2.append("±");
                sb2.append(decimalFormat2.format(androidx.core.location.d.n(location)));
            }
            sb2.append(androidx.media3.exoplayer.upstream.h.f66001o);
        }
        if (location.hasSpeed()) {
            sb2.append(", spd=");
            DecimalFormat decimalFormat3 = f109665b;
            sb2.append(decimalFormat3.format(location.getSpeed()));
            if (androidx.core.location.d.r(location)) {
                sb2.append("±");
                sb2.append(decimalFormat3.format(androidx.core.location.d.m(location)));
            }
            sb2.append("m/s");
        }
        if (location.hasBearing()) {
            sb2.append(", brg=");
            DecimalFormat decimalFormat4 = f109665b;
            sb2.append(decimalFormat4.format(location.getBearing()));
            if (androidx.core.location.d.o(location)) {
                sb2.append("±");
                sb2.append(decimalFormat4.format(androidx.core.location.d.b(location)));
            }
            sb2.append("°");
        }
        Bundle extras = location.getExtras();
        String string = extras != null ? extras.getString("floorLabel") : null;
        if (string != null) {
            sb2.append(", fl=");
            sb2.append(string);
        }
        Bundle extras2 = location.getExtras();
        String string2 = extras2 != null ? extras2.getString("levelId") : null;
        if (string2 != null) {
            sb2.append(", lv=");
            sb2.append(string2);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        sb2.append(", ert=");
        sb2.append(n3.a(androidx.core.location.d.c(location) + jCurrentTimeMillis));
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2;
    }
}
