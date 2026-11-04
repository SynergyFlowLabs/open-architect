package com.google.firebase.perf.network;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.firebase.perf.metrics.i;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f124076a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    private h() {
    }

    public static Long a(@NonNull HttpMessage httpMessage) {
        try {
            Header firstHeader = httpMessage.getFirstHeader("content-length");
            if (firstHeader != null) {
                return Long.valueOf(Long.parseLong(firstHeader.getValue()));
            }
        } catch (NumberFormatException unused) {
            com.google.firebase.perf.logging.a.e().a("The content-length value is not a valid number");
        }
        return null;
    }

    public static String b(@NonNull HttpResponse httpResponse) {
        String value;
        Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader == null || (value = firstHeader.getValue()) == null) {
            return null;
        }
        return value;
    }

    public static boolean c(@p0 String str) {
        if (str != null && f124076a.matcher(str).matches()) {
            return false;
        }
        return true;
    }

    public static void d(i iVar) {
        if (!iVar.i()) {
            iVar.r();
        }
        iVar.b();
    }
}
