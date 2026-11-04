package com.google.api.client.testing.util;

import com.google.api.client.util.i0;
import com.google.common.primitives.t;
import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.msgpack.core.h;

/* JADX INFO: loaded from: classes4.dex */
@com.google.api.client.util.f
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f116026a = {48, -126, 2, 118, 2, 1, 0, 48, com.google.common.base.c.f116462o, 6, 9, 42, -122, 72, -122, -9, com.google.common.base.c.f116462o, 1, 1, 1, 5, 0, 4, -126, 2, 96, 48, -126, 2, 92, 2, 1, 0, 2, -127, -127, 0, -89, 33, 8, -124, 110, h.a.f339273i, 89, 8, h.a.f339271g, 69, 120, 95, h.a.f339274j, h.a.f339290z, com.google.common.base.c.f116462o, -18, 123, com.google.common.base.c.G, -31, com.google.common.base.c.f116462o, -80, -76, 109, h.a.f339271g, -79, 2, 104, -94, 76, 59, -73, -26, 99, 123, h.a.f339276l, -92, -100, 116, 50, -25, 96, 53, 124, 95, 76, h.a.f339274j, -84, 70, com.google.common.base.c.E, 0, 72, h.a.f339270f, 84, -77, -2, -107, -66, h.a.K, -119, com.google.common.base.c.E, -95, 54, h.a.f339289y, -89, 1, 71, 44, 7, h.a.f339278n, 126, 5, -78, 87, -105, -114, 65, -19, 58, -78, -95, 0, 118, 83, 76, -88, 2, -21, 127, t.f119782a, 74, -103, -114, -127, -70, -81, -127, 125, h.a.F, com.google.common.base.c.f116472y, 113, com.google.common.base.c.f116471x, -102, 46, h.a.F, -111, -97, 97, -127, 32, 87, -80, 105, com.google.common.base.c.f116468u, -19, 107, -73, h.a.f339283s, -97, 11, -23, h.a.f339274j, -107, -107, 83, -25, com.google.common.base.c.f116464q, -93, -21, 2, 3, 1, 0, 1, 2, -127, -128, 45, h.a.I, -104, com.google.common.base.c.D, h.a.C, h.a.B, h.a.f339289y, -29, h.a.H, -123, -7, -110, -73, -106, 80, -5, -118, com.google.common.base.c.B, h.a.E, 66, h.a.f339279o, -93, h.a.f339279o, -104, 43, h.a.f339271g, h.a.f339285u, 122, -14, h.a.B, 85, com.google.common.base.c.f116468u, h.a.f339280p, 109, com.google.common.base.c.f116473z, -113, 44, 77, -116, 7, 10, h.a.f339290z, h.a.f339272h, 43, h.a.C, h.a.f339272h, 76, 19, -11, -89, 47, 80, -72, 113, -86, 70, -23, com.google.common.base.c.E, 113, 37, -1, 42, 48, 84, -80, com.google.common.base.c.H, 86, 36, -124, -22, 79, h.a.f339289y, 87, h.a.C, com.google.common.base.c.I, h.a.B, h.a.f339289y, -16, -74, 85, kotlin.io.encoding.a.f312535i, -122, -22, 10, -31, 78, 92, -123, -77, com.google.common.base.c.f116461n, -80, 62, h.a.f339281q, 68, h.a.f339287w, com.fasterxml.jackson.core.json.a.f102487i, 67, 124, -78, -23, -105, -77, -2, 89, -16, -12, h.a.f339277m, h.a.f339282r, com.google.common.base.c.D, 102, 46, 39, h.a.f339272h, -13, -79, com.fasterxml.jackson.core.json.a.f102489k, -5, 126, 70, com.google.common.base.c.G, com.google.common.base.c.I, 104, -109, 65, -23, com.fasterxml.jackson.core.json.a.f102488j, com.google.common.base.c.A, -7, 2, 65, 0, h.a.A, com.google.common.base.c.f116468u, 101, 10, -21, 37, 107, -3, -114, -29, h.a.C, 76, 107, -122, 40, 8, h.a.f339275k, h.a.K, -12, 55, -4, h.a.f339272h, -66, 91, h.a.f339277m, h.a.f339283s, 78, -124, 11, h.a.f339284t, h.a.f339271g, -121, h.a.f339277m, 70, -92, 90, 32, h.a.f339267c, 49, com.google.common.base.c.D, -99, 113, 44, com.google.common.base.c.D, 42, -99, h.a.C, -123, 17, 93, 114, 125, 35, -118, h.a.K, 125, h.a.f339269e, kotlin.io.encoding.a.f312535i, 58, h.a.f339275k, -105, -105, h.a.D, 93, 2, 65, 0, h.a.f339276l, h.a.G, -22, -107, h.a.A, -79, 0, -118, 121, -76, 120, 52, 110, 127, 115, 68, -86, -4, 96, h.a.f339283s, 72, h.a.f339273i, h.a.f339276l, 125, 57, com.google.common.base.c.f116472y, -81, h.a.f339289y, com.google.common.base.c.C, 112, -75, 83, 57, h.a.f339278n, kotlin.io.encoding.a.f312535i, com.google.common.base.c.B, com.google.common.base.c.F, h.a.f339267c, -103, -8, 120, 110, h.a.f339281q, -108, h.a.B, -76, h.a.f339268d, 87, -117, 69, 0, t.f119782a, com.google.common.base.c.D, 4, 122, com.google.common.base.c.f116462o, 6, -106, 112, h.a.f339282r, -1, 79, 117, -25, 2, t.f119782a, 127, 68, 60, 81, -5, 110, 41, -1, 122, 93, -74, -113, -24, 52, com.fasterxml.jackson.core.json.a.f102489k, h.a.f339273i, 72, 8, 32, -24, h.a.f339285u, com.google.common.base.c.D, h.a.f339276l, 38, -26, 0, h.a.f339285u, -24, -21, -28, -66, 47, h.a.J, 63, 48, 34, 108, h.a.f339282r, -116, -125, h.a.C, 42, com.google.common.base.c.D, 32, com.google.common.base.c.f116461n, 73, -1, com.google.common.base.c.C, 77, 51, -109, 7, com.google.common.base.c.f116473z, -124, 79, -26, 50, h.a.f339282r, -76, com.google.common.base.c.f116462o, -80, -66, 19, -7, 2, 65, 0, -90, 99, -20, 68, -4, -84, -11, -105, 83, -123, -124, h.a.f339270f, -103, -16, -81, 101, 78, -72, -72, 91, 100, h.a.f339276l, -74, -111, 49, com.google.common.base.c.f116468u, 54, 4, -19, 125, 32, -24, 125, -26, 100, h.a.J, -117, 0, 115, com.fasterxml.jackson.core.json.a.f102489k, 33, 124, -107, 3, -95, -91, 118, com.google.common.base.c.f116461n, com.google.common.base.c.f116461n, com.google.common.base.c.G, 80, -3, com.google.common.base.c.f116461n, -20, 7, 52, -118, -12, 122, 75, 117, -81, h.a.f339267c, -89, 2, t.f119782a, 93, -21, h.a.f339281q, -110, h.a.f339279o, -9, 79, -123, 105, 125, h.a.f339277m, 75, -77, -26, 125, -123, com.fasterxml.jackson.core.json.a.f102488j, 62, -2, 79, 8, 72, -76, -67, 5, 33, -121, 1, h.a.A, com.fasterxml.jackson.core.json.a.f102487i, com.google.common.base.c.G, 69, -20, -68, -26, -23, 95, -7, -70, h.a.f339283s, -10, 58, com.google.common.base.c.f116465r, -15, -89, -24, -121, -14, -72, -127, -89, h.a.f339270f, 66, 7, 77, -89, h.a.f339279o, -95, -90, 45, h.a.f339289y, -118, 69, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f116027b = {48, -127, -97, 48, com.google.common.base.c.f116462o, 6, 9, 42, -122, 72, -122, -9, com.google.common.base.c.f116462o, 1, 1, 1, 5, 0, 3, -127, -115, 0, 48, -127, -119, 2, -127, -127, 0, -89, 33, 8, -124, 110, h.a.f339273i, 89, 8, h.a.f339271g, 69, 120, 95, h.a.f339274j, h.a.f339290z, com.google.common.base.c.f116462o, -18, 123, com.google.common.base.c.G, -31, com.google.common.base.c.f116462o, -80, -76, 109, h.a.f339271g, -79, 2, 104, -94, 76, 59, -73, -26, 99, 123, h.a.f339276l, -92, -100, 116, 50, -25, 96, 53, 124, 95, 76, h.a.f339274j, -84, 70, com.google.common.base.c.E, 0, 72, h.a.f339270f, 84, -77, -2, -107, -66, h.a.K, -119, com.google.common.base.c.E, -95, 54, h.a.f339289y, -89, 1, 71, 44, 7, h.a.f339278n, 126, 5, -78, 87, -105, -114, 65, -19, 58, -78, -95, 0, 118, 83, 76, -88, 2, -21, 127, t.f119782a, 74, -103, -114, -127, -70, -81, -127, 125, h.a.F, com.google.common.base.c.f116472y, 113, com.google.common.base.c.f116471x, -102, 46, h.a.F, -111, -97, 97, -127, 32, 87, -80, 105, com.google.common.base.c.f116468u, -19, 107, -73, h.a.f339283s, -97, 11, -23, h.a.f339274j, -107, -107, 83, -25, com.google.common.base.c.f116464q, -93, -21, 2, 3, 1, 0, 1};

    private d() {
    }

    public static byte[] a() {
        return (byte[]) f116026a.clone();
    }

    public static byte[] b() {
        return (byte[]) f116027b.clone();
    }

    public static RSAPrivateKey c() throws GeneralSecurityException {
        return (RSAPrivateKey) i0.e().generatePrivate(new PKCS8EncodedKeySpec(f116026a));
    }

    public static RSAPublicKey d() throws GeneralSecurityException {
        return (RSAPublicKey) i0.e().generatePublic(new X509EncodedKeySpec(f116027b));
    }
}
