package androidx.core.os;

/* JADX INFO: loaded from: classes2.dex */
public class u extends RuntimeException {
    public u() {
        this(null);
    }

    public u(@androidx.annotation.p0 String str) {
        super(androidx.core.util.o.f(str, "The operation has been canceled."));
    }
}
