package com.devtodev.analytics.internal.helpfultools;

import com.facebook.appevents.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class VersionCompare {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @SourceDebugExtension({"SMAP\nVersionCompare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VersionCompare.kt\ncom/devtodev/analytics/internal/helpfultools/VersionCompare$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,83:1\n1#2:84\n1174#3,2:85\n*S KotlinDebug\n*F\n+ 1 VersionCompare.kt\ncom/devtodev/analytics/internal/helpfultools/VersionCompare$Companion\n*L\n57#1:85,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Pair<String, String> addZerosIfNeeded(String str, String str2) {
            int length = str.length() - str2.length();
            if (length != 0) {
                String str3 = "";
                for (int i10 = 0; i10 < length; i10++) {
                    str3 = ((Object) str3) + p.f99189d0;
                }
                if (length > 0) {
                    str = str + ((Object) str3);
                } else {
                    str2 = str2 + ((Object) str3);
                }
            }
            return new Pair<>(str, str2);
        }

        private final Integer compareVersionArrays(List<String> list, List<String> list2) {
            Pair<String, String> pairPrepareNumAndLetters;
            for (Pair pair : CollectionsKt.zip(list, list2)) {
                if (!Intrinsics.areEqual(pair.getFirst(), pair.getSecond())) {
                    Pair<String, String> pairPrepareNumAndLetters2 = prepareNumAndLetters((String) pair.getFirst());
                    if (pairPrepareNumAndLetters2 == null || (pairPrepareNumAndLetters = prepareNumAndLetters((String) pair.getSecond())) == null) {
                        return null;
                    }
                    if (!Intrinsics.areEqual(pairPrepareNumAndLetters2.getFirst(), pairPrepareNumAndLetters.getFirst())) {
                        return Integer.valueOf(Intrinsics.compare(Integer.parseInt(pairPrepareNumAndLetters2.getFirst()), Integer.parseInt(pairPrepareNumAndLetters.getFirst())));
                    }
                    if (Intrinsics.areEqual(pairPrepareNumAndLetters2.getSecond(), pairPrepareNumAndLetters.getSecond())) {
                        continue;
                    } else {
                        if (pairPrepareNumAndLetters2.getSecond().length() == 0) {
                            return -1;
                        }
                        if (pairPrepareNumAndLetters.getSecond().length() == 0) {
                            return 1;
                        }
                        String second = pairPrepareNumAndLetters2.getSecond();
                        Locale locale = Locale.ROOT;
                        String lowerCase = second.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String lowerCase2 = pairPrepareNumAndLetters.getSecond().toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        Pair<String, String> pairAddZerosIfNeeded = addZerosIfNeeded(lowerCase, lowerCase2);
                        for (Pair<Character, Character> pair2 : StringsKt.s9(pairAddZerosIfNeeded.getFirst(), pairAddZerosIfNeeded.getFirst())) {
                            if (pair2.getFirst().charValue() != pair2.getSecond().charValue()) {
                                return Integer.valueOf(Intrinsics.compare((int) pair2.getFirst().charValue(), (int) pair2.getSecond().charValue()));
                            }
                        }
                    }
                }
            }
            return 0;
        }

        private final Pair<String, String> prepareNumAndLetters(String str) {
            String string = "";
            String string2 = "";
            for (int i10 = 0; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (Character.isDigit(cCharAt)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((Object) string);
                    sb2.append(cCharAt);
                    string = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append((Object) string2);
                    sb3.append(cCharAt);
                    string2 = sb3.toString();
                }
            }
            if (string.length() == 0) {
                return null;
            }
            return new Pair<>(string, string2);
        }

        @Nullable
        public final Integer compare(@NotNull String first, @NotNull String second) {
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            if (Intrinsics.areEqual(first, second)) {
                return 0;
            }
            List<String> mutableList = CollectionsKt.toMutableList((Collection) StringsKt.T4(first, new char[]{'.'}, false, 0, 6, null));
            List<String> mutableList2 = CollectionsKt.toMutableList((Collection) StringsKt.T4(second, new char[]{'.'}, false, 0, 6, null));
            int size = mutableList.size() - mutableList2.size();
            if (size == 0) {
                return compareVersionArrays(mutableList, mutableList2);
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(p.f99189d0);
            }
            if (size > 0) {
                mutableList2.addAll(arrayList);
            } else {
                mutableList.addAll(arrayList);
            }
            return compareVersionArrays(mutableList, mutableList2);
        }

        private Companion() {
        }
    }
}
