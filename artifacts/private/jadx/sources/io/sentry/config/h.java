package io.sentry.config;

import io.sentry.ca;
import java.util.ArrayList;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class h {
    @NotNull
    public static g a() {
        Properties propertiesA;
        Properties propertiesA2;
        ca caVar = new ca();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j());
        arrayList.add(new d());
        String property = System.getProperty("sentry.properties.file");
        if (property != null && (propertiesA2 = new e(property, caVar).a()) != null) {
            arrayList.add(new i(propertiesA2));
        }
        String str = System.getenv("SENTRY_PROPERTIES_FILE");
        if (str != null && (propertiesA = new e(str, caVar).a()) != null) {
            arrayList.add(new i(propertiesA));
        }
        Properties propertiesA3 = new b(caVar).a();
        if (propertiesA3 != null) {
            arrayList.add(new i(propertiesA3));
        }
        Properties propertiesA4 = new e("sentry.properties", caVar).a();
        if (propertiesA4 != null) {
            arrayList.add(new i(propertiesA4));
        }
        return new c(arrayList);
    }
}
