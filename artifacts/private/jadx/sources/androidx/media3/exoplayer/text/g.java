package androidx.media3.exoplayer.text;

import androidx.media3.common.util.b1;
import androidx.media3.common.w;
import androidx.media3.extractor.text.k;
import androidx.media3.extractor.text.r;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f65617a = new a();

    class a implements g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.media3.extractor.text.g f65618b = new androidx.media3.extractor.text.g();

        a() {
        }

        @Override // androidx.media3.exoplayer.text.g
        public k a(w wVar) {
            String str = wVar.f61761o;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new androidx.media3.extractor.text.cea.a(str, wVar.J, 16000L);
                    case "application/cea-708":
                        return new androidx.media3.extractor.text.cea.c(wVar.J, wVar.f61764r);
                }
            }
            if (!this.f65618b.b(wVar)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            r rVarC = this.f65618b.c(wVar);
            return new b(rVarC.getClass().getSimpleName() + "Decoder", rVarC);
        }

        @Override // androidx.media3.exoplayer.text.g
        public boolean b(w wVar) {
            String str = wVar.f61761o;
            if (!this.f65618b.b(wVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return false;
            }
            return true;
        }
    }

    k a(w wVar);

    boolean b(w wVar);
}
