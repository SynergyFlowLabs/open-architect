package androidx.navigation.serialization;

import androidx.navigation.d3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    private static final Class<?> a(SerialDescriptor serialDescriptor) {
        String strK2 = StringsKt.k2(serialDescriptor.getSerialName(), com.planner5d.library.model.payments.a.f222474i, "", false, 4, null);
        try {
            Class<?> cls = Class.forName(strK2);
            Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
            return cls;
        } catch (ClassNotFoundException unused) {
            if (StringsKt.V2(strK2, ".", false, 2, null)) {
                Class<?> cls2 = Class.forName(new Regex("(\\.+)(?!.*\\.)").replace(strK2, "\\$"));
                Intrinsics.checkNotNullExpressionValue(cls2, "forName(...)");
                return cls2;
            }
            String str = "Cannot find class with name \"" + serialDescriptor.getSerialName() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (serialDescriptor.getKind() instanceof kotlinx.serialization.descriptors.l.b) {
                str = str + ".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.";
            }
            throw new IllegalArgumentException(str);
        }
    }

    @NotNull
    public static final d3<?> b(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        d3<?> d3VarD = d3.Companion.d(a(serialDescriptor), false);
        if (d3VarD == null) {
            d3VarD = s.f71305a;
        }
        return d3VarD;
    }

    @NotNull
    public static final d3<?> c(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Class<?> clsA = a(serialDescriptor.getElementDescriptor(0));
        Intrinsics.checkNotNull(clsA, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
        return new b.a(clsA);
    }

    @NotNull
    public static final d3<?> d(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Class<?> clsA = a(serialDescriptor);
        if (!Enum.class.isAssignableFrom(clsA)) {
            return s.f71305a;
        }
        Intrinsics.checkNotNull(clsA, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>?>");
        return new b.C0630b(clsA);
    }
}
