package com.planner5d.library.services.utility;

import android.content.Context;
import com.planner5d.library.services.textspan.UrlSpanWithListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nTextValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextValue.kt\ncom/planner5d/library/services/utility/TextValue\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,85:1\n11165#2:86\n11500#2,3:87\n37#3,2:90\n*S KotlinDebug\n*F\n+ 1 TextValue.kt\ncom/planner5d/library/services/utility/TextValue\n*L\n65#1:86\n65#1:87,3\n65#1:90,2\n*E\n"})
public class k3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f225298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.f1
    private final int f225299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object[] f225300c;

    public k3() {
        this.f225298a = null;
        this.f225299b = 0;
        this.f225300c = new Object[0];
    }

    private final Object[] g(Context context) {
        Object[] objArr = this.f225300c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object objI : objArr) {
            if (objI instanceof k3) {
                objI = ((k3) objI).i(context);
            }
            arrayList.add(objI);
        }
        return arrayList.toArray(new Object[0]);
    }

    @NotNull
    protected final Object[] a() {
        return this.f225300c;
    }

    @Nullable
    protected final String b() {
        return this.f225298a;
    }

    @NotNull
    public final CharSequence c(@NotNull Context context) {
        CharSequence charSequenceC;
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.f225298a;
        if (str != null) {
            charSequenceC = com.planner5d.library.services.textspan.b.d(str);
        } else {
            int i10 = this.f225299b;
            if (i10 != 0) {
                Object[] objArrG = g(context);
                charSequenceC = com.planner5d.library.services.textspan.b.c(context, i10, Arrays.copyOf(objArrG, objArrG.length));
            } else {
                charSequenceC = "";
            }
        }
        Intrinsics.checkNotNullExpressionValue(charSequenceC, "let(...)");
        return charSequenceC;
    }

    @NotNull
    public final CharSequence d(@NotNull Context context, @NotNull UrlSpanWithListener.a listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        CharSequence charSequenceF = com.planner5d.library.services.textspan.b.f(c(context), listener, null, false);
        Intrinsics.checkNotNullExpressionValue(charSequenceF, "setClickListenersOnLinks(...)");
        return charSequenceF;
    }

    @NotNull
    public final CharSequence e(@NotNull Context context, boolean z10, boolean z11, @NotNull UrlSpanWithListener.a listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        int i10 = 4 & 0;
        CharSequence charSequenceG = com.planner5d.library.services.textspan.b.g(c(context), listener, null, false, z10, z11);
        Intrinsics.checkNotNullExpressionValue(charSequenceG, "setClickListenersOnLinks(...)");
        return charSequenceG;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        k3 k3Var = obj instanceof k3 ? (k3) obj : null;
        return k3Var != null && Intrinsics.areEqual(this.f225298a, k3Var.f225298a) && this.f225299b == k3Var.f225299b && Arrays.equals(this.f225300c, k3Var.f225300c);
    }

    public final boolean f() {
        return this.f225298a == null && this.f225299b == 0;
    }

    protected final void h(@Nullable String str) {
        this.f225298a = str;
    }

    public int hashCode() {
        String str = this.f225298a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f225299b) * 31) + Arrays.hashCode(this.f225300c);
    }

    @NotNull
    public CharSequence i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.f225298a;
        if (str != null) {
            return str;
        }
        int i10 = this.f225299b;
        if (i10 == 0) {
            return "";
        }
        Object[] objArrG = g(context);
        String string = context.getString(i10, Arrays.copyOf(objArrG, objArrG.length));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public k3(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f225298a = value;
        this.f225299b = 0;
        this.f225300c = new Object[0];
    }

    public k3(@androidx.annotation.f1 int i10, @NotNull Object... parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f225299b = i10;
        this.f225300c = Arrays.copyOf(parameters, parameters.length);
        this.f225298a = null;
    }
}
