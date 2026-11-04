package androidx.core.telephony.mbms;

import android.content.Context;
import android.telephony.mbms.ServiceInfo;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: androidx.core.telephony.mbms.a$a, reason: collision with other inner class name */
    @w0(28)
    static class C0404a {
        private C0404a() {
        }

        static CharSequence a(Context context, ServiceInfo serviceInfo) {
            Set<Locale> namedContentLocales = serviceInfo.getNamedContentLocales();
            if (namedContentLocales.isEmpty()) {
                return null;
            }
            String[] strArr = new String[namedContentLocales.size()];
            Iterator<Locale> it = serviceInfo.getNamedContentLocales().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                strArr[i10] = it.next().toLanguageTag();
                i10++;
            }
            Locale firstMatch = context.getResources().getConfiguration().getLocales().getFirstMatch(strArr);
            if (firstMatch == null) {
                return null;
            }
            return serviceInfo.getNameForLocale(firstMatch);
        }
    }

    private a() {
    }

    @p0
    public static CharSequence a(@NonNull Context context, @NonNull ServiceInfo serviceInfo) {
        return C0404a.a(context, serviceInfo);
    }
}
