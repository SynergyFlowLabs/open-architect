package androidx.media3.common;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public class v0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f61711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f61712b;

    protected v0(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f61711a = z10;
        this.f61712b = i10;
    }

    public static v0 a(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2) {
        return new v0(str, th2, true, 1);
    }

    public static v0 b(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2) {
        return new v0(str, th2, true, 0);
    }

    public static v0 c(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2) {
        return new v0(str, th2, true, 4);
    }

    public static v0 d(@androidx.annotation.p0 String str, @androidx.annotation.p0 Throwable th2) {
        return new v0(str, th2, false, 4);
    }

    public static v0 e(@androidx.annotation.p0 String str) {
        boolean z10 = false;
        return new v0(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        if (message != null) {
            str = message + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f61711a);
        sb2.append(", dataType=");
        sb2.append(this.f61712b);
        sb2.append("}");
        return sb2.toString();
    }
}
