package org.apache.commons.io;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class s extends o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f336818c = -6994123481142850163L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Serializable f336819b;

    public s(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.f336819b = serializable;
    }

    public static boolean c(Throwable th2, Object obj) {
        return obj != null && (th2 instanceof s) && obj.equals(((s) th2).f336819b);
    }

    public static void d(Throwable th2, Object obj) throws IOException {
        if (c(th2, obj)) {
            throw ((s) th2).getCause();
        }
    }

    @Override // java.lang.Throwable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public IOException getCause() {
        return (IOException) super.getCause();
    }

    public Serializable b() {
        return this.f336819b;
    }
}
