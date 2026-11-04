package io.sentry.android.replay.util;

import android.os.Build;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 1)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o f305035a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f305036b = 0;

    public enum a {
        SOC_MODEL,
        SOC_MANUFACTURER;

        private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

        @NotNull
        public static kotlin.enums.a<a> getEntries() {
            return $ENTRIES;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f305037a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.SOC_MODEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SOC_MANUFACTURER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f305037a = iArr;
        }
    }

    private o() {
    }

    public static /* synthetic */ String b(o oVar, a aVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return oVar.a(aVar, str);
    }

    @NotNull
    public final String a(@NotNull a key, @NotNull String defaultValue) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (Build.VERSION.SDK_INT < 31) {
            return defaultValue;
        }
        int i10 = b.f305037a[key.ordinal()];
        if (i10 == 1) {
            str = Build.SOC_MODEL;
        } else {
            if (i10 != 2) {
                throw new k0();
            }
            str = Build.SOC_MANUFACTURER;
        }
        Intrinsics.checkNotNull(str);
        return str;
    }
}
