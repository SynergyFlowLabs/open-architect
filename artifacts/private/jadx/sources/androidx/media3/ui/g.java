package androidx.media3.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public class g implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f69832a;

    public g(Resources resources) {
        this.f69832a = (Resources) androidx.media3.common.util.a.g(resources);
    }

    private String b(androidx.media3.common.w wVar) {
        int i10 = wVar.E;
        if (i10 == -1 || i10 < 1) {
            return "";
        }
        if (i10 == 1) {
            return this.f69832a.getString(v0.k.C);
        }
        if (i10 == 2) {
            return this.f69832a.getString(v0.k.L);
        }
        if (i10 == 6 || i10 == 7) {
            return this.f69832a.getString(v0.k.N);
        }
        return i10 != 8 ? this.f69832a.getString(v0.k.M) : this.f69832a.getString(v0.k.O);
    }

    private String c(androidx.media3.common.w wVar) {
        int i10 = wVar.f61756j;
        return i10 == -1 ? "" : this.f69832a.getString(v0.k.B, Float.valueOf(i10 / 1000000.0f));
    }

    private String d(androidx.media3.common.w wVar) {
        return TextUtils.isEmpty(wVar.f61748b) ? "" : wVar.f61748b;
    }

    private String e(androidx.media3.common.w wVar) {
        String strJ = j(f(wVar), h(wVar));
        return TextUtils.isEmpty(strJ) ? d(wVar) : strJ;
    }

    private String f(androidx.media3.common.w wVar) {
        String str = wVar.f61750d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        Locale localeP0 = androidx.media3.common.util.k1.p0();
        String displayName = localeForLanguageTag.getDisplayName(localeP0);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(localeP0) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
        }
        return displayName;
    }

    private String g(androidx.media3.common.w wVar) {
        int i10 = wVar.f61768v;
        int i11 = wVar.f61769w;
        return (i10 == -1 || i11 == -1) ? "" : this.f69832a.getString(v0.k.D, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private String h(androidx.media3.common.w wVar) {
        String string = (wVar.f61752f & 2) != 0 ? this.f69832a.getString(v0.k.E) : "";
        if ((wVar.f61752f & 4) != 0) {
            string = j(string, this.f69832a.getString(v0.k.H));
        }
        if ((wVar.f61752f & 8) != 0) {
            string = j(string, this.f69832a.getString(v0.k.G));
        }
        return (wVar.f61752f & 1088) != 0 ? j(string, this.f69832a.getString(v0.k.F)) : string;
    }

    private static int i(androidx.media3.common.w wVar) {
        int iM = androidx.media3.common.s0.m(wVar.f61761o);
        if (iM != -1) {
            return iM;
        }
        if (androidx.media3.common.s0.p(wVar.f61757k) != null) {
            return 2;
        }
        if (androidx.media3.common.s0.c(wVar.f61757k) != null) {
            return 1;
        }
        if (wVar.f61768v == -1 && wVar.f61769w == -1) {
            return (wVar.E == -1 && wVar.F == -1) ? -1 : 1;
        }
        return 2;
    }

    private String j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f69832a.getString(v0.k.A, string, str);
            }
        }
        return string;
    }

    @Override // androidx.media3.ui.e1
    public String a(androidx.media3.common.w wVar) {
        String strJ;
        int i10 = i(wVar);
        if (i10 == 2) {
            strJ = j(h(wVar), g(wVar), c(wVar));
        } else {
            strJ = i10 == 1 ? j(e(wVar), b(wVar), c(wVar)) : e(wVar);
        }
        if (strJ.length() != 0) {
            return strJ;
        }
        String str = wVar.f61750d;
        return (str == null || str.trim().isEmpty()) ? this.f69832a.getString(v0.k.P) : this.f69832a.getString(v0.k.Q, str);
    }
}
