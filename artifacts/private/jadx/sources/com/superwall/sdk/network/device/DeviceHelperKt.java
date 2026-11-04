package com.superwall.sdk.network.device;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes13.dex */
public final class DeviceHelperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String asPadded(String str) {
        String str2;
        List listSplit$default = StringsKt.split$default(str, new String[]{"-"}, false, 0, 6, null);
        String str3 = "";
        if (listSplit$default.isEmpty()) {
            return "";
        }
        String str4 = (String) listSplit$default.get(0);
        if (listSplit$default.size() > 1) {
            List listSplit$default2 = StringsKt.split$default((CharSequence) listSplit$default.get(1), new String[]{"."}, false, 0, 6, null);
            str2 = "-" + listSplit$default2.get(0);
            if (listSplit$default2.size() > 1) {
                q1 q1Var = q1.f312784a;
                Integer intOrNull = StringsKt.toIntOrNull((String) listSplit$default2.get(1));
                String str5 = String.format("%03d", Arrays.copyOf(new Object[]{Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 0)}, 1));
                Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                str2 = str2 + "." + str5;
            }
        } else {
            str2 = "";
        }
        List listSplit$default3 = StringsKt.split$default(str4, new String[]{"."}, false, 0, 6, null);
        if (!listSplit$default3.isEmpty()) {
            q1 q1Var2 = q1.f312784a;
            Integer intOrNull2 = StringsKt.toIntOrNull((String) listSplit$default3.get(0));
            String str6 = String.format("%03d", Arrays.copyOf(new Object[]{Integer.valueOf(intOrNull2 != null ? intOrNull2.intValue() : 0)}, 1));
            Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
            str3 = "" + str6;
        }
        if (listSplit$default3.size() > 1) {
            q1 q1Var3 = q1.f312784a;
            Integer intOrNull3 = StringsKt.toIntOrNull((String) listSplit$default3.get(1));
            String str7 = String.format("%03d", Arrays.copyOf(new Object[]{Integer.valueOf(intOrNull3 != null ? intOrNull3.intValue() : 0)}, 1));
            Intrinsics.checkNotNullExpressionValue(str7, "format(...)");
            str3 = str3 + "." + str7;
        }
        if (listSplit$default3.size() > 2) {
            q1 q1Var4 = q1.f312784a;
            Integer intOrNull4 = StringsKt.toIntOrNull((String) listSplit$default3.get(2));
            String str8 = String.format("%03d", Arrays.copyOf(new Object[]{Integer.valueOf(intOrNull4 != null ? intOrNull4.intValue() : 0)}, 1));
            Intrinsics.checkNotNullExpressionValue(str8, "format(...)");
            str3 = str3 + "." + str8;
        }
        return str3 + str2;
    }
}
