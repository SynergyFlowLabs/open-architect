package androidx.media3.common.text;

import android.os.Bundle;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class k implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f61431d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f61432e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f61433f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f61434g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f61435h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f61436i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f61437j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f61438k = k1.c1(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f61439l = k1.c1(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f61440m = k1.c1(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f61441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f61442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f61443c;

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

    public k(int i10, int i11, int i12) {
        this.f61441a = i10;
        this.f61442b = i11;
        this.f61443c = i12;
    }

    public static k a(Bundle bundle) {
        return new k(bundle.getInt(f61438k), bundle.getInt(f61439l), bundle.getInt(f61440m));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f61438k, this.f61441a);
        bundle.putInt(f61439l, this.f61442b);
        bundle.putInt(f61440m, this.f61443c);
        return bundle;
    }
}
