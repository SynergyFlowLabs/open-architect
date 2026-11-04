package io.intercom.android.sdk.utilities;

import androidx.annotation.p0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class CustomAttributeValidator {
    private static final List<? extends Class<? extends Serializable>> ACCEPTED_CUSTOM_ATTRIBUTE_TYPES = Arrays.asList(String.class, Character.class, Short.class, Long.class, Float.class, Double.class, Integer.class, Byte.class, Boolean.class);

    public static String getAcceptedTypes() {
        StringBuilder sb2 = new StringBuilder();
        for (Class<? extends Serializable> cls : ACCEPTED_CUSTOM_ATTRIBUTE_TYPES) {
            if (sb2.length() != 0) {
                sb2.append(", ");
            }
            sb2.append(cls.getSimpleName());
        }
        return sb2.toString();
    }

    public static boolean isValid(@p0 Object obj) {
        return obj == null || ACCEPTED_CUSTOM_ATTRIBUTE_TYPES.contains(obj.getClass());
    }
}
