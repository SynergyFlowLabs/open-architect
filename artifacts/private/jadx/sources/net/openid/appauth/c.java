package net.openid.appauth;

import android.text.TextUtils;
import androidx.annotation.p0;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class c {
    private c() {
        throw new IllegalStateException("This type is not intended to be instantiated");
    }

    @p0
    public static String a(@p0 Iterable<String> iterable) {
        if (iterable == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : iterable) {
            t.b(!TextUtils.isEmpty(str), "individual scopes cannot be null or empty");
            linkedHashSet.add(str);
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return TextUtils.join(" ", linkedHashSet);
    }

    @p0
    public static Set<String> b(@p0 String str) {
        if (str == null) {
            return null;
        }
        List listAsList = Arrays.asList(TextUtils.split(str, " "));
        LinkedHashSet linkedHashSet = new LinkedHashSet(listAsList.size());
        linkedHashSet.addAll(listAsList);
        return linkedHashSet;
    }
}
