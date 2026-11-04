package com.superwall.sdk.storage;

import com.google.common.net.d;
import com.superwall.sdk.utilities.DateUtils;
import com.superwall.sdk.utilities.DateUtilsKt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.c0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.k;
import kotlinx.serialization.e0;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@e0(forClass = Date.class)
public final class DateSerializer implements KSerializer<Date> {

    @NotNull
    public static final DateSerializer INSTANCE = new DateSerializer();

    @NotNull
    private static final SerialDescriptor descriptor;

    @NotNull
    private static final SimpleDateFormat format;

    static {
        SimpleDateFormat simpleDateFormatDateFormat = DateUtilsKt.dateFormat(DateUtils.INSTANCE.getISO_SECONDS_TIMEZONE());
        simpleDateFormatDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        format = simpleDateFormatDateFormat;
        descriptor = k.c(d.f119483d, e.i.f315839a);
    }

    private DateSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public Date deserialize(@NotNull Decoder decoder) throws ParseException {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String strDecodeString = decoder.decodeString();
        Date date = format.parse(strDecodeString);
        if (date != null) {
            return date;
        }
        throw new c0("Invalid date format: " + strDecodeString);
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull Date value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        String str = format.format(value);
        Intrinsics.checkNotNull(str);
        encoder.encodeString(str);
    }
}
