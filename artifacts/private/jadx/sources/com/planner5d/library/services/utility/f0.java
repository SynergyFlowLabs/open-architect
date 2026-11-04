package com.planner5d.library.services.utility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nCsvUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CsvUtils.kt\ncom/planner5d/library/services/utility/CsvUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f0 f225226a = new f0();

    private f0() {
    }

    @NotNull
    public final List<Long> a(@Nullable String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            if (StringsKt.w3(str)) {
                str = null;
            }
            String str2 = str;
            if (str2 != null) {
                Iterator it = StringsKt.T4(str2, new char[]{AbstractJsonLexerKt.COMMA}, false, 0, 6, null).iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf(Long.parseLong((String) it.next())));
                    } catch (NumberFormatException e10) {
                        timber.log.b.f381052a.y(e10);
                    }
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public final String b(@NotNull List<Long> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sb2 = new StringBuilder();
        Iterator<Long> it = value.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            sb2.append(jLongValue);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
