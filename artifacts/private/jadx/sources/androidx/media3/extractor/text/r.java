package androidx.media3.extractor.text;

import androidx.media3.common.util.b1;
import com.google.common.collect.l6;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface r {

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f68570a = new C0616a();

        /* JADX INFO: renamed from: androidx.media3.extractor.text.r$a$a, reason: collision with other inner class name */
        class C0616a implements a {
            C0616a() {
            }

            @Override // androidx.media3.extractor.text.r.a
            public int a(androidx.media3.common.w wVar) {
                return 1;
            }

            @Override // androidx.media3.extractor.text.r.a
            public boolean b(androidx.media3.common.w wVar) {
                return false;
            }

            @Override // androidx.media3.extractor.text.r.a
            public r c(androidx.media3.common.w wVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        }

        int a(androidx.media3.common.w wVar);

        boolean b(androidx.media3.common.w wVar);

        r c(androidx.media3.common.w wVar);
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final b f68571c = new b(-9223372036854775807L, false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f68572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f68573b;

        private b(long j10, boolean z10) {
            this.f68572a = j10;
            this.f68573b = z10;
        }

        public static b b() {
            return f68571c;
        }

        public static b c(long j10) {
            return new b(j10, true);
        }

        public static b d(long j10) {
            return new b(j10, false);
        }
    }

    void a(byte[] bArr, int i10, int i11, b bVar, androidx.media3.common.util.o<d> oVar);

    int b();

    default void c(byte[] bArr, b bVar, androidx.media3.common.util.o<d> oVar) {
        a(bArr, 0, bArr.length, bVar, oVar);
    }

    default j d(byte[] bArr, int i10, int i11) {
        final l6.a aVarS = l6.s();
        b bVar = b.f68571c;
        Objects.requireNonNull(aVarS);
        a(bArr, i10, i11, bVar, new androidx.media3.common.util.o() { // from class: androidx.media3.extractor.text.q
            @Override // androidx.media3.common.util.o
            public final void accept(Object obj) {
                aVarS.a((d) obj);
            }
        });
        return new f(aVarS.e());
    }

    default void reset() {
    }
}
