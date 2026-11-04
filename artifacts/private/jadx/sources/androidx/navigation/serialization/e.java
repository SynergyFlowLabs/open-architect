package androidx.navigation.serialization;

import androidx.navigation.d3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.w;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71273a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.STRING_NULLABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.BOOL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.DOUBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[d.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[d.INT_NULLABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[d.BOOL_NULLABLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[d.DOUBLE_NULLABLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[d.FLOAT_NULLABLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[d.LONG_NULLABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[d.INT_ARRAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[d.BOOL_ARRAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[d.DOUBLE_ARRAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[d.FLOAT_ARRAY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[d.LONG_ARRAY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[d.ARRAY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[d.LIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[d.ENUM_NULLABLE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            f71273a = iArr;
        }
    }

    @NotNull
    public static final d3<?> a(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        d dVarC = c(serialDescriptor);
        int[] iArr = a.f71273a;
        switch (iArr[dVarC.ordinal()]) {
            case 1:
                return c.f71240a.i();
            case 2:
                return d3.StringType;
            case 3:
                return d3.IntType;
            case 4:
                return d3.BoolType;
            case 5:
                return c.f71240a.e();
            case 6:
                return d3.FloatType;
            case 7:
                return d3.LongType;
            case 8:
                return f.b(serialDescriptor);
            case 9:
                return c.f71240a.g();
            case 10:
                return c.f71240a.a();
            case 11:
                return c.f71240a.d();
            case 12:
                return c.f71240a.f();
            case 13:
                return c.f71240a.h();
            case 14:
                return d3.IntArrayType;
            case 15:
                return d3.BoolArrayType;
            case 16:
                return c.f71240a.b();
            case 17:
                return d3.FloatArrayType;
            case 18:
                return d3.LongArrayType;
            case 19:
                int i10 = iArr[c(serialDescriptor.getElementDescriptor(0)).ordinal()];
                if (i10 != 1) {
                    return i10 != 2 ? s.f71305a : c.f71240a.j();
                }
                return d3.StringArrayType;
            case 20:
                switch (iArr[c(serialDescriptor.getElementDescriptor(0)).ordinal()]) {
                    case 1:
                        return d3.StringListType;
                    case 2:
                        return c.f71240a.k();
                    case 3:
                        return d3.IntListType;
                    case 4:
                        return d3.BoolListType;
                    case 5:
                        return c.f71240a.c();
                    case 6:
                        return d3.FloatListType;
                    case 7:
                        return d3.LongListType;
                    case 8:
                        return f.c(serialDescriptor);
                    default:
                        return s.f71305a;
                }
            case 21:
                return f.d(serialDescriptor);
            default:
                return s.f71305a;
        }
    }

    public static final boolean b(@NotNull SerialDescriptor serialDescriptor, @NotNull kotlin.reflect.s kType) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(kType, "kType");
        if (serialDescriptor.isNullable() != kType.A()) {
            return false;
        }
        KSerializer<Object> kSerializerR = m0.r(kType);
        if (kSerializerR != null) {
            return Intrinsics.areEqual(serialDescriptor, kSerializerR.getDescriptor());
        }
        throw new IllegalStateException(("Cannot find KSerializer for [" + serialDescriptor.getSerialName() + "]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration.").toString());
    }

    private static final d c(SerialDescriptor serialDescriptor) {
        String strK2 = StringsKt.k2(serialDescriptor.getSerialName(), com.planner5d.library.model.payments.a.f222474i, "", false, 4, null);
        if (Intrinsics.areEqual(serialDescriptor.getKind(), kotlinx.serialization.descriptors.l.b.f315860a)) {
            return serialDescriptor.isNullable() ? d.ENUM_NULLABLE : d.ENUM;
        }
        if (Intrinsics.areEqual(strK2, "kotlin.Int")) {
            return serialDescriptor.isNullable() ? d.INT_NULLABLE : d.INT;
        }
        if (Intrinsics.areEqual(strK2, "kotlin.Boolean")) {
            return serialDescriptor.isNullable() ? d.BOOL_NULLABLE : d.BOOL;
        }
        if (Intrinsics.areEqual(strK2, "kotlin.Double")) {
            return serialDescriptor.isNullable() ? d.DOUBLE_NULLABLE : d.DOUBLE;
        }
        if (Intrinsics.areEqual(strK2, "kotlin.Float")) {
            return serialDescriptor.isNullable() ? d.FLOAT_NULLABLE : d.FLOAT;
        }
        if (Intrinsics.areEqual(strK2, "kotlin.Long")) {
            return serialDescriptor.isNullable() ? d.LONG_NULLABLE : d.LONG;
        }
        if (Intrinsics.areEqual(strK2, "kotlin.String")) {
            return serialDescriptor.isNullable() ? d.STRING_NULLABLE : d.STRING;
        }
        if (Intrinsics.areEqual(strK2, "kotlin.IntArray")) {
            return d.INT_ARRAY;
        }
        if (Intrinsics.areEqual(strK2, "kotlin.DoubleArray")) {
            return d.DOUBLE_ARRAY;
        }
        if (Intrinsics.areEqual(strK2, "kotlin.BooleanArray")) {
            return d.BOOL_ARRAY;
        }
        if (Intrinsics.areEqual(strK2, "kotlin.FloatArray")) {
            return d.FLOAT_ARRAY;
        }
        if (Intrinsics.areEqual(strK2, "kotlin.LongArray")) {
            return d.LONG_ARRAY;
        }
        if (Intrinsics.areEqual(strK2, w.f316037a)) {
            return d.ARRAY;
        }
        int i10 = 0 << 0;
        return StringsKt.u2(strK2, w.f316038b, false, 2, null) ? d.LIST : d.UNKNOWN;
    }
}
