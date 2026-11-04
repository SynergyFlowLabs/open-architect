package androidx.media2.exoplayer.external.extractor;

import androidx.annotation.b1;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f54075a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f54076b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f54077c = -1;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    void a(long position, long timeUs);

    boolean b(j input) throws InterruptedException, IOException;

    void c(k output);

    int f(j input, p seekPosition) throws InterruptedException, IOException;

    void release();
}
