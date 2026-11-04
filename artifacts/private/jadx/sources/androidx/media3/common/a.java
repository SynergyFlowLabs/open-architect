package androidx.media3.common;

import android.view.View;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f60280d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f60281e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f60282f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f60283g = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f60284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f60286c;

    /* JADX INFO: renamed from: androidx.media3.common.a$a, reason: collision with other inner class name */
    public static final class C0564a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f60287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f60288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private String f60289c;

        public C0564a(View view, int i10) {
            this.f60287a = view;
            this.f60288b = i10;
        }

        public a a() {
            return new a(this.f60287a, this.f60288b, this.f60289c);
        }

        @z7.a
        public C0564a b(@androidx.annotation.p0 String str) {
            this.f60289c = str;
            return this;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @androidx.media3.common.util.b1
    @Deprecated
    public a(View view, int i10) {
        this(view, i10, null);
    }

    @androidx.media3.common.util.b1
    @Deprecated
    public a(View view, int i10, @androidx.annotation.p0 String str) {
        this.f60284a = view;
        this.f60285b = i10;
        this.f60286c = str;
    }
}
