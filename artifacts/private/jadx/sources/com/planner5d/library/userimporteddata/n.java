package com.planner5d.library.userimporteddata;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@ij.f
@SourceDebugExtension({"SMAP\nUserImportedModelNameProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserImportedModelNameProcessor.kt\ncom/planner5d/library/userimporteddata/UserImportedModelNameProcessor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f235832a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f235833b = "user_model/";

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @ij.a
    public n() {
    }

    @Nullable
    public final String a(@Nullable String str) {
        if (str != null) {
            if (!b(str)) {
                str = null;
            }
            if (str != null) {
                String strSubstring = str.substring(11);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return null;
    }

    public final boolean b(@Nullable String str) {
        return str != null ? StringsKt.u2(str, f235833b, false, 2, null) : false;
    }
}
