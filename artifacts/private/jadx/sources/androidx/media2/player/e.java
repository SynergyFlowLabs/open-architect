package androidx.media2.player;

import android.content.Context;
import android.media.MediaFormat;
import android.net.Uri;
import androidx.media.AudioAttributesCompat;
import androidx.media2.common.CallbackMediaItem;
import androidx.media2.common.FileMediaItem;
import androidx.media2.common.MediaItem;
import androidx.media2.common.UriMediaItem;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.m0;
import androidx.media2.exoplayer.external.source.hls.HlsMediaSource;
import androidx.media2.exoplayer.external.source.z;
import androidx.media2.exoplayer.external.upstream.e0;
import androidx.media2.exoplayer.external.upstream.l0;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.x0;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
@e.a({"RestrictedApi"})
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.media2.exoplayer.external.extractor.l f58281a = new androidx.media2.exoplayer.external.extractor.f().a(1);

    private e() {
    }

    public static z a(Context context, androidx.media2.exoplayer.external.upstream.l.a aVar, MediaItem mediaItem) {
        int identifier;
        if (!(mediaItem instanceof UriMediaItem)) {
            if (mediaItem instanceof FileMediaItem) {
                return new androidx.media2.exoplayer.external.source.q.d(aVar).h(f58281a).k(mediaItem).d(Uri.EMPTY);
            }
            if (mediaItem instanceof CallbackMediaItem) {
                return new androidx.media2.exoplayer.external.source.q.d(b.k(((CallbackMediaItem) mediaItem).q())).h(f58281a).k(mediaItem).d(Uri.EMPTY);
            }
            throw new IllegalStateException();
        }
        Uri uriQ = ((UriMediaItem) mediaItem).q();
        if (q0.j0(uriQ) == 2) {
            return new HlsMediaSource.Factory(aVar).o(mediaItem).d(uriQ);
        }
        if ("android.resource".equals(uriQ.getScheme())) {
            String str = (String) androidx.core.util.t.l(uriQ.getPath());
            if (uriQ.getPathSegments().size() == 1 && uriQ.getPathSegments().get(0).matches("\\d+")) {
                identifier = Integer.parseInt(uriQ.getPathSegments().get(0));
            } else {
                String str2 = "";
                String strReplaceAll = str.replaceAll("^/", "");
                String host = uriQ.getHost();
                StringBuilder sb2 = new StringBuilder();
                if (host != null) {
                    str2 = host + ":";
                }
                sb2.append(str2);
                sb2.append(strReplaceAll);
                identifier = context.getResources().getIdentifier(sb2.toString(), "raw", context.getPackageName());
            }
            androidx.core.util.t.n(identifier != 0);
            uriQ = l0.k(identifier);
        }
        return new androidx.media2.exoplayer.external.source.q.d(aVar).h(f58281a).k(mediaItem).d(uriQ);
    }

    public static androidx.media2.exoplayer.external.audio.c b(AudioAttributesCompat audioAttributesCompat) {
        return new androidx.media2.exoplayer.external.audio.c.b().b(audioAttributesCompat.getContentType()).c(audioAttributesCompat.I()).d(audioAttributesCompat.Z4()).a();
    }

    public static AudioAttributesCompat c(androidx.media2.exoplayer.external.audio.c cVar) {
        return new AudioAttributesCompat.d().b(cVar.f53274a).c(cVar.f53275b).e(cVar.f53276c).a();
    }

    public static int d(androidx.media2.exoplayer.external.i iVar) {
        if (iVar.f55264a != 0) {
            return 1;
        }
        IOException iOExceptionH = iVar.h();
        if (iOExceptionH instanceof k0) {
            return -1007;
        }
        return ((iOExceptionH instanceof e0.c) && (iOExceptionH.getCause() instanceof SocketTimeoutException)) ? -110 : -1004;
    }

    public static int e(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 3;
        }
        int i11 = 2 << 5;
        return i10 != 5 ? -1 : 4;
    }

    @e.a({"InlinedApi"})
    public static MediaFormat f(Format format) {
        MediaFormat mediaFormat = new MediaFormat();
        String str = format.f53103i;
        mediaFormat.setString("mime", str);
        int iG = androidx.media2.exoplayer.external.util.s.g(str);
        int i10 = 1;
        if (iG == 1) {
            mediaFormat.setInteger("channel-count", format.Z);
            mediaFormat.setInteger("sample-rate", format.f53112p0);
            String str2 = format.f53100g3;
            if (str2 != null) {
                mediaFormat.setString("language", str2);
                return mediaFormat;
            }
        } else {
            if (iG == 2) {
                androidx.media2.exoplayer.external.mediacodec.i.d(mediaFormat, "width", format.f53110n);
                androidx.media2.exoplayer.external.mediacodec.i.d(mediaFormat, "height", format.f53111o);
                androidx.media2.exoplayer.external.mediacodec.i.c(mediaFormat, "frame-rate", format.f53115s);
                androidx.media2.exoplayer.external.mediacodec.i.d(mediaFormat, "rotation-degrees", format.f53116t);
                androidx.media2.exoplayer.external.mediacodec.i.b(mediaFormat, format.Y);
                return mediaFormat;
            }
            if (iG == 3) {
                int i11 = format.f53095c;
                int i12 = 5 & 4;
                int i13 = i11 == 4 ? 1 : 0;
                int i14 = i11 == 1 ? 1 : 0;
                if (i11 != 2) {
                    i10 = 0;
                }
                mediaFormat.setInteger("is-autoselect", i13);
                mediaFormat.setInteger("is-default", i14);
                mediaFormat.setInteger("is-forced-subtitle", i10);
                String str3 = format.f53100g3;
                if (str3 == null) {
                    mediaFormat.setString("language", "und");
                } else {
                    mediaFormat.setString("language", str3);
                }
                if ("application/cea-608".equals(str)) {
                    mediaFormat.setString("mime", "text/cea-608");
                    return mediaFormat;
                }
                if ("application/cea-708".equals(str)) {
                    mediaFormat.setString("mime", "text/cea-708");
                }
            }
        }
        return mediaFormat;
    }

    public static m0 g(p pVar) {
        Float fD = pVar.d();
        Float fB = pVar.b();
        return new m0(fD != null ? fD.floatValue() : 1.0f, fB != null ? fB.floatValue() : 1.0f);
    }

    public static x0 h(int i10) {
        if (i10 == 0) {
            return x0.f57924e;
        }
        if (i10 == 1) {
            return x0.f57925f;
        }
        if (i10 == 2) {
            return x0.f57923d;
        }
        if (i10 == 3) {
            return x0.f57922c;
        }
        throw new IllegalArgumentException();
    }

    public static int i(int i10) {
        int i11 = 1;
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            i11 = 4;
            if (i10 != 3) {
                return i10 != 4 ? 0 : 5;
            }
        }
        return i11;
    }
}
