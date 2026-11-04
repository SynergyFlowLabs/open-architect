package androidx.media3.exoplayer.analytics;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class j4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j4 f63008d = new j4("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private final a f63010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final Object f63011c;

    @androidx.annotation.w0(31)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LogSessionId f63012a = LogSessionId.LOG_SESSION_ID_NONE;

        public void a(LogSessionId logSessionId) {
            androidx.media3.common.util.a.i(this.f63012a.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.f63012a = logSessionId;
        }
    }

    public j4(String str) {
        this.f63009a = str;
        this.f63010b = androidx.media3.common.util.k1.f61540a >= 31 ? new a() : null;
        this.f63011c = new Object();
    }

    @androidx.annotation.w0(31)
    public synchronized LogSessionId a() {
        return ((a) androidx.media3.common.util.a.g(this.f63010b)).f63012a;
    }

    @androidx.annotation.w0(31)
    public synchronized void b(LogSessionId logSessionId) {
        ((a) androidx.media3.common.util.a.g(this.f63010b)).a(logSessionId);
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        return Objects.equals(this.f63009a, j4Var.f63009a) && Objects.equals(this.f63010b, j4Var.f63010b) && Objects.equals(this.f63011c, j4Var.f63011c);
    }

    public int hashCode() {
        return Objects.hash(this.f63009a, this.f63010b, this.f63011c);
    }
}
