package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.annotation.h1;
import androidx.annotation.r;
import androidx.annotation.w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nTypedArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1#2:239\n*E\n"})
public final class m {
    private static final void a(TypedArray typedArray, @h1 int i10) {
        if (!typedArray.hasValue(i10)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean b(@NotNull TypedArray typedArray, @h1 int i10) {
        a(typedArray, i10);
        return typedArray.getBoolean(i10, false);
    }

    @androidx.annotation.l
    public static final int c(@NotNull TypedArray typedArray, @h1 int i10) {
        a(typedArray, i10);
        return typedArray.getColor(i10, 0);
    }

    @NotNull
    public static final ColorStateList d(@NotNull TypedArray typedArray, @h1 int i10) {
        a(typedArray, i10);
        ColorStateList colorStateList = typedArray.getColorStateList(i10);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.");
    }

    public static final float e(@NotNull TypedArray typedArray, @h1 int i10) {
        a(typedArray, i10);
        return typedArray.getDimension(i10, 0.0f);
    }

    @r
    public static final int f(@NotNull TypedArray typedArray, @h1 int i10) {
        a(typedArray, i10);
        return typedArray.getDimensionPixelOffset(i10, 0);
    }

    @r
    public static final int g(@NotNull TypedArray typedArray, @h1 int i10) {
        a(typedArray, i10);
        return typedArray.getDimensionPixelSize(i10, 0);
    }

    @NotNull
    public static final Drawable h(@NotNull TypedArray typedArray, @h1 int i10) {
        a(typedArray, i10);
        Drawable drawable = typedArray.getDrawable(i10);
        Intrinsics.checkNotNull(drawable);
        return drawable;
    }

    public static final float i(@NotNull TypedArray typedArray, @h1 int i10) {
        a(typedArray, i10);
        return typedArray.getFloat(i10, 0.0f);
    }

    @w0(26)
    @NotNull
    public static final Typeface j(@NotNull TypedArray typedArray, @h1 int i10) {
        a(typedArray, i10);
        return l.a(typedArray, i10);
    }

    public static final int k(@NotNull TypedArray typedArray, @h1 int i10) {
        a(typedArray, i10);
        return typedArray.getInt(i10, 0);
    }

    public static final int l(@NotNull TypedArray typedArray, @h1 int i10) {
        a(typedArray, i10);
        return typedArray.getInteger(i10, 0);
    }

    @androidx.annotation.c
    public static final int m(@NotNull TypedArray typedArray, @h1 int i10) {
        a(typedArray, i10);
        return typedArray.getResourceId(i10, 0);
    }

    @NotNull
    public static final String n(@NotNull TypedArray typedArray, @h1 int i10) {
        a(typedArray, i10);
        String string = typedArray.getString(i10);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.");
    }

    @NotNull
    public static final CharSequence[] o(@NotNull TypedArray typedArray, @h1 int i10) {
        a(typedArray, i10);
        return typedArray.getTextArray(i10);
    }

    @NotNull
    public static final CharSequence p(@NotNull TypedArray typedArray, @h1 int i10) {
        a(typedArray, i10);
        CharSequence text = typedArray.getText(i10);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.");
    }

    public static final <R> R q(@NotNull TypedArray typedArray, @NotNull Function1<? super TypedArray, ? extends R> function1) {
        R rInvoke = function1.invoke(typedArray);
        typedArray.recycle();
        return rInvoke;
    }
}
