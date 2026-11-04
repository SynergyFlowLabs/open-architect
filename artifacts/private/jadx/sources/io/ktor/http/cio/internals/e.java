package io.ktor.http.cio.internals;

/* JADX INFO: loaded from: classes5.dex */
public final class e {
    public static final boolean a() {
        String property = System.getProperty("ktor.internal.cio.disable.chararray.pooling");
        if (property != null) {
            return Boolean.parseBoolean(property);
        }
        return false;
    }
}
