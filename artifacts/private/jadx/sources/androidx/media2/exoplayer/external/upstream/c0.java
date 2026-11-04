package androidx.media2.exoplayer.external.upstream;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class c0 {
    public static void a() {
        androidx.media2.exoplayer.external.util.z<String> zVar = e0.f57272a;
    }

    static /* synthetic */ boolean b(String str) {
        String strV0 = androidx.media2.exoplayer.external.util.q0.V0(str);
        return (TextUtils.isEmpty(strV0) || (strV0.contains("text") && !strV0.contains("text/vtt")) || strV0.contains("html") || strV0.contains("xml")) ? false : true;
    }
}
