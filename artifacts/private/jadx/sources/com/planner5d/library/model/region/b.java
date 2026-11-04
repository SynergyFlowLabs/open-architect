package com.planner5d.library.model.region;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.e0;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 1)
@ij.f
@SourceDebugExtension({"SMAP\nLocaleRegionProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleRegionProvider.kt\ncom/planner5d/library/model/region/LocaleRegionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,14:1\n1#2:15\n*E\n"})
public final class b implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f222776a = 0;

    @ij.a
    public b() {
    }

    @Override // com.planner5d.library.services.e0
    @Nullable
    public String a() {
        String country = Locale.getDefault().getCountry();
        Intrinsics.checkNotNull(country);
        if (country.length() <= 0) {
            country = null;
        }
        if (country == null) {
            return null;
        }
        String lowerCase = country.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
