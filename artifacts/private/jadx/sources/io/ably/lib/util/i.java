package io.ably.lib.util;

/* JADX INFO: loaded from: classes13.dex */
public class i implements n {
    @Override // io.ably.lib.util.n
    public String a() {
        String property = System.getProperty("java.version");
        if (property != null && !property.trim().isEmpty()) {
            return "jre/" + property.trim();
        }
        return null;
    }
}
