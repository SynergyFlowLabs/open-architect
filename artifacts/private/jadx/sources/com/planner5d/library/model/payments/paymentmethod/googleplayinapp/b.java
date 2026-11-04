package com.planner5d.library.model.payments.paymentmethod.googleplayinapp;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.f;
import com.planner5d.library.services.utility.h3;
import fd.i;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f222582b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f222583c = "payment failed - ";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String[] f222584a;

    @SourceDebugExtension({"SMAP\nGooglePlayInAppException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePlayInAppException.kt\ncom/planner5d/library/model/payments/paymentmethod/googleplayinapp/GooglePlayInAppException$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,70:1\n37#2,2:71\n*S KotlinDebug\n*F\n+ 1 GooglePlayInAppException.kt\ncom/planner5d/library/model/payments/paymentmethod/googleplayinapp/GooglePlayInAppException$Companion\n*L\n26#1:71,2\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final b a(@NotNull Context context, @Nullable Intent intent, int i10, @Nullable i iVar) {
            Integer numValueOf;
            Intrinsics.checkNotNullParameter(context, "context");
            Integer numT = h3.T(context);
            DefaultConstructorMarker defaultConstructorMarker = null;
            try {
                numValueOf = Integer.valueOf(context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode);
            } catch (Throwable unused) {
                numValueOf = null;
            }
            int i11 = f.f106402h;
            Integer numValueOf2 = (intent == null || !intent.hasExtra("RESPONSE_CODE")) ? null : Integer.valueOf(intent.getIntExtra("RESPONSE_CODE", -1));
            return new b(new String[]{iVar != null ? iVar.c() : null, numT != null ? numT.toString() : null, numValueOf != null ? numValueOf.toString() : null, String.valueOf(i11), String.valueOf(i10), intent == null ? null : "1", numValueOf2 != null ? numValueOf2.toString() : null}, defaultConstructorMarker);
        }

        @Nullable
        public final b b(@Nullable String str) {
            int iR3;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (str == null || (iR3 = StringsKt.r3(str, b.f222583c, 0, false, 6, null)) == -1) {
                return null;
            }
            String strSubstring = str.substring(iR3 + 17);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String[] strArr = (String[]) StringsKt.split$default(StringsKt.E5(strSubstring).toString(), new String[]{":"}, false, 0, 6, null).toArray(new String[0]);
            return new b((String[]) Arrays.copyOf(strArr, strArr.length), defaultConstructorMarker);
        }

        private a() {
        }
    }

    public /* synthetic */ b(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    private final Integer a() {
        try {
            String str = this.f222584a[6];
            if (str != null) {
                return Integer.valueOf(Integer.parseInt(str));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public final boolean b() {
        Integer numA = a();
        return numA != null && numA.intValue() == 7;
    }

    public final boolean c() {
        Integer numA = a();
        return numA != null && numA.intValue() == 1;
    }

    private b(String... strArr) {
        super(f222583c + ArraysKt.joinToString$default(strArr, ":", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        this.f222584a = strArr;
    }
}
