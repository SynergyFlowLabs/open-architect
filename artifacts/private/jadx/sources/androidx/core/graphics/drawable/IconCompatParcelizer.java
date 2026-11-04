package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.e eVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f47754q = eVar.M(iconCompat.f47754q, 1);
        iconCompat.f47756s = eVar.t(iconCompat.f47756s, 2);
        iconCompat.f47757t = eVar.W(iconCompat.f47757t, 3);
        iconCompat.f47758u = eVar.M(iconCompat.f47758u, 4);
        iconCompat.f47759v = eVar.M(iconCompat.f47759v, 5);
        int i10 = 4 & 6;
        iconCompat.f47760w = (ColorStateList) eVar.W(iconCompat.f47760w, 6);
        iconCompat.f47762y = eVar.d0(iconCompat.f47762y, 7);
        iconCompat.f47763z = eVar.d0(iconCompat.f47763z, 8);
        iconCompat.d();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.e eVar) {
        eVar.j0(true, true);
        iconCompat.f(eVar.i());
        int i10 = iconCompat.f47754q;
        if (-1 != i10) {
            eVar.M0(i10, 1);
        }
        byte[] bArr = iconCompat.f47756s;
        if (bArr != null) {
            eVar.u0(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f47757t;
        if (parcelable != null) {
            eVar.X0(parcelable, 3);
        }
        int i11 = iconCompat.f47758u;
        if (i11 != 0) {
            eVar.M0(i11, 4);
        }
        int i12 = iconCompat.f47759v;
        if (i12 != 0) {
            eVar.M0(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f47760w;
        if (colorStateList != null) {
            eVar.X0(colorStateList, 6);
        }
        String str = iconCompat.f47762y;
        if (str != null) {
            eVar.f1(str, 7);
        }
        String str2 = iconCompat.f47763z;
        if (str2 != null) {
            eVar.f1(str2, 8);
        }
    }
}
