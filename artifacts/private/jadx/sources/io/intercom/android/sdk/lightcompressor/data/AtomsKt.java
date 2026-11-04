package io.intercom.android.sdk.lightcompressor.data;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class AtomsKt {
    private static final int FREE_ATOM = fourCcToInt(new byte[]{102, 114, 101, 101});
    private static final int JUNK_ATOM = fourCcToInt(new byte[]{106, 117, 110, 107});
    private static final int MDAT_ATOM = fourCcToInt(new byte[]{109, 100, 97, 116});
    private static final int MOOV_ATOM = fourCcToInt(new byte[]{109, 111, 111, 118});
    private static final int PNOT_ATOM = fourCcToInt(new byte[]{112, 110, 111, 116});
    private static final int SKIP_ATOM = fourCcToInt(new byte[]{115, 107, 105, 112});
    private static final int WIDE_ATOM = fourCcToInt(new byte[]{119, 105, 100, 101});
    private static final int PICT_ATOM = fourCcToInt(new byte[]{80, 73, 67, 84});
    private static final int FTYP_ATOM = fourCcToInt(new byte[]{102, 116, 121, 112});
    private static final int UUID_ATOM = fourCcToInt(new byte[]{117, 117, 105, 100});
    private static final int CMOV_ATOM = fourCcToInt(new byte[]{99, 109, 111, 118});
    private static final int STCO_ATOM = fourCcToInt(new byte[]{115, 116, 99, 111});
    private static final int CO64_ATOM = fourCcToInt(new byte[]{99, 111, 54, 52});

    public static final int fourCcToInt(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        return ByteBuffer.wrap(byteArray).order(ByteOrder.BIG_ENDIAN).getInt();
    }

    public static final int getCMOV_ATOM() {
        return CMOV_ATOM;
    }

    public static final int getCO64_ATOM() {
        return CO64_ATOM;
    }

    public static final int getFREE_ATOM() {
        return FREE_ATOM;
    }

    public static final int getFTYP_ATOM() {
        return FTYP_ATOM;
    }

    public static final int getJUNK_ATOM() {
        return JUNK_ATOM;
    }

    public static final int getMDAT_ATOM() {
        return MDAT_ATOM;
    }

    public static final int getMOOV_ATOM() {
        return MOOV_ATOM;
    }

    public static final int getPICT_ATOM() {
        return PICT_ATOM;
    }

    public static final int getPNOT_ATOM() {
        return PNOT_ATOM;
    }

    public static final int getSKIP_ATOM() {
        return SKIP_ATOM;
    }

    public static final int getSTCO_ATOM() {
        return STCO_ATOM;
    }

    public static final int getUUID_ATOM() {
        return UUID_ATOM;
    }

    public static final int getWIDE_ATOM() {
        return WIDE_ATOM;
    }
}
