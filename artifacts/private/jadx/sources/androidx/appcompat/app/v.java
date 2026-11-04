package androidx.appcompat.app;

import android.os.LocaleList;
import androidx.annotation.w0;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@w0(24)
final class v {
    private v() {
    }

    private static androidx.core.os.p a(androidx.core.os.p pVar, androidx.core.os.p pVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i10 = 0;
        while (i10 < pVar.l() + pVar2.l()) {
            Locale localeD = i10 < pVar.l() ? pVar.d(i10) : pVar2.d(i10 - pVar.l());
            if (localeD != null) {
                linkedHashSet.add(localeD);
            }
            i10++;
        }
        return androidx.core.os.p.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static androidx.core.os.p b(LocaleList localeList, LocaleList localeList2) {
        return (localeList == null || localeList.isEmpty()) ? androidx.core.os.p.g() : a(androidx.core.os.p.o(localeList), androidx.core.os.p.o(localeList2));
    }

    static androidx.core.os.p c(androidx.core.os.p pVar, androidx.core.os.p pVar2) {
        return (pVar == null || pVar.j()) ? androidx.core.os.p.g() : a(pVar, pVar2);
    }
}
