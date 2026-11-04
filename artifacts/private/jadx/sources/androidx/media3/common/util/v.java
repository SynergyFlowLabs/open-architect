package androidx.media3.common.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f61667d = "LibraryLoader";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f61668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f61669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f61670c;

    public v(String... strArr) {
        this.f61668a = strArr;
    }

    public synchronized boolean a() {
        if (this.f61669b) {
            return this.f61670c;
        }
        this.f61669b = true;
        try {
            for (String str : this.f61668a) {
                b(str);
            }
            this.f61670c = true;
        } catch (UnsatisfiedLinkError unused) {
            z.n(f61667d, "Failed to load " + Arrays.toString(this.f61668a));
        }
        return this.f61670c;
    }

    protected abstract void b(String str);

    public synchronized void c(String... strArr) {
        try {
            a.j(!this.f61669b, "Cannot set libraries after loading");
            this.f61668a = strArr;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
