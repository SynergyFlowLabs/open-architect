package com.planner5d.library.model.region;

import android.app.Application;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.e0;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
@ij.f
@SourceDebugExtension({"SMAP\nResourcesRegionProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourcesRegionProvider.kt\ncom/planner5d/library/model/region/ResourcesRegionProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,15:1\n1#2:16\n*E\n"})
public final class f implements e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f222786b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f222787a;

    @ij.a
    public f(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f222787a = application;
    }

    @Override // com.planner5d.library.services.e0
    @Nullable
    public String a() {
        String country = this.f222787a.getResources().getConfiguration().getLocales().get(0).getCountry();
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
