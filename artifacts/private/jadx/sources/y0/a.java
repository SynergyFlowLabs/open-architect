package y0;

import androidx.compose.runtime.internal.w0;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f390665a = 0;

    @Override // y0.g
    @NotNull
    public f a() {
        return new f((List<e>) CollectionsKt.listOf(new e(Locale.getDefault())));
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
