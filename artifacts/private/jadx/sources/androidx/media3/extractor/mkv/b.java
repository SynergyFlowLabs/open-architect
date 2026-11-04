package androidx.media3.extractor.mkv;

import androidx.media3.common.util.b1;
import androidx.media3.common.v0;
import androidx.media3.extractor.s;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f67666a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f67667b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f67668c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f67669d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f67670e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f67671f = 5;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    void a(int i10) throws v0;

    void b(int i10, double d10) throws v0;

    void c(int i10, long j10) throws v0;

    void d(int i10, String str) throws v0;

    void e(int i10, long j10, long j11) throws v0;

    int f(int i10);

    boolean g(int i10);

    void h(int i10, int i11, s sVar) throws IOException;
}
