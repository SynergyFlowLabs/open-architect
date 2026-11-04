package kotlinx.serialization.internal;

import java.lang.Enum;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
@SourceDebugExtension({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumSerializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,148:1\n13472#2,2:149\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumSerializer\n*L\n120#1:149,2\n*E\n"})
public final class k0<T extends Enum<T>> implements KSerializer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final T[] f315955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private SerialDescriptor f315956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f315957c;

    public k0(@NotNull final String serialName, @NotNull T[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f315955a = values;
        this.f315957c = kotlin.g0.c(new Function0() { // from class: kotlinx.serialization.internal.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k0.d(this.f315948a, serialName);
            }
        });
    }

    private final SerialDescriptor c(String str) {
        i0 i0Var = new i0(str, this.f315955a.length);
        for (T t10 : this.f315955a) {
            PluginGeneratedSerialDescriptor.j(i0Var, t10.name(), false, 2, null);
        }
        return i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor d(k0 k0Var, String str) {
        SerialDescriptor serialDescriptor = k0Var.f315956b;
        return serialDescriptor == null ? k0Var.c(str) : serialDescriptor;
    }

    @Override // kotlinx.serialization.e
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        int iDecodeEnum = decoder.decodeEnum(getDescriptor());
        if (iDecodeEnum >= 0) {
            T[] tArr = this.f315955a;
            if (iDecodeEnum < tArr.length) {
                return tArr[iDecodeEnum];
            }
        }
        throw new kotlinx.serialization.c0(iDecodeEnum + " is not among valid " + getDescriptor().getSerialName() + " enum values, values size is " + this.f315955a.length);
    }

    @Override // kotlinx.serialization.d0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        int iIndexOf = ArraysKt.indexOf(this.f315955a, value);
        if (iIndexOf != -1) {
            encoder.encodeEnum(getDescriptor(), iIndexOf);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(getDescriptor().getSerialName());
        sb2.append(", must be one of ");
        String string = Arrays.toString(this.f315955a);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        throw new kotlinx.serialization.c0(sb2.toString());
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f315957c.getValue();
    }

    @NotNull
    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().getSerialName() + kotlin.text.b0.f313281f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k0(@NotNull String serialName, @NotNull T[] values, @NotNull SerialDescriptor descriptor) {
        this(serialName, values);
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f315956b = descriptor;
    }
}
