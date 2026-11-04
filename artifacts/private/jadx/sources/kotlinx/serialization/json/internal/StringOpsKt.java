package kotlinx.serialization.json.internal;

import com.facebook.internal.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class StringOpsKt {

    @NotNull
    private static final byte[] ESCAPE_MARKERS;

    @NotNull
    private static final String[] ESCAPE_STRINGS;

    static {
        String[] strArr = new String[93];
        for (int i10 = 0; i10 < 32; i10++) {
            strArr[i10] = "\\u" + toHexChar(i10 >> 12) + toHexChar(i10 >> 8) + toHexChar(i10 >> 4) + toHexChar(i10);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        ESCAPE_STRINGS = strArr;
        byte[] bArr = new byte[93];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr[i11] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        ESCAPE_MARKERS = bArr;
    }

    @NotNull
    public static final byte[] getESCAPE_MARKERS() {
        return ESCAPE_MARKERS;
    }

    @NotNull
    public static final String[] getESCAPE_STRINGS() {
        return ESCAPE_STRINGS;
    }

    @JsonFriendModuleApi
    public static /* synthetic */ void getESCAPE_STRINGS$annotations() {
    }

    public static final void printQuoted(@NotNull StringBuilder sb2, @NotNull String value) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        sb2.append('\"');
        int length = value.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = value.charAt(i11);
            String[] strArr = ESCAPE_STRINGS;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb2.append((CharSequence) value, i10, i11);
                sb2.append(strArr[cCharAt]);
                i10 = i11 + 1;
            }
        }
        if (i10 != 0) {
            sb2.append((CharSequence) value, i10, value.length());
        } else {
            sb2.append(value);
        }
        sb2.append('\"');
    }

    @Nullable
    public static final Boolean toBooleanStrictOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt.N1(str, z0.P, true)) {
            return Boolean.TRUE;
        }
        if (StringsKt.N1(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static final char toHexChar(int i10) {
        int i11 = i10 & 15;
        return (char) (i11 < 10 ? i11 + 48 : i11 + 87);
    }
}
