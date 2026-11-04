package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.w0;
import androidx.media3.common.v0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f69235a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f69236b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f69237c = 4;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f69239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f69240c;

        public a(String str, int i10, byte[] bArr) {
            this.f69238a = str;
            this.f69239b = i10;
            this.f69240c = bArr;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f69241f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f69242g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f69243h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f69244i = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f69245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public final String f69246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f69247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<a> f69248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f69249e;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public b(int i10, @androidx.annotation.p0 String str, int i11, @androidx.annotation.p0 List<a> list, byte[] bArr) {
            this.f69245a = i10;
            this.f69246b = str;
            this.f69247c = i11;
            this.f69248d = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
            this.f69249e = bArr;
        }

        public int a() {
            int i10 = this.f69247c;
            if (i10 != 2) {
                return i10 != 3 ? 0 : 512;
            }
            return 2048;
        }
    }

    public interface c {
        SparseArray<m0> a();

        @androidx.annotation.p0
        m0 b(int i10, b bVar);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public static final class e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f69250f = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f69251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f69252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f69253c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f69254d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f69255e;

        public e(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        private void d() {
            if (this.f69254d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f69254d;
            this.f69254d = i10 == Integer.MIN_VALUE ? this.f69252b : i10 + this.f69253c;
            this.f69255e = this.f69251a + this.f69254d;
        }

        public String b() {
            d();
            return this.f69255e;
        }

        public int c() {
            d();
            return this.f69254d;
        }

        public e(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f69251a = str;
            this.f69252b = i11;
            this.f69253c = i12;
            this.f69254d = Integer.MIN_VALUE;
            this.f69255e = "";
        }
    }

    void a();

    void b(androidx.media3.common.util.o0 o0Var, int i10) throws v0;

    void c(w0 w0Var, androidx.media3.extractor.t tVar, e eVar);
}
