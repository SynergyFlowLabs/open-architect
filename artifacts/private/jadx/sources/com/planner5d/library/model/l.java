package com.planner5d.library.model;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 1)
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f180766e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f180767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f180768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Integer f180769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f180770d;

    @w0(parameters = 1)
    @SourceDebugExtension({"SMAP\nHashMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HashMetadata.kt\ncom/planner5d/library/model/HashMetadata$Parser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f180771a = 0;

        @Nullable
        public final l a(@NotNull CharSequence hashKey) {
            Intrinsics.checkNotNullParameter(hashKey, "hashKey");
            Integer numValueOf = Integer.valueOf(StringsKt.r3(hashKey, "/", 0, false, 6, null));
            int iIntValue = numValueOf.intValue();
            Integer num = null;
            if (iIntValue <= 0 || iIntValue == StringsKt.i3(hashKey)) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue2 = numValueOf.intValue();
                String string = hashKey.subSequence(iIntValue2 + 1, hashKey.length()).toString();
                Integer numValueOf2 = Integer.valueOf(StringsKt.G3(string, ".", 0, false, 6, null));
                int iIntValue3 = numValueOf2.intValue();
                if (iIntValue3 <= 0 || iIntValue3 == StringsKt.i3(string)) {
                    numValueOf2 = null;
                }
                if (numValueOf2 != null) {
                    int iIntValue4 = numValueOf2.intValue();
                    String strSubstring = string.substring(0, iIntValue4);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    int iG3 = StringsKt.G3(strSubstring, ".", 0, false, 6, null);
                    if (iG3 != -1) {
                        String strSubstring2 = strSubstring.substring(0, iG3);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        String strSubstring3 = strSubstring.substring(iG3 + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                        Integer intOrNull = StringsKt.toIntOrNull(strSubstring3);
                        strSubstring = strSubstring2;
                        num = intOrNull;
                    }
                    String string2 = hashKey.subSequence(0, iIntValue2).toString();
                    String strSubstring4 = string.substring(iIntValue4 + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                    return new l(string2, strSubstring, num, strSubstring4);
                }
            }
            return null;
        }
    }

    public l(@NotNull String materialName, @NotNull String baseFileName, @Nullable Integer num, @NotNull String imageFormat) {
        Intrinsics.checkNotNullParameter(materialName, "materialName");
        Intrinsics.checkNotNullParameter(baseFileName, "baseFileName");
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        this.f180767a = materialName;
        this.f180768b = baseFileName;
        this.f180769c = num;
        this.f180770d = imageFormat;
    }

    @NotNull
    public final String a() {
        return this.f180768b;
    }

    @Nullable
    public final Integer b() {
        return this.f180769c;
    }

    @NotNull
    public final String c() {
        return this.f180770d;
    }

    @NotNull
    public final String d() {
        return this.f180767a;
    }
}
