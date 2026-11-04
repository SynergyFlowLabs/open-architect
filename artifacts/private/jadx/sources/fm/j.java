package fm;

import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class j extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient org.java_websocket.f f275320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IOException f275321b;

    public j(org.java_websocket.f fVar, IOException iOException) {
        this.f275320a = fVar;
        this.f275321b = iOException;
    }

    public org.java_websocket.f a() {
        return this.f275320a;
    }

    public IOException b() {
        return this.f275321b;
    }
}
