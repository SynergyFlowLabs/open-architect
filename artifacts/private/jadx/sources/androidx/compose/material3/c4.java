package androidx.compose.material3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nCalendarLocale.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarLocale.jvm.kt\nandroidx/compose/material3/CalendarLocale_jvmKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,64:1\n381#2,7:65\n*S KotlinDebug\n*F\n+ 1 CalendarLocale.jvm.kt\nandroidx/compose/material3/CalendarLocale_jvmKt\n*L\n56#1:65,7\n*E\n"})
public final class c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final WeakHashMap<String, NumberFormat> f26463a = new WeakHashMap<>();

    private static final NumberFormat a(int i10, int i11, boolean z10, Locale locale) {
        String str = i10 + '.' + i11 + '.' + z10 + '.' + locale.toLanguageTag();
        WeakHashMap<String, NumberFormat> weakHashMap = f26463a;
        NumberFormat integerInstance = weakHashMap.get(str);
        if (integerInstance == null) {
            integerInstance = NumberFormat.getIntegerInstance(locale);
            integerInstance.setGroupingUsed(z10);
            integerInstance.setMinimumIntegerDigits(i10);
            integerInstance.setMaximumIntegerDigits(i11);
            weakHashMap.put(str, integerInstance);
        }
        return integerInstance;
    }

    @NotNull
    public static final String b(int i10, int i11, int i12, boolean z10, @Nullable Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return a(i11, i12, z10, locale).format(Integer.valueOf(i10));
    }

    public static /* synthetic */ String c(int i10, int i11, int i12, boolean z10, Locale locale, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 1;
        }
        if ((i13 & 2) != 0) {
            i12 = 40;
        }
        if ((i13 & 4) != 0) {
            z10 = false;
        }
        if ((i13 & 8) != 0) {
            locale = null;
        }
        return b(i10, i11, i12, z10, locale);
    }
}
