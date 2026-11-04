package com.superwall.sdk.models.serialization;

import com.superwall.sdk.utilities.DateUtils;
import com.superwall.sdk.utilities.DateUtilsKt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.e0;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.g;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@e0(forClass = Date.class)
@g
public final class DateSerializer implements KSerializer<Date> {

    @NotNull
    public static final DateSerializer INSTANCE = new DateSerializer();

    @NotNull
    private static final DateSerializer$dateFormat$1 dateFormat = new ThreadLocal<SimpleDateFormat>() { // from class: com.superwall.sdk.models.serialization.DateSerializer$dateFormat$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            SimpleDateFormat simpleDateFormatDateFormat = DateUtilsKt.dateFormat(DateUtils.INSTANCE.getISO_MILLIS());
            simpleDateFormatDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormatDateFormat;
        }
    };

    @NotNull
    private static final SerialDescriptor descriptor = new PluginGeneratedSerialDescriptor("java.util.Date", null, 0);

    private DateSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    public Date deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        try {
            SimpleDateFormat simpleDateFormat = dateFormat.get();
            Intrinsics.checkNotNull(simpleDateFormat);
            Date date = simpleDateFormat.parse(decoder.decodeString());
            Intrinsics.checkNotNull(date);
            return date;
        } catch (Throwable th2) {
            throw new IllegalArgumentException("Invalid date format", th2);
        }
    }

    @Override // kotlinx.serialization.d0
    public void serialize(@NotNull Encoder encoder, @NotNull Date value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SimpleDateFormat simpleDateFormat = dateFormat.get();
        Intrinsics.checkNotNull(simpleDateFormat);
        String str = simpleDateFormat.format(value);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        encoder.encodeString(str);
    }
}
