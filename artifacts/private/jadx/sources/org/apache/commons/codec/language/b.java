package org.apache.commons.codec.language;

import com.devtodev.core.data.consts.RequestParams;
import com.devtodev.core.data.metrics.MetricConsts;
import com.facebook.appevents.l0;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f335298a = "111111";

    @Override // nk.j
    public String f(String str) {
        if (str == null || str.length() == 0) {
            return f335298a;
        }
        int i10 = 6 & 0;
        return (str.toLowerCase(Locale.ENGLISH).replaceAll("[^a-z]", "").replaceAll("^cough", "cou2f").replaceAll("^rough", "rou2f").replaceAll("^tough", "tou2f").replaceAll("^enough", "enou2f").replaceAll("^gn", "2n").replaceAll("mb$", "m2").replaceAll("cq", "2q").replaceAll("ci", MetricConsts.SelfInfo).replaceAll("ce", "se").replaceAll("cy", "sy").replaceAll("tch", "2ch").replaceAll("c", "k").replaceAll("q", "k").replaceAll("x", "k").replaceAll("v", RequestParams.F).replaceAll("dg", "2g").replaceAll("tio", "sio").replaceAll("tia", "sia").replaceAll("d", "t").replaceAll(l0.f99135n, "fh").replaceAll("b", "p").replaceAll("sh", "s2").replaceAll("z", "s").replaceAll("^[aeiou]", androidx.exifinterface.media.a.X4).replaceAll("[aeiou]", androidx.exifinterface.media.a.f51345a5).replaceAll("3gh3", "3kh3").replaceAll("gh", "22").replaceAll("g", "k").replaceAll("s+", androidx.exifinterface.media.a.S4).replaceAll("t+", androidx.exifinterface.media.a.f51379e5).replaceAll("p+", "P").replaceAll("k+", "K").replaceAll("f+", "F").replaceAll("m+", "M").replaceAll("n+", "N").replaceAll("w3", "W3").replaceAll("wy", "Wy").replaceAll("wh3", "Wh3").replaceAll("why", "Why").replaceAll("w", "2").replaceAll("^h", androidx.exifinterface.media.a.X4).replaceAll(androidx.media3.exoplayer.upstream.h.f65993g, "2").replaceAll("r3", "R3").replaceAll("ry", "Ry").replaceAll("r", "2").replaceAll("l3", "L3").replaceAll("ly", "Ly").replaceAll(androidx.media3.exoplayer.upstream.h.f65996j, "2").replaceAll("j", "y").replaceAll("y3", "Y3").replaceAll("y", "2").replaceAll("2", "").replaceAll(androidx.exifinterface.media.a.f51345a5, "") + f335298a).substring(0, 6);
    }
}
