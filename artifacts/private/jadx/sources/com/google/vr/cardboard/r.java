package com.google.vr.cardboard;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.Display;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f126848a = "r";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ArrayList<Size> f126849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<a> f126850c;

    static {
        a aVar = new a("Micromax", null, "4560MMX", null, 217.0f, 217.0f);
        a aVar2 = new a("HTC", "endeavoru", "HTC One X", null, 312.0f, 312.0f);
        a aVar3 = new a("samsung", null, "SM-G920P", null, 575.0f, 575.0f);
        a aVar4 = new a("samsung", null, "SM-G930", null, 581.0f, 580.0f);
        a aVar5 = new a("samsung", null, "SM-G9300", null, 581.0f, 580.0f);
        a aVar6 = new a("samsung", null, "SM-G930A", null, 581.0f, 580.0f);
        a aVar7 = new a("samsung", null, "SM-G930F", null, 581.0f, 580.0f);
        a aVar8 = new a("samsung", null, "SM-G930P", null, 581.0f, 580.0f);
        a aVar9 = new a("samsung", null, "SM-G930R4", null, 581.0f, 580.0f);
        a aVar10 = new a("samsung", null, "SM-G930T", null, 581.0f, 580.0f);
        a aVar11 = new a("samsung", null, "SM-G930V", null, 581.0f, 580.0f);
        a aVar12 = new a("samsung", null, "SM-G930W8", null, 581.0f, 580.0f);
        a aVar13 = new a("samsung", null, "SM-N915FY", null, 541.0f, 541.0f);
        a aVar14 = new a("samsung", null, "SM-N915A", null, 541.0f, 541.0f);
        a aVar15 = new a("samsung", null, "SM-N915T", null, 541.0f, 541.0f);
        a aVar16 = new a("samsung", null, "SM-N915K", null, 541.0f, 541.0f);
        a aVar17 = new a("samsung", null, "SM-N915T", null, 541.0f, 541.0f);
        a aVar18 = new a("samsung", null, "SM-N915G", null, 541.0f, 541.0f);
        a aVar19 = new a("samsung", null, "SM-N915D", null, 541.0f, 541.0f);
        a aVar20 = new a("BLU", "BLU", "Studio 5.0 HD LTE", "qcom", 294.0f, 294.0f);
        a aVar21 = new a("OnePlus", "A0001", "A0001", "bacon", 401.0f, 401.0f);
        a aVar22 = new a("THL", "THL", "thl 5000", "mt6592", 441.0f, 441.0f);
        Float fValueOf = Float.valueOf(441.74f);
        Float fValueOf2 = Float.valueOf(0.004f);
        a aVar23 = new a("Google", "sailfish", "Pixel", "sailfish", fValueOf, fValueOf, fValueOf2);
        Float fValueOf3 = Float.valueOf(537.57f);
        a aVar24 = new a("Google", "marlin", "Pixel XL", "marlin", fValueOf3, fValueOf3, fValueOf2);
        a aVar25 = new a("Google", "walleye", null, "walleye", fValueOf, fValueOf, fValueOf2);
        a aVar26 = new a("Google", "taimen", null, "taimen", null, null, Float.valueOf(0.0046f));
        Float fValueOf4 = Float.valueOf(522.63f);
        Float fValueOf5 = Float.valueOf(0.0038f);
        f126850c = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, new a("Google", "21c8b5470a64adbb25bc84316cbc449361d86839", null, null, fValueOf4, fValueOf4, fValueOf5), new a("Google", "6e2c7e24b7c7eae9fc94882c9f31befa00594872", null, null, null, null, fValueOf5), new a("LGE", "joan", null, "joan", null, null, fValueOf5), new a("LGE", "e44046539bb5b584279553ca6eacca937c8e16cf", null, null, null, null, fValueOf5), new a("Lenovo", "vega", null, "vega", 537.388f, 537.882f));
    }

    private r() {
    }

    public static com.google.vr.sdk.proto.nano.b.a a(Context context) {
        com.google.vr.sdk.proto.nano.b.a aVar = new com.google.vr.sdk.proto.nano.b.a();
        List<a> list = f126850c;
        String str = Build.MANUFACTURER;
        if (!b(list, str, Build.DEVICE, Build.MODEL, Build.HARDWARE, aVar)) {
            return null;
        }
        if ("samsung".equals(str)) {
            Display displayC = g.c(context);
            DisplayMetrics displayMetricsD = g.d(displayC);
            int iMax = displayMetricsD.widthPixels;
            ArrayList<Size> arrayListC = c(displayC);
            if (arrayListC != null) {
                int size = arrayListC.size();
                int i10 = 0;
                while (i10 < size) {
                    Size size2 = arrayListC.get(i10);
                    i10++;
                    Size size3 = size2;
                    iMax = Math.max(iMax, Math.max(size3.getWidth(), size3.getHeight()));
                }
                int i11 = displayMetricsD.widthPixels;
                if (i11 != iMax) {
                    float f10 = i11 / iMax;
                    aVar.A(aVar.s() * f10);
                    aVar.B(aVar.t() * f10);
                }
            }
        }
        return aVar;
    }

    public static boolean b(List<a> list, String str, String str2, String str3, String str4, com.google.vr.sdk.proto.nano.b.a aVar) {
        String strD = d(str2);
        for (a aVar2 : list) {
            if (aVar2.a(str, str2, str3, str4) || aVar2.a(str, strD, str3, str4)) {
                String.format("Found override: {MANUFACTURER=%s, DEVICE=%s, MODEL=%s, HARDWARE=%s} : x_ppi=%f, y_ppi=%f, bottom_bezel_height=%f)", aVar2.f126851a, aVar2.f126852b, aVar2.f126853c, aVar2.f126854d, aVar2.f126855e, aVar2.f126856f, aVar2.f126857g);
                Float f10 = aVar2.f126855e;
                if (f10 != null) {
                    aVar.A(f10.floatValue());
                }
                Float f11 = aVar2.f126856f;
                if (f11 != null) {
                    aVar.B(f11.floatValue());
                }
                Float f12 = aVar2.f126857g;
                if (f12 == null) {
                    return true;
                }
                aVar.z(f12.floatValue());
                return true;
            }
        }
        return false;
    }

    private static ArrayList<Size> c(Display display) {
        if (display == null) {
            return null;
        }
        ArrayList<Size> arrayList = f126849b;
        if (arrayList != null) {
            return arrayList;
        }
        f126849b = new ArrayList<>();
        Display.Mode[] supportedModes = display.getSupportedModes();
        if (supportedModes != null) {
            for (Display.Mode mode : supportedModes) {
                f126849b.add(new Size(mode.getPhysicalWidth(), mode.getPhysicalHeight()));
            }
        }
        return f126849b;
    }

    private static String d(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(org.apache.commons.codec.digest.g.f335249c).digest(str.getBytes());
            StringBuilder sb2 = new StringBuilder(bArrDigest.length * 2);
            for (byte b10 : bArrDigest) {
                sb2.append(String.format("%02x", Byte.valueOf(b10)));
            }
            return sb2.toString();
        } catch (GeneralSecurityException unused) {
            return str;
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f126851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f126852b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f126853c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f126854d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Float f126855e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Float f126856f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Float f126857g;

        public a(String str, String str2, String str3, String str4, Float f10, Float f11, Float f12) {
            this.f126851a = str;
            this.f126852b = str2;
            this.f126853c = str3;
            this.f126854d = str4;
            this.f126855e = f10;
            this.f126856f = f11;
            this.f126857g = f12;
        }

        boolean a(String str, String str2, String str3, String str4) {
            String str5 = this.f126851a;
            if (str5 != null && !str5.equals(str)) {
                return false;
            }
            String str6 = this.f126852b;
            if (str6 != null && !str6.equals(str2)) {
                return false;
            }
            String str7 = this.f126853c;
            if (str7 != null && !str7.equals(str3)) {
                return false;
            }
            String str8 = this.f126854d;
            return str8 == null || str8.equals(str4);
        }

        public a(String str, String str2, String str3, String str4, float f10, float f11) {
            this(str, str2, str3, str4, Float.valueOf(f10), Float.valueOf(f11), null);
        }
    }
}
