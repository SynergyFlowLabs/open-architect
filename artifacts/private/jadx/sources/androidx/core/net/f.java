package androidx.core.net;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.superwall.sdk.network.Api;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    private f() {
    }

    @NonNull
    public static String a(@NonNull Uri uri) {
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (scheme != null) {
            if (!scheme.equalsIgnoreCase("tel") && !scheme.equalsIgnoreCase("sip") && !scheme.equalsIgnoreCase("sms") && !scheme.equalsIgnoreCase("smsto") && !scheme.equalsIgnoreCase("mailto") && !scheme.equalsIgnoreCase("nfc")) {
                if (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase(Api.scheme) || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("//");
                    sb2.append(uri.getHost() != null ? uri.getHost() : "");
                    sb2.append(uri.getPort() != -1 ? ":" + uri.getPort() : "");
                    sb2.append("/...");
                    schemeSpecificPart = sb2.toString();
                }
            }
            StringBuilder sb3 = new StringBuilder(64);
            sb3.append(scheme);
            sb3.append(AbstractJsonLexerKt.COLON);
            if (schemeSpecificPart != null) {
                for (int i10 = 0; i10 < schemeSpecificPart.length(); i10++) {
                    char cCharAt = schemeSpecificPart.charAt(i10);
                    if (cCharAt == '-' || cCharAt == '@' || cCharAt == '.') {
                        sb3.append(cCharAt);
                    } else {
                        sb3.append('x');
                    }
                }
            }
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder(64);
        if (scheme != null) {
            sb4.append(scheme);
            sb4.append(AbstractJsonLexerKt.COLON);
        }
        if (schemeSpecificPart != null) {
            sb4.append(schemeSpecificPart);
        }
        return sb4.toString();
    }
}
