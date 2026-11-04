package androidx.media2.exoplayer.external;

import androidx.annotation.b1;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface t0 extends q0.b {
    public static final int Q = 0;
    public static final int R = 1;
    public static final int S = 2;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    void A(Format[] formats, androidx.media2.exoplayer.external.source.v0 stream, long offsetUs) throws i;

    boolean a();

    void d();

    @androidx.annotation.p0
    androidx.media2.exoplayer.external.source.v0 e();

    int f();

    void g(long positionUs, long elapsedRealtimeUs) throws i;

    int getState();

    boolean isReady();

    u0 p();

    boolean q();

    boolean r();

    void reset();

    long s();

    void setIndex(int index);

    void start() throws i;

    void stop() throws i;

    void t(long positionUs) throws i;

    @androidx.annotation.p0
    androidx.media2.exoplayer.external.util.r u();

    void v();

    void x() throws IOException;

    void y(v0 configuration, Format[] formats, androidx.media2.exoplayer.external.source.v0 stream, long positionUs, boolean joining, long offsetUs) throws i;

    void z(float operatingRate) throws i;
}
