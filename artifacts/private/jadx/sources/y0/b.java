package y0;

import android.os.LocaleList;
import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.text.platform.c0;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@androidx.annotation.w0(api = 24)
@SourceDebugExtension({"SMAP\nAndroidLocaleDelegate.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidLocaleDelegate.android.kt\nandroidx/compose/ui/text/intl/AndroidLocaleDelegateAPI24\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n27#2,2:88\n1#3:90\n*S KotlinDebug\n*F\n+ 1 AndroidLocaleDelegate.android.kt\nandroidx/compose/ui/text/intl/AndroidLocaleDelegateAPI24\n*L\n52#1:88,2\n*E\n"})
public final class b implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f390666d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private LocaleList f390667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private f f390668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final c0 f390669c = new c0();

    @Override // y0.g
    @NotNull
    public f a() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f390669c) {
            try {
                f fVar = this.f390668b;
                if (fVar != null && localeList == this.f390667a) {
                    return fVar;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(new e(localeList.get(i10)));
                }
                f fVar2 = new f(arrayList);
                this.f390667a = localeList;
                this.f390668b = fVar2;
                return fVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // y0.g
    @NotNull
    public Locale b(@NotNull String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (Intrinsics.areEqual(localeForLanguageTag.toLanguageTag(), "und")) {
            String unused = c.f390670a;
        }
        return localeForLanguageTag;
    }
}
