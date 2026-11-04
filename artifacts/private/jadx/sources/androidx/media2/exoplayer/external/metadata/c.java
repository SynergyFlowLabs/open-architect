package androidx.media2.exoplayer.external.metadata;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f55423a = new a();

    class a implements c {
        a() {
        }

        @Override // androidx.media2.exoplayer.external.metadata.c
        public b a(Format format) {
            String str = format.f53103i;
            str.getClass();
            switch (str) {
                case "application/x-icy":
                    return new androidx.media2.exoplayer.external.metadata.icy.a();
                case "application/id3":
                    return new androidx.media2.exoplayer.external.metadata.id3.b();
                case "application/x-emsg":
                    return new androidx.media2.exoplayer.external.metadata.emsg.a();
                case "application/x-scte35":
                    return new androidx.media2.exoplayer.external.metadata.scte35.a();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }

        @Override // androidx.media2.exoplayer.external.metadata.c
        public boolean b(Format format) {
            String str = format.f53103i;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str);
        }
    }

    b a(Format format);

    boolean b(Format format);
}
