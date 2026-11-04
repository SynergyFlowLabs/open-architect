package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f69554a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f69555b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f69556c = 2;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f69557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f69558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f69559c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f69560d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f69557a = i10;
            this.f69558b = bArr;
            this.f69559c = i11;
            this.f69560d = i12;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f69557a == aVar.f69557a && this.f69559c == aVar.f69559c && this.f69560d == aVar.f69560d && Arrays.equals(this.f69558b, aVar.f69558b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f69557a * 31) + Arrays.hashCode(this.f69558b)) * 31) + this.f69559c) * 31) + this.f69560d;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    void a(androidx.media3.common.util.o0 o0Var, int i10, int i11);

    default void b(androidx.media3.common.util.o0 o0Var, int i10) {
        a(o0Var, i10, 0);
    }

    default void c(long j10) {
    }

    int d(androidx.media3.common.l lVar, int i10, boolean z10, int i11) throws IOException;

    void e(androidx.media3.common.w wVar);

    default int f(androidx.media3.common.l lVar, int i10, boolean z10) throws IOException {
        return d(lVar, i10, z10, 0);
    }

    void g(long j10, int i10, int i11, int i12, @androidx.annotation.p0 a aVar);
}
