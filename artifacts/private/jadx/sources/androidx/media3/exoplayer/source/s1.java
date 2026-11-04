package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.p3;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public interface s1 {

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final int f65461b1 = 1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final int f65462c1 = 2;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final int f65463d1 = 4;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    void a() throws IOException;

    boolean isReady();

    int l(long j10);

    int r(p3 p3Var, androidx.media3.decoder.g gVar, int i10);
}
