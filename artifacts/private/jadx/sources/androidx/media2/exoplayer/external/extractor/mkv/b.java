package androidx.media2.exoplayer.external.extractor.mkv;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.extractor.j;
import androidx.media2.exoplayer.external.k0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f54100a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f54101b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f54102c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f54103d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f54104e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f54105f = 5;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    void a(int id2) throws k0;

    void b(int id2, double value) throws k0;

    void c(int id2, long value) throws k0;

    void d(int id2, String value) throws k0;

    void e(int id2, long contentPosition, long contentSize) throws k0;

    int f(int id2);

    boolean g(int id2);

    void h(int id2, int contentsSize, j input) throws InterruptedException, IOException;
}
