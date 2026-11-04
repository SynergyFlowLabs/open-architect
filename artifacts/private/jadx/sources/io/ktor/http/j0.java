package io.ktor.http;

import io.ktor.util.date.GMTDate;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final List<String> f295896a = CollectionsKt.listOf((Object[]) new String[]{"***, dd MMM YYYY hh:mm:ss zzz", "****, dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d hh:mm:ss YYYY", "***, dd-MMM-YYYY hh:mm:ss zzz", "***, dd-MMM-YYYY hh-mm-ss zzz", "***, dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh:mm:ss zzz", "*** dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh-mm-ss zzz", "***,dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d YYYY hh:mm:ss zzz"});

    @NotNull
    public static final GMTDate a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String string = StringsKt.E5(str).toString();
        try {
            return new b0().l(string);
        } catch (r1 unused) {
            return b(string);
        }
    }

    @NotNull
    public static final GMTDate b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String string = StringsKt.E5(str).toString();
        Iterator<String> it = f295896a.iterator();
        while (it.hasNext()) {
            try {
                return new ni.f(it.next()).b(str);
            } catch (ni.g unused) {
            }
        }
        throw new IllegalStateException(("Failed to parse date: " + string).toString());
    }

    private static final String c(int i10, int i11) {
        return StringsKt.U3(String.valueOf(i10), i11, org.locationtech.jts.geom.l.f338160j);
    }

    @NotNull
    public static final String d(@NotNull GMTDate gMTDate) {
        Intrinsics.checkNotNullParameter(gMTDate, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(gMTDate.O().n() + ", ");
        sb2.append(c(gMTDate.N(), 2) + ' ');
        sb2.append(gMTDate.U().n() + ' ');
        sb2.append(c(gMTDate.X(), 4));
        sb2.append(' ' + c(gMTDate.S(), 2) + AbstractJsonLexerKt.COLON + c(gMTDate.T(), 2) + AbstractJsonLexerKt.COLON + c(gMTDate.V(), 2) + ' ');
        sb2.append(org.apache.commons.lang3.time.m.f337525a);
        return sb2.toString();
    }
}
