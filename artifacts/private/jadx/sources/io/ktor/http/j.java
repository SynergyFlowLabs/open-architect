package io.ktor.http;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nContentDisposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentDisposition.kt\nio/ktor/http/ContentDispositionKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,125:1\n1069#2,2:126\n*S KotlinDebug\n*F\n+ 1 ContentDisposition.kt\nio/ktor/http/ContentDispositionKt\n*L\n120#1:126,2\n*E\n"})
public final class j {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(String str, String str2) {
        if (Intrinsics.areEqual(str, i.b.f295871c) && !StringsKt.s2(str2, "utf-8''", true)) {
            for (int i10 = 0; i10 < str2.length(); i10++) {
                if (!h.z().contains(Character.valueOf(str2.charAt(i10)))) {
                    return "utf-8''" + h.C(str2, h.z());
                }
            }
            return str2;
        }
        return str2;
    }
}
