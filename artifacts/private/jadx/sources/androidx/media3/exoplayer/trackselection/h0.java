package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.b4;
import androidx.media3.common.util.b1;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f65704a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f65705b = 10000;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    int b(int i10);

    int c();

    int f(int i10);

    b4 g();

    androidx.media3.common.w l(int i10);

    int length();

    int u(androidx.media3.common.w wVar);
}
