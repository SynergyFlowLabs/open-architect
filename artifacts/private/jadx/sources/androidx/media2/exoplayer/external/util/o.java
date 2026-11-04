package androidx.media2.exoplayer.external.util;

import androidx.annotation.b1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f57610d = "LibraryLoader";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f57611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f57612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f57613c;

    public o(String... libraries) {
        this.f57611a = libraries;
    }

    public synchronized boolean a() {
        try {
            if (this.f57612b) {
                return this.f57613c;
            }
            this.f57612b = true;
            try {
                for (String str : this.f57611a) {
                    System.loadLibrary(str);
                }
                this.f57613c = true;
            } catch (UnsatisfiedLinkError unused) {
                String strValueOf = String.valueOf(Arrays.toString(this.f57611a));
                p.l(f57610d, strValueOf.length() != 0 ? "Failed to load ".concat(strValueOf) : new String("Failed to load "));
            }
            return this.f57613c;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b(String... libraries) {
        try {
            a.j(!this.f57612b, "Cannot set libraries after loading");
            this.f57611a = libraries;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
