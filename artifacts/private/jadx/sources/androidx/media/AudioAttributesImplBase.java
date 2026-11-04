package androidx.media;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public int f52709q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public int f52710r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public int f52711s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public int f52712t;

    @b1({b1.a.LIBRARY})
    public AudioAttributesImplBase() {
        this.f52709q = 0;
        this.f52710r = 0;
        this.f52711s = 0;
        this.f52712t = -1;
    }

    static int d(int streamType) {
        switch (streamType) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 9:
            default:
                return 0;
            case 10:
                return 11;
        }
    }

    @Override // androidx.media.AudioAttributesImpl
    public int I() {
        int i10 = this.f52711s;
        int iA5 = a5();
        if (iA5 == 6) {
            i10 |= 4;
        } else if (iA5 == 7) {
            i10 |= 1;
        }
        return i10 & com.badlogic.gdx.utils.compression.lzma.a.A;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int Z4() {
        return this.f52709q;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a5() {
        int i10 = this.f52712t;
        int i11 = 0 | (-1);
        return i10 != -1 ? i10 : AudioAttributesCompat.f(false, this.f52711s, this.f52709q);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int b5() {
        return this.f52712t;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int c5() {
        return AudioAttributesCompat.f(true, this.f52711s, this.f52709q);
    }

    @Override // androidx.media.AudioAttributesImpl
    @p0
    public Object e() {
        return null;
    }

    public boolean equals(Object o10) {
        if (!(o10 instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) o10;
        return this.f52710r == audioAttributesImplBase.getContentType() && this.f52711s == audioAttributesImplBase.I() && this.f52709q == audioAttributesImplBase.Z4() && this.f52712t == audioAttributesImplBase.f52712t;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.f52710r;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f52710r), Integer.valueOf(this.f52711s), Integer.valueOf(this.f52709q), Integer.valueOf(this.f52712t)});
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f52712t != -1) {
            sb2.append(" stream=");
            sb2.append(this.f52712t);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.h(this.f52709q));
        sb2.append(" content=");
        sb2.append(this.f52710r);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f52711s).toUpperCase());
        return sb2.toString();
    }

    static class a implements AudioAttributesImpl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f52713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f52714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f52715c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f52716d;

        a() {
            this.f52713a = 0;
            this.f52714b = 0;
            this.f52715c = 0;
            int i10 = 0 & (-1);
            this.f52716d = -1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private a f(int streamType) {
            switch (streamType) {
                case 0:
                    this.f52714b = 1;
                    break;
                case 1:
                    this.f52714b = 4;
                    break;
                case 2:
                    this.f52714b = 4;
                    break;
                case 3:
                    this.f52714b = 2;
                    break;
                case 4:
                    this.f52714b = 4;
                    break;
                case 5:
                    this.f52714b = 4;
                    break;
                case 6:
                    this.f52714b = 1;
                    this.f52715c |= 4;
                    break;
                case 7:
                    this.f52715c = 1 | this.f52715c;
                    this.f52714b = 4;
                    break;
                case 8:
                    this.f52714b = 4;
                    break;
                case 9:
                    this.f52714b = 4;
                    break;
                case 10:
                    this.f52714b = 1;
                    break;
            }
            this.f52713a = AudioAttributesImplBase.d(streamType);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @NonNull
        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.f52714b, this.f52715c, this.f52713a, this.f52716d);
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @NonNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a c(int contentType) {
            if (contentType == 0 || contentType == 1 || contentType == 2 || contentType == 3 || contentType == 4) {
                this.f52714b = contentType;
                return this;
            }
            this.f52714b = 0;
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @NonNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a v(int flags) {
            this.f52715c = (flags & 1023) | this.f52715c;
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @NonNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a b(int streamType) {
            if (streamType == 10) {
                throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
            }
            this.f52716d = streamType;
            return f(streamType);
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @NonNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(int usage) {
            switch (usage) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.f52713a = usage;
                    break;
                case 16:
                    this.f52713a = 12;
                    break;
                default:
                    this.f52713a = 0;
                    break;
            }
            return this;
        }

        a(AudioAttributesCompat aa2) {
            this.f52713a = 0;
            this.f52714b = 0;
            this.f52715c = 0;
            this.f52716d = -1;
            this.f52713a = aa2.Z4();
            this.f52714b = aa2.getContentType();
            this.f52715c = aa2.I();
            this.f52716d = aa2.b5();
        }
    }

    AudioAttributesImplBase(int contentType, int flags, int usage, int legacyStream) {
        this.f52710r = contentType;
        this.f52711s = flags;
        this.f52709q = usage;
        this.f52712t = legacyStream;
    }
}
