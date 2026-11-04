package androidx.media2.exoplayer.external.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.k0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f54841a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f54842b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f54843c = 4;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f54844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f54845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f54846c;

        public a(String language, int type, byte[] initializationData) {
            this.f54844a = language;
            this.f54845b = type;
            this.f54846c = initializationData;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f54847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f54848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<a> f54849c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f54850d;

        public b(int streamType, String language, List<a> dvbSubtitleInfos, byte[] descriptorBytes) {
            this.f54847a = streamType;
            this.f54848b = language;
            this.f54849c = dvbSubtitleInfos == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(dvbSubtitleInfos);
            this.f54850d = descriptorBytes;
        }
    }

    public interface c {
        SparseArray<h0> a();

        h0 b(int streamType, b esInfo);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public static final class e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f54851f = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f54852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f54853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f54854c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f54855d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f54856e;

        public e(int firstTrackId, int trackIdIncrement) {
            this(Integer.MIN_VALUE, firstTrackId, trackIdIncrement);
        }

        private void d() {
            if (this.f54855d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f54855d;
            int i11 = i10 == Integer.MIN_VALUE ? this.f54853b : i10 + this.f54854c;
            this.f54855d = i11;
            String str = this.f54852a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11);
            sb2.append(str);
            sb2.append(i11);
            this.f54856e = sb2.toString();
        }

        public String b() {
            d();
            return this.f54856e;
        }

        public int c() {
            d();
            return this.f54855d;
        }

        public e(int programNumber, int firstTrackId, int trackIdIncrement) {
            String string;
            if (programNumber != Integer.MIN_VALUE) {
                StringBuilder sb2 = new StringBuilder(12);
                sb2.append(programNumber);
                sb2.append("/");
                string = sb2.toString();
            } else {
                string = "";
            }
            this.f54852a = string;
            this.f54853b = firstTrackId;
            this.f54854c = trackIdIncrement;
            this.f54855d = Integer.MIN_VALUE;
        }
    }

    void a();

    void b(k0 timestampAdjuster, androidx.media2.exoplayer.external.extractor.k extractorOutput, e idGenerator);

    void c(androidx.media2.exoplayer.external.util.x data, int flags) throws androidx.media2.exoplayer.external.k0;
}
