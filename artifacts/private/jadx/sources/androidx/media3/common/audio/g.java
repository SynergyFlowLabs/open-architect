package androidx.media3.common.audio;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f60331a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f60332e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f60333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f60334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f60335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f60336d;

        public a(w wVar) {
            this(wVar.F, wVar.E, wVar.G);
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f60333a == aVar.f60333a && this.f60334b == aVar.f60334b && this.f60335c == aVar.f60335c;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f60333a), Integer.valueOf(this.f60334b), Integer.valueOf(this.f60335c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f60333a + ", channelCount=" + this.f60334b + ", encoding=" + this.f60335c + AbstractJsonLexerKt.END_LIST;
        }

        public a(int i10, int i11, int i12) {
            this.f60333a = i10;
            this.f60334b = i11;
            this.f60335c = i12;
            this.f60336d = k1.h1(i12) ? k1.E0(i12, i11) : -1;
        }
    }

    public static final class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f60337a;

        public b(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public b(String str, a aVar) {
            super(str + " " + aVar);
            this.f60337a = aVar;
        }
    }

    boolean a();

    void b(ByteBuffer byteBuffer);

    void c();

    ByteBuffer d();

    a e(a aVar) throws b;

    default long f(long j10) {
        return j10;
    }

    void flush();

    boolean isActive();

    void reset();
}
