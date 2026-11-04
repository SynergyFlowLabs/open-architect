package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.b1;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f63696a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f63697b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f63698c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f63699d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f63700e = 4;

    public static class a extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63701a;

        public a(Throwable th2, int i10) {
            super(th2);
            this.f63701a = i10;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    static void b(@androidx.annotation.p0 m mVar, @androidx.annotation.p0 m mVar2) {
        if (mVar == mVar2) {
            return;
        }
        if (mVar2 != null) {
            mVar2.f(null);
        }
        if (mVar != null) {
            mVar.d(null);
        }
    }

    @androidx.annotation.p0
    a T();

    @androidx.annotation.p0
    Map<String, String> U();

    @androidx.annotation.p0
    byte[] V();

    default boolean a() {
        return false;
    }

    @androidx.annotation.p0
    androidx.media3.decoder.b c();

    void d(@androidx.annotation.p0 t.a aVar);

    UUID e();

    void f(@androidx.annotation.p0 t.a aVar);

    boolean g(String str);

    int getState();
}
